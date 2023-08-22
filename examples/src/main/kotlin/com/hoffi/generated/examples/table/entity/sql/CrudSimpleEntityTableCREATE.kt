package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleEntityTable
import com.hoffi.generated.universe.WasGenerated
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
  public fun insertDb(source: SimpleEntityDto, customStatements: SimpleEntityTable.(InsertStatement<Number>) -> Unit = {}) {
    SimpleEntityTable.insert {
      FillerSimpleEntityTable.insertShallowWith1To1sLambda(source).invoke(this, it)
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    CrudSimpleSubentityTableCREATE.batchInsertDb(source.subentitys ?: emptyList(), source) /* ,
        otherBackref1, otherBackref2) */
    // not yet implemented listOfStrings LIST of String
  }

  public fun batchInsertDb(sources: Collection<SimpleEntityDto>, customStatements: BatchInsertStatement.(SimpleEntityDto) -> Unit = {}) {
    // one2One Models
    CrudSimpleSomeModelTableCREATE.batchInsert(sources.map { it.someModelObject })
    // batch insert
    SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
      this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid
      customStatements(it)
      FillerSimpleEntityTable.batchInsertShallowLambda().invoke(this, it)
    }
    // insert ManyTo1 Instances
    for (source in sources) {
      CrudSimpleSubentityTableCREATE.batchInsertDb(source.subentitys ?: emptyList(), source) /* ,
          otherBackref1, otherBackref2) */
    }
    // not yet implemented listOfStrings LIST of String
  }

  public fun simpleSomeModelDtoInsertDb(source: SimpleSomeModelDto) {
    // local lambda for shallow insert SimpleEntityTable with 1To1's and SimpleEntityTable's outgoing 1To1 FKs
    val simpleSomeModelDtoInsertShallowWith1To1sLambda:
        SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
      FillerSimpleEntityTable.simpleSomeModelDtoInsertShallowWith1To1sLambda(source).invoke(this,
          it)
      // TODO add some callback to put further things source
      // e.g. it[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleEntityTable.insert(simpleSomeModelDtoInsertShallowWith1To1sLambda)
    // insert ManyTo1 Instances
    // NONE
  }

  public fun simpleSomeModelDtoBatchInsertDb(sources: Collection<SimpleSomeModelDto>) {
    // local lambda for shallow batchInsert SimpleEntityTable with 1To1's and SimpleEntityTable's outgoing 1To1 FKs
    val simpleSomeModelDtoBatchInsertShallowWith1To1sAndBackreferences:
        BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
      FillerSimpleEntityTable.simpleSomeModelDtoBatchInsertShallowWith1To1sLambda().invoke(this, it)
      // TODO add some callback to put further things source
      // e.g. this[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false, body =
        simpleSomeModelDtoBatchInsertShallowWith1To1sAndBackreferences)
    // insert ManyTo1 Instances
    // NONE
  }

  public fun somePrefixInsertDb(source: SimpleEntityDto) {
    // local lambda for shallow insert SimpleEntityTable with 1To1's and SimpleEntityTable's outgoing 1To1 FKs
    val somePrefixInsertShallowWith1To1sLambda: SimpleEntityTable.(InsertStatement<Number>) -> Unit
        = {
      FillerSimpleEntityTable.somePrefixInsertShallowWith1To1sLambda(source).invoke(this, it)
      // TODO add some callback to put further things source
      // e.g. it[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleEntityTable.insert(somePrefixInsertShallowWith1To1sLambda)
    // insert ManyTo1 Instances
    CrudSimpleSubentityTableCREATE.batchInsertDb(source.subentitys ?: emptyList(), source) /* ,
        otherBackref1, otherBackref2) */
    // not yet implemented listOfStrings LIST of String
  }

  public fun somePrefixBatchInsertDb(sources: Collection<SimpleEntityDto>) {
    // local lambda for shallow batchInsert SimpleEntityTable with 1To1's and SimpleEntityTable's outgoing 1To1 FKs
    val somePrefixBatchInsertShallowWith1To1sAndBackreferences:
        BatchInsertStatement.(SimpleEntityDto) -> Unit = {
      FillerSimpleEntityTable.somePrefixBatchInsertShallowWith1To1sLambda().invoke(this, it)
      // TODO add some callback to put further things source
      // e.g. this[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
    }
    SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false, body =
        somePrefixBatchInsertShallowWith1To1sAndBackreferences)
    // insert ManyTo1 Instances
    for (source in sources) {
      CrudSimpleSubentityTableCREATE.batchInsertDb(source.subentitys ?: emptyList(), source) /* ,
          otherBackref1, otherBackref2) */
    }
    // not yet implemented listOfStrings LIST of String
  }
}
