/*
 * Copyright 2013 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.errorprone.bugpatterns;

import static org.junit.Assert.fail;

import junit.framework.TestCase;

import org.junit.Assert;

/**
 * @author adamwos@google.com (Adam Wos)
 */
public class TryFailWithEmptyCatchThrowablePositiveCases {

  public static void emptyCatch_failNoMessage() {
    try {
      dummyMethod();
      Assert.fail();
    } catch (Throwable t) {
    }
  }

//  public static void commentCatch_failNoMessage() {
//    try {
//      dummyMethod();
//      Assert.fail();
//    } catch (Throwable t123) {
//      // expected!
//      ;
//      /* that's an empty comment */
//    }
//  }
//
//  public static void codeCatch_failNoMessage() {
//    try {
//      dummyMethod();
//      Assert.fail();
//    } catch (Throwable t) {
//      dummyRecover();
//    }
//  }
//
//  public static void emptyCatch_failWithMessage() {
//    try {
//      dummyMethod();
//      Assert.fail("Faaail!");
//    } catch (Throwable t) {
//    }
//  }
//
//
//  public static void commentCatch_failWithMessage() {
//    try {
//      dummyMethod();
//      Assert.fail("Faaail!");
//    } catch (Throwable t) {
//      // expected!
//    }
//  }
//
//  static final class SomeTest extends TestCase {
//    public void testInTestCase() {
//      try {
//        dummyMethod();
//        fail("message");
//      } catch (Throwable codeCatch_oldAssertFailWithMessage) {
//        // comment
//      }
//    }
//  }

  private static void dummyRecover() {}

  private static void dummyMethod() {}
}
