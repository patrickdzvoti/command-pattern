package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.Light;
import com.pattern.command.commandpattern.model.RemoteControlModel;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 01:56
 */
class LightOffCommandImplTest {

	private final Command command = LightOffCommandImpl.builder()
		.light(new Light())
		.build();

	private final RemoteControlModel remoteControlModel =
		RemoteControlModel.builder().command(command).build();

	@Test
	void testLightOff() {
		assertThat(remoteControlModel.buttonWasPressed()).isEqualTo("Set light off");
	}

}
