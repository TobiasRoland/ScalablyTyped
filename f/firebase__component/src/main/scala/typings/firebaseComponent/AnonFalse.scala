package typings.firebaseComponent

import typings.firebaseComponent.firebaseComponentBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(identifier: String = null, optional: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

