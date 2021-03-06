package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsColorLocation extends js.Object {
  var color: js.UndefOr[String | AnonDark] = js.undefined
  var location: js.Array[Double]
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AnonArgsColorLocation {
  @scala.inline
  def apply(
    location: js.Array[Double],
    color: String | AnonDark = null,
    name: String = null,
    onClick: /* repeated */ js.Any => _ = null,
    onHover: /* repeated */ js.Any => _ = null
  ): AnonArgsColorLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    __obj.asInstanceOf[AnonArgsColorLocation]
  }
}

