package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizingEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ResizingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizingEventUIParam]
  }
}

