#!/bin/bash

sudo bash
docker build -t game_app .
docker run -it -p 5000:5000 --name BoldBeaversGame game_app
