package typings.lodash.fpMod

import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMatchesProperty extends js.Object {
  def apply(path: PropertyPath): LodashMatchesProperty1x1 = js.native
  def apply[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ js.Any, Boolean] = js.native
  def apply[T](path: __, srcValue: T): LodashMatchesProperty1x2 = js.native
}

