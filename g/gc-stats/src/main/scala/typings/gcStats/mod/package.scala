package typings.gcStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GCStatsListener = js.Function1[/* stats */ typings.gcStats.mod.GCStatistics, scala.Unit]
}
