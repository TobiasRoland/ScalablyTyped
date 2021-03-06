package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Process
import typings.jestTypes.jestTypesStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameParentProcess extends Event {
  var name: setup
  var parentProcess: Process
  var testNamePattern: js.UndefOr[String] = js.undefined
}

object AnonNameParentProcess {
  @scala.inline
  def apply(name: setup, parentProcess: Process, testNamePattern: String = null): AnonNameParentProcess = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any])
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameParentProcess]
  }
}

