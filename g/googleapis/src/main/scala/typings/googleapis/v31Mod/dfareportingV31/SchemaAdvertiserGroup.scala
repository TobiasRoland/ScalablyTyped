package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups advertisers together so that reports can be generated for the entire
  * group at once.
  */
@js.native
trait SchemaAdvertiserGroup extends js.Object {
  /**
    * Account ID of this advertiser group. This is a read-only field that can
    * be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * ID of this advertiser group. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this advertiser group. This is a required field and must be less
    * than 256 characters long and unique among advertiser groups of the same
    * account.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAdvertiserGroup {
  @scala.inline
  def apply(accountId: String = null, id: String = null, kind: String = null, name: String = null): SchemaAdvertiserGroup = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdvertiserGroup]
  }
}

