package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_problem {
	public static int Solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum = 0;
		Queue<Integer> Waiting_truck = new LinkedList<>();
		Queue<Integer> bridge = new LinkedList<>();
		
		for(int i = 0; i < truck_weights.length; i++) {
			Waiting_truck.offer(truck_weights[i]);
		}
		
		while(!Waiting_truck.isEmpty()) {
			if(bridge.size() < bridge_length) {
				if(sum + Waiting_truck.peek() <= weight) {
					sum += Waiting_truck.peek();
					bridge.add(Waiting_truck.poll());
					answer++;
			    }else {
			    	answer += (bridge_length - bridge.size());
					sum -= bridge.poll();
					if(sum + Waiting_truck.peek() <= weight) {
						sum += Waiting_truck.peek();
						bridge.add(Waiting_truck.poll());
					}
					answer++;
			    }
			}
			else{
				sum -= bridge.poll();
				answer += (bridge_length - bridge.size());
			}
			
		}
		
		if(!bridge.isEmpty()) {
			if(Waiting_truck.isEmpty()) {
				answer += (bridge_length - bridge.size());
				while(!bridge.isEmpty()) {
					bridge.poll();
					answer++;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 10;
		int[] c = {7, 4, 5, 6};
		
		System.out.println(Solution(a, b, c));

	}

}
