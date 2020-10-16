package chap08.textbook.exercise.p04;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySqlDao DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("MySqlDao DB에서 삽입");
	}

	@Override
	public void upDate() {
		System.out.println("MySqlDao DB에서 추가");

	}

	public void delete() {
		System.out.println("MySqlDao DB에서 삭제");
	}

}
