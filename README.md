# TareaUnsolid
## Integrantes de Grupo: 
- Felipe Alejandro Mendoza Navarrete 
- Diego Andrés Ávila Colmenares

## Principios SOLID vulnerados:
#### Responsabilidad única:
El primer principio que no se cumple es el de responsabilidad única, pues la clase de EmployeeManager realiza muchos métodos que no están directamente relacionados, es decir, no se dedican a una sola cosa. Es por esto por lo que se decidió eliminar el método de calcular salario (Porque para esto ya tenemos una clase) y el método de salvar el documento, pues consideramos que es redundante, pues al quitar o añadir un empleado, este documento ya se debe guardar y si se quiere revisar para esto están los reportes. 
Adicionalmente, la clase de reportGenerator también incumple con ese principio porque realiza métodos para diferentes formatos, se decidió realizar una interfaz llamada reporte y dos clases que realicen el reporte en el formato necesario, esto también permite mejorar el principio de abierto/cerrado, facilitando añadir nuevos formatos.
#### Abierto/cerrado::
El principio de abierto/cerrado no se cumple, como se dijo anteriormente, en la clase de reportGenerator (En donde no permitía extensiones, pero al realizar lo descrito en la parte superior, se solucionó) y además, en la clase de Employee y PartTimeEmployee, pues no permite añadir nuevos tipos de empleados. Para esto se cambió la clase Employee a interfaz y se crearon dos clases, cada una por el tipo de empleado que se conoce, esto con el sin de facilitar nuevas clases cuando se tengan.
#### Sustitución de Liskov:
El principio de sustitución de Liskov, en la clase PartTimeEmployee, se violaba, pues era subclase de Employee pero no se comportaba como esto, pues solo sobrescribía un método e igual este generaba de una vez una excepción. 
Se solucionó con la creación de la interfaz Employee, de la cual sobrescribe ahora todos los métodos.
En la clase SalaryCalculator, se modificó su método para demostrar Liskov, recibiendo cualquier objeto Employee (Padres por hijos).
#### Segregación de interfaces:
El principio de segregación de interfaces se violaba en la clase EmployeeOperations, pues era una interfaz que no era especifica y contenía métodos que no tenían relación entre ellos. Esta se eliminó, pues al corregir el principio, solo EmployeeManager realizaba las mismas acciones y no se necesitaba crear otra clase con esas mismas funcionalidad.
#### Inversión dependencias
Finalmente, el principio de inversión dependencias estaba violado por la clase de ReportGenerator, pues esta generaba dependencia de una sola clase de bajo nivel. Se realizo una interfaz Report y clases para cada uno de los formatos, para poder solucionar este principio.
#### Conclusión:
En este repositorio encontrará nuestra solución para tener un código que cumpla con los principios SOLID y que siga teniendo la misma funcionalidad.

