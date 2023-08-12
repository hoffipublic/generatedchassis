package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * Filler for dto model: SomeModel
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeModel|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSomeModelTable : WasGenerated {
  public fun simpleSomeModelDto(resultRow: ResultRow): SimpleSomeModelDto {
    val target = SimpleSomeModelDto._internal_create()
    target.someName = resultRow[SimpleSomeModelTable.someName]
    target.someValue = resultRow[SimpleSomeModelTable.someValue]
    target.optimisticLockId = resultRow[SimpleSomeModelTable.optimisticLockId]
    target.uuid = resultRow[SimpleSomeModelTable.uuid]
    target.createdAt = resultRow[SimpleSomeModelTable.createdAt]
    target.updatedAt = resultRow[SimpleSomeModelTable.updatedAt]
    target.createUser = resultRow[SimpleSomeModelTable.createUser]
    target.updateUser = resultRow[SimpleSomeModelTable.updateUser]
    return target
  }

  public fun insertShallowAnd1To1sLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    insert1to1ModelsLambda(source).invoke(this, it)
    insertShallowLambda(source).invoke(this, it)
  }

  public fun insert1to1ModelsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
    // would call CrudSimpleXXTableCREATE.insert(source.xxx /* , backRef1: SomeDto, backRef2: SomeOtherDto */)
  }

  public fun insert2ManyModelsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun insertShallowLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSomeModelTable.someName] = source.someName
    it[SimpleSomeModelTable.someValue] = source.someValue
    it[SimpleSomeModelTable.optimisticLockId] = source.optimisticLockId
    it[SimpleSomeModelTable.uuid] = source.uuid
    it[SimpleSomeModelTable.createdAt] = source.createdAt
    it[SimpleSomeModelTable.updatedAt] = source.updatedAt
    it[SimpleSomeModelTable.createUser] = source.createUser
    it[SimpleSomeModelTable.updateUser] = source.updateUser
  }

  public fun batchInsertShallowAnd1To1sLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    batchInsert1to1ModelsLambda().invoke(this, it)
    batchInsertShallowLambda().invoke(this, it)
  }


  public fun batchInsert1to1ModelsLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    // NONE
  }

  public fun batchInsertShallowLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    this[SimpleSomeModelTable.someName] = it.someName
    this[SimpleSomeModelTable.someValue] = it.someValue
    this[SimpleSomeModelTable.optimisticLockId] = it.optimisticLockId
    this[SimpleSomeModelTable.uuid] = it.uuid
    this[SimpleSomeModelTable.createdAt] = it.createdAt
    this[SimpleSomeModelTable.updatedAt] = it.updatedAt
    this[SimpleSomeModelTable.createUser] = it.createUser
    this[SimpleSomeModelTable.updateUser] = it.updateUser
  }

  public fun withoutModelsInsertLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    insertShallowLambda(source).invoke(this, it)
    insert1to1ModelsLambda(source).invoke(this, it)
    insert2ManyModelsLambda(source).invoke(this, it)
  }

  public fun withoutModelsInsertOutgoingFKsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun withoutModelsInsert1to1ModelsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun withoutModelsInsertNon1to1ModelsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun withoutModelsInsertShallowLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSomeModelTable.someName] = source.someName
    it[SimpleSomeModelTable.someValue] = source.someValue
    it[SimpleSomeModelTable.optimisticLockId] = source.optimisticLockId
    it[SimpleSomeModelTable.uuid] = source.uuid
    it[SimpleSomeModelTable.createdAt] = source.createdAt
    it[SimpleSomeModelTable.updatedAt] = source.updatedAt
    it[SimpleSomeModelTable.createUser] = source.createUser
    it[SimpleSomeModelTable.updateUser] = source.updateUser
  }

  public fun withoutModelsBatchInsertLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    batchInsert1to1ModelsLambda().invoke(this, it)
    batchInsertShallowLambda().invoke(this, it)
  }

  public fun withoutModelsBatchInsertOutgoingFKsLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    // NONE
  }

  public fun withoutModelsBatchInsert1to1ModelsLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    // NONE
  }

  public fun withoutModelsBatchInsertNon1to1ModelsLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    // NONE
  }

  public fun withoutModelsBatchInsertShallowLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    this[SimpleSomeModelTable.someName] = it.someName
    this[SimpleSomeModelTable.someValue] = it.someValue
    this[SimpleSomeModelTable.optimisticLockId] = it.optimisticLockId
    this[SimpleSomeModelTable.uuid] = it.uuid
    this[SimpleSomeModelTable.createdAt] = it.createdAt
    this[SimpleSomeModelTable.updatedAt] = it.updatedAt
    this[SimpleSomeModelTable.createUser] = it.createUser
    this[SimpleSomeModelTable.updateUser] = it.updateUser
  }

  public fun withoutModelsSimpleSomeModelDto(resultRow: ResultRow): SimpleSomeModelDto {
    val target = SimpleSomeModelDto._internal_create()
    target.someName = resultRow[SimpleSomeModelTable.someName]
    target.someValue = resultRow[SimpleSomeModelTable.someValue]
    target.optimisticLockId = resultRow[SimpleSomeModelTable.optimisticLockId]
    target.uuid = resultRow[SimpleSomeModelTable.uuid]
    target.createdAt = resultRow[SimpleSomeModelTable.createdAt]
    target.updatedAt = resultRow[SimpleSomeModelTable.updatedAt]
    target.createUser = resultRow[SimpleSomeModelTable.createUser]
    target.updateUser = resultRow[SimpleSomeModelTable.updateUser]
    return target
  }
}
