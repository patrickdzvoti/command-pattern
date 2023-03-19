package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.Light;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 01:30
 */

@RequiredArgsConstructor
@Builder
public class LightOffCommandImpl implements Command {
	private final Light light;
	@Override
	public String execute() {
		return light.off();
	}
}
