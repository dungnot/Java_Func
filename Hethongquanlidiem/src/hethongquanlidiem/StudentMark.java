
package hethongquanlidiem;


public class StudentMark implements IStudentMark {
    String Fullname;
    int ID;
    String ClassRoom;
    int Semester;
    float AverageMark;

    public String getFullname() {
        return Fullname;
    }

    public int getID() {
        return ID;
    }

    public String getClassRoom() {
        return ClassRoom;
    }

    public int getSemester() {
        return Semester;
    }

    public float getAverageMark() {
        return AverageMark;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setClassRoom(String ClassRoom) {
        this.ClassRoom = ClassRoom;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    @Override
    public void display() {
        System.out.println("FullName: " +Fullname);
        System.out.println("ID: " +ID);
        System.out.println("ClassRoom: " +ClassRoom);
        System.out.println("Semester: " +Semester );
        System.out.println("Avarage: " +AverageMark);
    }
    
    int[] SubjectMarkList = new int[5];
     void AveCal(){
         for(int i: SubjectMarkList){
             AverageMark += i;
         }
         AverageMark/=SubjectMarkList.length;
     }
    
    
}
