CONFIG_FILE=$HOME/conf/stunnel.conf
echo "at=info service=stunnel action=start config=$CONFIG_FILE"
$HOME/vendor/stunnel/bin/stunnel $CONFIG_FILE &