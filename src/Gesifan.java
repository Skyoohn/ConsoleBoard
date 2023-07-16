import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//class Board{
//	private String menu;
//	
//	public Board(String menu) {
//		this.menu=menu;
//	}
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//	}
//	@Override
//	public String toString() {
//		return String.valueOf(menu);
//	}
//}
//class Select{
//	private int number;
//	
//	public Select(int number) {
//		this.number=number;
//	}
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//}



//class Writer{
//	private String title,detail,name,time;
//	
//	public Writer(String title,String detail,String name,String time) {
//	this.detail=detail;
//	this.name=name;
//	this.title=title;
//	this.time=time;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getDetail() {
//		return detail;
//	}
//	public void setDetail(String detail) {
//		this.detail = detail;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTime() {
//		return time;
//	}
//	public void setTime(String time) {
//		this.time = time;
//	}
//}
//class Reader{
//	String title,detail,name,time;
//	
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getDetail() {
//		return detail;
//	}
//	public void setDetail(String detail) {
//		this.detail = detail;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTime() {
//		return time;
//	}
//	public void setTime(String time) {
//		this.time = time;
//	}
//	public Reader(String title,String detail,String name,String time) {
//	this.detail=detail;
//	this.name=name;
//	this.title=title;
//	this.time=time;
//	}
//}

//class Counter{
//	int gnum;
//	
//	public void Count(int gnum) {
//		this.gnum=gnum;
//	}
//
//	public int getGnum() {
//		return gnum;
//	}
//
//	public void setGnum(int gnum) {
//		gnum = gnum+1;
//	}
//	
//}
public class Gesifan {

	public static void main(String[] args) throws IOException{
		ArrayList<Board> bod = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("번호  제목  작성자       작성일");
		System.out.println("-----------------------------");
		bod.add(new Board ("1.목록  "));
		bod.add(new Board ("2.등록  "));
		bod.add(new Board ("3.내용  "));
		bod.add(new Board ("4.삭제  "));
		bod.add(new Board ("0.종료  "));

			try(BufferedWriter bw = new BufferedWriter(new FileWriter("Gesifan.txt"));
				BufferedReader br = new BufferedReader(new FileReader("Gesifan.txt"))){
				int count = 0;
				while(true) {
				for (Board b : bod) {
					System.out.print(b);
					}		
					Select se;
					int number = sc.nextInt();
					sc.nextLine();
//					Counter co = new Counter();
//					int gnum;
				switch (number) {
				  case 1:
				    System.out.println("=============================");
				    System.out.println("번호  제목  작성자       작성일");
				    System.out.println(count+br.readLine());
				    break;
				  case 2:
				    System.out.print("제목>");
				    int txt = 0;
		
				    String value = sc.next();
				    bw.write(value,0,value.length());
////				    bw.write(txt);
//				    bw.newLine();
////				    bw.flush();
////				    bw.close();
				    
//				    String line;
//
//				    int i = 0;
//
//				    while ((line = br.readLine()) != null) {
//				        if (i == 1) {
//				            continue;
//				        }
//				        System.out.print(boardList.get(i).getNumber() + " " + boardList.get(i).getTitle() + " " + boardList.get(i).getWriter() + " " + boardList.get(i).getDate());
//				        System.out.print(" ");
//				        i++;
//				    }
//				    System.out.println();
				    
//				    String line;
//
//				    int i = 0;
//
//				    while ((line = br.readLine()) != null) {
//				        if (i == 1) {
//				            continue;
//				        }
//				        System.out.print(boardList+line);
//				        System.out.print(" ");
//				        i++;
//				    }
//				    System.out.println();
				    
				    
//                	if(br == null) {
//                		System.out.println(br.readLine());
//    				   
//                	}
//                	if(br != null) {
//                		
//                		 System.out.println("게시물이 없습니다");
//                	}
//				    System.out.println(br.readLine());
				    
				    System.out.print("내용>");
				    String value1 = sc.next();
				    bw.write(value1,0,value1.length());
//				    bw.newLine();
				    
				    System.out.print("작성자>");
				    String value2 = sc.next();
				    bw.write(value2,0,value2.length());
//				    bw.newLine();
				    
				    SimpleDateFormat dt = new SimpleDateFormat("yyyy MM/dd HH:mm:ss");
				    String date = dt.format(new Date());
				    bw.write(date);
				    System.out.println("글이 정상적으로 추가 되었습니다");
				    bw.flush();
				    //bw.close();
				    count++;
				    break;
				  case 3:
					System.out.println("=============================");
					System.out.println("번호  제목  내용  작성자       작성일");
					System.out.println(count+br.readLine());		
					  
//					System.out.println(co.getGnum());
////					System.out.println(gnum);
//					String str;
//				    while((str = br.readLine())!=null) {
//				    	System.out.println(str);
//				    }
				    	
//					String line = br.readLine();
//				    System.out.println("제목>" + line);
//				    System.out.println("내용>" + br.readLine());
//				    System.out.println("작성자>" + br.readLine());
//				    System.out.println("작성시각>" + br.readLine());
				    break;
				  
				  case 4:
					System.out.println("글이 삭제되었습니다.");	
					break;
				  case 0:
					System.exit(0);
				  default:
				    System.out.println("올바른 번호를 입력해주세요");
				    break;
				}
				}
				}
				catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
//				Scanner sc;
//				continue;
				}
//			finally {
//				continue;
//			}
	}
	}
//				if(number == 1) {
//					System.out.println("=============================");
//					System.out.println("번호  제목  작성자       작성일");
//					continue;
//				}
//				else if(number == 2) {
//
//					System.out.print("제목>");
//					String value = sc.next();
//					bw.write(value);
//					bw.newLine();
//					
//					System.out.print("내용>");
//					String value1 = sc.next();
//					bw.write(value1);
//					bw.newLine();
//					
//					System.out.print("작성자>");
//					String value2 = sc.next();
//					bw.write(value2);
//					bw.newLine();
//					
//					System.out.println("글이 정상적으로 추가 되었습니다");
//					bw.flush();
////					bw.close();
//					
//					continue;
////					break;
//				}
//				else if(number == 3) {
//					String line = br.readLine();
//					System.out.println("제목>"+line);
//					System.out.println("내용>"+br.readLine());
//					System.out.println("작성자>"+br.readLine());
//					}
//				else if(number == 0) {
//					break;
//				}
//				else {
//					System.out.println("올바른 번호를 입력해주세요");
//					continue;
//				}
//				continue;
//				}

	