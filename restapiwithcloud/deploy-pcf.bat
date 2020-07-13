echo "deploying app"
cf push cloude-pcf-boot -p "C:\Program Files (x86)\Jenkins\workspace\boot-pcf\restapiwithcloud\target\restapiwithcloud-0.0.1-SNAPSHOT.jar" -m 750m
echo "deployed"
pause