package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
@js.native
class FileOpenPicker () extends IFileOpenPicker {
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /* CompleteClass */
  override var fileTypeFilter: IVector[String] = js.native
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /* CompleteClass */
  override var suggestedStartLocation: PickerLocationId = js.native
  /* CompleteClass */
  override var viewMode: PickerViewMode = js.native
  /* CompleteClass */
  override def pickMultipleFilesAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  /* CompleteClass */
  override def pickSingleFileAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickSingleFileAsync(): IAsyncOperation[StorageFile] = js.native
}

