import java.util.Scanner;


class DescobrirTriangulo {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
	
	        double x = 0;
	        double y = 0;
	        double z = 0;
	        String type = "Isosceles";	
		
		 
            System.out.printf("Digite o valor do triangulo X :");
               
			x = teclado.nextDouble();
			   
			System.out.printf("Digite o valor do triangulo Y :");
			   
			y = teclado.nextDouble();
			   
			System.out.printf("Digite o valor do triangulo Z :");
			   
			z = teclado.nextDouble();


		    if(x == y && x == z){
	     	type = "Equilatero";
		    }
		
	     	if(x != y && x != z){
	        type = "Escaleno";
		    }
         
		     
            double p = (x + y + z)/2;
			p = p/2;
			
		    double area =  p*((p - x)*(p - y)*(p - z));
		    area = Math.sqrt(area);
			
		
    	    System.out.printf("\n O triangulo e um: %s \n\n Tem a Area de: %f \n\n E o perimetro de: %f\n\n",type, area, p); 

    		System.exit(0);
		
	}

}
