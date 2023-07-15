package com.hoffi.generated.examples.dto.persistent.dto.filler

import com.hoffi.generated.examples.dto.persistent.dto.ABasePersistentDtoRunDto
import com.hoffi.generated.examples.dto.persistent.dto.ATransientStatePersistentDtoRunDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: TransientState
 * with dslRef: disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:TransientState|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerATransientStatePersistentDtoRunDto : WasGenerated {
  public fun copyShallowIgnoreModelsInto(target: ATransientStatePersistentDtoRunDto,
      source: ATransientStatePersistentDtoRunDto): ATransientStatePersistentDtoRunDto {
    target.created = source.created
    target.modified = source.modified
    target.deleted = source.deleted
    return target
  }

  public fun copyShallowWithNewModelsInto(target: ATransientStatePersistentDtoRunDto,
      source: ATransientStatePersistentDtoRunDto): ATransientStatePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: ATransientStatePersistentDtoRunDto,
      source: ATransientStatePersistentDtoRunDto): ATransientStatePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: ATransientStatePersistentDtoRunDto,
      source: ATransientStatePersistentDtoRunDto): ATransientStatePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    FillerAPersistentBasePersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: ATransientStatePersistentDtoRunDto,
      source: ABasePersistentDtoRunDto): ATransientStatePersistentDtoRunDto = target

  public fun copyShallowWithNewModelsInto(target: ATransientStatePersistentDtoRunDto,
      source: ABasePersistentDtoRunDto): ATransientStatePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: ATransientStatePersistentDtoRunDto,
      source: ABasePersistentDtoRunDto): ATransientStatePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: ATransientStatePersistentDtoRunDto,
      source: ABasePersistentDtoRunDto): ATransientStatePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }
}
