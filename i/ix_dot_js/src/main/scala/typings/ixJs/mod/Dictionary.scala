package typings.ixJs.mod

import typings.ixJs.Ix.EqualityComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends typings.ixJs.Ix.Dictionary[TKey, TValue] {
  def this(capacity: Double) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
}

