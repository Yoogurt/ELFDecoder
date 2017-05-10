/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.arm.instruction;

import static com.marik.arm.OpCode.OpUtil.SP;
import static com.marik.arm.OpCode.OpUtil.getShiftInt;

import com.marik.arm.OpCode.arm.instruction.factory.ParseSupport;

public class LDMIB_A8_404 extends ParseSupport {

	public static final LDMIB_A8_404 INSTANCE = new LDMIB_A8_404();

	@Override
	protected String getOpCode(int data) {
		int Rn = getShiftInt(data, 16, 4);
		if (Rn == SP) // SP
			return "LDMED";
		return "LDMIB";
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 0, 16);
	}

	@Override
	protected boolean shifterRegisterList() {
		return true;
	}

	@Override
	protected boolean isRnwback(int data) {
		return getShiftInt(data, 21, 1) == 0b1;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}