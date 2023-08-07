package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement
import java.util.*

/**
 * Filler for table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSubentityTable : WasGenerated {
  public fun insertLambda(source: SimpleSubentityDto, simpleEntityDtoUuidForSubentitys: UUID):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    insertShallowLambda(source).invoke(this, it)
    it[SimpleSubentityTable.simpleEntityDtoUuidForSubentitys] = simpleEntityDtoUuidForSubentitys
  }

  public fun insertShallowLambda(source: SimpleSubentityDto):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSubentityTable.name] = source.name
    it[SimpleSubentityTable.value] = source.value
    it[SimpleSubentityTable.prio] = source.prio
    it[SimpleSubentityTable.aInstant] = source.aInstant
    it[SimpleSubentityTable.aLocalDateTime] = source.aLocalDateTime
    it[SimpleSubentityTable.subEntityDtoSpecificProp] = source.subEntityDtoSpecificProp
    it[SimpleSubentityTable.uuid] = source.uuid
    //it[SimpleSubentityTable.simpleEntityDtoUuid_subentitys] = simpleEntityDtoUuid_subentitys
    it[SimpleSubentityTable.createdAt] = source.createdAt
    it[SimpleSubentityTable.updatedAt] = source.updatedAt
    it[SimpleSubentityTable.createUser] = source.createUser
    it[SimpleSubentityTable.updateUser] = source.updateUser
  }

  public fun batchInsertLambda(simpleEntityDtoUuidForSubentitys: UUID):
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    batchInsertShallowLambda().invoke(this, it)
    this[SimpleSubentityTable.simpleEntityDtoUuidForSubentitys] = simpleEntityDtoUuidForSubentitys
  }

  public fun batchInsertShallowLambda():
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    this[SimpleSubentityTable.name] = it.name
    this[SimpleSubentityTable.value] = it.value
    this[SimpleSubentityTable.prio] = it.prio
    this[SimpleSubentityTable.aInstant] = it.aInstant
    this[SimpleSubentityTable.aLocalDateTime] = it.aLocalDateTime
    this[SimpleSubentityTable.subEntityDtoSpecificProp] = it.subEntityDtoSpecificProp
    this[SimpleSubentityTable.uuid] = it.uuid
    //this[SimpleSubentityTable.simpleEntityDtoUuidForSubentitys] = simpleEntityDtoUuidForSubentitys
    this[SimpleSubentityTable.createdAt] = it.createdAt
    this[SimpleSubentityTable.updatedAt] = it.updatedAt
    this[SimpleSubentityTable.createUser] = it.createUser
    this[SimpleSubentityTable.updateUser] = it.updateUser
  }

  public fun simpleSubentityDto(resultRow: ResultRow): SimpleSubentityDto {
    val target = SimpleSubentityDto._internal_create()
    target.name = resultRow[SimpleSubentityTable.name]
    target.value = resultRow[SimpleSubentityTable.value]
    target.prio = resultRow[SimpleSubentityTable.prio]
    target.aInstant = resultRow[SimpleSubentityTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleSubentityTable.aLocalDateTime]
    target.subEntityDtoSpecificProp = resultRow[SimpleSubentityTable.subEntityDtoSpecificProp]
    target.uuid = resultRow[SimpleSubentityTable.uuid]
    target.createdAt = resultRow[SimpleSubentityTable.createdAt]
    target.updatedAt = resultRow[SimpleSubentityTable.updatedAt]
    target.createUser = resultRow[SimpleSubentityTable.createUser]
    target.updateUser = resultRow[SimpleSubentityTable.updateUser]
    return target
  }

  public fun withoutModelsInsertLambda(source: SimpleSubentityDto):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSubentityTable.name] = source.name
    it[SimpleSubentityTable.value] = source.value
    it[SimpleSubentityTable.prio] = source.prio
    it[SimpleSubentityTable.aInstant] = source.aInstant
    it[SimpleSubentityTable.aLocalDateTime] = source.aLocalDateTime
    it[SimpleSubentityTable.subEntityDtoSpecificProp] = source.subEntityDtoSpecificProp
    it[SimpleSubentityTable.uuid] = source.uuid
    it[SimpleSubentityTable.createdAt] = source.createdAt
    it[SimpleSubentityTable.updatedAt] = source.updatedAt
    it[SimpleSubentityTable.createUser] = source.createUser
    it[SimpleSubentityTable.updateUser] = source.updateUser
  }

  public fun withoutModelsBatchInsertLambda(source: SimpleSubentityDto):
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    this[SimpleSubentityTable.name] = source.name
    this[SimpleSubentityTable.value] = source.value
    this[SimpleSubentityTable.prio] = source.prio
    this[SimpleSubentityTable.aInstant] = source.aInstant
    this[SimpleSubentityTable.aLocalDateTime] = source.aLocalDateTime
    this[SimpleSubentityTable.subEntityDtoSpecificProp] = source.subEntityDtoSpecificProp
    this[SimpleSubentityTable.uuid] = source.uuid
    this[SimpleSubentityTable.createdAt] = source.createdAt
    this[SimpleSubentityTable.updatedAt] = source.updatedAt
    this[SimpleSubentityTable.createUser] = source.createUser
    this[SimpleSubentityTable.updateUser] = source.updateUser
  }

  public fun withoutModelsSimpleSubentityDto(resultRow: ResultRow): SimpleSubentityDto {
    val target = SimpleSubentityDto._internal_create()
    target.name = resultRow[SimpleSubentityTable.name]
    target.value = resultRow[SimpleSubentityTable.value]
    target.prio = resultRow[SimpleSubentityTable.prio]
    target.aInstant = resultRow[SimpleSubentityTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleSubentityTable.aLocalDateTime]
    target.subEntityDtoSpecificProp = resultRow[SimpleSubentityTable.subEntityDtoSpecificProp]
    target.uuid = resultRow[SimpleSubentityTable.uuid]
    target.createdAt = resultRow[SimpleSubentityTable.createdAt]
    target.updatedAt = resultRow[SimpleSubentityTable.updatedAt]
    target.createUser = resultRow[SimpleSubentityTable.createUser]
    target.updateUser = resultRow[SimpleSubentityTable.updateUser]
    return target
  }
}
