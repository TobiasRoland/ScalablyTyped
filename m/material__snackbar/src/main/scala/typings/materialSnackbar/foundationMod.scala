package typings.materialSnackbar

import typings.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typings.std.EventListener
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/snackbar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCSnackbarData extends js.Object {
    @JSName("actionHandler")
    var actionHandler_Original: EventListener = js.native
    var actionOnBottom: js.UndefOr[Boolean] = js.native
    var actionText: String = js.native
    var message: String = js.native
    var multiline: js.UndefOr[Boolean] = js.native
    var timeout: js.UndefOr[Double] = js.native
    def actionHandler(evt: Event_): Unit = js.native
  }
  
  @js.native
  trait MDCSnackbarFoundation
    extends typings.materialBase.foundationMod.default[MDCSnackbarAdapter] {
    val active: Boolean = js.native
    def dismissesOnAction(): Boolean = js.native
    def setDismissOnAction(dismissOnAction: Boolean): Unit = js.native
    def show(data: MDCSnackbarData): Unit = js.native
  }
  
  @js.native
  class default () extends MDCSnackbarFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typings.materialSnackbar.constantsMod.strings = js.native
  }
  
}

