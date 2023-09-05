package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * Filler for dto model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleEntityTable : WasGenerated {
  public fun simpleEntityDto(resultRow: ResultRow): SimpleEntityDto {
    val target = SimpleEntityDto._internal_create()
    target.name = resultRow[SimpleEntityTable.name]
    target.value = resultRow[SimpleEntityTable.value]
    target.prio = resultRow[SimpleEntityTable.prio]
    target.aInstant = resultRow[SimpleEntityTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleEntityTable.aLocalDateTime]
    // target.someModelObject dealt with in sql.CRUD...
    // target.subentitys SET of SimpleSubentityDto dealt with in sql.CRUD...
    // not yet implemented listOfStrings LIST of String
    target.dtoSpecificProp = resultRow[SimpleEntityTable.dtoSpecificProp]
    target.optimisticLockId = resultRow[SimpleEntityTable.optimisticLockId]
    target.uuid = resultRow[SimpleEntityTable.uuid]
    target.createdAt = resultRow[SimpleEntityTable.createdAt]
    target.updatedAt = resultRow[SimpleEntityTable.updatedAt]
    target.createUser = resultRow[SimpleEntityTable.createUser]
    target.updateUser = resultRow[SimpleEntityTable.updateUser]
    return target
  }

  public fun fillShallowLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityTable.name] = source.name
    it[SimpleEntityTable.value] = source.value
    it[SimpleEntityTable.prio] = source.prio
    it[SimpleEntityTable.aInstant] = source.aInstant
    it[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    it[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    it[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityTable.uuid] = source.uuid
    it[SimpleEntityTable.createdAt] = source.createdAt
    it[SimpleEntityTable.updatedAt] = source.updatedAt
    it[SimpleEntityTable.createUser] = source.createUser
    it[SimpleEntityTable.updateUser] = source.updateUser
  }

  public fun batchFillShallowLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    this[SimpleEntityTable.name] = it.name
    this[SimpleEntityTable.value] = it.value
    this[SimpleEntityTable.prio] = it.prio
    this[SimpleEntityTable.aInstant] = it.aInstant
    this[SimpleEntityTable.aLocalDateTime] = it.aLocalDateTime
    this[SimpleEntityTable.dtoSpecificProp] = it.dtoSpecificProp
    this[SimpleEntityTable.optimisticLockId] = it.optimisticLockId
    this[SimpleEntityTable.uuid] = it.uuid
    this[SimpleEntityTable.createdAt] = it.createdAt
    this[SimpleEntityTable.updatedAt] = it.updatedAt
    this[SimpleEntityTable.createUser] = it.createUser
    this[SimpleEntityTable.updateUser] = it.updateUser
  }

  public fun simpleSubentityDto(resultRow: ResultRow): SimpleSubentityDto {
    val target = SimpleSubentityDto._internal_create()
    target.name = resultRow[SimpleEntityTable.name]
    target.value = resultRow[SimpleEntityTable.value]
    target.prio = resultRow[SimpleEntityTable.prio]
    target.aInstant = resultRow[SimpleEntityTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleEntityTable.aLocalDateTime]
    target.uuid = resultRow[SimpleEntityTable.uuid]
    target.createdAt = resultRow[SimpleEntityTable.createdAt]
    target.updatedAt = resultRow[SimpleEntityTable.updatedAt]
    target.createUser = resultRow[SimpleEntityTable.createUser]
    target.updateUser = resultRow[SimpleEntityTable.updateUser]
    return target
  }

  public fun withoutModelsSimpleEntityDto(resultRow: ResultRow): SimpleEntityDto {
    val target = SimpleEntityDto._internal_create()
    target.name = resultRow[SimpleEntityTable.name]
    target.value = resultRow[SimpleEntityTable.value]
    target.prio = resultRow[SimpleEntityTable.prio]
    target.aInstant = resultRow[SimpleEntityTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleEntityTable.aLocalDateTime]
    // target.someModelObject dealt with in sql.CRUD...
    // target.subentitys SET of SimpleSubentityDto dealt with in sql.CRUD...
    // not yet implemented listOfStrings LIST of String
    target.dtoSpecificProp = resultRow[SimpleEntityTable.dtoSpecificProp]
    target.optimisticLockId = resultRow[SimpleEntityTable.optimisticLockId]
    target.uuid = resultRow[SimpleEntityTable.uuid]
    target.createdAt = resultRow[SimpleEntityTable.createdAt]
    target.updatedAt = resultRow[SimpleEntityTable.updatedAt]
    target.createUser = resultRow[SimpleEntityTable.createUser]
    target.updateUser = resultRow[SimpleEntityTable.updateUser]
    return target
  }

  public fun withoutModelsFillShallowLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityTable.name] = source.name
    it[SimpleEntityTable.value] = source.value
    it[SimpleEntityTable.prio] = source.prio
    it[SimpleEntityTable.aInstant] = source.aInstant
    it[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    it[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    it[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityTable.uuid] = source.uuid
    it[SimpleEntityTable.createdAt] = source.createdAt
    it[SimpleEntityTable.updatedAt] = source.updatedAt
    it[SimpleEntityTable.createUser] = source.createUser
    it[SimpleEntityTable.updateUser] = source.updateUser
  }

  public fun withoutModelsBatchFillShallowLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit =
      {
    this[SimpleEntityTable.name] = it.name
    this[SimpleEntityTable.value] = it.value
    this[SimpleEntityTable.prio] = it.prio
    this[SimpleEntityTable.aInstant] = it.aInstant
    this[SimpleEntityTable.aLocalDateTime] = it.aLocalDateTime
    this[SimpleEntityTable.dtoSpecificProp] = it.dtoSpecificProp
    this[SimpleEntityTable.optimisticLockId] = it.optimisticLockId
    this[SimpleEntityTable.uuid] = it.uuid
    this[SimpleEntityTable.createdAt] = it.createdAt
    this[SimpleEntityTable.updatedAt] = it.updatedAt
    this[SimpleEntityTable.createUser] = it.createUser
    this[SimpleEntityTable.updateUser] = it.updateUser
  }

  public fun somePrefixSimpleEntityDto(resultRow: ResultRow): SimpleEntityDto {
    val target = SimpleEntityDto._internal_create()
    target.name = resultRow[SimpleEntityTable.name]
    target.value = resultRow[SimpleEntityTable.value]
    target.prio = resultRow[SimpleEntityTable.prio]
    target.aInstant = resultRow[SimpleEntityTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleEntityTable.aLocalDateTime]
    // target.someModelObject dealt with in sql.CRUD...
    // target.subentitys SET of SimpleSubentityDto dealt with in sql.CRUD...
    // not yet implemented listOfStrings LIST of String
    target.dtoSpecificProp = resultRow[SimpleEntityTable.dtoSpecificProp]
    target.optimisticLockId = resultRow[SimpleEntityTable.optimisticLockId]
    target.uuid = resultRow[SimpleEntityTable.uuid]
    target.createdAt = resultRow[SimpleEntityTable.createdAt]
    target.updatedAt = resultRow[SimpleEntityTable.updatedAt]
    target.createUser = resultRow[SimpleEntityTable.createUser]
    target.updateUser = resultRow[SimpleEntityTable.updateUser]
    return target
  }

  public fun somePrefixFillShallowLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityTable.name] = source.name
    it[SimpleEntityTable.value] = source.value
    it[SimpleEntityTable.prio] = source.prio
    it[SimpleEntityTable.aInstant] = source.aInstant
    it[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    it[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    it[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityTable.uuid] = source.uuid
    it[SimpleEntityTable.createdAt] = source.createdAt
    it[SimpleEntityTable.updatedAt] = source.updatedAt
    it[SimpleEntityTable.createUser] = source.createUser
    it[SimpleEntityTable.updateUser] = source.updateUser
  }

  public fun somePrefixBatchFillShallowLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    this[SimpleEntityTable.name] = it.name
    this[SimpleEntityTable.value] = it.value
    this[SimpleEntityTable.prio] = it.prio
    this[SimpleEntityTable.aInstant] = it.aInstant
    this[SimpleEntityTable.aLocalDateTime] = it.aLocalDateTime
    this[SimpleEntityTable.dtoSpecificProp] = it.dtoSpecificProp
    this[SimpleEntityTable.optimisticLockId] = it.optimisticLockId
    this[SimpleEntityTable.uuid] = it.uuid
    this[SimpleEntityTable.createdAt] = it.createdAt
    this[SimpleEntityTable.updatedAt] = it.updatedAt
    this[SimpleEntityTable.createUser] = it.createUser
    this[SimpleEntityTable.updateUser] = it.updateUser
  }
}
