package typings.three.geometriesMod

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "WireframeGeometry")
@js.native
class WireframeGeometry protected ()
  extends typings.three.wireframeGeometryMod.WireframeGeometry {
  def this(geometry: BufferGeometry) = this()
  def this(geometry: Geometry) = this()
}

