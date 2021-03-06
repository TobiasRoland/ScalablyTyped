package typings.useSidecar

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.std.Error
import typings.std.Partial
import typings.useSidecar.configMod.IConfig
import typings.useSidecar.renderPropMod.CombinedProps
import typings.useSidecar.renderPropMod.Options
import typings.useSidecar.renderPropMod.RenderPropComponent
import typings.useSidecar.typesMod.Importer
import typings.useSidecar.typesMod.MiddlewareCallback
import typings.useSidecar.typesMod.SideCarComponent
import typings.useSidecar.typesMod.SideCarHOC
import typings.useSidecar.typesMod.SideCarMedium
import typings.useSidecar.typesMod.SideCarMediumOptions
import typings.useSidecar.typesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createSidecarMedium(): SideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): SideCarMedium = js.native
  def exportSidecar[T](medium: SideCarMedium, exported: ComponentType[T]): SideCarComponent[T] = js.native
  def renderCar[T /* <: js.Array[_] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def renderCar[T /* <: js.Array[_] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def setConfig(conf: Partial[IConfig]): Unit = js.native
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T with SideCarHOC] = js.native
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
}

