package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }
    //증가
   public void increment() {
       if(count >= max){
           System.out.println("최대 값을 초과 할수 없습니다.");
           return;
       }
        count++;
    }
    // 증가한 값을 반환
    public int getCount() {
        return count;
   }

}
