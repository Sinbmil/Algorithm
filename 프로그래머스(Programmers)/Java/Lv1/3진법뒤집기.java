/* ���α׷��ӽ� Lv1 - 3���� ������
 * ������ũ: https://programmers.co.kr/learn/courses/30/lessons/68935
 * 
 * ��Ȯ�� �׽�Ʈ ���̽� 10�� �� 10�� ����
 * ���� 100.0
 */

class Solution {
    public int solution(int n) {
      	int answer = 0;
		String ans = "";
		
		while(n!=0) { 
		    // n�� 0�϶� ���� �ݺ�
			ans += n%3; 
			// n�� 3���� �������� �� �������� ans�� �����ֱ�
			n = n/3;
			// n�� �ٽ� 3���� �����ֱ�
		}
		
		return Integer.parseInt(ans,3);
		// Integer.parseInt�� ���ؼ� ans 3������ 10�������� ����
    }
}