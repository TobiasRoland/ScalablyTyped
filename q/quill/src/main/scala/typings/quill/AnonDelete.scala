package typings.quill

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  var delete: js.UndefOr[Double] = js.undefined
  var insert: js.UndefOr[js.Any] = js.undefined
  var retain: js.UndefOr[Double] = js.undefined
}

object AnonDelete {
  @scala.inline
  def apply(delete: Int | Double = null, insert: js.Any = null, retain: Int | Double = null): AnonDelete = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (retain != null) __obj.updateDynamic("retain")(retain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelete]
  }
}

