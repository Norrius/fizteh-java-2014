package ru.fizteh.fivt.students.maxim_rep.multifilehashmap.commands;

import ru.fizteh.fivt.students.maxim_rep.multifilehashmap.DbMain;

public class Exit implements DBCommand {

    public Exit() {
    }

    @Override
    public boolean execute() {
        if (DbMain.fileStoredStringMap != null) {
            try {
                if (DbMain.fileStoredStringMap != null) {
                    DbMain.fileStoredStringMap.close();
                }
            } catch (Exception e) {
                System.err.println("Database Error - " + e.toString());
                return false;
            }
        }
        return true;
    }

}
