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

/**
 * CRUD READ for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleEntityTableREAD : WasGenerated {
  private fun simpleEntityTableJoin(): Join {
    val join: Join = SimpleEntityTable
    // one2One models
    .join(SimpleSomeModelTable, JoinType.LEFT, SimpleEntityTable.someModelObjectUuid,
        SimpleSomeModelTable.uuid)
    // one2One models
    .join(SimpleSubentityTable, JoinType.LEFT, SimpleEntityTable.uuid,
        SimpleSubentityTable.simpleEntitySubentitysUuid)
    return join
  }

  private fun execToDb(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>): List<ResultRow> {
    val join: Join = simpleEntityTableJoin()
    val query: Query = join.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    return resultRowList
  }

  context(Transaction)
  public fun readBySelect(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
      List<SimpleEntityDto> {
    val query: Query = SimpleEntityTable.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    val readSimpleEntityDtos: MutableList<SimpleEntityDto> = mutableListOf()
    for (rr in resultRowList) {
      val simpleEntityDto = FillerSimpleEntityTable.simpleEntityDto(rr)
      // one2One models
      val someModelDto = CrudSimpleSomeModelTableREAD.readBySelect { SimpleSomeModelTable.uuid eq rr[SimpleEntityTable.someModelObjectUuid] }.firstOrNull()
      simpleEntityDto.someModelObject = someModelDto!!
      // many2One models
      val subentitys = CrudSimpleSubentityTableREAD.readBySelect { SimpleSubentityTable.simpleEntitySubentitysUuid eq rr[SimpleEntityTable.uuid] }
      simpleEntityDto.subentitys?.addAll(subentitys)
      // add
      readSimpleEntityDtos.add(simpleEntityDto)
    }
    return readSimpleEntityDtos
  }

  context(Transaction)
  public fun readByJoin(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
      List<SimpleEntityDto> {
    val resultRowList: List<ResultRow> = execToDb(selectLambda)
    // unmarshalling _within_ transaction scope
    val selectedSimpleEntityDto = unmarshallSimpleEntityDtos(resultRowList)
    return selectedSimpleEntityDto
  }

  context(Transaction)
  public fun readByJoinNewTransaction(db: Database?,
      selectLambda: SqlExpressionBuilder.() -> Op<Boolean>): List<SimpleEntityDto> {
    val resultRowList: List<ResultRow> = transaction(db = db) {
      addLogger(StdOutSqlLogger)
      execToDb(selectLambda)
    }
    // unmarshalling _outside_ transaction scope
    val selectedSimpleEntityDto = unmarshallSimpleEntityDtos(resultRowList)
    return selectedSimpleEntityDto
  }

  private fun unmarshallSimpleEntityDtos(resultRowList: List<ResultRow>): List<SimpleEntityDto> {
    val readSimpleEntityDtos = mutableListOf<SimpleEntityDto>()
    // base model NULL
    var currentSimpleEntityDto: SimpleEntityDto = SimpleEntityDto.NULL
    // many2One models NULL
    var currentsubentitys = SimpleSubentityDto.NULL
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleEntityTable.uuid] != currentSimpleEntityDto.uuid) {
        // base model
        currentSimpleEntityDto = FillerSimpleEntityTable.simpleEntityDto(rr)
        readSimpleEntityDtos.add(currentSimpleEntityDto)
        // one2One models
        currentSimpleEntityDto.someModelObject = FillerSimpleSomeModelTable.simpleSomeModelDto(rr)
      }
      // many2One models
      if (rr[SimpleSubentityTable.uuid] != currentsubentitys.uuid) {
        currentsubentitys = FillerSimpleSubentityTable.simpleSubentityDto(rr)
        currentSimpleEntityDto.subentitys?.add(currentsubentitys)
      }
    }
    return readSimpleEntityDtos
  }

  private fun somePrefixSimpleEntityTableJoin(): Join {
    val join: Join = SimpleEntityTable
    // one2One models
    .join(SimpleSomeModelTable, JoinType.LEFT, SimpleEntityTable.someModelObjectUuid,
        SimpleSomeModelTable.uuid)
    // one2One models
    .join(SimpleSubentityTable, JoinType.LEFT, SimpleEntityTable.uuid,
        SimpleSubentityTable.simpleEntitySubentitysUuid)
    return join
  }

  private fun somePrefixExecToDb(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
      List<ResultRow> {
    val join: Join = somePrefixSimpleEntityTableJoin()
    val query: Query = join.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    return resultRowList
  }

  context(Transaction)
  public fun somePrefixReadByJoin(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
      List<SimpleEntityDto> {
    val resultRowList: List<ResultRow> = execToDb(selectLambda)
    // unmarshalling _within_ transaction scope
    val selectedSimpleEntityDto = somePrefixUnmarshallSimpleEntityDtos(resultRowList)
    return selectedSimpleEntityDto
  }

  context(Transaction)
  public fun somePrefixReadByJoinNewTransaction(db: Database?,
      selectLambda: SqlExpressionBuilder.() -> Op<Boolean>): List<SimpleEntityDto> {
    val resultRowList: List<ResultRow> = transaction(db = db) {
      addLogger(StdOutSqlLogger)
      execToDb(selectLambda)
    }
    // unmarshalling _outside_ transaction scope
    val selectedSimpleEntityDto = somePrefixUnmarshallSimpleEntityDtos(resultRowList)
    return selectedSimpleEntityDto
  }

  private fun somePrefixUnmarshallSimpleEntityDtos(resultRowList: List<ResultRow>):
      List<SimpleEntityDto> {
    val readSimpleEntityDtos = mutableListOf<SimpleEntityDto>()
    // base model NULL
    var currentSimpleEntityDto: SimpleEntityDto = SimpleEntityDto.NULL
    // many2One models NULL
    var currentsubentitys = SimpleSubentityDto.NULL
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleEntityTable.uuid] != currentSimpleEntityDto.uuid) {
        // base model
        currentSimpleEntityDto = FillerSimpleEntityTable.simpleEntityDto(rr)
        readSimpleEntityDtos.add(currentSimpleEntityDto)
        // one2One models
        currentSimpleEntityDto.someModelObject = FillerSimpleSomeModelTable.simpleSomeModelDto(rr)
      }
      // many2One models
      if (rr[SimpleSubentityTable.uuid] != currentsubentitys.uuid) {
        currentsubentitys = FillerSimpleSubentityTable.simpleSubentityDto(rr)
        currentSimpleEntityDto.subentitys?.add(currentsubentitys)
      }
    }
    return readSimpleEntityDtos
  }
}
