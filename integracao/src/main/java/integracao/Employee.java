package integracao;

public class Employee {
    private int age;

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//public Employee(int age) {
    //    this.age = age;
   // }

    public boolean isHirable() {
        if (age < 16) {
            return false;
        } else if (age >= 16 && age <= 18) {
            return true; // contratada estágio
        } else if (age >= 19 && age <= 55) {
            return true; // contratada full-time
        } else {
            return false;
        }
    }
}