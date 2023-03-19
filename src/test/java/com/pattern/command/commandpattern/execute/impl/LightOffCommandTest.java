package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.Light;
import com.pattern.command.commandpattern.model.RemoteControlModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 01:56
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LightOffCommandTest {

	public static final Command[] SLOTS = new Command[7];
	private final Light LIGHT = Light.builder().build();

	private final RemoteControlModel remoteControlModel =
		RemoteControlModel.builder()
			.onCommands(SLOTS)
			.offCommands(SLOTS)
			.build();

	@BeforeAll
	void setUp() {
		remoteControlModel.setCommand(0,
			LIGHT::on,
			LIGHT::off);
	}
	@Test
	void testLightOff() {
		assertThat(remoteControlModel.offButtonPressed(0)).isEqualTo("Set light off");
	}
}
