package typings.storybookComponents.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.storybookComponents.storybookComponentsStrings.valid
  - typings.storybookComponents.storybookComponentsStrings.error
  - typings.storybookComponents.storybookComponentsStrings.warn
*/
trait ValidationStates extends js.Object

object ValidationStates {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.storybookComponents.storybookComponentsStrings.error = this.cast("error")
  @scala.inline
  def valid: typings.storybookComponents.storybookComponentsStrings.valid = this.cast("valid")
  @scala.inline
  def warn: typings.storybookComponents.storybookComponentsStrings.warn = this.cast("warn")
}

