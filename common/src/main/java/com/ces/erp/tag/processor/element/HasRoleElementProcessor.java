package com.ces.erp.tag.processor.element;

import com.ces.erp.util.SystemSession;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.util.ArrayUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/6 10:36
 * @Description:
 */
public class HasRoleElementProcessor extends AbstractElementTagProcessor {
    private static final String ELEMENT_NAME = "hasrole";
    private static final int PRECEDENCE = 300;
    private static final String DELIMITER = ",";

    public HasRoleElementProcessor(String dialectPrefix) {
        super(TemplateMode.HTML, dialectPrefix, "hasrole", true, (String)null, false, 300);
    }

    @Override
    protected void doProcess(ITemplateContext iTemplateContext, IProcessableElementTag iProcessableElementTag, IElementTagStructureHandler iElementTagStructureHandler) {
        String rawValue = iProcessableElementTag.getAttributeValue("name");
        List<String> values = Arrays.asList(rawValue.split(","));
        if (SystemSession.hasAllRoles(values)) {
            iElementTagStructureHandler.removeTags();
        } else {
            iElementTagStructureHandler.removeElement();
        }
    }
}
