class Student
{
    int rollno;
    String name;
    int marks;
}


public class priklad {
   
    public static void main(String a[])
    {
        Student s1 = new Student();
        s1.rollno=1;
        s1.name="Vít";
        s1.marks=88;

        Student s2 = new Student();
        s2.rollno=2;
        s2.name="Ondřej";
        s2.marks=67;

        Student s3 = new Student();
        s3.rollno=3;
        s3.name="Hanz";
        s3.marks=97;

        Student students[]= new Student [3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + ":"+ students[i].marks);
        }
        
       /* Nebo se dá použít i toto pro print  
       for(Student stud:students)
        {
            System.out.println(stud.name + ":" + stud.marks)
        }*/
        
        
        /*int nums[]= new int [4];
        nums[1]=4;
        nums[2]=8;
        nums[3]=3;
        nums[4]=9;

        for (int i=0;i<nums.lenght;i++)
            {
                System.out.println(nums[i]);
            }
                
                Nebo se dá použít jednodušší varianta pro printnutí všech čísel

        for (int n: nums)
        {
            System.out.println(n);
        }
            

            
            
        */

    }


}
