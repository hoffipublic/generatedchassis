package com.hoffi.generated.universe

import java.util.UUID
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 * Universe Defaults
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object Defaults : WasGenerated {
  public val DEFAULT_INT: Int = -1

  public val DEFAULT_LONG: Long = -1L

  public val DEFAULT_STRING: String = "<DEFAULT>"

  public val DEFAULT_UUID: UUID = UUID.fromString("00000000-0000-0000-0000-000000000001")

  public val DEFAULT_INSTANT: Instant = Instant.fromEpochMilliseconds(1L)

  public val DEFAULT_LOCALDATETIME: LocalDateTime = DEFAULT_INSTANT.toLocalDateTime(TimeZone.UTC)

  public val DEFAULT_LOCALDATETIME_DB: LocalDateTime = DEFAULT_LOCALDATETIME

  public val NULL_INT: Int = -2

  public val NULL_LONG: Long = -2L

  public val NULL_STRING: String = "<NULL>"

  public val NULL_UUID: UUID = UUID.fromString("00000000-0000-0000-0000-000000000002")

  public val NULL_INSTANT: Instant = Instant.fromEpochMilliseconds(2L)

  public val NULL_LOCALDATETIME: LocalDateTime = NULL_INSTANT.toLocalDateTime(TimeZone.UTC)

  public val NULL_LOCALDATETIME_DB: LocalDateTime = NULL_LOCALDATETIME
}
