package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBarStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotBarStatesInactiveAnimationOptions] = js.undefined
  /**
    * (Highcharts) Opacity of series elements (dataLabels, line, area). Set to
    * 1 to disable inactive state.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotBarStatesInactiveOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotBarStatesInactiveAnimationOptions = null,
    opacity: Int | Double = null
  ): PlotBarStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBarStatesInactiveOptions]
  }
}

