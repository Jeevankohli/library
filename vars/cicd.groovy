def  newDownload(repo)
{
      git "https://github.com/intelliqittrainings/${repo}"
}

def newBuild()
{ 
      sh 'mvn package' 
}

def newDeploy(jobname,ip,appname)
{
sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}



