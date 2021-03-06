package typings.thrift.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "HttpConnection")
@js.native
class HttpConnection protected () extends EventEmitter {
  def this(host: String, port: Double) = this()
  def this(host: String, port: Double, options: ConnectOptions) = this()
  var host: String = js.native
  var https: Boolean = js.native
  var options: ConnectOptions = js.native
  var port: Double = js.native
  var protocol: TProtocol = js.native
  var transport: TTransport = js.native
  def responseCallback(response: IncomingMessage): Unit = js.native
  def write(data: Buffer): Unit = js.native
}

