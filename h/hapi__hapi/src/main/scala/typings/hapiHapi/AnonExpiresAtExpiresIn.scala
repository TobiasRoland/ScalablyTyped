package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpiresAtExpiresIn extends js.Object {
  var expiresAt: js.UndefOr[String] = js.undefined
  var expiresIn: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonExpiresAtExpiresIn {
  @scala.inline
  def apply(expiresAt: String = null, expiresIn: js.UndefOr[scala.Nothing] = js.undefined): AnonExpiresAtExpiresIn = {
    val __obj = js.Dynamic.literal()
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpiresAtExpiresIn]
  }
}

