class Sol {
     int countCamelCase(String s) {
         int count = 0;
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (c >= 'A' && c <= 'Z') {
                 count++;
             }
         }
         return count;
     }
 }