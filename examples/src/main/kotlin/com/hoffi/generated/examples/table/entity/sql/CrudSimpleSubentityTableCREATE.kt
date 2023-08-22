package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
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
  public fun insertDb(source: SimpleSubentityDto, subentitysSimpleEntity: SimpleEntityDto) {
    // local lambda for shallow insert SimpleSubentityTable with 1To1's and SimpleSubentityTable's outgoing 1To1 FKs
    val insertShallowWith1To1sLambda: SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
      FillerSimpleSubentityTable.insertShallowWith1To1sLambda(source).invoke(this, it)
      it[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      // TODO add some callback to put further things source
      // e.g. it[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleSubentityTable.insert(insertShallowWith1To1sLambda)
    // insert ManyTo1 Instances
    // NONE
  }

  public fun batchInsertDb(sources: Collection<SimpleSubentityDto>,
      subentitysSimpleEntity: SimpleEntityDto) {
    // local lambda for shallow batchInsert SimpleSubentityTable with 1To1's and SimpleSubentityTable's outgoing 1To1 FKs
    val batchInsertShallowWith1To1sAndBackreferences:
        BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
      FillerSimpleSubentityTable.batchInsertShallowWith1To1sLambda().invoke(this, it)
      this[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      // TODO add some callback to put further things source
      // e.g. this[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues = false, body =
        batchInsertShallowWith1To1sAndBackreferences)
    // insert ManyTo1 Instances
    // NONE
  }

  public fun somePrefixInsertDb(source: SimpleSubentityDto,
      subentitysSimpleEntity: SimpleEntityDto) {
    // local lambda for shallow insert SimpleSubentityTable with 1To1's and SimpleSubentityTable's outgoing 1To1 FKs
    val somePrefixInsertShallowWith1To1sLambda:
        SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
      FillerSimpleSubentityTable.somePrefixInsertShallowWith1To1sLambda(source).invoke(this, it)
      it[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      // TODO add some callback to put further things source
      // e.g. it[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleSubentityTable.insert(somePrefixInsertShallowWith1To1sLambda)
    // insert ManyTo1 Instances
    // NONE
  }

  public fun somePrefixBatchInsertDb(sources: Collection<SimpleSubentityDto>,
      subentitysSimpleEntity: SimpleEntityDto) {
    // local lambda for shallow batchInsert SimpleSubentityTable with 1To1's and SimpleSubentityTable's outgoing 1To1 FKs
    val somePrefixBatchInsertShallowWith1To1sAndBackreferences:
        BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
      FillerSimpleSubentityTable.somePrefixBatchInsertShallowWith1To1sLambda().invoke(this, it)
      this[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      // TODO add some callback to put further things source
      // e.g. this[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues = false, body =
        somePrefixBatchInsertShallowWith1To1sAndBackreferences)
    // insert ManyTo1 Instances
    // NONE
  }
}
