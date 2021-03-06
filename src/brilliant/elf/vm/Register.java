package brilliant.elf.vm;

public class Register {

	public static volatile int R1 = -1;
	public static volatile int R2 = -1;
	public static volatile int R3 = -1;
	public static volatile int R4 = -1;
	public static volatile int R5 = -1;
	public static volatile int R6 = -1;
	public static volatile int R7 = -1;
	public static volatile int R8 = -1;
	public static volatile int R9 = -1;
	public static volatile int R10 = -1;
	public static volatile int R11 = -1;
	public static volatile int R12 = -1;
	public static volatile int SP = -1;
	public static volatile int LR = -1;
	public static volatile int PC = -1;

	public static volatile int APSR = -1;
	public static volatile int CPSR = -1;
	public static volatile int SPCR = -1;

	public static final int CPU_MODE_USER = 0b10000;
	public static final int CPU_MODE_FIQ = 0b10001;
	public static final int CPU_MODE_IRQ = 0b10010;
	public static final int CPU_MODE_MANAGE = 0b10011;
	public static final int CPU_MODE_INTERRUPT = 0b10111;
	public static final int CPU_MODE_UNDEFINE = 0b11011;
	public static final int CPU_MODE_SYSTEM = 0b11111;

	static {
		setM(CPU_MODE_USER);
	}

	/**
	 * Negative condition flag
	 */
	public static int getN() {
		return 1 & ((CPSR & 0x80000000) >> 31);
	}

	/**
	 * Zero condition flag
	 */
	public static int getZ() {
		return 1 & (CPSR & 0x40000000) >> 30;
	}

	/**
	 * Carry condition flag
	 */
	public static int getC() {
		return 1 & (CPSR & 0x20000000) >> 29;
	}

	/**
	 * Overflow condition flag
	 */
	public static int getV() {
		return 1 & (CPSR & 0x10000000) >> 28;
	}

	/**
	 * Zero condition flag
	 */
	public static int getQ() {
		return 1 & (CPSR & 0x08000000) >> 27;
	}

	public static int getJ() {
		return 1 & (CPSR & 0x01000000) >> 24;
	}

	public static int getGE() {
		return 0xf & ((CPSR & 0x000f0000) >> 16);
	}

	public static int getIT() {
		return 0x3f & ((CPSR & 0x0000fc00) >> 10);
	}

	public static int getE() {
		return 1 & ((CPSR & 0x00000200) >> 9);
	}

	public static int getA() {
		return 1 & ((CPSR & 0x00000100) >> 8);
	}

	public static int getI() {
		return 1 & ((CPSR & 0x00000080) >> 7);
	}

	public static int getF() {
		return 1 & ((CPSR & 0x00000040) >> 6);
	}

	public static int getT() {
		return 1 & ((CPSR & 0x00000020) >> 5);
	}

	public static int getM() {
		return CPSR & 0x000001f;
	}

	public static void setN(int data) {
		modifyCPSR(data, 31);
	}

	public static void setZ(int data) {
		modifyCPSR(data, 30);
	}

	public static void setC(int data) {
		modifyCPSR(data, 29);
	}

	public static void setV(int data) {
		modifyCPSR(data, 28);
	}

	public static void setQ(int data) {
		modifyCPSR(data, 27);
	}

	public static void setJ(int data) {
		modifyCPSR(data, 24);
	}

	public static void setGE(int data) {
		modifyCPSRWid(data, 16, 4);
	}

	public static void setIT(int data) {
		modifyCPSRWid(data, 10, 6);
	}

	public static void setE(int data) {
		modifyCPSR(data, 9);
	}

	public static void setA(int data) {
		modifyCPSR(data, 8);
	}

	public static void setI(int data) {
		modifyCPSR(data, 7);
	}

	public static void setF(int data) {
		modifyCPSR(data, 6);
	}

	public static void setT(int data) {
		modifyCPSR(data, 5);
	}

	public static void setM(int data) {
		modifyCPSRWid(data, 0, 5);
	}

	private static void modifyCPSR(int data, int position) {
		data &= 1;// cut number down
		int helper = -1 ^ (1 << position);

		if (data == 0)
			CPSR &= helper;
		else
			CPSR |= ~helper;
	}

	private static void modifyCPSRWid(int data, int fromIndex, int length) {
		data &= (1 << length) - 1;// cut number down

		int helper = ~(((1 << length) - 1) << fromIndex);

		CPSR &= helper;
		CPSR |= data << fromIndex;
	}

	public static class RegisterIllegalStateExeception extends IllegalStateException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public RegisterIllegalStateExeception(String msg) {
			super(msg);
		}

	}
}
