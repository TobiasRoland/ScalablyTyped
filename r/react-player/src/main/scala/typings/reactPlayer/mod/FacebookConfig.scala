package typings.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacebookConfig extends js.Object {
  var appId: String
}

object FacebookConfig {
  @scala.inline
  def apply(appId: String): FacebookConfig = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FacebookConfig]
  }
}

