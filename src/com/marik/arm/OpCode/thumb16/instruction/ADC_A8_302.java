/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;
import static com.marik.arm.OpCode.OpUtil.parseRegister;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

public class ADC_A8_302 extends ParseSupport {

	public static final ADC_A8_302 INSTANCE = new ADC_A8_302();

	@Override
	protected String getOpCode() {
		return "ADCS";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		return parseRegister(getShiftInt(data, 3, 3));
	}

	@Override
	public void performExecuteCommand(int data) {

	}

}