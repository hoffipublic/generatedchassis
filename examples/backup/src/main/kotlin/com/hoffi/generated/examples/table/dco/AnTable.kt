package com.hoffi.generated.examples.table.dco

import com.hoffi.generated.examples.table.entity.SimpleSomeModelTable
import com.hoffi.generated.universe.WasGenerated
import java.util.UUID
import kotlin.Int
import kotlin.String
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp

/**
 * table model: an
 * with dslRef: disc:simpleEntities|modelgroup:dCogroup|model:an|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object AnTable : Table("an"), WasGenerated {
  public val `value`: Column<String> = varchar("value", 512).uniqueIndex()

  public val prio: Column<Int> = integer("prio")

  public val aInstant: Column<Instant> = timestamp("a_instant")

  public val aLocalDateTime: Column<LocalDateTime> = datetime("a_local_date_time")

  public val someModelObjectUuid: Column<UUID> =
      uuid("some_model_object_uuid").references(SimpleSomeModelTable.uuid)
}
