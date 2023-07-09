package com.hoffi.generated.universe

import kotlin.Any
import kotlin.reflect.KClass

public annotation class TABLEsDTO(
  public val thisTable: KClass<out Any>,
  public val targetDto: KClass<out Any>,
)

public annotation class DTOsTABLE(
  public val thisDto: KClass<out Any>,
  public val targetTable: KClass<out Any>,
)

public annotation class TABLEMETADATA
