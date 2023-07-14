package com.hoffi.generated.examples.entity.dto

import com.hoffi.generated.examples.dto.persistent.dto.APersistentOptimisticPersistentDtoRunDto
import com.hoffi.generated.examples.entity.table.SimpleEntityDtoRunTable
import com.hoffi.generated.universe.DTOsTABLE
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.Defaults.NULL_STRING
import com.hoffi.generated.universe.Dummy
import com.hoffi.generated.universe.IUuidDto
import com.hoffi.generated.universe.WasGenerated
import java.util.UUID
import java.util.UUID.randomUUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.MutableSet
import kotlin.jvm.JvmStatic
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

/**
 * dto model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@DTOsTABLE(
  SimpleEntityDtoRunDto::class,
  targetTable = SimpleEntityDtoRunTable::class,
)
public class SimpleEntityDtoRunDto protected constructor(
  public var name: String,
  public var `value`: String = DEFAULT_STRING,
  public val subentitys: MutableSet<SimpleSubentityDtoRunDto>? = mutableSetOf(),
  public val listOfStrings: List<String>,
  public var dtoSpecificProp: String = DEFAULT_STRING/* some dto specific comment */,
) : APersistentOptimisticPersistentDtoRunDto(), WasGenerated, ISimpleDtoRunDto, IUuidDto {
  public var prio: Int = DEFAULT_INT/* some dto prio comment */

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var someObject: Dummy = Dummy.NULL

  public var someModelObject: SimpleSubentityDtoRunDto = SimpleSubentityDtoRunDto.NULL

  public override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is SimpleEntityDtoRunDto) return false
    if (uuid != other.uuid) return false /* PRIMARY */
    return true
  }

  public override fun hashCode(): Int {
    var result = uuid.hashCode() /* PRIMARY */
    return result
  }

  override fun toString(): String =
      """SimpleEntityDtoRunDto(name='$name', value='$value', prio='$prio', uuid='$uuid')"""

  public companion object {
    public val NULL: SimpleEntityDtoRunDto = SimpleEntityDtoRunDto(NULL_STRING, NULL_STRING,
        mutableSetOf(), listOf(), NULL_STRING)

    @JvmStatic
    public fun _internal_create(): SimpleEntityDtoRunDto = SimpleEntityDtoRunDto(DEFAULT_STRING,
        DEFAULT_STRING, mutableSetOf(), listOf(), DEFAULT_STRING)

    @JvmStatic
    public fun _internal_createWithUuid(): SimpleEntityDtoRunDto = _internal_create().apply { uuid =
        UUID.randomUUID() }

    @JvmStatic
    public fun createShallowWithNewEmptyModels(): SimpleEntityDtoRunDto {
      val simpleEntityDtoRunDto = _internal_createWithUuid()
      simpleEntityDtoRunDto.someModelObject = SimpleSubentityDtoRunDto._internal_createWithUuid()
      return simpleEntityDtoRunDto
    }

    @JvmStatic
    public fun createDeepWithNewEmptyModels(): SimpleEntityDtoRunDto {
      val simpleEntityDtoRunDto = _internal_createWithUuid()
      simpleEntityDtoRunDto.someModelObject =
          SimpleSubentityDtoRunDto.createDeepWithNewEmptyModels()
      return simpleEntityDtoRunDto
    }

    @JvmStatic
    public fun create(
      name: String,
      `value`: String = DEFAULT_STRING,
      subentitys: MutableSet<SimpleSubentityDtoRunDto>? = mutableSetOf(),
      listOfStrings: List<String>,
      dtoSpecificProp: String = DEFAULT_STRING/* some dto specific comment */,
    ): SimpleEntityDtoRunDto = SimpleEntityDtoRunDto(name, value, subentitys, listOfStrings,
        dtoSpecificProp).apply { uuid = UUID.randomUUID() }
  }
}
