package typings.stripe.mod.orders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Current order status. One of created, paid, canceled, fulfilled, or returned. More detail in the Relay API Overview.
  */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.created
  - typings.stripe.stripeStrings.paid
  - typings.stripe.stripeStrings.canceled
  - typings.stripe.stripeStrings.fulfilled
  - typings.stripe.stripeStrings.returned
*/
trait OrderStatus extends js.Object

object OrderStatus {
  @scala.inline
  def canceled: typings.stripe.stripeStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typings.stripe.stripeStrings.created = this.cast("created")
  @scala.inline
  def fulfilled: typings.stripe.stripeStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def paid: typings.stripe.stripeStrings.paid = this.cast("paid")
  @scala.inline
  def returned: typings.stripe.stripeStrings.returned = this.cast("returned")
}

