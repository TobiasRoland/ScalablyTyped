package typings.winrtUwp

import typings.winrtUwp.Windows.Media.Protection.PlayReady.NDMediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnValueStreamType extends js.Object {
  /** The stream identifier for the media stream. */ var returnValue: Double
  /** The type of the media stream. This type can be either Audio or Video. */ var streamType: NDMediaStreamType
}

object AnonReturnValueStreamType {
  @scala.inline
  def apply(returnValue: Double, streamType: NDMediaStreamType): AnonReturnValueStreamType = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReturnValueStreamType]
  }
}

