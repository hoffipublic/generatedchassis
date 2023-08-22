package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.sql.CrudSimpleSomeModelTableCREATE
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

  public fun insertShallowWith1To1sLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    insert1to1ModelsLambda(source).invoke(this, it)
    insertShallowLambda(source).invoke(this, it)
  }

  public fun batchInsertShallowWith1To1sLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    batchInsert1to1ModelsLambda().invoke(this, it)
    batchInsertShallowLambda().invoke(this, it)
  }

  public fun insert1to1ModelsLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    CrudSimpleSomeModelTableCREATE.insert(source.someModelObject) /* TODO , backRef1: SomeDto,
        backRef2: SomeOtherDto */
    it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
  }

  public fun batchInsert1to1ModelsLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    FillerSimpleSomeModelTable.batchInsertShallowWith1To1sLambda().invoke(this, it.someModelObject)
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid
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

  public fun withoutModelsInsertShallowWith1To1sLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    withoutModelsInsert1to1ModelsLambda(source).invoke(this, it)
    withoutModelsInsertShallowLambda(source).invoke(this, it)
  }

  public fun withoutModelsBatchInsertShallowWith1To1sLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    withoutModelsBatchInsert1to1ModelsLambda().invoke(this, it)
    withoutModelsBatchInsertShallowLambda().invoke(this, it)
  }

  public fun withoutModelsInsert1to1ModelsLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    CrudSimpleSomeModelTableCREATE.insert(source.someModelObject) /* TODO , backRef1: SomeDto,
        backRef2: SomeOtherDto */
    it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
  }

  public fun withoutModelsBatchInsert1to1ModelsLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    FillerSimpleSomeModelTable.withoutModelsBatchInsertShallowWith1To1sLambda().invoke(this,
        it.someModelObject)
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid
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

  public fun simpleSomeModelDtoInsertShallowWith1To1sLambda(source: SimpleSomeModelDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    simpleSomeModelDtoInsert1to1ModelsLambda(source).invoke(this, it)
    simpleSomeModelDtoInsertShallowLambda(source).invoke(this, it)
  }

  public fun simpleSomeModelDtoBatchInsertShallowWith1To1sLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    simpleSomeModelDtoBatchInsert1to1ModelsLambda().invoke(this, it)
    simpleSomeModelDtoBatchInsertShallowLambda().invoke(this, it)
  }

  public fun simpleSomeModelDtoInsert1to1ModelsLambda(source: SimpleSomeModelDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun simpleSomeModelDtoBatchInsert1to1ModelsLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    // NONE
  }

  public fun simpleSomeModelDtoInsertShallowLambda(source: SimpleSomeModelDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityTable.uuid] = source.uuid
    it[SimpleEntityTable.createdAt] = source.createdAt
    it[SimpleEntityTable.updatedAt] = source.updatedAt
    it[SimpleEntityTable.createUser] = source.createUser
    it[SimpleEntityTable.updateUser] = source.updateUser
  }

  public fun simpleSomeModelDtoBatchInsertShallowLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    this[SimpleEntityTable.optimisticLockId] = it.optimisticLockId
    this[SimpleEntityTable.uuid] = it.uuid
    this[SimpleEntityTable.createdAt] = it.createdAt
    this[SimpleEntityTable.updatedAt] = it.updatedAt
    this[SimpleEntityTable.createUser] = it.createUser
    this[SimpleEntityTable.updateUser] = it.updateUser
  }

  public fun simpleSomeModelDto(resultRow: ResultRow): SimpleSomeModelDto {
    val target = SimpleSomeModelDto._internal_create()
    target.optimisticLockId = resultRow[SimpleEntityTable.optimisticLockId]
    target.uuid = resultRow[SimpleEntityTable.uuid]
    target.createdAt = resultRow[SimpleEntityTable.createdAt]
    target.updatedAt = resultRow[SimpleEntityTable.updatedAt]
    target.createUser = resultRow[SimpleEntityTable.createUser]
    target.updateUser = resultRow[SimpleEntityTable.updateUser]
    return target
  }

  public fun somePrefixSimpleEntityDto(resultRow: ResultRow): SimpleEntityDto {
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

  public fun somePrefixInsertShallowWith1To1sLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    somePrefixInsert1to1ModelsLambda(source).invoke(this, it)
    somePrefixInsertShallowLambda(source).invoke(this, it)
  }

  public fun somePrefixBatchInsertShallowWith1To1sLambda():
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    somePrefixBatchInsert1to1ModelsLambda().invoke(this, it)
    somePrefixBatchInsertShallowLambda().invoke(this, it)
  }

  public fun somePrefixInsert1to1ModelsLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    // TODO one2One check if dependant model Table Entry already exists!
    CrudSimpleSomeModelTableCREATE.insert(source.someModelObject) /* TODO , backRef1: SomeDto,
        backRef2: SomeOtherDto */
    it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
  }

  public fun somePrefixBatchInsert1to1ModelsLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit
      = {
    // TODO one2One check if dependant model Table Entry already exists!
    FillerSimpleSomeModelTable.somePrefixBatchInsertShallowWith1To1sLambda().invoke(this,
        it.someModelObject)
    this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid
  }

  public fun somePrefixInsertShallowLambda(source: SimpleEntityDto):
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

  public fun somePrefixBatchInsertShallowLambda(): BatchInsertStatement.(SimpleEntityDto) -> Unit =
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
}
