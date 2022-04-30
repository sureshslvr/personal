package Collections;

public class Student {
		private Integer Rno;
		String Fname;
		String Lname;
		private Integer phno;
		
		public Student(Integer rno, String fname, String lname, Integer phno) {
			super();
			Rno = rno;
			Fname = fname;
			Lname = lname;
			this.phno = phno;
		}
		/**
		 * @return the rno
		 */
		public Integer getRno() {
			return Rno;
		}
		/**
		 * @param rno the rno to set
		 */
		public void setRno(Integer rno) {
			Rno = rno;
		}
		/**
		 * @return the phno
		 */
		public Integer getPhno() {
			return phno;
		}
		/**
		 * @param phno the phno to set
		 */
		public void setPhno(Integer phno) {
			this.phno = phno;
		}
		@Override
		public String toString() {
			return "Student [ "+Rno + ", " + Fname + " " + Lname + ", " + phno + "]";
		}
		
		
		
		
		
}
