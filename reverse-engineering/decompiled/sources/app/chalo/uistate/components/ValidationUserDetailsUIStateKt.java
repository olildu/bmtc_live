package app.chalo.uistate.components;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ValidationUserDetailsUIStateKt {
    /* JADX WARN: Code duplicated, block: B:39:0x0161  */
    /* JADX WARN: Code duplicated, block: B:40:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(String str, String str2, StringEnum stringEnum, String str3, String str4, StringProvider stringProvider, ContinuationImpl continuationImpl) {
        ValidationUserDetailsUIStateKt$validationUserDetailsUIState$1 validationUserDetailsUIStateKt$validationUserDetailsUIState$1;
        ImageUrlUIState imageUrlUIState;
        String str5;
        StringProvider stringProvider2;
        StringEnum stringEnum2;
        String str6;
        Object obj;
        String str7;
        ImageUrlUIState imageUrlUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ImageUrlUIState imageUrlUIState3;
        String str8;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        ImageUrlUIState imageUrlUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        String str9;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        if (continuationImpl instanceof ValidationUserDetailsUIStateKt$validationUserDetailsUIState$1) {
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1 = (ValidationUserDetailsUIStateKt$validationUserDetailsUIState$1) continuationImpl;
            int i = validationUserDetailsUIStateKt$validationUserDetailsUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1 = new ValidationUserDetailsUIStateKt$validationUserDetailsUIState$1(continuationImpl);
            }
        } else {
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1 = new ValidationUserDetailsUIStateKt$validationUserDetailsUIState$1(continuationImpl);
        }
        Object objB = validationUserDetailsUIStateKt$validationUserDetailsUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validationUserDetailsUIStateKt$validationUserDetailsUIState$1.label;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        if (i2 == 0) {
            ResultKt.b(objB);
            imageUrlUIState = str.length() == 0 ? null : new ImageUrlUIState(str, new ImageUISize(ChaloThemeHelper.a().u), UIContentScale.Crop, null, 102);
            str5 = str2;
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$0 = str5;
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$1 = stringEnum;
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$2 = str3;
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$3 = str4;
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$4 = stringProvider;
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$5 = imageUrlUIState;
            validationUserDetailsUIStateKt$validationUserDetailsUIState$1.label = 1;
            Object objB2 = stringProvider.b(StringEnum.PASSENGER, new Object[0], validationUserDetailsUIStateKt$validationUserDetailsUIState$1);
            if (objB2 != coroutineSingletons) {
                stringProvider2 = stringProvider;
                stringEnum2 = stringEnum;
                str6 = str4;
                obj = objB2;
                str7 = str3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ImageUrlUIState imageUrlUIState5 = (ImageUrlUIState) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$5;
            stringProvider2 = (StringProvider) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$4;
            str6 = (String) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$3;
            String str10 = (String) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$2;
            StringEnum stringEnum3 = (StringEnum) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$1;
            String str11 = (String) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$0;
            ResultKt.b(objB);
            imageUrlUIState = imageUrlUIState5;
            stringEnum2 = stringEnum3;
            obj = objB;
            str7 = str10;
            str5 = str11;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextUIState5 = (TextUIState.ChaloTextUIState) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$3;
            chaloTextUIState6 = (TextUIState.ChaloTextUIState) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$2;
            imageUrlUIState3 = (ImageUrlUIState) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$1;
            str8 = (String) validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState2 = null;
        }
        chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        str6 = str8;
        chaloTextUIState = chaloTextUIState6;
        imageUrlUIState4 = imageUrlUIState3;
        chaloTextUIState4 = chaloTextUIState5;
        chaloTextUIState3 = chaloTextUIState7;
        imageUrlUIState2 = imageUrlUIState4;
        str9 = str6;
        TextUIState.ChaloTextUIState chaloTextUIState9 = chaloTextUIState;
        if (str9.length() == 0) {
            chaloTextUIState8 = chaloTextUIState2;
        } else {
            chaloTextUIState8 = new TextUIState.ChaloTextUIState(str9, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        }
        return new ValidationProductInfoUIState.ValidationUserDetailsUIState(imageUrlUIState2, chaloTextUIState9, chaloTextUIState4, chaloTextUIState8, chaloTextUIState3);
        TextUIState.ChaloTextUIState chaloTextUIState10 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        imageUrlUIState2 = imageUrlUIState;
        TextUIState.ChaloTextUIState chaloTextUIState11 = new TextUIState.ChaloTextUIState(str5, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        if (stringEnum2 != null) {
            if (str7.length() != 0) {
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$0 = str6;
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$1 = imageUrlUIState2;
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$2 = chaloTextUIState10;
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$3 = chaloTextUIState11;
                chaloTextUIState2 = null;
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$4 = null;
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.L$5 = null;
                validationUserDetailsUIStateKt$validationUserDetailsUIState$1.label = 2;
                objB = stringProvider2.b(stringEnum2, new Object[0], validationUserDetailsUIStateKt$validationUserDetailsUIState$1);
                if (objB != coroutineSingletons) {
                    imageUrlUIState3 = imageUrlUIState2;
                    str8 = str6;
                    chaloTextUIState5 = chaloTextUIState11;
                    chaloTextUIState6 = chaloTextUIState10;
                    chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    str6 = str8;
                    chaloTextUIState = chaloTextUIState6;
                    imageUrlUIState4 = imageUrlUIState3;
                }
                return coroutineSingletons;
            }
            imageUrlUIState4 = imageUrlUIState2;
            chaloTextUIState5 = chaloTextUIState11;
            chaloTextUIState = chaloTextUIState10;
            chaloTextUIState2 = null;
            chaloTextUIState7 = null;
            chaloTextUIState4 = chaloTextUIState5;
            chaloTextUIState3 = chaloTextUIState7;
            imageUrlUIState2 = imageUrlUIState4;
        } else {
            chaloTextUIState = chaloTextUIState10;
            chaloTextUIState2 = null;
            chaloTextUIState3 = null;
            chaloTextUIState4 = chaloTextUIState11;
        }
        str9 = str6;
        TextUIState.ChaloTextUIState chaloTextUIState12 = chaloTextUIState;
        if (str9.length() == 0) {
            chaloTextUIState8 = chaloTextUIState2;
        } else {
            chaloTextUIState8 = new TextUIState.ChaloTextUIState(str9, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        }
        return new ValidationProductInfoUIState.ValidationUserDetailsUIState(imageUrlUIState2, chaloTextUIState12, chaloTextUIState4, chaloTextUIState8, chaloTextUIState3);
    }
}
