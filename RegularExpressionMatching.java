package com.water.leetcode;

public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {

		if (p.length() == 0 || p == null) {
			return s.length() == 0;
		}
		// the length of p is 1
		if (p.length() == 1) {
			if (s.length() != 1) {
				return false;
			} else if (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) {
				return true;
			}
			return false;
		}

		// the length of p > 1 and the second character is not the *
		else if (p.length() > 1) {
			if (p.charAt(1) != '*') {
				if ((p.charAt(0) != s.charAt(0)) || p.charAt(0) != '.') {
					return false;
				} else if (isMatch(s.substring(1), p.substring(1))) {
					return true;
				}
				return false;
			}else if(p.charAt(1) == '*'){
				if(isMatch(s,p.substring(2))){
					return true;
				}
				
			}

		}

		return false;

	}
}
