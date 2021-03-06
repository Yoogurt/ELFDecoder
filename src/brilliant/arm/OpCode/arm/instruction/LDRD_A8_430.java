/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;

import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;
import brilliant.arm.OpCode.factory.CondFactory;

public class LDRD_A8_430 extends ParseSupport {

	public static final LDRD_A8_430 INSTANCE = new LDRD_A8_430();

	@Override
	public String parse(int data) {

		StringBuilder sb = new StringBuilder("LDRD");
		sb.append(CondFactory.parse(getCond(data))).append(" ");

		int Rt = getShiftInt(data, 12, 4);
		int Rn = getShiftInt(data, 16, 4);
		int Rm = getShiftInt(data, 0, 4);
		int Rt2 = Rt + 1;

		boolean index = getShiftInt(data, 24, 1) == 1;
		boolean add = getShiftInt(data, 23, 1) == 1;
		boolean wback = (!index || getShiftInt(data, 21, 1) == 1);

		if (getShiftInt(data, 24, 1) == 0 && getShiftInt(data, 21, 1) == 1)
			error(data);

		sb.append(parseRegister(Rt)).append(" , ");
		sb.append(parseRegister(Rt2));

		sb.append(" , [");

		sb.append(parseRegister(Rn));

		if (!index)
			sb.append("]");

		sb.append(" , ");

		if (!add)
			sb.append("-");

		sb.append(parseRegister(Rm));

		if (index)
			sb.append("]");

		if (wback)
			sb.append("!");

		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}