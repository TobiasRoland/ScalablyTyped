package typings.storybookApi

import typings.storybookApi.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait storybookApiProps {
  type ConsumerProps[S, C] = typings.storybookApi.mod.ConsumerProps[S, C]
  @scala.inline
  def ProviderProps: Props.type = typings.storybookApi.mod.Props
  type ProviderProps = Props
}

