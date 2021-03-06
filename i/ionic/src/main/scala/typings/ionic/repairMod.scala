package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/repair", JSImport.Namespace)
@js.native
object repairMod extends js.Object {
  @js.native
  class RepairCommand () extends Command {
    def cordovaRepair(cordova: Required[ProjectIntegration], runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

