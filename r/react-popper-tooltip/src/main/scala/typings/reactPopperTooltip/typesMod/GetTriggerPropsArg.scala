package typings.reactPopperTooltip.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTriggerPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
}

object GetTriggerPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onBlur: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onClick: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onContextMenu: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onFocus: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onMouseEnter: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onMouseLeave: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onMouseMove: /* event */ SyntheticEvent[Element, Event_] => Unit = null,
    onTouchEnd: /* event */ SyntheticEvent[Element, Event_] => Unit = null
  ): GetTriggerPropsArg = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[GetTriggerPropsArg]
  }
}

