package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressEntries")
@js.native
class AddressEntries protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.AddressEntries_typekey")
  var OutlookDotAddressEntries_typekey: AddressEntries = js.native
  val Parent: js.Any = js.native
  val RawTable: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Type: String): AddressEntry = js.native
  def Add(Type: String, Name: js.Any): AddressEntry = js.native
  def Add(Type: String, Name: js.Any, Address: js.Any): AddressEntry = js.native
  def GetFirst(): AddressEntry = js.native
  def GetLast(): AddressEntry = js.native
  def GetNext(): AddressEntry = js.native
  def GetPrevious(): AddressEntry = js.native
  def Item(Index: js.Any): AddressEntry = js.native
  def Sort(): Unit = js.native
  def Sort(Property: js.Any): Unit = js.native
  def Sort(Property: js.Any, Order: js.Any): Unit = js.native
}

