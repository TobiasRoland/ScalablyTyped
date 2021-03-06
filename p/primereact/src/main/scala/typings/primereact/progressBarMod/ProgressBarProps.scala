package typings.primereact.progressBarMod

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var displayValueTemplate: js.UndefOr[js.Function1[/* value */ js.Any, Element]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var showValue: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    className: String = null,
    displayValueTemplate: /* value */ js.Any => Element = null,
    id: String = null,
    mode: String = null,
    showValue: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    unit: String = null,
    value: Int | Double = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayValueTemplate != null) __obj.updateDynamic("displayValueTemplate")(js.Any.fromFunction1(displayValueTemplate))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

