package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.*

/**
 * CRUD READ for table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSubentityTableREAD : WasGenerated {
  context(Transaction)
  public fun readBySelect(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
          List<SimpleSubentityDto> {
    val query: Query = SimpleSubentityTable.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    val readSimpleSubentityDtos: MutableList<SimpleSubentityDto> = mutableListOf()
    for (rr in resultRowList) {
      val simpleSubentityDto = FillerSimpleSubentityTable.simpleSubentityDto(rr)
      // one2One models
      // NONE
      // many2One models
      // NONE
      // add
      readSimpleSubentityDtos.add(simpleSubentityDto)
    }
    return readSimpleSubentityDtos
  }
  private fun unmarshallSimpleSubentityDtos(resultRowList: List<ResultRow>):
      List<SimpleSubentityDto> {
    val readSimpleSubentityDtos = mutableListOf<SimpleSubentityDto>()
    // base model NULL
    var currentSimpleSubentityDto: SimpleSubentityDto = SimpleSubentityDto.NULL
    // many2One models NULL
    // NONE
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleSubentityTable.uuid] != currentSimpleSubentityDto.uuid) {
        // base model
        currentSimpleSubentityDto = FillerSimpleSubentityTable.simpleSubentityDto(rr)
        readSimpleSubentityDtos.add(currentSimpleSubentityDto)
        // one2One models
        // NONE
      }
      // many2One models
      // NONE
    }
    return readSimpleSubentityDtos
  }

  private fun subentityUnmarshallSimpleSubentityDtos(resultRowList: List<ResultRow>):
      List<SimpleSubentityDto> {
    val readSimpleSubentityDtos = mutableListOf<SimpleSubentityDto>()
    // base model NULL
    var currentSimpleSubentityDto: SimpleSubentityDto = SimpleSubentityDto.NULL
    // many2One models NULL
    // NONE
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleSubentityTable.uuid] != currentSimpleSubentityDto.uuid) {
        // base model
        currentSimpleSubentityDto = FillerSimpleSubentityTable.simpleSubentityDto(rr)
        readSimpleSubentityDtos.add(currentSimpleSubentityDto)
        // one2One models
        // NONE
      }
      // many2One models
      // NONE
    }
    return readSimpleSubentityDtos
  }

  private fun somePrefixUnmarshallSimpleSubentityDtos(resultRowList: List<ResultRow>):
      List<SimpleSubentityDto> {
    val readSimpleSubentityDtos = mutableListOf<SimpleSubentityDto>()
    // base model NULL
    var currentSimpleSubentityDto: SimpleSubentityDto = SimpleSubentityDto.NULL
    // many2One models NULL
    // NONE
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleSubentityTable.uuid] != currentSimpleSubentityDto.uuid) {
        // base model
        currentSimpleSubentityDto = FillerSimpleSubentityTable.simpleSubentityDto(rr)
        readSimpleSubentityDtos.add(currentSimpleSubentityDto)
        // one2One models
        // NONE
      }
      // many2One models
      // NONE
    }
    return readSimpleSubentityDtos
  }
}
