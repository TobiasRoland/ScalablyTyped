package typings.jestCli

import typings.jestTypes.configMod.Path
import typings.std.Partial
import typings.yargs.mod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli/build/cli", JSImport.Namespace)
@js.native
object cliMod extends js.Object {
  def buildArgv(): Arguments[Partial[AnonAll]] = js.native
  def buildArgv(maybeArgv: js.Array[String]): Arguments[Partial[AnonAll]] = js.native
  def run(): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String]): js.Promise[Unit] = js.native
  def run(maybeArgv: js.Array[String], project: Path): js.Promise[Unit] = js.native
}

