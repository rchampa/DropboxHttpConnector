Dropbox HTTP API v2
====================

This library let you use [HTTP Dropbox API](https://www.dropbox.com/developers/documentation/http) while [Java client v2](https://www.dropbox.com/developers/documentation/java) is not ready yet.

How to use
==========
*   [List files of folder](https://github.com/rchampa/DropboxHttpConector/blob/master/src/main/java/es/ric/dropbox/TestListFolder.java)
*   [Create new folder](https://github.com/rchampa/DropboxHttpConector/blob/master/src/main/java/es/ric/dropbox/TestCreateFolder.java)
*   [Download file](https://github.com/rchampa/DropboxHttpConector/blob/master/src/main/java/es/ric/dropbox/TestDownload.java)
*   [Upload file](https://github.com/rchampa/DropboxHttpConector/blob/master/src/main/java/es/ric/dropbox/TestUpload.java)

### Gradle

Import to android studio:
```groovy
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}

dependencies {
	compile 'com.github.rchampa:DropboxHttpConector:1.0.4'
}
```


[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-DropboxHttpConector-green.svg?style=flat)](https://android-arsenal.com/details/1/2621)


License
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


 [1]: http://square.github.io/okhttp

