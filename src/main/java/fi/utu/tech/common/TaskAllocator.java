package fi.utu.tech.common;

import java.util.ArrayList;
import java.util.List;

/**
 * You need to modify this file
 */


public class TaskAllocator {
    public static List<List<Submission>> splitListIntoEqualParts(List<Submission> submissions, int parts) {
        List<List<Submission>> subLists = new ArrayList<>();

        int partSize = (int) Math.ceil((double) submissions.size() / parts );

        for(int i = 0; i < submissions.size(); i += partSize) {
            subLists.add(new ArrayList<>(submissions.subList(i, Math.min(i + partSize, submissions.size()))));
        }

        return subLists;
    }

    /**
     * Allocator that creates list of two (2) GradingTask objects with each having half of the given submissions
     * @param submissions The submissions to be allocated
     * @return The two GradingTask objects in a list, each having half of the submissions
     */
    public static List<GradingTask> sloppyAllocator(List<Submission> submissions) {
        // TODO: Tehtävä 4
        int parts = 2;
        List<List<Submission>> splitSubmissions = splitListIntoEqualParts(submissions, parts);
        List<GradingTask> gradingTasks = new ArrayList<>();
        for(int i = 0; i < parts; i++) {
            GradingTask gradingTask = new GradingTask();
            gradingTask.setUngradedSubmissions(splitSubmissions.get(i));
            gradingTasks.add(gradingTask);
        }

        return gradingTasks;
    }


    
    /**
     * Allocate List of ungraded submissions to tasks
     * @param submissions List of submissions to be graded
     * @param taskCount Amount of tasks to be generated out of the given submissions
     * @return List of GradingTasks allocated with some amount of submissions (depends on the implementation)
     */
    public static List<GradingTask> allocate(List<Submission> submissions, int taskCount) {
        // TODO: Tehtävä 5
        // Retruns null for now to suppress warnings
        return null;
    }
}
