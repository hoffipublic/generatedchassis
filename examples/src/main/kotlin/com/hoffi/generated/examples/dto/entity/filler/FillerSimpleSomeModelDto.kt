package com.hoffi.generated.examples.dto.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: SomeModel
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:SomeModel|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleSomeModelDto : WasGenerated {
  public fun cloneShallowIgnoreModels(source: SimpleSomeModelDto): SimpleSomeModelDto {
    val target = SimpleSomeModelDto._internal_create()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneShallowTakeSameModels(source: SimpleSomeModelDto): SimpleSomeModelDto {
    val target = SimpleSomeModelDto._internal_create()
    copyShallowAndTakeSameModelsInto(target, source)
    return target
  }

  public fun cloneWithNewModels(source: SimpleSomeModelDto): SimpleSomeModelDto {
    val target = SimpleSomeModelDto._internal_create()
    copyShallowWithNewModelsInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: SimpleSomeModelDto, source: SimpleSomeModelDto):
      SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
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

  public fun copyShallowWithNewModelsInto(target: SimpleSomeModelDto, source: SimpleSomeModelDto):
      SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: SimpleSomeModelDto,
      source: SimpleSomeModelDto): SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: SimpleSomeModelDto, source: SimpleSomeModelDto):
      SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneDeep(source: SimpleSomeModelDto): SimpleSomeModelDto {
    val target = SimpleSomeModelDto._internal_createWithUuid()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun withoutModelsCopyShallowIgnoreModelsInto(target: SimpleSomeModelDto,
      source: SimpleSomeModelDto): SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
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

  public fun withoutModelsCopyShallowWithNewModelsInto(target: SimpleSomeModelDto,
      source: SimpleSomeModelDto): SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    withoutModelsCopyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun withoutModelsCopyShallowAndTakeSameModelsInto(target: SimpleSomeModelDto,
      source: SimpleSomeModelDto): SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    withoutModelsCopyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun withoutModelsCopyDeepInto(target: SimpleSomeModelDto, source: SimpleSomeModelDto):
      SimpleSomeModelDto {
    if (target === SimpleSomeModelDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    withoutModelsCopyShallowIgnoreModelsInto(target, source)
    return target
  }
}
