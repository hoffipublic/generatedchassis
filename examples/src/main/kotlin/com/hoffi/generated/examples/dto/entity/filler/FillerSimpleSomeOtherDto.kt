package com.hoffi.generated.examples.dto.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleSomeOtherDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: SomeOther
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeOther|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSomeOtherDto : WasGenerated {
  public fun cloneShallowIgnoreModels(source: SimpleSomeOtherDto): SimpleSomeOtherDto {
    val target = SimpleSomeOtherDto._internal_create()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneShallowTakeSameModels(source: SimpleSomeOtherDto): SimpleSomeOtherDto {
    val target = SimpleSomeOtherDto._internal_create()
    copyShallowAndTakeSameModelsInto(target, source)
    return target
  }

  public fun cloneWithNewModels(source: SimpleSomeOtherDto): SimpleSomeOtherDto {
    val target = SimpleSomeOtherDto._internal_create()
    copyShallowWithNewModelsInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: SimpleSomeOtherDto, source: SimpleSomeOtherDto):
      SimpleSomeOtherDto {
    if (target === SimpleSomeOtherDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    target.someName = source.someName
    target.someValue = source.someValue
    target.optimisticLockId = source.optimisticLockId
    target.created = source.created
    target.modified = source.modified
    target.deleted = source.deleted
    target.createdAt = source.createdAt
    target.updatedAt = source.updatedAt
    target.createUser = source.createUser
    target.updateUser = source.updateUser
    return target
  }

  public fun copyShallowWithNewModelsInto(target: SimpleSomeOtherDto, source: SimpleSomeOtherDto):
      SimpleSomeOtherDto {
    if (target === SimpleSomeOtherDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: SimpleSomeOtherDto,
      source: SimpleSomeOtherDto): SimpleSomeOtherDto {
    if (target === SimpleSomeOtherDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: SimpleSomeOtherDto, source: SimpleSomeOtherDto):
      SimpleSomeOtherDto {
    if (target === SimpleSomeOtherDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneDeep(source: SimpleSomeOtherDto): SimpleSomeOtherDto {
    val target = SimpleSomeOtherDto._internal_createWithUuid()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }
}
