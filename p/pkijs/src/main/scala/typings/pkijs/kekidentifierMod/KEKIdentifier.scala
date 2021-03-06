package typings.pkijs.kekidentifierMod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KEKIdentifier extends js.Object {
  var date: js.UndefOr[GeneralizedTime] = js.undefined
  var keyIdentifier: OctetString
  var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KEKIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyIdentifier: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    date: GeneralizedTime = null,
    other: typings.pkijs.otherKeyAttributeMod.default = null
  ): KEKIdentifier = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEKIdentifier]
  }
}

