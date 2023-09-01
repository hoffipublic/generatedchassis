package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleSomeOtherDto
import com.hoffi.generated.examples.table.entity.SimpleSomeOtherTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * Filler for dto model: SomeOther
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeOther|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSomeOtherTable : WasGenerated {
  public fun simpleSomeOtherDto(resultRow: ResultRow): SimpleSomeOtherDto {
    val target = SimpleSomeOtherDto._internal_create()
    target.someName = resultRow[SimpleSomeOtherTable.someName]
    target.someValue = resultRow[SimpleSomeOtherTable.someValue]
    target.optimisticLockId = resultRow[SimpleSomeOtherTable.optimisticLockId]
    target.uuid = resultRow[SimpleSomeOtherTable.uuid]
    target.createdAt = resultRow[SimpleSomeOtherTable.createdAt]
    target.updatedAt = resultRow[SimpleSomeOtherTable.updatedAt]
    target.createUser = resultRow[SimpleSomeOtherTable.createUser]
    target.updateUser = resultRow[SimpleSomeOtherTable.updateUser]
    return target
  }

  public fun fillShallowLambda(source: SimpleSomeOtherDto):
      SimpleSomeOtherTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSomeOtherTable.someName] = source.someName
    it[SimpleSomeOtherTable.someValue] = source.someValue
    it[SimpleSomeOtherTable.optimisticLockId] = source.optimisticLockId
    it[SimpleSomeOtherTable.uuid] = source.uuid
    it[SimpleSomeOtherTable.createdAt] = source.createdAt
    it[SimpleSomeOtherTable.updatedAt] = source.updatedAt
    it[SimpleSomeOtherTable.createUser] = source.createUser
    it[SimpleSomeOtherTable.updateUser] = source.updateUser
  }

  public fun batchFillShallowLambda(): BatchInsertStatement.(SimpleSomeOtherDto) -> Unit = {
    this[SimpleSomeOtherTable.someName] = it.someName
    this[SimpleSomeOtherTable.someValue] = it.someValue
    this[SimpleSomeOtherTable.optimisticLockId] = it.optimisticLockId
    this[SimpleSomeOtherTable.uuid] = it.uuid
    this[SimpleSomeOtherTable.createdAt] = it.createdAt
    this[SimpleSomeOtherTable.updatedAt] = it.updatedAt
    this[SimpleSomeOtherTable.createUser] = it.createUser
    this[SimpleSomeOtherTable.updateUser] = it.updateUser
  }
}
