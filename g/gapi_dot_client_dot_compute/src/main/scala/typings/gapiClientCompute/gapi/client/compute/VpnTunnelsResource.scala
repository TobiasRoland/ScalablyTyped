package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelsResource extends js.Object {
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: AnonAlt): Request_[VpnTunnelAggregatedList]
  /** Deletes the specified VpnTunnel resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp): Request_[Operation]
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp): Request_[VpnTunnel]
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: AnonAltFieldsFilter): Request_[VpnTunnelList]
}

object VpnTunnelsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[VpnTunnelAggregatedList],
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestIdUserIp => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionUserIp => Request_[VpnTunnel],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[VpnTunnelList]
  ): VpnTunnelsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VpnTunnelsResource]
  }
}

