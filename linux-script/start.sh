#!/bin/bash
nohup java -jar -Xms128M -Xmx512M  fanglv-bbt-admin.jar --spring.profiles.active=prod  &
