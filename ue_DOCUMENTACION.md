# UTN FRRO - Asignatura: Diseño de Sistemas.
## Proyecto: juguetes  
Objetivo: programar con Spring el caso Repuestos utilizado para clases DS en UTN 2019
Creado: [UTDC009 - LRI 11/8/19]

## Para ejecutar la aplicación Caso Juguetes [Local]
1. Botón derecho sobre RepuestosApplication.java \ Run as \ Java Application   
2. En chrome URL: http://localhost:8080/ --> Esto mapea al Men� pcial que corresponde al home.html 

## Ejecutar en Heroku [Web] 
URL de la APP: https://dsapprepuestos.herokuapp.com/  

## Bit�cora proyecto repuestos
[11/8/19 LRI] Tareas realizadas:     
1. Creaci�n del proyecto en Spring Initializr  
2. Creaci�n del repositorio en GitHub --> https://github.com/utnlri/repuestos  
3. Import del proyecto en Eclipse y Push del resto de los files creados con Spring Initializr  
.   
Ver detalles en Evernote "UTDC009 - DS Spring 2019::Programar Caso Repuestos"  
4. Creación de:   
   + Home.html  
   + ControladorHome.java  --> Mapeando @RequestMapping("/")
   . 
[11/8/19 FIN]

[13/8/19 LRI]   
1. Se agregan a GitHub file .project (con esto al hacer Clone de URI del GitHub se resuelve el problema para que el Eclipse reconozca el proyecto como Mavem  y Java de forma autom�tica)    
2. Se agregan a GitHub file .classpath copiadas del proyecto de RRHH   
3. Se agrega folder src/test/resources para evitar error que se produc�a en las VM de la facultad al ejecutar la aplicaci�n   
4. Se corrige el home.html porque en el t�tulo ten�a "Caso Juguetes" --> "Caso Repuestos"  
[13/8/19 FIN]

[8/9/19 LRI]
1. Se agrega sufijo "[NO IMPLEMENTADO AÚN]" en opciones de menú que aún no están operativas
2. Se agreagan comentarios de cabacera a las clases que ya estaban creadas desde el 11/8/19
3. Se detectó que al inicializar la App Spring no está considerando los RequestMapping (SIN RESOLVER) --> se volvieron atrás los cambios de
ejemplosProgramación (ya que se pasaron al caso Juguetes)
[8/9/19 FIN]

