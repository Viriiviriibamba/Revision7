package revisión7;
import java.util.HashMap;
import java.util.Scanner;

//Se importaron las clases necesarias al principio del archivo.
public class Codigo7 { 

    static Scanner scanner = new Scanner(System.in); //Se corrigió la declaración de Scanner.
    static HashMap<String, String> capitales = new HashMap<>();

    public static void main(String[] args) {
        Codigo7 app = new Codigo7();
        app.ejecutarJuego();
    
            capitales.put("Canadá", "Ottawa");
            capitales.put("Estados Unidos", "Washington DC");
            capitales.put("México", "México DF");
            capitales.put("Belice", "Belmopán");
            capitales.put("Costa Rica", "San José");
            capitales.put("El Salvador", "San Salvador");
            capitales.put("Guatemala", "Ciudad de Guatemala");
            capitales.put("Honduras", "Tegucigalpa");
            capitales.put("Nicaragua", "Managua");
            capitales.put("Panamá", "Panamá");

            String pais = "";
            do {
                System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para terminar): ");
                pais = scanner.nextLine(); //Usamos nextLine para leer cualquier entrada

                if (!pais.equals("salir")) {
                    if (capitales.containsKey(pais)) {
                        System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                    } else {
                        System.out.print("No conozco la respuesta. ");
                        System.out.print("¿Cuál es la capital de " + pais + "?: ");
                        String capital = scanner.nextLine();
                        capitales.put(pais, capital);
                        System.out.println("Gracias por enseñarme nuevas capitales.");
                    }
                }
            } while (!pais.equals("salir"));
        }

	private void ejecutarJuego() {
		// TODO Auto-generated method stub
		
	}
    }
 


