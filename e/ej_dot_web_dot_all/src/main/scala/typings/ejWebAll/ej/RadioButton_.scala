package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadioButton")
@js.native
class RadioButton_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.RadioButton.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.RadioButton.Model) = this()
  var defaults: typings.ejWebAll.ej.RadioButton.Model = js.native
  @JSName("model")
  var model_RadioButton_ : typings.ejWebAll.ej.RadioButton.Model = js.native
  /** To disable the RadioButton
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the RadioButton
    * @returns {void}
    */
  def enable(): Unit = js.native
}

