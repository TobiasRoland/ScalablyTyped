package typings.testingLibraryVue.mod

import typings.std.Partial
import typings.testingLibraryDom.configMod.Config
import typings.testingLibraryDom.configMod.ConfigFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "configure")
@js.native
object configure extends js.Object {
  def apply(configDelta: Partial[Config]): Unit = js.native
  def apply(configDelta: ConfigFn): Unit = js.native
}

