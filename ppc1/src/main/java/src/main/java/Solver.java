package src.main.java;

/**
 * Method for solving optimal solutions
 * @param Cap_Labor - Input of Labor Capacity
 * @param Cap_Grape - Input of Grape Capacity
 * @param Prc_Rose - Price of Rose
 * @param Prc_Noir - Price of Noir
 * @return int[] - integer array of [OptRose , OptNoir , MaxRevenue]
 */
public class Solver {
	//return OptRose , OptNoir and max revenue in array in order
	public static int[] Solve_linear(int Cap_Labor, int Cap_Grape, double Prc_Rose, double Prc_Noir) {
		int[] output = {0,0,0};
		double max_revenue = 0;
		for (int temp_rose = 0; ; temp_rose++ ) {
    		if (temp_rose * 5 > Cap_Labor || temp_rose * 6 > Cap_Grape) break;
    		for (int temp_noir = 0; ; temp_noir++ ) {
    			if (temp_rose * 5 + temp_noir * 12 > Cap_Labor || temp_rose * 6 + temp_noir * 4 > Cap_Grape) break;
    			double sales_revenue = (temp_rose * Prc_Rose) + (temp_noir * Prc_Noir);
    			if (max_revenue < sales_revenue) {
    				output[0] = temp_rose;
    				output[1] = temp_noir;
    				max_revenue = sales_revenue;
    			}
    		}
    	}
		output[2] = (int)max_revenue;
		return output;
	}
}

