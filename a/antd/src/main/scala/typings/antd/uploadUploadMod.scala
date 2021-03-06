package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.uploadInterfaceMod.RcFile
import typings.antd.uploadInterfaceMod.UploadChangeParam
import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadLocale
import typings.antd.uploadInterfaceMod.UploadProps
import typings.antd.uploadInterfaceMod.UploadState
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.Error
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object uploadUploadMod extends js.Object {
  @js.native
  trait Upload
    extends Component[UploadProps, UploadState, js.Any] {
    var progressTimer: js.Any = js.native
    var recentUploadStatus: Boolean | js.Thenable[_] = js.native
    var upload: js.Any = js.native
    def autoUpdateProgress(_underscore: js.Any, file: UploadFile[_]): Unit = js.native
    def beforeUpload(file: RcFile, fileList: js.Array[RcFile]): Boolean | js.Thenable[Unit] = js.native
    def clearProgressTimer(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MUpload(): Unit = js.native
    def handleRemove(file: UploadFile[_]): Unit = js.native
    def onChange(info: UploadChangeParam[UploadFile[_]]): Unit = js.native
    def onError(error: Error, response: js.Any, file: UploadFile[_]): Unit = js.native
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    def onProgress(e: AnonPercent, file: UploadFile[_]): Unit = js.native
    def onStart(file: RcFile): Unit = js.native
    def onSuccess(response: js.Any, file: UploadFile[_], xhr: js.Any): Unit = js.native
    def renderUpload(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
    def renderUploadList(locale: UploadLocale): Element = js.native
    def saveUpload(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Upload {
    def this(props: UploadProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typings.antd.draggerMod.default] = js.native
    var defaultProps: AnonAccept = js.native
    def getDerivedStateFromProps(nextProps: UploadProps): AnonFileList | Null = js.native
  }
  
}

