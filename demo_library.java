package com.jk.temp.main;
import java.util.Scanner;
public class demo_library {
	public static void main(String[] args) {
		String book[][]={
				{"序号","书名"},
				{"1","书名"},
				{"2","高等数学"},
				{"3","大学英语"},
				{"4","C语言"},
				{"5","数据结构"}
		};//定义字符串数组保存图书信息；
		while (true) {
			System.out.println("请输入书名或者图书序号查找图书，0-书名，1-图书序号");
			Scanner scanner=new Scanner(System.in);
			int a=2;
			try {
				
				a = scanner.nextInt();
				
			} catch (Exception e1) {
				System.out.println("错误命令异常，请重新输入！");
			}finally {
				
			}
			if (a==0) {
				System.out.println("请输入书名查找图书：");
				String book1;
				try {
					
					book1 = scanner.next();
					
				} catch (Exception e) {
					System.out.println("错误命令异常，请重新输入！");
					continue;
				}finally {
					
				}
				for (int i = 1; i < book.length; i++) {
					if (book1.equals(book[i][1])) {
						System.out.println("找到图书："+book[i][0]+":"+book[i][1]);
						
						break;
					}if (i==book.length-1){
						System.out.println("图书信息中没有此图书，请重新输入查找！");
					}
				}//判断输入的书名是否存在于图书信息中，如果存在就输出：找到图书，并跳出循环。
			}else if (a==1) {
				System.out.println("请输入图书序号查找图书：");
				int book2;
				try {
					
					book2=scanner.nextInt();
					
				} catch (Exception e) {
					System.out.println("错误命令异常，请重新输入！");
					continue;
				}finally {
					
				}
				for (int i = 1; i < book.length; i++) {
					if (book2==Integer.valueOf(book[i][0])) {
						System.out.println("找到图书："+book[i][0]+":"+book[i][1]);
						break;
					}
					if (i==book.length-1){
						System.out.println("图书信息中没有此图书，请重新输入查找！");
					}
				}//判断输入的图书序号是否存在于图书信息中，如果存在就输出：找到图书，并跳出循环。
			
			}else {
				System.out.println("错误命令异常，请重新输入！");
				continue;
			}
		}
		
	}

}
