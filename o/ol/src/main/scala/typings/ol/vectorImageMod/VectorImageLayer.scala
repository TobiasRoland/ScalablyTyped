package typings.ol.vectorImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorImageLayer
  extends typings.ol.baseVectorMod.default[
      typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] | typings.ol.sourceVectorTileMod.default
    ] {
  def getImageRatio(): Double = js.native
}

