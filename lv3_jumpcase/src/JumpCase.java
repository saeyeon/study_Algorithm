class JumpCase {

    public int jumpCase(int num) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.jumpCase(testCase));
    }
}
//
//ȿ���̴� �ָ� �ٱ⸦ �����ϰ� �ֽ��ϴ�. ȿ���̴� �ѹ��� 1ĭ, �Ǵ� 2ĭ�� �� �� �ֽ��ϴ�. ĭ�� �� 4�� ���� ��, ȿ���̴�
//(1ĭ, 1ĭ, 1ĭ, 1ĭ)
//(1ĭ, 2ĭ, 1ĭ)
//(1ĭ, 1ĭ, 2ĭ)
//(2ĭ, 1ĭ, 1ĭ)
//(2ĭ, 2ĭ)
//�� 5���� ������� �� �� ĭ�� ������ �� �ֽ��ϴ�. �ָ��ٱ⿡ ���� ĭ�� �� n�� �־��� ��, ȿ���̰� ���� �����ϴ� ����� �� �������� ����ϴ� jumpCase �Լ��� �ϼ��ϼ���. ���� ��� 4�� �Էµȴٸ�, 5�� ��ȯ�� �ָ� �˴ϴ�.