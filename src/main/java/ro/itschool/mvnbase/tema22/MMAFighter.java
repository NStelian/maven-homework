package ro.itschool.mvnbase.tema22;

import java.util.Objects;

public class MMAFighter {
    private final String name;
    private final int stamina;
    private final int fightSkill;

    public MMAFighter(String name, int stamina, int fightSkill) {
        this.name = name;
        this.stamina = stamina;
        this.fightSkill = fightSkill;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public int getFightSkill() {
        return fightSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MMAFighter that = (MMAFighter) o;
        return stamina == that.stamina &&
                fightSkill == that.fightSkill &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stamina, fightSkill);
    }

    @Override
    public String toString() {
        return "MMAFighter{" +
                "name='" + name + '\'' +
                ", stamina=" + stamina +
                ", fightSkill=" + fightSkill +
                '}';
    }
}
