package com.hoffi.generated.examples.table.entity

import com.hoffi.generated.examples.dto.entity.ISimpleDto
import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.UuidTable
import com.hoffi.generated.universe.WasGenerated
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import org.jetbrains.exposed.sql.kotlin.datetime.timestamp
import java.util.*

/**
 * table model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  SimpleEntityTable::class,
  targetDto = SimpleEntityDto::class,
)
public object SimpleEntityTable : UuidTable("simple_entity"), WasGenerated, ISimpleDto {
  public val name: Column<String> = varchar("name", 512).uniqueIndex()

  public val `value`: Column<String> = varchar("value", 4_096)

  public val prio: Column<Int> = integer("prio")/* some table prio comment */

  public val aInstant: Column<Instant> = timestamp("a_instant")

  public val aLocalDateTime: Column<LocalDateTime> = datetime("a_local_date_time")

  public val someModelObjectUuid: Column<UUID> =
      uuid("some_model_object_uuid").references(SimpleSomeModelTable.uuid) // really uniqueIndex (meaning no two Entitys can have the same SomeModel??

  public val subentitys: Any? = mappedBy(SimpleSubentityTable::simpleEntitySubentitysUuid)

  /**
   * not implemented yet
   */
  public val listOfStrings: Any? = null

  public val dtoSpecificProp: Column<String> = varchar("dto_specific_prop", 512)/* some dto specific
      comment */

  public val optimisticLockId: Column<Long> = long("optimistic_lock_id")

  public val createdAt: Column<LocalDateTime> = datetime("created_at")

  public val updatedAt: Column<LocalDateTime> = datetime("updated_at")

  public val createUser: Column<String> = varchar("create_user", 512)

  public val updateUser: Column<String> = varchar("update_user", 512)
}
