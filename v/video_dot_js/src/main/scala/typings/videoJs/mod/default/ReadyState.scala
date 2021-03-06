package typings.videoJs.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "ReadyState")
@js.native
object ReadyState extends js.Object {
  /* 2 */ val HaveCurrentData: typings.videoJs.mod.videojs.ReadyState.HaveCurrentData with Double = js.native
  /* 4 */ val HaveEnoughData: typings.videoJs.mod.videojs.ReadyState.HaveEnoughData with Double = js.native
  /* 3 */ val HaveFutureData: typings.videoJs.mod.videojs.ReadyState.HaveFutureData with Double = js.native
  /* 1 */ val HaveMetadata: typings.videoJs.mod.videojs.ReadyState.HaveMetadata with Double = js.native
  /* 0 */ val HaveNothing: typings.videoJs.mod.videojs.ReadyState.HaveNothing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.videoJs.mod.videojs.ReadyState with Double] = js.native
}

