package PredictRoadMaps;
import java.util.Scanner;
class AddLogic implements DataAnalyst,WebDevelopment,AppDevelopment{
    public void path_of_DA(){
        System.out.println("1.Statistics Basics\n2.Excel & Spreadsheets\n3.SQL & Databases\n4.ython / R\n5.Data Cleaning\n6.Data Visualization\n7.Dashboard Tools (Power BI / Tableau)\n8.Business Insights");
    }

    public void path_of_WD(){
        System.out.println("1.HTML Basics\n2.CSS & Responsive Design\n3.JavaScript Fundamentals\n4.Frontend Frameworks (React / Angular)\n5.Backend (Node / PHP / Java)\n6.Database (MySQL / MongoDB)\n7.Authentication & APIs\n8.Deployment & Hosting");
    }

    public void path_of_AD(){
        System.out.println("1.Programming Basics\n2.UI/UX Design\n3.Android (Java / Kotlin)\n4.iOS (Swift)\n5.Cross-Platform (Flutter / React Native)\n6.APIs & Backend\n7.Testing\n8.App Store Deployment");
    }
}

class PredictRoadMapCondition{
    public String s;
    public void PredictRoadMapCon(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter field: ");
        s = sc.nextLine().toUpperCase();

        if(s.equals("DATA ANALYST")){
            DataAnalyst obj = new AddLogic();
            obj.desDA();
            obj.path_of_DA();
        }
        else if(s.equals("WEB DEVELOPMENT")){
            WebDevelopment obj2 = new AddLogic();
            obj2.desWD();
            obj2.path_of_WD();
        }
        else if(s.equals("APP DEVELOPMENT")){
            AppDevelopment obj3 = new AddLogic();
            obj3.desAD();
            obj3.path_of_AD();
        }
    }
    
}
