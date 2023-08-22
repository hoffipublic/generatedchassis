package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleEntityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

/**
 * CRUD READ for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleEntityTableREAD : WasGenerated {
    private fun unmarshallSimpleEntityDtos(resultRowList: List<ResultRow>): MutableList<SimpleEntityDto> {
        val selectedEntityDtos = mutableListOf<SimpleEntityDto>()
        // base Model
        var currentSimpleEntityDto: SimpleEntityDto = SimpleEntityDto.NULL
        // many2One Models
        var currentSimpleSubentityDto: SimpleSubentityDto = SimpleSubentityDto.NULL
        var someOtherMany2OneUuid: UUID = UUID.randomUUID()
        val iter = resultRowList.iterator()
        if (iter.hasNext()) {
            val firstRow = iter.next()
            currentSimpleEntityDto = FillerSimpleEntityTable.simpleEntityDto(firstRow)
            selectedEntityDtos.add(currentSimpleEntityDto)
            // one2One Models
            currentSimpleEntityDto.someModelObject = FillerSimpleSomeModelTable.simpleSomeModelDto(firstRow)
            // Many2One Models
            currentSimpleEntityDto.subentitys?.add(FillerSimpleSubentityTable.simpleSubentityDto(firstRow))
        }
        while (iter.hasNext()) {
            val rr: ResultRow = iter.next()
            // base Model
            if (rr[SimpleEntityTable.uuid] != currentSimpleEntityDto.uuid) {
                currentSimpleEntityDto = FillerSimpleEntityTable.simpleEntityDto(rr)
                selectedEntityDtos.add(currentSimpleEntityDto)
                // one2One Models
                currentSimpleEntityDto.someModelObject = FillerSimpleSomeModelTable.simpleSomeModelDto(rr)
            }
            // many2One Models
            if (rr[SimpleSubentityTable.uuid] != currentSimpleSubentityDto.uuid) {
                currentSimpleSubentityDto = FillerSimpleSubentityTable.simpleSubentityDto(rr)
                currentSimpleEntityDto.subentitys?.add(currentSimpleSubentityDto)
            }
        }
        return selectedEntityDtos
    }

    private fun simpleEntityTableJoinLambda(): ColumnSet {
        val join: ColumnSet = SimpleEntityTable
            // one2One Models
            .join(SimpleSomeModelTable, JoinType.INNER, SimpleEntityTable.someModelObjectUuid, SimpleSomeModelTable.uuid)
            // many2One Models
            .join(SimpleSubentityTable, JoinType.INNER, SimpleEntityTable.uuid, SimpleSubentityTable.simpleEntitySubentitysUuid)
        return join
    }
    private fun execToDb(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>): List<ResultRow> {
        val join: ColumnSet = simpleEntityTableJoinLambda()
        val query: Query = join.select(selectLambda)
        // execute query against DB
        val resultRowList: List<ResultRow> = query.toList()
        return resultRowList
    }

    // API

    public fun <T> readByJoinNewTransaction(
        db: Database? = null,
        selectLambda: SqlExpressionBuilder.() -> Op<Boolean>
    ): List<SimpleEntityDto> {
        val resultRowList: List<ResultRow> = transaction(db = db) {
            addLogger(StdOutSqlLogger)
            execToDb(selectLambda)
        }
        // unmarshalling _outside_ transaction scope
        val selectedEntityDtos = unmarshallSimpleEntityDtos(resultRowList)
        return selectedEntityDtos

    }
    context(Transaction)
    public fun readByJoin(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>): List<SimpleEntityDto> {
        val resultRowList: List<ResultRow> = execToDb(selectLambda)
        // unmarshalling _within_ transaction scope
        val selectedEntityDtos = unmarshallSimpleEntityDtos(resultRowList)
        return selectedEntityDtos
    }
}
