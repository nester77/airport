package academy.belhard.io;

import academy.belhard.entity.Pilots;
import academy.belhard.io.api.EntityFileReader;
import academy.belhard.util.PilotsUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotsFileReader implements EntityFileReader {
    private final String filepath;

    public PilotsFileReader(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<Pilots> readItems() {
        List<Pilots> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Pilots pilot = PilotsUtil.toObject(line);

                result.add(pilot);
            }

        } catch (IOException e) {
            System.out.println("Read file error");
        }

        return result;
    }
}