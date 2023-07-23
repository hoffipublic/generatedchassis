package com.hoffi.generated.examples.table.entity

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.universe.FKFROM
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.UuidTable
import com.hoffi.generated.universe.WasGenerated
import java.util.UUID
import kotlin.Int
import kotlin.String
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp

/**
 * table model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  SimpleSubentityTable::class,
  targetDto = SimpleSubentityDto::class,
)
public object SimpleSubentityTable : UuidTable("subentity"), WasGenerated {
  public val name: Column<String> = varchar("name", 512)

  public val `value`: Column<String> = varchar("value", 4_096)

  public val prio: Column<Int> = integer("prio")

  public val aInstant: Column<Instant> = timestamp("a_instant")

  public val aLocalDateTime: Column<LocalDateTime> = datetime("a_local_date_time")

  public val subEntityDtoSpecificProp: Column<String> = varchar("sub_entity_dto_specific_prop", 512)

  public val createdAt: Column<LocalDateTime> = datetime("created_at")

  public val updatedAt: Column<LocalDateTime> = datetime("updated_at")

  public val createUser: Column<String> = varchar("create_user", 512)

  public val updateUser: Column<String> = varchar("update_user", 512)

  @FKFROM(SimpleEntityDto::class)
  public val entityUuid_subentitys: Column<UUID> =
      uuid("entity_uuid_subentitys").uniqueIndex().references(SimpleEntityTable.uuid)
}
