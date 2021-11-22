while getopts 'ce' flag 
do
    case "${flag}" in
        c) except=false;;
        e) except=true;;
    esac
done

if [ "$except" = true ]; then
    javac --release 10 ClasseExterna.java
    java ClasseExterna
else
    javac --release 11 ClasseExterna.java
    java ClasseExterna
fi
