package typings.angular.mod

import typings.angular.JQLite
import typings.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This corresponds to $transclude passed to controllers and to the transclude function passed to link functions.
  * https://docs.angularjs.org/api/ng/service/$compile#-controller-
  * http://teropa.info/blog/2015/06/09/transclusion.html
  */
@js.native
trait ITranscludeFunction extends js.Object {
  // If one argument is provided, then it's assumed to be the cloneAttachFn.
  def apply(): JQLite = js.native
  def apply(cloneAttachFn: ICloneAttachFunction): JQLite = js.native
  def apply(cloneAttachFn: ICloneAttachFunction, futureParentElement: JQuery): JQLite = js.native
  def apply(cloneAttachFn: ICloneAttachFunction, futureParentElement: JQuery, slotName: String): JQLite = js.native
  // If the scope is provided, then the cloneAttachFn must be as well.
  def apply(scope: IScope, cloneAttachFn: ICloneAttachFunction): JQLite = js.native
  def apply(scope: IScope, cloneAttachFn: ICloneAttachFunction, futureParentElement: JQuery): JQLite = js.native
  def apply(scope: IScope, cloneAttachFn: ICloneAttachFunction, futureParentElement: JQuery, slotName: String): JQLite = js.native
  /**
    * Returns true if the specified slot contains content (i.e. one or more DOM nodes)
    */
  def isSlotFilled(slotName: String): Boolean = js.native
}

