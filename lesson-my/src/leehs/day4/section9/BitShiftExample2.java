package day4.section9;

public class BitShiftExample2 {
	public static void main(String[] args) {
		int value = 772; //[00000000] [00000000] [00000011] [00000100]

		//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]


		//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]


		//우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [00000011]


		//끝 1바이트만 읽음: [00000100]

	}
}