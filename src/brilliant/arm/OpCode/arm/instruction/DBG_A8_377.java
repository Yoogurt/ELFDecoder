/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;
import static brilliant.arm.OpCode.factory.OpUtil.*;

public class DBG_A8_377 extends ParseSupport {

	public static final DBG_A8_377 INSTANCE = new DBG_A8_377();

	@Override
	protected String getOpCode(int data) {
		return "DBG";
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}