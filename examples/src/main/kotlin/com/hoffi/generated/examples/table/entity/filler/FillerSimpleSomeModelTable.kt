package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
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

  public fun insertShallowWith1To1sLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    insert1to1ModelsLambda(source).invoke(this, it)
    insertShallowLambda(source).invoke(this, it)
  }

  public fun batchInsertShallowWith1To1sLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit
      = {
    batchInsert1to1ModelsLambda().invoke(this, it)
    batchInsertShallowLambda().invoke(this, it)
  }

  public fun insert1to1ModelsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun batchInsert1to1ModelsLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
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

  public fun withoutModelsInsertShallowWith1To1sLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    withoutModelsInsert1to1ModelsLambda(source).invoke(this, it)
    withoutModelsInsertShallowLambda(source).invoke(this, it)
  }

  public fun withoutModelsBatchInsertShallowWith1To1sLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    withoutModelsBatchInsert1to1ModelsLambda().invoke(this, it)
    withoutModelsBatchInsertShallowLambda().invoke(this, it)
  }

  public fun withoutModelsInsert1to1ModelsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun withoutModelsBatchInsert1to1ModelsLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
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

  public fun somePrefixInsertShallowWith1To1sLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    somePrefixInsert1to1ModelsLambda(source).invoke(this, it)
    somePrefixInsertShallowLambda(source).invoke(this, it)
  }

  public fun somePrefixBatchInsertShallowWith1To1sLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    somePrefixBatchInsert1to1ModelsLambda().invoke(this, it)
    somePrefixBatchInsertShallowLambda().invoke(this, it)
  }

  public fun somePrefixInsert1to1ModelsLambda(source: SimpleSomeModelDto):
      SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun somePrefixBatchInsert1to1ModelsLambda():
      BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    // NONE
  }

  public fun somePrefixInsertShallowLambda(source: SimpleSomeModelDto):
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

  public fun somePrefixBatchInsertShallowLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit
      = {
    this[SimpleSomeModelTable.someName] = it.someName
    this[SimpleSomeModelTable.someValue] = it.someValue
    this[SimpleSomeModelTable.optimisticLockId] = it.optimisticLockId
    this[SimpleSomeModelTable.uuid] = it.uuid
    this[SimpleSomeModelTable.createdAt] = it.createdAt
    this[SimpleSomeModelTable.updatedAt] = it.updatedAt
    this[SimpleSomeModelTable.createUser] = it.createUser
    this[SimpleSomeModelTable.updateUser] = it.updateUser
  }

  public fun somePrefixSimpleSomeModelDto(resultRow: ResultRow): SimpleSomeModelDto {
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
