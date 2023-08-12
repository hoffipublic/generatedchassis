package com.hoffi.generated

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.sql.CrudSimpleEntityTableCREATE
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import org.instancio.Instancio
import org.instancio.Select
import org.instancio.Select.all
import org.instancio.TargetSelector
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.TransactionManager
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*
import kotlin.reflect.KProperty1
import kotlin.reflect.jvm.javaField

class KSelect {
    companion object {
        fun <T, V> field(property: KProperty1<T, V>): TargetSelector {
            val field = property.javaField!!
            return Select.field(field.declaringClass, field.name)
        }
    }
}

fun main(args: Array<String>) {
    //val simpleEntityDto: SimpleEntityDto = Instancio.of(SimpleEntityDto::class.java)
    //    .generate(KSelect.field(SimpleEntityDto::name)) { it.string().length(7) }
    //    .generate(KSelect.field(SimpleEntityDto::value)) { it.intSeq().next { +1 }.asString() }
    //    .onComplete<SimpleEntityDto>(all(SimpleEntityDto::class.java)) {
    //        it.value = String.format("%03d", it.subentitys?.size ?: 0)
    //    }
    //.create()
    //println(simpleEntityDto)
    //println("=====================================")
    var index = 0
    var index2 = 0
    val simpleEntityDtoList: List<SimpleEntityDto> = Instancio.ofList(SimpleEntityDto::class.java).size(5)
        .generate(KSelect.field(SimpleEntityDto::name)) { it.string().length(7) }
        .generate(KSelect.field(SimpleEntityDto::value)) { it.string().length(7) }
        .generate(all(MutableSet::class.java)) { it.collection<SimpleSubentityDto>().size(5) }
        .set(KSelect.field(SimpleEntityDto::prio), 1)
        .onComplete<SimpleEntityDto>(all(SimpleEntityDto::class.java)) {
            it.value = String.format("%03d_%s", ++index, it.value)
        }
        .onComplete<SimpleSubentityDto>(all(SimpleSubentityDto::class.java)) {
            it.value = String.format("sub%03d_%s", ++index2, it.value)
        }
        .create()
    simpleEntityDtoList.forEach { it -> println(it.toString() + it.subentitys!!.joinToString(prefix = "\n  ", separator = "\n  ") { it.toString() }) }

    MainGenerated().doIt(simpleEntityDtoList)
}
class MainGenerated {
    fun doIt(simpleEntityDtoList: List<SimpleEntityDto>) {
        val dbConnect = Database.connect("jdbc:postgresql://localhost:5432/chassis?reWriteBatchedInserts=true", driver = "org.postgresql.Driver", user = "chassis")
//        val dbConnect = Database.connect("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver")
        TransactionManager.managerFor(dbConnect)?.defaultRepetitionAttempts = 0

        val allTables = listOf(
            SimpleSomeModelTable,
            SimpleEntityTable,
            SimpleSubentityTable,
        )

        transaction {
            addLogger(StdOutSqlLogger)
            SchemaUtils.create(
                // !!! order of table creation matters !!!
                *allTables.map { it }.toTypedArray()
            )
        }

        println()
        println("dump tablenames:")
        println("================")
        transaction {
            val allTablenames = TransactionManager.current().db.dialect.allTablesNames()
            if (allTablenames.isEmpty()) println("<no tables found!!!>")
            else {
                allTablenames.forEach {
                    println("Table: $it")
                }
            }
            println()
        }

        println()
        println("cleanup data of former runs:")
        println("============================")
        transaction {
            // delete from simple_entity ; delete from simple_subentity ; delete from simple_some_model ;
            addLogger(StdOutSqlLogger)
            for (table in allTables.reversed()) {
                table.deleteAll()
            }
        }

        //val someEntityDtos = mutableListOf<SimpleEntityDto>()
        //val iCount = 10
        //for (i in 1..iCount) {
        //    val simpleEntityDto = doCreateSimpleEntityDtos(i)
        //    someEntityDtos.add(simpleEntityDto)
        //    val subs = doCreateSimpleSubentityDtos(i, 5)
        //    simpleEntityDto.subentitys?.addAll(subs) ?: throw Exception("subentitys was null")
        //}
        ////for (entity in someEntityDtos) {
        ////    println(String.format("%s %s %s:", entity.uuid, entity.name, entity))
        ////    println(String.format("  %s %s %s", entity.someModelObject.uuid, entity.someModelObject.someName, entity.someModelObject))
        ////    for (subentity in entity.subentitys ?: throw Exception("subentitys was null here")) {
        ////        println(String.format("  %s %s %s", subentity.uuid, subentity.name, subentity))
        ////    }
        ////}

        println()
        println("insert some entities with subentitys and 1To1 SomeModel:")
        println("========================================================")
        transaction {
            addLogger(StdOutSqlLogger)
            //val subentity = someEntityDtos[0].subentitys!!.first()
            //someEntityDtos[0].subentitys!!.clear()
            //someEntityDtos[0].subentitys!!.add(subentity)
            //CrudSimpleEntityTableCREATE.insert(someEntityDtos[0])
            for(dto in simpleEntityDtoList) {
                CrudSimpleEntityTableCREATE.insert(dto)
            }
            // SimpleEntityTableOps.batchInsert(someEntityDtos)
            val i = 42
        }

        //println()
        //println("join query:")
        //println("============================")
        //val resultRowList: List<ResultRow> = transaction {
        //    addLogger(StdOutSqlLogger)
        //    // SimpleEntityTable.selectAll().toList()
        //    // SimpleEntityTable.innerJoin(SimpleSubentityTable, {SimpleEntityTable.someModelObjectUuid}, {SimpleSubentityTable.uuid})
        //    (SimpleEntityTable innerJoin SimpleSubentityTable)
        //        .select {
        //            // (SimpleEntityTable.someModelObjectUuid eq SimpleSubentityTable.uuid) and
        //            (SimpleEntityTable.prio lessEq 5)
        //        }.toList()
        //}
        //if (resultRowList.isEmpty()) {
        //    println()
        //    println("!!!!!!!!!! NOTHING SELECTED  !!!!!!!!!!")
        //    println("!!!!!!!!!! NOTHING SELECTED  !!!!!!!!!!")
        //    println("!!!!!!!!!! NOTHING SELECTED  !!!!!!!!!!")
        //    println()
        //}
        //val selectedEntityDtos = mutableListOf<SimpleEntityDtoRunDto>()
        //for (rs in resultRowList) {
//      //      val entity = SimpleEntityDtoRunDto._internal_create()
//      //      val subentity = SimpleSubentityDtoRunDto._internal_create()
//      //      entity.someModelObject = subentity
        //    selectedEntityDtos.add(SimpleEntityTableFiller.simpleEntityDto(rs))
        //}
//
        //for ((i, dto) in selectedEntityDtos.withIndex()) {
        //    println(String.format("%5d: %s", i+1, dto))
        //    println(String.format("      %s", dto.someModelObject))
        //    if (dto.subentitys.isNotEmpty()) {
        //        for ((ii, subdto) in dto.subentitys.withIndex()) {
        //            println(String.format("      %3d: %s", ii + 1, subdto.name))
        //        }
        //    } else {
        //        println("      DOES NOT CONTAIN subentitys !!!")
        //    }
        //}
    } // main

    private fun doCreateSimpleEntityDtos(i: Int): SimpleEntityDto {
        val simpleEntityDto = SimpleEntityDto._internal_createWithUuid()
        simpleEntityDto.apply {
            dtoSpecificProp = "dtoSpecificProp$i"
            name = "name$i"
            `value` = "value$i"
            prio = i
            optimisticLockId = i.toLong()
            aInstant = Clock.System.now()
            aLocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
            someModelObject = SimpleSomeModelDto.create(
                "somename${i}_${i}",
                "somevalue${i}_${i}",
            ).apply {
                prio = i*10+i
                optimisticLockId = 41L
                aInstant = Clock.System.now()
                aLocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
            }
        }
        return simpleEntityDto
    }

    private fun doCreateSimpleSubentityDtos(i: Int, count: Int): List<SimpleSubentityDto> {
        val subentitys = mutableListOf<SimpleSubentityDto>()
        for (ii in 1..count) {
            val subentity = SimpleSubentityDto(
                name = "subname${i}_${ii}",
                `value` = "subvalue${i}_${ii}",
                subEntityDtoSpecificProp = "subDtoSpecificProp$ii",
            ).apply {
                uuid = UUID.randomUUID()
                prio = i*100+ii
                //optimisticLockId = 43L
                aInstant = Clock.System.now()
                aLocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
            }
            subentitys.add(subentity)
        }
        return subentitys
    }
}
