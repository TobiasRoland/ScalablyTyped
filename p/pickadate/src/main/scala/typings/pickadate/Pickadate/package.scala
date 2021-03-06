package typings.pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Pickadate {
  type MinOrMaxDateOption = typings.std.Date | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | scala.Double | scala.Boolean
  type MinOrMaxTimeOption = typings.std.Date | (js.Tuple2[scala.Double, scala.Double]) | scala.Double | scala.Boolean
}
