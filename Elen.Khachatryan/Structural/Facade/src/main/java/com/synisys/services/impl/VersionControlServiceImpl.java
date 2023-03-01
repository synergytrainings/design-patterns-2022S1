package com.synisys.services.impl;

import com.synisys.models.Account;
import com.synisys.models.Change;
import com.synisys.models.Commit;
import com.synisys.models.Repository;
import com.synisys.services.api.VersionControlService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VersionControlServiceImpl implements VersionControlService {
    @Override
    public Commit commitChange(Account account, String message,
                               String hash, Repository repository,
                               String branch, Change change) {
        return new Commit(account, LocalDateTime.now(),
                message, hash,
                branch, repository, new ArrayList<>() {{
            add(change);
        }});
    }

    @Override
    public List<Change> checkForChange(Repository lastVersion, List<Change> uncommittedFiles) {
        return null;
    }

    @Override
    public boolean hasEditPermission(Repository repository, Account account) {
        return false;
    }

    @Override
    public void pushCommit(Commit commit) {

    }

    @Override
    public void submitCommit(Commit commit) {

    }

    @Override
    public void fetchChanges(Repository repository) {

    }

    @Override
    public void rebaseChanges(Repository repository, Change localChange) {

    }

    @Override
    public boolean isValidAccount(Account account) {
        return true;
    }

    @Override
    public boolean isValidRepository(Repository repository) {
        return true;
    }
}
