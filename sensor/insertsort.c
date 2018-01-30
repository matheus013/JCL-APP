void sort(int array[]) {
   int i, j, currentValue;
   int length = 10;
   for(j = 1; j < length; j++) {
      currentValue = array[j];
      i = j - 1;
      while(i >= 0 && array[i] > currentValue) {
        array[i + 1] = array[i];
        i--;
      }
      array[i + 1] = currentValue;
   }
}

void reduction(int array[], int rate){
  if(rate < 1 || rate > 10) return;
  int result[rate];
  int start = (10 - rate)/2;
  int end = (10 + rate)/2;
  for (int i = start; i < end; i++) {
    result[i - start] = array[i];
  }
}

int main(int argc, char const *argv[]) {
  /* code */
  int a[10], j = 0;
  for (int i = 10; i > 0; i--) {
    a[j++] = i;
  }

  sort(a);
  reduction(a, 1);
  return 0;
}
