package academy.belhard.io;

import academy.belhard.entity.Pilots;
import academy.belhard.io.api.EntityDbWriter;
import academy.belhard.util.DbConnectionUtil;
import academy.belhard.util.PrintTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotsDbWriter implements EntityDbWriter {
    private List<Pilots> pilot;

    private static final String ADD = "INSERT INTO pilots (first_name, last_name, pilot_rank, pilot_code) VALUES(?, ?, ?, ?)";

    public PilotsDbWriter(List<Pilots> pilot) {
        this.pilot = pilot;
    }

    @Override
    public void saveAll() {
        System.out.println("Старт записи в таблицу ПИЛОТЫ");
        for (Pilots pilot : pilot) {
            save(pilot);
            PrintTable.printRow (pilot);
        }
        System.out.println("Запись в таблицу ПИЛОТЫ завершена");
    }

    private void save(Pilots pilot) {
        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(ADD)) {
            statement.setString(1, pilot.getFirstName());
            statement.setString(2, pilot.getLastName());
            statement.setString(3, String.valueOf(pilot.getPilotRank()));
            statement.setString(4, pilot.getPilotCode());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}