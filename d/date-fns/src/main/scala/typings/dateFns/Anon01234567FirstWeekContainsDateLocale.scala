package typings.dateFns

import typings.dateFns.dateFnsNumbers.`0`
import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import typings.dateFns.dateFnsNumbers.`4`
import typings.dateFns.dateFnsNumbers.`5`
import typings.dateFns.dateFnsNumbers.`6`
import typings.dateFns.dateFnsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon01234567FirstWeekContainsDateLocale extends js.Object {
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object Anon01234567FirstWeekContainsDateLocale {
  @scala.inline
  def apply(
    firstWeekContainsDate: `1` | `2` | `3` | `4` | `5` | `6` | `7` = null,
    locale: typings.dateFns.mod.Locale = null,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): Anon01234567FirstWeekContainsDateLocale = {
    val __obj = js.Dynamic.literal()
    if (firstWeekContainsDate != null) __obj.updateDynamic("firstWeekContainsDate")(firstWeekContainsDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon01234567FirstWeekContainsDateLocale]
  }
}

