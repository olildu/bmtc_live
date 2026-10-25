package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.ridehailing.common.RideHailingUIStateCommonFactory;
import app.chalo.ridehailing.data.app.PostRideFeedbackSubtagConfigData;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.button.ButtonBorderUISpec;
import app.chalo.uistate.button.ButtonUIColor;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.color.ColorGradiantUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.GifImageUIState;
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
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basicWithCharConstraint$3;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIKeyboardCapitalization;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.o01;
import defpackage.p01;
import defpackage.s01;
import defpackage.t11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackCommonUIStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackCommonUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f9136a;

    public RideFeedbackCommonUIStateFactory(StringProvider stringProvider) {
        this.f9136a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(boolean z, List list, String str, Set set, Function1 function1, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1;
        Object next;
        UserFeedbackRatingData userFeedbackRatingData;
        RideFeedbackUserRatingCardUIState rideFeedbackUserRatingCardUIState;
        RideFeedbackUserRatingCardUIState rideFeedbackUserRatingCardUIState2;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1 = (RideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1(this, continuationImpl);
        }
        RideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2 = rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$1;
        Object objD = rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.label;
        RideFeedbackReasonCardUIState rideFeedbackReasonCardUIState = null;
        if (i2 != 0) {
            if (i2 == 1) {
                userFeedbackRatingData = (UserFeedbackRatingData) rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$3;
                function1 = (Function1) rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$2;
                set = (Set) rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$1;
                str = (String) rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$0;
                ResultKt.b(objD);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rideFeedbackUserRatingCardUIState2 = (RideFeedbackUserRatingCardUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$0;
                ResultKt.b(objD);
            }
            rideFeedbackReasonCardUIState = (RideFeedbackReasonCardUIState) objD;
            rideFeedbackUserRatingCardUIState = rideFeedbackUserRatingCardUIState2;
            return new RideFeedbackContentUIState(rideFeedbackUserRatingCardUIState, rideFeedbackReasonCardUIState);
        }
        ResultKt.b(objD);
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((UserFeedbackRatingData) next).c);
        UserFeedbackRatingData userFeedbackRatingData2 = (UserFeedbackRatingData) next;
        s01 s01Var = new s01(function1, 7);
        rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$0 = str;
        rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$1 = set;
        rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$2 = function1;
        rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$3 = userFeedbackRatingData2;
        rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.label = 1;
        Object objG = g(z, list, s01Var, rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2);
        if (objG != obj) {
            objD = objG;
            userFeedbackRatingData = userFeedbackRatingData2;
        }
        return obj;
        String str2 = str;
        rideFeedbackUserRatingCardUIState = (RideFeedbackUserRatingCardUIState) objD;
        if (userFeedbackRatingData != null) {
            s01 s01Var2 = new s01(function1, 9);
            s01 s01Var3 = new s01(function1, 10);
            s01 s01Var4 = new s01(function1, 11);
            rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$0 = rideFeedbackUserRatingCardUIState;
            rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$1 = null;
            rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$2 = null;
            rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.L$3 = null;
            rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2.label = 2;
            objD = d(userFeedbackRatingData, str2, set, s01Var2, s01Var3, s01Var4, rideFeedbackCommonUIStateFactory$getRideFeedbackContentUIState$2);
            if (objD != obj) {
                rideFeedbackUserRatingCardUIState2 = rideFeedbackUserRatingCardUIState;
                rideFeedbackReasonCardUIState = (RideFeedbackReasonCardUIState) objD;
                rideFeedbackUserRatingCardUIState = rideFeedbackUserRatingCardUIState2;
            }
            return obj;
        }
        return new RideFeedbackContentUIState(rideFeedbackUserRatingCardUIState, rideFeedbackReasonCardUIState);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(t11 t11Var, t11 t11Var2, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1;
        ButtonUIState buttonUIStateG;
        Function0 function0;
        ButtonUIStateFactory buttonUIStateFactory;
        Function0 function1;
        Function0 function2 = t11Var;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1 = (RideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1(this, continuationImpl);
        }
        Object objB = rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.label;
        StringProvider stringProvider = this.f9136a;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        if (i2 != 0) {
            if (i2 == 1) {
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$2;
                function0 = (Function0) rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$1;
                Function0 function3 = (Function0) rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$0;
                ResultKt.b(objB);
                buttonUIStateFactory = buttonUIStateFactory3;
                function2 = function3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                buttonUIStateFactory2 = (ButtonUIStateFactory) rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$2;
                buttonUIStateG = (ButtonUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$1;
                function1 = (Function0) rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$0;
                ResultKt.b(objB);
            }
            return new RideFeedbackCtaUIState(buttonUIStateG, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB, new o01(function1, 2), UIShape.e, false, 52));
        }
        ResultKt.b(objB);
        if (function2 != null) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$0 = function2;
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$1 = t11Var2;
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$2 = buttonUIStateFactory2;
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.SUBMIT_SMALL, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1);
            if (objB != coroutineSingletons) {
                buttonUIStateFactory = buttonUIStateFactory2;
                function0 = t11Var2;
            }
        } else {
            buttonUIStateG = null;
            function0 = t11Var2;
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$0 = function0;
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$1 = buttonUIStateG;
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$2 = buttonUIStateFactory2;
            rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.label = 2;
            objB = stringProvider.b(StringEnum.SKIP, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1);
            if (objB != coroutineSingletons) {
                function1 = function0;
                return new RideFeedbackCtaUIState(buttonUIStateG, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB, new o01(function1, 2), UIShape.e, false, 52));
            }
        }
        return coroutineSingletons;
        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new o01(function2, 5), null, UIShape.e, false, 0.0f, 52);
        rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$0 = function0;
        rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$1 = buttonUIStateG;
        rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.L$2 = buttonUIStateFactory2;
        rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.SKIP, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackCtaUIState$1);
        if (objB != coroutineSingletons) {
            function1 = function0;
            return new RideFeedbackCtaUIState(buttonUIStateG, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB, new o01(function1, 2), UIShape.e, false, 52));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(Function0 function0, Function0 function1, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1;
        Function0 function2;
        Function0 function3;
        UiEventHandler uiEventHandler;
        Function0 function4;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1 = (RideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1(this, continuationImpl);
        }
        Object objB = rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.label;
        StringProvider stringProvider = this.f9136a;
        if (i2 == 0) {
            ResultKt.b(objB);
            rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$0 = function0;
            rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$1 = function1;
            rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.label = 1;
            objB = stringProvider.b(StringEnum.TRIP_DETAILS, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1);
            if (objB != coroutineSingletons) {
                function2 = function0;
                function3 = function1;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            function3 = (Function0) rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$1;
            function2 = (Function0) rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uiEventHandler = (UiEventHandler) rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$2;
            textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$1;
            function4 = (Function0) rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$0;
            ResultKt.b(objB);
        }
        return new RideFeedbackHeaderCtaUISState(textWithLeftAndRightIconUIState, new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.TitleLarge, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), new ImageUIState(IconType.ICON_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9), uiEventHandler, UiEventHandler.Companion.a(new o01(function4, 4)));
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState2 = new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.TitleLarge, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), new ImageUIState(IconType.IC_NEXT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9);
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new o01(function2, 3));
        rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$0 = function3;
        rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$1 = textWithLeftAndRightIconUIState2;
        rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.L$2 = uiEventHandler$Companion$fromLambda$1A;
        rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.HELP, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackHeaderCtaUISState$1);
        if (objB2 != coroutineSingletons) {
            uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
            objB = objB2;
            function4 = function3;
            textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState2;
            return new RideFeedbackHeaderCtaUISState(textWithLeftAndRightIconUIState, new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.TitleLarge, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), new ImageUIState(IconType.ICON_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9), uiEventHandler, UiEventHandler.Companion.a(new o01(function4, 4)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0204  */
    /* JADX WARN: Code duplicated, block: B:67:0x0207  */
    /* JADX WARN: Code duplicated, block: B:70:0x0233  */
    /* JADX WARN: Code duplicated, block: B:72:0x028b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(UserFeedbackRatingData userFeedbackRatingData, String str, Set set, s01 s01Var, s01 s01Var2, s01 s01Var3, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1;
        Object next;
        Function1 function1;
        UserFeedbackRatingData userFeedbackRatingData2;
        boolean z;
        TextUIState.ChaloTextUIState chaloTextUIState;
        List list;
        RideFeedbackSubtagCardUIState rideFeedbackSubtagCardUIState;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        List list2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        Function1 function2;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        TextFieldEventHandlerHelper$basicWithCharConstraint$3 textFieldEventHandlerHelper$basicWithCharConstraint$3C;
        UITextStyle uITextStyle;
        List list3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        String str3;
        TextFieldEventHandler textFieldEventHandler;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1 = (RideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1(this, continuationImpl);
        }
        Object objB = rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label;
        StringProvider stringProvider = this.f9136a;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                z = rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.Z$0;
                list2 = (List) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3;
                Function1 function3 = (Function1) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2;
                str2 = (String) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1;
                userFeedbackRatingData2 = (UserFeedbackRatingData) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0;
                ResultKt.b(objB);
                function1 = function3;
            } else {
                if (i2 == 2) {
                    z = rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.Z$0;
                    rideFeedbackSubtagCardUIState = (RideFeedbackSubtagCardUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4;
                    list = (List) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3;
                    chaloTextUIState = (TextUIState.ChaloTextUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2;
                    function2 = (Function1) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1;
                    str2 = (String) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0;
                    ResultKt.b(objB);
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    function1 = function2;
                    if (z) {
                        textFieldEventHandlerHelper$basicWithCharConstraint$3C = TextFieldEventHandlerHelper.c(200, new s01(function1, 8));
                        uITextStyle = UITextStyle.BodyMedium;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = str2;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = uITextStyle;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = chaloTextUIState;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = list;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$5 = rideFeedbackSubtagCardUIState;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$6 = chaloTextUIState3;
                        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 3;
                        objB = stringProvider.b(StringEnum.TELL_US_MORE, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
                        if (objB != obj) {
                            list3 = list;
                            chaloTextUIState4 = chaloTextUIState;
                            str3 = str2;
                            textFieldEventHandler = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                            chaloTextUIState5 = chaloTextUIState3;
                        }
                        return obj;
                    }
                    textFieldUIState = null;
                    return new RideFeedbackReasonCardUIState(chaloTextUIState, list, rideFeedbackSubtagCardUIState, chaloTextUIState3, textFieldUIState);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$6;
                rideFeedbackSubtagCardUIState = (RideFeedbackSubtagCardUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$5;
                List list4 = (List) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3;
                uITextStyle = (UITextStyle) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2;
                TextFieldEventHandler textFieldEventHandler2 = (TextFieldEventHandler) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1;
                String str4 = (String) rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0;
                ResultKt.b(objB);
                list3 = list4;
                chaloTextUIState4 = chaloTextUIState6;
                textFieldEventHandler = textFieldEventHandler2;
                str3 = str4;
            }
            chaloTextUIState3 = chaloTextUIState5;
            textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str3, textFieldEventHandler, uITextStyle, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, new UIKeyboardOption(UIKeyboardCapitalization.Sentences, UIKeyboardType.Text, null, 4), 0, UIShape.d, null, ChaloThemeHelper.a().s, 41900);
            list = list3;
            chaloTextUIState = chaloTextUIState4;
            return new RideFeedbackReasonCardUIState(chaloTextUIState, list, rideFeedbackSubtagCardUIState, chaloTextUIState3, textFieldUIState);
        }
        ResultKt.b(objB);
        Iterator it = userFeedbackRatingData.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((UserFeedbackReasonData) next).c);
        UserFeedbackReasonData userFeedbackReasonData = (UserFeedbackReasonData) next;
        boolean zA = RideFeedbackContractKt.a(userFeedbackReasonData, set);
        TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState(userFeedbackRatingData.f9173a, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
        List<UserFeedbackReasonData> list5 = userFeedbackRatingData.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
        for (UserFeedbackReasonData userFeedbackReasonData2 : list5) {
            String str5 = userFeedbackReasonData2.b;
            boolean z2 = userFeedbackReasonData2.c;
            arrayList.add(new ButtonUIState(new TextUIState.ChaloTextUIState(str5, z2 ? UITextStyle.TitleLarge : UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), false, UIShape.c, null, new ButtonUIColor(z2 ? ChaloColorToken.CornSilk.f9778a : ChaloColorToken.Transparent.f9864a, i3), UiEventHandler.Companion.a(new p01(12, s01Var, userFeedbackReasonData2)), ChaloThemeHelper.a().k, new ButtonBorderUISpec(ChaloThemeHelper.a().b, z2 ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.LightGray.f9814a), 10));
            i3 = 2;
        }
        if (userFeedbackReasonData != null) {
            List list6 = userFeedbackReasonData.e;
            if (list6.isEmpty()) {
                list6 = null;
            }
            if (list6 != null) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = userFeedbackRatingData;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = str;
                function1 = s01Var3;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = function1;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = chaloTextUIState7;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = arrayList;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.Z$0 = zA;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 1;
                Object objE = e(list6, set, s01Var2, rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
                if (objE != obj) {
                    userFeedbackRatingData2 = userFeedbackRatingData;
                    z = zA;
                    chaloTextUIState2 = chaloTextUIState7;
                    objB = objE;
                    str2 = str;
                    list2 = arrayList;
                }
            }
            return obj;
        }
        function1 = s01Var3;
        userFeedbackRatingData2 = userFeedbackRatingData;
        z = zA;
        chaloTextUIState = chaloTextUIState7;
        list = arrayList;
        rideFeedbackSubtagCardUIState = null;
        str2 = str;
        if (!z) {
            userFeedbackRatingData2 = null;
        }
        if (userFeedbackRatingData2 != null) {
            chaloTextUIState3 = null;
            if (z) {
                textFieldEventHandlerHelper$basicWithCharConstraint$3C = TextFieldEventHandlerHelper.c(200, new s01(function1, 8));
                uITextStyle = UITextStyle.BodyMedium;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = str2;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = uITextStyle;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = chaloTextUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = list;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$5 = rideFeedbackSubtagCardUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$6 = chaloTextUIState3;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.TELL_US_MORE, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
                if (objB != obj) {
                    list3 = list;
                    chaloTextUIState4 = chaloTextUIState;
                    str3 = str2;
                    textFieldEventHandler = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                    chaloTextUIState5 = chaloTextUIState3;
                    chaloTextUIState3 = chaloTextUIState5;
                    textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str3, textFieldEventHandler, uITextStyle, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, new UIKeyboardOption(UIKeyboardCapitalization.Sentences, UIKeyboardType.Text, null, 4), 0, UIShape.d, null, ChaloThemeHelper.a().s, 41900);
                    list = list3;
                    chaloTextUIState = chaloTextUIState4;
                }
            } else {
                textFieldUIState = null;
            }
            return new RideFeedbackReasonCardUIState(chaloTextUIState, list, rideFeedbackSubtagCardUIState, chaloTextUIState3, textFieldUIState);
        }
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = str2;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = function1;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = chaloTextUIState;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = list;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = rideFeedbackSubtagCardUIState;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.Z$0 = z;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.ANYTHING_ELSE_TO_ADD_OPTIONAL, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
        if (objB != obj) {
            function2 = function1;
            chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
            function1 = function2;
            if (z) {
                textFieldEventHandlerHelper$basicWithCharConstraint$3C = TextFieldEventHandlerHelper.c(200, new s01(function1, 8));
                uITextStyle = UITextStyle.BodyMedium;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = str2;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = uITextStyle;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = chaloTextUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = list;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$5 = rideFeedbackSubtagCardUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$6 = chaloTextUIState3;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.TELL_US_MORE, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
                if (objB != obj) {
                    list3 = list;
                    chaloTextUIState4 = chaloTextUIState;
                    str3 = str2;
                    textFieldEventHandler = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                    chaloTextUIState5 = chaloTextUIState3;
                    chaloTextUIState3 = chaloTextUIState5;
                    textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str3, textFieldEventHandler, uITextStyle, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, new UIKeyboardOption(UIKeyboardCapitalization.Sentences, UIKeyboardType.Text, null, 4), 0, UIShape.d, null, ChaloThemeHelper.a().s, 41900);
                    list = list3;
                    chaloTextUIState = chaloTextUIState4;
                }
            } else {
                textFieldUIState = null;
            }
            return new RideFeedbackReasonCardUIState(chaloTextUIState, list, rideFeedbackSubtagCardUIState, chaloTextUIState3, textFieldUIState);
        }
        return obj;
        chaloTextUIState = chaloTextUIState2;
        list = list2;
        rideFeedbackSubtagCardUIState = (RideFeedbackSubtagCardUIState) objB;
        if (!z) {
            userFeedbackRatingData2 = null;
        }
        if (userFeedbackRatingData2 != null) {
            chaloTextUIState3 = null;
            if (z) {
                textFieldEventHandlerHelper$basicWithCharConstraint$3C = TextFieldEventHandlerHelper.c(200, new s01(function1, 8));
                uITextStyle = UITextStyle.BodyMedium;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = str2;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = uITextStyle;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = chaloTextUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = list;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$5 = rideFeedbackSubtagCardUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$6 = chaloTextUIState3;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.TELL_US_MORE, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
                if (objB != obj) {
                    list3 = list;
                    chaloTextUIState4 = chaloTextUIState;
                    str3 = str2;
                    textFieldEventHandler = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                    chaloTextUIState5 = chaloTextUIState3;
                    chaloTextUIState3 = chaloTextUIState5;
                    textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str3, textFieldEventHandler, uITextStyle, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, new UIKeyboardOption(UIKeyboardCapitalization.Sentences, UIKeyboardType.Text, null, 4), 0, UIShape.d, null, ChaloThemeHelper.a().s, 41900);
                    list = list3;
                    chaloTextUIState = chaloTextUIState4;
                }
            } else {
                textFieldUIState = null;
            }
            return new RideFeedbackReasonCardUIState(chaloTextUIState, list, rideFeedbackSubtagCardUIState, chaloTextUIState3, textFieldUIState);
        }
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = str2;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = function1;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = chaloTextUIState;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = list;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = rideFeedbackSubtagCardUIState;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.Z$0 = z;
        rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.ANYTHING_ELSE_TO_ADD_OPTIONAL, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
        if (objB != obj) {
            function2 = function1;
            chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
            function1 = function2;
            if (z) {
                textFieldEventHandlerHelper$basicWithCharConstraint$3C = TextFieldEventHandlerHelper.c(200, new s01(function1, 8));
                uITextStyle = UITextStyle.BodyMedium;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$0 = str2;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$1 = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$2 = uITextStyle;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$3 = chaloTextUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$4 = list;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$5 = rideFeedbackSubtagCardUIState;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.L$6 = chaloTextUIState3;
                rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.TELL_US_MORE, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackReasonCardUIState$1);
                if (objB != obj) {
                    list3 = list;
                    chaloTextUIState4 = chaloTextUIState;
                    str3 = str2;
                    textFieldEventHandler = textFieldEventHandlerHelper$basicWithCharConstraint$3C;
                    chaloTextUIState5 = chaloTextUIState3;
                    chaloTextUIState3 = chaloTextUIState5;
                    textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str3, textFieldEventHandler, uITextStyle, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, new UIKeyboardOption(UIKeyboardCapitalization.Sentences, UIKeyboardType.Text, null, 4), 0, UIShape.d, null, ChaloThemeHelper.a().s, 41900);
                    list = list3;
                    chaloTextUIState = chaloTextUIState4;
                }
            } else {
                textFieldUIState = null;
            }
            return new RideFeedbackReasonCardUIState(chaloTextUIState, list, rideFeedbackSubtagCardUIState, chaloTextUIState3, textFieldUIState);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(List list, Set set, Function1 function1, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1;
        List list2;
        Set set2;
        Function1 function2;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1 = (RideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1(this, continuationImpl);
        }
        Object objB = rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.L$0 = list;
            rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.L$1 = set;
            rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.L$2 = function1;
            rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.label = 1;
            objB = this.f9136a.b(StringEnum.WHAT_WAS_THE_ISSUE, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = list;
            set2 = set;
            function2 = function1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function1) rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.L$2;
            set2 = (Set) rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.L$1;
            list2 = (List) rideFeedbackCommonUIStateFactory$getRideFeedbackSubtagCardUIState$1.L$0;
            ResultKt.b(objB);
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
        List<PostRideFeedbackSubtagConfigData> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
        for (PostRideFeedbackSubtagConfigData postRideFeedbackSubtagConfigData : list3) {
            boolean zContains = set2.contains(postRideFeedbackSubtagConfigData.f9104a);
            arrayList.add(new ButtonUIState(new TextUIState.ChaloTextUIState(postRideFeedbackSubtagConfigData.b, zContains ? UITextStyle.TitleLarge : UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), false, UIShape.c, null, new ButtonUIColor(zContains ? ChaloColorToken.CornSilk.f9778a : ChaloColorToken.Transparent.f9864a, 2), UiEventHandler.Companion.a(new p01(11, function2, postRideFeedbackSubtagConfigData)), ChaloThemeHelper.a().k, new ButtonBorderUISpec(ChaloThemeHelper.a().b, zContains ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.LightGray.f9814a), 10));
        }
        return new RideFeedbackSubtagCardUIState(chaloTextUIState, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(Function1 function1, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1;
        GifImageUIState gifImageUIState;
        Function1 function2;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1 = (RideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1(this, continuationImpl);
        }
        Object obj = rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            GifImageUIState gifImageUIState2 = new GifImageUIState(LottieType.VALIDATION_SUCCESS_LOTTIE, 1, new ImageUISize(ChaloThemeHelper.a().r0));
            rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.L$0 = function1;
            rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.L$1 = gifImageUIState2;
            rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.label = 1;
            Object objB = this.f9136a.b(StringEnum.THANK_YOU_FOR_YOUR_FEEDBACK, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            gifImageUIState = gifImageUIState2;
            obj = objB;
            function2 = function1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gifImageUIState = (GifImageUIState) rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.L$1;
            function2 = (Function1) rideFeedbackCommonUIStateFactory$getRideFeedbackThankYouUIState$1.L$0;
            ResultKt.b(obj);
        }
        return new RideFeedbackThankYouUIState(gifImageUIState, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, UITextAlign.Center, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7964), UiEventHandler.Companion.a(new t11(function2, 12)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(boolean z, List list, s01 s01Var, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1 rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1;
        List list2;
        Function1 function1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ArrayList arrayList;
        boolean z2;
        RatingReaction ratingReaction;
        ChaloColorToken chaloColorToken;
        ChaloColorToken chaloColorToken2;
        DrawType icon;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1) {
            rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1 = (RideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1 = new RideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1(this, continuationImpl);
        }
        Object objB = rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (z) {
                rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.L$0 = list;
                rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.L$1 = s01Var;
                rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.label = 1;
                objB = this.f9136a.b(StringEnum.RIDE_FEEDBACK_HEADER_TITLE, new Object[0], rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list2 = list;
                function1 = s01Var;
            } else {
                list2 = list;
                function1 = s01Var;
                chaloTextUIState = null;
            }
            List<UserFeedbackRatingData> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            for (UserFeedbackRatingData userFeedbackRatingData : list3) {
                float f = ChaloThemeHelper.a().b;
                z2 = userFeedbackRatingData.c;
                ratingReaction = userFeedbackRatingData.b;
                if (z2) {
                    chaloColorToken = ChaloColorToken.OrangePrimary.f9835a;
                } else {
                    chaloColorToken = ChaloColorToken.Transparent.f9864a;
                }
                BorderUISpec borderUISpec = new BorderUISpec(f, chaloColorToken, UIShape.Circle.p);
                float f2 = ChaloThemeHelper.a().d;
                ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
                if (z2) {
                    chaloColorToken2 = ChaloColorToken.CornSilk.f9778a;
                } else {
                    chaloColorToken2 = ChaloColorToken.LightGrey.f9815a;
                }
                ImageWithBorderUISpecs imageWithBorderUISpecs = new ImageWithBorderUISpecs(borderUISpec, chaloPadding, chaloColorToken2);
                if (z2) {
                    icon = new DrawType.Gif(new GifImageUIState(RideHailingUIStateCommonFactory.Companion.b(ratingReaction), 1, new ImageUISize(ChaloThemeHelper.a().m)));
                } else {
                    icon = new DrawType.Icon(new ImageUIState(RideHailingUIStateCommonFactory.Companion.a(ratingReaction), (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
                }
                arrayList.add(new ImageWithBorderUIState(imageWithBorderUISpecs, icon, UiEventHandler.Companion.a(new p01(13, function1, userFeedbackRatingData))));
            }
            return new RideFeedbackUserRatingCardUIState(chaloTextUIState, arrayList);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1 = (Function1) rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.L$1;
        list2 = (List) rideFeedbackCommonUIStateFactory$getRideFeedbackUserRatingCardUIState$1.L$0;
        ResultKt.b(objB);
        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        List<UserFeedbackRatingData> list4 = list2;
        arrayList = new ArrayList(CollectionsKt.v(list4, 10));
        while (r2.hasNext()) {
            float f3 = ChaloThemeHelper.a().b;
            z2 = userFeedbackRatingData.c;
            ratingReaction = userFeedbackRatingData.b;
            if (z2) {
                chaloColorToken = ChaloColorToken.OrangePrimary.f9835a;
            } else {
                chaloColorToken = ChaloColorToken.Transparent.f9864a;
            }
            BorderUISpec borderUISpec2 = new BorderUISpec(f3, chaloColorToken, UIShape.Circle.p);
            float f4 = ChaloThemeHelper.a().d;
            ChaloPadding chaloPadding2 = new ChaloPadding(f4, f4, f4, f4);
            if (z2) {
                chaloColorToken2 = ChaloColorToken.CornSilk.f9778a;
            } else {
                chaloColorToken2 = ChaloColorToken.LightGrey.f9815a;
            }
            ImageWithBorderUISpecs imageWithBorderUISpecs2 = new ImageWithBorderUISpecs(borderUISpec2, chaloPadding2, chaloColorToken2);
            if (z2) {
                icon = new DrawType.Gif(new GifImageUIState(RideHailingUIStateCommonFactory.Companion.b(ratingReaction), 1, new ImageUISize(ChaloThemeHelper.a().m)));
            } else {
                icon = new DrawType.Icon(new ImageUIState(RideHailingUIStateCommonFactory.Companion.a(ratingReaction), (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
            }
            arrayList.add(new ImageWithBorderUIState(imageWithBorderUISpecs2, icon, UiEventHandler.Companion.a(new p01(13, function1, userFeedbackRatingData))));
        }
        return new RideFeedbackUserRatingCardUIState(chaloTextUIState, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0148  */
    /* JADX WARN: Code duplicated, block: B:40:0x0169  */
    /* JADX WARN: Code duplicated, block: B:43:0x017a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0205  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:0: B:47:0x0188->B:70:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object h(boolean z, RideFeedbackDataState rideFeedbackDataState, RideFeedbackToolbarUIState rideFeedbackToolbarUIState, RideFeedbackHeaderUIState rideFeedbackHeaderUIState, Function1 function1, ContinuationImpl continuationImpl) {
        RideFeedbackCommonUIStateFactory$getViewState$1 rideFeedbackCommonUIStateFactory$getViewState$1;
        RideFeedbackViewSpecs rideFeedbackViewSpecs;
        RideFeedbackToolbarUIState rideFeedbackToolbarUIState2;
        LoadingDialogUIState loadingDialogUIStateA;
        RideFeedbackHeaderUIState rideFeedbackHeaderUIState2;
        Function1 function2;
        RideFeedbackDataState rideFeedbackDataState2;
        DialogUIStateFactory dialogUIStateFactory;
        RideFeedbackViewSpecs rideFeedbackViewSpecs2;
        RideFeedbackStep rideFeedbackStep;
        String str;
        Function1 function3;
        RideFeedbackStep rideFeedbackStep2;
        RideFeedbackHeaderUIState rideFeedbackHeaderUIState3;
        RideFeedbackToolbarUIState rideFeedbackToolbarUIState3;
        RideFeedbackDataState rideFeedbackDataState3;
        RideFeedbackViewSpecs rideFeedbackViewSpecs3;
        Function1 function4;
        LoadingDialogUIState loadingDialogUIState;
        RideFeedbackContentUIState rideFeedbackContentUIState;
        List list;
        Iterator it;
        t11 t11Var;
        Object objB;
        RideFeedbackHeaderUIState rideFeedbackHeaderUIState4;
        RideFeedbackStep rideFeedbackStep3;
        RideFeedbackToolbarUIState rideFeedbackToolbarUIState4;
        RideFeedbackContentUIState rideFeedbackContentUIState2;
        LoadingDialogUIState loadingDialogUIState2;
        RideFeedbackCtaUIState rideFeedbackCtaUIState;
        RideFeedbackStep rideFeedbackStep4;
        RideFeedbackCtaUIState rideFeedbackCtaUIState2;
        RideFeedbackThankYouUIState rideFeedbackThankYouUIState;
        RideFeedbackViewSpecs rideFeedbackViewSpecs4;
        Object objF;
        RideFeedbackStep rideFeedbackStep5;
        RideFeedbackCtaUIState rideFeedbackCtaUIState3;
        RideFeedbackViewSpecs rideFeedbackViewSpecs5;
        boolean z2 = z;
        if (continuationImpl instanceof RideFeedbackCommonUIStateFactory$getViewState$1) {
            rideFeedbackCommonUIStateFactory$getViewState$1 = (RideFeedbackCommonUIStateFactory$getViewState$1) continuationImpl;
            int i = rideFeedbackCommonUIStateFactory$getViewState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackCommonUIStateFactory$getViewState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackCommonUIStateFactory$getViewState$1 = new RideFeedbackCommonUIStateFactory$getViewState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackCommonUIStateFactory$getViewState$1 = new RideFeedbackCommonUIStateFactory$getViewState$1(this, continuationImpl);
        }
        RideFeedbackCommonUIStateFactory$getViewState$1 rideFeedbackCommonUIStateFactory$getViewState$2 = rideFeedbackCommonUIStateFactory$getViewState$1;
        Object objB2 = rideFeedbackCommonUIStateFactory$getViewState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackCommonUIStateFactory$getViewState$2.label;
        if (i2 == 0) {
            ResultKt.b(objB2);
            if (z2) {
                ChaloColorToken.White white = ChaloColorToken.White.f9870a;
                rideFeedbackViewSpecs = new RideFeedbackViewSpecs(new RideFeedbackGridBackgroundUIState(new ColorGradiantUiState.Linear(CollectionsKt.S(white, ChaloColorToken.GreenBase.f9800a, white)), ChaloThemeHelper.a().b));
            } else {
                rideFeedbackViewSpecs = new RideFeedbackViewSpecs(null);
            }
            if (rideFeedbackDataState.d) {
                rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackDataState;
                rideFeedbackToolbarUIState2 = rideFeedbackToolbarUIState;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = rideFeedbackToolbarUIState2;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackHeaderUIState;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = function1;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackViewSpecs;
                DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = dialogUIStateFactory2;
                rideFeedbackCommonUIStateFactory$getViewState$2.Z$0 = z2;
                rideFeedbackCommonUIStateFactory$getViewState$2.label = 1;
                objB2 = this.f9136a.b(StringEnum.LOADING, new Object[0], rideFeedbackCommonUIStateFactory$getViewState$2);
                if (objB2 != obj) {
                    rideFeedbackHeaderUIState2 = rideFeedbackHeaderUIState;
                    function2 = function1;
                    rideFeedbackDataState2 = rideFeedbackDataState;
                    dialogUIStateFactory = dialogUIStateFactory2;
                }
            } else {
                rideFeedbackToolbarUIState2 = rideFeedbackToolbarUIState;
                loadingDialogUIStateA = null;
                rideFeedbackHeaderUIState2 = rideFeedbackHeaderUIState;
                function2 = function1;
                rideFeedbackDataState2 = rideFeedbackDataState;
                rideFeedbackViewSpecs2 = rideFeedbackViewSpecs;
                rideFeedbackStep = rideFeedbackDataState2.f;
                List list2 = rideFeedbackDataState2.b;
                str = rideFeedbackDataState2.c;
                if (str == null) {
                    str = "";
                }
                Set set = rideFeedbackDataState2.e;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackDataState2;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = function2;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackViewSpecs2;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = loadingDialogUIStateA;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackStep;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackToolbarUIState2;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackHeaderUIState2;
                rideFeedbackCommonUIStateFactory$getViewState$2.label = 2;
                function3 = function2;
                objB2 = a(z2, list2, str, set, function3, rideFeedbackCommonUIStateFactory$getViewState$2);
                if (objB2 != obj) {
                    rideFeedbackStep2 = rideFeedbackStep;
                    rideFeedbackHeaderUIState3 = rideFeedbackHeaderUIState2;
                    rideFeedbackToolbarUIState3 = rideFeedbackToolbarUIState2;
                    rideFeedbackDataState3 = rideFeedbackDataState2;
                    rideFeedbackViewSpecs3 = rideFeedbackViewSpecs2;
                    function4 = function3;
                    loadingDialogUIState = loadingDialogUIStateA;
                    rideFeedbackContentUIState = (RideFeedbackContentUIState) objB2;
                    list = rideFeedbackDataState3.b;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t11Var = null;
                                break;
                            }
                            if (((UserFeedbackRatingData) it.next()).c) {
                                t11Var = new t11(function4, 10);
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t11Var = null;
                                break;
                            }
                            if (((UserFeedbackRatingData) it.next()).c) {
                                t11Var = new t11(function4, 10);
                                break;
                            }
                        }
                    }
                    t11 t11Var2 = new t11(function4, 11);
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackDataState3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = function4;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackViewSpecs3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = loadingDialogUIState;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackStep2;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackToolbarUIState3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackHeaderUIState3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$7 = rideFeedbackContentUIState;
                    rideFeedbackCommonUIStateFactory$getViewState$2.label = 3;
                    objB = b(t11Var, t11Var2, rideFeedbackCommonUIStateFactory$getViewState$2);
                    if (objB != obj) {
                        RideFeedbackStep rideFeedbackStep6 = rideFeedbackStep2;
                        rideFeedbackHeaderUIState4 = rideFeedbackHeaderUIState3;
                        rideFeedbackStep3 = rideFeedbackStep6;
                        LoadingDialogUIState loadingDialogUIState3 = loadingDialogUIState;
                        rideFeedbackToolbarUIState4 = rideFeedbackToolbarUIState3;
                        rideFeedbackContentUIState2 = rideFeedbackContentUIState;
                        objB2 = objB;
                        loadingDialogUIState2 = loadingDialogUIState3;
                        rideFeedbackCtaUIState = (RideFeedbackCtaUIState) objB2;
                        if (rideFeedbackDataState3.f == RideFeedbackStep.THANK_YOU) {
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackViewSpecs3;
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = loadingDialogUIState2;
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackStep3;
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = rideFeedbackToolbarUIState4;
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackHeaderUIState4;
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackContentUIState2;
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackCtaUIState;
                            rideFeedbackCommonUIStateFactory$getViewState$2.L$7 = null;
                            rideFeedbackCommonUIStateFactory$getViewState$2.label = 4;
                            objF = f(function4, rideFeedbackCommonUIStateFactory$getViewState$2);
                            if (objF != obj) {
                                rideFeedbackStep5 = rideFeedbackStep3;
                                rideFeedbackCtaUIState3 = rideFeedbackCtaUIState;
                                objB2 = objF;
                                rideFeedbackViewSpecs5 = rideFeedbackViewSpecs3;
                                rideFeedbackCtaUIState2 = rideFeedbackCtaUIState3;
                                rideFeedbackViewSpecs4 = rideFeedbackViewSpecs5;
                                rideFeedbackStep4 = rideFeedbackStep5;
                                rideFeedbackThankYouUIState = (RideFeedbackThankYouUIState) objB2;
                            }
                        } else {
                            rideFeedbackStep4 = rideFeedbackStep3;
                            rideFeedbackCtaUIState2 = rideFeedbackCtaUIState;
                            rideFeedbackThankYouUIState = null;
                            rideFeedbackViewSpecs4 = rideFeedbackViewSpecs3;
                        }
                        return new RideFeedbackViewState(rideFeedbackViewSpecs4, loadingDialogUIState2, rideFeedbackStep4, rideFeedbackToolbarUIState4, rideFeedbackHeaderUIState4, rideFeedbackContentUIState2, rideFeedbackCtaUIState2, rideFeedbackThankYouUIState);
                    }
                }
            }
            return obj;
        }
        if (i2 == 1) {
            z2 = rideFeedbackCommonUIStateFactory$getViewState$2.Z$0;
            dialogUIStateFactory = (DialogUIStateFactory) rideFeedbackCommonUIStateFactory$getViewState$2.L$5;
            rideFeedbackViewSpecs = (RideFeedbackViewSpecs) rideFeedbackCommonUIStateFactory$getViewState$2.L$4;
            function2 = (Function1) rideFeedbackCommonUIStateFactory$getViewState$2.L$3;
            rideFeedbackHeaderUIState2 = (RideFeedbackHeaderUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$2;
            rideFeedbackToolbarUIState2 = (RideFeedbackToolbarUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$1;
            rideFeedbackDataState2 = (RideFeedbackDataState) rideFeedbackCommonUIStateFactory$getViewState$2.L$0;
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                rideFeedbackHeaderUIState3 = (RideFeedbackHeaderUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$6;
                rideFeedbackToolbarUIState3 = (RideFeedbackToolbarUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$5;
                rideFeedbackStep2 = (RideFeedbackStep) rideFeedbackCommonUIStateFactory$getViewState$2.L$4;
                loadingDialogUIState = (LoadingDialogUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$3;
                rideFeedbackViewSpecs3 = (RideFeedbackViewSpecs) rideFeedbackCommonUIStateFactory$getViewState$2.L$2;
                function4 = (Function1) rideFeedbackCommonUIStateFactory$getViewState$2.L$1;
                rideFeedbackDataState3 = (RideFeedbackDataState) rideFeedbackCommonUIStateFactory$getViewState$2.L$0;
                ResultKt.b(objB2);
                rideFeedbackContentUIState = (RideFeedbackContentUIState) objB2;
                list = rideFeedbackDataState3.b;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t11Var = null;
                            break;
                        }
                        if (((UserFeedbackRatingData) it.next()).c) {
                            t11Var = new t11(function4, 10);
                            break;
                        }
                    }
                } else {
                    t11Var = null;
                    break;
                }
                t11 t11Var3 = new t11(function4, 11);
                rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackDataState3;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = function4;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackViewSpecs3;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = loadingDialogUIState;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackStep2;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackToolbarUIState3;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackHeaderUIState3;
                rideFeedbackCommonUIStateFactory$getViewState$2.L$7 = rideFeedbackContentUIState;
                rideFeedbackCommonUIStateFactory$getViewState$2.label = 3;
                objB = b(t11Var, t11Var3, rideFeedbackCommonUIStateFactory$getViewState$2);
                if (objB != obj) {
                    RideFeedbackStep rideFeedbackStep7 = rideFeedbackStep2;
                    rideFeedbackHeaderUIState4 = rideFeedbackHeaderUIState3;
                    rideFeedbackStep3 = rideFeedbackStep7;
                    LoadingDialogUIState loadingDialogUIState4 = loadingDialogUIState;
                    rideFeedbackToolbarUIState4 = rideFeedbackToolbarUIState3;
                    rideFeedbackContentUIState2 = rideFeedbackContentUIState;
                    objB2 = objB;
                    loadingDialogUIState2 = loadingDialogUIState4;
                    rideFeedbackCtaUIState = (RideFeedbackCtaUIState) objB2;
                    if (rideFeedbackDataState3.f == RideFeedbackStep.THANK_YOU) {
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackViewSpecs3;
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = loadingDialogUIState2;
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackStep3;
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = rideFeedbackToolbarUIState4;
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackHeaderUIState4;
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackContentUIState2;
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackCtaUIState;
                        rideFeedbackCommonUIStateFactory$getViewState$2.L$7 = null;
                        rideFeedbackCommonUIStateFactory$getViewState$2.label = 4;
                        objF = f(function4, rideFeedbackCommonUIStateFactory$getViewState$2);
                        if (objF != obj) {
                            rideFeedbackStep5 = rideFeedbackStep3;
                            rideFeedbackCtaUIState3 = rideFeedbackCtaUIState;
                            objB2 = objF;
                            rideFeedbackViewSpecs5 = rideFeedbackViewSpecs3;
                        }
                    } else {
                        rideFeedbackStep4 = rideFeedbackStep3;
                        rideFeedbackCtaUIState2 = rideFeedbackCtaUIState;
                        rideFeedbackThankYouUIState = null;
                        rideFeedbackViewSpecs4 = rideFeedbackViewSpecs3;
                    }
                    return new RideFeedbackViewState(rideFeedbackViewSpecs4, loadingDialogUIState2, rideFeedbackStep4, rideFeedbackToolbarUIState4, rideFeedbackHeaderUIState4, rideFeedbackContentUIState2, rideFeedbackCtaUIState2, rideFeedbackThankYouUIState);
                }
                return obj;
            }
            if (i2 == 3) {
                RideFeedbackContentUIState rideFeedbackContentUIState3 = (RideFeedbackContentUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$7;
                RideFeedbackHeaderUIState rideFeedbackHeaderUIState5 = (RideFeedbackHeaderUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$6;
                RideFeedbackToolbarUIState rideFeedbackToolbarUIState5 = (RideFeedbackToolbarUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$5;
                RideFeedbackStep rideFeedbackStep8 = (RideFeedbackStep) rideFeedbackCommonUIStateFactory$getViewState$2.L$4;
                LoadingDialogUIState loadingDialogUIState5 = (LoadingDialogUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$3;
                rideFeedbackViewSpecs3 = (RideFeedbackViewSpecs) rideFeedbackCommonUIStateFactory$getViewState$2.L$2;
                function4 = (Function1) rideFeedbackCommonUIStateFactory$getViewState$2.L$1;
                rideFeedbackDataState3 = (RideFeedbackDataState) rideFeedbackCommonUIStateFactory$getViewState$2.L$0;
                ResultKt.b(objB2);
                rideFeedbackContentUIState2 = rideFeedbackContentUIState3;
                rideFeedbackStep3 = rideFeedbackStep8;
                rideFeedbackToolbarUIState4 = rideFeedbackToolbarUIState5;
                rideFeedbackHeaderUIState4 = rideFeedbackHeaderUIState5;
                loadingDialogUIState2 = loadingDialogUIState5;
                rideFeedbackCtaUIState = (RideFeedbackCtaUIState) objB2;
                if (rideFeedbackDataState3.f == RideFeedbackStep.THANK_YOU) {
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackViewSpecs3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = loadingDialogUIState2;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackStep3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = rideFeedbackToolbarUIState4;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackHeaderUIState4;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackContentUIState2;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackCtaUIState;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$7 = null;
                    rideFeedbackCommonUIStateFactory$getViewState$2.label = 4;
                    objF = f(function4, rideFeedbackCommonUIStateFactory$getViewState$2);
                    if (objF != obj) {
                        rideFeedbackStep5 = rideFeedbackStep3;
                        rideFeedbackCtaUIState3 = rideFeedbackCtaUIState;
                        objB2 = objF;
                        rideFeedbackViewSpecs5 = rideFeedbackViewSpecs3;
                    }
                    return obj;
                }
                rideFeedbackStep4 = rideFeedbackStep3;
                rideFeedbackCtaUIState2 = rideFeedbackCtaUIState;
                rideFeedbackThankYouUIState = null;
                rideFeedbackViewSpecs4 = rideFeedbackViewSpecs3;
                return new RideFeedbackViewState(rideFeedbackViewSpecs4, loadingDialogUIState2, rideFeedbackStep4, rideFeedbackToolbarUIState4, rideFeedbackHeaderUIState4, rideFeedbackContentUIState2, rideFeedbackCtaUIState2, rideFeedbackThankYouUIState);
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rideFeedbackCtaUIState3 = (RideFeedbackCtaUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$6;
            rideFeedbackContentUIState2 = (RideFeedbackContentUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$5;
            rideFeedbackHeaderUIState4 = (RideFeedbackHeaderUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$4;
            rideFeedbackToolbarUIState4 = (RideFeedbackToolbarUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$3;
            rideFeedbackStep5 = (RideFeedbackStep) rideFeedbackCommonUIStateFactory$getViewState$2.L$2;
            loadingDialogUIState2 = (LoadingDialogUIState) rideFeedbackCommonUIStateFactory$getViewState$2.L$1;
            rideFeedbackViewSpecs5 = (RideFeedbackViewSpecs) rideFeedbackCommonUIStateFactory$getViewState$2.L$0;
            ResultKt.b(objB2);
        }
        rideFeedbackCtaUIState2 = rideFeedbackCtaUIState3;
        rideFeedbackViewSpecs4 = rideFeedbackViewSpecs5;
        rideFeedbackStep4 = rideFeedbackStep5;
        rideFeedbackThankYouUIState = (RideFeedbackThankYouUIState) objB2;
        return new RideFeedbackViewState(rideFeedbackViewSpecs4, loadingDialogUIState2, rideFeedbackStep4, rideFeedbackToolbarUIState4, rideFeedbackHeaderUIState4, rideFeedbackContentUIState2, rideFeedbackCtaUIState2, rideFeedbackThankYouUIState);
        dialogUIStateFactory.getClass();
        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
        rideFeedbackViewSpecs2 = rideFeedbackViewSpecs;
        rideFeedbackStep = rideFeedbackDataState2.f;
        List list3 = rideFeedbackDataState2.b;
        str = rideFeedbackDataState2.c;
        if (str == null) {
            str = "";
        }
        Set set2 = rideFeedbackDataState2.e;
        rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackDataState2;
        rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = function2;
        rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackViewSpecs2;
        rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = loadingDialogUIStateA;
        rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackStep;
        rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackToolbarUIState2;
        rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackHeaderUIState2;
        rideFeedbackCommonUIStateFactory$getViewState$2.label = 2;
        function3 = function2;
        objB2 = a(z2, list3, str, set2, function3, rideFeedbackCommonUIStateFactory$getViewState$2);
        if (objB2 != obj) {
            rideFeedbackStep2 = rideFeedbackStep;
            rideFeedbackHeaderUIState3 = rideFeedbackHeaderUIState2;
            rideFeedbackToolbarUIState3 = rideFeedbackToolbarUIState2;
            rideFeedbackDataState3 = rideFeedbackDataState2;
            rideFeedbackViewSpecs3 = rideFeedbackViewSpecs2;
            function4 = function3;
            loadingDialogUIState = loadingDialogUIStateA;
            rideFeedbackContentUIState = (RideFeedbackContentUIState) objB2;
            list = rideFeedbackDataState3.b;
            if (list instanceof Collection) {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t11Var = null;
                        break;
                    }
                    if (((UserFeedbackRatingData) it.next()).c) {
                        t11Var = new t11(function4, 10);
                        break;
                    }
                }
            } else {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t11Var = null;
                        break;
                    }
                    if (((UserFeedbackRatingData) it.next()).c) {
                        t11Var = new t11(function4, 10);
                        break;
                    }
                }
            }
            t11 t11Var4 = new t11(function4, 11);
            rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackDataState3;
            rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = function4;
            rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackViewSpecs3;
            rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = loadingDialogUIState;
            rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackStep2;
            rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackToolbarUIState3;
            rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackHeaderUIState3;
            rideFeedbackCommonUIStateFactory$getViewState$2.L$7 = rideFeedbackContentUIState;
            rideFeedbackCommonUIStateFactory$getViewState$2.label = 3;
            objB = b(t11Var, t11Var4, rideFeedbackCommonUIStateFactory$getViewState$2);
            if (objB != obj) {
                RideFeedbackStep rideFeedbackStep9 = rideFeedbackStep2;
                rideFeedbackHeaderUIState4 = rideFeedbackHeaderUIState3;
                rideFeedbackStep3 = rideFeedbackStep9;
                LoadingDialogUIState loadingDialogUIState6 = loadingDialogUIState;
                rideFeedbackToolbarUIState4 = rideFeedbackToolbarUIState3;
                rideFeedbackContentUIState2 = rideFeedbackContentUIState;
                objB2 = objB;
                loadingDialogUIState2 = loadingDialogUIState6;
                rideFeedbackCtaUIState = (RideFeedbackCtaUIState) objB2;
                if (rideFeedbackDataState3.f == RideFeedbackStep.THANK_YOU) {
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$0 = rideFeedbackViewSpecs3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$1 = loadingDialogUIState2;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$2 = rideFeedbackStep3;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$3 = rideFeedbackToolbarUIState4;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$4 = rideFeedbackHeaderUIState4;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$5 = rideFeedbackContentUIState2;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$6 = rideFeedbackCtaUIState;
                    rideFeedbackCommonUIStateFactory$getViewState$2.L$7 = null;
                    rideFeedbackCommonUIStateFactory$getViewState$2.label = 4;
                    objF = f(function4, rideFeedbackCommonUIStateFactory$getViewState$2);
                    if (objF != obj) {
                        rideFeedbackStep5 = rideFeedbackStep3;
                        rideFeedbackCtaUIState3 = rideFeedbackCtaUIState;
                        objB2 = objF;
                        rideFeedbackViewSpecs5 = rideFeedbackViewSpecs3;
                        rideFeedbackCtaUIState2 = rideFeedbackCtaUIState3;
                        rideFeedbackViewSpecs4 = rideFeedbackViewSpecs5;
                        rideFeedbackStep4 = rideFeedbackStep5;
                        rideFeedbackThankYouUIState = (RideFeedbackThankYouUIState) objB2;
                    }
                } else {
                    rideFeedbackStep4 = rideFeedbackStep3;
                    rideFeedbackCtaUIState2 = rideFeedbackCtaUIState;
                    rideFeedbackThankYouUIState = null;
                    rideFeedbackViewSpecs4 = rideFeedbackViewSpecs3;
                }
                return new RideFeedbackViewState(rideFeedbackViewSpecs4, loadingDialogUIState2, rideFeedbackStep4, rideFeedbackToolbarUIState4, rideFeedbackHeaderUIState4, rideFeedbackContentUIState2, rideFeedbackCtaUIState2, rideFeedbackThankYouUIState);
            }
        }
        return obj;
    }
}
