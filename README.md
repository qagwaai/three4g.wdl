# three4g.wdl

[three4g](https://github.com/blimster/net.blimster.gwt.threejs/) is a GWT binding for [three.js](https://github.com/mrdoob/three.js/) by Mr.doob.

**three4g.wdl** is the domain specific language (DSL) that helps to write the wrapper classes. 

## Getting Started

**three4g.wdl** uses the Eclipse IDE for developing. It uses **Xtext** to generate wrapper classes for the public **three.js** API.

### Install Xtext

Install Xtext into your Eclipse IDE via the [Xtext update site](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/).

### Get the projects

Use a GIT team provider plug-in (e.g. EGit) to import the projects **net.blimster.gwt.threejs.wdl** and **net.blimster.gwt.threejs.wdl.ui** into your Eclipse workspace.

### Create and deploy the Eclipse plug-in

* Select the project **net.blimster.gwt.threejs.wdl** and select **Export…** from the **File** menu.
* Select **Plug-In Development** > **Deployable plug-ins and fragments** and click **Next** in the upcoming dialog.
* Select **net.blimster.gwt.threejs.wdl** and **net.blimster.gwt.threejs.wdl.ui** on the next side of the dialog. Enter a destination directory.
* Click **Finish**.

2 Jars are created in the destination directory. Copy them into your plug-in folder of your Eclipse installation. Restart Eclipse.
