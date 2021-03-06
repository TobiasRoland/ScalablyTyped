package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTablePopover extends js.Object {
  var action: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var anchorEl: js.UndefOr[ReactNode] = js.undefined
  var anchorOrigin: js.UndefOr[js.Any] = js.undefined
  var elevation: js.UndefOr[Double] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var onExited: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var option: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[js.Any] = js.undefined
  var transformOrigin: js.UndefOr[js.Any] = js.undefined
}

object MUIDataTablePopover {
  @scala.inline
  def apply(
    action: /* args */ js.Any => _ = null,
    anchorEl: ReactNode = null,
    anchorOrigin: js.Any = null,
    elevation: Int | Double = null,
    onClose: /* args */ js.Any => _ = null,
    onExited: /* args */ js.Any => _ = null,
    option: js.UndefOr[Boolean] = js.undefined,
    ref: js.Any = null,
    transformOrigin: js.Any = null
  ): MUIDataTablePopover = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (!js.isUndefined(option)) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTablePopover]
  }
}

