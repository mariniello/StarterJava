package JavaJdbc.dao;

public class DAOException extends RuntimeException {

	public DAOException(String msg, Throwable t) {
		super(msg, t);
	}
}