package com.jk.temp.main;
import java.util.Scanner;
public class demo_library {
	public static void main(String[] args) {
		String book[][]={
				{"���","����"},
				{"1","����"},
				{"2","�ߵ���ѧ"},
				{"3","��ѧӢ��"},
				{"4","C����"},
				{"5","���ݽṹ"}
		};//�����ַ������鱣��ͼ����Ϣ��
		while (true) {
			System.out.println("��������������ͼ����Ų���ͼ�飬0-������1-ͼ�����");
			Scanner scanner=new Scanner(System.in);
			int a=2;
			try {
				
				a = scanner.nextInt();
				
			} catch (Exception e1) {
				System.out.println("���������쳣�����������룡");
			}finally {
				
			}
			if (a==0) {
				System.out.println("��������������ͼ�飺");
				String book1;
				try {
					
					book1 = scanner.next();
					
				} catch (Exception e) {
					System.out.println("���������쳣�����������룡");
					continue;
				}finally {
					
				}
				for (int i = 1; i < book.length; i++) {
					if (book1.equals(book[i][1])) {
						System.out.println("�ҵ�ͼ�飺"+book[i][0]+":"+book[i][1]);
						
						break;
					}if (i==book.length-1){
						System.out.println("ͼ����Ϣ��û�д�ͼ�飬������������ң�");
					}
				}//�ж�����������Ƿ������ͼ����Ϣ�У�������ھ�������ҵ�ͼ�飬������ѭ����
			}else if (a==1) {
				System.out.println("������ͼ����Ų���ͼ�飺");
				int book2;
				try {
					
					book2=scanner.nextInt();
					
				} catch (Exception e) {
					System.out.println("���������쳣�����������룡");
					continue;
				}finally {
					
				}
				for (int i = 1; i < book.length; i++) {
					if (book2==Integer.valueOf(book[i][0])) {
						System.out.println("�ҵ�ͼ�飺"+book[i][0]+":"+book[i][1]);
						break;
					}
					if (i==book.length-1){
						System.out.println("ͼ����Ϣ��û�д�ͼ�飬������������ң�");
					}
				}//�ж������ͼ������Ƿ������ͼ����Ϣ�У�������ھ�������ҵ�ͼ�飬������ѭ����
			
			}else {
				System.out.println("���������쳣�����������룡");
				continue;
			}
		}
		
	}

}
