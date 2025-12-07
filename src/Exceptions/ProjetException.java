package Exceptions;

public sealed abstract class ProjetException extends Exception 
    permits ParametreInvalideException, RessourceNonTrouveeException {
    
    public ProjetException(String message) {
        super(message);
    }
}