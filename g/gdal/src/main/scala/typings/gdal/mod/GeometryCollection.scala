package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "GeometryCollection")
@js.native
class GeometryCollection () extends Geometry {
  var children: GeometryCollectionChildren = js.native
  def getArea(): Double = js.native
  def getLength(): Double = js.native
}

