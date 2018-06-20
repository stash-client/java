# client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.appscode.stash</groupId>
    <artifactId>client-java</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.appscode.stash:client-java:1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-java-1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.appscode.stash.client.*;
import com.appscode.stash.client.auth.*;
import com.appscode.stash.client.models.*;
import com.appscode.stash.client.apis.ApisApi;

import java.io.File;
import java.util.*;

public class ApisApiExample {

    public static void main(String[] args) {
        
        ApisApi apiInstance = new ApisApi();
        try {
            V1APIGroupList result = apiInstance.getAPIVersions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApisApi#getAPIVersions");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApisApi* | [**getAPIVersions**](docs/ApisApi.md#getAPIVersions) | **GET** /apis/ | 
*RepositoriesStashAppscodeComApi* | [**getAPIGroup**](docs/RepositoriesStashAppscodeComApi.md#getAPIGroup) | **GET** /apis/repositories.stash.appscode.com/ | 
*RepositoriesStashAppscodeComV1alpha1Api* | [**deleteNamespacedSnapshot**](docs/RepositoriesStashAppscodeComV1alpha1Api.md#deleteNamespacedSnapshot) | **DELETE** /apis/repositories.stash.appscode.com/v1alpha1/namespaces/{namespace}/snapshots/{name} | 
*RepositoriesStashAppscodeComV1alpha1Api* | [**getAPIResources**](docs/RepositoriesStashAppscodeComV1alpha1Api.md#getAPIResources) | **GET** /apis/repositories.stash.appscode.com/v1alpha1/ | 
*RepositoriesStashAppscodeComV1alpha1Api* | [**listNamespacedSnapshot**](docs/RepositoriesStashAppscodeComV1alpha1Api.md#listNamespacedSnapshot) | **GET** /apis/repositories.stash.appscode.com/v1alpha1/namespaces/{namespace}/snapshots | 
*RepositoriesStashAppscodeComV1alpha1Api* | [**listSnapshotForAllNamespaces**](docs/RepositoriesStashAppscodeComV1alpha1Api.md#listSnapshotForAllNamespaces) | **GET** /apis/repositories.stash.appscode.com/v1alpha1/snapshots | 
*RepositoriesStashAppscodeComV1alpha1Api* | [**readNamespacedSnapshot**](docs/RepositoriesStashAppscodeComV1alpha1Api.md#readNamespacedSnapshot) | **GET** /apis/repositories.stash.appscode.com/v1alpha1/namespaces/{namespace}/snapshots/{name} | 
*StashAppscodeComApi* | [**getAPIGroup**](docs/StashAppscodeComApi.md#getAPIGroup) | **GET** /apis/stash.appscode.com/ | 
*StashAppscodeComV1alpha1Api* | [**createNamespacedRecovery**](docs/StashAppscodeComV1alpha1Api.md#createNamespacedRecovery) | **POST** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/recoveries | 
*StashAppscodeComV1alpha1Api* | [**createNamespacedRepository**](docs/StashAppscodeComV1alpha1Api.md#createNamespacedRepository) | **POST** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/repositories | 
*StashAppscodeComV1alpha1Api* | [**createNamespacedRestic**](docs/StashAppscodeComV1alpha1Api.md#createNamespacedRestic) | **POST** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/restics | 
*StashAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedRecovery**](docs/StashAppscodeComV1alpha1Api.md#deleteCollectionNamespacedRecovery) | **DELETE** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/recoveries | 
*StashAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedRepository**](docs/StashAppscodeComV1alpha1Api.md#deleteCollectionNamespacedRepository) | **DELETE** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/repositories | 
*StashAppscodeComV1alpha1Api* | [**deleteCollectionNamespacedRestic**](docs/StashAppscodeComV1alpha1Api.md#deleteCollectionNamespacedRestic) | **DELETE** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/restics | 
*StashAppscodeComV1alpha1Api* | [**deleteNamespacedRecovery**](docs/StashAppscodeComV1alpha1Api.md#deleteNamespacedRecovery) | **DELETE** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/recoveries/{name} | 
*StashAppscodeComV1alpha1Api* | [**deleteNamespacedRepository**](docs/StashAppscodeComV1alpha1Api.md#deleteNamespacedRepository) | **DELETE** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/repositories/{name} | 
*StashAppscodeComV1alpha1Api* | [**deleteNamespacedRestic**](docs/StashAppscodeComV1alpha1Api.md#deleteNamespacedRestic) | **DELETE** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/restics/{name} | 
*StashAppscodeComV1alpha1Api* | [**getAPIResources**](docs/StashAppscodeComV1alpha1Api.md#getAPIResources) | **GET** /apis/stash.appscode.com/v1alpha1/ | 
*StashAppscodeComV1alpha1Api* | [**listNamespacedRecovery**](docs/StashAppscodeComV1alpha1Api.md#listNamespacedRecovery) | **GET** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/recoveries | 
*StashAppscodeComV1alpha1Api* | [**listNamespacedRepository**](docs/StashAppscodeComV1alpha1Api.md#listNamespacedRepository) | **GET** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/repositories | 
*StashAppscodeComV1alpha1Api* | [**listNamespacedRestic**](docs/StashAppscodeComV1alpha1Api.md#listNamespacedRestic) | **GET** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/restics | 
*StashAppscodeComV1alpha1Api* | [**listRecoveryForAllNamespaces**](docs/StashAppscodeComV1alpha1Api.md#listRecoveryForAllNamespaces) | **GET** /apis/stash.appscode.com/v1alpha1/recoveries | 
*StashAppscodeComV1alpha1Api* | [**listRepositoryForAllNamespaces**](docs/StashAppscodeComV1alpha1Api.md#listRepositoryForAllNamespaces) | **GET** /apis/stash.appscode.com/v1alpha1/repositories | 
*StashAppscodeComV1alpha1Api* | [**listResticForAllNamespaces**](docs/StashAppscodeComV1alpha1Api.md#listResticForAllNamespaces) | **GET** /apis/stash.appscode.com/v1alpha1/restics | 
*StashAppscodeComV1alpha1Api* | [**patchNamespacedRecovery**](docs/StashAppscodeComV1alpha1Api.md#patchNamespacedRecovery) | **PATCH** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/recoveries/{name} | 
*StashAppscodeComV1alpha1Api* | [**patchNamespacedRepository**](docs/StashAppscodeComV1alpha1Api.md#patchNamespacedRepository) | **PATCH** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/repositories/{name} | 
*StashAppscodeComV1alpha1Api* | [**patchNamespacedRestic**](docs/StashAppscodeComV1alpha1Api.md#patchNamespacedRestic) | **PATCH** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/restics/{name} | 
*StashAppscodeComV1alpha1Api* | [**readNamespacedRecovery**](docs/StashAppscodeComV1alpha1Api.md#readNamespacedRecovery) | **GET** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/recoveries/{name} | 
*StashAppscodeComV1alpha1Api* | [**readNamespacedRepository**](docs/StashAppscodeComV1alpha1Api.md#readNamespacedRepository) | **GET** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/repositories/{name} | 
*StashAppscodeComV1alpha1Api* | [**readNamespacedRestic**](docs/StashAppscodeComV1alpha1Api.md#readNamespacedRestic) | **GET** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/restics/{name} | 
*StashAppscodeComV1alpha1Api* | [**replaceNamespacedRecovery**](docs/StashAppscodeComV1alpha1Api.md#replaceNamespacedRecovery) | **PUT** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/recoveries/{name} | 
*StashAppscodeComV1alpha1Api* | [**replaceNamespacedRepository**](docs/StashAppscodeComV1alpha1Api.md#replaceNamespacedRepository) | **PUT** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/repositories/{name} | 
*StashAppscodeComV1alpha1Api* | [**replaceNamespacedRestic**](docs/StashAppscodeComV1alpha1Api.md#replaceNamespacedRestic) | **PUT** /apis/stash.appscode.com/v1alpha1/namespaces/{namespace}/restics/{name} | 


## Documentation for Models

 - [V1alpha1AzureSpec](docs/V1alpha1AzureSpec.md)
 - [V1alpha1B2Spec](docs/V1alpha1B2Spec.md)
 - [V1alpha1Backend](docs/V1alpha1Backend.md)
 - [V1alpha1FileGroup](docs/V1alpha1FileGroup.md)
 - [V1alpha1GCSSpec](docs/V1alpha1GCSSpec.md)
 - [V1alpha1LocalSpec](docs/V1alpha1LocalSpec.md)
 - [V1alpha1Recovery](docs/V1alpha1Recovery.md)
 - [V1alpha1RecoveryList](docs/V1alpha1RecoveryList.md)
 - [V1alpha1RecoverySpec](docs/V1alpha1RecoverySpec.md)
 - [V1alpha1RecoveryStatus](docs/V1alpha1RecoveryStatus.md)
 - [V1alpha1Repository](docs/V1alpha1Repository.md)
 - [V1alpha1RepositoryList](docs/V1alpha1RepositoryList.md)
 - [V1alpha1RepositorySpec](docs/V1alpha1RepositorySpec.md)
 - [V1alpha1RepositoryStatus](docs/V1alpha1RepositoryStatus.md)
 - [V1alpha1Restic](docs/V1alpha1Restic.md)
 - [V1alpha1ResticList](docs/V1alpha1ResticList.md)
 - [V1alpha1ResticSpec](docs/V1alpha1ResticSpec.md)
 - [V1alpha1RestoreStats](docs/V1alpha1RestoreStats.md)
 - [V1alpha1RetentionPolicy](docs/V1alpha1RetentionPolicy.md)
 - [V1alpha1S3Spec](docs/V1alpha1S3Spec.md)
 - [V1alpha1Snapshot](docs/V1alpha1Snapshot.md)
 - [V1alpha1SnapshotList](docs/V1alpha1SnapshotList.md)
 - [V1alpha1SnapshotStatus](docs/V1alpha1SnapshotStatus.md)
 - [V1alpha1SwiftSpec](docs/V1alpha1SwiftSpec.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@appscode.com

