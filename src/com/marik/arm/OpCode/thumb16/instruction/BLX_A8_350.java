/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;
import static com.marik.arm.OpCode.OpUtil.parseRegister;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

public class BLX_A8_350 extends ParseSupport {

	public static final BLX_A8_350 INSTANCE = new BLX_A8_350();

	@Override
	protected String getOpCode() {
		return "BLX";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 3, 4));
	}

	@Override
	protected String getRm(int data) {
		return null;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}