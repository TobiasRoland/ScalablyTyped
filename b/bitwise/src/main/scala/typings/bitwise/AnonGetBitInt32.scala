package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetBitInt32 extends js.Object {
  def getBit(int32: Double, position: Double): Bit
  def setBit(int32: Double, position: Double, value: Bit): Bit
  def toggleBit(int32: Double, position: Double): Double
}

object AnonGetBitInt32 {
  @scala.inline
  def apply(
    getBit: (Double, Double) => Bit,
    setBit: (Double, Double, Bit) => Bit,
    toggleBit: (Double, Double) => Double
  ): AnonGetBitInt32 = {
    val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
  
    __obj.asInstanceOf[AnonGetBitInt32]
  }
}

