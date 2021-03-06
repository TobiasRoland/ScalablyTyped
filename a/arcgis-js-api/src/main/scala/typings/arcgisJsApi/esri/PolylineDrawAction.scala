package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import typings.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import typings.arcgisJsApi.arcgisJsApiStrings.`vertex-remove`
import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.arcgisJsApi.arcgisJsApiStrings.redo
import typings.arcgisJsApi.arcgisJsApiStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineDrawAction extends DrawAction {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged.
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#mode)
    *
    * @default hybrid
    */
  var mode: hybrid | freehand | click = js.native
  /**
    * Two-dimensional array of numbers representing the coordinates of each vertex comprising the geometry being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#vertices)
    */
  val vertices: js.Array[js.Array[Double]] = js.native
  /**
    * Completes drawing the polyline geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#event-draw-complete) event. Call this method if the drawing logic needs to be completed other than by double-clicking or pressing the "C" key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  @JSName("on")
  def on_cursorupdate(name: `cursor-update`, eventHandler: PolylineDrawActionCursorUpdateEventHandler): IHandle = js.native
  @JSName("on")
  def on_drawcomplete(name: `draw-complete`, eventHandler: PolylineDrawActionDrawCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_redo(name: redo, eventHandler: PolylineDrawActionRedoEventHandler): IHandle = js.native
  @JSName("on")
  def on_undo(name: undo, eventHandler: PolylineDrawActionUndoEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexadd(name: `vertex-add`, eventHandler: PolylineDrawActionVertexAddEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexremove(name: `vertex-remove`, eventHandler: PolylineDrawActionVertexRemoveEventHandler): IHandle = js.native
}

@JSGlobal("__esri.PolylineDrawAction")
@js.native
object PolylineDrawAction extends TopLevel[PolylineDrawActionConstructor]

