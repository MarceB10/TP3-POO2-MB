package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV implements FuenteDeDatos {

    private String csvPath;

    public LectorCSV(String csvPath) {
        this.csvPath = csvPath;
    }


    public List<String[]> toList() {
        try {
            List<String[]> csvData = new ArrayList<String[]>();
            CSVReader reader = new CSVReader(new FileReader(this.csvPath));
            String[] row = null;

            while ((row = reader.readNext()) != null) {
                csvData.add(row);
            }

            reader.close();
            csvData.remove(0);

        } catch ( Exception e){
             throw new RuntimeException(e);
        }
        return List.of();
    }
}
