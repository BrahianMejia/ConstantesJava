package main;

public enum Mensajes
{
    PETICION_RADIO("Ingresa el radio del círuculo: "),
    MENSAJE_RESPUESTA("El area del círculo es: ");

    private String mensaje;

    Mensajes(String s)
    {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
