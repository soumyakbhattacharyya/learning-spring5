package sb.algorithm;

import org.assertj.core.util.Arrays;

public final class Array {

	public static int[] twoSum(int[] nums, int target) {

		int[] ret = new int[2];

		for (int num : nums) {
			// store the index of the element
			int index = Arrays.asList(nums).indexOf(num);
			for (int cursor = 0; cursor < nums.length; cursor++) {
				if (cursor != index && num + nums[cursor] == target) {
					ret[0] = index;
					ret[1] = cursor;
					return ret;
				}
			}

		}

		return ret;

	}

	public static int maxArea(int[] height) {

		int area = 0;
		
		// finds max
		int max = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = 0; j < height.length; j++) {
				if (height[i] < max) {
					if (height[j] > max) {
						max = height[j];
					}
				}else {
					max = height[i];
				}
			}
		}

		return max;

	}

}
