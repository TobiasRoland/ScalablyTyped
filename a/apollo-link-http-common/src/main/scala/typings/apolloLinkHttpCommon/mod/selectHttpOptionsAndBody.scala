package typings.apolloLinkHttpCommon.mod

import typings.apolloLink.typesMod.Operation
import typings.apolloLinkHttpCommon.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-http-common", "selectHttpOptionsAndBody")
@js.native
object selectHttpOptionsAndBody extends js.Object {
  def apply(operation: Operation, fallbackConfig: HttpConfig, configs: HttpConfig*): AnonBody = js.native
}

