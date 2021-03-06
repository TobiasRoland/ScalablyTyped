package typings.antd.transferMod

import typings.antd.renderListBodyMod.TransferListBodyProps
import typings.antd.transferListMod.TransferListProps
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferProps extends js.Object {
  var body: js.UndefOr[js.Function1[/* props */ TransferListProps, ReactNode]] = js.undefined
  var children: js.UndefOr[js.Function1[/* props */ TransferListBodyProps, ReactNode]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.Array[TransferItem]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* inputValue */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, ReactNode]] = js.undefined
  var `lazy`: js.UndefOr[js.Object | Boolean] = js.undefined
  var listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties
  var locale: js.UndefOr[js.Object] = js.undefined
  var notFoundContent: js.UndefOr[ReactNode] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* targetKeys */ js.Array[String], 
      /* direction */ String, 
      /* moveKeys */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var onScroll: js.UndefOr[
    js.Function2[
      /* direction */ TransferDirection, 
      /* e */ SyntheticEvent[HTMLDivElement, Event_], 
      Unit
    ]
  ] = js.undefined
  var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.undefined
  var onSearchChange: js.UndefOr[
    js.Function2[/* direction */ TransferDirection, /* e */ ChangeEvent[HTMLInputElement], Unit]
  ] = js.undefined
  var onSelectChange: js.UndefOr[
    js.Function2[
      /* sourceSelectedKeys */ js.Array[String], 
      /* targetSelectedKeys */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var operationStyle: js.UndefOr[CSSProperties] = js.undefined
  var operations: js.UndefOr[js.Array[String]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[TransferRender] = js.undefined
  var rowKey: js.UndefOr[js.Function1[/* record */ TransferItem, String]] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var targetKeys: js.UndefOr[js.Array[String]] = js.undefined
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}

object TransferProps {
  @scala.inline
  def apply(
    dataSource: js.Array[TransferItem],
    listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties,
    body: /* props */ TransferListProps => ReactNode = null,
    children: /* props */ TransferListBodyProps => ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* inputValue */ String, /* item */ TransferItem) => Boolean = null,
    footer: /* props */ TransferListProps => ReactNode = null,
    `lazy`: js.Object | Boolean = null,
    locale: js.Object = null,
    notFoundContent: ReactNode = null,
    onChange: (/* targetKeys */ js.Array[String], /* direction */ String, /* moveKeys */ js.Array[String]) => Unit = null,
    onScroll: (/* direction */ TransferDirection, /* e */ SyntheticEvent[HTMLDivElement, Event_]) => Unit = null,
    onSearch: (/* direction */ TransferDirection, /* value */ String) => Unit = null,
    onSearchChange: (/* direction */ TransferDirection, /* e */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onSelectChange: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit = null,
    operationStyle: CSSProperties = null,
    operations: js.Array[String] = null,
    prefixCls: String = null,
    render: /* item */ TransferItem => RenderResult = null,
    rowKey: /* record */ TransferItem => String = null,
    searchPlaceholder: String = null,
    selectedKeys: js.Array[String] = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetKeys: js.Array[String] = null,
    titles: js.Array[String] = null
  ): TransferProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(js.Any.fromFunction1(body))
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2(onScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (onSelectChange != null) __obj.updateDynamic("onSelectChange")(js.Any.fromFunction2(onSelectChange))
    if (operationStyle != null) __obj.updateDynamic("operationStyle")(operationStyle.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (rowKey != null) __obj.updateDynamic("rowKey")(js.Any.fromFunction1(rowKey))
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetKeys != null) __obj.updateDynamic("targetKeys")(targetKeys.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProps]
  }
}

