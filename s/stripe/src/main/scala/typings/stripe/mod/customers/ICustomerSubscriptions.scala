package typings.stripe.mod.customers

import typings.stripe.mod.IList
import typings.stripe.mod.resources.CustomerSubscriptions
import typings.stripe.mod.subscriptions.ISubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerSubscriptions
  extends CustomerSubscriptions
     with IList[ISubscription]

