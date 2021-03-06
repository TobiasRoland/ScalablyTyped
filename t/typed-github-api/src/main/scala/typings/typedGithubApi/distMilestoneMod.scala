package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesMilestoneMod.Milestone
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/milestone", JSImport.Namespace)
@js.native
object distMilestoneMod extends js.Object {
  @js.native
  class MilestoneClass protected ()
    extends GitHubRef
       with Milestone {
    def this(data: typings.typedGithubApi.milestoneMod.Milestone, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var closedIssueCount: Double = js.native
    /* CompleteClass */
    override var created: Moment = js.native
    /* CompleteClass */
    override var creator: UserSummary = js.native
    /* CompleteClass */
    override var description: String = js.native
    /* CompleteClass */
    override var due: Moment = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var number: Double = js.native
    /* CompleteClass */
    override var openIssueCount: Double = js.native
    /* CompleteClass */
    override var state: open | closed = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override var updated: Moment = js.native
  }
  
}

