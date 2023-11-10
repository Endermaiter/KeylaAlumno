public class Alumno {

    private String nombre;
    private float notaBD;
    private float notaCOD;
    private float notaProg;
    private float notaXML;
    private float notaFOL;
    private float notaSI;

    public Alumno() {
    }

    public Alumno(String nombre, float notaBD, float notaCOD, float notaProg, float notaXML, float notaFOL, float notaSI) {
        this.nombre = nombre;
        this.notaBD = notaBD;
        this.notaCOD = notaCOD;
        this.notaProg = notaProg;
        this.notaXML = notaXML;
        this.notaFOL = notaFOL;
        this.notaSI = notaSI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotaBD() {
        return notaBD;
    }

    public void setNotaBD(float notaBD) {
        this.notaBD = notaBD;
    }

    public float getNotaCOD() {
        return notaCOD;
    }

    public void setNotaCOD(float notaCOD) {
        this.notaCOD = notaCOD;
    }

    public float getNotaProg() {
        return notaProg;
    }

    public void setNotaProg(float notaProg) {
        this.notaProg = notaProg;
    }

    public float getNotaXML() {
        return notaXML;
    }

    public void setNotaXML(float notaXML) {
        this.notaXML = notaXML;
    }

    public float getNotaFOL() {
        return notaFOL;
    }

    public void setNotaFOL(float notaFOL) {
        this.notaFOL = notaFOL;
    }

    public float getNotaSI() {
        return notaSI;
    }

    public void setNotaSI(float notaSI) {
        this.notaSI = notaSI;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notaBD=" + notaBD +
                ", notaCOD=" + notaCOD +
                ", notaProg=" + notaProg +
                ", notaXML=" + notaXML +
                ", notaFOL=" + notaFOL +
                ", notaSI=" + notaSI +
                '}';
    }
}
