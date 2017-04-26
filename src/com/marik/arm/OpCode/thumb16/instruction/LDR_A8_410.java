/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;
import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

/**
 * load from memory , <Rn> = [PC + zeroExtend(imm8)]
 * */
public class LDR_A8_410 extends ParseSupport {

	public static final LDR_A8_410 INSTANCE = new LDR_A8_410();

	@Override
	protected String getOpCode() {
		return "LDR";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 8, 3));
	}

	@Override
	protected String getRm(int data) {
		return "label_#" + (getShiftInt(data, 0, 8)<<2);
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}
