package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import java.util.UUID
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement

/**
 * CRUD CREATE for table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSubentityTableCREATE : WasGenerated {
  public fun insertDb(
    source: SimpleSubentityDto,
    subentitysSimpleEntity: SimpleEntityDto,
    customStatements: SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {},
  ) {
    // insert 1To1 Models
    // NONE
    // insertShallow SimpleSubentityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSubentityTable.insert {
      FillerSimpleSubentityTable.fillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      it[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // NONE
  }

  public fun batchInsertDb(
    sources: Collection<SimpleSubentityDto>,
    subentitysUuidToParentUuid: Map<UUID, UUID>,
    customStatements: BatchInsertStatement.(SimpleSubentityDto) -> Unit = {},
  ) {
    // insert 1To1 Models
    // NONE
    // batchInsertShallow SimpleSubentityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      FillerSimpleSubentityTable.batchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      this[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysUuidToParentUuid[it.uuid]!!
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // NONE
  }

  public fun somePrefixInsertDb(
    source: SimpleSubentityDto,
    subentitysSimpleEntity: SimpleEntityDto,
    customStatements: SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {},
  ) {
    // insert 1To1 Models
    // NONE
    // insertShallow SimpleSubentityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSubentityTable.insert {
      FillerSimpleSubentityTable.somePrefixFillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      it[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // NONE
  }

  public fun somePrefixBatchInsertDb(
    sources: Collection<SimpleSubentityDto>,
    subentitysUuidToParentUuid: Map<UUID, UUID>,
    customStatements: BatchInsertStatement.(SimpleSubentityDto) -> Unit = {},
  ) {
    // insert 1To1 Models
    // NONE
    // batchInsertShallow SimpleSubentityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      FillerSimpleSubentityTable.somePrefixBatchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      this[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysUuidToParentUuid[it.uuid]!!
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // NONE
  }

  public fun withoutModelsInsertDb(
    source: SimpleSubentityDto,
    subentitysSimpleEntity: SimpleEntityDto,
    customStatements: SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {},
  ) {
    // insert 1To1 Models
    // NONE
    // insertShallow SimpleSubentityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSubentityTable.insert {
      FillerSimpleSubentityTable.withoutModelsFillShallowLambda(source).invoke(this, it)
      // outgoing FK uuid refs
      it[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    // NONE
  }

  public fun withoutModelsBatchInsertDb(
    sources: Collection<SimpleSubentityDto>,
    subentitysUuidToParentUuid: Map<UUID, UUID>,
    customStatements: BatchInsertStatement.(SimpleSubentityDto) -> Unit = {},
  ) {
    // insert 1To1 Models
    // NONE
    // batchInsertShallow SimpleSubentityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      FillerSimpleSubentityTable.withoutModelsBatchFillShallowLambda().invoke(this, it)
      // outgoing FK uuid refs
      this[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysUuidToParentUuid[it.uuid]!!
      customStatements(it)
    }
    // batchInsert ManyTo1 Instances
    // NONE
  }
}
