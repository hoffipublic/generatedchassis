package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleEntityTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * CRUD CREATE for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleEntityTableCREATE : WasGenerated {
  public fun insertDb(source: SimpleEntityDto,
      customStatements: SimpleEntityTable.(InsertStatement<Number>) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    CrudSimpleSomeModelTableCREATE.insertDb(source.someModelObject)
    // insertShallow SimpleEntityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleEntityTable.insert {
      FillerSimpleEntityTable.fillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    CrudSimpleSubentityTableCREATE.batchInsertDb(source.subentitys ?: emptyList(),
        (source.subentitys ?: emptyList()).associate { it.uuid to source.uuid } /* , otherBackref1,
        otherBackref2, ... */)
  }

  public fun batchInsertDb(sources: Collection<SimpleEntityDto>,
      customStatements: BatchInsertStatement.(SimpleEntityDto) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    val simpleEntityTableToSomeModelObject = sources.associateWith {
      source -> source.someModelObject
    }
    CrudSimpleSomeModelTableCREATE.batchInsertDb(simpleEntityTableToSomeModelObject.values)
    // batchInsertShallow SimpleEntityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      FillerSimpleEntityTable.batchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      this[SimpleEntityTable.someModelObjectUuid] = simpleEntityTableToSomeModelObject[it]!!.uuid
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    CrudSimpleSubentityTableCREATE.batchInsertDb(sources.flatMap { it.subentitys ?: emptyList() },
        sources.flatMap { source -> source.subentitys!!.map { it.uuid to source.uuid } }.toMap())
  }

  public fun somePrefixInsertDb(source: SimpleEntityDto,
      customStatements: SimpleEntityTable.(InsertStatement<Number>) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    CrudSimpleSomeModelTableCREATE.somePrefixInsertDb(source.someModelObject)
    // insertShallow SimpleEntityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleEntityTable.insert {
      FillerSimpleEntityTable.somePrefixFillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // MODEL copyBoundry IGNORE propName subentitys
  }

  public fun somePrefixBatchInsertDb(sources: Collection<SimpleEntityDto>,
      customStatements: BatchInsertStatement.(SimpleEntityDto) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    val simpleEntityTableToSomeModelObject = sources.associateWith {
      source -> source.someModelObject
    }
    CrudSimpleSomeModelTableCREATE.somePrefixBatchInsertDb(simpleEntityTableToSomeModelObject.values)
    // batchInsertShallow SimpleEntityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      FillerSimpleEntityTable.somePrefixBatchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      this[SimpleEntityTable.someModelObjectUuid] = simpleEntityTableToSomeModelObject[it]!!.uuid
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // MODEL copyBoundry IGNORE propName subentitys
  }

  public fun withoutModelsInsertDb(source: SimpleEntityDto,
      customStatements: SimpleEntityTable.(InsertStatement<Number>) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    CrudSimpleSomeModelTableCREATE.withoutModelsInsertDb(source.someModelObject)
    // insertShallow SimpleEntityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleEntityTable.insert {
      FillerSimpleEntityTable.withoutModelsFillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      it[SimpleEntityTable.someModelObjectUuid] = source.someModelObject.uuid
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // MODEL copyBoundry IGNORE propName subentitys
  }

  public fun withoutModelsBatchInsertDb(sources: Collection<SimpleEntityDto>,
      customStatements: BatchInsertStatement.(SimpleEntityDto) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    val simpleEntityTableToSomeModelObject = sources.associateWith {
      source -> source.someModelObject
    }
    CrudSimpleSomeModelTableCREATE.withoutModelsBatchInsertDb(simpleEntityTableToSomeModelObject.values)
    // batchInsertShallow SimpleEntityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      FillerSimpleEntityTable.withoutModelsBatchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      this[SimpleEntityTable.someModelObjectUuid] = simpleEntityTableToSomeModelObject[it]!!.uuid
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // MODEL copyBoundry IGNORE propName subentitys
  }
}
