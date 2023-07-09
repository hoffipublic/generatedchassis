package com.hoffi.generated.examples.dto.persistent.dto

import com.hoffi.generated.universe.Defaults.DEFAULT_LOCALDATETIME
import com.hoffi.generated.universe.Defaults.DEFAULT_STRING
import com.hoffi.generated.universe.Defaults.DEFAULT_UUID
import com.hoffi.generated.universe.IUuidDto
import com.hoffi.generated.universe.WasGenerated
import java.util.UUID
import kotlin.String
import kotlinx.datetime.LocalDateTime

/**
 * dto model: Persistent
 * with dslRef: disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:Persistent|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public abstract class APersistentBasePersistentDtoRunDto() : ABasePersistentDtoRunDto(),
    WasGenerated, IUuidDto {
  override var uuid: UUID = DEFAULT_UUID

  public var createdAt: LocalDateTime = DEFAULT_LOCALDATETIME

  public var updatedAt: LocalDateTime = DEFAULT_LOCALDATETIME

  public var createUser: String = DEFAULT_STRING

  public var updateUser: String = DEFAULT_STRING
}
