#!/bin/bash

psql -c "\i create_pio_schema.sql"
sh change_owner.sh
psql -c "ALTER DATABASE piodb OWNER TO pio;"
