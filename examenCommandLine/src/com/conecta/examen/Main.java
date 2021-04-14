package com.conecta.examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Se debe Cambiar la ruta por la ruta donde se encuentre el archivo local
        String direccion="C:\\Users\\cdhhe\\Documents\\test2.txt";
        iniciar(direccion);
    }

    public static int distancia(int x1,int y1, int x2, int y2){
        return (int) Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }

    public static void iniciar(String direccion){
        int argCoordenadas[][];
        File f = new File(direccion);
        try  (Scanner entrada = new Scanner(f)) {
            int repeticiones = entrada.nextInt();
            for(int i=0; i<repeticiones; i++){
                int tamanio = entrada.nextInt();
                argCoordenadas=new int[tamanio][2];

                for(int j=0; j<tamanio; j++){
                    argCoordenadas[j][0]=entrada.nextInt();
                    argCoordenadas[j][1]=entrada.nextInt();
                }
                System.out.println(resolverCaso(argCoordenadas));
            }
        }catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static int resolverCaso(int arg[][]){
        int a,b,c;
        int leng=arg.length;
        int contador=0;
        for(int i=0; i<leng-2; i++){
            for(int j=i+1; j<leng-1; j++){
                for(int k=j+1; k<leng; k++){
                    a=distancia(arg[i][0],arg[i][1],arg[j][0],arg[j][1]);
                    b=distancia(arg[i][0],arg[i][1],arg[k][0],arg[k][1]);
                    c=distancia(arg[j][0],arg[j][1],arg[k][0],arg[k][1]);
                    if(a==b || a==c || b==c){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

}
