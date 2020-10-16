package chap08.textbook.exercise.p04;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");

	}

	@Override
	public void upDate() {
		System.out.println("Oracle DB에서 추가");

	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");

	}

}
