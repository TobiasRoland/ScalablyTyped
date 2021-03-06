package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsFirewall
import typings.gapiClientCompute.AnonAltFieldsFirewallKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallsResource extends js.Object {
  /** Deletes the specified firewall. */
  def delete(request: AnonAltFieldsFirewall): Request_[Operation]
  /** Returns the specified firewall. */
  def get(request: AnonAltFieldsFirewallKey): Request_[Firewall]
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(request: AnonAlt): Request_[FirewallList]
  /**
    * Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: AnonAltFieldsFirewall): Request_[Operation]
  /**
    * Updates the specified firewall rule with the data included in the request. Using PUT method, can only update following fields of firewall rule:
    * allowed, description, sourceRanges, sourceTags, targetTags.
    */
  def update(request: AnonAltFieldsFirewall): Request_[Operation]
}

object FirewallsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsFirewall => Request_[Operation],
    get: AnonAltFieldsFirewallKey => Request_[Firewall],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[FirewallList],
    patch: AnonAltFieldsFirewall => Request_[Operation],
    update: AnonAltFieldsFirewall => Request_[Operation]
  ): FirewallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FirewallsResource]
  }
}

