package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResponseCallback[TBody] = js.Function3[
    /* err */ js.Any, 
    /* body */ TBody, 
    /* response */ typings.node.httpMod.IncomingMessage, 
    js.Any
  ]
}
