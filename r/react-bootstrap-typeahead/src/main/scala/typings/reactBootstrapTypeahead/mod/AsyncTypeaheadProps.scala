package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncTypeaheadProps[T /* <: TypeaheadModel */] extends TypeaheadProps[T] {
  /* 	Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[Double] = js.undefined
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: Boolean
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[ReactNode] = js.undefined
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[ReactNode] = js.undefined
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[Boolean] = js.undefined
  /* Callback to perform when the search is executed. */
  def onSearch(query: String): Unit
}

object AsyncTypeaheadProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    isLoading: Boolean,
    onSearch: String => Unit,
    options: js.Array[T],
    a11yNumResults: () => Unit = null,
    a11yNumSelected: () => Unit = null,
    align: TypeaheadAlign = null,
    allowNew: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean]) = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    bodyContainer: js.UndefOr[Boolean] = js.undefined,
    bsSize: TypeaheadBsSizes = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    defaultInputValue: String = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultSelected: js.Array[T] = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropup: js.UndefOr[Boolean] = js.undefined,
    emptyLabel: String = null,
    filterBy: js.Array[String] | (js.Function2[T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean]) = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    highlightOnlyResult: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    ignoreDiacritics: js.UndefOr[Boolean] = js.undefined,
    inputProps: InputProps = null,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[Boolean] = js.undefined,
    labelKey: TypeaheadLabelKey[T] = null,
    maxHeight: String = null,
    maxResults: Int | Double = null,
    menuId: String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    newSelectionPrefix: String = null,
    onBlur: /* e */ Event_ => Unit = null,
    onChange: /* selected */ js.Array[T] => Unit = null,
    onFocus: /* e */ Event_ => Unit = null,
    onInputChange: (/* input */ String, /* e */ Event_) => Unit = null,
    onKeyDown: /* e */ Event_ => Unit = null,
    onMenuHide: () => Unit = null,
    onMenuShow: () => Unit = null,
    onMenuToggle: /* show */ Boolean => Unit = null,
    onPaginate: (/* e */ Event_, /* numResults */ Double) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    paginate: js.UndefOr[Boolean] = js.undefined,
    paginationText: String = null,
    placeholder: String = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    promptText: ReactNode = null,
    renderMenu: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ js.Any) => ReactNode = null,
    renderMenuItemChildren: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode = null,
    renderToken: (T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode = null,
    searchText: ReactNode = null,
    selectHintOnEnter: js.UndefOr[Boolean] = js.undefined,
    selected: js.Array[T] = null,
    useCache: js.UndefOr[Boolean] = js.undefined
  ): AsyncTypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], onSearch = js.Any.fromFunction1(onSearch), options = options.asInstanceOf[js.Any])
    if (a11yNumResults != null) __obj.updateDynamic("a11yNumResults")(js.Any.fromFunction0(a11yNumResults))
    if (a11yNumSelected != null) __obj.updateDynamic("a11yNumSelected")(js.Any.fromFunction0(a11yNumSelected))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (allowNew != null) __obj.updateDynamic("allowNew")(allowNew.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyContainer)) __obj.updateDynamic("bodyContainer")(bodyContainer.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.asInstanceOf[js.Any])
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightOnlyResult)) __obj.updateDynamic("highlightOnlyResult")(highlightOnlyResult.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDiacritics)) __obj.updateDynamic("ignoreDiacritics")(ignoreDiacritics.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (newSelectionPrefix != null) __obj.updateDynamic("newSelectionPrefix")(newSelectionPrefix.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2(onInputChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMenuHide != null) __obj.updateDynamic("onMenuHide")(js.Any.fromFunction0(onMenuHide))
    if (onMenuShow != null) __obj.updateDynamic("onMenuShow")(js.Any.fromFunction0(onMenuShow))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1(onMenuToggle))
    if (onPaginate != null) __obj.updateDynamic("onPaginate")(js.Any.fromFunction2(onPaginate))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (paginationText != null) __obj.updateDynamic("paginationText")(paginationText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (promptText != null) __obj.updateDynamic("promptText")(promptText.asInstanceOf[js.Any])
    if (renderMenu != null) __obj.updateDynamic("renderMenu")(js.Any.fromFunction2(renderMenu))
    if (renderMenuItemChildren != null) __obj.updateDynamic("renderMenuItemChildren")(js.Any.fromFunction3(renderMenuItemChildren))
    if (renderToken != null) __obj.updateDynamic("renderToken")(js.Any.fromFunction3(renderToken))
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectHintOnEnter)) __obj.updateDynamic("selectHintOnEnter")(selectHintOnEnter.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncTypeaheadProps[T]]
  }
}

