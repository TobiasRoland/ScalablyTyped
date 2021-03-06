package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientAdsense.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var adunits: AdunitsResource
  var alerts: AlertsResource
  var customchannels: CustomchannelsResource
  var payments: PaymentsResource
  var reports: ReportsResource
  var savedadstyles: SavedadstylesResource
  var urlchannels: UrlchannelsResource
  /** Get information about the selected AdSense account. */
  def get(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[Account]
  /** List all accounts available to this AdSense account. */
  def list(request: AnonAlt): Request_[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    adunits: AdunitsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[Account],
    list: AnonAlt => Request_[Accounts],
    payments: PaymentsResource,
    reports: ReportsResource,
    savedadstyles: SavedadstylesResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], adunits = adunits.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), payments = payments.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], savedadstyles = savedadstyles.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountsResource]
  }
}

