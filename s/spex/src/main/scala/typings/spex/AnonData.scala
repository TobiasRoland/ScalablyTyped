package typings.spex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(
    dest: (/* index */ Double, /* data */ js.Any, /* delay */ Double) => _ = null,
    limit: Int | Double = null
  ): AnonData = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(js.Any.fromFunction3(dest))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

