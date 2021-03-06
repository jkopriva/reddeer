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
package org.eclipse.reddeer.eclipse.m2e.scm.wizards;

import java.util.List;

import org.eclipse.reddeer.core.reference.ReferencedComposite;
import org.eclipse.reddeer.jface.wizard.WizardPage;
import org.eclipse.reddeer.swt.impl.button.CheckBox;
import org.eclipse.reddeer.swt.impl.combo.DefaultCombo;
import org.eclipse.reddeer.swt.impl.combo.LabeledCombo;
import org.eclipse.reddeer.swt.impl.text.LabeledText;

public class MavenCheckoutLocationPage extends WizardPage{
	
	public MavenCheckoutLocationPage(ReferencedComposite referencedComposite) {
		super(referencedComposite);
	}
	
	/**
	 * Get available SCM types.
	 *
	 * @return list of available SCM types
	 */
	public List<String> getAvailableSCMTypes(){
		return new LabeledCombo(this, "SCM URL:").getItems();
	}
	
	/**
	 * Get selected SCM type.
	 *
	 * @return selected SCM type
	 */
	public String getSelectedSCMType(){
		return new LabeledCombo(this, "SCM URL:").getSelection();
	}
	
	/**
	 * Set SCM type.
	 *
	 * @param scmType to select
	 */
	public MavenCheckoutLocationPage setSCMType(String scmType){
		new LabeledCombo(this, "SCM URL:").setSelection(scmType);
		return this;
	}
	
	/**
	 * Set SCM URL.
	 *
	 * @param scmURL to select
	 */
	public MavenCheckoutLocationPage setSCMURL(String scmURL){
		new DefaultCombo(this, 1).setText(scmURL);
		return this;
	}
	
	/**
	 * Get selected SCM URL.
	 *
	 * @return selected SCM URL
	 */
	public String getSCMURL(){
		return new DefaultCombo(this, 1).getText();
	}
	
	/**
	 * Get available SCM URLs.
	 *
	 * @return list of available SCM URLs
	 */
	public List<String> getAvailableSCMURLs(){
		return new DefaultCombo(this, 1).getItems();
	}
	
	/**
	 * Toggle checkout head revision .
	 *
	 * @param toggle the toggle
	 */
	public MavenCheckoutLocationPage toggleCheckoutHeadRevision(boolean toggle){
		 new CheckBox(this, "Check out Head Revision").toggle(toggle);
		 return this;
	}
	
	/**
	 * Check if checkout head revision is checked.
	 *
	 * @return true if checkout head revision is checked, false otherwise
	 */
	public boolean isCheckoutHeadRevision(){
		return new CheckBox(this, "Check out Head Revision").isChecked();
	}

	/**
	 * Set revision.
	 *
	 * @param revision to set
	 */
	public MavenCheckoutLocationPage setRevision(String revision){
		new LabeledText(this, "Revision:").setText(revision);
		return this;
	}
	
	/**
	 * Toggle checkout all projects.
	 *
	 * @param toggle the toggle
	 */
	public MavenCheckoutLocationPage toggleCheckoutAllProjects(boolean toggle){
		new CheckBox(this, "Check out All Projects").toggle(toggle);
		return this;
	}
	
	/**
	 * Check if checkout all projects is checked.
	 *
	 * @return true if checkout all projects is checked, false otherwise
	 */
	public boolean isCheckoutAllProjects(){
		return new CheckBox(this, "Check out All Projects").isChecked();
	}
}
