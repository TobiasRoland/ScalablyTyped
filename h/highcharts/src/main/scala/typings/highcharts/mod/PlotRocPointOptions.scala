package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotRocPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotRocPointEventsOptions] = js.undefined
}

object PlotRocPointOptions {
  @scala.inline
  def apply(events: PlotRocPointEventsOptions = null): PlotRocPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotRocPointOptions]
  }
}

