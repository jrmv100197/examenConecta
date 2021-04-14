package com.conecta.examen.service;

import com.conecta.examen.dto.TestResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

@Service
public class ExamenServiceImpl implements ExamenService{

    @Override
    public Collection<TestResponse> testTx(MultipartFile file) {

        try {
            return evaluarCasos(file.getInputStream());
        }catch (Exception e){
            return null;
        }

    }

    private Collection<TestResponse> evaluarCasos(InputStream file){
        int argCoordenadas[][];
        Collection<TestResponse> respuestas = new ArrayList<TestResponse>();
        try  (Scanner entrada = new Scanner(file)) {
            int repeticiones = entrada.nextInt();
            for(int i=0; i<repeticiones; i++){
                int tamanio = entrada.nextInt();
                argCoordenadas=new int[tamanio][2];

                for(int j=0; j<tamanio; j++){
                    argCoordenadas[j][0]=entrada.nextInt();
                    argCoordenadas[j][1]=entrada.nextInt();
                }
                System.out.println(resolverCaso(argCoordenadas));
                respuestas.add(new TestResponse(resolverCaso(argCoordenadas)));

            }
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return respuestas;
    }

    private int resolverCaso(int arg[][]){
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

    private int distancia(int x1,int y1, int x2, int y2){
        return (int) Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }

}
