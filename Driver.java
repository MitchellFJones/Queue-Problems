import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;
//I G E T F I V E E X T R A P O I N T S 
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver new_instance = new Driver();
		
		new_instance.run();
	}
	
	private static void run(){
		
		String input = "O L F * I * T S R * * * N I * * * T A * S * * * T U * *"; 
		
		decodeString(input);
			
	}
	public static void decodeString(String _input) {
		
		char[] encoded_input = _input.toCharArray();
		
		ArrayList<Character> decoded_output = new ArrayList();
		
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(int i = 0; i < _input.length(); i++) {
			
			if(encoded_input[i] != ' ') {
				
				if(encoded_input[i] != '*') {
					
					stack.push(encoded_input[i]);
					
				}
				else if(encoded_input[i] == '*') {
					
					decoded_output.add(stack.pop());
					
					
				}
				
			}
		}
		for (int i=0; i<decoded_output.size(); i++) 
            System.out.print(decoded_output.get(i)+" ");
		
		
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
