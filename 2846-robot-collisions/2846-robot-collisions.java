class Solution {

    class Robot 
    {
        int position;
        int health;
        char direction;
        int index; // Original index in the input arrays

        Robot(int position, int health, char direction, int index) {
            this.position = position;
            this.health = health;
            this.direction = direction;
            this.index = index;
        }
    
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        if (n == 0) {
            return new ArrayList<>();
        }

        List<Robot> robots = new ArrayList<Robot>(n);

        // Create Robot objects and add them to the list
        for(int i = 0; i < n;  i++)
        {
            Robot robot = new Robot(positions[i], healths[i], directions.charAt(i), i);
            robots.add(robot);
        }

        // Sort the list by position
        Collections.sort(robots, (a,b)->a.position-b.position);
        // to store robots moving right
        Stack<Robot> stack = new Stack<>();


        for(Robot robot : robots)
        {
            if(robot.direction == 'L')
            {
                while (!stack.empty()) 
                {
                    // first robot is moving right to collide (RR = Right Robot)
                    Robot RR = stack.peek();

                    if(robot.health == RR.health)
                    {
                        robot.health = 0;
                        RR.health = 0;
                        stack.pop();
                        break;
                    } 
                    if(robot.health > RR.health)
                    {
                        robot.health = robot.health - 1;
                        RR.health = 0;
                        stack.pop();
                    }
                    else
                    {
                        RR.health = RR.health - 1;
                        robot.health = 0;
                        break;
                    }
                }
            }
            else 
            {
                stack.push(robot);
            }
        }

        Collections.sort(robots, (a, b) -> a.index-b.index);

        List<Integer> result = new ArrayList<>();

        for (Robot robot : robots) {
            if (robot.health > 0) {
                result.add(robot.health);
            }
        }

        return result;
    }
}