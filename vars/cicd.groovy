def  newDownload(repo)
{
      git "https://github.com/intelliqittrainings/${repo}"
}

def newBuild(repo)

{ 
      sh "mvn package" 
}




