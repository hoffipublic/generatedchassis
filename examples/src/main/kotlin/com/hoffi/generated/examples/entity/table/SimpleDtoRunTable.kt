package com.hoffi.generated.examples.entity.table

import com.hoffi.generated.examples.entity.dto.ISimpleDtoRunDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.Table

/**
 * table model: 
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  SimpleDtoRunTable::class,
  targetDto = ISimpleDtoRunDto::class,
)
public object SimpleDtoRunTable : Table(""), WasGenerated
