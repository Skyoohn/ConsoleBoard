import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//class Board {
//
//    int number;
//    String title;
//    String content;
//    String writer;
//    String date;
//
//    public Board(int number, String title, String content, String writer, String date) {
//        this.number = number;
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
//        this.date = date;
//    }
//
//}


public class test {

    public static void main(String[] args) throws IOException {
        // 게시글 목록을 저장하는 리스트
        List<Board> boardList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("Gesifan.txt"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            // 게시글 목록을 출력
            for (Board b : boardList) {
                System.out.println(b);
            }

            System.out.print("작업을 선택하세요 (1. 추가, 2. 삭제, 3. 목록): ");
            int number = sc.nextInt();
            sc.nextLine();

            switch (number) {
                case 1:
                    // 게시글을 추가합니다.
                    System.out.print("제목>");
                    String title = sc.next();

                    System.out.print("내용>");
                    String content = sc.next();

                    System.out.print("작성자>");
                    String writer = sc.next();

                    SimpleDateFormat dt = new SimpleDateFormat("yyyy MM/dd HH:mm:ss");
                    String date = dt.format(new Date());

                    // 게시글 번호 부여
                    int boardNumber = boardList.size() + 1;

                    Board board = new Board(boardNumber, title, content, writer, date);
                    boardList.add(board);

                    System.out.println("게시글 번호는 " + boardNumber + "입니다.");
                    break;
                case 2:
                    // 게시글을 삭제합니다.
                    System.out.print("삭제할 게시글 번호를 입력하세요: ");
                    int deleteNumber = sc.nextInt();

                    boardList.remove(deleteNumber - 1);

                    System.out.println("게시글이 삭제되었습니다.");
                    break;
                case 3:
                    // 게시글 목록을 출력합니다.
                    for (Board b : boardList) {
                        System.out.println(b);
                    }
                    break;
                case 0:
                    // 프로그램을 종료합니다.
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}
