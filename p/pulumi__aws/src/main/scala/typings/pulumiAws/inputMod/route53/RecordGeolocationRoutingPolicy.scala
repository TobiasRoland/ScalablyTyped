package typings.pulumiAws.inputMod.route53

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordGeolocationRoutingPolicy extends js.Object {
  /**
    * A two-letter continent code. See http://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html for code details. Either `continent` or `country` must be specified.
    */
  var continent: js.UndefOr[Input[String]] = js.native
  /**
    * A two-character country code or `*` to indicate a default resource record set.
    */
  var country: js.UndefOr[Input[String]] = js.native
  /**
    * A subdivision code for a country.
    */
  var subdivision: js.UndefOr[Input[String]] = js.native
}

object RecordGeolocationRoutingPolicy {
  @scala.inline
  def apply(continent: Input[String] = null, country: Input[String] = null, subdivision: Input[String] = null): RecordGeolocationRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (subdivision != null) __obj.updateDynamic("subdivision")(subdivision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordGeolocationRoutingPolicy]
  }
}

