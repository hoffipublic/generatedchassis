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

/**
 * CRUD CREATE for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSubentityTableCREATE : WasGenerated {
    public fun insert(source: SimpleSubentityDto,
                      simpleEntitySubentitysBackref: SimpleEntityDto
        //, simpleOtherSomeNullableBackref: SimpleWhateverDto? = null
    ) {
        val insertShallowWith1To1s: SimpleSubentityTable.(InsertStatement<Number>) -> Unit = {
            FillerSimpleSubentityTable.insertShallowWith1To1sLambda(source).invoke(this, it)
            it[SimpleSubentityTable.simpleEntitySubentitysUuid] = simpleEntitySubentitysBackref.uuid
            // maybe further: it[SimpleSubentityTable.one2oneTypePropertyUuid] = one2oneTypeProperty.uuid
            // TODO add some callback to put further things source
            // e.g. it[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
        }
        SimpleSubentityTable.insert(insertShallowWith1To1s)

        // insert ManyTo1 Instances
        // NONE
    }

    public fun batchInsert(sources: Collection<SimpleSubentityDto>,
                           simpleEntitySubentitysBackref: SimpleEntityDto
                      //, simpleOtherSomeNullableBackref: SimpleWhateverDto? = null
    ) {
        val insertShallowManyTo1WithBackReferencesLambda: BatchInsertStatement.(SimpleSubentityDto) -> Unit = {
            FillerSimpleSubentityTable.batchInsertShallowWith1To1sLambda().invoke(this, it)
            this[SimpleSubentityTable.simpleEntitySubentitysUuid] = simpleEntitySubentitysBackref.uuid
            // TODO add some callback to put further things in ManyTo1 instances
            // e.g. this[SimpleSubentityTable.subEntityDtoSpecificProp] = outside.subEntityDtoSpecificProp
        }
        SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues = false,
            body = insertShallowManyTo1WithBackReferencesLambda
        )
        // insert ManyTo1 Instances
        // NONE
    }
}
