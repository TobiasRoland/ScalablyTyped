package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dateFilterMod {
  type IDateComparatorFunc = js.Function2[
    /* filterLocalDateAtMidnight */ typings.std.Date, 
    /* cellValue */ js.Any, 
    scala.Double
  ]
}
