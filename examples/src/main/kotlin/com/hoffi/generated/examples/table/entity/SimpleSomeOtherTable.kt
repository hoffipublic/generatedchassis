package com.hoffi.generated.examples.table.entity

import com.hoffi.generated.examples.dto.entity.SimpleSomeOtherDto
import com.hoffi.generated.universe.TABLEsDTO
import com.hoffi.generated.universe.UuidTable
import com.hoffi.generated.universe.WasGenerated
import kotlin.Long
import kotlin.String
import kotlinx.datetime.LocalDateTime
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.kotlin.datetime.datetime

/**
 * table model: SomeOther
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeOther|table
 * generated at DEVTIME on macbook-pro.fritz.box
 */
@TABLEsDTO(
  SimpleSomeOtherTable::class,
  targetDto = SimpleSomeOtherDto::class,
)
public object SimpleSomeOtherTable : UuidTable("simple_some_other"), WasGenerated {
  public val someName: Column<String> = varchar("some_name", 512)

  public val someValue: Column<String> = varchar("some_value", 4_096)

  public val optimisticLockId: Column<Long> = long("optimistic_lock_id")

  public val createdAt: Column<LocalDateTime> = datetime("created_at")

  public val updatedAt: Column<LocalDateTime> = datetime("updated_at")

  public val createUser: Column<String> = varchar("create_user", 512)

  public val updateUser: Column<String> = varchar("update_user", 512)
}
