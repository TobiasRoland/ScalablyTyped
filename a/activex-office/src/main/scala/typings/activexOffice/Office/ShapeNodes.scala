package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeNodes extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): ShapeNode = js.native
  def Delete(Index: Double): Unit = js.native
  /**
    * @param X2 [X2=0]
    * @param Y2 [Y2=0]
    * @param X3 [X3=0]
    * @param Y3 [Y3=0]
    */
  def Insert(Index: Double, SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double
  ): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double
  ): Unit = js.native
  def Insert(
    Index: Double,
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def Item(Index: js.Any): ShapeNode = js.native
  def SetEditingType(Index: Double, EditingType: MsoEditingType): Unit = js.native
  def SetPosition(Index: Double, X1: Double, Y1: Double): Unit = js.native
  def SetSegmentType(Index: Double, SegmentType: MsoSegmentType): Unit = js.native
}

