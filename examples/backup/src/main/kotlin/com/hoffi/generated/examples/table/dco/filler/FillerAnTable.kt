package com.hoffi.generated.examples.table.dco.filler

import com.hoffi.generated.examples.dco.dco.AnDco
import com.hoffi.generated.examples.table.dco.AnTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * Filler for table model: an
 * with dslRef: disc:simpleEntities|modelgroup:dCogroup|model:an|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerAnTable : WasGenerated {
  public fun fillShallowLambda(source: AnDco): AnTable.(InsertStatement<Number>) -> Unit = {
    it[AnTable.value] = source.value
    it[AnTable.prio] = source.prio
    it[AnTable.aInstant] = source.aInstant
    it[AnTable.aLocalDateTime] = source.aLocalDateTime
  }

  public fun batchFillShallowLambda(): BatchInsertStatement.(AnDco) -> Unit = {
    this[AnTable.value] = it.value
    this[AnTable.prio] = it.prio
    this[AnTable.aInstant] = it.aInstant
    this[AnTable.aLocalDateTime] = it.aLocalDateTime
  }

  public fun anDco(resultRow: ResultRow): AnDco {
    val target = AnDco._internal_create()
    target.value = resultRow[AnTable.value]
    target.prio = resultRow[AnTable.prio]
    target.aInstant = resultRow[AnTable.aInstant]
    target.aLocalDateTime = resultRow[AnTable.aLocalDateTime]
    // target.someModelObject dealt with in sql.CRUD...
    return target
  }
}
