package typings.scChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCChannelOptions extends js.Object {
  var batch: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var waitForAuth: js.UndefOr[Boolean] = js.undefined
}

object SCChannelOptions {
  @scala.inline
  def apply(
    batch: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    waitForAuth: js.UndefOr[Boolean] = js.undefined
  ): SCChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAuth)) __obj.updateDynamic("waitForAuth")(waitForAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCChannelOptions]
  }
}

