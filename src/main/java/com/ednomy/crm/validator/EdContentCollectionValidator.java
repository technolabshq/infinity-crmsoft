package com.ednomy.crm.validator;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ednomy.crm.commons.constants.EdMessageConstants;
import com.ednomy.crm.model.EdContentCollection;
import com.ednomy.crm.model.metadatamodel.EdContentCollectionConstant;
import com.ednomy.crm.util.ApplicationProperties;
import com.ednomy.crm.util.FileUtility;

@Component
public class EdContentCollectionValidator implements Validator,
		MessageSourceAware {

	MessageSource messageSource;

	@Autowired
	ApplicationProperties applicationProperties;

	@Autowired
	FileUtility fileUtility;
	
	org.slf4j.Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return EdContentCollection.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		EdContentCollection edContentCollection = (EdContentCollection) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors,
				EdContentCollectionConstant.TITLE, this.messageSource.getMessage(
						EdMessageConstants.FIELD_REQUIRED, new String[] { EdContentCollectionConstant.TITLE }, null));

		if (edContentCollection.getBase64() != null && !edContentCollection.getBase64().isEmpty()) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, EdContentCollectionConstant.MEDIA_MAIN,
					this.messageSource.getMessage(EdMessageConstants.FIELD_REQUIRED,
									new String[] {EdContentCollectionConstant.MEDIA_MAIN}, null));
		}

	}
	
}
