package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/GetKeyPolicyOutput", JSImport.Namespace)
@js.native
object typesGetKeyPolicyOutputMod extends js.Object {
  @js.native
  trait GetKeyPolicyOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A key policy document in JSON format.</p>
      */
    var Policy: js.UndefOr[String] = js.native
  }
  
}

