package academy.belhard.io;

import academy.belhard.entity.Flights;
import academy.belhard.io.api.EntityFileReader;
import academy.belhard.util.FlightUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsFileReader implements EntityFileReader {
    private final String filepath;

    public FlightsFileReader(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<Flights> readItems() {
        List<Flights> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Flights flight = FlightUtil.toObject(line);

                result.add(flight);
            }

        } catch (IOException e) {
            System.out.println("Read file error");
        }

        return result;
    }
}
