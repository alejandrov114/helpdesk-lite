# helpdesk-lite
Repositorio creado para el proyecto de Programación Orientada a Objetos 2025-1

# 🎟️ Ticketera con Roles en Java

Este proyecto es una aplicación de escritorio desarrollada en Java utilizando Swing, que permite registrar, visualizar y gestionar solicitudes de soporte técnico (tickets). Fue creado como proyecto final para la materia **Programación Orientada a Objetos** en la carrera de Ingeniería Informática.

---

## 🧾 Descripción del Proyecto

La aplicación permite a los usuarios crear tickets para reportar problemas técnicos, visualizar el estado de sus solicitudes y cambiar el estado de los tickets existentes. Incluye la funcionalidad de manejo de **roles de usuario** (Cliente y Administrador), lo que permite aplicar herencia, abstracción y polimorfismo de forma práctica.

El foco está puesto en el uso de los principios de Programación Orientada a Objetos (POO) y el uso de interfaces gráficas con Swing.

---

## ✅ Requisitos Funcionales

- **RF01 - Inicio de sesión con rol**  
  Al iniciar la aplicación, el usuario podrá elegir si accede como **Cliente** o **Administrador**.

- **RF02 - Registro de ticket (Cliente)**  
  Los usuarios con rol Cliente pueden crear tickets ingresando:
  - Nombre
  - Correo electrónico
  - Descripción del problema
  - Prioridad (Baja, Media, Alta)

- **RF03 - Visualización de tickets**  
  - El Cliente solo puede ver los tickets que ha creado.
  - El Administrador puede ver todos los tickets.

- **RF04 - Actualización de estado (Administrador)**  
  Solo los Administradores pueden cambiar el estado de un ticket (Abierto, En proceso, Cerrado).

- **RF05 - Búsqueda de tickets**  
  Permite buscar tickets por nombre, estado o prioridad (solo disponible para Administrador).

- **RF06 - Guardado persistente (opcional)**  
  Los tickets se pueden guardar en un archivo local para mantener la información entre sesiones.

---

## 🔒 Requisitos No Funcionales

- **RNF01 - Interfaz amigable**  
  La interfaz debe ser clara, sencilla y funcional, desarrollada con Java Swing.

- **RNF02 - Modularidad**  
  El sistema debe respetar los principios de la programación orientada a objetos: encapsulamiento, herencia, polimorfismo y abstracción.

- **RNF03 - Código comentado**  
  El código debe estar debidamente comentado para facilitar su comprensión y mantenimiento.

- **RNF04 - Rendimiento aceptable**  
  Las operaciones deben ejecutarse sin retardos notables para el usuario.

- **RNF05 - Portabilidad**  
  La aplicación debe poder ejecutarse en cualquier sistema con Java instalado (Windows, Linux, etc.).

---

## 📦 Clases

### 🎫 Modelo de Ticket
- `Ticket`  
  Representa un ticket de soporte.  
  Atributos: `id`, `nombre`, `email`, `descripcion`, `prioridad`, `estado`  
  Métodos: getters/setters, `toString()`

- `TicketManager`  
  Gestiona la lista de tickets (crear, listar, buscar, actualizar).

### 👤 Modelo de Usuario
- `Usuario` (clase abstracta)  
  Atributos comunes: `nombreUsuario`, `correo`  
  Métodos: `verTickets()`, `crearTicket()`, etc. (abstractos o concretos según corresponda)

- `Cliente` (hereda de `Usuario`)  
  Solo puede crear y ver sus propios tickets.

- `Administrador` (hereda de `Usuario`)  
  Puede ver todos los tickets, cambiar su estado y buscar por criterios avanzados.

### 💻 Interfaz gráfica
- `MainWindow`  
  Ventana principal con menú según el tipo de usuario.

- `LoginWindow`  
  Pantalla para elegir el tipo de usuario (Cliente o Administrador).

- `TicketForm`  
  Formulario para agregar nuevos tickets.

- `TicketTablePanel`  
  Panel con tabla para mostrar y seleccionar tickets.


---

## 🛠️ Tecnologías utilizadas

- Java 8+
- Swing (para la interfaz gráfica)
- IDE:IntelliJ IDEA

---

## 👨‍💻 Autores

Alejandro Villa Osorio
Juan José Toro
Juan Manuel Correa

![image](https://github.com/user-attachments/assets/eff1cc44-6c25-49d7-bac5-b3274c1aaa69)


