package typings.gulpMocha

import typings.mocha.MochaSetupOptions
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-mocha", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(setupOptions: MochaSetupOptions): ReadWriteStream = js.native
}

