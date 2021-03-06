package typings.libphonenumberJs.mod

import typings.libphonenumberJs.AnonDefaultCountry
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "findNumbers")
@js.native
object findNumbers extends js.Object {
  def apply(text: String): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: AnonDefaultCountry): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
}

