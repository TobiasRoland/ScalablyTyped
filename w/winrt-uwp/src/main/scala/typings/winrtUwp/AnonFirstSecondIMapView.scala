package typings.winrtUwp

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.NamedResource
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstSecondIMapView extends js.Object {
  /** One half of the original map. */ var first: IMapView[String, NamedResource]
  /** The second half of the original map. */ var second: IMapView[String, NamedResource]
}

object AnonFirstSecondIMapView {
  @scala.inline
  def apply(first: IMapView[String, NamedResource], second: IMapView[String, NamedResource]): AnonFirstSecondIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstSecondIMapView]
  }
}

