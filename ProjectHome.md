In the Android Open Source Project, when a bugfix is committed in the main repository, it takes a lot of time to be released in the official updates. Non-critical bugfixes can wait, but it's really annoying to wait so much time. That's why I'm backporting some fixes into separate classes so that developers can use it until the fix get's official.

The project is made of a [library](http://code.google.com/p/android-fixes/source/browse/#svn%2Ftrunk%2Flibrary) and a [demo](http://code.google.com/p/android-fixes/source/browse/#svn%2Ftrunk%2Fdemo) application. You can include the library in your Android application if it's based on Eclair or later versions. The demo application demonstrates the patches. If you have any questions or want to provide some feedback, feel free to join the discussion group.

Currently I'm testing the patches on Eclair, Froyo and Gingerbread.

Implemented changes:
  * Change [I44e3c0af](https://review.source.android.com/#change,18381): Make disabled TextViews uneditable (issue [2771](http://code.google.com/p/android/issues/detail?id=2771))