package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTranslateXTranslateY extends js.Object {
  var translateX: Double
  var translateY: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonTranslateXTranslateY {
  @scala.inline
  def apply(translateX: Double, translateY: js.UndefOr[scala.Nothing] = js.undefined): AnonTranslateXTranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateXTranslateY]
  }
}

