package typings.reactIntlRedux

import typings.reactIntl.mod.OptionalIntlConfig
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactIntlReduxProps {
  type IntlProviderProps = OptionalIntlConfig
  @scala.inline
  def ProviderProps: typings.reactRedux.mod.ProviderProps.type = typings.reactRedux.mod.ProviderProps
  type ProviderProps[A /* <: Action[_] */] = typings.reactRedux.mod.ProviderProps[A]
}

