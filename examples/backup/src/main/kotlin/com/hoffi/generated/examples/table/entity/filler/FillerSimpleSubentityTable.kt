package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
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
  public fun insertWithout2ManysLambda(source: SimpleSubentityDto, backrefSimpleEntityDto: SimpleEntityDto):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    insert1to1ModelsLambda(source).invoke(this, it)
    insertShallowLambda(source).invoke(this, it) // 1to1 FKed row in dependant table has already to exist here!
    set2ManyOutgoingFKsLambda(source, backrefSimpleEntityDto).invoke(this, it) // only if x2n backref for something
  }

  public fun insert1to1ModelsLambda(source: SimpleSubentityDto):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  // only if x2n backref for something
  public fun set2ManyOutgoingFKsLambda(redundant: SimpleSubentityDto, backrefSimpleEntityDto: SimpleEntityDto):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSubentityTable.simpleEntitySubentitysUuid] = backrefSimpleEntityDto.uuid
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
    it[SimpleSubentityTable.createdAt] = source.createdAt
    it[SimpleSubentityTable.updatedAt] = source.updatedAt
    it[SimpleSubentityTable.createUser] = source.createUser
    it[SimpleSubentityTable.updateUser] = source.updateUser
  }

  public fun batchInsertWithout2ManysLambda(backrefSimpleEntityDto: SimpleEntityDto):
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    batchInsert1to1ModelsLambda().invoke(this, it)
    batchInsertShallowLambda().invoke(this, it)
    batchSet2ManyOutgoingFKsLambda(backrefSimpleEntityDto).invoke(this, it) // only if x2n backref for something().invoke(this, it)
  }
  // will break if non nullable FKs
  public fun batchInsertWithout2ManysAndOutgoingFKsLambda():
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    batchInsert1to1ModelsLambda().invoke(this, it)
    batchInsertShallowLambda().invoke(this, it)
  }

  // only if x2n backref for something
  public fun batchSet2ManyOutgoingFKsLambda(backrefSimpleEntityDto: SimpleEntityDto):
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    this[SimpleSubentityTable.simpleEntitySubentitysUuid] = backrefSimpleEntityDto.uuid
  }

  public fun batchInsert1to1ModelsLambda(): BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    // NONE
  }

  public fun batchInsertShallowLambda(): BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    this[SimpleSubentityTable.name] = it.name
    this[SimpleSubentityTable.value] = it.value
    this[SimpleSubentityTable.prio] = it.prio
    this[SimpleSubentityTable.aInstant] = it.aInstant
    this[SimpleSubentityTable.aLocalDateTime] = it.aLocalDateTime
    this[SimpleSubentityTable.subEntityDtoSpecificProp] = it.subEntityDtoSpecificProp
    this[SimpleSubentityTable.uuid] = it.uuid
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

  public fun withoutModelsInsertLambda(source: SimpleSubentityDto,
      simpleEntitySubentitysUuid: UUID): SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    insertShallowLambda(source).invoke(this, it)
    insert1to1ModelsLambda(source).invoke(this, it)
  }

  public fun withoutModelsInsertOutgoingFKsLambda(source: SimpleSubentityDto,
      simpleEntitySubentitysUuid: UUID): SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleSubentityTable.simpleEntitySubentitysUuid] = simpleEntitySubentitysUuid
  }

  public fun withoutModelsInsert1to1ModelsLambda(source: SimpleSubentityDto):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun withoutModelsInsertNon1to1ModelsLambda(source: SimpleSubentityDto):
      SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
    // NONE
  }

  public fun withoutModelsInsertShallowLambda(source: SimpleSubentityDto):
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

  public fun withoutModelsBatchInsertLambda(simpleEntitySubentitysUuid: UUID):
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    batchInsertShallowLambda().invoke(this, it)
    batchInsert1to1ModelsLambda().invoke(this, it)
  }

  public fun withoutModelsBatchInsertOutgoingFKsLambda(simpleEntitySubentitysUuid: UUID):
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    this[SimpleSubentityTable.simpleEntitySubentitysUuid] = simpleEntitySubentitysUuid
  }

  public fun withoutModelsBatchInsert1to1ModelsLambda():
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    // NONE
  }

  public fun withoutModelsBatchInsertNon1to1ModelsLambda():
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    // NONE
  }

  public fun withoutModelsBatchInsertShallowLambda():
      BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
    this[SimpleSubentityTable.name] = it.name
    this[SimpleSubentityTable.value] = it.value
    this[SimpleSubentityTable.prio] = it.prio
    this[SimpleSubentityTable.aInstant] = it.aInstant
    this[SimpleSubentityTable.aLocalDateTime] = it.aLocalDateTime
    this[SimpleSubentityTable.subEntityDtoSpecificProp] = it.subEntityDtoSpecificProp
    this[SimpleSubentityTable.uuid] = it.uuid
    this[SimpleSubentityTable.createdAt] = it.createdAt
    this[SimpleSubentityTable.updatedAt] = it.updatedAt
    this[SimpleSubentityTable.createUser] = it.createUser
    this[SimpleSubentityTable.updateUser] = it.updateUser
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
