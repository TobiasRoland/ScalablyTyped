package typings.jestEnvironment

import typings.jestTypes.globalMod.TestFn
import typings.jestTypes.globalMod.TestName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnFn extends js.Object {
  def apply(testName: TestName, fn: TestFn): Unit = js.native
  def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
}

