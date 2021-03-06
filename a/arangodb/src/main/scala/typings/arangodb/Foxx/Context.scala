package typings.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.Collection
import typings.arangodb.arangodbBooleans.`false`
import typings.node.Buffer
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var argv: js.Array[_] = js.native
  var basePath: String = js.native
  var baseUrl: String = js.native
  var collectionPrefix: String = js.native
  var configuration: StringDictionary[js.Any] = js.native
  var dependencies: StringDictionary[js.Any] = js.native
  var isDevelopment: Boolean = js.native
  var isProduction: Boolean = js.native
  var manifest: Manifest = js.native
  var mount: String = js.native
  def collection(name: String): Collection[_] | Null = js.native
  def collectionName(name: String): String = js.native
  def createDocumentationRouter(): Router = js.native
  def createDocumentationRouter(opts: String): Router = js.native
  def createDocumentationRouter(opts: Partial[DocumentationRouterOptions]): Router = js.native
  @JSName("createDocumentationRouter")
  def createDocumentationRouter_false(opts: js.Function2[/* req */ Request, /* res */ Response, Unit | `false`]): Router = js.native
  def file(name: String): Buffer = js.native
  def file(name: String, encoding: String): String = js.native
  def fileName(name: String): String = js.native
  def registerType(`type`: String, `def`: TypeDefinition): Unit = js.native
  def use(path: String, routerOrMiddleware: Middleware): Endpoint = js.native
  def use(path: String, routerOrMiddleware: Middleware, name: String): Endpoint = js.native
  def use(path: String, routerOrMiddleware: Router): Endpoint = js.native
  def use(path: String, routerOrMiddleware: Router, name: String): Endpoint = js.native
  def use(routerOrMiddleware: Middleware): Endpoint = js.native
  def use(routerOrMiddleware: Middleware, name: String): Endpoint = js.native
  def use(routerOrMiddleware: Router): Endpoint = js.native
  def use(routerOrMiddleware: Router, name: String): Endpoint = js.native
}

