# Bazel Kotlin Android Sample

This repository contains simple Kotlin 1.3 application and its Bazel build files. To build these samples, do the following:

* Update you PATH and set up `ANDROID_HOME` variable as it is written [here](https://docs.bazel.build/versions/master/tutorial/android-app.html#integrate-with-the-android-sdk)
* Run `bazel build //app/src/main:bazel` to build project

Explore our Kotlin build rules and use the same in your projects.

## 💚 Working features 

* Kotlin 1.3 support
* Annotation processing

## 🔴 Current issues

* Databinidng is not supported
* Windows building is not supported
