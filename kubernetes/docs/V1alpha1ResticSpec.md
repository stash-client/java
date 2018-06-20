
# V1alpha1ResticSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend** | [**V1alpha1Backend**](V1alpha1Backend.md) |  |  [optional]
**fileGroups** | [**List&lt;V1alpha1FileGroup&gt;**](V1alpha1FileGroup.md) |  |  [optional]
**imagePullSecrets** | [**List&lt;V1LocalObjectReference&gt;**](V1LocalObjectReference.md) | ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod |  [optional]
**paused** | **Boolean** | Indicates that the Restic is paused from taking backup. Default value is &#39;false&#39; |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) | Compute Resources required by the sidecar container. |  [optional]
**retentionPolicies** | [**List&lt;V1alpha1RetentionPolicy&gt;**](V1alpha1RetentionPolicy.md) |  |  [optional]
**schedule** | **String** |  |  [optional]
**selector** | [**V1LabelSelector**](V1LabelSelector.md) |  |  [optional]
**type** | **String** | https://github.com/appscode/stash/issues/225 |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | Pod volumes to mount into the sidecar container&#39;s filesystem. |  [optional]



