/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;

@Deprecated
public class ERET_B9_1982 extends ParseSupport {

	public static final ERET_B9_1982 INSTANCE = new ERET_B9_1982();

	@Override
	protected String getOpCode(int data) {
		return "ERET.W";
	}
	@Override
	public void performExecuteCommand(int data) {
	}

}