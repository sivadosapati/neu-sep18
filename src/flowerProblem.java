import java.util.HashSet;

public class flowerProblem {

	public int flowerProblem(int[] flowers, int k, int m) {
		int N = flowers.length;
		int[] days = new int[N];
		for (int i = 0; i < N; i++)
			days[flowers[i] - 1] = i + 1;

		for (int i : days) {
			System.out.print(i + "\t");
		}

		HashSet<HashSet<Integer>> totalSet = new HashSet<>();

		int lastday = -1;
		for (int i = 0; i < N; i++) {
			HashSet<Integer> loSet = new HashSet<>();
			HashSet<Integer> hiSet = new HashSet<>();

			for (HashSet<Integer> set : totalSet) {
				if (set.contains(days[i] - 1)) {
					loSet = set;
				}
				if (set.contains(days[i] + 1)) {
					hiSet = set;
				}
			}

			if (!hiSet.isEmpty() && !loSet.isEmpty()) {
				loSet.addAll(hiSet);
				loSet.add(days[i]);
				//hiSet.clear(); // @todo Why the deletion is not working???
				totalSet.remove(hiSet);

			} else if (hiSet.isEmpty() && !loSet.isEmpty()) {
				loSet.add(days[i]);
			} else if (!hiSet.isEmpty() && loSet.isEmpty()) {
				hiSet.add(days[i]);
			} else {
				HashSet<Integer> newSet = new HashSet<>();
				newSet.add(days[i]);
				totalSet.add(newSet);
			}

			int qualifyCounter = 0;
			for (HashSet<Integer> set : totalSet) {
				if (set.size() >= k) {
					qualifyCounter++;
				}
			}
			if (qualifyCounter >= m) {
				lastday = i + 1;
			}

			System.out.println("\n Days  " + (i + 1) + ": ");
			for (HashSet<Integer> set : totalSet) {
				System.out.println(set);
			}

		}

		return lastday;
	}

	public static void main(String[] args) {

		int[] flowers = { 3, 5, 10, 1, 7, 6, 4, 2, 8, 9 };
		flowerProblem obj = new flowerProblem();
		System.out.println(obj.flowerProblem(flowers, 2, 2));

//        HashSet<HashSet<Integer>> totalSet=new HashSet<>();
//        HashSet<Integer> set=new HashSet<>();
//        set.add(100);
//        set.add(200);
//        set.add(300);
//        totalSet.add(new HashSet<>(set));
//        set.clear();
//        set.add(1000);
//        set.add(2000);
//        set.add(3000);
//        totalSet.add(new HashSet<>(set));
//
//        HashSet<Integer > hiSet=new HashSet<>();
//        HashSet<Integer> loSet=new HashSet<>();
//        for(HashSet<Integer> s:totalSet){
//            if(s.contains(1000)){
//                hiSet=s;
//            }
//            if(s.contains(100)){
//                loSet=s;
//            }
//        }
//
//        loSet.addAll(hiSet);
//        totalSet.remove(hiSet);
//
//        for(HashSet<Integer> s: totalSet){
//            System.out.println(s);
//        }

	}

}
