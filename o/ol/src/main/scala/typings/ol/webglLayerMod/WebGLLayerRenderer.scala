package typings.ol.webglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLLayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */]
  extends typings.ol.rendererLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
  var helper: typings.ol.helperMod.default = js.native
  def getShaderCompileErrors(): String = js.native
}

