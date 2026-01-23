package PredictRoadMaps;

interface DataAnalyst{
    default void desDA(){  //only default and private
        System.out.println("Data Analyst: Analyzes data to generate insights and support business decisions.");
    }

    void path_of_DA();
}

interface WebDevelopment{
    default void desWD(){
        System.out.println("Web Developer: Builds, maintains, and deploys responsive websites and web applications.");
    }
    void path_of_WD();
}

interface AppDevelopment{
    default void desAD(){
        System.out.println("App Developer: Designs and develops mobile applications with backend integration.");
    }
    void path_of_AD();
}