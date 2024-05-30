import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int baseSalary = 2000;
    }

    static void analizeCandidates(double desiredSalary, int baseSalary) {
        if (baseSalary > desiredSalary) {
            System.out.println("Ligando para o candidato.");
        } else if (baseSalary == desiredSalary) {
            System.out.println("ligando para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultados dos demais candidatos.");
        }
    }

    static List<String> selectCandidates(int baseSalary) {
        String[] candidates = { "FELIPE", "MARCIA", "JULIA", "FLORINDA", "JEREMIAS", "PAULO", "MARIANA" };
        int actualCandidate = 0;
        int selectedCandidates = 0;
        List<String> listOfSelectedCandidates = new ArrayList<String>();

        while (selectedCandidates < 5 && actualCandidate < candidates.length) {
            System.out.println("Digite sua pretensao salarial: ");
            Scanner desiredSalaryScanner = new Scanner(System.in);
            double desiredSalary = desiredSalaryScanner.nextFloat();
            String candidate = candidates[actualCandidate];

            if (baseSalary >= desiredSalary) {
                selectedCandidates++;
                listOfSelectedCandidates.add(candidate);
            }
            actualCandidate++;
        }

        System.out.println("Os candidatos selecionados foram: ");
        for (String candidate : listOfSelectedCandidates) {
            System.out.println(candidate);
        }
        return listOfSelectedCandidates;
    }
}
