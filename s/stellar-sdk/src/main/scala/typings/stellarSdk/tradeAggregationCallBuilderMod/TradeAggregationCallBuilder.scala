package typings.stellarSdk.tradeAggregationCallBuilderMod

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/trade_aggregation_call_builder", "TradeAggregationCallBuilder")
@js.native
class TradeAggregationCallBuilder protected () extends CallBuilder[CollectionPage[TradeAggregationRecord]] {
  def this(
    serverUrl: URI,
    base: Asset,
    counter: Asset,
    start_time: Double,
    end_time: Double,
    resolution: Double,
    offset: Double
  ) = this()
  var isValidOffset: js.Any = js.native
  var isValidResolution: js.Any = js.native
}

