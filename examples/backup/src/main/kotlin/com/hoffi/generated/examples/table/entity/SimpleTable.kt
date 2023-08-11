package com.hoffi.generated.examples.table.entity

import com.hoffi.generated.examples.dto.entity.ISimpleDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.Table

/**
 * table model: 
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  SimpleTable::class,
  targetDto = ISimpleDto::class,
)
public object SimpleTable : Table("simple"), WasGenerated
