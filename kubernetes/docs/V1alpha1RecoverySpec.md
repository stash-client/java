
# V1alpha1RecoverySpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imagePullSecrets** | [**List&lt;V1LocalObjectReference&gt;**](V1LocalObjectReference.md) |  |  [optional]
**paths** | **List&lt;String&gt;** |  |  [optional]
**recoveredVolumes** | [**List&lt;V1alpha1LocalSpec&gt;**](V1alpha1LocalSpec.md) |  |  [optional]
**repository** | [**V1ObjectReference**](V1ObjectReference.md) |  | 
**snapshot** | **String** | Snapshot to recover. Default is latest snapshot. |  [optional]



