/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
package com.infosys.util;

import java.util.*;

public class Check {
	public static void main(String args[]) {
		Set<List<String>> emails = new HashSet<>();
		emails.add(Arrays.asList("saurav", "meet"));
		System.out.println(emails.contains(new ArrayList<>(Arrays.asList("saurav", "meet"))));
	}
}
