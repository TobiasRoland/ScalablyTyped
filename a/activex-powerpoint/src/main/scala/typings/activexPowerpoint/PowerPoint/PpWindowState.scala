package typings.activexPowerpoint.PowerPoint

import typings.activexPowerpoint.activexPowerpointNumbers.`1`
import typings.activexPowerpoint.activexPowerpointNumbers.`2`
import typings.activexPowerpoint.activexPowerpointNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexPowerpoint.activexPowerpointNumbers.`3`
  - typings.activexPowerpoint.activexPowerpointNumbers.`2`
  - typings.activexPowerpoint.activexPowerpointNumbers.`1`
*/
trait PpWindowState extends js.Object

object PpWindowState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ppWindowMaximized: `3` = this.cast(3)
  @scala.inline
  def ppWindowMinimized: `2` = this.cast(2)
  @scala.inline
  def ppWindowNormal: `1` = this.cast(1)
}

