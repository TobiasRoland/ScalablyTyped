package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundTruthManifest extends js.Object {
  var S3Object: js.UndefOr[typings.awsSdk.rekognitionMod.S3Object] = js.native
}

object GroundTruthManifest {
  @scala.inline
  def apply(S3Object: S3Object = null): GroundTruthManifest = {
    val __obj = js.Dynamic.literal()
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundTruthManifest]
  }
}

