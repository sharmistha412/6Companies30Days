import java.util.*;
public class Ques14 {

    class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    
        }
    }

    public static int search(Node root,int num , Map<Integer,Set<Integer>> levelOrderMap)
    {
        if (root != null)
        {
            if (root.data == num)
            {
 
                levelOrderStoredInMap(root.left, 1,levelOrderMap);
                levelOrderStoredInMap(root.right, 1,levelOrderMap);
                return 1;
            }
            int k = search(root.left, num, levelOrderMap);
            if (k > 0)
            {
                storeRootAtK(root, k, levelOrderMap);
                levelOrderStoredInMap(root.right, k + 1,levelOrderMap);
                return k + 1;
            }
            k = search(root.right, num, levelOrderMap);
            if (k > 0)
            {
                // store root in map with k
                storeRootAtK(root, k, levelOrderMap);
                levelOrderStoredInMap(root.left, k + 1,levelOrderMap);
                return k + 1;
            }
        }
        return -1;
    }
    public static void levelOrderStoredInMap(Node root, int k, Map<Integer,Set<Integer>> levelOrderMap)
    {
        if (root != null) {
            storeRootAtK(root, k, levelOrderMap);
            levelOrderStoredInMap(root.left, k + 1,levelOrderMap);
            levelOrderStoredInMap(root.right, k + 1,levelOrderMap);
        }
    }
 
    private static void storeRootAtK(Node root, int k,Map<Integer,Set<Integer>> levelOrderMap)
    {
        if (levelOrderMap.containsKey(k)) {
            levelOrderMap.get(k).add(root.data);
        }
        else {
            Set<Integer> set = new HashSet<>();
            set.add(root.data);
            levelOrderMap.put(k, set);
        }
    }
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        Map<Integer,Set<Integer>> levelOrderMap= new HashMap<>();
        search(root, target, levelOrderMap);
        return levelOrderMap.keySet().size();
    }
    
}
