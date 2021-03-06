package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/CreateBucketOutput", JSImport.Namespace)
@js.native
object typesCreateBucketOutputMod extends js.Object {
  @js.native
  trait CreateBucketOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _Location shape
      */
    var Location: js.UndefOr[String] = js.native
  }
  
}

