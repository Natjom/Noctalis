package natjom.noctalis;

public class ClientBloodMoon {
    private static boolean active = false;
    public static void setActive(boolean act) {
        active = act;
    }
    public static boolean isActive() {
        return active;
    }
}
