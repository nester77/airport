package academy.belhard.io;

import academy.belhard.entity.Airplanes;
import academy.belhard.io.api.EntityFileReader;
import academy.belhard.util.AirplanesUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirplanesFileReader implements EntityFileReader {
    private final String filepath;

    public AirplanesFileReader(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<Airplanes> readItems() {
        List<Airplanes> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Airplanes address = AirplanesUtil.toObject(line);

                result.add(address);
            }

        } catch (IOException e) {
            System.out.println("Read file error");
        }

        return result;
    }
}
