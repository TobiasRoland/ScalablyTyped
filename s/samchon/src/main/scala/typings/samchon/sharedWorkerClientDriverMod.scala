package typings.samchon

import typings.samchon.iprotocolMod.IProtocol
import typings.samchon.sharedWorkerCommunicatorMod.SharedWorkerCommunicator
import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/client_driver/SharedWorkerClientDriver", JSImport.Namespace)
@js.native
object sharedWorkerClientDriverMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.samchon.iprotocolMod.IProtocol because Already inherited
  - typings.samchon.icommunicatorMod.ICommunicator because Already inherited
  - typings.samchon.iclientdriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @js.native
  class SharedWorkerClientDriver protected () extends SharedWorkerCommunicator {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
    /**
      * @hidden
      */
    var listening_ : js.Any = js.native
    /**
      * @inheritdoc
      */
    /**
      * Listen message from the newly connected client.
      *
      * Starts listening message from the newly connected client. Replied message from the connected client will be
      * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
      * method.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def listen(listener: IProtocol): Unit = js.native
  }
  
}

