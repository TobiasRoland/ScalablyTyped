package typings.reactElemental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoldRegular extends js.Object {
  var bold: js.UndefOr[String] = js.undefined
  var regular: js.UndefOr[String] = js.undefined
}

object AnonBoldRegular {
  @scala.inline
  def apply(bold: String = null, regular: String = null): AnonBoldRegular = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (regular != null) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoldRegular]
  }
}

