/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.arm.instruction;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;

import com.marik.arm.OpCode.arm.instruction.factory.ParseSupport;

public class BX_A8_352 extends ParseSupport {

	public static final BX_A8_352 INSTANCE = new BX_A8_352();

	@Override
	protected String getOpCode(int data) {
		return "BX";
	}

	@Override
	protected int getRd(int data) {
		return -1;
	}

	@Override
	protected int getRn(int data) {
		return -1;
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getS(int data) {
		return -1;
	}

	@Override
	protected int getType(int data) {
		return -1;
	}

	@Override
	protected int getShift(int data) {
		return 0;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}