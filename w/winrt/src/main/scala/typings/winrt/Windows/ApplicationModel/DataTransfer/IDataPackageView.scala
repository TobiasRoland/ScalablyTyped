package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageItem
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPackageView extends js.Object {
  var availableFormats: IVectorView[String] = js.native
  var properties: DataPackagePropertySetView = js.native
  var requestedOperation: DataPackageOperation = js.native
  def contains(formatId: String): Boolean = js.native
  def getBitmapAsync(): IAsyncOperation[RandomAccessStreamReference] = js.native
  def getDataAsync(formatId: String): IAsyncOperation[_] = js.native
  def getHtmlFormatAsync(): IAsyncOperation[String] = js.native
  def getResourceMapAsync(): IAsyncOperation[IMapView[String, RandomAccessStreamReference]] = js.native
  def getRtfAsync(): IAsyncOperation[String] = js.native
  def getStorageItemsAsync(): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  def getTextAsync(): IAsyncOperation[String] = js.native
  def getTextAsync(formatId: String): IAsyncOperation[String] = js.native
  def getUriAsync(): IAsyncOperation[Uri] = js.native
  def reportOperationCompleted(value: DataPackageOperation): Unit = js.native
}

