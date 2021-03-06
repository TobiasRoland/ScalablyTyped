package typings
package reactDashMdLib.libSelectionControlsSelectionControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionControlProps extends BaseSelectionControlProps {
  var checkedCheckboxIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var checkedCheckboxIconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var checkedCheckboxIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var checkedRadioIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var checkedRadioIconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var checkedRadioIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* result */ scala.Boolean | scala.Double | java.lang.String, 
      /* event */ stdLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var `type`: Types
  var uncheckedCheckboxIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedCheckboxIconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedCheckboxIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var uncheckedRadioIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedRadioIconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var uncheckedRadioIconClassName: js.UndefOr[java.lang.String] = js.undefined
}

object SelectionControlProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    name: scala.Double | java.lang.String,
    `type`: Types,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: reactDashMdLib.libMod.IdPropType = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedCheckboxIcon: reactLib.reactMod.ReactElement[_] = null,
    checkedCheckboxIconChildren: reactLib.reactMod.ReactNode = null,
    checkedCheckboxIconClassName: java.lang.String = null,
    checkedRadioIcon: reactLib.reactMod.ReactElement[_] = null,
    checkedRadioIconChildren: reactLib.reactMod.ReactNode = null,
    checkedRadioIconClassName: java.lang.String = null,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null,
    labelBefore: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onChange: (/* result */ scala.Boolean | scala.Double | java.lang.String, /* event */ stdLib.Event) => scala.Unit = null,
    onClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null,
    uncheckedCheckboxIcon: reactLib.reactMod.ReactElement[_] = null,
    uncheckedCheckboxIconChildren: reactLib.reactMod.ReactNode = null,
    uncheckedCheckboxIconClassName: java.lang.String = null,
    uncheckedRadioIcon: reactLib.reactMod.ReactElement[_] = null,
    uncheckedRadioIconChildren: reactLib.reactMod.ReactNode = null,
    uncheckedRadioIconClassName: java.lang.String = null,
    value: scala.Double | java.lang.String = null
  ): SelectionControlProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedCheckboxIcon != null) __obj.updateDynamic("checkedCheckboxIcon")(checkedCheckboxIcon)
    if (checkedCheckboxIconChildren != null) __obj.updateDynamic("checkedCheckboxIconChildren")(checkedCheckboxIconChildren.asInstanceOf[js.Any])
    if (checkedCheckboxIconClassName != null) __obj.updateDynamic("checkedCheckboxIconClassName")(checkedCheckboxIconClassName)
    if (checkedRadioIcon != null) __obj.updateDynamic("checkedRadioIcon")(checkedRadioIcon)
    if (checkedRadioIconChildren != null) __obj.updateDynamic("checkedRadioIconChildren")(checkedRadioIconChildren.asInstanceOf[js.Any])
    if (checkedRadioIconClassName != null) __obj.updateDynamic("checkedRadioIconClassName")(checkedRadioIconClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelBefore)) __obj.updateDynamic("labelBefore")(labelBefore)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (style != null) __obj.updateDynamic("style")(style)
    if (uncheckedCheckboxIcon != null) __obj.updateDynamic("uncheckedCheckboxIcon")(uncheckedCheckboxIcon)
    if (uncheckedCheckboxIconChildren != null) __obj.updateDynamic("uncheckedCheckboxIconChildren")(uncheckedCheckboxIconChildren.asInstanceOf[js.Any])
    if (uncheckedCheckboxIconClassName != null) __obj.updateDynamic("uncheckedCheckboxIconClassName")(uncheckedCheckboxIconClassName)
    if (uncheckedRadioIcon != null) __obj.updateDynamic("uncheckedRadioIcon")(uncheckedRadioIcon)
    if (uncheckedRadioIconChildren != null) __obj.updateDynamic("uncheckedRadioIconChildren")(uncheckedRadioIconChildren.asInstanceOf[js.Any])
    if (uncheckedRadioIconClassName != null) __obj.updateDynamic("uncheckedRadioIconClassName")(uncheckedRadioIconClassName)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionControlProps]
  }
}

