package com.marik.arm.OpCode.arm.instructionSet;

import com.marik.arm.OpCode.ParseTemplate;
import com.marik.arm.OpCode.arm.instruction.LDREXB_A8_434;
import com.marik.arm.OpCode.arm.instruction.LDREXD_A8_436;
import com.marik.arm.OpCode.arm.instruction.LDREXH_A8_438;
import com.marik.arm.OpCode.arm.instruction.LDREX_A8_432;
import com.marik.arm.OpCode.arm.instruction.STREXB_A8_692;
import com.marik.arm.OpCode.arm.instruction.STREXD_A8_694;
import com.marik.arm.OpCode.arm.instruction.STREXH_A8_696;
import com.marik.arm.OpCode.arm.instruction.STREX_A8_690;
import com.marik.arm.OpCode.arm.instruction.SWP_A8_722;

import static com.marik.arm.OpCode.OpUtil.*;

public class SynachronizationPrimitives_A5_205 {
	public static ParseTemplate parse(int data) {

		int op = getShiftInt(data, 20, 4);

		if (assert0(op, 0, 1, 3))
			return SWP_A8_722.INSTANCE;

		switch (op) {
		case 0b1000:
			return STREX_A8_690.INSTANCE;

		case 0b1001:
			return LDREX_A8_432.INSTANCE;

		case 0b1010:
			return STREXD_A8_694.INSTANCE;

		case 0b1011:
			return LDREXD_A8_436.INSTANCE;

		case 0b1100:
			return STREXB_A8_692.INSTANCE;

		case 0b1101:
			return LDREXB_A8_434.INSTANCE;
			
		case 0b1110:
			return STREXH_A8_696.INSTANCE;
			
		case 0b1111:
			return LDREXH_A8_438.INSTANCE;
		}

		throw new IllegalArgumentException("Unable to decode instruction "
				+ Integer.toBinaryString(data));
	}
}
