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
 * Initial 14/03/2023 - 00:48
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LightOnCommandTest {

	private static RemoteControlModel remoteControlModel;

	private final Light LIGHT = Light.builder().build();

	@BeforeAll
	void setUp() {
		remoteControlModel = RemoteControlModel.builder()
			.onCommands(new Command[7])
			.offCommands(new Command[7])
			.build();
		remoteControlModel.setCommand(0, LIGHT::on, LIGHT::off);
	}
	@Test
	void testButtonPressed() {
		assertThat(remoteControlModel.onButtonWasPressed(0)).isEqualTo("Set light on");
	}
}
