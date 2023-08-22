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
 * CRUD CREATE for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSomeModelTableCREATE : WasGenerated {
    public fun insert(source: SimpleSomeModelDto) { //, simpleEntityDtoBackref: SimpleEntityDto) {
        val insertShallowWith1To1s: SimpleSomeModelTable.(InsertStatement<Number>) -> Unit = {
            FillerSimpleSomeModelTable.insertShallowWith1To1sLambda(source).invoke(this, it)
            // maybe further: it[SimpleSubentityTable.one2oneTypePropertyUuid] = one2oneTypeProperty.uuid
            // TODO add some callback to put further things source
            // e.g. it[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
        }
        SimpleSomeModelTable.insert(insertShallowWith1To1s)

        // insert ManyTo1 Instances
        // NONE
    }

    public fun batchInsert(sources: Collection<SimpleSomeModelDto>
        //, simpleOtherSomeNullableBackref: SimpleWhateverDto? = null
    ) {
        val insertShallowManyTo1WithBackReferences: BatchInsertStatement.(SimpleSomeModelDto) -> Unit = {
            FillerSimpleSomeModelTable.batchInsertShallowWith1To1sLambda().invoke(this, it)
            // if so: this[SimpleOtherManyTo1Table.simpleOtherManyTo1PropertyUuid] = simpleOtherManyTo1PropertyUuid.uuid
            // TODO add some callback to put further things in ManyTo1 instances
            // e.g. this[SimpleSubentityTable.subEntityDtoSpecificProp] = outside.subEntityDtoSpecificProp
        }
        SimpleSomeModelTable.batchInsert(sources, shouldReturnGeneratedValues = false,
            body = insertShallowManyTo1WithBackReferences
        )
        // insert ManyTo1 Instances
        // NONE
    }
}
