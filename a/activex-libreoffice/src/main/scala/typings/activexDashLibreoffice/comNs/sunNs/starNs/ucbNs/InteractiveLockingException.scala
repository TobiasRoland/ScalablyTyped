package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error related to locking operations.
  *
  * Various meaningful errors are derived from this exception.
  * @since OOo 3.3
  */
trait InteractiveLockingException extends ClassifiedInteractionRequest {
  /** The Url of the resource this exception is related to. */
  var Url: String
}

object InteractiveLockingException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Url: String): InteractiveLockingException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Url = Url)
  
    __obj.asInstanceOf[InteractiveLockingException]
  }
}

