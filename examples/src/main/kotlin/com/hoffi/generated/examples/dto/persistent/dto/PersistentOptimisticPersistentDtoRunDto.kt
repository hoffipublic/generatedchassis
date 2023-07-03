package com.hoffi.generated.examples.dto.persistent.dto

import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import kotlin.Long

public abstract class PersistentOptimisticPersistentDtoRunDto() :
    TransientStatePersistentDtoRunDto() {
  public var optimisticLockId: Long = DEFAULT_LOCALDATETIME
}
