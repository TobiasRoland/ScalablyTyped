package typings.reactJss

import typings.react.mod.ComponentType
import typings.theming.mod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactJssComponents extends reactJssProps {
  @scala.inline
  def JssProvider: ComponentType[JssProviderProps] = js.constructorOf[typings.reactJss.mod.JssProvider].asInstanceOf[typings.react.mod.ComponentType[JssProviderProps]]
  @scala.inline
  def ThemeProvider: ComponentType[ThemeProviderProps[DefaultTheme]] = js.constructorOf[typings.reactJss.mod.ThemeProvider].asInstanceOf[typings.react.mod.ComponentType[ThemeProviderProps[typings.theming.mod.DefaultTheme]]]
}

