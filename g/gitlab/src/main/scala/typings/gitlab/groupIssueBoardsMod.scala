package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceIssueBoards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/GroupIssueBoards", JSImport.Namespace)
@js.native
object groupIssueBoardsMod extends js.Object {
  @js.native
  class GroupIssueBoards () extends ResourceIssueBoards {
    def this(options: BaseServiceOptions) = this()
  }
  
}

