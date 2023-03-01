package com.synisys;

import com.synisys.enums.ChangeType;
import com.synisys.enums.Permission;
import com.synisys.facade.VersionControlFacade;
import com.synisys.models.Account;
import com.synisys.models.Change;
import com.synisys.models.File;
import com.synisys.models.Repository;
import com.synisys.services.api.VersionControlService;
import com.synisys.services.impl.VersionControlServiceImpl;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Permission> accountPermissions = new HashSet<>();
        accountPermissions.add(Permission.WRITE);
        accountPermissions.add(Permission.READ);
        Account account = new Account("user", "user@mail.com", accountPermissions);

        File changeFile = new File("file", "", 10.2);
        Change change = new Change(changeFile, ChangeType.ADD);

        Repository repository = new Repository();

        VersionControlService versionControlService = new VersionControlServiceImpl();

        VersionControlFacade facade = new VersionControlFacade(versionControlService);

        facade.updateChangesFromRemote(repository, account, change);

    }
}

