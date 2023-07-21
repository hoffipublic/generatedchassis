package com.hoffi.generated.examples.entity.table.filler

import com.hoffi.generated.examples.entity.dto.SimpleSubentityDtoRunDto
import com.hoffi.generated.examples.entity.table.SimpleSubentityDtoRunTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * Filler for table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSubentityDtoRunTable : WasGenerated {
  public fun insertLambda(source: SimpleSubentityDtoRunDto):
      SimpleSubentityDtoRunTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSubentityDtoRunTable.name] = source.name
    it[SimpleSubentityDtoRunTable.value] = source.value
    it[SimpleSubentityDtoRunTable.prio] = source.prio
    it[SimpleSubentityDtoRunTable.aInstant] = source.aInstant
    it[SimpleSubentityDtoRunTable.aLocalDateTime] = source.aLocalDateTime
    it[SimpleSubentityDtoRunTable.subEntityDtoSpecificProp] = source.subEntityDtoSpecificProp
    it[SimpleSubentityDtoRunTable.uuid] = source.uuid
    it[SimpleSubentityDtoRunTable.createdAt] = source.createdAt
    it[SimpleSubentityDtoRunTable.updatedAt] = source.updatedAt
    it[SimpleSubentityDtoRunTable.createUser] = source.createUser
    it[SimpleSubentityDtoRunTable.updateUser] = source.updateUser
  }

  public fun batchInsertLambda(source: SimpleSubentityDtoRunDto):
      BatchInsertStatement.(SimpleSubentityDtoRunDto) -> Unit = {
    this[SimpleSubentityDtoRunTable.name] = source.name
    this[SimpleSubentityDtoRunTable.value] = source.value
    this[SimpleSubentityDtoRunTable.prio] = source.prio
    this[SimpleSubentityDtoRunTable.aInstant] = source.aInstant
    this[SimpleSubentityDtoRunTable.aLocalDateTime] = source.aLocalDateTime
    this[SimpleSubentityDtoRunTable.subEntityDtoSpecificProp] = source.subEntityDtoSpecificProp
    this[SimpleSubentityDtoRunTable.uuid] = source.uuid
    this[SimpleSubentityDtoRunTable.createdAt] = source.createdAt
    this[SimpleSubentityDtoRunTable.updatedAt] = source.updatedAt
    this[SimpleSubentityDtoRunTable.createUser] = source.createUser
    this[SimpleSubentityDtoRunTable.updateUser] = source.updateUser
  }

  public fun simpleSubentityDtoRunDto(resultRow: ResultRow): SimpleSubentityDtoRunDto {
    val target = SimpleSubentityDtoRunDto._internal_create()
    target.name = resultRow[SimpleSubentityDtoRunTable.name]
    target.value = resultRow[SimpleSubentityDtoRunTable.value]
    target.prio = resultRow[SimpleSubentityDtoRunTable.prio]
    target.aInstant = resultRow[SimpleSubentityDtoRunTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleSubentityDtoRunTable.aLocalDateTime]
    target.subEntityDtoSpecificProp = resultRow[SimpleSubentityDtoRunTable.subEntityDtoSpecificProp]
    return target
  }
}
