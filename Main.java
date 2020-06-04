public class Main {
    public static void main(String[]args){
      Nurse k =new Nurse();
      k.salary=80000;
      k.age=30;
      k.Grade="Bachelor";
      k.name="fatemeh";

      System.out.println(k.age);
      System.out.println(k.name);
      doctor f=new doctor();
      f.name="yaghoobi";
      f.salary=200000;
      f.Grade="takhassos";
      f.prescribe="Codeine";
      f.Diagnosis="Cancer";
      f.Requesttests="Cancer";
      System.out.println(f.Requesttests);
      System.out.println(f.Diagnosis);
      System.out.println(f.salary);
      Chairman A=new Chairman();
      A.name="amiri";
      A.Customersatisfaction="khob";
      A.HospitalFinancialSupervision="Excellent";
      A.Appointmentanddismissalofemployees="entesab modir";
      System.out.println(A.Appointmentanddismissalofemployees);
      System.out.println(A.HospitalFinancialSupervision);
      System.out.println(A.Customersatisfaction);
      System.out.println(A.name);
    }

}
