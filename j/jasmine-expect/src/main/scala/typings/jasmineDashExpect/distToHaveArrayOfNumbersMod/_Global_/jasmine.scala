package typings.jasmineDashExpect.distToHaveArrayOfNumbersMod._Global_

import typings.jasmineDashExpect.distToHaveArrayOfNumbersMod.ToHaveArrayOfNumbers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveArrayOfNumbers")
    var toHaveArrayOfNumbers_Original: ToHaveArrayOfNumbers = js.native
    def toHaveArrayOfNumbers(key: String): Boolean = js.native
    def toHaveArrayOfNumbers(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

