package com.hoffi.generated.universe

import java.util.UUID
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

/**
 * Universe UuidTable
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public abstract class UuidTable(
  name: String,
) : Table(name), WasGenerated {
  public val uuid: Column<UUID> = uuid("uuid")

  override val primaryKey: Table.PrimaryKey = this.PrimaryKey(uuid, name = """PK_$name""")

  public infix fun hasOne(parentUuidTable: UuidTable): FK = FK(this, parentUuidTable,
      multiplicity=1)

  public infix fun hasMany(parentUuidTable: UuidTable): FK = FK(this, parentUuidTable,
      multiplicity=2)

  public fun mappedBy(mappedBy: KProperty0<*>): Any? = null

  public data class FK(
    public val uuidTable: UuidTable,
    public val parentUuidTable: UuidTable,
    public val via: KProperty1<out Any, Any?> = NULL,
    public val multiplicity: Int,
  ) {
    private val NULLPROP: String = "NULLPROP"

    public infix fun via(via: KProperty1<out Any, Any?>): FK = this.copy(via = via)

    public companion object {
      public val NULL: KProperty1<out Any, Any> = FK::NULLPROP
    }
  }
}
