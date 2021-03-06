package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.jupyterlabServicesStrings.control
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A kernel message on the `'control'` channel.
  */
trait IControlMessage[T /* <: ControlMessageType */] extends IMessage[T] {
  @JSName("channel")
  var channel_IControlMessage: control
}

object IControlMessage {
  @scala.inline
  def apply[T /* <: ControlMessageType */](
    channel: control,
    content: /* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.Message['content'] */ js.Any,
    header: IHeader[T],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IControlMessage[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlMessage[T]]
  }
}

