package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisDateTimeLabelFormatsYearOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object YAxisDateTimeLabelFormatsYearOptions {
  @scala.inline
  def apply(main: String = null): YAxisDateTimeLabelFormatsYearOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisDateTimeLabelFormatsYearOptions]
  }
}

