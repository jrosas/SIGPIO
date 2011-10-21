#!/bin/bash
for tbl in `psql -qAt -c "select tablename from pg_tables where schemaname = 'public';" piodb` ; do  psql -c "alter table $tbl owner to pio" piodb ; done
