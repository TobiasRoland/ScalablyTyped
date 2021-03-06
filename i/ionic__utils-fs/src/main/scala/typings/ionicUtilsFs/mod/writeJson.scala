package typings.ionicUtilsFs.mod

import typings.fsExtra.mod.WriteOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "writeJson")
@js.native
object writeJson extends js.Object {
  def apply(file: String, `object`: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(file: String, `object`: js.Any, options: WriteOptions): js.Promise[Unit] = js.native
  def apply(
    file: String,
    `object`: js.Any,
    options: WriteOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
}

