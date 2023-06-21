package oop;

public class Alumno {
// atributos: son las caracteristicas________________________________________________________________________________

    private String nombre;
    private int edad;
    private String carrera;

// En Java, la palabra clave "private" es un modificador de acceso que se utiliza para restringir el acceso a miembros
// (atributos y métodos) de una clase. Cuando un miembro de clase se declara como "private", solo se puede acceder a él
// desde dentro de la misma clase. Otros objetos o clases externas no tienen acceso directo a ese miembro.
// Esto significa que solo se puede acceder a estos atributos desde dentro de la clase "Alumno" misma. No se puede
// acceder directamente a ellos desde otras clases. Sin embargo, aún es posible acceder a estos atributos utilizando
// los métodos de acceso (getters) y de modificación (setters) proporcionados en la clase.
// //El uso de modificadores de acceso como "private" es una práctica común en la programación orientada a objetos para
// encapsular y proteger los datos de una clase. Al restringir el acceso directo a los atributos, se promueve el
// principio de ocultamiento de información y se fomenta el acceso controlado a través de métodos específicos.
// Esto ayuda a mantener la integridad de los datos y facilita el mantenimiento y la evolución del código.

//__________________________________________________________________________________________________________________

// constructor: El constructor es un método especial de la clase que se llama automáticamente al crear un nuevo objeto
// de esa clase. En este caso, el constructor de la clase "Alumno" recibe tres parámetros: "nombre" de tipo String,
// "edad" de tipo int y "carrera" de tipo String.
//Cuando creas un nuevo objeto "Alumno" utilizando el constructor, puedes pasar los valores deseados para inicializar
// los atributos.

    public Alumno(String nombre, int edad ,String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;

    }
//__________________________________________________________________________________________________________________
// metodos de acceso;métodos de acceso (getters) y de modificación (setters) para los atributos
//
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    //________________________________________________________________________________________________________________
// metodos
    public void estudiar(){
        System.out.println(nombre + "esta estudiando ");
    }
    public void matricularse(String curso){
        System.out.println(nombre + " se ha matriculado en el curso de " + curso);
    }

//_______________________________metodo main_____________________________________________________________________

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("jirman",42,"ingenieria electrica");
        System.out.println("nombre: " +alumno1.getNombre());
        System.out.println("edad: " + alumno1.getEdad());
        System.out.println("carrera :" + alumno1.getCarrera());
        alumno1.estudiar();
        alumno1.matricularse("electronica");
        alumno1.setNombre("carlos");
        alumno1.matricularse("sistemas de potencia ");
    }
}






