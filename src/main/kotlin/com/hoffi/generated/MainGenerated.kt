package com.hoffi.generated

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.SimpleSomeOtherTable
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.sql.CrudSimpleEntityTableCREATE
import com.hoffi.generated.examples.table.entity.sql.CrudSimpleEntityTableREAD
import com.hoffi.generated.universe.UuidTable
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.instancio.Instancio
import org.instancio.Select
import org.instancio.Select.all
import org.instancio.TargetSelector
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.TransactionManager
import org.jetbrains.exposed.sql.transactions.transaction
import kotlin.reflect.KProperty1
import kotlin.reflect.jvm.javaField


fun main(args: Array<String>) {
    val simpleEntityDtoList: List<SimpleEntityDto> = instancioFakeSimpleEntityDtos()
    MainGenerated().doIt(simpleEntityDtoList)
}

class MainGenerated {
    fun doIt(simpleEntityDtoList: List<SimpleEntityDto>) {
        val config = HikariConfig().apply {
            jdbcUrl = "jdbc:postgresql://localhost:5432/chassis"
            username = "chassis"
            //password = "database_password"
            addDataSourceProperty("rewriteBatchedInserts", true)
            addDataSourceProperty("reWriteBatchedInserts", true)
            addDataSourceProperty("cachePrepStmts", true)
            addDataSourceProperty("prepStmtCacheSize", 250)
            addDataSourceProperty("prepStmtCacheSqlLimit", 2048)
        }
        val dbConnect by lazy {
            Database.connect(HikariDataSource(config))
            //Database.connect("jdbc:postgresql://localhost:5432/chassis?reWriteBatchedInserts=true", driver = "org.postgresql.Driver", user = "chassis")
            //Database.connect("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", driver = "org.h2.Driver")
        }
        TransactionManager.managerFor(dbConnect)?.defaultRepetitionAttempts = 0

        val allTables = listOf(
            SimpleSomeOtherTable,
            SimpleSomeModelTable,
            SimpleEntityTable,
            SimpleSubentityTable,
        )

        createTablesIfNotExist(allTables)
        dumpTablenames()
        wipeTables(allTables)

        println()
        println("normal insert some entities with subentitys and 1To1 SomeModel:")
        println("===============================================================")
        transaction {
            addLogger(StdOutSqlLogger)
            for(dto in simpleEntityDtoList) {
                CrudSimpleEntityTableCREATE.insertDb(dto)
            }
        }

        println()
        wipeTables(allTables)

        println()
        println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ")
        println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ")
        println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ")

        println()
        println("batchInsert some entities with subentitys and 1To1 SomeModel:")
        println("=============================================================")
        transaction {
            addLogger(StdOutSqlLogger)
            CrudSimpleEntityTableCREATE.batchInsertDb(simpleEntityDtoList)
        }

        println()
        println("join query:")
        //region fold old manual select transaction ...
        //println("============================")
        //val resultRowList: List<ResultRow> = CrudSimpleEntityTableREAD.readDb()

        // ==============================================================
        // ======    select with join on one2One's and Many2Ones   ======
        // ==============================================================

        //val resultRowList: List<ResultRow> = transaction {
        //    addLogger(StdOutSqlLogger)
        //    // SimpleEntityTable.selectAll().toList()
        //    // SimpleEntityTable.innerJoin(SimpleSubentityTable, {SimpleEntityTable.someModelObjectUuid}, {SimpleSubentityTable.uuid})
        //    //
        //    //(SimpleEntityTable innerJoin SimpleSubentityTable).(SimpleEntityDto innerJoin SimpleSomeModelTable)
        //    //
        //    SimpleEntityTable
        //        // one2One Models
        //        .join(SimpleSomeModelTable, JoinType.INNER, SimpleEntityTable.someModelObjectUuid, SimpleSomeModelTable.uuid)
        //        // many2One Models
        //        .join(SimpleSubentityTable, JoinType.INNER, SimpleEntityTable.uuid, SimpleSubentityTable.simpleEntitySubentitysUuid)
        //        // select criteria(s)
        //        .select {
        //            (SimpleEntityTable.prio lessEq 3)
        //        }
        //        // execute query against DB
        //        .toList()
        //}
        //endregion fold old manual select transaction ...
        val selectedEntityDtos = transaction {
            addLogger(StdOutSqlLogger)
            CrudSimpleEntityTableREAD.readByJoin {
                (SimpleEntityTable.prio lessEq 3)
            }
        }
        //region fold empty-check
        if (selectedEntityDtos.isEmpty()) {
            println()
            println("!!!!!!!!!! NOTHING SELECTED  !!!!!!!!!!")
            println("!!!!!!!!!! NOTHING SELECTED  !!!!!!!!!!")
            println("!!!!!!!!!! NOTHING SELECTED  !!!!!!!!!!")
            println()
        } else {
            println("\nresultRowList.size = ${selectedEntityDtos.size}")
        }
        //endregion fold empty-check

        // ========================================================
        // ======    println selected Entitys                ======
        // ========================================================
        for ((i, dto) in selectedEntityDtos.withIndex()) {
            println(String.format("%5d: %s", i+1, dto))
            println(String.format("       %s", dto.someModelObject))
            if (dto.subentitys!!.isNotEmpty()) println("       subentitys:")
            if (dto.subentitys!!.isNotEmpty()) {
                for ((ii, subdto) in dto.subentitys!!.withIndex()) {
                    println(String.format("      %3d: %-10s -> %-18s (%s)", ii + 1, subdto.name, subdto.value, subdto.uuid))
                }
            } else {
                println("      DOES NOT CONTAIN subentitys !!!")
            }
        }
    } // ---------------------------- main ----------------------------

    // utility functions
    
    private fun createTablesIfNotExist(allTables: List<UuidTable>) {
        transaction {
            addLogger(StdOutSqlLogger)
            SchemaUtils.create(
                // !!! order of table creation matters !!!
                *allTables.map { it }.toTypedArray()
            )
        }
    }
    private fun wipeTables(allTables: List<UuidTable>) {
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
    }
    private fun dumpTablenames() {
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
    }

    //region fold old fake Entity DTO creation ...
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

//    private fun doCreateSimpleEntityDtos(i: Int): SimpleEntityDto {
//        val simpleEntityDto = SimpleEntityDto._internal_createWithUuid()
//        simpleEntityDto.apply {
//            dtoSpecificProp = "dtoSpecificProp$i"
//            name = "name$i"
//            `value` = "value$i"
//            prio = i
//            optimisticLockId = i.toLong()
//            aInstant = Clock.System.now()
//            aLocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
//            someModelObject = SimpleSomeModelDto.create(
//                "somename${i}_${i}",
//                "somevalue${i}_${i}",
//            ).apply {
//                prio = i*10+i
//                optimisticLockId = 41L
//                aInstant = Clock.System.now()
//                aLocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
//            }
//        }
//        return simpleEntityDto
//    }
//
//    private fun doCreateSimpleSubentityDtos(i: Int, count: Int): List<SimpleSubentityDto> {
//        val subentitys = mutableListOf<SimpleSubentityDto>()
//        for (ii in 1..count) {
//            val subentity = SimpleSubentityDto(
//                name = "subname${i}_${ii}",
//                `value` = "subvalue${i}_${ii}",
//                subEntityDtoSpecificProp = "subDtoSpecificProp$ii",
//            ).apply {
//                uuid = UUID.randomUUID()
//                prio = i*100+ii
//                //optimisticLockId = 43L
//                aInstant = Clock.System.now()
//                aLocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
//            }
//            subentitys.add(subentity)
//        }
//        return subentitys
//    }
    //endregion old fake Entity DTO creation ...
}

//region fold global helper stuff ...

/**
 * Instancio Kotlin reflection prop accessor helper
 * see (see https://www.instancio.org/user-guide/#kotlin-method-reference-selector)
 */
class KSelect {
    companion object {
        fun <T, V> field(property: KProperty1<T, V>): TargetSelector {
            val field = property.javaField!!
            return Select.field(field.declaringClass, field.name)
        }
    }
}

private fun instancioFakeSimpleEntityDtos(): List<SimpleEntityDto> {
    //region fold instancio single instance ...
    //val simpleEntityDto: SimpleEntityDto = Instancio.of(SimpleEntityDto::class.java)
    //    .generate(KSelect.field(SimpleEntityDto::name)) { it.string().length(7) }
    //    .generate(KSelect.field(SimpleEntityDto::value)) { it.intSeq().next { +1 }.asString() }
    //    .onComplete<SimpleEntityDto>(all(SimpleEntityDto::class.java)) {
    //        it.value = String.format("%03d", it.subentitys?.size ?: 0)
    //    }
    //.create()
    //println(simpleEntityDto)
    //println("=====================================")
    //endregion fold instancio single instance ...
    var index = 0
    var index2 = 0
    val collSize = 5
    val simpleEntityDtoList: List<SimpleEntityDto> = Instancio.ofList(SimpleEntityDto::class.java).size(collSize)
        .generate(KSelect.field(SimpleEntityDto::name)) { it.string().length(7) }
        .generate(KSelect.field(SimpleEntityDto::value)) { it.string().length(7) }
        .generate(all(MutableSet::class.java)) { it.collection<SimpleSubentityDto>().size(collSize) }
        .onComplete<SimpleEntityDto>(all(SimpleEntityDto::class.java)) {
            it.value = String.format("%04d_%s", ++index, it.value)
            it.prio = index
        }
        .onComplete<SimpleSubentityDto>(all(SimpleSubentityDto::class.java)) {
            it.prio = 1000 * ((index2 / collSize) + 1) + index2 + 1
            it.value = String.format("sub%04d_%s", ++index2, it.value)
        }
        .create()
    println("generating some fake SimpleEntityDto's:")
    println("=======================================")
    simpleEntityDtoList.forEach {
        println(it.toString() +
            "\n  - ${it.someModelObject}"+
            it.subentitys!!.joinToString(prefix = "\n  ", separator = "\n  ") { it.toString() }) }
    return simpleEntityDtoList
}
//endregion fold global helper stuff ...
