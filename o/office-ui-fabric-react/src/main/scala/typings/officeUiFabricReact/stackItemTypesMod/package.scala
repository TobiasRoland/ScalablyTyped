package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stackItemTypesMod {
  type IStackItemComponent = typings.uifabricFoundation.libIcomponentMod.IComponent[
    typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
    typings.officeUiFabricReact.stackItemTypesMod.IStackItemTokens, 
    typings.officeUiFabricReact.stackItemTypesMod.IStackItemStyles, 
    typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
    js.Object
  ]
  type IStackItemSlot = typings.uifabricFoundation.libIslotsMod.ISlotProp[typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps, scala.Nothing]
  type IStackItemStyles = typings.uifabricFoundation.libIcomponentMod.IComponentStyles[typings.officeUiFabricReact.stackItemTypesMod.IStackItemSlots]
  type IStackItemStylesReturnType = typings.std.ReturnType[
    typings.std.Extract[
      typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
        typings.officeUiFabricReact.stackItemTypesMod.IStackItemTokens, 
        typings.officeUiFabricReact.stackItemTypesMod.IStackItemStyles
      ], 
      js.Function
    ]
  ]
  type IStackItemTokenReturnType = typings.std.ReturnType[
    typings.std.Extract[
      typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
        typings.officeUiFabricReact.stackItemTypesMod.IStackItemTokens
      ], 
      js.Function
    ]
  ]
}
