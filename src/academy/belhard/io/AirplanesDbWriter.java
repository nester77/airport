package academy.belhard.io;

import academy.belhard.entity.Airplanes;
import academy.belhard.io.api.EntityDbWriter;
import academy.belhard.util.DbConnectionUtil;
import academy.belhard.util.PrintTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AirplanesDbWriter implements EntityDbWriter {
    private List<Airplanes> airplane;

    private static final String ADD = "INSERT INTO airplanes (brand, model, passenger_capacity, board_number) VALUES(?, ?, ?, ?)";

    public AirplanesDbWriter(List<Airplanes> airplane) {
        this.airplane = airplane;
    }

    @Override
    public void saveAll() {
        System.out.println("Старт записи в таблицу САМОЛЕТЫ");
        for (Airplanes airplane : airplane) {
            save(airplane);
            PrintTable.printRow (airplane);
        }
        System.out.println("Запись в таблицу САМОЛЕТЫ завершена");
    }

    private void save(Airplanes airplane) {
        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setString(1, airplane.getBrand());
            statement.setString(2, airplane.getModel());
            statement.setInt(3, airplane.getPassengerCapacity());
            statement.setString(4, airplane.getBoardNumber());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}