package com.synisys.facade;

import com.synisys.models.Account;
import com.synisys.models.Change;
import com.synisys.models.Repository;
import com.synisys.services.api.VersionControlService;

public class VersionControlFacade {

    private VersionControlService versionControlService;

    public VersionControlFacade(VersionControlService versionControlService) {
        this.versionControlService = versionControlService;
    }

    public void updateChangesFromRemote(Repository repository, Account account, Change localChanges) {
        System.out.println("Updating Changes from Remote");
        if (versionControlService.isValidRepository(repository) && versionControlService.isValidAccount(account)) {
            versionControlService.fetchChanges(repository);
            versionControlService.rebaseChanges(repository, localChanges);
        }
    }

}
