package typings.rmcPicker

import org.scalablytyped.runtime.Instantiable0
import typings.reactNative.mod.Picker
import typings.reactNative.mod.PickerItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-picker/lib/NativePicker.ios", JSImport.Namespace)
@js.native
object nativePickerIosMod extends js.Object {
  @js.native
  class default () extends Picker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: Instantiable0[PickerItem] = js.native
    /**
      * On Android, display the options in a dialog.
      */
    var MODE_DIALOG: String = js.native
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    var MODE_DROPDOWN: String = js.native
  }
  
}

