package com.hoffi.generated.examples.dto.entity

import com.hoffi.generated.examples.dto.persistent.APersistentPersistentOptimisticDto
import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.universe.DTOsTABLE
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

/**
 * dto model: SomeModel
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeModel|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@DTOsTABLE(
  SimpleSomeModelDto::class,
  targetTable = SimpleSomeModelTable::class,
)
public class SimpleSomeModelDto protected constructor(
  public var someName: String,
  public var someValue: String,
) : APersistentPersistentOptimisticDto(), WasGenerated, IUuidDto {
  public override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is SimpleSomeModelDto) return false
    if (uuid != other.uuid) return false /* PRIMARY */
    return true
  }

  public override fun hashCode(): Int {
    var result = uuid.hashCode() /* PRIMARY */
    return result
  }

  override fun toString(): String =
      """SimpleSomeModelDto(uuid='$uuid', someName='$someName', someValue='$someValue')"""

  public companion object {
    public val NULL: SimpleSomeModelDto = SimpleSomeModelDto(NULL_STRING, NULL_STRING)

    @JvmStatic
    public fun _internal_create(): SimpleSomeModelDto = SimpleSomeModelDto(DEFAULT_STRING,
        DEFAULT_STRING)

    @JvmStatic
    public fun _internal_createWithUuid(): SimpleSomeModelDto = _internal_create().apply { uuid =
        UUID.randomUUID() }

    @JvmStatic
    public fun createShallowWithNewEmptyModels(): SimpleSomeModelDto {
      val simpleSomeModelDto = _internal_createWithUuid()
      return simpleSomeModelDto
    }

    @JvmStatic
    public fun createDeepWithNewEmptyModels(): SimpleSomeModelDto {
      val simpleSomeModelDto = _internal_createWithUuid()
      return simpleSomeModelDto
    }

    @JvmStatic
    public fun create(someName: String, someValue: String): SimpleSomeModelDto =
        SimpleSomeModelDto(someName, someValue).apply { uuid = UUID.randomUUID() }
  }
}
