package typings.meteorDashTypings.meteorHttpMod.HTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/http", "HTTP.post")
@js.native
object post extends js.Object {
  def apply(url: String): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest): HTTPResponse = js.native
  def apply(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}

