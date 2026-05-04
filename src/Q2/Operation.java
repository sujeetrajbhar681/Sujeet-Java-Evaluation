package Q2;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operation {

	void insertData() {
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("insert into info values(?,?)");

			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Sujeet");

			preparedStatement.executeUpdate();
			System.out.println("data insertedd...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void update() {
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("UPDATE info SET name = ? WHERE id = ?");
			preparedStatement.setInt(2, 1);
			preparedStatement.setString(1, "SDAC");

			preparedStatement.executeUpdate();
			System.out.println("Data Updated");
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	void delete() {
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("DELETE FROM info WHERE id = ?");
			preparedStatement.setInt(1, 2);

			preparedStatement.executeUpdate();
			System.out.println("Data delete");
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Operation operation = new Operation();
		operation.insertData();
		operation.update();
		operation.delete();

	}

}
