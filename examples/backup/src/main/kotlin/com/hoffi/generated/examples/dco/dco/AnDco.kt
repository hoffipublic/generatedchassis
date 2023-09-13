package com.hoffi.generated.examples.dco.dco

import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.table.dco.AnTable
import com.hoffi.generated.universe.DTOsTABLE
import com.hoffi.generated.universe.Defaults.DEFAULT_INSTANT
import com.hoffi.generated.universe.Defaults.DEFAULT_INT
import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.Defaults.NULL_STRING
import com.hoffi.generated.universe.Dummy
import com.hoffi.generated.universe.WasGenerated
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime

/**
 * dco model: an
 * with dslRef: disc:simpleEntities|modelgroup:dCogroup|model:an|dco
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@DTOsTABLE(
  AnDco::class,
  targetTable = AnTable::class,
)
public class AnDco(
  public var `value`: String,
  public var someModelObject: SimpleSomeModelDto,
) : WasGenerated {
  public var prio: Int = DEFAULT_INT

  public var aInstant: Instant = DEFAULT_INSTANT

  public var aLocalDateTime: LocalDateTime = DEFAULT_LOCALDATETIME

  public var someObject: Dummy = Dummy.NULL

  public override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is AnDco) return false
    if (value != other.value) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = value.hashCode()
    return result
  }

  override fun toString(): String = """AnDco(value='$value', prio='$prio')"""

  public companion object {
    public val NULL: AnDco = AnDco(NULL_STRING, SimpleSomeModelDto.NULL)

    @JvmStatic
    public fun _internal_create(): AnDco = AnDco(DEFAULT_STRING, SimpleSomeModelDto.NULL)
  }
}
