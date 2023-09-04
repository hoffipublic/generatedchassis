package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSomeModelTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.*

/**
 * CRUD READ for table model: SomeModel
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeModel|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSomeModelTableREAD : WasGenerated {
  context(Transaction)
  public fun readBySelect(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>):
          List<SimpleSomeModelDto> {
    val query: Query = SimpleSomeModelTable.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    val readSimpleSomeModelDtos: MutableList<SimpleSomeModelDto> = mutableListOf()
    for (rr in resultRowList) {
      val simpleSubentityDto = FillerSimpleSomeModelTable.simpleSomeModelDto(rr)
      // one2One models
      // NONE
      // many2One models
      // NONE
      // add
      readSimpleSomeModelDtos.add(simpleSubentityDto)
    }
    return readSimpleSomeModelDtos
  }

  private fun unmarshallSimpleSomeModelDtos(resultRowList: List<ResultRow>):
      List<SimpleSomeModelDto> {
    val readSimpleSomeModelDtos = mutableListOf<SimpleSomeModelDto>()
    // base model NULL
    var currentSimpleSomeModelDto: SimpleSomeModelDto = SimpleSomeModelDto.NULL
    // many2One models NULL
    // NONE
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleSomeModelTable.uuid] != currentSimpleSomeModelDto.uuid) {
        // base model
        currentSimpleSomeModelDto = FillerSimpleSomeModelTable.simpleSomeModelDto(rr)
        readSimpleSomeModelDtos.add(currentSimpleSomeModelDto)
        // one2One models
        // NONE
      }
      // many2One models
      // NONE
    }
    return readSimpleSomeModelDtos
  }

  private fun somePrefixUnmarshallSimpleSomeModelDtos(resultRowList: List<ResultRow>):
      List<SimpleSomeModelDto> {
    val readSimpleSomeModelDtos = mutableListOf<SimpleSomeModelDto>()
    // base model NULL
    var currentSimpleSomeModelDto: SimpleSomeModelDto = SimpleSomeModelDto.NULL
    // many2One models NULL
    // NONE
    val iter = resultRowList.iterator()
    while (iter.hasNext()) {
      val rr: ResultRow = iter.next()
      if (rr[SimpleSomeModelTable.uuid] != currentSimpleSomeModelDto.uuid) {
        // base model
        currentSimpleSomeModelDto = FillerSimpleSomeModelTable.simpleSomeModelDto(rr)
        readSimpleSomeModelDtos.add(currentSimpleSomeModelDto)
        // one2One models
        // NONE
      }
      // many2One models
      // NONE
    }
    return readSimpleSomeModelDtos
  }
}
