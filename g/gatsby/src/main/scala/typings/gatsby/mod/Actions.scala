package typings.gatsby.mod

import typings.gatsby.AnonChild
import typings.gatsby.AnonComponent
import typings.gatsby.AnonComponentContext
import typings.gatsby.AnonFieldName
import typings.gatsby.AnonForce
import typings.gatsby.AnonId
import typings.gatsby.AnonNameOptions
import typings.gatsby.AnonNode
import typings.gatsby.AnonNodeIdString
import typings.gatsby.AnonSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  /** @see https://www.gatsbyjs.org/docs/actions/#addThirdPartySchema */
  def addThirdPartySchema(args: AnonSchema): Unit = js.native
  def addThirdPartySchema(args: AnonSchema, plugin: ActionPlugin): Unit = js.native
  def addThirdPartySchema(args: AnonSchema, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createFieldExtension */
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin): Unit = js.native
  def createFieldExtension(extension: js.Object, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createJob */
  def createJob(job: (Record[String, _]) with AnonId): Unit = js.native
  def createJob(job: (Record[String, _]) with AnonId, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNode */
  def createNode(node: NodeInput): Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin): Unit = js.native
  def createNode(node: NodeInput, plugin: ActionPlugin, options: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createNodeField */
  def createNodeField(args: AnonFieldName): Unit = js.native
  def createNodeField(args: AnonFieldName, plugin: ActionPlugin): Unit = js.native
  def createNodeField(args: AnonFieldName, plugin: ActionPlugin, options: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createPage */
  def createPage[TContext](args: AnonComponentContext[TContext]): Unit = js.native
  def createPage[TContext](args: AnonComponentContext[TContext], plugin: ActionPlugin): Unit = js.native
  def createPage[TContext](args: AnonComponentContext[TContext], plugin: ActionPlugin, option: ActionOptions): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createParentChildLink */
  def createParentChildLink(args: AnonChild): Unit = js.native
  def createParentChildLink(args: AnonChild, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createRedirect */
  def createRedirect(redirect: AnonForce): Unit = js.native
  def createRedirect(redirect: AnonForce, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#createTypes */
  def createTypes(types: String): Unit = js.native
  def createTypes(types: String, plugin: ActionPlugin): Unit = js.native
  def createTypes(types: String, plugin: ActionPlugin, traceId: String): Unit = js.native
  def createTypes(types: js.Array[String | js.Object]): Unit = js.native
  def createTypes(types: js.Array[String | js.Object], plugin: ActionPlugin): Unit = js.native
  def createTypes(types: js.Array[String | js.Object], plugin: ActionPlugin, traceId: String): Unit = js.native
  def createTypes(types: js.Object): Unit = js.native
  def createTypes(types: js.Object, plugin: ActionPlugin): Unit = js.native
  def createTypes(types: js.Object, plugin: ActionPlugin, traceId: String): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deleteNode(options: AnonNode): Unit = js.native
  def deleteNode(options: AnonNode, plugin: ActionPlugin): Unit = js.native
  def deleteNode(options: AnonNode, plugin: ActionPlugin, option: ActionOptions): Unit = js.native
  /**
    * @deprecated
    * @see https://www.gatsbyjs.org/docs/actions/#deleteNodes
    */
  def deleteNodes(nodes: js.Array[String]): Unit = js.native
  def deleteNodes(nodes: js.Array[String], plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#deletePage */
  def deletePage(args: AnonComponent): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#endJob */
  def endJob(job: AnonId): Unit = js.native
  def endJob(job: AnonId, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#replaceWebpackConfig */
  def replaceWebpackConfig(config: js.Object): Unit = js.native
  def replaceWebpackConfig(config: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelOptions */
  def setBabelOptions(options: js.Object): Unit = js.native
  def setBabelOptions(options: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPlugin */
  def setBabelPlugin(config: AnonNameOptions): Unit = js.native
  def setBabelPlugin(config: AnonNameOptions, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setBabelPreset */
  def setBabelPreset(config: AnonNameOptions): Unit = js.native
  def setBabelPreset(config: AnonNameOptions, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setJob */
  def setJob(job: (Record[String, _]) with AnonId): Unit = js.native
  def setJob(job: (Record[String, _]) with AnonId, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setPluginStatus */
  def setPluginStatus(status: Record[String, _]): Unit = js.native
  def setPluginStatus(status: Record[String, _], plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#setWebpackConfig */
  def setWebpackConfig(config: js.Object): Unit = js.native
  def setWebpackConfig(config: js.Object, plugin: ActionPlugin): Unit = js.native
  /** @see https://www.gatsbyjs.org/docs/actions/#touchNode */
  def touchNode(node: AnonNodeIdString): Unit = js.native
  def touchNode(node: AnonNodeIdString, plugin: ActionPlugin): Unit = js.native
}

