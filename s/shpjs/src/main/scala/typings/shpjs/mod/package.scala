package typings.shpjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // All toBuffer() compatible buffers.
  type ShpJSBuffer = typings.node.Buffer | typings.std.ArrayBuffer | typings.shpjs.AnonBuffer
}
