package typings.pinoStdSerializers.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", "req")
@js.native
object req extends js.Object {
  def apply(req: IncomingMessage): SerializedRequest = js.native
}

