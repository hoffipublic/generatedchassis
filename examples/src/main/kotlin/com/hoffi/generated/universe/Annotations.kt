package com.hoffi.generated.universe

import kotlin.Any
import kotlin.reflect.KClass

public annotation class DTO(
  public val targetClass: KClass<out Any>,
)

public annotation class TABLE(
  public val targetClass: KClass<out Any>,
)

public annotation class TABLEMETADATA
