package problem_1;


import java.util.Scanner;

public class Program_1 
{

	public static void main(String[] args) 
	{
		int studentno;
		Scanner students = new Scanner(System.in);
		Scanner grade = new Scanner(System.in);
		
		System.out.println("Type in your how many students are in the class. Press Enter to Continue.");
		studentno = students.nextInt();
		float gradearray [] = new float [studentno];
		System.out.println("Type in the grade for each student. Press Enter to Continue.");
		for(int i = 0; i < studentno; i++)
		{
			gradearray[i] = grade.nextFloat();
		}
		int n = gradearray.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (gradearray[j] < gradearray[j+1]) 
                {  
                    float temp = gradearray[j]; 
                    gradearray[j] = gradearray[j+1]; 
                    gradearray[j+1] = temp; 
                }
        for (int i = 0; i < gradearray.length; i++) 
        {
        	if (gradearray[i] >= 96  && gradearray[i] <= 100)
			{
				System.out.print (gradearray[i] + " A+ ");
			}
			else if (gradearray[i] >= 90 && gradearray[i] <= 95.99) 
			{ 
				System.out.print (gradearray [i] + " A ");
			} 
			else if (gradearray[i] >= 87 && gradearray[i] <= 89.99) 
			{ 
				System.out.print (gradearray [i] + " A- ");
			} 
			else if (gradearray[i] >= 84 && gradearray[i] <= 86.99) 
			{ 
				System.out.print (gradearray [i] + " B+ ");
			}
			else if (gradearray[i] >= 80 && gradearray[i] <= 83.99) 
			{ 
				System.out.print (gradearray [i] + " B ");
			}
			else if (gradearray[i] >= 77 && gradearray[i] <= 79.99) 
			{ 
				System.out.print (gradearray [i] + " B- ");
			}
			else if (gradearray[i] >= 74 && gradearray[i] <= 76.99) 
			{ 
				System.out.print (gradearray [i] + " C+ ");
			}
			else if (gradearray[i] >= 70 && gradearray[i] <= 73.99) 
			{ 
				System.out.print (gradearray [i] + " C ");
			}
			else if (gradearray[i] >= 67 && gradearray[i] <= 69.99) 
			{ 
				System.out.print (gradearray [i] + " C- ");
			}
			else if (gradearray[i] >= 64 && gradearray[i] <= 66.99) 
			{ 
				System.out.print (gradearray [i] + " D+ ");
			}
			else if (gradearray[i] >= 60 && gradearray[i] <= 63.99) 
			{ 
				System.out.print (gradearray [i] + " D ");
			}
			else if (gradearray[i] >= 50 && gradearray[i] <= 59.99) 
			{ 
				System.out.print (gradearray [i] + " D- ");
			}
			else if (gradearray[i] < 50) 
			{ 
				System.out.print (gradearray [i] + " F ");
			}
        }
		students.close();
		grade.close();
	}
}
