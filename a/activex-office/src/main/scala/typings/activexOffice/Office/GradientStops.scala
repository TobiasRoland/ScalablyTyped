package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientStops extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  def apply(Index: Double): GradientStop = js.native
  /** @param Index [Index=-1] */
  def Delete(): Unit = js.native
  def Delete(Index: Double): Unit = js.native
  /**
    * @param Transparency [Transparency=0]
    * @param Index [Index=-1]
    */
  def Insert(RGB: Double, Position: Double): Unit = js.native
  def Insert(RGB: Double, Position: Double, Transparency: Double): Unit = js.native
  def Insert(RGB: Double, Position: Double, Transparency: Double, Index: Double): Unit = js.native
  /**
    * @param Transparency [Transparency=0]
    * @param Index [Index=-1]
    * @param Brightness [Brightness=0]
    */
  def Insert2(RGB: Double, Position: Double): Unit = js.native
  def Insert2(RGB: Double, Position: Double, Transparency: Double): Unit = js.native
  def Insert2(RGB: Double, Position: Double, Transparency: Double, Index: Double): Unit = js.native
  def Insert2(RGB: Double, Position: Double, Transparency: Double, Index: Double, Brightness: Double): Unit = js.native
  def Item(Index: Double): GradientStop = js.native
}

