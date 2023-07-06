package com.hoffi.generated.examples.dto.persistent.dto

import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.WasGenerated
import kotlin.Long

/**
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public abstract class PersistentOptimisticPersistentDtoRunDto() :
    TransientStatePersistentDtoRunDto(), WasGenerated {
  public var optimisticLockId: Long = DEFAULT_LOCALDATETIME
}
