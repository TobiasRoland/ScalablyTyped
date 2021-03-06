package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeVectorIcons.iconMod.Icon
import typings.reactNativeVectorIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonButton extends Instantiable0[Icon] {
  var Button: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.Button] = js.native
  var TabBarItem: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItem] = js.native
  var TabBarItemIOS: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS] = js.native
  var ToolbarAndroid: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid] = js.native
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

