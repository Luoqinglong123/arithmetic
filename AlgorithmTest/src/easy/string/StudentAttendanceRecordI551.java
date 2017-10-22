package easy.string;

public class StudentAttendanceRecordI551 {
	public boolean checkRecord(String s) {
		char[] array = s.toCharArray();
		int alength = 0;
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == 'L' && array[i + 1] == 'L' && array[i + 2] == 'L')
				return false;
		}
		for (char c : array) {
			if (c == 'A')
				alength++;
		}
		return alength > 1 ? false : true;

	}
	public boolean checkRecord2(String s) {
		return !s.matches(".*LLL.*|.*A.*A.*");
		
	}
}
