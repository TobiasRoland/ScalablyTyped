package typings.geodesy.latlonEllipsoidalReferenceframeMod

import typings.geodesy.mod.Ellipsoids
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-ellipsoidal-referenceframe", "default")
@js.native
class default protected () extends LatLonEllipsoidalReferenceFrame {
  def this(lat: Double, lon: Double) = this()
  def this(lat: Double, lon: Double, height: Double) = this()
  def this(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame) = this()
  def this(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double) = this()
}

/* static members */
@JSImport("geodesy/latlon-ellipsoidal-referenceframe", "default")
@js.native
object default extends js.Object {
  def ellipsoids(): Ellipsoids = js.native
  def parse(lat: String): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: String, lon: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: String, lon: Double, height: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: String, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: String, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: js.Object): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double, height: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: js.Object, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: Double, lon: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: Double, lon: Double, height: Double): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame): LatLonEllipsoidalReferenceFrame = js.native
  def parse(lat: Double, lon: Double, height: Double, referenceFrame: ReferenceFrame, epoch: Double): LatLonEllipsoidalReferenceFrame = js.native
  def referenceFrames(): ReferenceFrames = js.native
  def transformParameters(): TxParams = js.native
}

