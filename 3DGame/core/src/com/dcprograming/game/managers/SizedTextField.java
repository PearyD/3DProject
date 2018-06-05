/**
 * @author Colton Giesbrecht
 * @dateCreated May 25, 2018
 * @dateCompleted NOT COMPLETED
 * @version 1.00
 */
package com.dcprograming.game.managers;

import com.badlogic.gdx.scenes.scene2d.ui.TextField;

public class SizedTextField extends TextField {

	private float prefWidth, prefHeight;

	/**
	 * @param text
	 * @param style
	 */
	public SizedTextField(String text, TextFieldStyle style, float prefWidth, float prefHeight) {
		super(text, style);
		this.prefWidth = prefWidth;
		this.prefHeight = prefHeight;
	}

	public float getPrefWidth() {
		return prefWidth;
	}

	public float getPrefHeight() {
		return prefHeight;
	}
}
