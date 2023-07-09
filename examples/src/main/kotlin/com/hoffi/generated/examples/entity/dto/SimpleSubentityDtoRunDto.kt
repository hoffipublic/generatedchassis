package com.hoffi.generated.examples.entity.dto

import com.hoffi.generated.examples.dto.persistent.dto.APersistentBasePersistentDtoRunDto
import com.hoffi.generated.examples.entity.table.SimpleSubentityDtoRunTable
import com.hoffi.generated.universe.DTOsTABLE
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.WasGenerated
import kotlin.Int
import kotlin.String
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

/**
 * dto model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@DTOsTABLE(
  SimpleSubentityDtoRunDto::class,
  targetTable = SimpleSubentityDtoRunTable::class,
)
public class SimpleSubentityDtoRunDto(
  public var name: String,
  public var `value`: String,
  public var subEntityDtoSpecificProp: String,
) : APersistentBasePersistentDtoRunDto(), WasGenerated {
  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var entityBackreference: SimpleEntityDtoRunDto = SimpleEntityDtoRunDto.NULL

  private constructor() : this(DEFAULT_STRING, DEFAULT_STRING, DEFAULT_STRING)

  public companion object {
    public val NULL: SimpleSubentityDtoRunDto = SimpleSubentityDtoRunDto()
  }
}
