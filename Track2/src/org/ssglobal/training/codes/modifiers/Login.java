package org.ssglobal.training.codes.modifiers;

import java.io.Serializable;

public class Login implements Serializable{

	public transient String username; // literal values will not be saved
	public transient String password;
}
