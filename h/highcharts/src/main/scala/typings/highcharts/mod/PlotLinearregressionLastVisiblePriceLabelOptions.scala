package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionLastVisiblePriceLabelOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the label.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotLinearregressionLastVisiblePriceLabelOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotLinearregressionLastVisiblePriceLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLinearregressionLastVisiblePriceLabelOptions]
  }
}

