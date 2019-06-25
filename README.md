Bazel Android Sample
======

This repository contains different application configurations and its Bazel build files. In order to build these samples, do the following:

* Checkout any interesting branch from the list:
  * java_with_deps - small one class android project with AppCompat dependencies written in Java.
  * java_kotlin_1.2_with_deps - small one java and one kotlin class android project with AppCompat dependencies that able to compile into one result app.
  * kotlin_1.2_with_deps - small one class android project with AppCompat dependencies written in Kotlin 1.2.70.
  * koltin_1.3_with_deps - small one class android project with AppCompat dependencies written in Kptlin 1.3.30. Currently uses custom rules because Bazel is not working (see https://github.com/bazelbuild/rules_kotlin/issues/159)
* Update you PATH and set up `ANDROID_HOME` variable as it is written here (https://docs.bazel.build/versions/master/tutorial/android-app.html#integrate-with-the-android-sdk)
* Run `bazel build //app/src/main:bazel` to build project