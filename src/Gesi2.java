//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Scanner;
//
//class Board {
//
//    public static int boardNumber;
//    
//	int number;
//    String title;
//    String content;
//    String writer;
//    String date;
//
//    @Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "";
//	}
//	public Board(int number, String title, String content, String writer, String date) {
//        this.number = number;
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
//        this.date = date;
//    }
//    public int getBoardNumber() {
//        return boardNumber;
//    }
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public String getWriter() {
//		return writer;
//	}
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//
//}
//public class Gesi2 {
//
//	public static void main(String[] args) throws IOException {
//		List<Board> boardList = new ArrayList<>();
//		
//		System.out.println("=============================");
//		System.out.println("번호  제목  작성자       작성일");
//		System.out.println("-----------------------------");
//		
//		while(true) {
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("Gesifan.txt"));
//			BufferedReader br = new BufferedReader(new FileReader("Gesifan.txt"))){
//			Scanner sc = new Scanner(System.in);
//			for (Board b : boardList) {
//				System.out.print(b);
//				}
//				while(true) {
//
//	            System.out.print("1.목록  2.등록  3.내용  4.삭제  0.종료");
//	            int number = sc.nextInt();
//	            sc.nextLine();
//	            
//	            switch (number) {
//                case 1:
//
//				    System.out.println("=============================");
//				    System.out.println("번호  제목  작성자       작성일");
//
//				    for (Board board : boardList) {
//				        System.out.print(" "+board.getNumber() + "  " + board.getTitle() + "  " + board.getWriter() + "     " + board.getDate());
//				        System.out.println();
//				    }
//				    System.out.println();
//
//				    break;            
//                case 2:
//                    System.out.print("제목>");
//                    int txt = 0;
//                    
//                    String title = sc.next();
//				    bw.write(title,0,title.length());
//				    bw.newLine();
//
//                    System.out.print("내용>");
//                    String content = sc.next();
//                    bw.write(content,0,content.length());
//                    bw.newLine();
//
//                    System.out.print("작성자>");
//                    String writer = sc.next();
//                    bw.write(writer,0,writer.length());
//                    bw.newLine();
//
//                    SimpleDateFormat dt = new SimpleDateFormat("yyyy년 MM월 dd일 a h:mm:ss");
//                    String date = dt.format(new Date());
//                    bw.write(date);
//                    bw.newLine();
//                    
//                    System.out.println("글이 정상적으로 추가 되었습니다");
//                    bw.flush();
//                    
//                    int boardNumber = boardList.size() + 1;
//
//                    Board board = new Board(boardNumber, title, content, writer, date);
//                    boardList.add(board);
//
//                    System.out.println("게시글 번호는 " + boardNumber + "입니다.");
//                    break;
//                    
//                case 3:
//				    System.out.println("=============================");
//				    System.out.println("번호  제목  작성자       작성일");
//					
//				    for (Board board1 : boardList) {
//				        System.out.print(" "+board1.getNumber() + "  " + board1.getTitle() + "  " + board1.getWriter() + "     " + board1.getDate());
//				        System.out.println();
//				    }
//				    System.out.println();
//					System.out.print("위의 게시글 번호중 하나를 넣어 주세요");
//					int selectNumber = sc.nextInt();
//
//					for (Board board1 : boardList) {
//					    if (board1.getNumber() == selectNumber) {
//					        System.out.println("제목: " + board1.getTitle());
//					        System.out.println("내용: " + board1.getContent());
//					        System.out.println("작성자: " + board1.getWriter());
//					        System.out.println("작성일: " + board1.getDate());
//					    }
//					    else {
//					    	System.out.println("등록되어 있는 게시글의 번호를 입력해주세요");
//					    	continue;
//					    }
//					    }
//					break;                    
//                case 4:
//                    System.out.print("삭제할 게시글 번호를 입력하세요: ");
//                    int deleteNumber = sc.nextInt();
//
//                    boardList.remove(deleteNumber - 1);
//
//                    System.out.println("게시글이 삭제되었습니다.");
//                    break;
//                case 0:
//                    System.out.println("프로그램을 종료합니다.");
//                    System.exit(0);
//                default:
//                    System.out.println("올바른 번호를 입력해주세요.");
//                    break;
//	            }
//				}
//				}
//				catch (Exception e) {
//					System.out.println("잘못 입력하셨습니다.");
//					Scanner sc = new Scanner(System.in);
////					sc.next();
//					continue;
//				}
//				}
//	}
//}
