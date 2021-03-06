package typings.pixiDotJs.PIXI.particles

import typings.pixiDotJs.PIXI.DisplayObject
import typings.pixiDotJs.PIXI.Matrix
import typings.pixiDotJs.PIXI.ObjectRenderer
import typings.pixiDotJs.PIXI.WebGLRenderer
import typings.pixiDotJs.PIXI.glCore.GLShader
import typings.std.Uint16Array
import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.particles.ParticleRenderer")
@js.native
class ParticleRenderer protected () extends ObjectRenderer {
  def this(renderer: WebGLRenderer) = this()
  var indexBuffer: WebGLBuffer = js.native
  var indices: Uint16Array = js.native
  var properties: js.Array[ParticleRendererProperty] = js.native
  var shader: GLShader = js.native
  var tempMatrix: Matrix = js.native
  /* protected */ def _generateOneMoreBuffer(container: ParticleContainer): ParticleBuffer = js.native
  def generateBuffers(container: ParticleContainer): js.Array[ParticleBuffer] = js.native
  def uploadAlpha(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  def uploadPosition(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  def uploadRotation(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  def uploadTint(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  def uploadUvs(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  def uploadVertices(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
}

