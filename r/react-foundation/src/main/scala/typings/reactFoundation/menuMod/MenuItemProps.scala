package typings.reactFoundation.menuMod

import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.AriaAttributes
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.CompositionEvent
import typings.react.mod.DOMAttributes
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TransitionEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.both
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.decimal
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.email
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.inherit
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.search
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.react.reactStrings.url
import typings.react.reactStrings.vertical
import typings.react.reactStrings.yes
import typings.reactFoundation.enumsMod.Breakpoints
import typings.reactFoundation.enumsMod.ExtendedBreakpoints
import typings.reactFoundation.enumsMod.FloatTypes
import typings.reactFoundation.enumsMod.HorizontalAlignments
import typings.reactFoundation.enumsMod.SpaceControls
import typings.reactFoundation.enumsMod.VerticalAlignments
import typings.reactFoundation.reactFoundationStrings.large
import typings.reactFoundation.reactFoundationStrings.medium
import typings.reactFoundation.utilsMod.FlexboxPropTypes
import typings.std.Event_
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.mod.HTMLAttributes because var conflicts: className. Inlined about, accessKey, autoCapitalize, autoCorrect, autoSave, color, contentEditable, contextMenu, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, translate, typeof, unselectable, vocab */ trait MenuItemProps
  extends FlexboxPropTypes
     with AriaAttributes
     with DOMAttributes[HTMLLIElement] {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  // Standard HTML Attributes
  var accessKey: js.UndefOr[String] = js.undefined
  // Non-standard Attributes
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  // React-specific Attributes
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  // Unknown
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
   // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    alignX: HorizontalAlignments = null,
    alignY: VerticalAlignments = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    centerAlign: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    flexChild: SpaceControls = null,
    flexContainer: js.UndefOr[Boolean] = js.undefined,
    flexDirCol: ExtendedBreakpoints = null,
    flexDirColRev: ExtendedBreakpoints = null,
    flexDirRow: ExtendedBreakpoints = null,
    flexDirRowRev: ExtendedBreakpoints = null,
    flexOrder: Int | Double = null,
    flexOrderLarge: Int | Double = null,
    flexOrderMedium: Int | Double = null,
    flexOrderSmall: Int | Double = null,
    float: FloatTypes = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hideFor: medium | large = null,
    hideOnlyFor: Breakpoints = null,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isClearfix: js.UndefOr[Boolean] = js.undefined,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    isInvisible: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    noDefaultClassName: String = null,
    onAbort: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLLIElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLLIElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLLIElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLLIElement] => Unit = null,
    onBlur: FocusEvent[HTMLLIElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onChange: FormEvent[HTMLLIElement] => Unit = null,
    onClick: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLLIElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLLIElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLLIElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLLIElement] => Unit = null,
    onCut: ClipboardEvent[HTMLLIElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLLIElement] => Unit = null,
    onDragEnd: DragEvent[HTMLLIElement] => Unit = null,
    onDragEnter: DragEvent[HTMLLIElement] => Unit = null,
    onDragExit: DragEvent[HTMLLIElement] => Unit = null,
    onDragLeave: DragEvent[HTMLLIElement] => Unit = null,
    onDragOver: DragEvent[HTMLLIElement] => Unit = null,
    onDragStart: DragEvent[HTMLLIElement] => Unit = null,
    onDrop: DragEvent[HTMLLIElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onEmptied: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onEnded: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onError: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onFocus: FocusEvent[HTMLLIElement] => Unit = null,
    onInput: FormEvent[HTMLLIElement] => Unit = null,
    onInvalid: FormEvent[HTMLLIElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLLIElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLLIElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLLIElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onMouseDown: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLLIElement] => Unit = null,
    onPause: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onPlay: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onPlaying: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onPointerCancel: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLLIElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onRateChange: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onReset: FormEvent[HTMLLIElement] => Unit = null,
    onScroll: UIEvent[HTMLLIElement] => Unit = null,
    onSeeked: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onSeeking: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onSelect: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onStalled: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onSubmit: FormEvent[HTMLLIElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onTouchCancel: TouchEvent[HTMLLIElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLLIElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLLIElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLLIElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLLIElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onWaiting: SyntheticEvent[HTMLLIElement, Event_] => Unit = null,
    onWheel: WheelEvent[HTMLLIElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    selfAlignX: HorizontalAlignments = null,
    selfAlignY: VerticalAlignments = null,
    showFor: Breakpoints = null,
    showForLandscape: js.UndefOr[Boolean] = js.undefined,
    showForPortrait: js.UndefOr[Boolean] = js.undefined,
    showForSr: js.UndefOr[Boolean] = js.undefined,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    showOnlyFor: Breakpoints = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (alignX != null) __obj.updateDynamic("alignX")(alignX.asInstanceOf[js.Any])
    if (alignY != null) __obj.updateDynamic("alignY")(alignY.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (flexChild != null) __obj.updateDynamic("flexChild")(flexChild.asInstanceOf[js.Any])
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (flexDirCol != null) __obj.updateDynamic("flexDirCol")(flexDirCol.asInstanceOf[js.Any])
    if (flexDirColRev != null) __obj.updateDynamic("flexDirColRev")(flexDirColRev.asInstanceOf[js.Any])
    if (flexDirRow != null) __obj.updateDynamic("flexDirRow")(flexDirRow.asInstanceOf[js.Any])
    if (flexDirRowRev != null) __obj.updateDynamic("flexDirRowRev")(flexDirRowRev.asInstanceOf[js.Any])
    if (flexOrder != null) __obj.updateDynamic("flexOrder")(flexOrder.asInstanceOf[js.Any])
    if (flexOrderLarge != null) __obj.updateDynamic("flexOrderLarge")(flexOrderLarge.asInstanceOf[js.Any])
    if (flexOrderMedium != null) __obj.updateDynamic("flexOrderMedium")(flexOrderMedium.asInstanceOf[js.Any])
    if (flexOrderSmall != null) __obj.updateDynamic("flexOrderSmall")(flexOrderSmall.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hideFor != null) __obj.updateDynamic("hideFor")(hideFor.asInstanceOf[js.Any])
    if (hideOnlyFor != null) __obj.updateDynamic("hideOnlyFor")(hideOnlyFor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearfix)) __obj.updateDynamic("isClearfix")(isClearfix.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvisible)) __obj.updateDynamic("isInvisible")(isInvisible.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (noDefaultClassName != null) __obj.updateDynamic("noDefaultClassName")(noDefaultClassName.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (selfAlignX != null) __obj.updateDynamic("selfAlignX")(selfAlignX.asInstanceOf[js.Any])
    if (selfAlignY != null) __obj.updateDynamic("selfAlignY")(selfAlignY.asInstanceOf[js.Any])
    if (showFor != null) __obj.updateDynamic("showFor")(showFor.asInstanceOf[js.Any])
    if (!js.isUndefined(showForLandscape)) __obj.updateDynamic("showForLandscape")(showForLandscape.asInstanceOf[js.Any])
    if (!js.isUndefined(showForPortrait)) __obj.updateDynamic("showForPortrait")(showForPortrait.asInstanceOf[js.Any])
    if (!js.isUndefined(showForSr)) __obj.updateDynamic("showForSr")(showForSr.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.asInstanceOf[js.Any])
    if (showOnlyFor != null) __obj.updateDynamic("showOnlyFor")(showOnlyFor.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

