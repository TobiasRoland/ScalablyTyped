package typings.gulpNunitRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NUnit = js.Function1[
    /* options */ js.UndefOr[typings.gulpNunitRunner.mod.Options], 
    typings.node.NodeJS.ReadWriteStream
  ]
}
