package academy.belhard;

import academy.belhard.entity.Airplanes;
import academy.belhard.entity.Flights;
import academy.belhard.entity.FullInfo;
import academy.belhard.entity.Pilots;
import academy.belhard.io.*;

import java.util.List;

import static academy.belhard.io.FilePathConstants.*;

public class Main {

    public static void main(String[] args) {


        PilotsFileReader reader_pilots = new PilotsFileReader(PILOTS_SOURCE_FILE);
        List<Pilots> pilot = reader_pilots.readItems();

        PilotsDbWriter writer_pilots = new PilotsDbWriter(pilot);
        writer_pilots.saveAll();

        AirplanesFileReader reader_airplanes = new AirplanesFileReader(AIRPLANES_SOURCE_FILE);
        List<Airplanes> airplane = reader_airplanes.readItems();

        AirplanesDbWriter writer_airplanes = new AirplanesDbWriter(airplane);
        writer_airplanes.saveAll();

        FlightsFileReader reader_flights = new FlightsFileReader(FLIGHTS_SOURCE_FILE);
        List<Flights> flight = reader_flights.readItems();

        FlightsDbWriter writer_flights = new FlightsDbWriter(flight);
        writer_flights.saveAll();

        FullInfoDbReader fullInfoDbReader = new FullInfoDbReader();
        List<FullInfo> fullInfo = fullInfoDbReader.readAll();

        FullInfoFileWriter fullInfoFileWriter = new FullInfoFileWriter(fullInfo);
        fullInfoFileWriter.writeAll(RESULT_FILE);
    }

}
