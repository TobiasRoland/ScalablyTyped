package typings.aframe

import org.scalablytyped.runtime.Instantiable0
import typings.three.mod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassQuaternion extends Instantiable0[Quaternion] {
  /**
  	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
  	 */
  def slerp(
    qa: typings.three.quaternionMod.Quaternion,
    qb: typings.three.quaternionMod.Quaternion,
    qm: typings.three.quaternionMod.Quaternion,
    t: Double
  ): typings.three.quaternionMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): typings.three.quaternionMod.Quaternion = js.native
}

