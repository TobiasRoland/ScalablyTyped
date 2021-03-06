package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutatesHeaders extends js.Object {
  /**
    * Add value(s) to header
    */
  def addHeader(name: String, value: String): Unit = js.native
  def addHeader(name: String, value: js.Array[String]): Unit = js.native
  /**
    * Removes header
    */
  def removeHeader(name: String): Unit = js.native
  /**
    * Sets header value(s), replacing previous one(s)
    */
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: js.Array[String]): Unit = js.native
}

