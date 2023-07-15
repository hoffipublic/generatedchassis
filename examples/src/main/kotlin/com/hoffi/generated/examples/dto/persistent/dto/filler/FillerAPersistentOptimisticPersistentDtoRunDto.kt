package com.hoffi.generated.examples.dto.persistent.dto.filler

import com.hoffi.generated.examples.dto.persistent.dto.APersistentBasePersistentDtoRunDto
import com.hoffi.generated.examples.dto.persistent.dto.APersistentOptimisticPersistentDtoRunDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: PersistentOptimistic
 * with dslRef:
 * disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:PersistentOptimistic|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerAPersistentOptimisticPersistentDtoRunDto : WasGenerated {
  public fun copyShallowIgnoreModelsInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentOptimisticPersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto {
    target.optimisticLockId = source.optimisticLockId
    return target
  }

  public fun copyShallowWithNewModelsInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentOptimisticPersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentOptimisticPersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentOptimisticPersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    FillerATransientStatePersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto = target

  public fun copyShallowWithNewModelsInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: APersistentOptimisticPersistentDtoRunDto,
      source: APersistentBasePersistentDtoRunDto): APersistentOptimisticPersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    FillerATransientStatePersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }
}
