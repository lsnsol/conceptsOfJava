class Person1 implements Cloneable {
    private String name; 
    private int income; 
    private City1 city; 
    public String getName() {
        return name;
    }
    public void setName(String firstName) {
        this.name = firstName;
    }
    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }
    public City1 getCity() {
        return city;
    }
    public void setCity(City1 city) {
        this.city = city;
    }
    public Person1(String firstName, int income, City1 city) {
        super();
        this.name = firstName;
        this.income = income;
        this.city = city;
    }
    @Override
    public Person1 clone() throws CloneNotSupportedException {
        Person1 clonedObj = (Person1) super.clone();
        clonedObj.city = this.city.clone();
        return clonedObj;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", city=" + city + "]";
    }
   /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + income;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person1 other = (Person1) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (income != other.income)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }*/
}

class City1 implements Cloneable {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public City1(String name) {
        super();
        this.name = name;
    }
    public City1 clone() throws CloneNotSupportedException {
        return (City1) super.clone();
    }
    @Override
    public String toString() {
        return "City [name=" + name + "]";
    }
    /*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        City1 other = (City1) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }*/
}

public class CloneDemo_DeepCopy {
	 public static void main(String[] args) throws CloneNotSupportedException {
	        City1 city = new City1("Dehradun");
	        Person1 person1 = new Person1("Naresh", 10000, city);
	        System.out.println(person1);
	        Person1 person2 = person1.clone();
	        System.out.println(person2);
	        if (person1 == person2) {
	            System.out.println("Both person1 and person2 holds same object");
	        }
	        if (person1.equals(person2)) {
	            System.out.println("But both person1 and person2 are equal and have same content");
	        }
	        if (person1.getCity() == person2.getCity()) {
	            System.out.println("Both person1 and person2 have same city object");
	        }

	        city.setName("Pune");
	        System.out.println(person1);
	        System.out.println(person2);
	    }
}
