package typings.monk

import typings.monk.monkNumbers.`0`
import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon01N extends js.Object {
  var n: Double
  var ok: `1` | `0`
}

object Anon01N {
  @scala.inline
  def apply(n: Double, ok: `1` | `0`): Anon01N = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon01N]
  }
}

