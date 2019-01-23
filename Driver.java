import java.util.*;
//By using two different stacks you can create a queue as seen in my program
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver new_instance = new Driver();
		
		new_instance.run();
	}
	private static void run() {
	
	String raw_input = "4 6 2 3 8 9";
	
	String[] integerStrings = raw_input.split(" "); 
	
	int[] integers = new int[integerStrings.length]; 
	
	for (int i = 0; i < integers.length; i++)
	    integers[i] = Integer.parseInt(integerStrings[i]); 
	
	Deque<Integer> firstPass = new ArrayDeque<Integer>();
	
	Deque<Integer> secondPass= new ArrayDeque<Integer>();
	
	ArrayList<Integer> decoded_output = new ArrayList();
	
	
	for (int i = 0; i < integers.length; i++)
		firstPass.push(integers[i]);
	
	for (int i = 0; i < integers.length; i++)
		secondPass.push(firstPass.pop());
	
	for (int i = 0; i < integers.length; i++) 
		 decoded_output.add(secondPass.pop());
	
	System.out.print("Enter a series of integers, separated by spaces: ");
	
	for(int i = 0; i < integers.length; i++) 
		 System.out.print(decoded_output.get(i)+" ");
	
	System.out.println();
	
	for(int i = 0; i < integers.length; i++) 
		 System.out.println(decoded_output.get(i)+" ");
	
	
	
	
	}
}
//__       __  __    __                __                  __  __           _____                                         
///  \     /  |/  |  /  |              /  |                /  |/  |         /     |                                        
//$$  \   /$$ |$$/  _$$ |_     _______ $$ |____    ______  $$ |$$ |         $$$$$ |  ______   _______    ______    _______ 
//$$$  \ /$$$ |/  |/ $$   |   /       |$$      \  /      \ $$ |$$ |            $$ | /      \ /       \  /      \  /       |
//$$$$  /$$$$ |$$ |$$$$$$/   /$$$$$$$/ $$$$$$$  |/$$$$$$  |$$ |$$ |       __   $$ |/$$$$$$  |$$$$$$$  |/$$$$$$  |/$$$$$$$/ 
//$$ $$ $$/$$ |$$ |  $$ | __ $$ |      $$ |  $$ |$$    $$ |$$ |$$ |      /  |  $$ |$$ |  $$ |$$ |  $$ |$$    $$ |$$      \ 
//$$ |$$$/ $$ |$$ |  $$ |/  |$$ \_____ $$ |  $$ |$$$$$$$$/ $$ |$$ |      $$ \__$$ |$$ \__$$ |$$ |  $$ |$$$$$$$$/  $$$$$$  |
//$$ | $/  $$ |$$ |  $$  $$/ $$       |$$ |  $$ |$$       |$$ |$$ |      $$    $$/ $$    $$/ $$ |  $$ |$$       |/     $$/ 
//$$/      $$/ $$/    $$$$/   $$$$$$$/ $$/   $$/  $$$$$$$/ $$/ $$/        $$$$$$/   $$$$$$/  $$/   $$/  $$$$$$$/ $$$$$$$/

