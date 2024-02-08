package proyectofinal;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ProyectoFinal {
public static void main(String[] args) {
            int limFilas = 10, limColumnas = 3;
            String[][] rutas = leerHoraRutas("BusesArchivo.csv", limFilas, limColumnas);
            int limFilas1 = 6, limColumnas1 = 2;
            String[][] Parada1 = leerParadas("ParadasUbicacion1.csv", limFilas1, limColumnas1);
            String[][] Parada2 = leerParadas("ParadasUbicacion2.csv", limFilas1, limColumnas1);
            String[][] Parada3 = leerParadas("ParadasUbicacion3.csv", limFilas1, limColumnas1);
            String[][] Parada4 = leerParadas("ParadasUbicacion4.csv", limFilas1, limColumnas1);
            String[][] Parada5 = leerParadas("ParadasUbicacion5.csv", limFilas1, limColumnas1);
            String[][] Parada6 = leerParadas("ParadasUbicacion6.csv", limFilas1, limColumnas1);
            String[][] Parada7 = leerParadas("ParadasUbicacion7.csv", limFilas1, limColumnas1);
            String[][] Parada8 = leerParadas("ParadasUbicacion8.csv", limFilas1, limColumnas1);
            String[][] Parada9 = leerParadas("ParadasUbicacion9.csv", limFilas1, limColumnas1);
            String[][] Parada10 = leerParadas("ParadasUbicacion10.csv", limFilas1, limColumnas1);
            String[][] NumDemanda1 = leerDatosDemanda("ParadasPersonas1.csv", limFilas1, limColumnas1);
            String[][] NumDemanda2 = leerDatosDemanda("ParadasPersonas2.csv", limFilas1, limColumnas1);
            String[][] NumDemanda3 = leerDatosDemanda("ParadasPersonas3.csv", limFilas1, limColumnas1);
            String[][] NumDemanda4 = leerDatosDemanda("ParadasPersonas4.csv", limFilas1, limColumnas1);
            String[][] NumDemanda5 = leerDatosDemanda("ParadasPersonas5.csv", limFilas1, limColumnas1);
            String[][] NumDemanda6 = leerDatosDemanda("ParadasPersonas6.csv", limFilas1, limColumnas1);
            String[][] NumDemanda7 = leerDatosDemanda("ParadasPersonas7.csv", limFilas1, limColumnas1);
            String[][] NumDemanda8 = leerDatosDemanda("ParadasPersonas8.csv", limFilas1, limColumnas1);
            String[][] NumDemanda9 = leerDatosDemanda("ParadasPersonas9.csv", limFilas1, limColumnas1);
            String[][] NumDemanda10 = leerDatosDemanda("ParadasPersonas10.csv", limFilas1, limColumnas1);
            String rutaArchivo1 = "ParadasPersonas1.csv";
            String rutaArchivo2 = "ParadasPersonas2.csv";
            String rutaArchivo3 = "ParadasPersonas3.csv";
            String rutaArchivo4 = "ParadasPersonas4.csv";
            String rutaArchivo5 = "ParadasPersonas5.csv";
            String rutaArchivo6 = "ParadasPersonas6.csv";
            String rutaArchivo7 = "ParadasPersonas7.csv";
            String rutaArchivo8 = "ParadasPersonas8.csv";
            String rutaArchivo9 = "ParadasPersonas9.csv";
            String rutaArchivo10 = "ParadasPersonas10.csv";
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            while (!salir) {
                System.out.println("¿Qué desea realizar?");
                System.out.println("[1] Mostrar rutas disponibles");
                System.out.println("[2] Mostrar ubicación de las rutas");
                System.out.println("[3] Gestión de rutas");
                System.out.println("[4] Salir");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("------------------------Rutas Disponibles----------------------------");
                        imprimirHoraRuta(rutas);
                        break;

                    case 2:
                        System.out.print("Por favor, ingrese el nombre de la ruta que desea consultar: ");
                        Scanner respt = new Scanner(System.in);
                        String respuesta = respt.nextLine();
                        if (respuesta.equalsIgnoreCase("Tebaida Alta")) {
                            imprimirParadas(Parada1);
                        } else if (respuesta.equalsIgnoreCase("Las Pitas")) {
                            imprimirParadas(Parada2);
                        } else if (respuesta.equalsIgnoreCase("Puerta de la ciudad")) {
                            imprimirParadas(Parada3);
                        } else if (respuesta.equalsIgnoreCase("Estadio")) {
                            imprimirParadas(Parada4);
                        } else if (respuesta.equalsIgnoreCase("HiperValle")) {
                            imprimirParadas(Parada5);
                        } else if (respuesta.equalsIgnoreCase("24 de Mayo")) {
                            imprimirParadas(Parada6);
                        } else if (respuesta.equalsIgnoreCase("Clodoveo")) {
                            imprimirParadas(Parada7);
                        } else if (respuesta.equalsIgnoreCase("Zona Militar")) {
                            imprimirParadas(Parada8);
                        } else if (respuesta.equalsIgnoreCase("La Paz")) {
                            imprimirParadas(Parada9);
                        } else if (respuesta.equalsIgnoreCase("Terminal Terrestre")) {
                            imprimirParadas(Parada10);
                        } else {
                            break;
                        }
                        break;

                    case 3:
                        System.out.print("Por favor, ingrese el nombre de la ruta que desea consultar: ");
                        Scanner respt3 = new Scanner(System.in);
                        String respuesta3 = respt3.nextLine();
                        if (respuesta3.equalsIgnoreCase("Tebaida Alta")) {
                            imprimirDemanda(NumDemanda1);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo1);
                        } else if (respuesta3.equalsIgnoreCase("Las Pitas")) {
                            imprimirDemanda(NumDemanda2);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo2);
                        } else if (respuesta3.equalsIgnoreCase("Puerta de la ciudad")) {
                            imprimirDemanda(NumDemanda3);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo3);
                        } else if (respuesta3.equalsIgnoreCase("Estadio")) {
                            imprimirDemanda(NumDemanda4);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo4);
                        } else if (respuesta3.equalsIgnoreCase("HiperValle")) {
                            imprimirDemanda(NumDemanda5);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo5);
                        } else if (respuesta3.equalsIgnoreCase("24 de Mayo")) {
                            imprimirDemanda(NumDemanda6);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo6);
                        } else if (respuesta3.equalsIgnoreCase("Clodoveo")) {
                            imprimirDemanda(NumDemanda7);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo7);
                        } else if (respuesta3.equalsIgnoreCase("Zona Militar")) {
                            imprimirDemanda(NumDemanda8);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo8);
                        } else if (respuesta3.equalsIgnoreCase("La Paz")) {
                            imprimirDemanda(NumDemanda9);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo9);
                        } else if (respuesta3.equalsIgnoreCase("Terminal Terrestre")) {
                            imprimirDemanda(NumDemanda10);
                            System.out.println("------------------------Recomendaciones----------------------------");
                            analizarParadas(rutaArchivo10);
                        } else {
                            break;
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema de autobuses");
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
    }
    public static String[][] leerHoraRutas(String ruta, int limFilas, int limColumnas) {
        try {
            Scanner fileIn = new Scanner(new File(ruta));
            String[][] datos = new String[limFilas][limColumnas];
            for (int i = 0; i < limFilas; i++) {
                if (fileIn.hasNextLine()) {
                    String linea = fileIn.nextLine();
                    String[] partes = linea.split(";", 3);
                    if (partes.length == 3) {
                        datos[i][0] = partes[0];
                        datos[i][1] = partes[1];
                        datos[i][2] = partes[2];
                    }
                }
            }
            return datos;
        } catch (FileNotFoundException e) {
            return new String[0][0];  
        }
    }
    public static void imprimirHoraRuta(String[][] ubi){
        System.out.println("Sale UTPL   |    Llega UTPL     |           RUTAS");
        for(String[] fila : ubi){
            System.out.println(fila[0]+"       |       "+ fila[1]+"       |       "+ fila[2]);
        }
        
    }
    public static String[][] leerParadas(String p1, int limFilas1, int limColumnas1) {
        try {
            Scanner fileIn = new Scanner(new File(p1));
            String[][] Parada = new String[limFilas1][limColumnas1];
            for (int i = 0; i < limFilas1; i++) {
                if (fileIn.hasNextLine()) {
                    String linea = fileIn.nextLine();
                    String[] partes = linea.split(";", 2);
                    if (partes.length == 2) {
                        Parada[i][0] = partes[0];
                        Parada[i][1] = partes[1];
                    }
                }
            }
            return Parada;
        } catch (FileNotFoundException e) {
            return new String[0][0];
        }
    }
    public static void imprimirParadas(String[][] ubi){
        System.out.println("PARADAS  |   UBICACION");
        for(String[] fila : ubi){
            System.out.println(fila[0]+"  |  "+ fila[1]);
        }
    }
    public static String[][] leerDatosDemanda(String p1, int limFilas1, int limColumnas1) {
            try {
                Scanner fileIn = new Scanner(new File(p1));
                String[][] Parada = new String[limFilas1][limColumnas1];
                for (int i = 0; i < limFilas1; i++) {
                    if (fileIn.hasNextLine()) {
                        String linea = fileIn.nextLine();
                        String[] partes = linea.split(";", 2);
                        if (partes.length == 2) {
                        Parada[i][0] = partes[0];
                        Parada[i][1] = partes[1];
                        }
                    }
                }
                return Parada;
            } catch (FileNotFoundException e) {

        return new String[0][0]; 
        }
    }   
    public static void imprimirDemanda(String[][] ubi){
        System.out.println("PARADAS  |   Numero de personas que subieron");
        for(String[] fila : ubi){
            System.out.println(fila[0]+"  |  "+ fila[1]);
        }
    }
    public static void analizarParadas(String archivoCSV) {
        try (Scanner scanner = new Scanner(new File(archivoCSV))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    String nombreParada = partes[0];
                    int personasSubieron = Integer.parseInt(partes[1]);

                    // Se llama la función para evaluar el número de personas y mostrar mensajes
                    evaluarNumeroPersonas(nombreParada, personasSubieron);
                }
            }
        } catch (Exception e) {
        }
    }
    public static void evaluarNumeroPersonas(String nombreParada, int personasSubieron) {
        if (personasSubieron < 10) {
            System.out.println("Parada " + nombreParada + ": Se recomienda eliminar esta parada por no tener suficientes pasajeros.");
        } else if (personasSubieron >= 10 && personasSubieron <= 30) {
            System.out.println("Parada " + nombreParada + ": La línea abastece con éxito la parada.");
        } else if (personasSubieron > 30) {
            System.out.println("Parada " + nombreParada + ": Se recomienda enviar otra línea de bus por la comodidad de los pasajeros.");
        }
    }   
}
