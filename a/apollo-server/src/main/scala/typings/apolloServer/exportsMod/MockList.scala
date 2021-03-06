package typings.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "MockList")
@js.native
class MockList protected ()
  extends typings.graphqlTools.mod.MockList {
  def this(len: js.Array[Double]) = this()
  def this(len: Double) = this()
  def this(len: js.Array[Double], wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
  def this(len: Double, wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
}

