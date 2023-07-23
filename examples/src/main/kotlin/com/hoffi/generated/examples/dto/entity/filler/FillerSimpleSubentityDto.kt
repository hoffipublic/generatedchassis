package com.hoffi.generated.examples.dto.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: Subentity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Subentity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSubentityDto : WasGenerated {
  public fun cloneShallowIgnoreModels(source: SimpleSubentityDto): SimpleSubentityDto {
    val target = SimpleSubentityDto._internal_create()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneShallowTakeSameModels(source: SimpleSubentityDto): SimpleSubentityDto {
    val target = SimpleSubentityDto._internal_create()
    copyShallowAndTakeSameModelsInto(target, source)
    return target
  }

  public fun cloneWithNewModels(source: SimpleSubentityDto): SimpleSubentityDto {
    val target = SimpleSubentityDto._internal_create()
    copyShallowWithNewModelsInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: SimpleSubentityDto, source: SimpleSubentityDto):
      SimpleSubentityDto {
    if (target === SimpleSubentityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
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

  public fun copyShallowWithNewModelsInto(target: SimpleSubentityDto, source: SimpleSubentityDto):
      SimpleSubentityDto {
    if (target === SimpleSubentityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    // beware of recursive calls, if Type or some submodel of it has a reference to this
    target.entityBackreference = SimpleEntityDto.createDeepWithNewEmptyModels()
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: SimpleSubentityDto,
      source: SimpleSubentityDto): SimpleSubentityDto {
    if (target === SimpleSubentityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    target.entityBackreference = source.entityBackreference
    return target
  }

  public fun copyDeepInto(target: SimpleSubentityDto, source: SimpleSubentityDto):
      SimpleSubentityDto {
    if (target === SimpleSubentityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    if (source.entityBackreference === SimpleEntityDto.NULL)
        target.entityBackreference = source.entityBackreference
    else
        FillerSimpleEntityDto.copyDeepInto(target.entityBackreference, source.entityBackreference)
    return target
  }

  public fun cloneDeep(source: SimpleSubentityDto): SimpleSubentityDto {
    val target = SimpleSubentityDto._internal_createWithUuid()
    copyShallowIgnoreModelsInto(target, source)
    if (source.entityBackreference === SimpleEntityDto.NULL)
        target.entityBackreference = source.entityBackreference
    else
        FillerSimpleEntityDto.copyDeepInto(target.entityBackreference, source.entityBackreference)
    return target
  }
}
