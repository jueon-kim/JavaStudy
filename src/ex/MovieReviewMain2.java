package ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + "영화 리뷰: " + review.review);
        }

       //MovieReview[] moivews = new MovieReview[]{inception, aboutTime};

//        for (MovieReview moivew : moivews) {
//            System.out.println("영화 제목: " + moivew.title + ", 리뷰: " + moivew.review);
//
//        }


    }
}
