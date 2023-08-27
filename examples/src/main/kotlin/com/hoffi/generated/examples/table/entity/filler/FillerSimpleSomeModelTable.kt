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

  public fun fillShallowLambda(source: SimpleSomeModelDto):
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

  public fun batchFillShallowLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
    this[SimpleSomeModelTable.someName] = it.someName
    this[SimpleSomeModelTable.someValue] = it.someValue
    this[SimpleSomeModelTable.optimisticLockId] = it.optimisticLockId
    this[SimpleSomeModelTable.uuid] = it.uuid
    this[SimpleSomeModelTable.createdAt] = it.createdAt
    this[SimpleSomeModelTable.updatedAt] = it.updatedAt
    this[SimpleSomeModelTable.createUser] = it.createUser
    this[SimpleSomeModelTable.updateUser] = it.updateUser
  }

  public fun somePrefixFillShallowLambda(source: SimpleSomeModelDto):
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

  public fun somePrefixBatchFillShallowLambda(): BatchInsertStatement.(SimpleSomeModelDto) -> Unit =
      {
    this[SimpleSomeModelTable.someName] = it.someName
    this[SimpleSomeModelTable.someValue] = it.someValue
    this[SimpleSomeModelTable.optimisticLockId] = it.optimisticLockId
    this[SimpleSomeModelTable.uuid] = it.uuid
    this[SimpleSomeModelTable.createdAt] = it.createdAt
    this[SimpleSomeModelTable.updatedAt] = it.updatedAt
    this[SimpleSomeModelTable.createUser] = it.createUser
    this[SimpleSomeModelTable.updateUser] = it.updateUser
  }

  public fun withoutModelsFillShallowLambda(source: SimpleSomeModelDto):
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

  public fun withoutModelsBatchFillShallowLambda():
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
