package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typings.awsSdkClientSqsNode.typesSendMessageBatchResultEntryMod.UnmarshalledSendMessageBatchResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/SendMessageBatchOutput", JSImport.Namespace)
@js.native
object typesSendMessageBatchOutputMod extends js.Object {
  @js.native
  trait SendMessageBatchOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items with error details about each message that can't be enqueued.</p>
      */
    var Failed: js.Array[UnmarshalledBatchResultErrorEntry] = js.native
    /**
      * <p>A list of <code> <a>SendMessageBatchResultEntry</a> </code> items.</p>
      */
    var Successful: js.Array[UnmarshalledSendMessageBatchResultEntry] = js.native
  }
  
}

