#!/bin/bash

SCRIPTDIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

if [[ $# -ge 0 && "$1" != 'restore' && "$1" != 'only' && "$1" != 'backup' ]]; then exit 1 ; fi

# on restore, radical clean src (including e.g. universe) and restore backup to src, then exit
if [[ $# -ge 0 && "$1" == 'restore' ]]; then
  rm -rf "$SCRIPTDIR/src/main/kotlin/com/hoffi/generated" 2>/dev/null # more radical than clean/rm below
  cp -rf "$SCRIPTDIR/backup/src/main/kotlin/com/hoffi/generated" "$SCRIPTDIR/src/main/kotlin/com/hoffi/"
  exit 0 # that's it
fi

# backup, (do not backup if 'only')
if [[ $# -eq 0 || ( $# -ge 0 && "$1" != 'only' ) ]]; then
  rm -rf "$SCRIPTDIR/backup/src" 2>/dev/null
  mkdir -p "$SCRIPTDIR/backup"
  cp -rf "$SCRIPTDIR/src" "$SCRIPTDIR/backup/"
fi

# clean/rm src, (do not clean if 'backup')
if [[ $# -eq 0 || ( $# -ge 0 && "$1" != 'backup' ) ]]; then
  rm -rf "$SCRIPTDIR/src/main/kotlin/com/hoffi/generated/examples"
fi

