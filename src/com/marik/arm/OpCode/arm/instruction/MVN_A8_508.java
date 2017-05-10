/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.arm.instruction;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;

import com.marik.arm.OpCode.arm.instruction.factory.ParseSupport;

public class MVN_A8_508 extends ParseSupport {

	public static final MVN_A8_508 INSTANCE = new MVN_A8_508();

	@Override
	protected String getOpCode(int data) {
		return "MVN";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 12, 4);
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}

	@Override
	protected int getType(int data) {
		return getShiftInt(data, 5, 2);
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 8, 4);
	}

	@Override
	protected boolean shifterRegister() {
		return true;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}