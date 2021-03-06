package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.audio
import typings.xrm.xrmStrings.image
import typings.xrm.xrmStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Possible file types for Xrm.Device.pickFile options
  * @see {@link Xrm.Device.PickFileTypes}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.audio
  - typings.xrm.xrmStrings.video
  - typings.xrm.xrmStrings.image
*/
trait DevicePickFileType extends js.Object

object DevicePickFileType {
  @scala.inline
  def Audio: audio = this.cast("audio")
  @scala.inline
  def Image: image = this.cast("image")
  @scala.inline
  def Video: video = this.cast("video")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

