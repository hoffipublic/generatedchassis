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
      // insert SimpleomeModelSTable with 1To1's
      // NONE
      // insert SimpleSomeModelTable and 1To1 forwardRefs
      SimpleSomeModelTable.insert {
          FillerSimpleSomeModelTable.fillShallowLambda(source).invoke(this, it)
          // foreach 1To1 forwardRef
          // None
          // foreach Many2One backwardRef
          // NONE
          // customStatements
          customStatements.invoke(this, it)
      }
      // insert ManyTo1 Instances
      // NONE
  }

    public fun batchInsertDbForOne(
        sources: Collection<SimpleSomeModelDto>,
        customStatements: BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {},
    ) {
        // insert 1To1 Models
        // NONE
        // batch insert SimpleSomeModelDtos with 1To1 forwardRefs
        SimpleSomeModelTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
            FillerSimpleSomeModelTable.batchFillShallowLambda().invoke(this, it)
            customStatements(it)
        }
        // batch insert Many2Ones
        // NONE
    }
    public fun batchInsertDb(
        sources: Collection<SimpleSomeModelDto>,
        customStatements: BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {},
    ) {
        // insert 1To1 Models
        // NONE
        // batch insert SimpleSomeModelDtos with 1To1 forwardRefs
        SimpleSomeModelTable.batchInsert(sources, shouldReturnGeneratedValues = false) {
            FillerSimpleSomeModelTable.batchFillShallowLambda().invoke(this, it)
            customStatements(it)
        }
        // batch insert Many2Ones
        // NONE
    }
}
