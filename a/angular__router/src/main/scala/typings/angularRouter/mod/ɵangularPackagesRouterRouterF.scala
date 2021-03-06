package typings.angularRouter.mod

import typings.angularCommon.mod.Location
import typings.angularCore.mod.ApplicationRef
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgModuleFactoryLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "\u0275angular_packages_router_router_f")
@js.native
object ɵangularPackagesRouterRouterF extends js.Object {
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]]
  ): Router = js.native
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = js.native
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  def apply(
    ref: ApplicationRef,
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy,
    routeReuseStrategy: RouteReuseStrategy
  ): Router = js.native
}

