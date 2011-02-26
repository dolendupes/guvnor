/*
 * Copyright 2011 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.drools.guvnor.gwtutil;

import org.drools.guvnor.client.rpc.RepositoryService;

public class ServiceImplementationAsyncInterfaceGenerator {
    public static void main(String[] args) throws Exception {
        Class< ? > cls = RepositoryService.class;
        String line = AsyncInterfaceGenerator.generate( cls );
        System.out.println( "/** PLACE THE FOLLOWING IN RepositoryServiceAsync.java **/\n" );

        System.out.println( "/** Generated by AsyncInterfaceGenerator hackery */" );
        System.out.println( line );
    }


}
