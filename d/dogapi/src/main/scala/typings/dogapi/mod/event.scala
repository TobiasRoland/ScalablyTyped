package typings.dogapi.mod

import org.scalablytyped.runtime.TopLevel
import typings.dogapi.AnonAggregationkey
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait event extends js.Object {
  def create(
    title: String,
    text: String,
    callback: js.Function2[/* err */ Error | Null, /* res */ EventCreateResponse, Unit]
  ): Unit = js.native
  def create(
    title: String,
    text: String,
    properties: AnonAggregationkey,
    callback: js.Function2[/* err */ Error | Null, /* res */ EventCreateResponse, Unit]
  ): Unit = js.native
}

@JSImport("dogapi", "event")
@js.native
object event extends TopLevel[event]

