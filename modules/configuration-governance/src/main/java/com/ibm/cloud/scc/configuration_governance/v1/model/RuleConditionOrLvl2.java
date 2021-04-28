/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.scc.configuration_governance.v1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A condition with the `or` logical operator.
 */
public class RuleConditionOrLvl2 extends RuleCondition {


  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private List<RuleSingleProperty> or;

    public Builder(RuleCondition ruleConditionOrLvl2) {
      this.description = ruleConditionOrLvl2.description;
      this.or = ruleConditionOrLvl2.or;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param or the or
     */
    public Builder(List<RuleSingleProperty> or) {
      this.or = or;
    }

    /**
     * Builds a RuleConditionOrLvl2.
     *
     * @return the new RuleConditionOrLvl2 instance
     */
    public RuleConditionOrLvl2 build() {
      return new RuleConditionOrLvl2(this);
    }

    /**
     * Adds an operand to or.
     *
     * @param operand the new operand
     * @return the RuleConditionOrLvl2 builder
     */
    public Builder addOperand(RuleSingleProperty operand) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(operand,
        "operand cannot be null");
      if (this.or == null) {
        this.or = new ArrayList<RuleSingleProperty>();
      }
      this.or.add(operand);
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RuleConditionOrLvl2 builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the or.
     * Existing or will be replaced.
     *
     * @param or the or
     * @return the RuleConditionOrLvl2 builder
     */
    public Builder or(List<RuleSingleProperty> or) {
      this.or = or;
      return this;
    }
  }

  protected RuleConditionOrLvl2(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.or,
      "or cannot be null");
    description = builder.description;
    or = builder.or;
  }

  /**
   * New builder.
   *
   * @return a RuleConditionOrLvl2 builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

