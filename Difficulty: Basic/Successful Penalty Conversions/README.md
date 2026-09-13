<h2><a href="https://www.geeksforgeeks.org/problems/the-penalty-shootout3810/1">Successful Penalty Conversions</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">A football match event log is represented by a string <strong>s&nbsp;</strong>consisting of characters '<strong>0</strong>', '<strong>1</strong>', and '<strong>2</strong>'.</span></p>
<ul>
<li><span style="font-size: 18px;">'2' represents a penalty awarded.</span></li>
<li><span style="font-size: 18px;">'1' represents a successful penalty conversion.</span></li>
<li><span style="font-size: 18px;">'0' represents an unsuccessful penalty conversion.</span><span style="font-size: 18px;"><br></span></li>
</ul>
<p><span style="font-size: 18px;">A successful penalty conversion occurs when a penalty award is immediately followed by a successful conversion, i.e. the substring "<strong>21</strong>" appears in the log. </span><span style="font-size: 18px;">Count the total number of successful penalty conversions in the string.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s</span><span style="font-size: 20px;"><span style="font-size: 14pt;"> =</span> "<span style="font-size: 14pt;">1012012112110</span>"</span><span style="font-size: 18px;">
<strong>Output:</strong> 2
<strong>Explanation:</strong> The substring "21" appears at positions: 10120[21]12110 and 10120121[21]10. Hence the answer is 2.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> s = "111122"
<strong>Output:</strong> 0
<strong>Explanation:</strong> The substring "21" does not appear in the string.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;