public class diningPhilosophers {
	
	private int n; 
	int state [n]; //define semaphores
	semaphore s[n]; //1 semaphore per philosopher
	semaphore mutex = 1; 

	static void philosophers (int k){
		while(TRUE){
			thinking();			//philosopher is thinking
			get_forks(k);		//wait for forks 	
			eating();			//philosopher is eating 
			put_forks(k);		//release forks 
		}
		
	static void get_forks (int i){
		wait (mutex);			//enter critical region 
		state[k] = hungry ; 
		check[k];				//try to acquire 2 forks 
		signal (mutex);			//exit critical region 
		wait (semaphore);		//wait if forks were not acquired 
	}

	static void put_forks (int k){
		wait(mutex);			//enter critical region 
		state[k] = thinking;	//philosopher has finished eating 
		check (LEFT);			//check left neighbour 
		check (RIGHT);			//check right neighbour	
		signal (mutex);			//exit critical region 
	}

	static void check (int k){
		if (state [k] == hungry && state[LEFT] != eating && state[RIGHT] != eating){
			state [k] = eating;
			signal(semaphore);
		}
	}

	public static void main (String [] args){
		diningPhilosophers.check(); 
	}
}
	
	