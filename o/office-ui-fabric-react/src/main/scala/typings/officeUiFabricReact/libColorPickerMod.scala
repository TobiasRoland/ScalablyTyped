package typings.officeUiFabricReact

import typings.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typings.react.mod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ColorPicker", JSImport.Namespace)
@js.native
object libColorPickerMod extends js.Object {
  @js.native
  class ColorPickerBase protected ()
    extends typings.officeUiFabricReact.colorPickerMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  
  val ColorPicker: StatelessComponent[IColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerBase extends js.Object {
    var defaultProps: Partial[IColorPickerProps] = js.native
  }
  
}

