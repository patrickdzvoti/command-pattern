package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.Light;
import lombok.Builder;

/**
 * @author Patrick Dzvoti
 * Initial 12/03/2023 - 23:47
 */
@Builder
public class LightOnCommandImpl implements Command {
	private final Light light;

	public LightOnCommandImpl(Light light) {
		this.light = light;
	}

	@Override
	public String execute() {
		return light.on();
	}
}
