#!/usr/bin/env bash
cd /home/ec2-user/server
sudo java -Dserver.port=80 -jar notification-management-service.jar > /dev/null 2> /dev/null < /dev/null &
