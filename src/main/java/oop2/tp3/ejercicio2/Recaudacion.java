package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Recaudacion {

    static final String COMPANY_NAME = "company_name";
    static final String CITY = "city";
    static final String STATE = "state";
    static final String ROUND = "round";
    static final String PERMALINK = "permalink";
    static final String NUMBER_EMPLOYEES = "number_employees";
    static final String CATEGORY = "category";
    static final String FUNDED_DATE = "funded_date";
    static final String RAISED_AMOUNT = "raised_amount";
    static final String RAISED_CURRENCY = "raised_currency";
    static final int INDICE_COMPANY_NAME = 1;
    static final int INDICE_CITY = 4;
    static final int INDICE_STATE = 5;
    static final int INDICE_ROUND = 9;
    private List<String[]> csvData;
    private Map<String, String> filtrosDeBusqueda;
    private Map<String, Integer> mapNombreIndice;


    public Recaudacion(FuenteDeDatos fuenteDeDatos){
        this.csvData = fuenteDeDatos.toList();
        this.mapNombreIndice = Map.of(COMPANY_NAME, INDICE_COMPANY_NAME,
                CITY,INDICE_CITY,
                STATE, INDICE_CITY,
                ROUND, INDICE_ROUND);
    }

    public List<Map<String, String>> where(Map<String, String> filtrosDeBusquedas) throws IOException {
        //method Object
        inicializarFiltros(filtrosDeBusquedas);

        for (String nombreColumna : this.filtrosDeBusqueda.keySet()) {
            List<String[]> results = csvData.stream().filter(csvDatum -> csvDatum[this.mapNombreIndice.get(filtrosDeBusquedas.get(this.mapNombreIndice.get(nombreColumna)))]
                    .equals(filtrosDeBusqueda.get(nombreColumna))).collect(Collectors.toList());

            csvData = results;
        }

        filtrarPor(COMPANY_NAME);
        filtrarPor(CITY);
        filtrarPor(STATE);
        filtrarPor(ROUND);
        return crearResultado();
    }

    private void inicializarFiltros(Map<String, String> options) {
        this.filtrosDeBusqueda = options;
    }

    private List<Map<String, String>> crearResultado() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (String[] csvDatum : csvData) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put(PERMALINK, csvDatum[0]);
            mapped.put(COMPANY_NAME, csvDatum[1]);
            mapped.put(NUMBER_EMPLOYEES, csvDatum[2]);
            mapped.put(CATEGORY, csvDatum[3]);
            mapped.put(CITY, csvDatum[4]);
            mapped.put(STATE, csvDatum[5]);
            mapped.put(FUNDED_DATE, csvDatum[6]);
            mapped.put(RAISED_AMOUNT, csvDatum[7]);
            mapped.put(RAISED_CURRENCY, csvDatum[8]);
            mapped.put(ROUND, csvDatum[9]);
            output.add(mapped);
        }
        return output;
    }

    private void filtrarPor(String nombreColumna) {
        if (filtrosDeBusqueda.containsKey(nombreColumna)) {
            List<String[]> results = new ArrayList<>();
            for (String[] csvDatum : csvData) {
                if (csvDatum[this.mapNombreIndice.get(nombreColumna)]
                        .equals(filtrosDeBusqueda.get(nombreColumna))) {
                    results.add(csvDatum);
                }
            }

            csvData = results;
        }
    }
}
