package typings.stellarSdk.mod

import typings.stellarSdk.serverApiMod.ServerApi.AccountRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "AccountResponse")
@js.native
class AccountResponse protected ()
  extends typings.stellarSdk.accountResponseMod.AccountResponse {
  def this(response: AccountRecord) = this()
}

