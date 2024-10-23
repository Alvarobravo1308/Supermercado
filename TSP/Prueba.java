public class Prueba {
    public static void main(String[] args) {
        //Instancia de la clase modelo 1 Alvaro
        Modelo modelo1 = new Modelo();
        modelo1.setname("El modelo 7-S de McKinsey");
        modelo1.setautor("McKinsey & Company");
        modelo1.setdate("1980");
        modelo1.setstade("Implementación organizacional");
        modelo1.setdescription("El modelo de los 7S fue desarrollado por la consultora McKinsey y considera siete elementos interrelacionados que influyen en la efectividad de la organización:\n"
        + "1. Estrategia de cambio\n"
        + "2. Estructura de tu empresa\n"
        + "3. Sistemas y procesos empresariales\n"
        + "4. Valores y cultura de empresa compartidos\n"
        + "5. Estilo o forma de trabajar\n"
        + "6. Personal implicado\n"
        + "7. Competencias de tu personal");
        
        System.out.println("Info del Modelo 7-S de McKinsey:");
        System.out.println(modelo1.toString());
    
// Instancia de la clase Modelo 2
Modelo modelo2 = new Modelo();
modelo2.setname("Modelo de las Tres Etapas de Kurt Lewin");
modelo2.setdescription("Este es uno de los modelos más conocidos y simples para la gestión del cambio organizacional. Según Kurt Lewin, el cambio puede entenderse en tres etapas:\n"
+ "1. Descongelamiento: Implica crear la necesidad de cambio, rompiendo las viejas estructuras y comportamientos.\n"
+ "2. Cambio (Movimiento): Introducción y adopción de nuevos métodos, comportamientos o sistemas.\n"
+ "3. Recongelamiento: El nuevo estado o cambio se estabiliza y se integra en la organización para hacerlo sostenible.\n");
System.out.println("Info del Modelo de las Tres Etapas de Kurt Lewin:");
System.out.println(modelo2.toString());
// Instancia de la clase Modelo 3
Modelo modelo3 = new Modelo();
modelo3.setname("Modelo de Cambio de John Kotter");
modelo3.setdescription("John Kotter, profesor de la Harvard Business School, propuso un enfoque de ocho etapas para la gestión del cambio. Este modelo se centra en liderar el cambio de manera efectiva:\n"
+ "1. Crear un sentido de urgencia.\n"
+ "2. Formar una coalición poderosa.\n"
+ "3. Crear una visión para el cambio.\n"
+ "4. Comunicar la visión.\n"
+ "5. Eliminar los obstáculos.\n"
+ "6. Generar victorias a corto plazo.\n"
+ "7. Consolidar los logros y producir más cambio."
+ "8. Anclar los cambios en la cultura organizacional.");
System.out.println("Info del Modelo de Cambio de John Kotter:");
System.out.println(modelo3.toString());
// Instancia de la clase Modelo 4
Modelo newModelo4 = new Modelo();
newModelo4.setname("Modelo del empujon");
newModelo4.setdescription("De forma muy sencilla y siguiendo con el ejemplo de las bebidas azucaradas, una acción vinculada a una estrategia nudge sería eliminar estos productos de la zona media de los estantes evitando así que estén a la altura de los ojos de los individuos. O, por ejemplo, llevarlos a la segunda página de un ecommerce.\n" +
"En definitiva, la teoría del empujón no se basa en cambiar ni prohibir nada; simplemente pretende empujar a comprar lo fácil, pero también lo más adecuado a largo plazo.\n" +
"Realmente, esta teoría impregna muchas ideas que ya contemplamos de manera cotidiana. Por ejemplo, cuando encontramos una opción predeterminada en una compra, nos está marcando el camino fácil, un nudge. La famosa pegatina de una mosca en los urinarios públicos es otro pequeño empujón que busca guiar hacia un resultado limpio y satisfactorio al finalizar el uso del inodoro.\n" +
"En un entorno tan competitivo y complejo, es importante guiar a los consumidores de una forma correcta y responsable. Por ello, el planteamiento de la teoría del nudge consigue que sea más probable que una persona tome una decisión con un pequeño cambio en el entorno y con una implementación fácil y económica.\n");
System.out.println("Modelo del empujon");
System.out.println(newModelo4.toString());
 // Instancia de la clase Teoria 1
    Teoria teoria1 = new Teoria();
    teoria1.setname("Teoría de la U");
    teoria1.setautor("C. Otto Scharmer");
    teoria1.setdate("2007");
    teoria1.setstade("Desarrollo personal y organizacional");
    teoria1.setdescription("Es un método de desarrollo personal que se enfoca en fomentar la innovación y cambiar las empresas a través de una serie de herramientas que permiten conocerse a uno mismo.\n"
    + "Explica que según como hagamos frente a una determinada situación va a ser clave en el éxito en el que se vaya a desarrollar.\n"
    + "Muchas veces pensamos de forma negativa, interiorizando que no seremos capaces de hacer lo que nos proponemos.\n"
    + "Esto influye directamente en nuestra forma de actuar, enfocando la acción con la mentalidad de que no va a suceder.");
        
    System.out.println("Info de la Teoría de la U:");
    System.out.println(teoria1.toString());
    // Instancia de la clase Teoria 2
    Teoria teoria2 = new Teoria();
    teoria2.setname("Teoría del Campo de Fuerzas de Kurt Lewin");
    teoria2.setdescription("Esta teoría de Lewin sugiere que el cambio es el resultado de la interacción de dos fuerzas opuestas:\n"
    + "1. Fuerzas impulsoras: Factores que promueven el cambio.\n"
    + "2. Fuerzas restrictivas: Factores que obstaculizan o resisten el cambio.");
    
    System.out.println("Info de la Teoría del Campo de Fuerzas de Kurt Lewin:");
    System.out.println(teoria2.toString());
    // Instancia de la clase Teoria 3
    Teoria teoria3 = new Teoria();
    teoria3.setname("Teoría del Aprendizaje Organizacional de Senge");
    teoria3.setdescription("La teoría de Peter Senge propone que las organizaciones necesitan aprender continuamente para adaptarse y cambiar. Su enfoque se centra en la creación de organizaciones que fomentan el aprendizaje colectivo a través de cinco disciplinas:\n"
    + "1. Dominio personal.\n"
    + "2. Modelos mentales.\n"
    + "3. Visión compartida.\n"
    + "4. Aprendizaje en equipo.\n"
    + "5. Pensamiento sistémico.\n"
    + "6. Este enfoque está más relacionado con el cambio continuo y la mejora a largo plazo.");
    
    System.out.println("Info de la Teoría de la U:");
    System.out.println(teoria3.toString());
    //Crear la instancia de la teoria 4
Teoria newTeoria4 = new Teoria();
newTeoria4.setname("Liderazgo adaptativo");
newTeoria4.setdescription("Nació en los años 90 cuando los autores Marty Linsky y Ronald Heifetz abordaron una nueva manera de actuar.\n"
+ "1- Reflexión y correcció\n"
+ "2- Aceptación de la incertidumbre\n"
+ "3- Enfoque en experimentación y aprendizaje\n"
+ "4- Inteligencia emocional\n"
+ "5- Valoración de ralaciones y confianza\n"
+ "6- Apariencia y persistencia\n"
+ "7- Creación de propósito compartido");
System.out.println("Liderazgo adaptativo");
System.out.println(newTeoria4.toString());
    }
    }
    
    // Definición de la clase Teoria
    class Teoria {
        private String name;
        private String autor;
        private String date;
        private String stade;
        private String description;
        
        public String getname() {
            return name;
        }
        
        public void setname(String name) {
            this.name = name;
        }
        
        public String getautor() {
            return autor;
        }
        
        public void setautor(String autor) {
            this.autor = autor;
        }
    
        public String getdate() {
            return date;
        }
    
        public void setdate(String date) {
            this.date = date;
        }
    
        public String getstade() {
            return stade;
        }
    
        public void setstade(String stade) {
            this.stade = stade;
        }
        
        public String getdescription() {
            return description;
        }
        
        public void setdescription(String description) {
            this.description = description;
        }
        
        // Método toString para imprimir la información de la teoría
        @Override
        public String toString() {
            return "Nombre: " + this.name + "\nAutor: " + this.autor + "\nFecha: " + this.date + "\nEtapa: " + this.stade + "\nDescripción: " + this.description;
        }
    }
    
    // Definición de la clase Modelo
    class Modelo {
        private String name;
        private String autor;
        private String date;
        private String stade;
        private String description;
        
        public String getname() {
            return name;
        }
        
        public void setname(String name) {
            this.name = name;
        }
        
        public String getautor() {
            return autor;
        }
        
        public void setautor(String autor) {
            this.autor = autor;
        }
    
        public String getdate() {
            return date;
        }
    
        public void setdate(String date) {
            this.date = date;
        }
    
        public String getstade() {
            return stade;
        }
    
        public void setstade(String stade) {
            this.stade = stade;
        }
        
        public String getdescription() {
            return description;
        }
        
        public void setdescription(String description) {
            this.description = description;
        }
        
        // Método toString para imprimir la información del modelo
        @Override
        public String toString() {
            return "Nombre: " + this.name + "\nAutor: " + this.autor + "\nFecha: " + this.date + "\nEtapa: " + this.stade + "\nDescripción: " + this.description;
        }
    }