package typings.typedGithubApi.interfacesPullRequestMod

import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.APPROVED
import typings.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typings.typedGithubApi.typedGithubApiStrings.COMMENTED
import typings.typedGithubApi.typedGithubApiStrings.DISMISSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  var body: String
  var commitSha: String
  var createdBy: UserSummary
  var htmlUri: String
  var id: Double
  var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED
}

object Review {
  @scala.inline
  def apply(
    body: String,
    commitSha: String,
    createdBy: UserSummary,
    htmlUri: String,
    id: Double,
    state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED
  ): Review = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commitSha = commitSha.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Review]
  }
}

