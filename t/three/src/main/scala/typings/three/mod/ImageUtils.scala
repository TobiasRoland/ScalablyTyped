package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ImageUtils")
@js.native
object ImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String): typings.three.textureMod.Texture = js.native
  def loadTexture(url: String, mapping: typings.three.constantsMod.Mapping): typings.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String]): typings.three.textureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: typings.three.constantsMod.Mapping): typings.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit]
  ): typings.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typings.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typings.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.three.textureMod.Texture = js.native
}

