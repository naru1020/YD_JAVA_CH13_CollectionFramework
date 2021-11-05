package verifyTest;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> List = dao.getBoardList();
		for(Board board : List) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
