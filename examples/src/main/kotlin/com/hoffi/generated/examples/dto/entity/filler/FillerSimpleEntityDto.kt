package com.hoffi.generated.examples.dto.entity.filler

import com.hoffi.generated.examples.dto.entity.SimpleEntityDto
import com.hoffi.generated.examples.dto.entity.SimpleSomeModelDto
import com.hoffi.generated.examples.dto.entity.SimpleSubentityDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleEntityDto : WasGenerated {
  public fun cloneShallowIgnoreModels(source: SimpleEntityDto): SimpleEntityDto {
    val target = SimpleEntityDto._internal_create()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneShallowTakeSameModels(source: SimpleEntityDto): SimpleEntityDto {
    val target = SimpleEntityDto._internal_create()
    copyShallowAndTakeSameModelsInto(target, source)
    return target
  }

  public fun cloneWithNewModels(source: SimpleEntityDto): SimpleEntityDto {
    val target = SimpleEntityDto._internal_create()
    copyShallowWithNewModelsInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: SimpleEntityDto, source: SimpleEntityDto):
      SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    target.name = source.name
    target.value = source.value
    target.prio = source.prio
    target.aInstant = source.aInstant
    target.aLocalDateTime = source.aLocalDateTime
    target.someObject = source.someObject
    target.dtoSpecificProp = source.dtoSpecificProp
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

  public fun copyShallowWithNewModelsInto(target: SimpleEntityDto, source: SimpleEntityDto):
      SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    // beware of recursive calls, if Type or some submodel of it has a reference to this
    target.someModelObject = SimpleSomeModelDto.createDeepWithNewEmptyModels()
    target.subentitys?.clear()
    // target.listOfStrings.clear()
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: SimpleEntityDto, source: SimpleEntityDto):
      SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    target.someModelObject = source.someModelObject
    target.subentitys?.clear()
    target.subentitys?.addAll(source.subentitys?.toList() ?: emptyList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    return target
  }

  public fun copyDeepInto(target: SimpleEntityDto, source: SimpleEntityDto): SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    if (source.someModelObject === SimpleSomeModelDto.NULL)
        target.someModelObject = source.someModelObject
    else
        FillerSimpleSomeModelDto.copyDeepInto(target.someModelObject, source.someModelObject)
    target.subentitys?.clear()
    target.subentitys?.addAll(source.subentitys?.toList() ?: emptyList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    return target
  }

  public fun cloneDeep(source: SimpleEntityDto): SimpleEntityDto {
    val target = SimpleEntityDto._internal_createWithUuid()
    copyShallowIgnoreModelsInto(target, source)
    if (source.someModelObject === SimpleSomeModelDto.NULL)
        target.someModelObject = source.someModelObject
    else
        FillerSimpleSomeModelDto.copyDeepInto(target.someModelObject, source.someModelObject)
    target.subentitys?.clear()
    target.subentitys?.addAll(source.subentitys?.map { FillerSimpleSubentityDto.cloneDeep(it) } ?:
        emptyList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    return target
  }

  public fun simpleSubentityDtoCopyShallowIgnoreModelsInto(target: SimpleEntityDto,
      source: SimpleSubentityDto): SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    target.name = source.name
    target.value = source.value
    target.prio = source.prio
    target.aInstant = source.aInstant
    target.aLocalDateTime = source.aLocalDateTime
    target.createdAt = source.createdAt
    target.updatedAt = source.updatedAt
    target.createUser = source.createUser
    target.updateUser = source.updateUser
    return target
  }

  public fun simpleSubentityDtoCopyShallowWithNewModelsInto(target: SimpleEntityDto,
      source: SimpleSubentityDto): SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    simpleSubentityDtoCopyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun simpleSubentityDtoCopyShallowAndTakeSameModelsInto(target: SimpleEntityDto,
      source: SimpleSubentityDto): SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    simpleSubentityDtoCopyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun simpleSubentityDtoCopyDeepInto(target: SimpleEntityDto, source: SimpleSubentityDto):
      SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    simpleSubentityDtoCopyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun simpleSubentityDtoCloneDeep(source: SimpleSubentityDto): SimpleEntityDto {
    val target = SimpleEntityDto._internal_createWithUuid()
    simpleSubentityDtoCopyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun withoutModelsCopyShallowIgnoreModelsInto(target: SimpleEntityDto,
      source: SimpleEntityDto): SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    target.name = source.name
    target.value = source.value
    target.prio = source.prio
    target.aInstant = source.aInstant
    target.aLocalDateTime = source.aLocalDateTime
    target.someObject = source.someObject
    target.dtoSpecificProp = source.dtoSpecificProp
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

  public fun withoutModelsCopyShallowWithNewModelsInto(target: SimpleEntityDto,
      source: SimpleEntityDto): SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    withoutModelsCopyShallowIgnoreModelsInto(target, source)
    // beware of recursive calls, if Type or some submodel of it has a reference to this
    target.someModelObject = SimpleSomeModelDto.createDeepWithNewEmptyModels()
    target.subentitys?.clear()
    // target.listOfStrings.clear()
    return target
  }

  public fun withoutModelsCopyShallowAndTakeSameModelsInto(target: SimpleEntityDto,
      source: SimpleEntityDto): SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    withoutModelsCopyShallowIgnoreModelsInto(target, source)
    target.someModelObject = source.someModelObject
    target.subentitys?.clear()
    target.subentitys?.addAll(source.subentitys?.toList() ?: emptyList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    return target
  }

  public fun withoutModelsCopyDeepInto(target: SimpleEntityDto, source: SimpleEntityDto):
      SimpleEntityDto {
    if (target === SimpleEntityDto.NULL) throw Exception("cannot clone/copy into companion.NULL")
    withoutModelsCopyShallowIgnoreModelsInto(target, source)
    if (source.someModelObject === SimpleSomeModelDto.NULL)
        target.someModelObject = source.someModelObject
    else
        FillerSimpleSomeModelDto.copyDeepInto(target.someModelObject, source.someModelObject)
    target.subentitys?.clear()
    target.subentitys?.addAll(source.subentitys?.toList() ?: emptyList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    return target
  }
}
