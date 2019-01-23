package com.ces.erp.tag.dialect;


import com.ces.erp.tag.processor.attribute.HasRoleAttrProcessor;
import com.ces.erp.tag.processor.element.HasRoleElementProcessor;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/6 10:05
 * @Description:
 */
public class CesPermissionDialect extends AbstractProcessorDialect {
    private static final String NAME = "Ces";
    private static final String PREFIX = "ces";

    public CesPermissionDialect() {
        super("Ces", "ces", 1000);
    }

    public Set<IProcessor> getProcessors(String dialectPrefix) {
        return createStandardProcessorsSet(dialectPrefix);
    }

    private static Set<IProcessor> createStandardProcessorsSet(String dialectPrefix) {
        LinkedHashSet processors = new LinkedHashSet();
        processors.add(new HasRoleAttrProcessor(dialectPrefix));
        processors.add(new HasRoleElementProcessor(dialectPrefix));
        return processors;
    }
}
