package typings.arangodb.oauth1Mod

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.AnonHeaders
import typings.arangodb.ArangoDB.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth1Client extends js.Object {
  def createSignedRequest(
    method: HttpMethod,
    url: String,
    parameters: String,
    oauth_token: String,
    oauth_token_secret: String
  ): AnonHeaders = js.native
  def createSignedRequest(
    method: HttpMethod,
    url: String,
    parameters: StringDictionary[js.UndefOr[String]],
    oauth_token: String,
    oauth_token_secret: String
  ): AnonHeaders = js.native
  def createSignedRequest(method: HttpMethod, url: String, parameters: Null, oauth_token: String, oauth_token_secret: String): AnonHeaders = js.native
  def exchangeRequestToken(oauth_token: String, oauth_verifier: String): js.Any = js.native
  def exchangeRequestToken(oauth_token: String, oauth_verifier: String, qs: StringDictionary[js.UndefOr[String]]): js.Any = js.native
  def fetchActiveUser(oauth_token: String, oauth_token_secret: String): js.Any = js.native
  def fetchActiveUser(oauth_token: String, oauth_token_secret: String, qs: StringDictionary[js.UndefOr[String]]): js.Any = js.native
  def fetchRequestToken(oauth_callback: String): js.Any = js.native
  def fetchRequestToken(oauth_callback: String, qs: StringDictionary[js.UndefOr[String]]): js.Any = js.native
  def getAuthUrl(oauth_token: String): String = js.native
  def getAuthUrl(oauth_token: String, qs: StringDictionary[js.UndefOr[String]]): String = js.native
}

