/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.arm.instruction;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;
import static com.marik.arm.OpCode.OpUtil.parseRegister;

import com.marik.arm.OpCode.CondFactory;
import com.marik.arm.OpCode.arm.instruction.factory.ParseSupport;
import com.marik.arm.OpCode.arm.instructionSet.factory.TypeFactory;

public class LDRT_A8_466 extends ParseSupport {

	public static final LDRT_A8_466 INSTANCE = new LDRT_A8_466();

	@Override
	public String parse(int data) {
		int A = getShiftInt(data, 25, 1);
		if (A == 0b0)
			return EncodingA1(data);
		return EncodingA2(data);
	}

	private String EncodingA2(int data) {

		StringBuilder sb = new StringBuilder("LDRT");
		sb.append(CondFactory.parse(getCond(data)));
		sb.append(" ");

		int Rt = getShiftInt(data, 12, 4);
		int Rn = getShiftInt(data, 16, 4);
		int imm5 = getShiftInt(data, 7, 5);
		int type = getShiftInt(data, 5, 2);
		int Rm = getShiftInt(data, 0, 4);
		boolean add = getShiftInt(data, 23, 1) == 1;

		sb.append(parseRegister(Rt));
		sb.append(" , [");
		sb.append(parseRegister(Rn));
		sb.append("] , ");

		if (!add)
			sb.append("-");
		sb.append(parseRegister(Rm));
		sb.append(" , ");
		sb.append(TypeFactory.parse(type));
		sb.append(" #");
		sb.append(imm5);

		return sb.toString();
	}

	private String EncodingA1(int data) {
		boolean add = getShiftInt(data, 23, 1) == 1;
		int Rn = getShiftInt(data, 16, 4);
		int Rt = getShiftInt(data, 12, 4);
		int imm12 = getShiftInt(data, 0, 12);

		StringBuilder sb = new StringBuilder("LDRT");
		sb.append(CondFactory.parse(getCond(data)));

		sb.append(" ");
		sb.append(parseRegister(Rt));
		sb.append(" , [");
		sb.append(parseRegister(Rn));
		sb.append("] , #");

		if (!add)
			sb.append("-");

		sb.append(imm12);
		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}