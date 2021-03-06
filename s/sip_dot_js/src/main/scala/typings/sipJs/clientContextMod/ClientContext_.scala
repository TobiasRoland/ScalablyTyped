package typings.sipJs.clientContextMod

import typings.events.mod.EventEmitter
import typings.sipJs.clientContextMod.ClientContext.Options
import typings.sipJs.coreMod.IncomingResponseMessage
import typings.sipJs.coreMod.Logger
import typings.sipJs.coreMod.NameAddrHeader
import typings.sipJs.coreMod.OutgoingRequestMessage
import typings.sipJs.coreMod.URI
import typings.sipJs.enumsMod.TypeStrings
import typings.sipJs.libSessionDescriptionHandlerMod.BodyObj
import typings.sipJs.uAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ClientContext", "ClientContext")
@js.native
class ClientContext_ protected () extends EventEmitter {
  def this(ua: UA, method: String, target: String) = this()
  def this(ua: UA, method: String, target: URI) = this()
  def this(ua: UA, method: String, target: String, options: Options) = this()
  def this(ua: UA, method: String, target: URI, options: Options) = this()
  var body: js.UndefOr[BodyObj] = js.native
  var data: js.Any = js.native
  var localIdentity: NameAddrHeader = js.native
  var logger: Logger = js.native
  var method: String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var request: OutgoingRequestMessage = js.native
  var `type`: TypeStrings = js.native
  var ua: UA = js.native
  def onRequestTimeout(): Unit = js.native
  def onTransportError(): Unit = js.native
  def receiveResponse(response: IncomingResponseMessage): Unit = js.native
  def send(): this.type = js.native
}

