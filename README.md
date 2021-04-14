Debido a que no se especifica las tecnologias que deberia usar y se anexan 2 proyectos

1.- examen: Este proyecto contiene tecnologias como SpringBoot y Swagger para poder agregar el archivo en un endpoint, la ruta del swagger para poder probarlo es la siguiente: http://localhost:8090/conecta/swagger-ui.html#!/controller45examen/Base_Operation

2.- examenCommandLine: este proyecto es un proyecto de command line donde todo se encuentra en un main, para poder ejecutarlo se debera cambiar la ruta del archivo en la variable: direccion

Dudas contactar por correo o via mail.

Adjunto descripcion del examen.

Instructions
  1. You must return your solution within 4 hours after you receive these instructions.
  2. You can use any programming language you want.
  3. Your program must read an ASCII text file as input and print its output to standard out.
  4. Everything that is not in the instructions is allowed.
Problem
  At ten thousand light-years from planet Earth there exists planet Endcom. Planet Endcom’s surface is covered by a great ocean dotted by many small islands.

  For this question, Endcom’s surface will be modeled as a 2D plane. There exist N islands scattered on this 2D plane. The ith island is located at (Xi,Yi).

  On this plane, line segments are defined in terms of islands. A line segment is bounded by two islands.

  An archipelago consists of two distinct but equal-length line segments which have one shared island endpoint and two distinct island endpoints. Archipelagos are considered distinct if they’re not made up of the same three islands.

  Your goal is to find out how many distinct archipelagos exist.

Input
  Input begins with an integer T, the number of the test cases in the file.
  For each test case there is an integer N. The following N lines contain the space separated integers Xi and ​Yi

Output
  Print a line containing the number of archipelagos in the ocean.

Constraints
  1 <= T <= 50    1 <= N <= 2,000   -10,000 <= Xi,Yi <= 10,000 

Sample Input and Outputs
  Sample Input:   Sample Output:
  1                      0
  3
  0 0
  0 1
  0 3
  
  
  Sample Input:   Sample Output:
  2                      4
  5                      4
  0 0
  0 1
  0 2
  0 3
  0 4
  4
  0 0
  1 0
  0 1
  -1 0
