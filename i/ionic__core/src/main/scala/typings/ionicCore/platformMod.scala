package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.android
import typings.ionicCore.ionicCoreStrings.capacitor
import typings.ionicCore.ionicCoreStrings.cordova
import typings.ionicCore.ionicCoreStrings.desktop
import typings.ionicCore.ionicCoreStrings.electron
import typings.ionicCore.ionicCoreStrings.hybrid
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.ipad
import typings.ionicCore.ionicCoreStrings.iphone
import typings.ionicCore.ionicCoreStrings.mobile
import typings.ionicCore.ionicCoreStrings.mobileweb
import typings.ionicCore.ionicCoreStrings.phablet
import typings.ionicCore.ionicCoreStrings.pwa
import typings.ionicCore.ionicCoreStrings.tablet
import typings.std.RegExp
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  @js.native
  trait IsPlatformSignature extends js.Object {
    def apply(plt: Platforms): Boolean = js.native
    def apply(win: Window_, plt: Platforms): Boolean = js.native
  }
  
  val isPlatform: IsPlatformSignature = js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def testUserAgent(win: Window_, expr: RegExp): Boolean = js.native
  type Platforms = String
}

