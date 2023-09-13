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
import kotlin.Boolean
import kotlin.collections.List
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Join
import org.jetbrains.exposed.sql.JoinType
import org.jetbrains.exposed.sql.Op
import org.jetbrains.exposed.sql.Query
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.SqlExpressionBuilder
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.Transaction
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.select
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

  context(Transaction)
  public fun readBySelect(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
      List<SimpleEntityDto> {
    val query: Query =
        com.hoffi.generated.examples.table.entity.SimpleEntityTable.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    val selectedSimpleEntityDto = mutableListOf<SimpleEntityDto>()
    for (rr in resultRowList) {
      val simpleEntityDto = FillerSimpleEntityTable.simpleEntityDto(rr)
      // one2One models
      val someModelObject = CrudSimpleSomeModelTableREAD.readBySelect {
        SimpleSomeModelTable.uuid eq rr[SimpleEntityTable.someModelObjectUuid]
      }
      .firstOrNull()
      simpleEntityDto.someModelObject = someModelObject!!
      // many2One models
      val subentitys = CrudSimpleSubentityTableREAD.readBySelect {
        SimpleSubentityTable.simpleEntitySubentitysUuid eq rr[SimpleEntityTable.uuid]
      }
      simpleEntityDto.subentitys?.addAll(subentitys)
      // add
      selectedSimpleEntityDto.add(simpleEntityDto)
    }
    return selectedSimpleEntityDto
  }

  private fun somePrefixSimpleEntityTableJoin(): Join {
    val join: Join = SimpleEntityTable
    // one2One models
    // MODEL copyBoundry IGNORE propName someModelObject
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
    val resultRowList: List<ResultRow> = somePrefixExecToDb(selectLambda)
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
        currentSimpleEntityDto = FillerSimpleEntityTable.somePrefixSimpleEntityDto(rr)
        readSimpleEntityDtos.add(currentSimpleEntityDto)
        // one2One models
        // MODEL copyBoundry IGNORE propName someModelObject
      }
      // many2One models
      if (rr[SimpleSubentityTable.uuid] != currentsubentitys.uuid) {
        currentsubentitys = FillerSimpleSubentityTable.somePrefixSimpleSubentityDto(rr)
        currentSimpleEntityDto.subentitys?.add(currentsubentitys)
      }
    }
    return readSimpleEntityDtos
  }

  context(Transaction)
  public fun somePrefixReadBySelect(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
      List<SimpleEntityDto> {
    val query: Query =
        com.hoffi.generated.examples.table.entity.SimpleEntityTable.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    val selectedSimpleEntityDto = mutableListOf<SimpleEntityDto>()
    for (rr in resultRowList) {
      val simpleEntityDto = FillerSimpleEntityTable.somePrefixSimpleEntityDto(rr)
      // one2One models
      // MODEL copyBoundry IGNORE propName someModelObject
      // many2One models
      val subentitys = CrudSimpleSubentityTableREAD.somePrefixReadBySelect {
        SimpleSubentityTable.simpleEntitySubentitysUuid eq rr[SimpleEntityTable.uuid]
      }
      simpleEntityDto.subentitys?.addAll(subentitys)
      // add
      selectedSimpleEntityDto.add(simpleEntityDto)
    }
    return selectedSimpleEntityDto
  }

  private fun withoutModelsUnmarshallSimpleEntityDtos(resultRowList: List<ResultRow>):
      List<SimpleEntityDto> {
    val readSimpleEntityDtos = mutableListOf<SimpleEntityDto>()
    // base model NULL
    var currentSimpleEntityDto: SimpleEntityDto = SimpleEntityDto.NULL
    // many2One models NULL
    // MODEL copyBoundry IGNORE propName subentitys
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleEntityTable.uuid] != currentSimpleEntityDto.uuid) {
        // base model
        currentSimpleEntityDto = FillerSimpleEntityTable.withoutModelsSimpleEntityDto(rr)
        readSimpleEntityDtos.add(currentSimpleEntityDto)
        // one2One models
        // MODEL copyBoundry IGNORE propName someModelObject
      }
      // many2One models
      // MODEL copyBoundry IGNORE propName subentitys
    }
    return readSimpleEntityDtos
  }

  context(Transaction)
  public fun withoutModelsReadBySelect(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
      List<SimpleEntityDto> {
    val query: Query =
        com.hoffi.generated.examples.table.entity.SimpleEntityTable.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    val selectedSimpleEntityDto = mutableListOf<SimpleEntityDto>()
    for (rr in resultRowList) {
      val simpleEntityDto = FillerSimpleEntityTable.withoutModelsSimpleEntityDto(rr)
      // one2One models
      // MODEL copyBoundry IGNORE propName someModelObject
      // many2One models
      // MODEL copyBoundry IGNORE propName subentitys
      // add
      selectedSimpleEntityDto.add(simpleEntityDto)
    }
    return selectedSimpleEntityDto
  }
}
