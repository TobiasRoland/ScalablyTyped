package typings.aceDiff.mod

import typings.aceDiff.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiff extends js.Object {
  def destroy(): Unit
  def diff(): Unit
  def getEditors(): AnonLeft
  def getNumDiffs(): Double
  def setOptions(options: AceDiffOpts): Unit
}

object AceDiff {
  @scala.inline
  def apply(
    destroy: () => Unit,
    diff: () => Unit,
    getEditors: () => AnonLeft,
    getNumDiffs: () => Double,
    setOptions: AceDiffOpts => Unit
  ): AceDiff = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), diff = js.Any.fromFunction0(diff), getEditors = js.Any.fromFunction0(getEditors), getNumDiffs = js.Any.fromFunction0(getNumDiffs), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[AceDiff]
  }
}

