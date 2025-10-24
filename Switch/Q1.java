class Q1{
    public static void main(String[] args) {
        //Write a program to print the meaning of a specific color in a trafic light 
        //input = red output = stop || input = blue output = no such color is present in trafic lights

        String a="red";
        switch(a){
            case "red"->System.out.println("Stop");
            case "blue"->System.out.println("Go");
            case "yellow"->System.out.println("Go Slow");
            default->System.out.println("No such color is present in trafic lights");
        }
        }
    
}

