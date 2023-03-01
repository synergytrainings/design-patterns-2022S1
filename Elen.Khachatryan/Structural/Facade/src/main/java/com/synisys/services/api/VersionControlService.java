package com.synisys.services.api;

import com.synisys.models.Account;
import com.synisys.models.Change;
import com.synisys.models.Commit;
import com.synisys.models.Repository;

import java.util.List;

public interface VersionControlService {


    Commit commitChange(Account account, String message,
                        String hash, Repository repository,
                        String branch, Change change);
     
    List<Change> checkForChange(Repository lastVersion, List<Change> uncommittedFiles);

    boolean hasEditPermission(Repository repository, Account account);

    void pushCommit(Commit commit);

    void submitCommit(Commit commit);

    void fetchChanges(Repository repository);

    void rebaseChanges(Repository repository, Change localChanges);

    boolean isValidAccount(Account account);

    boolean isValidRepository(Repository repository);
}
