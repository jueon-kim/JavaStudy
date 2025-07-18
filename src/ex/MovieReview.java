package ex;


public class MovieReview {
    String title;
    String review;
    public static void main(String[] args) {
        String[] title = {"인셉션" , "어바웃타임"};
        String[] review = {"인생은 무한루프", "인생 시간 영화"};

        for (int i = 0; i< title.length; i++){
            System.out.println("영화 제목: " + title[i] +  " 영화 리뷰: " + review[i]);
        }
    }
}
