package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludedpermissionsFeatures extends js.Object {
  var excluded_permissions: js.Array[String]
  var features: js.Array[_]
  var interactions: AnonFollowingBoolean
  var permissions: js.Array[_]
}

object AnonExcludedpermissionsFeatures {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    features: js.Array[_],
    interactions: AnonFollowingBoolean,
    permissions: js.Array[_]
  ): AnonExcludedpermissionsFeatures = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExcludedpermissionsFeatures]
  }
}

