package com.hoffi.generated.examples.table.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
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
    target.someModelObject = FillerSimpleSubentityTable.simpleSubentityDto(resultRow)
    target.dtoSpecificProp = resultRow[SimpleEntityTable.dtoSpecificProp]
    return target
  }

  public fun insertLambda(source: SimpleEntityDto):
      SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityTable.name] = source.name
    it[SimpleEntityTable.value] = source.value
    it[SimpleEntityTable.prio] = source.prio
    it[SimpleEntityTable.aInstant] = source.aInstant
    it[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    // TODO one2One check if dependant model Table Entry already exists!
    SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertLambda(source.someModelObject))
    it[SimpleEntityTable.someModelObject] = source.someModelObject.uuid
    it[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    it[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityTable.uuid] = source.uuid
    it[SimpleEntityTable.createdAt] = source.createdAt
    it[SimpleEntityTable.updatedAt] = source.updatedAt
    it[SimpleEntityTable.createUser] = source.createUser
    it[SimpleEntityTable.updateUser] = source.updateUser
  }

  public fun batchInsertLambda(source: SimpleEntityDto):
      BatchInsertStatement.(SimpleEntityDto) -> Unit = {
    this[SimpleEntityTable.name] = source.name
    this[SimpleEntityTable.value] = source.value
    this[SimpleEntityTable.prio] = source.prio
    this[SimpleEntityTable.aInstant] = source.aInstant
    this[SimpleEntityTable.aLocalDateTime] = source.aLocalDateTime
    // TODO one2One check if dependant model Table Entry already exists!
    FillerSimpleSubentityTable.batchInsertLambda(source.someModelObject).invoke(this,
        source.someModelObject)
    this[SimpleEntityTable.someModelObject] = source.someModelObject.uuid
    this[SimpleEntityTable.dtoSpecificProp] = source.dtoSpecificProp
    this[SimpleEntityTable.optimisticLockId] = source.optimisticLockId
    this[SimpleEntityTable.uuid] = source.uuid
    this[SimpleEntityTable.createdAt] = source.createdAt
    this[SimpleEntityTable.updatedAt] = source.updatedAt
    this[SimpleEntityTable.createUser] = source.createUser
    this[SimpleEntityTable.updateUser] = source.updateUser
  }
}
