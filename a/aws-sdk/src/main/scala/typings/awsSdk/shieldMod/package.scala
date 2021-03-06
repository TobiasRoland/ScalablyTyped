package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shieldMod {
  type AttackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NETWORK
    - typings.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type AttackLayer = typings.awsSdk.shieldMod._AttackLayer | java.lang.String
  type AttackProperties = js.Array[typings.awsSdk.shieldMod.AttackProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DESTINATION_URL
    - typings.awsSdk.awsSdkStrings.REFERRER
    - typings.awsSdk.awsSdkStrings.SOURCE_ASN
    - typings.awsSdk.awsSdkStrings.SOURCE_COUNTRY
    - typings.awsSdk.awsSdkStrings.SOURCE_IP_ADDRESS
    - typings.awsSdk.awsSdkStrings.SOURCE_USER_AGENT
    - typings.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_REFLECTOR
    - typings.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_SOURCE
    - java.lang.String
  */
  type AttackPropertyIdentifier = typings.awsSdk.shieldMod._AttackPropertyIdentifier | java.lang.String
  type AttackSummaries = js.Array[typings.awsSdk.shieldMod.AttackSummary]
  type AttackTimestamp = typings.std.Date
  type AttackVectorDescriptionList = js.Array[typings.awsSdk.shieldMod.AttackVectorDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AutoRenew = typings.awsSdk.shieldMod._AutoRenew | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.shieldMod.ClientApiVersions
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EmailAddress = java.lang.String
  type EmergencyContactList = js.Array[typings.awsSdk.shieldMod.EmergencyContact]
  type Integer = scala.Double
  type Limits = js.Array[typings.awsSdk.shieldMod.Limit]
  type LogBucket = java.lang.String
  type LogBucketList = js.Array[typings.awsSdk.shieldMod.LogBucket]
  type Long = scala.Double
  type MaxResults = scala.Double
  type MitigationList = js.Array[typings.awsSdk.shieldMod.Mitigation]
  type ProtectionId = java.lang.String
  type ProtectionName = java.lang.String
  type Protections = js.Array[typings.awsSdk.shieldMod.Protection]
  type ResourceArn = java.lang.String
  type ResourceArnFilterList = js.Array[typings.awsSdk.shieldMod.ResourceArn]
  type RoleArn = java.lang.String
  type String = java.lang.String
  type SubResourceSummaryList = js.Array[typings.awsSdk.shieldMod.SubResourceSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IP
    - typings.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type SubResourceType = typings.awsSdk.shieldMod._SubResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type SubscriptionState = typings.awsSdk.shieldMod._SubscriptionState | java.lang.String
  type SummarizedAttackVectorList = js.Array[typings.awsSdk.shieldMod.SummarizedAttackVector]
  type SummarizedCounterList = js.Array[typings.awsSdk.shieldMod.SummarizedCounter]
  type Timestamp = typings.std.Date
  type Token = java.lang.String
  type TopContributors = js.Array[typings.awsSdk.shieldMod.Contributor]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BITS
    - typings.awsSdk.awsSdkStrings.BYTES
    - typings.awsSdk.awsSdkStrings.PACKETS
    - typings.awsSdk.awsSdkStrings.REQUESTS
    - java.lang.String
  */
  type Unit = typings.awsSdk.shieldMod._Unit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-06-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.shieldMod._apiVersion | java.lang.String
}
