package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.batchInsert
import org.jetbrains.exposed.sql.insert

/**
 * CRUD CREATE for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSubentityTableCREATE : WasGenerated {
    public fun insert(source: SimpleSubentityDto, simpleEntityDtoBackref: SimpleEntityDto) {
        SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertWithout2ManysLambda(source, simpleEntityDtoBackref))
        // only if subEntity has 1toN props

    }
    // will break if non nullable FKs
    public fun batchInsertShallow(sources: Collection<SimpleSubentityDto>) {
        SimpleSubentityTable.batchInsert(sources, shouldReturnGeneratedValues = false,
            body = FillerSimpleSubentityTable.batchInsertWithout2ManysAndOutgoingFKsLambda()
        )
    }
    // only if one2many of SimpleEntityDto is optional/nullable
    public fun shallowInsert(source: SimpleSubentityDto, simpleEntityDtoBackref: SimpleEntityDto) {
        SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertWithout2ManysLambda(source, simpleEntityDtoBackref))
        val i = 42
    }
}
