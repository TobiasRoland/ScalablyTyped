package typings.jasmineDashExpect.distToHaveEmptyObjectMod._Global_

import typings.jasmineDashExpect.distToHaveEmptyObjectMod.ToHaveEmptyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveEmptyObject")
    var toHaveEmptyObject_Original: ToHaveEmptyObject = js.native
    def toHaveEmptyObject(key: String): Boolean = js.native
    def toHaveEmptyObject(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

