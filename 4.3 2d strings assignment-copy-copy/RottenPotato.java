public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                {7,9,4,8},
                {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static int movieAvgRating(int[][] ratings, int movie) {
        int x=0;
        for (int j=0;j<ratings.length;j++){
            x=x+ratings[j][movie];
        }
        x=x/ratings.length;
        return x;
    }

    //Question 2
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
        int x=0;
        for (int j=0;j<ratings[reviewer].length;j++){
            x=x+ratings[reviewer][j];
        }
        x=x/ratings[reviewer].length;
        return x;      
    }

    //Question 3
    public static int avgRating2018(int[][] ratings) {
        int x=0;
        for (int i=0;i<ratings.length;i++){
            for (int j=0;j<ratings[i].length;j++){
                x=x+ratings[i][j];
            }
        }
        x=x/(ratings.length*ratings[0].length);
        return x; 
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        int who=10;
        int r=1000;
        for (int i=0;i<ratings.length;i++){
            int x=0;
            for (int j=0;j<ratings[i].length;j++){
                x=x+ratings[i][j];
            }
            if(x<r){
                r=x;
                who=i;
            }
        }
        return who;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        int who=10;
        int r=1000;
        for (int i=0;i<ratings[0].length;i++){
            int x=0;
            for (int j=0;j<ratings.length;j++){
                x=x+ratings[j][i];
            }
            if(x<r){
                r=x;
                who=i;
            }
        }
        return who;
    }   
}