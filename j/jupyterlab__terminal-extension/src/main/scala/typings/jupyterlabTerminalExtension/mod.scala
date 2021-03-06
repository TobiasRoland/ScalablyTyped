package typings.jupyterlabTerminalExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typings.jupyterlabTerminal.tokensMod.ITerminal.IOptions
import typings.jupyterlabTerminal.tokensMod.ITerminal.ITerminal
import typings.jupyterlabTerminal.tokensMod.ITerminalTracker
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The default terminal extension.
    */
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: Partial[IOptions]
  ): Unit = js.native
}

