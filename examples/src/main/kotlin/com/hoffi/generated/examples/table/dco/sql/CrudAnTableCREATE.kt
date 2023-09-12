package com.hoffi.generated.examples.table.dco.sql

import com.hoffi.generated.examples.dco.dco.AnDco
import com.hoffi.generated.examples.table.dco.AnTable
import com.hoffi.generated.examples.table.dco.filler.FillerAnTable
import com.hoffi.generated.examples.table.entity.sql.CrudSimpleSomeModelTableCREATE
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * CRUD CREATE for table model: an
 * with dslRef: disc:simpleEntities|modelgroup:dCogroup|model:an|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudAnTableCREATE : WasGenerated {
  public fun insertDb(source: AnDco, customStatements: AnTable.(InsertStatement<Number>) -> Unit =
      {}) {
    // NONE
    // insert 1To1 Models
    CrudSimpleSomeModelTableCREATE.insertDb(source.someModelObject)
    // insertShallow AnTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    AnTable.insert {
      FillerAnTable.fillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      it[AnTable.someModelObjectUuid] = source.someModelObject.uuid
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // NONE
  }

  public fun batchInsertDb(sources: Collection<AnDco>,
      customStatements: BatchInsertStatement.(AnDco) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    val anTableToSomeModelObject = sources.associateWith {
      source -> source.someModelObject
    }
    CrudSimpleSomeModelTableCREATE.batchInsertDb(anTableToSomeModelObject.values)
    // batchInsertShallow AnTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    AnTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      FillerAnTable.batchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      this[AnTable.someModelObjectUuid] = anTableToSomeModelObject[it]!!.uuid
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // NONE
  }
}
