package typings.cypress.Mocha_

import typings.cypress.cypressStrings.fast
import typings.cypress.cypressStrings.medium
import typings.cypress.cypressStrings.slow
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@JSGlobal("Mocha.Test")
@js.native
class Test_ () extends Runnable {
   // added by reporters
  var err: js.UndefOr[Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: typings.cypress.cypressStrings.test = js.native
}

