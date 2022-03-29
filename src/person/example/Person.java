package person.example;

public class Person {

	String name;
	int age;
	Address address;
	Person tenant;
	
	
	
	
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




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public Person getTenant() {
		return tenant;
	}




	public void setTenant(Person tenant) {
		this.tenant = tenant;
	}




	public static void main(String args[]){
		Person owner = new Person();
		owner.setAge(30);
		owner.setName("Andrew");
		
		Address owneraddress = new Address();
		owneraddress.setFno(101);
		owneraddress.setStreetname("aderman");
	
		
		Person tenant = new Person();
		tenant.setAge(32);
		tenant.setName("peter");
		
		
		owner.setAddress(owneraddress);
		owner.setTenant(tenant);
		
		System.out.println("print owner details");
		System.out.println(owner+"===="+owner.getAge()+"--"+owner.getName());
		System.out.println(owner.getAddress().getFno()+"--"+owner.getAddress().getStreetname());
		System.out.println(owner.getTenant().getName()+"--"+owner.getTenant().getAge());
		
	}
}
