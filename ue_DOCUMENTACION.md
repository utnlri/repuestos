# UTN FRRO - Asignatura: DiseÃ±o de Sistemas.
## Proyecto: juguetes  
Objetivo: programar con Spring el caso Repuestos utilizado para clases DS en UTN 2019
Creado: [UTDC009 - LRI 11/8/19]

## Para ejecutar la aplicaciÃ³n Caso Juguetes [Local]
1. BotÃ³n derecho sobre RepuestosApplication.java \ Run as \ Java Application   
2. En chrome URL: http://localhost:8080/ --> Esto mapea al Menï¿½ pcial que corresponde al home.html 

## Ejecutar en Heroku [Web] 
URL de la APP: XXXXXXXXX  

## Bitï¿½cora proyecto repuestos
[11/8/19 LRI] Tareas realizadas:     
1. Creaciï¿½n del proyecto en Spring Initializr  
2. Creaciï¿½n del repositorio en GitHub --> https://github.com/utnlri/repuestos  
3. Import del proyecto en Eclipse y Push del resto de los files creados con Spring Initializr  
.   
Ver detalles en Evernote "UTDC009 - DS Spring 2019::Programar Caso Repuestos"  
4. CreaciÃ³n de:   
   + Home.html  
   + ControladorHome.java  --> Mapeando @RequestMapping("/")
   . 
[11/8/19 FIN]

[13/8/19 LRI]   
1. Se agregan a GitHub file .project (con esto al hacer Clone de URI del GitHub se resuelve el problema para que el Eclipse reconozca el proyecto como Mavem  y Java de forma automática)    
2. Se agregan a GitHub file .classpath copiadas del proyecto de RRHH   
3. Se agrega folder src/test/resources para evitar error que se producía en las VM de la facultad al ejecutar la aplicación   
4. Se corrige el home.html porque en el título tenía "Caso Juguetes" --> "Caso Repuestos"  
[13/8/19 FIN]

