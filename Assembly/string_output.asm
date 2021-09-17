
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt


ASSUME CS:CODE, DS:DATA

DATA SEGMENT
    MESSAGE DB "HELLO$"
    DATA ENDS

CODE SEGMENT
    START:
    MOV AX, DATA
    MOV DS, AX
    
    MOV AH, 09H
    MOV DX, OFFSET MESSAGE
    INT 21H
    
    MOV AH, 4CH
    INT 21H
    CODE ENDS

END START




