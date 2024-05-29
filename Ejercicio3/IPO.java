package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class IPO {
    private List<IPODocument> documents;

    public IPO() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(IPODocument document) {
        this.documents.add(document);
        IPO ipo = new IPO();

        DocumentacionLegal docLegal = new DocumentacionLegal("Contrato de IPO", "2024-05-29", "Abogado X", "Registro123");
        ipo.addDocument(docLegal);

        DocumentacionFinanciera docFinanciera = new DocumentacionFinanciera("Balance General", "2024-05-29", 1000000.0, 500000.0);
        ipo.addDocument(docFinanciera);

        DocumentacionOperativa docOperativa = new DocumentacionOperativa("Manual de Operaciones", "2024-05-29", "Operación X", "Procedimiento Y");
        ipo.addDocument(docOperativa);
    }

    public List<IPODocument> getDocuments() {
        return documents;
    }
}