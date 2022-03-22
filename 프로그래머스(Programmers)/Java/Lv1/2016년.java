/*
 * ���α׷��ӽ� Lv1 - 2016��
 * ������ũ: https://programmers.co.kr/learn/courses/30/lessons/12901

 * ��Ȯ�� �׽�Ʈ ���̽� 14�� �� 14�� ����
 * ���� 100.0
*/

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        // week: �� ���ϵ��� �ʱ�ȭ�� �迭 
        // 2016�� 1�� 1���� �ݿ����̶� 2��° �ε����� ���������� ��ġ
       
        int[] endDay = {31,29,31,30,31,30,31,31,30,31,30,31};
        // endDay: 1~12���� ������ ���� �ʱ�ȭ 
        // 2016���� �����̱⿡ 2���� 29�Ϸ� �ʱ�ȭ
        
        int res = 0;
        for(int i = 0; i<a-1; i++) // 0���� a-1������ 
            res+=endDay[i]; // res�� �� ������ �ϼ��� ���ϱ�
        
        res+=b; // res�� b���� ���ϱ�
        
        answer = week[(res%7)]; 
        // res�� 7�� �������� ���� ������ ���� week �ε��� ���� answer�� ����
        
        return answer;
    }
}
