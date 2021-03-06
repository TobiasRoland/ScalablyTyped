package typings.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import typings.rotJs.TypeofClassRect
import typings.rotJs.TypeofClassTileGL
import typings.rotJs.displayMod.default
import typings.rotJs.typesMod.DisplayOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Display")
@js.native
class Display () extends default {
  def this(options: Partial[DisplayOptions]) = this()
}

/* static members */
@JSImport("rot-js", "Display")
@js.native
object Display extends js.Object {
  var Hex: Instantiable0[typings.rotJs.hexMod.default] = js.native
  var Rect: TypeofClassRect = js.native
  var Term: Instantiable0[typings.rotJs.termMod.default] = js.native
  var Tile: Instantiable0[typings.rotJs.tileMod.default] = js.native
  var TileGL: TypeofClassTileGL = js.native
}

