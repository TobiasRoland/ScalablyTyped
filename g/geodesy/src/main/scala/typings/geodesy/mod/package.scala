package typings.geodesy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Datums = typings.geodesy.mod.Plural[typings.geodesy.mod.Datum]
  type Ellipsoids = typings.geodesy.mod.Plural[typings.geodesy.mod.Ellipsoid]
  type Plural[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Polygon[T] = js.Array[T]
  type Transform = js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
}
