package jp.canetrash.sample.activeobjects;

import java.sql.Types;

import net.java.ao.Entity;
import net.java.ao.ManyToMany;
import net.java.ao.schema.SQLType;

public interface Person extends Entity {
    public String getName();

    public void setName(String name);

    public int getAge();

    public void setAge(int age);

    @SQLType(Types.CLOB)
    public String getComment();

    @SQLType(Types.CLOB)
    public void setComment(String comment);

    public Family getFamily();

    public void setFamily(Family family);

    @ManyToMany(PersonToPerson.class)
    public Person[] getPeople();
}
