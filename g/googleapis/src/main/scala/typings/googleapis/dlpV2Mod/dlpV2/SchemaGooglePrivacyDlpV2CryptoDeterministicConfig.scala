package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pseudonymization method that generates deterministic encryption for the
  * given input. Outputs a base64 encoded representation of the encrypted
  * output. Uses AES-SIV based on the RFC https://tools.ietf.org/html/rfc5297.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CryptoDeterministicConfig extends js.Object {
  /**
    * Optional. A context may be used for higher security and maintaining
    * referential integrity such that the same identifier in two different
    * contexts will be given a distinct surrogate. The context is appended to
    * plaintext value being encrypted. On decryption the provided context is
    * validated against the value used during encryption. If a context was
    * provided during encryption, same context must be provided during
    * decryption as well.  If the context is not set, plaintext would be used
    * as is for encryption. If the context is set but:  1. there is no record
    * present when transforming a given value or 2. the field is not present
    * when transforming a given value,  plaintext would be used as is for
    * encryption.  Note that case (1) is expected when an
    * `InfoTypeTransformation` is applied to both structured and non-structured
    * `ContentItem`s.
    */
  var context: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * The key used by the encryption function.
    */
  var cryptoKey: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoKey] = js.native
  /**
    * The custom info type to annotate the surrogate with. This annotation will
    * be applied to the surrogate by prefixing it with the name of the custom
    * info type followed by the number of characters comprising the surrogate.
    * The following scheme defines the format: &lt;info type
    * name&gt;(&lt;surrogate character count&gt;):&lt;surrogate&gt;  For
    * example, if the name of custom info type is &#39;MY_TOKEN_INFO_TYPE&#39;
    * and the surrogate is &#39;abc&#39;, the full replacement value will be:
    * &#39;MY_TOKEN_INFO_TYPE(3):abc&#39;  This annotation identifies the
    * surrogate when inspecting content using the custom info type
    * &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it
    * occurs in free text.  In order for inspection to work properly, the name
    * of this info type must not occur naturally anywhere in your data;
    * otherwise, inspection may either  - reverse a surrogate that does not
    * correspond to an actual identifier - be unable to parse the surrogate and
    * result in an error  Therefore, choose your custom info type name
    * carefully after considering what your data looks like. One way to select
    * a name that has a high chance of yielding reliable detection is to
    * include one or more unicode characters that are highly improbable to
    * exist in your data. For example, assuming your data is entered from a
    * regular ASCII keyboard, the symbol with the hex code point 29DD might be
    * used like so: ⧝MY_TOKEN_TYPE
    */
  var surrogateInfoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}

object SchemaGooglePrivacyDlpV2CryptoDeterministicConfig {
  @scala.inline
  def apply(
    context: SchemaGooglePrivacyDlpV2FieldId = null,
    cryptoKey: SchemaGooglePrivacyDlpV2CryptoKey = null,
    surrogateInfoType: SchemaGooglePrivacyDlpV2InfoType = null
  ): SchemaGooglePrivacyDlpV2CryptoDeterministicConfig = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (cryptoKey != null) __obj.updateDynamic("cryptoKey")(cryptoKey.asInstanceOf[js.Any])
    if (surrogateInfoType != null) __obj.updateDynamic("surrogateInfoType")(surrogateInfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoDeterministicConfig]
  }
}

