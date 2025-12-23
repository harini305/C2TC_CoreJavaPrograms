 package com.tnsif.oopsconcept;

public class EncapsulationDemo {

	        private String name;
			private int age;
			private int jersyNo;
			private String team;
			
			
			
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

			public int getJersyNo() {
				return jersyNo;
			}

			public void setJersyNo(int jersyNo) {
				this.jersyNo = jersyNo;
			}
			public String getteam() {
				return team;
			}
			
			public void setteam(String team) {
				this.team = team;
			}

			@Override
			public String toString() {
				return "EncapsulationDemo [name=" + name + ", age=" + age + ", jersyNo=" + jersyNo + "]";
			
			

			
			
			
		

	}

}

