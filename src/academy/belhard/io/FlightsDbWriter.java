package academy.belhard.io;

import academy.belhard.entity.Flights;
import academy.belhard.io.api.EntityDbWriter;
import academy.belhard.util.DbConnectionUtil;
import academy.belhard.util.PrintTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightsDbWriter implements EntityDbWriter {
    private List<Flights> flight;

    private static final String ADD = "INSERT INTO flights (airplane_id, pilot_id, flight_date, flight_time, flight_number) VALUES(?, ?, ?, ?, ?)";

    public FlightsDbWriter (List<Flights> flight) {
        this.flight = flight;
    }

    @Override
    public void saveAll() {
        System.out.println("Старт записи в таблицу РЕЙСЫ");
        for (Flights flight : flight) {
            save(flight);
            PrintTable.printRow (flight);
        }
        System.out.println("Запись в таблицу РЕЙСЫ завершена");
    }

    private void save(Flights flight) {
        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setInt(1, flight.getAirplane_id());
            statement.setInt(2, flight.getPilot_id());
            statement.setString(3, flight.getFlight_date());
            statement.setString(4, flight.getFlight_time());
            statement.setString(5, flight.getFlight_number());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
