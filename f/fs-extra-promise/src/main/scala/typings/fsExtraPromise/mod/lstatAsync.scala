package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "lstatAsync")
@js.native
object lstatAsync extends js.Object {
  def apply(path: String): ^[typings.node.fsMod.Stats] = js.native
}

