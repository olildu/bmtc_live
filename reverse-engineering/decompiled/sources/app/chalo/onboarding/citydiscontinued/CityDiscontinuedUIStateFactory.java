package app.chalo.onboarding.citydiscontinued;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonBorderUISpec;
import app.chalo.uistate.button.ButtonUIColor;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.ii;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedUIStateFactory;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityDiscontinuedUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f6559a;

    public CityDiscontinuedUIStateFactory(StringProvider stringProvider) {
        this.f6559a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x020d  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(CityDiscontinuedDataState cityDiscontinuedDataState, Function1 function1, ContinuationImpl continuationImpl) {
        CityDiscontinuedUIStateFactory$convertToUIState$1 cityDiscontinuedUIStateFactory$convertToUIState$1;
        Function1 function2;
        ToolbarUIState toolbarUIState;
        ImageUIState imageUIState;
        CityDiscontinuedDataState cityDiscontinuedDataState2;
        ToolbarUIState toolbarUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ToolbarUIState toolbarUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function3;
        StringProvider stringProvider;
        Object objB;
        CoroutineSingletons coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ToolbarUIState toolbarUIState4;
        CoroutineSingletons coroutineSingletons2;
        ToolbarUIState toolbarUIState5;
        DiscontinuedTextViewsUIState discontinuedTextViewsUIState;
        float f;
        Function1 function4;
        DiscontinuedTextViewsUIState discontinuedTextViewsUIState2;
        ToolbarUIState toolbarUIState6;
        if (continuationImpl instanceof CityDiscontinuedUIStateFactory$convertToUIState$1) {
            cityDiscontinuedUIStateFactory$convertToUIState$1 = (CityDiscontinuedUIStateFactory$convertToUIState$1) continuationImpl;
            int i = cityDiscontinuedUIStateFactory$convertToUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityDiscontinuedUIStateFactory$convertToUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                cityDiscontinuedUIStateFactory$convertToUIState$1 = new CityDiscontinuedUIStateFactory$convertToUIState$1(this, continuationImpl);
            }
        } else {
            cityDiscontinuedUIStateFactory$convertToUIState$1 = new CityDiscontinuedUIStateFactory$convertToUIState$1(this, continuationImpl);
        }
        Object objB2 = cityDiscontinuedUIStateFactory$convertToUIState$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDiscontinuedUIStateFactory$convertToUIState$1.label;
        ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
        StringProvider stringProvider2 = this.f6559a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            ToolbarUIState toolbarUIState7 = new ToolbarUIState(null, null, null, UiEventHandler.Companion.a(new ii(function1, 27)), null, ChaloThemeHelper.b().f1917a, null, null, 215);
            ImageUIState imageUIState2 = new ImageUIState(IconType.OUT_OF_SERVICE, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().D), null, 2), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$0 = cityDiscontinuedDataState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$1 = function1;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$2 = toolbarUIState7;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$3 = imageUIState2;
            cityDiscontinuedUIStateFactory$convertToUIState$1.label = 1;
            objB2 = stringProvider2.b(StringEnum.CITY_DISCONTINUED_TITLE, new Object[0], cityDiscontinuedUIStateFactory$convertToUIState$1);
            if (objB2 != coroutineSingletons3) {
                function2 = function1;
                toolbarUIState = toolbarUIState7;
                imageUIState = imageUIState2;
                cityDiscontinuedDataState2 = cityDiscontinuedDataState;
            }
            return coroutineSingletons3;
        }
        if (i2 == 1) {
            ImageUIState imageUIState3 = (ImageUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$3;
            ToolbarUIState toolbarUIState8 = (ToolbarUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$2;
            function2 = (Function1) cityDiscontinuedUIStateFactory$convertToUIState$1.L$1;
            cityDiscontinuedDataState2 = (CityDiscontinuedDataState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$0;
            ResultKt.b(objB2);
            imageUIState = imageUIState3;
            toolbarUIState = toolbarUIState8;
        } else if (i2 == 2) {
            chaloTextUIState = (TextUIState.ChaloTextUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$3;
            imageUIState = (ImageUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$2;
            toolbarUIState2 = (ToolbarUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$1;
            function2 = (Function1) cityDiscontinuedUIStateFactory$convertToUIState$1.L$0;
            ResultKt.b(objB2);
            toolbarUIState3 = toolbarUIState2;
            function3 = function2;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black_60, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$0 = function3;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$1 = toolbarUIState3;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$2 = imageUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
            cityDiscontinuedUIStateFactory$convertToUIState$1.label = 3;
            stringProvider = stringProvider2;
            objB = stringProvider.b(StringEnum.CITY_DISCONTINUED_SUPPORTING_TEXT, new Object[0], cityDiscontinuedUIStateFactory$convertToUIState$1);
            coroutineSingletons = coroutineSingletons3;
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextUIState3 = chaloTextUIState;
            chaloTextUIState4 = chaloTextUIState2;
            toolbarUIState4 = toolbarUIState3;
            objB2 = objB;
            coroutineSingletons2 = coroutineSingletons;
            toolbarUIState5 = toolbarUIState4;
            discontinuedTextViewsUIState = new DiscontinuedTextViewsUIState(chaloTextUIState3, chaloTextUIState4, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black_60, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
            f = ChaloThemeHelper.a().v;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$0 = function3;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$1 = toolbarUIState5;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$2 = imageUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$3 = discontinuedTextViewsUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$4 = null;
            cityDiscontinuedUIStateFactory$convertToUIState$1.F$0 = f;
            cityDiscontinuedUIStateFactory$convertToUIState$1.label = 4;
            objB2 = stringProvider.b(StringEnum.SUPPORTED_CITIES, new Object[0], cityDiscontinuedUIStateFactory$convertToUIState$1);
            if (objB2 == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            function4 = function3;
            discontinuedTextViewsUIState2 = discontinuedTextViewsUIState;
            toolbarUIState6 = toolbarUIState5;
        } else if (i2 == 3) {
            chaloTextUIState4 = (TextUIState.ChaloTextUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$4;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$3;
            ImageUIState imageUIState4 = (ImageUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$2;
            ToolbarUIState toolbarUIState9 = (ToolbarUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$1;
            Function1 function5 = (Function1) cityDiscontinuedUIStateFactory$convertToUIState$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState3 = chaloTextUIState5;
            imageUIState = imageUIState4;
            toolbarUIState4 = toolbarUIState9;
            function3 = function5;
            coroutineSingletons = coroutineSingletons3;
            stringProvider = stringProvider2;
            coroutineSingletons2 = coroutineSingletons;
            toolbarUIState5 = toolbarUIState4;
            discontinuedTextViewsUIState = new DiscontinuedTextViewsUIState(chaloTextUIState3, chaloTextUIState4, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black_60, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
            f = ChaloThemeHelper.a().v;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$0 = function3;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$1 = toolbarUIState5;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$2 = imageUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$3 = discontinuedTextViewsUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$4 = null;
            cityDiscontinuedUIStateFactory$convertToUIState$1.F$0 = f;
            cityDiscontinuedUIStateFactory$convertToUIState$1.label = 4;
            objB2 = stringProvider.b(StringEnum.SUPPORTED_CITIES, new Object[0], cityDiscontinuedUIStateFactory$convertToUIState$1);
            if (objB2 == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            function4 = function3;
            discontinuedTextViewsUIState2 = discontinuedTextViewsUIState;
            toolbarUIState6 = toolbarUIState5;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = cityDiscontinuedUIStateFactory$convertToUIState$1.F$0;
            discontinuedTextViewsUIState2 = (DiscontinuedTextViewsUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$3;
            imageUIState = (ImageUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$2;
            toolbarUIState6 = (ToolbarUIState) cityDiscontinuedUIStateFactory$convertToUIState$1.L$1;
            function4 = (Function1) cityDiscontinuedUIStateFactory$convertToUIState$1.L$0;
            ResultKt.b(objB2);
        }
        UITextStyle uITextStyle = UITextStyle.HeadlineSmall;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        return new CityDiscontinuedUIState(toolbarUIState6, imageUIState, discontinuedTextViewsUIState2, new SupportedCitiesButtonUIState(f, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), false, UIShape.b, null, new ButtonUIColor(ChaloColorToken.Transparent.f9864a, 2), UiEventHandler.Companion.a(new ii(function4, 28)), 0.0f, new ButtonBorderUISpec(ChaloThemeHelper.a().b, orangePrimary), 74)));
        TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7994);
        StringEnum stringEnum = StringEnum.CITY_DISCONTINUED_DESCRIPTION;
        String str = cityDiscontinuedDataState2.f6553a;
        if (str == null) {
            str = "";
        }
        cityDiscontinuedUIStateFactory$convertToUIState$1.L$0 = function2;
        cityDiscontinuedUIStateFactory$convertToUIState$1.L$1 = toolbarUIState;
        cityDiscontinuedUIStateFactory$convertToUIState$1.L$2 = imageUIState;
        cityDiscontinuedUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState6;
        cityDiscontinuedUIStateFactory$convertToUIState$1.label = 2;
        Object objB3 = stringProvider2.b(stringEnum, new Object[]{str}, cityDiscontinuedUIStateFactory$convertToUIState$1);
        if (objB3 != coroutineSingletons3) {
            toolbarUIState2 = toolbarUIState;
            chaloTextUIState = chaloTextUIState6;
            objB2 = objB3;
            toolbarUIState3 = toolbarUIState2;
            function3 = function2;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black_60, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$0 = function3;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$1 = toolbarUIState3;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$2 = imageUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState2;
            cityDiscontinuedUIStateFactory$convertToUIState$1.label = 3;
            stringProvider = stringProvider2;
            objB = stringProvider.b(StringEnum.CITY_DISCONTINUED_SUPPORTING_TEXT, new Object[0], cityDiscontinuedUIStateFactory$convertToUIState$1);
            coroutineSingletons = coroutineSingletons3;
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextUIState3 = chaloTextUIState;
            chaloTextUIState4 = chaloTextUIState2;
            toolbarUIState4 = toolbarUIState3;
            objB2 = objB;
            coroutineSingletons2 = coroutineSingletons;
            toolbarUIState5 = toolbarUIState4;
            discontinuedTextViewsUIState = new DiscontinuedTextViewsUIState(chaloTextUIState3, chaloTextUIState4, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black_60, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
            f = ChaloThemeHelper.a().v;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$0 = function3;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$1 = toolbarUIState5;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$2 = imageUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$3 = discontinuedTextViewsUIState;
            cityDiscontinuedUIStateFactory$convertToUIState$1.L$4 = null;
            cityDiscontinuedUIStateFactory$convertToUIState$1.F$0 = f;
            cityDiscontinuedUIStateFactory$convertToUIState$1.label = 4;
            objB2 = stringProvider.b(StringEnum.SUPPORTED_CITIES, new Object[0], cityDiscontinuedUIStateFactory$convertToUIState$1);
            if (objB2 == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            function4 = function3;
            discontinuedTextViewsUIState2 = discontinuedTextViewsUIState;
            toolbarUIState6 = toolbarUIState5;
            UITextStyle uITextStyle2 = UITextStyle.HeadlineSmall;
            ChaloColorToken.OrangePrimary orangePrimary2 = ChaloColorToken.OrangePrimary.f9835a;
            return new CityDiscontinuedUIState(toolbarUIState6, imageUIState, discontinuedTextViewsUIState2, new SupportedCitiesButtonUIState(f, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle2, orangePrimary2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), false, UIShape.b, null, new ButtonUIColor(ChaloColorToken.Transparent.f9864a, 2), UiEventHandler.Companion.a(new ii(function4, 28)), 0.0f, new ButtonBorderUISpec(ChaloThemeHelper.a().b, orangePrimary2), 74)));
        }
        return coroutineSingletons3;
    }
}
