package typings.electronPublish.mod

import typings.electronPublish.progressMod.ProgressBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish", "ProgressCallback")
@js.native
class ProgressCallback protected ()
  extends typings.electronPublish.progressMod.ProgressCallback {
  def this(progressBar: ProgressBar) = this()
}

