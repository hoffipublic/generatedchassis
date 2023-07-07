package com.hoffi.generated.examples.entity.table

import com.hoffi.generated.examples.entity.dto.ISimpleDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleEntityDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleSubentityDtoRunDto
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_LONG
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.Dummy
import com.hoffi.generated.universe.TABLE
import com.hoffi.generated.universe.UuidTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.collections.MutableSet
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

/**
 * table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLE(SimpleEntityDtoRunDto::class)
public object SimpleEntityDtoRunTable : UuidTable("entity"), WasGenerated, ISimpleDtoRunDto {
  public var name: String = DEFAULT_STRING

  public var `value`: String = DEFAULT_STRING

  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var someObject: Dummy = Dummy.NULL

  public var someModelObject: SimpleSubentityDtoRunDto = SimpleSubentityDtoRunDto.NULL

  public val subentitys: MutableSet<SimpleSubentityDtoRunDto>? = mutableSetOf()

  public val listOfStrings: List<String> = listOf()

  public var dtoSpecificProp: String = DEFAULT_STRING

  public var optimisticLockId: Long = DEFAULT_LONG

  public var created: Boolean = false

  public var modified: Boolean = false

  public var deleted: Boolean = false

  public var createdAt: LocalDateTime = DEFAULT_LOCALDATETIME

  public var updatedAt: LocalDateTime = DEFAULT_LOCALDATETIME

  public var createUser: String = DEFAULT_STRING

  public var updateUser: String = DEFAULT_STRING
}
