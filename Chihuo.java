import java.util.Scanner;

//��Ŀ���Ի����� ����һ�����϶���ϵͳ
public class Chihuo {
	public static void main(String[] args) {
		//�������⣺һ�鶩����Ϣ
		String[] names = new String[4];//������
		String[] dishMegs = new String[4]; //������Ʒ��Ϣ
		int [] times = new int[4]; //�Ͳ�ʱ��
		String[] addresses = new String[4];//�Ͳ͵�ַ
		int[] states = new int [4]; //����״̬ 0����Ԥ�� 1�������
		double[] sumPrices = new double [4];//�ܽ��
		
		//��ʼ��2��������Ϣ
		names[0] = "����";
		dishMegs[0] = "������˿ 1��";
		times[0] = 12;
		addresses[0] = "����·12��";
		states[0] = 0;
		sumPrices[0] = 24.0;
		
		names[1] = "����";
		dishMegs[1] = "���մ��� 2��";
		times[1] = 12;
		addresses[1] = "�Ϻ�·20��";
		states[1] = 0;
		sumPrices[1] = 76.0;
		
		//�������壺һ���Ʒ��Ϣ
		String[] dishName = {"���մ���","������˿","ʱ���߲�"}; //��Ʒ����
		double[] prices = {38.0,18.0,10.0}; //��Ʒ����
		int [] praiseNums = new int [3]; //������
		
		Scanner input = new Scanner(System.in);
//		ʹ��do while ѭ�����˵�
		int num =1; //��¼�û����������
		do {
			//��ʾ���˵�
			System.out.println("*************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ɾ������");
			System.out.println("4.ǩ�ն���");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("*************************");
			//��ʾ�û����빦�ܱ�ţ���ִ����Ӧ����
			System.out.print("��ѡ��");
			int choose = input.nextInt();
			boolean isAdd = false; //true:��¼�ҵ�һ��Ϊ�յ�λ�ã����Բ���
			switch(choose) {
			case 1:
				//��Ҫ����
				System.out.println("******��Ҫ����******");
				//1������Ҫ�����λ��
				for(int i=0;i<names.length;i++) {
					//����ҵ�Ϊ�յ�λ�ã���¼����
					if(names[i] == null) {
						isAdd = true; //��¼���ҵ�һ��Ϊ�յ�λ��
						//ִ�в������
						//a.��ʾ���пɹ�ѡ��Ĳ�Ʒ��Ϣ
						System.out.println("���\t��Ʒ��\t����\t������");
						for(int j=0;j<dishName.length;j++) {
							String price = prices[j]+"Ԫ";
							String praise = praiseNums[i]+"��";
							System.out.println((j+1)+"\t"+dishName[j]+"\t"+price+"\t"+praise);
						}
						//������ѡ��Ʒ�ı���Լ�����
						System.out.println("��ѡ��������Ʒ��ţ�");
						int chooseDish = input.nextInt();
						System.out.println("��ѡ������������");
						int number = input.nextInt();
						
						String dishMeg = dishName[chooseDish - 1]+" "+number +"��";
						
						//b.���붩��������
						System.out.println("�����붩����������");
						String name = input.next();
						
						//c.�����Ͳ�ʱ��
						System.out.println("�������Ͳ�ʱ�䣨10~20�����Ͳ�");
						int time = input.nextInt();
						//�������ˣ��ظ�����
						while(time<10 || time>20) {
							System.out.println("�Բ�������������������10~20������:");
							time = input.nextInt();
						}
						
						//d.�����Ͳ͵�ַ
						System.out.println("�������Ͳ͵�ַ��");
						String address = input.next();
						
						//e.����ͷ�
						double sumPrice = prices[chooseDish-1] * number;
						
						//�Ͳͷ� ���ͷѴﵽ50Ԫʱ ��6Ԫ�Ͳͷ�
						double deliCharge = sumPrice>=50?0.0:6.0;
						
						//��ʾ������Ϣ
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�"+dishMeg);
						System.out.println("�����ˣ�"+name);
						System.out.println("�Ͳ�ʱ�䣺"+time+"��");
						System.out.println("�Ͳ͵�ַ��"+address);
						System.out.println("�ͷѣ�"+sumPrice+",�Ͳͷѣ�"+ deliCharge+"Ԫ");
						System.out.println("�ܽ�"+(sumPrice+deliCharge)+"Ԫ");
						
						//��������
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice+deliCharge;
						
						break;
					}
				}
				
				//���û���ҵ�Ϊ�յ�λ�ã�����ʾ��Ϣ
				if(!isAdd) {
					System.out.println("�Բ������Ĳʹ�����");
				}
				break;
			case 2:
				//�鿴�ʹ�
				break;
			case 3:
				//ɾ������
				break;
			case 4:
				//ǩ�ն���
				break;
			case 5:
				//��Ҫ����
				break;
			case 6:
				//�˳�ϵͳ
			default:
				break;
			}
			//���û�����Ĺ��ܱ��1~5֮������֣����˳�ѭ�������򽫻���ʾ0����
			if(choose<1 || choose>5) {
				break;
			}else {
			//��ʾ����0 ����
			System.out.print("����0���أ�");
			num = input.nextInt();
			}
		}while(num == 0);
		System.out.println("ллʹ�ã���ӭ�´ι��١�");
		


	}
}
