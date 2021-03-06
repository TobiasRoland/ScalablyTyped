package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic Controller
  */
@JSImport("babylonjs", "GenericController")
@js.native
class GenericController protected ()
  extends babylonjsLib.BABYLONNs.GenericController {
  /**
    * Creates a new GenericController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}

/* static members */
@JSImport("babylonjs", "GenericController")
@js.native
object GenericController extends js.Object {
  /**
    * Base Url for the controller model.
    */
  val MODEL_BASE_URL: java.lang.String = js.native
  /**
    * File name for the controller model.
    */
  val MODEL_FILENAME: java.lang.String = js.native
}

