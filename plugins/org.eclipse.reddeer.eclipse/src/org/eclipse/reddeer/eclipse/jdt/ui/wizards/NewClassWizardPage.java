/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Red Hat, Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.reddeer.eclipse.jdt.ui.wizards;

import org.eclipse.reddeer.core.reference.ReferencedComposite;
import org.eclipse.reddeer.jface.wizard.WizardPage;
import org.eclipse.reddeer.swt.impl.button.CheckBox;
import org.eclipse.reddeer.swt.impl.text.LabeledText;

/**
 * Wizard page for creating a java class.
 */
public class NewClassWizardPage extends WizardPage {

	/**
	 * Instantiates a new new java class wizard page.
	 */
	public NewClassWizardPage(ReferencedComposite referencedComposite) {
		super(referencedComposite);
	}
	
	/**
	 * Sets a given name.
	 * 
	 * @param name Name
	 */
	public NewClassWizardPage setName(String name){
		new LabeledText(this, "Name:").setText(name);
		return this;
	}
	
	/**
	 * Sets a given package name.
	 * 
	 * @param packageName Package name
	 */
	public NewClassWizardPage setPackage(String packageName) {
		new LabeledText(this, "Package:").setText(packageName);
		return this;
	}
	
	/**
	 * Sets a given source folder.
	 * 
	 * @param sourceFolder Source folder
	 */
	public NewClassWizardPage setSourceFolder(String sourceFolder){
		new LabeledText(this, "Source folder:").setText(sourceFolder);
		return this;
	}
	
	/**
	 * Sets generating static main method.
	 * 
	 * @param setMainMethod Indicates whether to generate static main method
	 */
	public NewClassWizardPage setStaticMainMethod(boolean setMainMethod) {
		new CheckBox(this, "public static void main(String[] args)").toggle(setMainMethod);
		return this;
	}
	
	/**
	 * Returns a package name.
	 * 
	 * @return package name
	 */
	public String getPackage(){
		return new LabeledText(this, "Package:").getText();
	}
	
	/**
	 * Returns a class name.
	 * 
	 * @return Class name
	 */
	public String getName(){
		return new LabeledText(this, "Name:").getText();
	}
	
	/**
	 * Returns a source folder.
	 * 
	 * @return Source folder
	 */
	public String getSourceFolder(){
		return new LabeledText(this, "Source folder:").getText();
	}
}
