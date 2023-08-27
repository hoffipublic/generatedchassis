package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSomeModelTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * CRUD CREATE for table model: SomeModel
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeModel|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSomeModelTableCREATE : WasGenerated {
  public fun insertDb(source: SimpleSomeModelDto,
      customStatements: SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    // NONE
    // insertShallow SimpleSomeModelTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSomeModelTable.insert {
      FillerSimpleSomeModelTable.fillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      // NONE
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // NONE
  }

  public fun batchInsertDb(sources: Collection<SimpleSomeModelDto>,
      customStatements: BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    // NONE
    // batchInsertShallow SimpleSomeModelTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSomeModelTable.batchInsert(sources, shouldReturnGeneratedValues
        = false) {
      FillerSimpleSomeModelTable.batchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      // NONE
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // NONE
  }

  public fun somePrefixInsertDb(source: SimpleSomeModelDto,
      customStatements: SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    // NONE
    // insertShallow SimpleSomeModelTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSomeModelTable.insert {
      FillerSimpleSomeModelTable.somePrefixFillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      // NONE
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // NONE
  }

  public fun somePrefixBatchInsertDb(sources: Collection<SimpleSomeModelDto>,
      customStatements: BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    // NONE
    // batchInsertShallow SimpleSomeModelTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSomeModelTable.batchInsert(sources, shouldReturnGeneratedValues
        = false) {
      FillerSimpleSomeModelTable.somePrefixBatchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      // NONE
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // NONE
  }
}
