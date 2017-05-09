/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.arm.instruction;

import com.marik.arm.OpCode.arm.instruction.factory.ParseSupport;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;

public class MVN_A8_504 extends ParseSupport {

	public static final MVN_A8_504 INSTANCE = new MVN_A8_504();

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
		return -1;
	}
	@Override
	protected int getRm(int data) {
		return -1;
	}
	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}
	@Override
	protected int getType(int data) {
		return -1;
	}
	@Override
	protected int getShift(int data) {
		return armExpandImm(getShiftInt(data, 0, 12));
	}
	@Override
	public void performExecuteCommand(int data) {
	}

}