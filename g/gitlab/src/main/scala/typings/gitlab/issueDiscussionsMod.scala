package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssueDiscussions", JSImport.Namespace)
@js.native
object issueDiscussionsMod extends js.Object {
  @js.native
  class IssueDiscussions () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
  
}

