package com.hoffi.generated.examples.table.persistent.table

import com.hoffi.generated.examples.dto.persistent.dto.IIPersistentPersistentDtoRunDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.WasGenerated
import org.jetbrains.exposed.sql.Table

/**
 * table model: IPersistent
 * with dslRef: disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:IPersistent|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  IPersistentPersistentTableRunTable::class,
  targetDto = IIPersistentPersistentDtoRunDto::class,
)
public object IPersistentPersistentTableRunTable : Table("ipersistent"), WasGenerated
