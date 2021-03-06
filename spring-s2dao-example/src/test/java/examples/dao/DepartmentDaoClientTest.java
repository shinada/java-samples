/*
 * Copyright 2004-2006 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package examples.dao;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DepartmentDaoClientTest extends TestCase {

    public void testNoException() throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext(new String[] {
                "classpath:beans.xml", "classpath:dao.xml", "classpath:transaction.xml" });

        DepartmentDao dao = (DepartmentDao) context.getBean("departmentDao");
        Department dept = new Department();
        dept.setDeptno(99);
        dept.setDname("foo");
        dao.insert(dept);
        dept.setDname("bar");
        System.out.println("before update versionNo:" + dept.getVersionNo());
        dao.update(dept);
        System.out.println("after update versionNo:" + dept.getVersionNo());
        dao.delete(dept);
    }

}
