package com.ces.erp.tag.processor.attribute;

import com.ces.erp.util.SystemSession;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/6 10:36
 * @Description:
 */
public class HasRoleAttrProcessor extends AbstractAttributeTagProcessor {
    private static final String DELIMITER = ",";
    private static final String ATTRIBUTE_NAME = "hasRole";
    private static final int PRECEDENCE = 300;

    public HasRoleAttrProcessor(String dialectPrefix) {
        super(TemplateMode.HTML, dialectPrefix, (String)null, false, "hasRole", true, 300, true);
    }

    protected void doProcess(ITemplateContext iTemplateContext, IProcessableElementTag iProcessableElementTag, AttributeName attributeName, String attributeValue, IElementTagStructureHandler iElementTagStructureHandler) {
        String rawValue = iProcessableElementTag.getAttributeValue("name");
        List<String> values = Arrays.asList(rawValue.split(","));
        if (SystemSession.hasAllRoles(values)) {
            iElementTagStructureHandler.removeTags();
        } else {
            iElementTagStructureHandler.removeElement();
        }

    }
}
