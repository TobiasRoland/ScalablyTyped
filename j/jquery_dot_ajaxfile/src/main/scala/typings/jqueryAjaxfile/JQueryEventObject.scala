package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Event_ because Already inherited
- typings.jqueryAjaxfile.BaseJQueryEventObject because Already inherited
- typings.jqueryAjaxfile.JQueryInputEventObject because Already inherited
- typings.jqueryAjaxfile.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  var char: js.Any = js.native
  var charCode: Double = js.native
  var key: js.Any = js.native
  var keyCode: Double = js.native
}

