package typings.webpackDevServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeMap extends js.Object {
  var typeMap: js.UndefOr[AnonForce] = js.undefined
}

object AnonTypeMap {
  @scala.inline
  def apply(typeMap: AnonForce = null): AnonTypeMap = {
    val __obj = js.Dynamic.literal()
    if (typeMap != null) __obj.updateDynamic("typeMap")(typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeMap]
  }
}

