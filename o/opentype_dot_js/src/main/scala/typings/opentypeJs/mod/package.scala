package typings.opentypeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Contour = js.Array[typings.opentypeJs.mod.Point]
  type FontConstructorOptions = typings.opentypeJs.mod.FontConstructorOptionsBase with typings.std.Partial[typings.opentypeJs.mod.FontOptions] with typings.opentypeJs.AnonGlyphs
  type KerningPairs = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type LocalizedName = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Substitution = js.Function1[/* font */ typings.opentypeJs.mod.Font, js.Any]
}
