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

public class ORR_A8_516 extends ParseSupport {

	public static final ORR_A8_516 INSTANCE = new ORR_A8_516();

	@Override
	protected String getOpCode(int data) {
		return "ORR";
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