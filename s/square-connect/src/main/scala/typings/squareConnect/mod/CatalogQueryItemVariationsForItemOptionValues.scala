package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogQueryItemVariationsForItemOptionValues")
@js.native
class CatalogQueryItemVariationsForItemOptionValues () extends js.Object {
  /**
    * A set of [CatalogItemOptionValue](#type-catalogitemoptionvalue) IDs to be used to find associated
    * [CatalogItemVariation](#type-catalogitemvariation)s. All ItemVariations that contain all of the given
    * Item Option Values (in any order) will be returned.
    */
  var item_option_value_ids: js.UndefOr[js.Array[String]] = js.native
}

