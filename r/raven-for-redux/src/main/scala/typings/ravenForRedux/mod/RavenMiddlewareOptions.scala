package typings.ravenForRedux.mod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenMiddlewareOptions[T] extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], Action[_]]] = js.undefined
  var breadcrumbCategory: js.UndefOr[String] = js.undefined
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.undefined
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.undefined
  var getUserContext: js.UndefOr[js.Function1[/* state */ T, RavenUserContext]] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, T]] = js.undefined
}

object RavenMiddlewareOptions {
  @scala.inline
  def apply[T](
    actionTransformer: /* action */ Action[_] => Action[_] = null,
    breadcrumbCategory: String = null,
    breadcrumbDataFromAction: /* action */ Action[_] => _ = null,
    filterBreadcrumbActions: /* action */ Action[_] => Boolean = null,
    getUserContext: /* state */ T => RavenUserContext = null,
    stateTransformer: /* state */ T => T = null
  ): RavenMiddlewareOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(js.Any.fromFunction1(actionTransformer))
    if (breadcrumbCategory != null) __obj.updateDynamic("breadcrumbCategory")(breadcrumbCategory.asInstanceOf[js.Any])
    if (breadcrumbDataFromAction != null) __obj.updateDynamic("breadcrumbDataFromAction")(js.Any.fromFunction1(breadcrumbDataFromAction))
    if (filterBreadcrumbActions != null) __obj.updateDynamic("filterBreadcrumbActions")(js.Any.fromFunction1(filterBreadcrumbActions))
    if (getUserContext != null) __obj.updateDynamic("getUserContext")(js.Any.fromFunction1(getUserContext))
    if (stateTransformer != null) __obj.updateDynamic("stateTransformer")(js.Any.fromFunction1(stateTransformer))
    __obj.asInstanceOf[RavenMiddlewareOptions[T]]
  }
}

