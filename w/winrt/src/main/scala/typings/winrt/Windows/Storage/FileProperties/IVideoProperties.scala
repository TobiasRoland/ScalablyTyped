package typings.winrt.Windows.Storage.FileProperties

import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVideoProperties extends IStorageItemExtraProperties {
  var bitrate: Double = js.native
  var directors: IVector[String] = js.native
  var duration: Double = js.native
  var height: Double = js.native
  var keywords: IVector[String] = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var orientation: VideoOrientation = js.native
  var producers: IVector[String] = js.native
  var publisher: String = js.native
  var rating: Double = js.native
  var subtitle: String = js.native
  var title: String = js.native
  var width: Double = js.native
  var writers: IVector[String] = js.native
  var year: Double = js.native
}

