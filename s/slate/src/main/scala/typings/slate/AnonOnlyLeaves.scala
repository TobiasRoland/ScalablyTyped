package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyLeaves extends js.Object {
  var onlyLeaves: js.UndefOr[Boolean] = js.undefined
  var onlyRoots: js.UndefOr[Boolean] = js.undefined
  var onlyTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonOnlyLeaves {
  @scala.inline
  def apply(
    onlyLeaves: js.UndefOr[Boolean] = js.undefined,
    onlyRoots: js.UndefOr[Boolean] = js.undefined,
    onlyTypes: js.Array[String] = null
  ): AnonOnlyLeaves = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyLeaves)) __obj.updateDynamic("onlyLeaves")(onlyLeaves.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyRoots)) __obj.updateDynamic("onlyRoots")(onlyRoots.asInstanceOf[js.Any])
    if (onlyTypes != null) __obj.updateDynamic("onlyTypes")(onlyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyLeaves]
  }
}

