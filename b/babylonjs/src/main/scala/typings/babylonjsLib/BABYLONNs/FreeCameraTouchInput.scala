package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage the touch inputs to control the movement of a free camera.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSGlobal("BABYLON.FreeCameraTouchInput")
@js.native
class FreeCameraTouchInput () extends ICameraInput[FreeCamera] {
  var _observer: js.Any = js.native
  var _offsetX: js.Any = js.native
  var _offsetY: js.Any = js.native
  var _onLostFocus: js.Any = js.native
  var _pointerInput: js.Any = js.native
  var _pointerPressed: js.Any = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraTouchInput: FreeCamera = js.native
  /**
    * Defines the touch sensibility for rotation.
    * The higher the faster.
    */
  var touchAngularSensibility: scala.Double = js.native
  /**
    * Defines the touch sensibility for move.
    * The higher the faster.
    */
  var touchMoveSensibility: scala.Double = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraTouchInput(): scala.Unit = js.native
}

