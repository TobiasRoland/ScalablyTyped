package typings.activexOutlook.Outlook

import typings.activexOutlook.activexOutlookNumbers.`0`
import typings.activexOutlook.activexOutlookNumbers.`1`
import typings.activexOutlook.activexOutlookNumbers.`2`
import typings.activexOutlook.activexOutlookNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOutlook.activexOutlookNumbers.`3`
  - typings.activexOutlook.activexOutlookNumbers.`2`
  - typings.activexOutlook.activexOutlookNumbers.`0`
  - typings.activexOutlook.activexOutlookNumbers.`1`
*/
trait OlMailRecipientType extends js.Object

object OlMailRecipientType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olBCC: `3` = this.cast(3)
  @scala.inline
  def olCC: `2` = this.cast(2)
  @scala.inline
  def olOriginator: `0` = this.cast(0)
  @scala.inline
  def olTo: `1` = this.cast(1)
}

