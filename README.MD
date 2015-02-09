JavaFX on Android - issue demo
===================

This is small demo project which should demonstrate issues when running JavaFX application on Android device.

> **Note:**

> - Code is tested on LG Nexus 4 device, Android 5.0.1

AndroidDemoApp.java
-------------------

This application demonstrates following issues:

- **Screen rotation**
:   When screen is rotated, form can not be scrolled (part of the form is not visible).

- **Editing field on bottom of the screen**
:   When editing income field, editing field is not visible. When keyboard is closed, form title is not visible any more.

AndroidDemoApp2.java
-------------------

Loaded FXML is added to ScrollPane. Is this way to go?

AndroidDemoApp3.java
-------------------

Demonstration of using 3rd party calendar. Used calendar is from project: https://bitbucket.org/sco0ter/extfx


**Other issues**
-------------------

- ~~**Platform.exit()**~~
: On cancel button click, Platform.exit() is called. Result is black screen. Application can't be started again, I must kill it.

- ~~**DatePicker component**~~
: Date picker crash application if I rotate screen and try to open date picker.

- **Blurred components**
:  When I rotate screen and start to scroll, some labels and controls 

