package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleEntityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.insert

/**
 * CRUD CREATE for table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleEntityTableCREATE : WasGenerated {
    public fun insert(simpleEntityDto: SimpleEntityDto) {
        SimpleEntityTable.insert(FillerSimpleEntityTable.insertLambda(simpleEntityDto))
    }
    public fun shallowInsert(simpleEntityDto: SimpleEntityDto) {
        SimpleEntityTable.insert(FillerSimpleEntityTable.insertShallowLambda(simpleEntityDto))
    }
}
