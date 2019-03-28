package com.test.mvc.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	public void setAsText(String name) {
		if(name.contains("Mr."))
			setValue(name);
		else
			setValue("Mr. " + name);
	}
}
