package typings.backlogJs.mod.Option

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.backlogJs.backlogJsStrings.asc
  - typings.backlogJs.backlogJsStrings.desc
*/
trait Order extends js.Object

object Order {
  @scala.inline
  def asc: typings.backlogJs.backlogJsStrings.asc = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typings.backlogJs.backlogJsStrings.desc = this.cast("desc")
}

