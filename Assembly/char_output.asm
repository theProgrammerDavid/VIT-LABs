
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

org 100h
                      
; add your code here

ASSUME CS:CODE, DS:DATA

DATA SEGMENT
    MESSAGE DB "A"
    DATA ENDS

CODE SEGMENT
    START: 
    MOV AX, DATA
    MOV DS, AX
    MOV DL, MESSAGE
    MOV AH, 02H
    INT 21H
    
    MOV AH, 4CH
    INT 21H
    
    CODE ENDS
END START


