package gitHub.gitSamplePractice;

import org.testng.annotations.Test;

public class sample4Prg {

	
//	C:\Users\GitPractice>git checkout -b "sheela_local"
//	Switched to a new branch 'sheela_local'
//
//	C:\Users\GitPractice>git branch
//	  master
//	* sheela_local
//
//	C:\Users\GitPractice>git status
//	On branch sheela_local
//	nothing to commit, working tree clean
//
//	C:\Users\GitPractice>git status
//	On branch sheela_local
//	Untracked files:
//	  (use "git add <file>..." to include in what will be committed)
//
//	        gitSamplePractice/src/test/java/gitHub/gitSamplePractice/sample4.java
//
//	nothing added to commit but untracked files present (use "git add" to track)
//
//	C:\Users\GitPractice>git add .
//
//	C:\Users\GitPractice>git commit -m "new class added to src/test/jave to test the branching after creating sheela_local branch"
//	[sheela_local b2a234c] new class added to src/test/jave to test the branching after creating sheela_local branch
//	 Committer: Sahoo <sheela.sahoo@franklintempleton.com>
//	Your name and email address were configured automatically based
//	on your username and hostname. Please check that they are accurate.
//	You can suppress this message by setting them explicitly. Run the
//	following command and follow the instructions in your editor to edit
//	your configuration file:
//
//	    git config --global --edit
//
//	After doing this, you may fix the identity used for this commit with:
//
//	    git commit --amend --reset-author
//
//	 1 file changed, 12 insertions(+)
//	 create mode 100644 gitSamplePractice/src/test/java/gitHub/gitSamplePractice/sample4.java
//
//	C:\Users\GitPractice>git push
//	fatal: The current branch sheela_local has no upstream branch.
//	To push the current branch and set the remote as upstream, use
//
//	    git push --set-upstream origin sheela_local
//
//
//	C:\Users\GitPractice>git status
//	On branch sheela_local
//	nothing to commit, working tree clean
//
//	C:\Users\GitPractice>git push origin sheela_local
//	Counting objects: 9, done.
//	Delta compression using up to 4 threads.
//	Compressing objects: 100% (5/5), done.
//	Writing objects: 100% (9/9), 793 bytes | 79.00 KiB/s, done.
//	Total 9 (delta 1), reused 0 (delta 0)
//	remote: Resolving deltas: 100% (1/1), completed with 1 local object.
//	To https://github.com/Sheela30/GitPractice.git
//	 * [new branch]      sheela_local -> sheela_local
//
//	C:\Users\GitPractice>git pull origin master
//	remote: Counting objects: 1, done.
//	remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0
//	Unpacking objects: 100% (1/1), done.
//	From https://github.com/Sheela30/GitPractice
//	 * branch            master     -> FETCH_HEAD
//	   2da33ff..07d249e  master     -> origin/master
//	Updating b2a234c..07d249e
//	Fast-forward
//
//	C:\Users\GitPractice>git status
//	On branch sheela_local
//	nothing to commit, working tree clean
//
//	C:\Users\GitPractice>git branch
//	  master
//	* sheela_local
//
//	C:\Users\GitPractice>git checkout master
//	Switched to branch 'master'
//	Your branch is behind 'origin/master' by 2 commits, and can be fast-forwarded.
//	  (use "git pull" to update your local branch)
//
//	C:\Users\GitPractice>git branch
//	* master
//	  sheela_local
//
//	C:\Users\GitPractice>@Test
//	'Test' is not recognized as an internal or external command,
//	operable program or batch file.
//
//	C:\Users\GitPractice>public void sampleprg3() {
//	'public' is not recognized as an internal or external command,
//	operable program or batch file.
//
//	C:\Users\GitPractice>System.out.println("sample3 program");
//	'System.out.println' is not recognized as an internal or external command,
//	operable program or batch file.
//
//	C:\Users\GitPractice>}@Test
//	'}@Test' is not recognized as an internal or external command,
//	operable program or batch file.
//
//	C:\Users\GitPractice>public void sampleprg3() {
//	'public' is not recognized as an internal or external command,
//	operable program or batch file.
//
//	C:\Users\GitPractice>System.out.println("sample3 program");
//	'System.out.println' is not recognized as an internal or external command,
//	operable program or batch file.

	@Test
	public void sample4() {
		System.out.println("sample4");
	}
}
