if [ "$#" -eq 1 ]; then
    current_dir=$(pwd)
    if [ ${1} == '--build' ];then
        cd ${current_dir}/src
        make clean
        make all
        make clean
        cd ${current_dir}
    fi
fi

echo "Starting game..."
java -classpath ./lib/brunca.jar me.castrovrob.brunca.game.BGame

exit 0
