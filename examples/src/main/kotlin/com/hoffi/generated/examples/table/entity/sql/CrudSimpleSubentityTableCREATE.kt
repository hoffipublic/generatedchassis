package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.BatchInsertStatement
import org.jetbrains.exposed.sql.statements.InsertStatement
import java.util.*

/**
 * CRUD CREATE for table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSubentityTableCREATE : WasGenerated {
  public fun insertDb(source: SimpleSubentityDto, subentitysSimpleEntity: SimpleEntityDto, customStatements: SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {}) {
    // insert SimpleSubentityTable with 1To1's
    // NONE
    // insert SimpleSubentityTable and 1To1 forwardRefs
    SimpleSubentityTable.insert {
      FillerSimpleSubentityTable.fillShallowLambda(source).invoke(this, it)
      // foreach 1To1 forwardRef
      // None
      // foreach Many2One backwardRef
      it[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysSimpleEntity.uuid
      // customStatements
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
    // batch insert SimpleSubentityDtos with 1To1 forwardRefs
    SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues =
        false) {
      FillerSimpleSubentityTable.batchFillShallowLambda().invoke(this, it)
      this[SimpleSubentityTable.simpleEntitySubentitysUuid] = subentitysUuidToParentUuid[it.uuid]!!
      customStatements(it)
    }
    // batch insert Many2Ones
    // NONE
  }
}
