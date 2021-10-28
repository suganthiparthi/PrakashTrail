package org.phone;
//child class
public class PhoneInfo {
private void phoneName() {
System.out.println("honor");
}
private void phoneNum() {
System.out.println("0987654321");
}	
private void camera() {
System.out.println("single");
}	
private void storage() {
System.out.println("250gb");
}
private void osName() {
System.out.println("android");
}
public static void main(String[] args) {
PhoneInfo a = new PhoneInfo();
a.phoneName();
a.phoneNum();
a.camera();
a.storage();
a.osName();
}

}
