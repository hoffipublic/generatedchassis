package com.hoffi.generated.examples.dto.persistent.dto

import com.hoffi.generated.universe.Defaults.DEFAULT_LONG
import com.hoffi.generated.universe.WasGenerated
import kotlin.Long

/**
 * dto model: PersistentOptimistic
 * with dslRef:
 * disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:PersistentOptimistic|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public abstract class APersistentOptimisticPersistentDtoRunDto() :
    ATransientStatePersistentDtoRunDto(), WasGenerated {
  public var optimisticLockId: Long = DEFAULT_LONG
}
