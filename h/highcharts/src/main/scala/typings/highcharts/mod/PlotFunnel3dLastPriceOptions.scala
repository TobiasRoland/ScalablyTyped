package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotFunnel3dLastPriceOptions extends js.Object {
  /**
    * (Highstock) The color of the line of last price.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Enable or disable the indicator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotFunnel3dLastPriceOptions {
  @scala.inline
  def apply(color: String = null, enabled: js.UndefOr[Boolean] = js.undefined): PlotFunnel3dLastPriceOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotFunnel3dLastPriceOptions]
  }
}

