import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] lista = new String[1+366+2][4]; // Las linea extra es simplemente para poner estadisticas que se actualizan dependiendo de la cantidad de veces que ha sucedido una acción
        crear(lista);
        show(lista);
    }
    public static void show(String[][] lista) {
        for (int i=0;i<50;i++) {
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        boolean hay = false;
        for (int i=0;i<lista.length;i++) {
            for (int j=0;j<lista[i].length;j++) {
                if (j == 0) {
                    if (lista[i][j] != null) {
                        hay = true;
                        System.out.print("| ");
                    }
                } else {
                    if (lista[i][j] != null) {
                        System.out.print(" ");
                    }
                }
                if(lista[i][j] != null) {
                    System.out.print(lista[i][j] + " |");
                }
            }
            if (hay != false) {
                System.out.println();
                hay = false;
            }
        }
        System.out.println("""
------------------------
Que quieres hacer ahora?
------------------------
1. Falta/Retraso/Justificar
2. Buscar
3. Borrar una falta""");
        int r = sc.nextInt();
        if (r == 1) {
            AddFalta(lista);
        } else if (r == 2) {
            buscar(lista);
        } else if (r == 3) {
            borrar(lista);
        }
    }
    public static void borrar(String[][] lista) {
        boolean hay = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
----------------
Introduce el dia
----------------""");
        int r = sc.nextInt();
        int n= 0;
        System.out.println("""
-------------------
Posibles Candidatos
-------------------""");
        for(int i=0;i< lista.length;i++) {
            for (int j=0;j<lista[i].length;j++) {
                if(i==0) {
                    n = i+1;
                } else {
                    n = i;
                }
                if(lista[n][0] != null && lista[n][0].equals(r+"")) {
                    hay =true;
                    if (j==0) {
                        System.out.print("| " + lista[i][j] + " |");
                    } else {
                        System.out.print(lista[i][j] + " |");
                    }
                }
            }
            if (hay) {
                System.out.println();
                hay=false;
            }
        }
        System.out.println("""
-------------------------------
Ahora introduce todos los datos
-------------------------------""");
        System.out.println("""
----------
Asignatura
----------""");
        String Asignatura = sc.next();
        System.out.println("""
------
Nombre
------""");
        sc.nextLine();
        String Nombre = sc.nextLine();
        hay=false;
        for (int i=0;i<lista.length;i++) {
            for(int j=0;j<lista[i].length;j++) {
                if(i==0) {
                    n = i+1;
                } else {
                    n = i;
                }
                if(lista[n][0] != null && lista[n][0].equals(r+"")) {
                    hay=true;
                    for(int k=0;k<4;k++) {
                        lista[i][k] = null;
                    }
                }
            }
            if (hay) {
                System.out.println();
                hay=false;
            }
        }
        show(lista);
    }
    public static void AddFalta(String[][] lista) {
        System.out.println("AddFalta");
        Scanner sc = new Scanner(System.in);
        System.out.println("""
---------------
Que dia es hoy?
---------------
                """);
        int dia = sc.nextInt();
        System.out.println("""
---------------------
De que Asignatura es?
---------------------
                """);
        String Asignatura = sc.next();
        System.out.println("""
-----------------
Nombre del alumno
-----------------
                """);
        sc.nextLine();
        String Nombre = sc.nextLine();
        System.out.println("""
-------------
Tipo de Falta
-------------
1. Falta
2. Retraso
3. Justificada
4. Cancelar
                """);
        int Tipo = sc.nextInt();
        lista[dia][0] = dia + "";
        lista[dia][1] = Asignatura;
        lista[dia][2] = Nombre;
        if (Tipo == 1) {
            lista[dia][3] = "Falta";
        } else if (Tipo == 2){
            lista[dia][3] = "Retraso";
        } else if (Tipo == 3){
            lista[dia][3] = "Justificada";
        } else if (Tipo == 4){
            lista[dia][0] = null;
            lista[dia][1] = null;
            lista[dia][2] = null;
            lista[dia][3] = null;
        }
        show(lista);
    }

    public static void crear(String[][] lista) {
        lista[0][0] = "Dia";
        lista[0][1] = "Asignatura";
        lista[0][2] = "Nombre";
        lista[0][3] = "Tipo";
    }
    public static void buscar(String[][] lista) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        System.out.println("""
-------------------
Que quieres buscar?
-------------------
1. Dia
2. Asignatura
3. Nombre
4. Tipo""");
        int r=sc.nextInt();
        if (r == 1) {
            valor = 0;
        } else if (r == 2) {
            valor = 1;
        } else if (r == 3) {
            valor = 2;
        } else if (r == 4) {
            valor = 3;
        }

        System.out.println("""
----------------------------------------------------------
Introduce el/la caracter/palabra/numero que quieras buscar
----------------------------------------------------------""");
        sc.nextLine();
        String busqueda = sc.nextLine();
        for(int i=0;i<lista.length;i++) {
            boolean hay = false;
            for (int j=0;j<lista[i].length;j++) {
                if (lista[i][valor] != null) {
                    if(lista[i][valor].equals(busqueda)) {
                        hay = true;
                        if (j==0) {
                            System.out.print("| " + lista[i][j] + " |");
                        } else {
                            System.out.print(lista[i][j] + " |");
                        }
                    }
                }
            }
            if (hay) {
                System.out.println();
                hay = false;
            }
        }
        System.out.println("""
--------------------------
Quieres salir o reiniciar?
--------------------------
1. Salir
2. Reiniciar""");
        int r1 = sc.nextInt();
        if (r1 == 1) {
            System.out.println();
        } else if (r1 == 2) {
            show(lista);
        } else {
            System.out.println("Error");
        }
    }
}
