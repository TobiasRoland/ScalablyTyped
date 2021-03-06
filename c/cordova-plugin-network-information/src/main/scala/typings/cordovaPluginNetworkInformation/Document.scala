package typings.cordovaPluginNetworkInformation

import typings.cordovaPluginNetworkInformation.cordovaPluginNetworkInformationStrings.offline
import typings.cordovaPluginNetworkInformation.cordovaPluginNetworkInformationStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, connectionStateCallback: js.Function0[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, connectionStateCallback: js.Function0[_], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, connectionStateCallback: js.Function0[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, connectionStateCallback: js.Function0[_], useCapture: Boolean): Unit = js.native
}

