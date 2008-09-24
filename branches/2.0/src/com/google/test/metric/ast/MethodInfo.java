/*
 * Copyright 2007 Google Inc.
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
package com.google.test.metric.ast;

import com.google.test.metric.TestabilityContext;
import com.google.test.metric.Variable;
import com.google.test.metric.asm.Visibility;
import com.google.test.metric.method.op.turing.Operation;

import java.util.List;

/**
 * Language-Independent method-specific information.
 */
public interface MethodInfo {

  /**
   * @return the name of the method.
   */
  String getName();

  /**
   * @return a list of the parameters that this method will accept.
   */
  List<ParameterInfo> getParameters();

  /**
   * @return a list of local variables defined in this method.
   */
  List<LocalVariableInfo> getLocalVariables();

  /**
   * @return ?
   */
  String getNameDesc();

  /**
   * @return the string representation of this Method.
   */
  String toString();

  List<Operation> getOperations();

  void computeMetric(TestabilityContext testabilityContext);

  String getFullName();

  int getStartingLineNumber();

  //TODO: this should probably not be here
  long getTestCost();

  Variable getMethodThis();

  ClassInfo getClassInfo();

  boolean isStatic();

  boolean isConstructor();

  Visibility getVisibility();

  boolean canOverride();

  boolean isInstance();

  boolean isStaticConstructor();

  //TODO: this should probably not be here
  long getNonRecursiveCyclomaticComplexity();

}