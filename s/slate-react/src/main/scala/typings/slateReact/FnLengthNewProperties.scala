package typings.slateReact

import typings.immutable.Immutable.List
import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnLengthNewProperties extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, properties: String, newProperties: String): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: String,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, properties: MarkJSON, newProperties: String): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkJSON,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: String
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, properties: Mark, newProperties: String): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: Mark,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
}

