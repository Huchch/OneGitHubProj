import java.util.Scanner;

//项目：吃货联盟 开发一个网上订餐系统
public class Chihuo {
	public static void main(String[] args) {
		//数据主题：一组订单信息
		String[] names = new String[4];//订餐人
		String[] dishMegs = new String[4]; //所定餐品信息
		int [] times = new int[4]; //送餐时间
		String[] addresses = new String[4];//送餐地址
		int[] states = new int [4]; //订单状态 0：已预订 1：已完成
		double[] sumPrices = new double [4];//总金额
		
		//初始化2条订单信息
		names[0] = "张三";
		dishMegs[0] = "鱼香肉丝 1份";
		times[0] = 12;
		addresses[0] = "北京路12号";
		states[0] = 0;
		sumPrices[0] = 24.0;
		
		names[1] = "李四";
		dishMegs[1] = "红烧带鱼 2份";
		times[1] = 12;
		addresses[1] = "上海路20号";
		states[1] = 0;
		sumPrices[1] = 76.0;
		
		//数据主体：一组餐品信息
		String[] dishName = {"红烧带鱼","鱼香肉丝","时令蔬菜"}; //餐品名称
		double[] prices = {38.0,18.0,10.0}; //餐品单价
		int [] praiseNums = new int [3]; //点赞数
		
		Scanner input = new Scanner(System.in);
//		使用do while 循环主菜单
		int num =1; //记录用户输入的数字
		do {
			//显示主菜单
			System.out.println("*************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.删除订单");
			System.out.println("4.签收订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("*************************");
			//提示用户输入功能编号，并执行相应功能
			System.out.print("请选择：");
			int choose = input.nextInt();
			boolean isAdd = false; //true:记录找到一个为空的位置，可以插入
			switch(choose) {
			case 1:
				//我要订餐
				System.out.println("******我要订餐******");
				//1、查找要插入的位置
				for(int i=0;i<names.length;i++) {
					//如果找到为空的位置，记录下来
					if(names[i] == null) {
						isAdd = true; //记录已找到一个为空的位置
						//执行插入操作
						//a.显示所有可供选择的餐品信息
						System.out.println("序号\t餐品名\t单价\t点赞数");
						for(int j=0;j<dishName.length;j++) {
							String price = prices[j]+"元";
							String praise = praiseNums[i]+"赞";
							System.out.println((j+1)+"\t"+dishName[j]+"\t"+price+"\t"+praise);
						}
						//输入所选餐品的编号以及份数
						System.out.println("请选择所定餐品序号：");
						int chooseDish = input.nextInt();
						System.out.println("请选择所定份数：");
						int number = input.nextInt();
						
						String dishMeg = dishName[chooseDish - 1]+" "+number +"份";
						
						//b.输入订餐人姓名
						System.out.println("请输入订餐人姓名：");
						String name = input.next();
						
						//c.输入送餐时间
						System.out.println("请输入送餐时间（10~20整点送餐");
						int time = input.nextInt();
						//如果输错了，重复输入
						while(time<10 || time>20) {
							System.out.println("对不起，您输入有误，请输入10~20的整数:");
							time = input.nextInt();
						}
						
						//d.输入送餐地址
						System.out.println("请输入送餐地址：");
						String address = input.next();
						
						//e.计算餐费
						double sumPrice = prices[chooseDish-1] * number;
						
						//送餐费 当餐费达到50元时 免6元送餐费
						double deliCharge = sumPrice>=50?0.0:6.0;
						
						//显示订单信息
						System.out.println("订餐成功！");
						System.out.println("您订的是："+dishMeg);
						System.out.println("订餐人："+name);
						System.out.println("送餐时间："+time+"点");
						System.out.println("送餐地址："+address);
						System.out.println("餐费："+sumPrice+",送餐费："+ deliCharge+"元");
						System.out.println("总金额："+(sumPrice+deliCharge)+"元");
						
						//保存数据
						names[i] = name;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice+deliCharge;
						
						break;
					}
				}
				
				//如果没有找到为空的位置，则提示信息
				if(!isAdd) {
					System.out.println("对不起，您的餐袋已满");
				}
				break;
			case 2:
				//查看餐袋
				break;
			case 3:
				//删除订单
				break;
			case 4:
				//签收订餐
				break;
			case 5:
				//我要点赞
				break;
			case 6:
				//退出系统
			default:
				break;
			}
			//当用户输入的功能编号1~5之外的数字，则退出循环，否则将会提示0返回
			if(choose<1 || choose>5) {
				break;
			}else {
			//提示输入0 返回
			System.out.print("输入0返回：");
			num = input.nextInt();
			}
		}while(num == 0);
		System.out.println("谢谢使用，欢迎下次光临。");
		


	}
}
