package typings.semanticUiPopup

import typings.semanticUiPopup.SemanticUI.Popup
import typings.semanticUiPopup.SemanticUI.PopupSettings
import typings.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typings.semanticUiPopup.semanticUiPopupStrings.`change content`
import typings.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typings.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typings.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typings.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`set position`
import typings.semanticUiPopup.semanticUiPopupStrings.destroy
import typings.semanticUiPopup.semanticUiPopupStrings.exists
import typings.semanticUiPopup.semanticUiPopupStrings.hide
import typings.semanticUiPopup.semanticUiPopupStrings.reposition
import typings.semanticUiPopup.semanticUiPopupStrings.setting
import typings.semanticUiPopup.semanticUiPopupStrings.show
import typings.semanticUiPopup.semanticUiPopupStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("popup")
  var popup_Original: Popup = js.native
  def popup(): JQuery = js.native
  def popup(settings: PopupSettings): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindclickaway(behavior: `bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindcloseonscroll(behavior: `bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindtouchclose(behavior: `bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  @JSName("popup")
  def popup_changecontent(behavior: `change content`, html: String): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  @JSName("popup")
  def popup_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  @JSName("popup")
  def popup_exists(behavior: exists): Boolean = js.native
  /**
    * Returns current popup dom element
    */
  @JSName("popup")
  def popup_getpopup(behavior: `get popup`): JQuery = js.native
  /**
    * Hides popup
    */
  @JSName("popup")
  def popup_hide(behavior: hide): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  @JSName("popup")
  def popup_hideall(behavior: `hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  @JSName("popup")
  def popup_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  @JSName("popup")
  def popup_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Removes popup from the page
    */
  @JSName("popup")
  def popup_removepopup(behavior: `remove popup`): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  @JSName("popup")
  def popup_reposition(behavior: reposition): JQuery = js.native
  /**
    * Repositions a popup
    */
  @JSName("popup")
  def popup_setposition(behavior: `set position`, position: String): JQuery = js.native
  @JSName("popup")
  def popup_setting(behavior: setting, value: PopupSettings): JQuery = js.native
  @JSName("popup")
  def popup_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any = js.native
  @JSName("popup")
  def popup_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-popup.SemanticUI.PopupSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows popup
    */
  @JSName("popup")
  def popup_show(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  @JSName("popup")
  def popup_toggle(behavior: toggle): JQuery = js.native
}

