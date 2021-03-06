package typings.highcharts.highmapsMod

import typings.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "Pointer")
@js.native
class Pointer protected ()
  extends typings.highcharts.mod.Pointer {
  /**
    * The mouse and touch tracker object. Each Chart item has one assosiated
    * Pointer item that can be accessed from the Chart.pointer property.
    *
    * @param chart
    *        The Chart instance.
    *
    * @param options
    *        The root options object. The pointer uses options from the chart
    *        and tooltip structures.
    */
  def this(chart: typings.highcharts.mod.Chart_, options: Options) = this()
}

