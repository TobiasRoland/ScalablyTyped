package typings.rotJs.termMod

import typings.rotJs.backendMod.Backend
import typings.rotJs.typesMod.DisplayData
import typings.rotJs.typesMod.DisplayOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends Backend {
  var _cursor: js.Tuple2[Double, Double]
  var _lastColor: String
  var _offset: js.Tuple2[Double, Double]
  def computeFontSize(): Double
  def computeSize(): js.Tuple2[Double, Double]
}

object Term {
  @scala.inline
  def apply(
    _cursor: js.Tuple2[Double, Double],
    _lastColor: String,
    _offset: js.Tuple2[Double, Double],
    _options: DisplayOptions,
    clear: () => Unit,
    computeFontSize: () => Double,
    computeSize: () => js.Tuple2[Double, Double],
    draw: (DisplayData, Boolean) => Unit,
    eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
    getContainer: () => HTMLElement | Null,
    schedule: js.Function0[Unit] => Unit,
    setOptions: DisplayOptions => Unit
  ): Term = {
    val __obj = js.Dynamic.literal(_cursor = _cursor.asInstanceOf[js.Any], _lastColor = _lastColor.asInstanceOf[js.Any], _offset = _offset.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), computeFontSize = js.Any.fromFunction0(computeFontSize), computeSize = js.Any.fromFunction0(computeSize), draw = js.Any.fromFunction2(draw), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = js.Any.fromFunction0(getContainer), schedule = js.Any.fromFunction1(schedule), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[Term]
  }
}

