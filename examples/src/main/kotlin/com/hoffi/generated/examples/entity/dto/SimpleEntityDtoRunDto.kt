package com.hoffi.generated.examples.entity.dto

import com.hoffi.generated.examples.dto.persistent.dto.APersistentOptimisticPersistentDtoRunDto
import com.hoffi.generated.examples.entity.table.SimpleEntityDtoRunTable
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.Dummy
import com.hoffi.generated.universe.TABLE
import com.hoffi.generated.universe.WasGenerated
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.MutableSet
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

/**
 * dto model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLE(SimpleEntityDtoRunTable::class)
public class SimpleEntityDtoRunDto(
  public var name: String,
  public var `value`: String = DEFAULT_STRING,
  public val subentitys: MutableSet<SimpleSubentityDtoRunDto>? = mutableSetOf(),
  public val listOfStrings: List<String>,
  public var dtoSpecificProp: String = DEFAULT_STRING/* some dto specific comment */,
) : APersistentOptimisticPersistentDtoRunDto(), WasGenerated, ISimpleDtoRunDto {
  public var prio: Int = DEFAULT_INT/* some dto prio comment */

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var someObject: Dummy = Dummy.NULL

  public var someModelObject: SimpleSubentityDtoRunDto = SimpleSubentityDtoRunDto.NULL
}
