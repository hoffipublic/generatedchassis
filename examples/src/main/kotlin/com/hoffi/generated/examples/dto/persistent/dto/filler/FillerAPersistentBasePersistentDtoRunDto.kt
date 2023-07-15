package com.hoffi.generated.examples.dto.persistent.dto.filler

import com.hoffi.generated.examples.dto.persistent.dto.APersistentBasePersistentDtoRunDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: Persistent
 * with dslRef: disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:Persistent|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerAPersistentBasePersistentDtoRunDto : WasGenerated {
  public fun copyShallowIgnoreModelsInto(target: APersistentBasePersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentBasePersistentDtoRunDto {
    target.createdAt = source.createdAt
    target.updatedAt = source.updatedAt
    target.createUser = source.createUser
    target.updateUser = source.updateUser
    return target
  }

  public fun copyShallowWithNewModelsInto(target: APersistentBasePersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentBasePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: APersistentBasePersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentBasePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: APersistentBasePersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentBasePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    FillerABasePersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }
}
