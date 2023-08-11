package com.hoffi.generated.examples.dto.entity

import com.hoffi.generated.examples.dto.persistent.APersistentBaseBaseDto
import com.hoffi.generated.examples.table.entity.SimpleSubentityTable
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
  SimpleSubentityDto::class,
  targetTable = SimpleSubentityTable::class,
)
public class SimpleSubentityDto(
  public var name: String,
  public var `value`: String,
  public var subEntityDtoSpecificProp: String,
) : APersistentBaseBaseDto(), WasGenerated, IUuidDto {
  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is SimpleSubentityDto) return false
    if (uuid != other.uuid) return false /* PRIMARY */
    return true
  }

  public override fun hashCode(): Int {
    var result = uuid.hashCode() /* PRIMARY */
    return result
  }

  override fun toString(): String =
      """SimpleSubentityDto(uuid='$uuid', name='$name', value='$value', prio='$prio')"""

  public companion object {
    public val NULL: SimpleSubentityDto = SimpleSubentityDto(NULL_STRING, NULL_STRING, NULL_STRING)

    @JvmStatic
    public fun _internal_create(): SimpleSubentityDto = SimpleSubentityDto(DEFAULT_STRING,
        DEFAULT_STRING, DEFAULT_STRING)

    @JvmStatic
    public fun _internal_createWithUuid(): SimpleSubentityDto = _internal_create().apply { uuid =
        UUID.randomUUID() }

    @JvmStatic
    public fun createShallowWithNewEmptyModels(): SimpleSubentityDto {
      val simpleSubentityDto = _internal_createWithUuid()
      return simpleSubentityDto
    }

    @JvmStatic
    public fun createDeepWithNewEmptyModels(): SimpleSubentityDto {
      val simpleSubentityDto = _internal_createWithUuid()
      return simpleSubentityDto
    }
  }
}
