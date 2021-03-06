package typings.ionicReact

import typings.ionicCore.mod.Config_
import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.ionicReact.ionicReactStrings.android
import typings.ionicReact.ionicReactStrings.capacitor
import typings.ionicReact.ionicReactStrings.cordova
import typings.ionicReact.ionicReactStrings.desktop
import typings.ionicReact.ionicReactStrings.electron
import typings.ionicReact.ionicReactStrings.hybrid
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.ipad
import typings.ionicReact.ionicReactStrings.iphone
import typings.ionicReact.ionicReactStrings.mobile
import typings.ionicReact.ionicReactStrings.mobileweb
import typings.ionicReact.ionicReactStrings.phablet
import typings.ionicReact.ionicReactStrings.pwa
import typings.ionicReact.ionicReactStrings.style
import typings.ionicReact.ionicReactStrings.tablet
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.DOMTokenList
import typings.std.Document_
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def attachProps(node: HTMLElement, newProps: js.Any): Unit = js.native
  def attachProps(node: HTMLElement, newProps: js.Any, oldProps: js.Any): Unit = js.native
  def camelToDashCase(str: String): String = js.native
  def createForwardRef[PropType, ElementType](ReactComponent: js.Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) with RefAttributes[ElementType]
  ] = js.native
  def dashToPascalCase(str: String): String = js.native
  def getClassName(classList: DOMTokenList, newProps: js.Any, oldProps: js.Any): String = js.native
  def getConfig(): Config_ | Null = js.native
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def isCoveredByReact(eventNameSuffix: String): Boolean = js.native
  def isCoveredByReact(eventNameSuffix: String, doc: Document_): Boolean = js.native
  def isPlatform(
    platform: ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ): Boolean = js.native
  def syncEvent(node: Element with AnonE, eventName: String): Unit = js.native
  def syncEvent(node: Element with AnonE, eventName: String, newEventHandler: js.Function1[/* e */ Event_, _]): Unit = js.native
  type IonicReactExternalProps[PropType, ElementType] = PropType with (Omit[HTMLAttributes[ElementType], style]) with IonicReactProps
}

