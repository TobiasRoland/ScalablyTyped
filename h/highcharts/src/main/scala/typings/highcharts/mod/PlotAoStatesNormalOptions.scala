package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAoStatesNormalOptions extends js.Object {
  /**
    * (Highstock) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
}

object PlotAoStatesNormalOptions {
  @scala.inline
  def apply(animation: Boolean | AnimationOptionsObject = null): PlotAoStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAoStatesNormalOptions]
  }
}

