def call(string url, String branch){
  echo "this is cloning the code"
  git url: url, branch:branch
  echo "code cloning is successful"
}
      
