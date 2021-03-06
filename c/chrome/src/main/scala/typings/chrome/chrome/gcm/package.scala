package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  type GcmErrorEvent = typings.chrome.chrome.events.Event[js.Function1[/* error */ typings.chrome.chrome.gcm.GcmError, scala.Unit]]
  type MessageDeletionEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type MessageReceptionEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* message */ typings.chrome.chrome.gcm.IncomingMessage, scala.Unit]
  ]
}
