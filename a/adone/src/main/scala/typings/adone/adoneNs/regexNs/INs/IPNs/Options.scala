package typings.adone.adoneNs.regexNs.INs.IPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exact: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    __obj.asInstanceOf[Options]
  }
}

