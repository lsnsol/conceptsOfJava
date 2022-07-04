class Person implements Cloneable {
    private String name; 
    private int income; 
    private City city; 
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
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public Person(String firstName, int income, City city) {
        super();
        this.name = firstName;
        this.income = income;
        this.city = city;
    }
    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
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
        Person other = (Person) obj;
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

class City implements Cloneable {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public City(String name) {
        super();
        this.name = name;
    }
    public City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }
    @Override
    public String toString() {
        return "City [name=" + name + "]";
    }
   /* @Override
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
        City other = (City) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }*/
}

public class CloneDemo_ShallowCopy {
	public static void main(String[] args) throws Exception{
		 City city = new City("Dehradun");
	        Person person1 = new Person("Naresh", 10000, city);
	        System.out.println(person1);
	        Person person2 = person1.clone();
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
	        
	        City ct = person1.getCity();
	        
	        ct.setName("Mumbai");
	        
	        //observe that city name gets changed even for person2 object
	        System.out.println(person2.getCity().getName());
	}
}
