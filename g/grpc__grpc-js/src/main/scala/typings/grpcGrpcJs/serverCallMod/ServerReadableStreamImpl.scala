package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.AnonCancelled
import typings.grpcGrpcJs.AnonRead
import typings.grpcGrpcJs.eventsMod.EmitterAugmentation1
import typings.grpcGrpcJs.grpcGrpcJsStrings.data
import typings.grpcGrpcJs.makeClientMod.Deserialize
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.objectStreamMod.IntermediateObjectReadable
import typings.node.AnonEnd
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server-call", "ServerReadableStreamImpl")
@js.native
class ServerReadableStreamImpl[RequestType, ResponseType] protected ()
  extends IntermediateObjectReadable[RequestType]
     with AnonCancelled
     with AnonRead[RequestType]
     with EmitterAugmentation1[data, RequestType] {
  def this(
    call: Http2ServerCallStream[RequestType, ResponseType],
    metadata: Metadata,
    deserialize: Deserialize[RequestType]
  ) = this()
  var call: js.Any = js.native
  /* CompleteClass */
  override var cancelled: Boolean = js.native
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  var metadata: Metadata = js.native
  /* CompleteClass */
  override def addListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  def deserialize(bytes: Buffer): RequestType = js.native
  /* CompleteClass */
  override def emit(event: data, arg1: RequestType): Boolean = js.native
  /* CompleteClass */
  override def getPeer(): String = js.native
  /* CompleteClass */
  override def on(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* CompleteClass */
  override def once(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  /* CompleteClass */
  override def prependListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* CompleteClass */
  override def prependOnceListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def read(): RequestType with (String | Buffer) = js.native
  /* InferMemberOverrides */
  override def read(size: Double): RequestType with (String | Buffer) = js.native
  /* CompleteClass */
  override def removeListener(event: data, listener: js.Function1[RequestType, Unit]): this.type = js.native
  /* CompleteClass */
  override def sendMetadata(responseMetadata: Metadata): Unit = js.native
}

