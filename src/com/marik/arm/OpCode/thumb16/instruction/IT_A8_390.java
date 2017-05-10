/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;

import com.marik.arm.OpCode.CondFactory;
import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

public class IT_A8_390 extends ParseSupport {

	public static final IT_A8_390 INSTANCE = new IT_A8_390();

	public String parse(int data) {

		int firstcond = getShiftInt(data, 4, 4);
		int mask = getShiftInt(data, 0, 4);
		String xyz = parseXYZ(firstcond, mask);

		StringBuilder sb = new StringBuilder();
		sb.append("IT");
		sb.append(xyz);
		sb.append(" ");
		sb.append(CondFactory.parse(firstcond));
		return sb.toString();
	}

	private String parseXYZ(int firstcond, int mask) {

		int firstcond_0 = firstcond & 1;
		int mask_3 = 1 & (mask >> 3);
		int mask_2 = 1 & (mask >> 2);
		int mask_1 = 1 & (mask >> 1);

		StringBuilder sb = new StringBuilder();

		if (mask_3 == firstcond_0)
			sb.append("T");
		else
			sb.append("E");

		if (mask_2 == firstcond_0)
			sb.append("T");
		else
			sb.append("E");

		if (mask_1 == firstcond_0)
			sb.append("T");
		else
			sb.append("E");

		int sub = 0;
		for (; mask > 0; mask >>= 1, sub++)
			if ((mask & 1) == 1)
				break;

		return sb.substring(0, sb.length() - sub);
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}