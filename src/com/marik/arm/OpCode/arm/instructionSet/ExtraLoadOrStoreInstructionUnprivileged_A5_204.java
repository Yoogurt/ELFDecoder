package com.marik.arm.OpCode.arm.instructionSet;

import com.marik.arm.OpCode.ParseTemplate;
import com.marik.arm.OpCode.arm.instruction.LDRHT_A8_448;
import com.marik.arm.OpCode.arm.instruction.LDRSBT_A8_456;
import com.marik.arm.OpCode.arm.instruction.LDRSHT_A8_464;
import com.marik.arm.OpCode.arm.instruction.STRHT_A8_704;

import static com.marik.arm.OpCode.OpUtil.*;

public class ExtraLoadOrStoreInstructionUnprivileged_A5_204 {
	public static ParseTemplate parse(int data) {

		int op2 = getShiftInt(data, 5, 2);
		int op = getShiftInt(data, 20, 1);

		switch (op2) {
		case 0b01:
			if (op == 0b0)
				return STRHT_A8_704.INSTANCE;
			if (op == 0b1)
				return LDRHT_A8_448.INSTANCE;
			break;

		case 0b10:
			if (op == 0b1)
				return LDRSBT_A8_456.INSTANCE;
			break;
			
		case 0b11:
			if(op == 0b1)
				return LDRSHT_A8_464.INSTANCE;
		}

		throw new IllegalArgumentException("Unable to decode instruction "
				+ Integer.toBinaryString(data));
	}
}
