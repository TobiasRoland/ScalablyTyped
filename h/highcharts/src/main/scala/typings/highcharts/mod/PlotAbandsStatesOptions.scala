package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsStatesOptions extends js.Object {
  /**
    * (Highstock) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotAbandsStatesHoverOptions] = js.undefined
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotAbandsStatesInactiveOptions] = js.undefined
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotAbandsStatesNormalOptions] = js.undefined
  /**
    * (Highstock) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotAbandsStatesSelectOptions] = js.undefined
}

object PlotAbandsStatesOptions {
  @scala.inline
  def apply(
    hover: PlotAbandsStatesHoverOptions = null,
    inactive: PlotAbandsStatesInactiveOptions = null,
    normal: PlotAbandsStatesNormalOptions = null,
    select: PlotAbandsStatesSelectOptions = null
  ): PlotAbandsStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAbandsStatesOptions]
  }
}

