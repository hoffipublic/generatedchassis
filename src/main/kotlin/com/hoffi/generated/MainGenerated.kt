package com.hoffi.generated

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.TransactionManager
import org.jetbrains.exposed.sql.transactions.transaction

fun main(args: Array<String>) {
    MainGenerated().doIt(args)
}
class MainGenerated {
    fun doIt(args: Array<String>) {
        val dbConnect = Database.connect("jdbc:postgresql://localhost:5432/chassis", driver = "org.postgresql.Driver", user = "chassis")
//        val dbConnect = Database.connect("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver")
        transaction {
            addLogger(StdOutSqlLogger)
            SchemaUtils.create(
                // !!! order of table creation matters !!!
                SimpleSubentityTable,
                SimpleEntityTable,
            )
        }

        val someEntityDtos = mutableListOf<SimpleEntityDto>()
        val iCount = 10
        for (i in 1..iCount) {
            val simpleEntityDto = doCreateSimpleEntityDtos(i)
            someEntityDtos.add(simpleEntityDto)
            val subs = doCreateSimpleSubentityDtos(i, 5)
            simpleEntityDto.subentitys?.addAll(subs)
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

//        transaction {
//            addLogger(StdOutSqlLogger)
//            for(dto in someEntityDtos) {
//                SimpleEntityTableOps.insert(dto)
//            }
//            // SimpleEntityTableOps.batchInsert(someEntityDtos)
//        }

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
            someModelObject = SimpleSubentityDto(
                name = "subname${i}_${i}",
                `value` = "subvalue${i}_${i}",
                subEntityDtoSpecificProp = "subDtoSpecificProp$i",
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
