public class doctor extends Employee {
    @Override
    public void Lunchtime() {
        System.out.println();
    }
    public String prescribe;
    public String Diagnosis;
    public String Requesttests;

    public String getPrescribe(){
        return prescribe;
    }
    public void setPrescribe(String prescribe){
        this.prescribe=prescribe;
    }
    public String getDiagnosis(){
        return getDiagnosis();
    }
    public void setDiagnosis(String diagnosis){
        this.Diagnosis=diagnosis;
    }
    public String getRequesttests(){
        return getRequesttests();
    }
    public void setRequesttests(String requesttests){
        this.Requesttests=requesttests;
    }
}
