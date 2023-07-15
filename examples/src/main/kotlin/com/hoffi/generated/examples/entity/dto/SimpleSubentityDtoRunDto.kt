package com.hoffi.generated.examples.entity.dto

import com.hoffi.generated.examples.dto.persistent.dto.APersistentBasePersistentDtoRunDto
import com.hoffi.generated.examples.entity.table.SimpleSubentityDtoRunTable
import com.hoffi.generated.universe.DTOsTABLE
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.Defaults.NULL_STRING
import com.hoffi.generated.universe.IUuidDto
import com.hoffi.generated.universe.WasGenerated
import java.util.UUID
import java.util.UUID.randomUUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic
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
) : APersistentBasePersistentDtoRunDto(), WasGenerated, IUuidDto {
  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var entityBackreference: SimpleEntityDtoRunDto = SimpleEntityDtoRunDto.NULL

  public override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is SimpleSubentityDtoRunDto) return false
    if (uuid != other.uuid) return false /* PRIMARY */
    return true
  }

  public override fun hashCode(): Int {
    var result = uuid.hashCode() /* PRIMARY */
    return result
  }

  override fun toString(): String =
      """SimpleSubentityDtoRunDto(name='$name', value='$value', prio='$prio', uuid='$uuid')"""

  public companion object {
    public val NULL: SimpleSubentityDtoRunDto = SimpleSubentityDtoRunDto(NULL_STRING, NULL_STRING,
        NULL_STRING)

    @JvmStatic
    public fun _internal_create(): SimpleSubentityDtoRunDto =
        SimpleSubentityDtoRunDto(DEFAULT_STRING, DEFAULT_STRING, DEFAULT_STRING)

    @JvmStatic
    public fun _internal_createWithUuid(): SimpleSubentityDtoRunDto = _internal_create().apply {
        uuid = UUID.randomUUID() }

    @JvmStatic
    public fun createShallowWithNewEmptyModels(): SimpleSubentityDtoRunDto {
      val simpleSubentityDtoRunDto = _internal_createWithUuid()
      simpleSubentityDtoRunDto.entityBackreference =
          SimpleEntityDtoRunDto._internal_createWithUuid()
      return simpleSubentityDtoRunDto
    }

    @JvmStatic
    public fun createDeepWithNewEmptyModels(): SimpleSubentityDtoRunDto {
      val simpleSubentityDtoRunDto = _internal_createWithUuid()
      /* beware of recursive calls, if Type or some submodel of it has a reference to this */
      simpleSubentityDtoRunDto.entityBackreference =
          SimpleEntityDtoRunDto.createDeepWithNewEmptyModels()
      return simpleSubentityDtoRunDto
    }
  }
}
