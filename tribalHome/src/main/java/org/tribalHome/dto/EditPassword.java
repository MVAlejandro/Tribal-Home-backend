package org.tribalHome.dto;

public class EditPassword {
    private String currentPassword; // Contraseña actual
    private String newPassword; // Nueva contraseña

    // Constructor vacío
    public EditPassword() {}

    // Constructor con parámetros
    public EditPassword(String currentPassword, String newPassword) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }

    // Getters y Setters
    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "EditPassword [currentPassword=" + currentPassword + ", newPassword=" + newPassword + "]";
    }
}
