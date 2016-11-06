package com.sjoj.mapper;

import java.util.List;

import com.sjoj.bean.Contest;
import com.sjoj.bean.Problem;
import com.sjoj.bean.Solution;

public interface ContestMapper {
	/**
	 * 新建一个竞赛
	 * @param c 竞赛的内容
	 * @return 1成功，0失败
	 */
	int addContest(Contest c);
	
	/**
	 * 给创建的竞赛增加题目
	 * @param problem_id 题目编号
	 * @return 1成功，0失败
	 */
	int addContestproblem(List<Integer> problem_id);
	
	/**
	 * 获取竞赛列表
	 * @return 所有合适的竞赛
	 */
	List<Contest> getallContest();
	
	/**
	 * 获取某个竞赛的题目
	 * @param contest_id 竞赛编号
	 * @return 该竞赛的所有试题
	 */
	List<Problem> getContestProblem(int contest_id);
	
	/**
	 * 获取该竞赛的成绩
	 * @param contest_id 竞赛ID
	 * @return 该竞赛的判题情况
	 */
	List<Solution> getContestRanklist(int contest_id);

}
