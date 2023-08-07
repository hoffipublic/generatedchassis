package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert
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
    target.someModelObject = FillerSimpleSubentityTable.simpleSubentityDto(resultRow)
    // not yet implemented subentitys SET of SimpleSubentityDto
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

  public fun insertLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    insertShallowLambda(source).invoke(this, it)
    // TODO one2One check if dependant model Table Entry already exists!
    SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertLambda(source.someModelObject, source.uuid))
    it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
    SimpleSubentityTable.batchInsert(source.subentitys ?: emptySet(), shouldReturnGeneratedValues = false,
      body = FillerSimpleSubentityTable.batchInsertLambda(source.uuid)
    )
    // not yet implemented listOfStrings LIST of String
  }

  public fun insertShallowLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityTable.name] = source.name
    it[SimpleEntityTable.value] = source.value
    it[SimpleEntityTable.prio] = source.prio
    it[SimpleEntityTable.aInstant] = source.aInstant
    it[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    // not yet implemented listOfStrings LIST of String
    it[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    it[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityTable.uuid] = source.uuid
    it[SimpleEntityTable.createdAt] = source.createdAt
    it[SimpleEntityTable.updatedAt] = source.updatedAt
    it[SimpleEntityTable.createUser] = source.createUser
    it[SimpleEntityTable.updateUser] = source.updateUser
  }

  public fun batchInsertLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    batchInsertShallowLambda().invoke(this, it)
    // TODO one2One check if dependant model Table Entry already exists!
    SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertLambda(it.someModelObject, it.uuid))
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid // ???
    SimpleSubentityTable.batchInsert(it.subentitys ?: emptySet(), shouldReturnGeneratedValues = false,
      body = FillerSimpleSubentityTable.batchInsertLambda(it.uuid)
    )
    // not yet implemented listOfStrings LIST of String
  }

  public fun batchInsertShallowLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    this[SimpleEntityTable.name] = it.name
    this[SimpleEntityTable.value] = it.value
    this[SimpleEntityTable.prio] = it.prio
    this[SimpleEntityTable.aInstant] = it.aInstant
    this[SimpleEntityTable.aLocalDateTime] = it.aLocalDateTime
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid // ???
    // not yet implemented subentitys SET of SimpleSubentityDto
    // not yet implemented listOfStrings LIST of String
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
    target.someModelObject = FillerSimpleSubentityTable.simpleSubentityDto(resultRow)
    // not yet implemented subentitys SET of SimpleSubentityDto
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

  public fun withoutModelsInsertLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityTable.name] = source.name
    it[SimpleEntityTable.value] = source.value
    it[SimpleEntityTable.prio] = source.prio
    it[SimpleEntityTable.aInstant] = source.aInstant
    it[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    // TODO one2One check if dependant model Table Entry already exists!
    SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertLambda(source.someModelObject, source.uuid))
    it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
    // not yet implemented subentitys SET of SimpleSubentityDto
    // not yet implemented listOfStrings LIST of String
    it[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    it[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityTable.uuid] = source.uuid
    it[SimpleEntityTable.createdAt] = source.createdAt
    it[SimpleEntityTable.updatedAt] = source.updatedAt
    it[SimpleEntityTable.createUser] = source.createUser
    it[SimpleEntityTable.updateUser] = source.updateUser
  }

  public fun withoutModelsBatchInsertLambda(source: SimpleEntityDto):
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    this[SimpleEntityTable.name] = source.name
    this[SimpleEntityTable.value] = source.value
    this[SimpleEntityTable.prio] = source.prio
    this[SimpleEntityTable.aInstant] = source.aInstant
    this[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    // TODO one2One check if dependant model Table Entry already exists!
    SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertLambda(it.someModelObject, it.uuid))
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid // ???
    SimpleSubentityTable.batchInsert(it.subentitys ?: emptySet(), shouldReturnGeneratedValues = false,
      body = FillerSimpleSubentityTable.batchInsertLambda(it.uuid)
    )
    // not yet implemented listOfStrings LIST of String
    this[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    this[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    this[SimpleEntityTable.uuid] = source.uuid
    this[SimpleEntityTable.createdAt] = source.createdAt
    this[SimpleEntityTable.updatedAt] = source.updatedAt
    this[SimpleEntityTable.createUser] = source.createUser
    this[SimpleEntityTable.updateUser] = source.updateUser
  }
}
