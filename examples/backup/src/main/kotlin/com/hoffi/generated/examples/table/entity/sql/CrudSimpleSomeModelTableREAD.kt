package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSomeModelTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.collections.List
import org.jetbrains.exposed.sql.ResultRow

/**
 * CRUD READ for table model: SomeModel
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeModel|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSomeModelTableREAD : WasGenerated {
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
