package typings.reactCropper.mod

import typings.cropperjs.Cropper.Data
import typings.cropperjs.Cropper.DragMode
import typings.cropperjs.Cropper.Options
import typings.cropperjs.Cropper.ViewMode
import typings.std.CustomEvent
import typings.std.Element
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLImageElement>, 'data' | 'ref'> ]: react.react.HTMLProps<std.HTMLImageElement>[P]} */ trait ReactCropperProps extends Options {
  var ref: js.UndefOr[String | (js.Function1[/* cropper */ Null | ReactCropper, _])] = js.undefined
}

object ReactCropperProps {
  @scala.inline
  def apply(
    aspectRatio: Int | Double = null,
    autoCrop: js.UndefOr[Boolean] = js.undefined,
    autoCropArea: Int | Double = null,
    background: js.UndefOr[Boolean] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    checkCrossOrigin: js.UndefOr[Boolean] = js.undefined,
    checkOrientation: js.UndefOr[Boolean] = js.undefined,
    crop: /* event */ CustomEvent[_] => Unit = null,
    cropBoxMovable: js.UndefOr[Boolean] = js.undefined,
    cropBoxResizable: js.UndefOr[Boolean] = js.undefined,
    cropend: /* event */ CustomEvent[_] => Unit = null,
    cropmove: /* event */ CustomEvent[_] => Unit = null,
    cropstart: /* event */ CustomEvent[_] => Unit = null,
    data: Data = null,
    dragMode: DragMode = null,
    guides: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    initialAspectRatio: Int | Double = null,
    minCanvasHeight: Int | Double = null,
    minCanvasWidth: Int | Double = null,
    minContainerHeight: Int | Double = null,
    minContainerWidth: Int | Double = null,
    minCropBoxHeight: Int | Double = null,
    minCropBoxWidth: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    movable: js.UndefOr[Boolean] = js.undefined,
    preview: Element | js.Array[Element] | NodeList | String = null,
    ready: /* event */ CustomEvent[_] => Unit = null,
    ref: String | (js.Function1[/* cropper */ Null | ReactCropper, _]) = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    restore: js.UndefOr[Boolean] = js.undefined,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    scalable: js.UndefOr[Boolean] = js.undefined,
    toggleDragModeOnDblclick: js.UndefOr[Boolean] = js.undefined,
    viewMode: ViewMode = null,
    wheelZoomRatio: Int | Double = null,
    zoom: /* event */ CustomEvent[_] => Unit = null,
    zoomOnTouch: js.UndefOr[Boolean] = js.undefined,
    zoomOnWheel: js.UndefOr[Boolean] = js.undefined,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): ReactCropperProps = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCrop)) __obj.updateDynamic("autoCrop")(autoCrop.asInstanceOf[js.Any])
    if (autoCropArea != null) __obj.updateDynamic("autoCropArea")(autoCropArea.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCrossOrigin)) __obj.updateDynamic("checkCrossOrigin")(checkCrossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(checkOrientation)) __obj.updateDynamic("checkOrientation")(checkOrientation.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(js.Any.fromFunction1(crop))
    if (!js.isUndefined(cropBoxMovable)) __obj.updateDynamic("cropBoxMovable")(cropBoxMovable.asInstanceOf[js.Any])
    if (!js.isUndefined(cropBoxResizable)) __obj.updateDynamic("cropBoxResizable")(cropBoxResizable.asInstanceOf[js.Any])
    if (cropend != null) __obj.updateDynamic("cropend")(js.Any.fromFunction1(cropend))
    if (cropmove != null) __obj.updateDynamic("cropmove")(js.Any.fromFunction1(cropmove))
    if (cropstart != null) __obj.updateDynamic("cropstart")(js.Any.fromFunction1(cropstart))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragMode != null) __obj.updateDynamic("dragMode")(dragMode.asInstanceOf[js.Any])
    if (!js.isUndefined(guides)) __obj.updateDynamic("guides")(guides.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (initialAspectRatio != null) __obj.updateDynamic("initialAspectRatio")(initialAspectRatio.asInstanceOf[js.Any])
    if (minCanvasHeight != null) __obj.updateDynamic("minCanvasHeight")(minCanvasHeight.asInstanceOf[js.Any])
    if (minCanvasWidth != null) __obj.updateDynamic("minCanvasWidth")(minCanvasWidth.asInstanceOf[js.Any])
    if (minContainerHeight != null) __obj.updateDynamic("minContainerHeight")(minContainerHeight.asInstanceOf[js.Any])
    if (minContainerWidth != null) __obj.updateDynamic("minContainerWidth")(minContainerWidth.asInstanceOf[js.Any])
    if (minCropBoxHeight != null) __obj.updateDynamic("minCropBoxHeight")(minCropBoxHeight.asInstanceOf[js.Any])
    if (minCropBoxWidth != null) __obj.updateDynamic("minCropBoxWidth")(minCropBoxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore.asInstanceOf[js.Any])
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleDragModeOnDblclick)) __obj.updateDynamic("toggleDragModeOnDblclick")(toggleDragModeOnDblclick.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    if (wheelZoomRatio != null) __obj.updateDynamic("wheelZoomRatio")(wheelZoomRatio.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (!js.isUndefined(zoomOnTouch)) __obj.updateDynamic("zoomOnTouch")(zoomOnTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnWheel)) __obj.updateDynamic("zoomOnWheel")(zoomOnWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCropperProps]
  }
}

