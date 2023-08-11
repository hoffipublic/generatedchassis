package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.ResultRow
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
    target.someModelObject = FillerSimpleSomeModelTable.simpleSomeModelDto(resultRow)
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

  public fun insertWithout2ManysLambda(source: SimpleEntityDto /*, noBackref: Dto */):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    insert1to1ModelsLambda(source).invoke(this, it)
    insertShallowLambda(source).invoke(this, it)
    //set2ManyOutgoingFKsLambda(source).invoke(this, it) // only if this is x2n backref for something
  }

  public fun insert1to1ModelsLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    SimpleSomeModelTable.insert(FillerSimpleSomeModelTable.insertWithout2ManysLambda(source.someModelObject))
    it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
  }

  // only if x2n backref for something
  public fun set2ManyOutgoingFKsLambda(redundant: SimpleEntityDto):
          SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun insertShallowLambda(source: SimpleEntityDto):
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

  public fun batchInsertWithout2ManysLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    batchInsert1to1ModelsLambda().invoke(this, it)
    batchInsertShallowLambda().invoke(this, it) // 1to1 FKed row in dependant table has already to exist here!
    //batchSet2ManyOutgoingFKsLambda(it /*, backref */).invoke(this, it) // only if x2n backref for something().invoke(this, it)
  }

  // only if x2n backref for something
  public fun batchSet2ManyOutgoingFKsLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    // NONE
  }

  public fun batchInsert1to1ModelsLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    FillerSimpleSomeModelTable.batchInsertWithout2ManysLambda().invoke(this, it.someModelObject)
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid
  }

  public fun batchInsert2ManyBackrefLambda(XXXisNotPartOfAny2ManyBackref: Int): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
  }

  public fun batchInsertShallowLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
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
    target.someModelObject = FillerSimpleSomeModelTable.simpleSomeModelDto(resultRow)
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
    insertShallowLambda(source).invoke(this, it)
    set2ManyOutgoingFKsLambda(source).invoke(this, it)
    insert1to1ModelsLambda(source).invoke(this, it)
  }

  public fun withoutModelsInsertOutgoingFKsLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun withoutModelsInsert1to1ModelsLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    SimpleSomeModelTable.insert(FillerSimpleSomeModelTable.withoutModelsInsertLambda(source.someModelObject))
    it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
  }

  public fun withoutModelsInsertNon1to1ModelsLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
  }

  public fun withoutModelsInsertShallowLambda(source: SimpleEntityDto):
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

  public fun withoutModelsBatchInsertLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    batchInsertShallowLambda().invoke(this, it)
    batchInsert1to1ModelsLambda().invoke(this, it)
  }

  public fun withoutModelsBatchInsertOutgoingFKsLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    // NONE
  }

  public fun withoutModelsBatchInsert1to1ModelsLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    FillerSimpleSomeModelTable.withoutModelsBatchInsertLambda().invoke(this, it.someModelObject)
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid
  }

  public fun withoutModelsBatchInsertNon1to1ModelsLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
  }

  public fun withoutModelsBatchInsertShallowLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit
      = {
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
