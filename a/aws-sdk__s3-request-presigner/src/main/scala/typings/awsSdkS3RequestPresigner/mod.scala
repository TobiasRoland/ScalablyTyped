package typings.awsSdkS3RequestPresigner

import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.service
import typings.awsSdkS3RequestPresigner.awsSdkS3RequestPresignerStrings.uriEscapePath
import typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4Init
import typings.awsSdkTypes.signatureMod.RequestPresigner
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/s3-request-presigner", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class S3RequestPresigner protected () extends RequestPresigner {
    def this(hasServiceUriEscapePathRest: PartialBy[SignatureV4Init with SignatureV4CryptoInit, service | uriEscapePath]) = this()
    val signer: js.Any = js.native
  }
  
  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PartialBy[T, K /* <: String */] = (Omit[T, K]) with (Partial[Pick[T, K]])
}

