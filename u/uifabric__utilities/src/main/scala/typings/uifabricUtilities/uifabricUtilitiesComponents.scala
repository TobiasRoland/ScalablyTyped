package typings.uifabricUtilities

import typings.react.mod.ComponentType
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object uifabricUtilitiesComponents extends uifabricUtilitiesProps {
  @scala.inline
  def BaseComponent[TProps /* <: IBaseProps[js.Any] */, TState]: ComponentType[TProps] = js.constructorOf[typings.uifabricUtilities.mod.BaseComponent[TProps, TState]].asInstanceOf[typings.react.mod.ComponentType[TProps]]
  @scala.inline
  def Customizer: ComponentType[CustomizerProps] = js.constructorOf[typings.uifabricUtilities.mod.Customizer].asInstanceOf[typings.react.mod.ComponentType[CustomizerProps]]
  @scala.inline
  def DelayedRender: ComponentType[DelayedRenderProps] = js.constructorOf[typings.uifabricUtilities.mod.DelayedRender].asInstanceOf[typings.react.mod.ComponentType[DelayedRenderProps]]
}

