#!/usr/bin/env bash
# File: renameScript.sh
cnt=1
for file in * 
do 
	if [[ $file  =~ [Tt]est[0-9]{2}_*\.java ]] 
	then 
	mv $file Test01_${cnt}.java
	let cnt=$cnt+1
	fi
done


