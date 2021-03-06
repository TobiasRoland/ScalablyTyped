package typings.officeUiFabricReact.calendarYearMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYearHeaderProps
  extends ICalendarYearProps
     with ICalendarYearRange {
  var onSelectNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSelectPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ICalendarYearHeaderProps {
  @scala.inline
  def apply(
    fromYear: Double,
    toYear: Double,
    className: String = null,
    maxYear: Int | Double = null,
    minYear: Int | Double = null,
    navigatedYear: Int | Double = null,
    navigationIcons: ICalendarIconStrings = null,
    onHeaderSelect: /* focus */ Boolean => Unit = null,
    onRenderTitle: /* props */ ICalendarYearHeaderProps => ReactNode = null,
    onRenderYear: /* year */ Double => ReactNode = null,
    onSelectNext: () => Unit = null,
    onSelectPrev: () => Unit = null,
    onSelectYear: /* year */ Double => Unit = null,
    selectedYear: Int | Double = null,
    strings: ICalendarYearStrings = null
  ): ICalendarYearHeaderProps = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (navigatedYear != null) __obj.updateDynamic("navigatedYear")(navigatedYear.asInstanceOf[js.Any])
    if (navigationIcons != null) __obj.updateDynamic("navigationIcons")(navigationIcons.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1(onHeaderSelect))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction1(onRenderTitle))
    if (onRenderYear != null) __obj.updateDynamic("onRenderYear")(js.Any.fromFunction1(onRenderYear))
    if (onSelectNext != null) __obj.updateDynamic("onSelectNext")(js.Any.fromFunction0(onSelectNext))
    if (onSelectPrev != null) __obj.updateDynamic("onSelectPrev")(js.Any.fromFunction0(onSelectPrev))
    if (onSelectYear != null) __obj.updateDynamic("onSelectYear")(js.Any.fromFunction1(onSelectYear))
    if (selectedYear != null) __obj.updateDynamic("selectedYear")(selectedYear.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearHeaderProps]
  }
}

