package typings.arangodb.Foxx

import typings.arangodb.arangodbBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationRouterOptions extends js.Object {
  var indexFile: String
  var mount: String
  var swaggerRoot: String
  def before(req: Request, res: Response): Unit | `false`
}

object DocumentationRouterOptions {
  @scala.inline
  def apply(
    before: (Request, Response) => Unit | `false`,
    indexFile: String,
    mount: String,
    swaggerRoot: String
  ): DocumentationRouterOptions = {
    val __obj = js.Dynamic.literal(before = js.Any.fromFunction2(before), indexFile = indexFile.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], swaggerRoot = swaggerRoot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentationRouterOptions]
  }
}

