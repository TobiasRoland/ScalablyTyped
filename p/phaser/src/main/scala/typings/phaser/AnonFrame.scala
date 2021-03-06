package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrame extends js.Object {
  /**
    * An optional frame from the Texture this Game Object is rendering with.
    */
  var frame: js.UndefOr[Double | String] = js.undefined
  /**
    * The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    */
  var key: js.UndefOr[String] = js.undefined
}

object AnonFrame {
  @scala.inline
  def apply(frame: Double | String = null, key: String = null): AnonFrame = {
    val __obj = js.Dynamic.literal()
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrame]
  }
}

