package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Space extends js.Object {
  /**
    * Set space between bars in bar charts
    */
  var space: js.UndefOr[Double] = js.undefined
  /**
    * Change the width of bar chart. If ratio is specified, change the width of bar chart by ratio.
    */
  var width: js.UndefOr[Double | Anon_Max] = js.undefined
  /**
    * Set if min or max value will be 0 on bar chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.undefined
}

object Anon_Space {
  @scala.inline
  def apply(
    space: Int | Double = null,
    width: Double | Anon_Max = null,
    zerobased: js.UndefOr[Boolean] = js.undefined
  ): Anon_Space = {
    val __obj = js.Dynamic.literal()
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zerobased)) __obj.updateDynamic("zerobased")(zerobased)
    __obj.asInstanceOf[Anon_Space]
  }
}

