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
    /* we'd also need all backref Instances of manyTo1 instances of our manyTo1 instances */
    public fun insert(source: SimpleEntityDto
        //, simpleOtherSomeNullableBackref: SimpleWhateverDto? = null
    ) {
        // shallow insert SimpleEntityDto with 1To1's and our outgoing 1To1 FKs
        val insertShallowWith1To1s: SimpleEntityTable.(InsertStatement<Number>) -> Unit = {
            FillerSimpleEntityTable.insertShallowWith1To1sLambda(source).invoke(this, it)
            // TODO add some callback to put further things source
            // e.g. it[SimpleEntityTable.someOtherModelUuid] = outside.someOtherModel.uuid
        }
        SimpleEntityTable.insert(insertShallowWith1To1s)

        // insert ManyTo1 Instances
        CrudSimpleSubentityTableCREATE.batchInsert(source.subentitys ?: emptyList(), source) /* , otherBackref1, otherBackref2) */
    }

    public fun batchInsert(sources: Collection<SimpleEntityDto>
        //, simpleOtherSomeNullableBackref: SimpleWhateverDto? = null
    ) {
        val insertShallowManyTo1WithBackReferences: BatchInsertStatement.(SimpleEntityDto) -> Unit = {
            FillerSimpleEntityTable.batchInsertShallowWith1To1sLambda().invoke(this, it)
            // if so: this[SimpleOtherManyTo1Table.simpleOtherManyTo1PropertyUuid] = simpleOtherManyTo1PropertyUuid.uuid
            // TODO add some callback to put further things in ManyTo1 instances
            // e.g. this[SimpleSubentityTable.subEntityDtoSpecificProp] = outside.subEntityDtoSpecificProp
        }
        SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false,
            body = insertShallowManyTo1WithBackReferences
        )

        // insert ManyTo1 Instances
        for (entityDtoBackref in sources) {
            CrudSimpleSubentityTableCREATE.batchInsert(entityDtoBackref.subentitys ?: emptyList(), entityDtoBackref)
            //CrudSimpleOtherModelTableCREATE.batchInsert(entityDtoBackref.otherModels, entityDtoBackref)
        }
    }

    // only if 1ToMany of SimpleEntityDto is optional/nullable or 1to1 instances already exist
    public fun shallowInsert(source: SimpleEntityDto) {
        SimpleEntityTable.insert(FillerSimpleEntityTable.insertShallowWith1To1sLambda(source))
        val i = 42
    }
}
