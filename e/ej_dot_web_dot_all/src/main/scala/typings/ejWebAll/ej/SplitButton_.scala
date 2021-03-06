package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.SplitButton")
@js.native
class SplitButton_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.SplitButton.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.SplitButton.Model) = this()
  var defaults: typings.ejWebAll.ej.SplitButton.Model = js.native
  @JSName("model")
  var model_SplitButton_ : typings.ejWebAll.ej.SplitButton.Model = js.native
  /** To disable the split button
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To Enable the split button
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To hide the list content of the split button.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To show the list content of the split button.
    * @returns {void}
    */
  def show(): Unit = js.native
}

