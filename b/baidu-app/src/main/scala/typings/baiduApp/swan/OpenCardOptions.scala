package typings.baiduApp.swan

import typings.baiduApp.AnonCardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[AnonCardId]
}

object OpenCardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[AnonCardId],
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenCardOptions]
  }
}

