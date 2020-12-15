package academy.belhard.io;

import academy.belhard.entity.FullInfo;
import academy.belhard.util.FullInfoUtil;
import academy.belhard.util.PrintTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FullInfoFileWriter {
    private List<FullInfo> fullInfo;

    public FullInfoFileWriter(List<FullInfo> fullInfo) {
        this.fullInfo = fullInfo;
    }

    public void writeAll(String nameOfFile) {
        try (FileWriter writer = new FileWriter(nameOfFile)) {

            for (FullInfo fullInfo : fullInfo) {
                writer.write(FullInfoUtil.formatForWriting(fullInfo));
                PrintTable.printRow (fullInfo);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
