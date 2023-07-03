package com.hoffi.generated.examples.entity.dto

import com.hoffi.generated.examples.dto.persistent.dto.PersistentOptimisticPersistentDtoRunDto
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.Dummy
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.MutableSet
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

public class SimpleEntityDtoRunDto(
  public var dtoSpecificProp: String,
  public var name: String,
  public var `value`: String = DEFAULT_STRING,
  public val subentitys: MutableSet<SimpleSubentityDtoRunDto> = mutableSetOf(),
  public val listOfStrings: List<String>,
) : PersistentOptimisticPersistentDtoRunDto(), SimpleDtoRunDto {
  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var someObject: Dummy = Dummy.NULL
}
