package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVwapStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotVwapStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highstock) Opacity of series elements (dataLabels, line, area). Set to 1
    * to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotVwapStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotVwapStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotVwapStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVwapStatesInactiveOptions]
  }
}

