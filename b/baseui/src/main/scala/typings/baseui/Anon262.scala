package typings.baseui

import typings.baseui.baseuiStrings.Mayotte
import typings.baseui.baseuiStrings.Plussign262
import typings.baseui.baseuiStrings.YT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon262 extends js.Object {
  var dialCode: Plussign262
  var id: YT
  var label: Mayotte
}

object Anon262 {
  @scala.inline
  def apply(dialCode: Plussign262, id: YT, label: Mayotte): Anon262 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon262]
  }
}

