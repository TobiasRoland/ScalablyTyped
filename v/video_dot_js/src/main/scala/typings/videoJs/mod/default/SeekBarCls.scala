package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.SliderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "SeekBar")
@js.native
class SeekBarCls protected ()
  extends typings.videoJs.mod.videojs.SeekBar {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: SliderOptions) = this()
}

