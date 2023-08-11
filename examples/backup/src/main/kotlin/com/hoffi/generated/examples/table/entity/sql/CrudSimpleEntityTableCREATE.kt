package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleEntityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert

/**
 * CRUD CREATE for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleEntityTableCREATE : WasGenerated {
    public fun insert(source: SimpleEntityDto) {
        SimpleEntityTable.insert(FillerSimpleEntityTable.insertWithout2ManysLambda(source))
        SimpleSubentityTable.batchInsert(source.subentitys ?: emptyList(), shouldReturnGeneratedValues = false,
            body = FillerSimpleSubentityTable.batchInsertWithout2ManysLambda(source)
        )
    }

    public fun batchInsert(sources: Collection<SimpleEntityDto>) {
        SimpleEntityTable.batchInsert(sources, shouldReturnGeneratedValues = false,
            body = FillerSimpleEntityTable.batchInsertWithout2ManysLambda()
        )
        for (source in sources) {
            SimpleSubentityTable.batchInsert(source.subentitys ?: emptyList(), shouldReturnGeneratedValues = false,
                body = FillerSimpleSubentityTable.batchInsertWithout2ManysLambda(source)
            )
        }
    }

    // only if one2many of SimpleEntityDto is optional/nullable
    public fun shallowInsert(source: SimpleEntityDto) {
        SimpleEntityTable.insert(FillerSimpleEntityTable.insertWithout2ManysLambda(source))
        val i = 42
    }
}
