package com.hoffi.generated.examples.dto.entity

import com.hoffi.generated.examples.dto.persistent.APersistentPersistentOptimisticDto
import com.hoffi.generated.examples.table.entity.SimpleEntityTable
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
  SimpleEntityDto::class,
  targetTable = SimpleEntityTable::class,
)
public class SimpleEntityDto protected constructor(
  public var name: String,
  public var `value`: String = DEFAULT_STRING,
  public val subentitys: MutableSet<SimpleSubentityDto>? = mutableSetOf(),
  public val listOfStrings: List<String>,
  public var dtoSpecificProp: String = DEFAULT_STRING/* some dto specific comment */,
) : APersistentPersistentOptimisticDto(), WasGenerated, ISimpleDto, IUuidDto {
  public var prio: Int = DEFAULT_INT/* some dto prio comment */

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var someObject: Dummy = Dummy.NULL

  public var someModelObject: SimpleSubentityDto = SimpleSubentityDto.NULL

  public override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is SimpleEntityDto) return false
    if (uuid != other.uuid) return false /* PRIMARY */
    return true
  }

  public override fun hashCode(): Int {
    var result = uuid.hashCode() /* PRIMARY */
    return result
  }

  override fun toString(): String =
      """SimpleEntityDto(uuid='$uuid', name='$name', value='$value', dtoSpecificProp='$dtoSpecificProp', createdAt='$createdAt')"""

  public companion object {
    public val NULL: SimpleEntityDto = SimpleEntityDto(NULL_STRING, NULL_STRING, mutableSetOf(),
        listOf(), NULL_STRING)

    @JvmStatic
    public fun _internal_create(): SimpleEntityDto = SimpleEntityDto(DEFAULT_STRING, DEFAULT_STRING,
        mutableSetOf(), listOf(), DEFAULT_STRING)

    @JvmStatic
    public fun _internal_createWithUuid(): SimpleEntityDto = _internal_create().apply { uuid =
        UUID.randomUUID() }

    @JvmStatic
    public fun createShallowWithNewEmptyModels(): SimpleEntityDto {
      val simpleEntityDto = _internal_createWithUuid()
      simpleEntityDto.someModelObject = SimpleSubentityDto._internal_createWithUuid()
      return simpleEntityDto
    }

    @JvmStatic
    public fun createDeepWithNewEmptyModels(): SimpleEntityDto {
      val simpleEntityDto = _internal_createWithUuid()
      /* beware of recursive calls, if Type or some submodel of it has a reference to this */
      simpleEntityDto.someModelObject = SimpleSubentityDto.createDeepWithNewEmptyModels()
      return simpleEntityDto
    }

    @JvmStatic
    public fun create(
      name: String,
      `value`: String = DEFAULT_STRING,
      subentitys: MutableSet<SimpleSubentityDto>? = mutableSetOf(),
      listOfStrings: List<String>,
      dtoSpecificProp: String = DEFAULT_STRING/* some dto specific comment */,
    ): SimpleEntityDto = SimpleEntityDto(name, value, subentitys, listOfStrings,
        dtoSpecificProp).apply { uuid = UUID.randomUUID() }
  }
}
