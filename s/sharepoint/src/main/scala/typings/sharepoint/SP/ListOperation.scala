package typings.sharepoint.SP

import typings.sharepoint.AnonFsObjType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ListOperation")
@js.native
object ListOperation extends js.Object {
  @js.native
  object Overrides extends js.Object {
    def overrideDeleteConfirmation(listId: String, overrideText: String): Unit = js.native
  }
  
  @js.native
  object Selection extends js.Object {
    def deselectAllListItems(iid: String): Unit = js.native
    def getSelectedItems(): js.Array[AnonFsObjType] = js.native
    def getSelectedList(): String = js.native
    def getSelectedView(): String = js.native
    def navigateUp(viewId: String): Unit = js.native
    def selectListItem(iid: String, bSelect: Boolean): Unit = js.native
  }
  
  @js.native
  object ViewOperation extends js.Object {
    def getSelectedView(): String = js.native
    def navigateUp(viewId: String): Unit = js.native
    def refreshView(viewId: String): Unit = js.native
  }
  
}

