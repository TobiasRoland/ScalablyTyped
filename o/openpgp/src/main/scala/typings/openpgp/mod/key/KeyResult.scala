package typings.openpgp.mod.key

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyResult extends js.Object {
  var err: js.Array[Error] | Null
  var keys: js.Array[Key]
}

object KeyResult {
  @scala.inline
  def apply(keys: js.Array[Key], err: js.Array[Error] = null): KeyResult = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyResult]
  }
}

