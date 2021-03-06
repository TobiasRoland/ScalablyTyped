package typings.reactVirtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Keyboard = typings.react.mod.Component[
    typings.reactVirtualKeyboard.mod.KeyboardProps, 
    typings.reactVirtualKeyboard.mod.KeyboardState, 
    js.Any
  ]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[java.lang.String | typings.std.Event_], 
    /* keyboard */ js.UndefOr[typings.std.Element], 
    /* el */ js.UndefOr[typings.std.Element], 
    scala.Unit
  ]
}
