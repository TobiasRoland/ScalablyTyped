package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAoStatesHoverAnimationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The duration of the hover animation in
    * milliseconds. By default the hover state animates quickly in, and slowly
    * back to normal.
    */
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotAoStatesHoverAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotAoStatesHoverAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAoStatesHoverAnimationOptions]
  }
}

