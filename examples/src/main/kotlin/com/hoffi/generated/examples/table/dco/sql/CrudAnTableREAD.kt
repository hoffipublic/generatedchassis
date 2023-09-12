package com.hoffi.generated.examples.table.dco.sql

import com.hoffi.generated.examples.dco.dco.AnDco
import com.hoffi.generated.examples.table.dco.AnTable
import com.hoffi.generated.examples.table.dco.filler.FillerAnTable
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.sql.CrudSimpleSomeModelTableREAD
import com.hoffi.generated.universe.WasGenerated
import kotlin.Boolean
import kotlin.collections.List
import org.jetbrains.exposed.sql.Op
import org.jetbrains.exposed.sql.Query
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.SqlExpressionBuilder
import org.jetbrains.exposed.sql.Transaction
import org.jetbrains.exposed.sql.select

/**
 * CRUD READ for table model: an
 * with dslRef: disc:simpleEntities|modelgroup:dCogroup|model:an|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudAnTableREAD : WasGenerated {
  context(Transaction)
  public fun readBySelect(selectLambda: SqlExpressionBuilder.() -> Op<Boolean>): List<AnDco> {
    val query: Query = com.hoffi.generated.examples.table.dco.AnTable.select(selectLambda)
    // execute query against DB
    val resultRowList: List<ResultRow> = query.toList()
    val selectedAnDco = mutableListOf<AnDco>()
    for (rr in resultRowList) {
      val anDco = FillerAnTable.anDco(rr)
      // one2One models
      val someModelObject = CrudSimpleSomeModelTableREAD.readBySelect {
        SimpleSomeModelTable.uuid eq rr[AnTable.someModelObjectUuid]
      }
      .firstOrNull()
      anDco.someModelObject = someModelObject!!
      // many2One models
      // NONE
      // add
      selectedAnDco.add(anDco)
    }
    return selectedAnDco
  }
}
