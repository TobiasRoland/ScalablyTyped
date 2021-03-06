package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentStatus extends js.Object

/**
  * Specifies whether an attachment was added to or removed from an item.
  * 
  * [Api set: Mailbox 1.8]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentStatus")
@js.native
object AttachmentStatus extends js.Object {
  /**
    * An attachment was added to the item.
    */
  @js.native
  sealed trait Added extends AttachmentStatus
  
  /**
    * An attachment was removed from the item.
    */
  @js.native
  sealed trait Removed extends AttachmentStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttachmentStatus with String] = js.native
  /* "added" */ @js.native
  object Added extends TopLevel[Added with String]
  
  /* "removed" */ @js.native
  object Removed extends TopLevel[Removed with String]
  
}

