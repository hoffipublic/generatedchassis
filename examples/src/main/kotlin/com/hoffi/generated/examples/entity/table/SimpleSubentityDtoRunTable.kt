package com.hoffi.generated.examples.entity.table

import com.hoffi.generated.examples.entity.dto.SimpleEntityDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleSubentityDtoRunDto
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.TABLE
import com.hoffi.generated.universe.UuidTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Int
import kotlin.String
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

/**
 * table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLE(SimpleSubentityDtoRunDto::class)
public object SimpleSubentityDtoRunTable : UuidTable("subentity"), WasGenerated {
  public var name: String = DEFAULT_STRING

  public var `value`: String = DEFAULT_STRING

  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var subEntityDtoSpecificProp: String = DEFAULT_STRING

  public var entityBackreference: SimpleEntityDtoRunDto = SimpleEntityDtoRunDto.NULL

  public var createdAt: LocalDateTime = DEFAULT_LOCALDATETIME

  public var updatedAt: LocalDateTime = DEFAULT_LOCALDATETIME

  public var createUser: String = DEFAULT_STRING

  public var updateUser: String = DEFAULT_STRING
}
