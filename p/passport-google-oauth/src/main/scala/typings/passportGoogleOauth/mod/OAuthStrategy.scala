package typings.passportGoogleOauth.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth", "OAuthStrategy")
@js.native
class OAuthStrategy protected () extends Strategy {
  def this(
    options: IOAuthStrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyFunction, 
        Unit
      ]
  ) = this()
  @JSName("name")
  var name_OAuthStrategy: String = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

