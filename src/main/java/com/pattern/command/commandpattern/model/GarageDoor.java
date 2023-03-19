package com.pattern.command.commandpattern.model;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 00:26
 */
@Builder(toBuilder = true)
@Slf4j
public class GarageDoor {
	public String open() {
		return "Open garage door";
	}

	public String close() {
		return "Close garage door";
	}
}
