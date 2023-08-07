package com.hoffi.generated.examples.table.entity.sql

import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
import com.hoffi.generated.examples.table.entity.filler.FillerSimpleSubentityTable
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.insert
import java.util.*

/**
 * CRUD READ for table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object CrudSimpleSubentityTableCREATE : WasGenerated {
    public fun insert(sourceSimpleSubentityDto: SimpleSubentityDto, simpleEntityDtoUuidForSubentity: UUID) {
        SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertLambda(sourceSimpleSubentityDto, simpleEntityDtoUuidForSubentity))
    }
    // only if one2many of SimpleEntityDto is optional/nullable
    public fun shallowInsert(sourceSimpleSubentityDto: SimpleSubentityDto) {
        SimpleSubentityTable.insert(FillerSimpleSubentityTable.insertShallowLambda(sourceSimpleSubentityDto))
    }
}
