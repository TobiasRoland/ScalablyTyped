package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.admin
import typings.octokitRest.octokitRestStrings.pull
import typings.octokitRest.octokitRestStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateRepoLegacyParams extends js.Object {
  var owner: String
  /**
    * The permission to grant the team on this repository. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer this repository.
    * \* `push` - team members can pull and push, but not administer this repository.
    * \* `admin` - team members can pull, push and administer this repository.
    *
    * If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
  var repo: String
  var team_id: Double
}

object TeamsAddOrUpdateRepoLegacyParams {
  @scala.inline
  def apply(owner: String, repo: String, team_id: Double, permission: pull | push | admin = null): TeamsAddOrUpdateRepoLegacyParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateRepoLegacyParams]
  }
}

