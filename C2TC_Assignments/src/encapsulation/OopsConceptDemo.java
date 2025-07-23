package encapsulation;

public class OopsConceptDemo {
int Serialnum;
String name;
int age;
public int getSerialnum() {
	return Serialnum;
}
public void setSerialnum(int serialnum) {
	Serialnum = serialnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "OopsConceptDemo [Serialnum=" + Serialnum + ", name=" + name + ", age=" + age + "]";
}

}
