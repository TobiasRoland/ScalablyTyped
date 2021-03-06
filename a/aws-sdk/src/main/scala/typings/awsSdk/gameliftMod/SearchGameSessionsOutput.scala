package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchGameSessionsOutput extends js.Object {
  /**
    * A collection of objects containing game session properties for each session matching the request.
    */
  var GameSessions: js.UndefOr[GameSessionList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object SearchGameSessionsOutput {
  @scala.inline
  def apply(GameSessions: GameSessionList = null, NextToken: NonZeroAndMaxString = null): SearchGameSessionsOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessions != null) __obj.updateDynamic("GameSessions")(GameSessions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchGameSessionsOutput]
  }
}

