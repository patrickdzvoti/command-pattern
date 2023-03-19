package com.pattern.command.commandpattern.model;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Patrick Dzvoti
 * Initial 12/03/2023 - 23:47
 */
@Slf4j
@Builder(toBuilder = true)
@NoArgsConstructor
public class Light {
	public String on() {
		return "Set light on";
	}

	public String off() {
		return "Set light off";
	}
}
