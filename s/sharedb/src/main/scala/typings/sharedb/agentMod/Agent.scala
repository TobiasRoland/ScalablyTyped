package typings.sharedb.agentMod

import typings.node.streamMod.Duplex
import typings.sharedb.AnonIsServer
import typings.sharedb.sharedbMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `Agent` is the representation of a client's `Connection` state on the
  * server. If the `Connection` was created through `backend.connect` (i.e. the
  * client is running in the same Node process as the server), then the `Agent`
  * associated with a `Connection` can be accessed through `connection.agent`.
  *
  * The `Agent` will be made available in all middleware requests. The
  * `agent.custom` field is an object that can be used for storing arbitrary
  * information for use in middleware.
  *
  * @see https://github.com/share/sharedb#class-sharedbagent
  */
trait Agent extends js.Object {
  var backend: typings.sharedb.mod.^
  /**
    * Object for custom use in middleware to store app-specific state for a
    * given client session. It is in memory only as long as the session is
    * active, and it is passed to each middleware call.
    */
  var custom: Custom
  var stream: Duplex with AnonIsServer
  /**
    * Sends a JSON-compatible message to the client for this agent.
    *
    * @param message
    */
  def send(message: JSONObject): Unit
}

object Agent {
  @scala.inline
  def apply(
    backend: typings.sharedb.mod.^,
    custom: Custom,
    send: JSONObject => Unit,
    stream: Duplex with AnonIsServer
  ): Agent = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Agent]
  }
}

