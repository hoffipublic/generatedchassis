package com.hoffi.generated.examples.dto.persistent.dto.filler

import com.hoffi.generated.examples.dto.persistent.dto.ABasePersistentDtoRunDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: Base
 * with dslRef: disc:commonBasePersistentDisc|modelgroup:Persistentgroup|model:Base|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerABasePersistentDtoRunDto : WasGenerated {
  public fun copyShallowIgnoreModelsInto(target: ABasePersistentDtoRunDto,
      source: ABasePersistentDtoRunDto): ABasePersistentDtoRunDto = target

  public fun copyShallowWithNewModelsInto(target: ABasePersistentDtoRunDto,
      source: ABasePersistentDtoRunDto): ABasePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: ABasePersistentDtoRunDto,
      source: ABasePersistentDtoRunDto): ABasePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: ABasePersistentDtoRunDto, source: ABasePersistentDtoRunDto):
      ABasePersistentDtoRunDto {
    copyShallowIgnoreModelsInto(target, source)
    return target
  }
}
