package typings.antdMobile.flexFlexMod

import typings.antdMobile.antdMobileStrings.`column-reverse`
import typings.antdMobile.antdMobileStrings.`row-reverse`
import typings.antdMobile.antdMobileStrings.`wrap-reverse`
import typings.antdMobile.antdMobileStrings.around
import typings.antdMobile.antdMobileStrings.baseline
import typings.antdMobile.antdMobileStrings.between
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.column
import typings.antdMobile.antdMobileStrings.end
import typings.antdMobile.antdMobileStrings.nowrap
import typings.antdMobile.antdMobileStrings.row
import typings.antdMobile.antdMobileStrings.start
import typings.antdMobile.antdMobileStrings.stretch
import typings.antdMobile.antdMobileStrings.wrap
import typings.antdMobile.flexPropsTypeMod.FlexPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps extends FlexPropsType {
  var alignContent: js.UndefOr[start | end | center | between | around | stretch] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    alignContent: start | end | center | between | around | stretch = null,
    className: String = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    onClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    role: String = null,
    style: CSSProperties = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

