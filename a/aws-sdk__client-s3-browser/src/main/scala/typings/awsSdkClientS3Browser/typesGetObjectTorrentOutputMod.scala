package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetObjectTorrentOutput", JSImport.Namespace)
@js.native
object typesGetObjectTorrentOutputMod extends js.Object {
  @js.native
  trait GetObjectTorrentOutput[StreamType] extends MetadataBearer {
    /**
      * _Body shape
      */
    var Body: js.UndefOr[StreamType] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  
}

