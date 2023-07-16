package com.hoffi.generated.examples.entity.table.filler

import com.hoffi.generated.examples.entity.dto.SimpleEntityDtoRunDto
import com.hoffi.generated.examples.entity.table.SimpleEntityDtoRunTable
import com.hoffi.generated.examples.entity.table.SimpleSubentityDtoRunTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * Filler for dto model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleEntityDtoRunTable : WasGenerated {
  public fun simpleEntityDtoRunDto(resultRow: ResultRow): SimpleEntityDtoRunDto {
    val target = SimpleEntityDtoRunDto._internal_create()
    target.name = resultRow[SimpleEntityDtoRunTable.name]
    target.value = resultRow[SimpleEntityDtoRunTable.value]
    target.prio = resultRow[SimpleEntityDtoRunTable.prio]
    target.aInstant = resultRow[SimpleEntityDtoRunTable.aInstant]
    target.aLocalDateTime = resultRow[SimpleEntityDtoRunTable.aLocalDateTime]
    target.someModelObject = FillerSimpleSubentityDtoRunTable.simpleSubentityDtoRunDto(resultRow)
    target.dtoSpecificProp = resultRow[SimpleEntityDtoRunTable.dtoSpecificProp]
    return target
  }

  public fun insertLambda(source: SimpleEntityDtoRunDto):
      SimpleEntityDtoRunTable.(InsertStatement<Number>) -> Unit = {
    it[SimpleEntityDtoRunTable.name] = source.name
    it[SimpleEntityDtoRunTable.value] = source.value
    it[SimpleEntityDtoRunTable.prio] = source.prio
    it[SimpleEntityDtoRunTable.aInstant] = source.aInstant
    it[SimpleEntityDtoRunTable.aLocalDateTime] = source.aLocalDateTime
    SimpleSubentityDtoRunTable.insert(FillerSimpleSubentityDtoRunTable.insertLambda(source.someModelObject))
    it[SimpleEntityDtoRunTable.someModelObject] = source.someModelObject.uuid
    it[SimpleEntityDtoRunTable.dtoSpecificProp] = source.dtoSpecificProp
    it[SimpleEntityDtoRunTable.optimisticLockId] = source.optimisticLockId
    it[SimpleEntityDtoRunTable.uuid] = source.uuid
    it[SimpleEntityDtoRunTable.createdAt] = source.createdAt
    it[SimpleEntityDtoRunTable.updatedAt] = source.updatedAt
    it[SimpleEntityDtoRunTable.createUser] = source.createUser
    it[SimpleEntityDtoRunTable.updateUser] = source.updateUser
  }
}
