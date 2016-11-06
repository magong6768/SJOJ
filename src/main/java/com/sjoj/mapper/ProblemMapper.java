package com.sjoj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sjoj.bean.Problem;
import com.sjoj.bean.Solution;

public interface ProblemMapper {
	/**
	 * 
	 * @param pageSize 页面显示数据量（一页显示几条）
	 * @return 获得Problem总页数
	 */
	Integer gettotalPage(int pageSize);

	/**
	 * 
	 * 
	 * @param pageNow 记录开始条数
	 * @param pageSize 一页的数据显示条数
	 * @return 获取一页的题目列表
	 */
	List<Problem> getProblemList(@Param("pageNow")int pageNow, @Param("pageSize")int pageSize);
	/**
	 * 
	 * 
	 * 增加新题目
	 * @param problem 题目内容
	 * @return 1：成功 0:失败
	 */
	Integer addNewProblem(Problem problem);
	
	/**
	 * 
	 * 根据题目编号获取题目内容
	 * @param problem_id 题目编号
	 * @return 题目内容
	 */
	Problem getProblemContent(int problem_id);
	
	
    /**
     * 向solution表中插入判题信息
     * @param user_id 用户ID
     * @param problem_id 题号
     * @param language 编写语言
     * @param ip 访问IP地址
     * @return 成功1失败0
     */
    int insertsolution(Solution s);
    
    /**
     * 
     * 向source_code表插入数据
     * @param solution_id 判题编号
     * @param source 所提交的代码
     * @return 成功1失败0
     */
    int insertsourcecode(@Param("solution_id") int solution_id,@Param("source") String source);
    
    /**
     * 
     * 向source_code_user表插入数据
     * @param solution_id 判题编号
     * @param source 所提交的代码
     * @return 成功1失败0
     */
    int insertsourcecodeuser(@Param("solution_id") int solution_id,@Param("source") String source);
    
    /**
	 * 
	 * @param pageSize 页面显示数据量（一页显示几条）
	 * @return 获得RankList总页数
	 */
	Integer gettotalPageSolution(int pageSize);
    /**
     * 
     * 查询成绩，获取成绩列表
     * @param pageNow 从第几条显示（这是有当前页数算出来的）
     * @param pageSize 一页显示多少条
     * @return 一页的成绩列表
     */
    List<Solution> getRankList(@Param("pageNow")int pageNow, @Param("pageSize")int pageSize);

}
