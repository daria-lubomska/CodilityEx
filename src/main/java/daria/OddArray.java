package daria;

class OddArray {

  int solution(int[] A) {
    int result = 0;
    for (int i : A) {
      result ^= i;
    }
    return result;
  }
}

