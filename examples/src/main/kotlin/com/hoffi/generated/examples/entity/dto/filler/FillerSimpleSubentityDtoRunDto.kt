package com.hoffi.generated.examples.entity.dto.filler

import com.hoffi.generated.examples.entity.dto.SimpleEntityDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleSubentityDtoRunDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSubentityDtoRunDto : WasGenerated {
  public fun cloneShallowIgnoreModels(source: SimpleSubentityDtoRunDto): SimpleSubentityDtoRunDto {
    val target = SimpleSubentityDtoRunDto._internal_create()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneShallowTakeSameModels(source: SimpleSubentityDtoRunDto):
      SimpleSubentityDtoRunDto {
    val target = SimpleSubentityDtoRunDto._internal_create()
    copyShallowAndTakeSameModelsInto(target, source)
    return target
  }

  public fun cloneWithNewModels(source: SimpleSubentityDtoRunDto): SimpleSubentityDtoRunDto {
    val target = SimpleSubentityDtoRunDto._internal_create()
    copyShallowWithNewModelsInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: SimpleSubentityDtoRunDto,
      source: SimpleSubentityDtoRunDto): SimpleSubentityDtoRunDto {
    if (target === SimpleSubentityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    target.name = source.name
    target.value = source.value
    target.prio = source.prio
    target.aInstant = source.aInstant
    target.aLocalDateTime = source.aLocalDateTime
    target.subEntityDtoSpecificProp = source.subEntityDtoSpecificProp
    target.createdAt = source.createdAt
    target.updatedAt = source.updatedAt
    target.createUser = source.createUser
    target.updateUser = source.updateUser
    return target
  }

  public fun copyShallowWithNewModelsInto(target: SimpleSubentityDtoRunDto,
      source: SimpleSubentityDtoRunDto): SimpleSubentityDtoRunDto {
    if (target === SimpleSubentityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    // beware of recursive calls, if Type or some submodel of it has a reference to this
    target.entityBackreference = SimpleEntityDtoRunDto.createDeepWithNewEmptyModels()
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: SimpleSubentityDtoRunDto,
      source: SimpleSubentityDtoRunDto): SimpleSubentityDtoRunDto {
    if (target === SimpleSubentityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    target.entityBackreference = source.entityBackreference
    return target
  }

  public fun copyDeepInto(target: SimpleSubentityDtoRunDto, source: SimpleSubentityDtoRunDto):
      SimpleSubentityDtoRunDto {
    if (target === SimpleSubentityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    if (source.entityBackreference === SimpleEntityDtoRunDto.NULL)
        target.entityBackreference = source.entityBackreference
    else
        FillerSimpleEntityDtoRunDto.copyDeepInto(target.entityBackreference,
        source.entityBackreference)
    return target
  }

  public fun cloneDeep(source: SimpleSubentityDtoRunDto): SimpleSubentityDtoRunDto {
    val target = SimpleSubentityDtoRunDto._internal_createWithUuid()
    copyShallowIgnoreModelsInto(target, source)
    if (source.entityBackreference === SimpleEntityDtoRunDto.NULL)
        target.entityBackreference = source.entityBackreference
    else
        FillerSimpleEntityDtoRunDto.copyDeepInto(target.entityBackreference,
        source.entityBackreference)
    return target
  }
}
