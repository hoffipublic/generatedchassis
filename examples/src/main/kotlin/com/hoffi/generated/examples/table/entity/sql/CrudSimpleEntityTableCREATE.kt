package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
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
      // foreach Many2One backwardRef
      // NONE
      // customStatements
      customStatements.invoke(this, it)
    }
    // insert ManyTo1 Instances
    CrudSimpleSubentityTableCREATE.batchInsertDb(source.subentitys ?: emptyList(),
        (source.subentitys ?: emptyList()).associate { it.uuid to source.uuid }) /* ,
        otherBackref1, otherBackref2) */
    // not yet implemented listOfStrings LIST of String
  }

  public fun batchInsertDb(sources: Collection<SimpleEntityDto>,
      customStatements: BatchInsertStatement.(SimpleEntityDto) -> Unit = {}) {
    // NONE
    // insert 1To1 Models
    CrudSimpleSomeModelTableCREATE.batchInsertDb(sources.map { it.someModelObject })
    // batchInsertShallow SimpleEntityTable and add outgoing ManyTo1-backrefUuids and 1To1-forwardRefUuids
    SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues =
        false) {
      FillerSimpleEntityTable.batchFillShallowLambda().invoke(this, it)
      this[SimpleEntityTable.someModelObjectUuid] = it.someModelObject.uuid
      customStatements(it)
    }
    // batch insert Many2Ones
    //for (source in sources) {
      CrudSimpleSubentityTableCREATE.batchInsertDb(sources.flatMap {it.subentitys ?: emptyList() },
          sources.flatMap { source -> (source.subentitys ?: emptyList()).map { it.uuid to source.uuid } }.toMap())
/* , otherBackref1, otherBackref2) */
    //}
    // not yet implemented listOfStrings LIST of String
  }
}
