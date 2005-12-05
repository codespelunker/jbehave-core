/* This file was generated by SableCC (http://www.sablecc.org/). */

package jbehave.core.story.codegen.sablecc.analysis;

import jbehave.core.story.codegen.sablecc.node.ABenefit;
import jbehave.core.story.codegen.sablecc.node.AFeature;
import jbehave.core.story.codegen.sablecc.node.APhrase;
import jbehave.core.story.codegen.sablecc.node.ARole;
import jbehave.core.story.codegen.sablecc.node.AScenario;
import jbehave.core.story.codegen.sablecc.node.AScenarioTitle;
import jbehave.core.story.codegen.sablecc.node.ASpaceWordOrSpace;
import jbehave.core.story.codegen.sablecc.node.AStory;
import jbehave.core.story.codegen.sablecc.node.ATitle;
import jbehave.core.story.codegen.sablecc.node.AWordWordOrSpace;
import jbehave.core.story.codegen.sablecc.node.EOF;
import jbehave.core.story.codegen.sablecc.node.Node;
import jbehave.core.story.codegen.sablecc.node.Start;
import jbehave.core.story.codegen.sablecc.node.Switch;
import jbehave.core.story.codegen.sablecc.node.TAsA;
import jbehave.core.story.codegen.sablecc.node.TEndl;
import jbehave.core.story.codegen.sablecc.node.TIWant;
import jbehave.core.story.codegen.sablecc.node.TScenarioKeyword;
import jbehave.core.story.codegen.sablecc.node.TSoThat;
import jbehave.core.story.codegen.sablecc.node.TSpace;
import jbehave.core.story.codegen.sablecc.node.TTitleKeyword;
import jbehave.core.story.codegen.sablecc.node.TWord;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object in);
    Object getOut(Node node);
    void setOut(Node node, Object out);

    void caseStart(Start node);
    void caseAStory(AStory node);
    void caseATitle(ATitle node);
    void caseARole(ARole node);
    void caseAFeature(AFeature node);
    void caseABenefit(ABenefit node);
    void caseAScenario(AScenario node);
    void caseAScenarioTitle(AScenarioTitle node);
    void caseAPhrase(APhrase node);
    void caseAWordWordOrSpace(AWordWordOrSpace node);
    void caseASpaceWordOrSpace(ASpaceWordOrSpace node);

    void caseTTitleKeyword(TTitleKeyword node);
    void caseTScenarioKeyword(TScenarioKeyword node);
    void caseTAsA(TAsA node);
    void caseTIWant(TIWant node);
    void caseTSoThat(TSoThat node);
    void caseTSpace(TSpace node);
    void caseTWord(TWord node);
    void caseTEndl(TEndl node);
    void caseEOF(EOF node);
}
