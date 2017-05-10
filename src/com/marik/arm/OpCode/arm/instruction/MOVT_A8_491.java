/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.arm.instruction;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;

import com.marik.arm.OpCode.arm.instruction.factory.ParseSupport;

public class MOVT_A8_491 extends ParseSupport {

	public static final MOVT_A8_491 INSTANCE = new MOVT_A8_491();

	@Override
	protected String getOpCode(int data) {
		return "MOVT";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 12, 4);
	}

	@Override
	protected int getRn(int data) {
		return -1;
	}

	@Override
	protected int getRm(int data) {
		return -1;
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
		return (getShiftInt(data, 16, 4) << 12) | (getShiftInt(data, 0, 12));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}