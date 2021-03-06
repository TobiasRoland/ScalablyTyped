package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextPrevious extends js.Object {
  var next: js.UndefOr[js.Any] = js.undefined
  var previous: js.UndefOr[js.Any] = js.undefined
  var small: js.UndefOr[AnonNext] = js.undefined
}

object AnonNextPrevious {
  @scala.inline
  def apply(next: js.Any = null, previous: js.Any = null, small: AnonNext = null): AnonNextPrevious = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextPrevious]
  }
}

