package com.hoffi.generated.examples.entity.dto.filler

import com.hoffi.generated.examples.dto.persistent.dto.filler.FillerAPersistentOptimisticPersistentDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleEntityDtoRunDto
import com.hoffi.generated.examples.entity.dto.SimpleSubentityDtoRunDto
import com.hoffi.generated.universe.WasGenerated

/**
 * Filler for dto model: Entity
 * with dslRef: disc:simpleEntities|modelgroup:Entitygroup|model:Entity|dto
 * generated at DEVTIME on macbook-pro.fritz.box
 */
public object FillerSimpleEntityDtoRunDto : WasGenerated {
  public fun cloneShallowIgnoreModels(source: SimpleEntityDtoRunDto): SimpleEntityDtoRunDto {
    val target = SimpleEntityDtoRunDto._internal_create()
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun cloneShallowTakeSameModels(source: SimpleEntityDtoRunDto): SimpleEntityDtoRunDto {
    val target = SimpleEntityDtoRunDto._internal_create()
    copyShallowAndTakeSameModelsInto(target, source)
    return target
  }

  public fun cloneWithNewModels(source: SimpleEntityDtoRunDto): SimpleEntityDtoRunDto {
    val target = SimpleEntityDtoRunDto._internal_create()
    copyShallowWithNewModelsInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: SimpleEntityDtoRunDto,
      source: SimpleEntityDtoRunDto): SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    target.name = source.name
    target.value = source.value
    target.prio = source.prio
    target.aInstant = source.aInstant
    target.aLocalDateTime = source.aLocalDateTime
    target.someObject = source.someObject
    target.dtoSpecificProp = source.dtoSpecificProp
    return target
  }

  public fun copyShallowWithNewModelsInto(target: SimpleEntityDtoRunDto,
      source: SimpleEntityDtoRunDto): SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    // beware of recursive calls, if Type or some submodel of it has a reference to this
    target.someModelObject = SimpleSubentityDtoRunDto.createDeepWithNewEmptyModels()
    target.subentitys?.clear()
    // target.listOfStrings.clear()
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: SimpleEntityDtoRunDto,
      source: SimpleEntityDtoRunDto): SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    target.someModelObject = source.someModelObject
    // target.subentitys.clear()
    // target.subentitys.addAll(source.subentitys.toList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    return target
  }

  public fun copyDeepInto(target: SimpleEntityDtoRunDto, source: SimpleEntityDtoRunDto):
      SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    if (source.someModelObject === SimpleSubentityDtoRunDto.NULL)
        target.someModelObject = source.someModelObject
    else
        FillerSimpleSubentityDtoRunDto.copyDeepInto(target.someModelObject, source.someModelObject)
    target.subentitys?.clear()
    target.subentitys?.addAll(source.subentitys?.toList() ?: emptyList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    FillerAPersistentOptimisticPersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }

  public fun cloneDeep(source: SimpleEntityDtoRunDto): SimpleEntityDtoRunDto {
    val target = SimpleEntityDtoRunDto._internal_createWithUuid()
    copyShallowIgnoreModelsInto(target, source)
    if (source.someModelObject === SimpleSubentityDtoRunDto.NULL)
        target.someModelObject = source.someModelObject
    else
        FillerSimpleSubentityDtoRunDto.copyDeepInto(target.someModelObject, source.someModelObject)
    target.subentitys?.clear()
    target.subentitys?.addAll(source.subentitys?.map { FillerSimpleSubentityDtoRunDto.cloneDeep(it)
        } ?: emptyList())
    // target.listOfStrings.clear()
    // target.listOfStrings.addAll(source.listOfStrings)
    FillerAPersistentOptimisticPersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }

  public fun copyShallowIgnoreModelsInto(target: SimpleEntityDtoRunDto,
      source: SimpleSubentityDtoRunDto): SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    return target
  }

  public fun copyShallowWithNewModelsInto(target: SimpleEntityDtoRunDto,
      source: SimpleSubentityDtoRunDto): SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyShallowAndTakeSameModelsInto(target: SimpleEntityDtoRunDto,
      source: SimpleSubentityDtoRunDto): SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    return target
  }

  public fun copyDeepInto(target: SimpleEntityDtoRunDto, source: SimpleSubentityDtoRunDto):
      SimpleEntityDtoRunDto {
    if (target === SimpleEntityDtoRunDto.NULL) throw
        Exception("cannot clone/copy into companion.NULL")
    copyShallowIgnoreModelsInto(target, source)
    FillerAPersistentOptimisticPersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }

  public fun cloneDeep(source: SimpleSubentityDtoRunDto): SimpleEntityDtoRunDto {
    val target = SimpleEntityDtoRunDto._internal_createWithUuid()
    copyShallowIgnoreModelsInto(target, source)
    FillerAPersistentOptimisticPersistentDtoRunDto.copyDeepInto(target, source)
    return target
  }
}
