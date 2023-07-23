package com.hoffi.generated.examples.table.persistent

import com.hoffi.generated.examples.dto.persistent.IPersistentfcDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.Table

/**
 * table model: fc
 * with dslRef: disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:fc|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  PersistentfcTable::class,
  targetDto = IPersistentfcDto::class,
)
public object PersistentfcTable : Table("fc"), WasGenerated
