package typings.googleGax.mod.fallback.protobuf

import typings.protobufjs.mod.RPCImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.rpc")
@js.native
object rpc extends js.Object {
  /** An RPC service as returned by {@link Service#create}. */
  @js.native
  class Service protected ()
    extends typings.googleGax.fallbackMod.protobuf.rpc.Service {
    /**
      * Constructs a new RPC service instance.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      */
    def this(rpcImpl: RPCImpl) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  }
  
}

