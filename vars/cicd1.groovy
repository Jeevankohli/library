def  newDownload(repo)
{
      git "https://github.com/intelliqittrainings/${repo}"
}    

def newBuild()
{
      sh 'mvn package'
}     
 
def newDeploy
{
      sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/${appname}.war"
}
