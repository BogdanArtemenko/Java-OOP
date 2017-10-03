package com;

public class GroupIsFullException extends Exception {

	@Override
	public String getMessage() {
		return "GroupIsFullException: No more places in group";
	}
}
