package com.hoffi.generated.examples.entity.table

import com.hoffi.generated.examples.entity.dto.SimpleSubentityDtoRunDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.UuidTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Int
import kotlin.String
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp
import java.util.*

/**
 * table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  SimpleSubentityDtoRunTable::class,
  targetDto = SimpleSubentityDtoRunDto::class,
)
public object SimpleSubentityDtoRunTable : UuidTable("subentity"), WasGenerated {
  public var name: Column<String> = varchar("name", 512)

  public var `value`: Column<String> = varchar("value", 4_096)

  public var prio: Column<Int> = integer("prio")

  public var aInstant: Column<Instant> = timestamp("a_instant")

  public var aLocalDateTime: Column<LocalDateTime> = datetime("a_local_date_time")

  public var subEntityDtoSpecificProp: Column<String> = varchar("sub_entity_dto_specific_prop", 512)

  public var entityBackreference: Column<UUID> =
      uuid("entity_backreference").uniqueIndex().references(SimpleEntityDtoRunTable.uuid)

  public var createdAt: Column<LocalDateTime> = datetime("created_at")

  public var updatedAt: Column<LocalDateTime> = datetime("updated_at")

  public var createUser: Column<String> = varchar("create_user", 512)

  public var updateUser: Column<String> = varchar("update_user", 512)
}
