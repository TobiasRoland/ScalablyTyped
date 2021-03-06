package typings.tokenizr

import typings.std.RegExp
import typings.std.RegExpExecArray
import typings.tokenizr.mod.ActionContext
import typings.tokenizr.mod.RuleAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  @JSName("action")
  var action_Original: RuleAction = js.native
  var name: String = js.native
  var pattern: RegExp = js.native
  var state: String = js.native
  def action(ctx: ActionContext, found: RegExpExecArray): Unit = js.native
}

