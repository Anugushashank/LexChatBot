package com.amazonaws.sample.lex;

import com.amazonaws.services.lexrts.model.Button;

/**
 * Created by anugu.s on 12/07/17.
 */
public class ResponseCard {
    public String version, contentType;
    GenericAttachments genericAttachments;

    public class GenericAttachments {
        public String title, subTitle, imageUrl, attachmentLinkUrl;
        ButtonValue buttons;

        public class ButtonValue {
            public String text, value;

            public String getText(){
                return text;
            }

            public String getValue(){
                return value;
            }
        }

        public String getTitle(){
            return title;
        }

        public String getSubTitle(){
            return subTitle;
        }

        public String getImageUrl(){
            return imageUrl;
        }

        public String getAttachmentLinkUrl(){
            return attachmentLinkUrl;
        }

        public ButtonValue getButtons(){
            return buttons;
        }
    }

    public GenericAttachments getGenericAttachments(){
        return genericAttachments;
    }

}
