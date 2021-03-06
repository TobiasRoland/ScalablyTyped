package typings.awsSdk.documentClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentClient {
  type ArchivalReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADD
    - typings.awsSdk.awsSdkStrings.PUT
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = typings.awsSdk.documentClientMod.DocumentClient._AttributeAction | java.lang.String
  type AttributeDefinitions = js.Array[typings.awsSdk.documentClientMod.DocumentClient.AttributeDefinition]
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.AttributeName]
  type AttributeUpdates = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeValueUpdate]
  type AttributeValue = js.Any
  type AttributeValueList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.AutoScalingPolicyDescription]
  type AutoScalingPolicyName = java.lang.String
  type AutoScalingRoleArn = java.lang.String
  type Backfilling = scala.Boolean
  type BackupArn = java.lang.String
  type BackupCreationDateTime = typings.std.Date
  type BackupName = java.lang.String
  type BackupSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - java.lang.String
  */
  type BackupStatus = typings.awsSdk.documentClientMod.DocumentClient._BackupStatus | java.lang.String
  type BackupSummaries = js.Array[typings.awsSdk.documentClientMod.DocumentClient.BackupSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.SYSTEM
    - typings.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = typings.awsSdk.documentClientMod.DocumentClient._BackupType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.SYSTEM
    - typings.awsSdk.awsSdkStrings.AWS_BACKUP
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = typings.awsSdk.documentClientMod.DocumentClient._BackupTypeFilter | java.lang.String
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.KeysAndAttributes]
  type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.ItemList]
  type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.WriteRequests]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PROVISIONED
    - typings.awsSdk.awsSdkStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = typings.awsSdk.documentClientMod.DocumentClient._BillingMode | java.lang.String
  type BinaryAttributeValue = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.documentClientMod.DocumentClient.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[typings.awsSdk.documentClientMod.DocumentClient.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQ
    - typings.awsSdk.awsSdkStrings.NE
    - typings.awsSdk.awsSdkStrings.IN
    - typings.awsSdk.awsSdkStrings.LE
    - typings.awsSdk.awsSdkStrings.LT
    - typings.awsSdk.awsSdkStrings.GE
    - typings.awsSdk.awsSdkStrings.GT
    - typings.awsSdk.awsSdkStrings.BETWEEN
    - typings.awsSdk.awsSdkStrings.NOT_NULL
    - typings.awsSdk.awsSdkStrings.NULL
    - typings.awsSdk.awsSdkStrings.CONTAINS
    - typings.awsSdk.awsSdkStrings.NOT_CONTAINS
    - typings.awsSdk.awsSdkStrings.BEGINS_WITH
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.documentClientMod.DocumentClient._ComparisonOperator | java.lang.String
  type ConditionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AND
    - typings.awsSdk.awsSdkStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = typings.awsSdk.documentClientMod.DocumentClient._ConditionalOperator | java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = typings.awsSdk.documentClientMod.DocumentClient._ContinuousBackupsStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLE
    - typings.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type ContributorInsightsAction = typings.awsSdk.documentClientMod.DocumentClient._ContributorInsightsAction | java.lang.String
  type ContributorInsightsRule = java.lang.String
  type ContributorInsightsRuleList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ContributorInsightsStatus = typings.awsSdk.documentClientMod.DocumentClient._ContributorInsightsStatus | java.lang.String
  type ContributorInsightsSummaries = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsSummary]
  type Date = typings.std.Date
  type Double = scala.Double
  type Endpoints = js.Array[typings.awsSdk.documentClientMod.DocumentClient.Endpoint]
  type ExceptionDescription = java.lang.String
  type ExceptionName = java.lang.String
  type ExpectedAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.ExpectedAttributeValue]
  type ExpressionAttributeNameMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeName]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ExpressionAttributeValueVariable = java.lang.String
  type FilterConditionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.Condition]
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[
    typings.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexAutoScalingUpdate
  ]
  type GlobalSecondaryIndexDescriptionList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[typings.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[
    typings.awsSdk.documentClientMod.DocumentClient.GlobalTableGlobalSecondaryIndexSettingsUpdate
  ]
  type GlobalTableList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.GlobalTable]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = typings.awsSdk.documentClientMod.DocumentClient._GlobalTableStatus | java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = typings.awsSdk.documentClientMod.DocumentClient._IndexStatus | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionKeyAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ItemCollectionSizeEstimateBound]
  type ItemCount = scala.Double
  type ItemList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.AttributeMap]
  type ItemResponseList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type Key = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type KeyConditions = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.Condition]
  type KeyExpression = java.lang.String
  type KeyList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.Key]
  type KeySchema = js.Array[typings.awsSdk.documentClientMod.DocumentClient.KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HASH
    - typings.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typings.awsSdk.documentClientMod.DocumentClient._KeyType | java.lang.String
  type LastUpdateDateTime = typings.std.Date
  type ListAttributeValue = js.Array[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ListContributorInsightsLimit = scala.Double
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[typings.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexInfo]
  type Long = scala.Double
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[typings.awsSdk.documentClientMod.DocumentClient.NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = typings.awsSdk.documentClientMod.DocumentClient._PointInTimeRecoveryStatus | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.KEYS_ONLY
    - typings.awsSdk.awsSdkStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = typings.awsSdk.documentClientMod.DocumentClient._ProjectionType | java.lang.String
  type PutItemInputAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type RegionName = java.lang.String
  type ReplicaAutoScalingDescriptionList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicaAutoScalingDescription]
  type ReplicaAutoScalingUpdateList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicaAutoScalingUpdate]
  type ReplicaDescriptionList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicaDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[
    typings.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingDescription
  ]
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[
    typings.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingUpdate
  ]
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[
    typings.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexDescription
  ]
  type ReplicaGlobalSecondaryIndexList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndex]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[
    typings.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexSettingsDescription
  ]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[
    typings.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexSettingsUpdate
  ]
  type ReplicaList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.Replica]
  type ReplicaSettingsDescriptionList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicaSettingsUpdate]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.CREATION_FAILED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ReplicaStatus = typings.awsSdk.documentClientMod.DocumentClient._ReplicaStatus | java.lang.String
  type ReplicaStatusDescription = java.lang.String
  type ReplicaStatusPercentProgress = java.lang.String
  type ReplicaUpdateList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicaUpdate]
  type ReplicationGroupUpdateList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.ReplicationGroupUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INDEXES
    - typings.awsSdk.awsSdkStrings.TOTAL
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = typings.awsSdk.documentClientMod.DocumentClient._ReturnConsumedCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIZE
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = typings.awsSdk.documentClientMod.DocumentClient._ReturnItemCollectionMetrics | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.ALL_OLD
    - typings.awsSdk.awsSdkStrings.UPDATED_OLD
    - typings.awsSdk.awsSdkStrings.ALL_NEW
    - typings.awsSdk.awsSdkStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = typings.awsSdk.documentClientMod.DocumentClient._ReturnValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL_OLD
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = typings.awsSdk.documentClientMod.DocumentClient._ReturnValuesOnConditionCheckFailure | java.lang.String
  type SSEEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = typings.awsSdk.documentClientMod.DocumentClient._SSEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AES256
    - typings.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type SSEType = typings.awsSdk.documentClientMod.DocumentClient._SSEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S
    - typings.awsSdk.awsSdkStrings.N
    - typings.awsSdk.awsSdkStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = typings.awsSdk.documentClientMod.DocumentClient._ScalarAttributeType | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.documentClientMod.DocumentClient.Capacity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
    - typings.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
    - typings.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
    - typings.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type Select = typings.awsSdk.documentClientMod.DocumentClient._Select | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEW_IMAGE
    - typings.awsSdk.awsSdkStrings.OLD_IMAGE
    - typings.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typings.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typings.awsSdk.documentClientMod.DocumentClient._StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typings.awsSdk.documentClientMod.DocumentClient.StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = typings.std.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.TableName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
    - typings.awsSdk.awsSdkStrings.ARCHIVING
    - typings.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type TableStatus = typings.awsSdk.documentClientMod.DocumentClient._TableStatus | java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.Tag]
  type TagValueString = java.lang.String
  type TimeRangeLowerBound = typings.std.Date
  type TimeRangeUpperBound = typings.std.Date
  type TimeToLiveAttributeName = java.lang.String
  type TimeToLiveEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type TimeToLiveStatus = typings.awsSdk.documentClientMod.DocumentClient._TimeToLiveStatus | java.lang.String
  type TransactGetItemList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.TransactGetItem]
  type TransactWriteItemList = js.Array[typings.awsSdk.documentClientMod.DocumentClient.TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[typings.awsSdk.documentClientMod.DocumentClient.WriteRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.node.Buffer
    - typings.awsSdk.documentClientMod.File
    - typings.awsSdk.documentClientMod.Blob
    - typings.std.ArrayBuffer
    - typings.std.DataView
    - typings.std.Int8Array
    - typings.std.Uint8Array
    - typings.std.Uint8ClampedArray
    - typings.std.Int16Array
    - typings.std.Uint16Array
    - typings.std.Int32Array
    - typings.std.Uint32Array
    - typings.std.Float32Array
    - typings.std.Float64Array
    - typings.node.streamMod.Stream
  */
  type binaryType = typings.awsSdk.documentClientMod.DocumentClient._binaryType | typings.node.Buffer | typings.std.ArrayBuffer | typings.std.DataView | typings.std.Int8Array | typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Float32Array | typings.std.Float64Array | typings.node.streamMod.Stream
}
