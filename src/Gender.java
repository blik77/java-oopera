public enum Gender {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        switch (this) {
            case MALE:
                return "мужчина";
            case FEMALE:
                return "женщина";
            default:
                return null;
        }
    }
}
