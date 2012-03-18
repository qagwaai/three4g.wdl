
package net.blimster.gwt.threejs.wdl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ThreeJsWrapperDescriptionLanguageStandaloneSetup extends ThreeJsWrapperDescriptionLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new ThreeJsWrapperDescriptionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

