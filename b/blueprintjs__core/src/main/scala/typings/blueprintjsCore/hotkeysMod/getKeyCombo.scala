package typings.blueprintjsCore.hotkeysMod

import typings.blueprintjsCore.hotkeyParserMod.IKeyCombo
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "getKeyCombo")
@js.native
object getKeyCombo extends js.Object {
  def apply(e: KeyboardEvent): IKeyCombo = js.native
}

