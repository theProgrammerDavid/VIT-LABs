
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt

; add your code here 
ASSUME CS:CODE, DS:DATA
DATA SEGMENT
    
DATA ENDS

CODE SEGMENT
    START: 
    MOV AX, DATA
    MOV DS, AX
    MOV AH, 01H
    INT 21H
    
    CODE ENDS
END START




