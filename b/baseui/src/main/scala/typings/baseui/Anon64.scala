package typings.baseui

import typings.baseui.baseuiStrings.NZ
import typings.baseui.baseuiStrings.Plussign64
import typings.baseui.baseuiStrings.`New Zealand`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon64 extends js.Object {
  var dialCode: Plussign64
  var id: NZ
  var label: `New Zealand`
}

object Anon64 {
  @scala.inline
  def apply(dialCode: Plussign64, id: NZ, label: `New Zealand`): Anon64 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon64]
  }
}

