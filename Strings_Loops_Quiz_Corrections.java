public String doubleChar(String str) {
  
  String answer = "";
  
  for (int i=0; i<str.length(); i++){
    
    answer += str.charAt(i);
    answer += str.charAt(i);
    
  }
  return answer;
  
}
