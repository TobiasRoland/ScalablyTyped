package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListSuitesForRefResponseCheckSuitesItemAppPermissions extends js.Object {
  var contents: String
  var issues: String
  var metadata: String
  var single_file: String
}

object ChecksListSuitesForRefResponseCheckSuitesItemAppPermissions {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): ChecksListSuitesForRefResponseCheckSuitesItemAppPermissions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListSuitesForRefResponseCheckSuitesItemAppPermissions]
  }
}

