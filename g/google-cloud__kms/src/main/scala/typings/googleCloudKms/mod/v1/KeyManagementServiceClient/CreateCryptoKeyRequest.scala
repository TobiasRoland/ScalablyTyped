package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.googleCloudKms.AnonPurpose
import typings.googleCloudKms.googleCloudKmsStrings.purpose
import typings.googleCloudKms.mod.v1.CryptoKey
import typings.googleCloudKms.mod.v1.Omit
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCryptoKeyRequest extends js.Object {
  var cryptoKey: (Partial[Omit[CryptoKey, purpose]]) with AnonPurpose
  var cryptoKeyId: String
  var parent: String
  var skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
}

object CreateCryptoKeyRequest {
  @scala.inline
  def apply(
    cryptoKey: (Partial[Omit[CryptoKey, purpose]]) with AnonPurpose,
    cryptoKeyId: String,
    parent: String,
    skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
  ): CreateCryptoKeyRequest = {
    val __obj = js.Dynamic.literal(cryptoKey = cryptoKey.asInstanceOf[js.Any], cryptoKeyId = cryptoKeyId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInitialVersionCreation)) __obj.updateDynamic("skipInitialVersionCreation")(skipInitialVersionCreation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCryptoKeyRequest]
  }
}

