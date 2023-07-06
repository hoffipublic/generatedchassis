package com.hoffi.generated.examples.entity.dto

import com.hoffi.generated.examples.dto.persistent.dto.PersistentBasePersistentDtoRunDto
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.WasGenerated
import kotlin.Int
import kotlin.String
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

/**
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public class SimpleSubentityDtoRunDto(
  public var subEntityDtoSpecificProp: String,
  public var name: String,
  public var `value`: String,
) : PersistentBasePersistentDtoRunDto(), WasGenerated {
  public var entityBackreference: SimpleEntityDtoRunDto = SimpleEntityDtoRunDto.NULL

  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME
}
