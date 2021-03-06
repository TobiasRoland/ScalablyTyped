package typings.antDesignReactNative

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antDesignReactNative.pickerMixinMod.ItemProps
import typings.antDesignReactNative.pickerTypesMod.PickerProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextContextType
  extends Instantiable1[
      (/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), 
      AnonCallBackCallback
    ]
     with Instantiable2[/* props */ PickerProps, /* context */ js.Any, AnonCallBackCallback] {
  var contextType: js.UndefOr[Context[_]] = js.native
  def Item(_props: ItemProps): Null = js.native
}

