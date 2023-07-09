package com.hoffi.generated.examples.entity.table

import com.hoffi.generated.examples.entity.dto.ISimpleDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleEntityDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleSubentityDtoRunDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.UuidTable
import com.hoffi.generated.universe.WasGenerated
import java.util.UUID
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.collections.MutableSet
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp

/**
 * table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  SimpleEntityDtoRunTable::class,
  targetDto = SimpleEntityDtoRunDto::class,
)
public object SimpleEntityDtoRunTable : UuidTable("entity"), WasGenerated, ISimpleDtoRunDto {
  public val name: Column<String> = varchar("name", 512).uniqueIndex()

  public val `value`: Column<String> = varchar("value", 4_096)

  public val prio: Column<Int> = integer("prio")/* some table prio comment */

  public val aInstant: Column<Instant> = timestamp("a_instant")

  public val aLocalDateTime: Column<LocalDateTime> = datetime("a_local_date_time")

  public val someModelObject: Column<UUID> =
      uuid("some_model_object").uniqueIndex().references(SimpleSubentityDtoRunTable.uuid)

  public val subentitys = SimpleSubentityDtoRunTable mappedBy SimpleEntityDtoRunDto::subentitys

  public val listOfStrings: List<String> = listOf()

  public val dtoSpecificProp: Column<String> = varchar("dto_specific_prop", 512)/* some dto specific
      comment */

  public val optimisticLockId: Column<Long> = long("optimistic_lock_id")

  public val createdAt: Column<LocalDateTime> = datetime("created_at")

  public val updatedAt: Column<LocalDateTime> = datetime("updated_at")

  public val createUser: Column<String> = varchar("create_user", 512)

  public val updateUser: Column<String> = varchar("update_user", 512)
}
