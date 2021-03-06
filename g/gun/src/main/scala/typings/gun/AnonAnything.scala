package typings.gun

import typings.gun.gunBooleans.`false`
import typings.gun.mod.Gun.ChainReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnything extends js.Object {
  /** Returns a "gun-ified" variant of the json input by injecting a new gun ID into the metadata field. */
  def ify(json: js.Any): js.Any
  /** Returns true if data is a gun node, otherwise false. */
  def is(anything: js.Any): /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean
  /**
    * Returns data's gun ID (instead of manually grabbing its metadata i.e. data["_"]["#"], which is faster but could change in the future)
    *
    * Returns undefined if data is not correct gun data.
    */
  @JSName("soul")
  def soul_false(data: ChainReference[_, _, `false`]): String
}

object AnonAnything {
  @scala.inline
  def apply(
    ify: js.Any => js.Any,
    is: js.Any => /* is gun.gun.Gun.ChainReference<any, any, false> */ Boolean,
    soul: ChainReference[_, _, `false`] => String
  ): AnonAnything = {
    val __obj = js.Dynamic.literal(ify = js.Any.fromFunction1(ify), is = js.Any.fromFunction1(is), soul = js.Any.fromFunction1(soul))
  
    __obj.asInstanceOf[AnonAnything]
  }
}

