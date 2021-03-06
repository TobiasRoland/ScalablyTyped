package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultWorkflowOperations extends js.Object {
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
  def GetStateTransitionSignatureSettings(FromState: Double, ToState: Double): ISignatureSettings
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: Double): ISignatureSettings
  def GetWorkflowAdmin(WorkflowID: Double): IWorkflowAdmin
  def GetWorkflowForClient(WorkflowID: Double, UpdateFromServer: Boolean): IWorkflow
  def GetWorkflowIDByAlias(Alias: String): Double
  def GetWorkflowIDByGUID(WorkflowGUID: String): Double
  def GetWorkflowStateIDByAlias(Alias: String): Double
  def GetWorkflowStateIDByGUID(StateGUID: String): Double
  def GetWorkflowStateTransitionIDByAlias(Alias: String): Double
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: String): Double
  def GetWorkflowStateTransitions(Workflow: Double, CurrentState: ITypedValue): IStateTransitionsForClient
  def GetWorkflowStateTransitionsAsJSON(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): String
  def GetWorkflowStateTransitionsEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStateTransitionsForClient
  def GetWorkflowStates(Workflow: Double, CurrentState: ITypedValue): IStates
  def GetWorkflowStatesEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStates
  def GetWorkflowsAdmin(): IWorkflowsAdmin
  def GetWorkflowsAsValueListItems(UpdateFromServer: Boolean): IValueListItems
  def GetWorkflowsForClient(UpdateFromServer: Boolean): IWorkflows
  def RemoveWorkflowAdmin(WorkflowID: Double): Unit
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
}

object IVaultWorkflowOperations {
  @scala.inline
  def apply(
    AddWorkflowAdmin: IWorkflowAdmin => IWorkflowAdmin,
    GetStateTransitionSignatureSettings: (Double, Double) => ISignatureSettings,
    GetStateTransitionSignatureSettingsByID: Double => ISignatureSettings,
    GetWorkflowAdmin: Double => IWorkflowAdmin,
    GetWorkflowForClient: (Double, Boolean) => IWorkflow,
    GetWorkflowIDByAlias: String => Double,
    GetWorkflowIDByGUID: String => Double,
    GetWorkflowStateIDByAlias: String => Double,
    GetWorkflowStateIDByGUID: String => Double,
    GetWorkflowStateTransitionIDByAlias: String => Double,
    GetWorkflowStateTransitionIDByGUID: String => Double,
    GetWorkflowStateTransitions: (Double, ITypedValue) => IStateTransitionsForClient,
    GetWorkflowStateTransitionsAsJSON: (Double, ITypedValue, IObjVer) => String,
    GetWorkflowStateTransitionsEx: (Double, ITypedValue, IObjVer) => IStateTransitionsForClient,
    GetWorkflowStates: (Double, ITypedValue) => IStates,
    GetWorkflowStatesEx: (Double, ITypedValue, IObjVer) => IStates,
    GetWorkflowsAdmin: () => IWorkflowsAdmin,
    GetWorkflowsAsValueListItems: Boolean => IValueListItems,
    GetWorkflowsForClient: Boolean => IWorkflows,
    RemoveWorkflowAdmin: Double => Unit,
    UpdateWorkflowAdmin: IWorkflowAdmin => IWorkflowAdmin
  ): IVaultWorkflowOperations = {
    val __obj = js.Dynamic.literal(AddWorkflowAdmin = js.Any.fromFunction1(AddWorkflowAdmin), GetStateTransitionSignatureSettings = js.Any.fromFunction2(GetStateTransitionSignatureSettings), GetStateTransitionSignatureSettingsByID = js.Any.fromFunction1(GetStateTransitionSignatureSettingsByID), GetWorkflowAdmin = js.Any.fromFunction1(GetWorkflowAdmin), GetWorkflowForClient = js.Any.fromFunction2(GetWorkflowForClient), GetWorkflowIDByAlias = js.Any.fromFunction1(GetWorkflowIDByAlias), GetWorkflowIDByGUID = js.Any.fromFunction1(GetWorkflowIDByGUID), GetWorkflowStateIDByAlias = js.Any.fromFunction1(GetWorkflowStateIDByAlias), GetWorkflowStateIDByGUID = js.Any.fromFunction1(GetWorkflowStateIDByGUID), GetWorkflowStateTransitionIDByAlias = js.Any.fromFunction1(GetWorkflowStateTransitionIDByAlias), GetWorkflowStateTransitionIDByGUID = js.Any.fromFunction1(GetWorkflowStateTransitionIDByGUID), GetWorkflowStateTransitions = js.Any.fromFunction2(GetWorkflowStateTransitions), GetWorkflowStateTransitionsAsJSON = js.Any.fromFunction3(GetWorkflowStateTransitionsAsJSON), GetWorkflowStateTransitionsEx = js.Any.fromFunction3(GetWorkflowStateTransitionsEx), GetWorkflowStates = js.Any.fromFunction2(GetWorkflowStates), GetWorkflowStatesEx = js.Any.fromFunction3(GetWorkflowStatesEx), GetWorkflowsAdmin = js.Any.fromFunction0(GetWorkflowsAdmin), GetWorkflowsAsValueListItems = js.Any.fromFunction1(GetWorkflowsAsValueListItems), GetWorkflowsForClient = js.Any.fromFunction1(GetWorkflowsForClient), RemoveWorkflowAdmin = js.Any.fromFunction1(RemoveWorkflowAdmin), UpdateWorkflowAdmin = js.Any.fromFunction1(UpdateWorkflowAdmin))
  
    __obj.asInstanceOf[IVaultWorkflowOperations]
  }
}

