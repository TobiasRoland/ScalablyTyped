package typings.restifyPlugins.mod

import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", "requestExpiry")
@js.native
object requestExpiry extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: RequestExpiryOptions): RequestHandler = js.native
}

