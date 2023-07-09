package com.hoffi.generated.examples.dto.persistent.dto

import com.hoffi.generated.universe.IUuidDto
import com.hoffi.generated.universe.WasGenerated
import kotlin.Boolean

/**
 * dto model: TransientState
 * with dslRef: disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:TransientState|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public abstract class ATransientStatePersistentDtoRunDto() : APersistentBasePersistentDtoRunDto(),
    WasGenerated, IUuidDto {
  public var created: Boolean = false

  public var modified: Boolean = false

  public var deleted: Boolean = false
}
