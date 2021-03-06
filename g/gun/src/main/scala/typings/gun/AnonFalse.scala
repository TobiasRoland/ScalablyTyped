package typings.gun

import typings.gun.gunBooleans.`false`
import typings.gun.mod.Gun.ArrayAsRecord
import typings.gun.mod.Gun.ChainReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse[DataType, ReferenceKey] extends js.Object {
  var gun: ChainReference[DataType, ReferenceKey, `false`]
  var key: ReferenceKey
  var put: ArrayAsRecord[DataType]
}

object AnonFalse {
  @scala.inline
  def apply[DataType, ReferenceKey](
    gun: ChainReference[DataType, ReferenceKey, `false`],
    key: ReferenceKey,
    put: ArrayAsRecord[DataType]
  ): AnonFalse[DataType, ReferenceKey] = {
    val __obj = js.Dynamic.literal(gun = gun.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFalse[DataType, ReferenceKey]]
  }
}

