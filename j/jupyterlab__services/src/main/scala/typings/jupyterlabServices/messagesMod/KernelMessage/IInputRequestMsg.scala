package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.AnonPassword
import typings.jupyterlabServices.jupyterlabServicesStrings.input_request
import typings.jupyterlabServices.jupyterlabServicesStrings.stdin
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'input_request'` message on the `'stdin'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
  */
trait IInputRequestMsg
  extends IStdinMessage[input_request]
     with _Message {
  @JSName("content")
  var content_IInputRequestMsg: AnonPassword
}

object IInputRequestMsg {
  @scala.inline
  def apply(
    channel: stdin,
    content: AnonPassword,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IInputRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputRequestMsg]
  }
}

