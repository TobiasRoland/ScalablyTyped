package typings.protractor.mod

import typings.protractor.configMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Runner")
@js.native
class Runner protected ()
  extends typings.protractor.runnerMod.Runner {
  def this(config: Config) = this()
}

