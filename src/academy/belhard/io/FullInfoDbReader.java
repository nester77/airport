package academy.belhard.io;

import academy.belhard.entity.FullInfo;
import academy.belhard.util.DbConnectionUtil;
import academy.belhard.util.PrintTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullInfoDbReader {
    private static final String SELECT = "SELECT f.flight_number, f.flight_date, f.flight_time, a.board_number, CONCAT(a.brand,\" \", a.model) AS airplane, a.passenger_capacity, CONCAT(p.last_name, \" \", SUBSTRING(p.first_name,1,1), \".\") AS pilot, CONCAT(p.pilot_code, \" (\", p.pilot_rank, \")\") AS code_rank " +
                                             "FROM flights AS f " +
                                             "INNER JOIN airplanes AS a ON a.id = f.airplane_id " +
                                             "INNER JOIN pilots AS p ON p.id = f.pilot_id;";

    public List<FullInfo> readAll() {
        List<FullInfo> res = new ArrayList<>();

        Connection connection = DbConnectionUtil.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(SELECT)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                String flightNumber = result.getString("flight_number");
                String flightDate = result.getString("flight_date");
                String flightTime = result.getString("flight_time");
                String boardNumber = result.getString("board_number");
                String airplane = result.getString("airplane");
                int passengerCapacity = result.getInt("passenger_capacity");
                String pilotName = result.getString("pilot");
                String pilotCodeRank = result.getString("code_rank");


                FullInfo p = new FullInfo(flightNumber,flightDate,flightTime,boardNumber,airplane,passengerCapacity,pilotName,pilotCodeRank);
                PrintTable.printRow (p);
                res.add(p);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
}
