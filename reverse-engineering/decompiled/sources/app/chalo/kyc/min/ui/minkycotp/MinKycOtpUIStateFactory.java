package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
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
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3;
import app.chalo.uistate.textField.UIImeAction;
import app.chalo.uistate.textField.UIImeActionHandler;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t60;
import defpackage.wg0;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpUIStateFactory;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinKycOtpUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4160a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4161a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[KycLoadingPurpose.values().length];
            try {
                iArr[KycLoadingPurpose.REQUESTING_OTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KycLoadingPurpose.VERIFYING_KYC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KycLoadingPurpose.GENERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4161a = iArr;
            int[] iArr2 = new int[OtpError.values().length];
            try {
                iArr2[OtpError.OTP_EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OtpError.INVALID_OTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OtpError.VERIFICATION_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public MinKycOtpUIStateFactory(StringProvider stringProvider) {
        this.f4160a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0144  */
    /* JADX WARN: Code duplicated, block: B:39:0x0177  */
    /* JADX WARN: Code duplicated, block: B:40:0x019d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0222  */
    /* JADX WARN: Code duplicated, block: B:51:0x0232  */
    /* JADX WARN: Code duplicated, block: B:55:0x0256  */
    /* JADX WARN: Code duplicated, block: B:58:0x0264  */
    /* JADX WARN: Code duplicated, block: B:59:0x0267  */
    /* JADX WARN: Code duplicated, block: B:63:0x0292  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(MinKycOtpDataState minKycOtpDataState, Function1 function1, Function1 function2, ContinuationImpl continuationImpl) {
        MinKycOtpUIStateFactory$create$1 minKycOtpUIStateFactory$create$1;
        Function1 function3;
        Function1 function4;
        LoadingDialogUIState loadingDialogUIState;
        MinKycOtpDataState minKycOtpDataState2;
        Function1 function5;
        KycErrorBottomSheetData kycErrorBottomSheetData;
        StringProvider stringProvider;
        LoadingDialogUIState loadingDialogUIState2;
        ButtonUIStateFactory buttonUIStateFactory;
        GenericErrorBottomSheetUIState genericErrorBottomSheetUIState;
        ToolbarUIState toolbarUIState;
        Object objC;
        Object obj;
        MinKycOtpDataState minKycOtpDataState3;
        Function1 function6;
        Function1 function7;
        LoadingDialogUIState loadingDialogUIState3;
        BottomSheetEventHandler bottomSheetEventHandler;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        BottomSheetEventHandler bottomSheetEventHandler2;
        ButtonUIState buttonUIStateF;
        OtpUIState otpUIState;
        ProceedBtnUISpecs proceedBtnUISpecs;
        float f;
        boolean z;
        Object objB;
        ToolbarUIState toolbarUIState2;
        ButtonUIStateFactory buttonUIStateFactory2;
        Function1 function8;
        boolean z2;
        Function1 function9;
        GenericErrorBottomSheetUIState genericErrorBottomSheetUIState2;
        LoadingDialogUIState loadingDialogUIState4;
        MinKycOtpDataState minKycOtpDataState4 = minKycOtpDataState;
        if (continuationImpl instanceof MinKycOtpUIStateFactory$create$1) {
            minKycOtpUIStateFactory$create$1 = (MinKycOtpUIStateFactory$create$1) continuationImpl;
            int i = minKycOtpUIStateFactory$create$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycOtpUIStateFactory$create$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycOtpUIStateFactory$create$1 = new MinKycOtpUIStateFactory$create$1(this, continuationImpl);
            }
        } else {
            minKycOtpUIStateFactory$create$1 = new MinKycOtpUIStateFactory$create$1(this, continuationImpl);
        }
        Object objB2 = minKycOtpUIStateFactory$create$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycOtpUIStateFactory$create$1.label;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        StringProvider stringProvider2 = this.f4160a;
        if (i2 != 0) {
            if (i2 == 1) {
                Function1 function10 = (Function1) minKycOtpUIStateFactory$create$1.L$2;
                function3 = (Function1) minKycOtpUIStateFactory$create$1.L$1;
                minKycOtpDataState2 = (MinKycOtpDataState) minKycOtpUIStateFactory$create$1.L$0;
                ResultKt.b(objB2);
                function4 = function10;
            } else if (i2 == 2) {
                GenericErrorBottomSheetUIState genericErrorBottomSheetUIState3 = (GenericErrorBottomSheetUIState) minKycOtpUIStateFactory$create$1.L$5;
                ToolbarUIState toolbarUIState3 = (ToolbarUIState) minKycOtpUIStateFactory$create$1.L$4;
                LoadingDialogUIState loadingDialogUIState5 = (LoadingDialogUIState) minKycOtpUIStateFactory$create$1.L$3;
                Function1 function11 = (Function1) minKycOtpUIStateFactory$create$1.L$2;
                function7 = (Function1) minKycOtpUIStateFactory$create$1.L$1;
                minKycOtpDataState3 = (MinKycOtpDataState) minKycOtpUIStateFactory$create$1.L$0;
                ResultKt.b(objB2);
                loadingDialogUIState3 = loadingDialogUIState5;
                stringProvider = stringProvider2;
                buttonUIStateFactory = buttonUIStateFactory3;
                genericErrorBottomSheetUIState = genericErrorBottomSheetUIState3;
                toolbarUIState = toolbarUIState3;
                function6 = function11;
                obj = coroutineSingletons;
                otpUIState = (OtpUIState) objB2;
                if (minKycOtpDataState3.f) {
                    f = 1.0f;
                } else {
                    f = 0.4f;
                }
                proceedBtnUISpecs = new ProceedBtnUISpecs(f);
                z = minKycOtpDataState3.f;
                minKycOtpUIStateFactory$create$1.L$0 = function7;
                minKycOtpUIStateFactory$create$1.L$1 = function6;
                minKycOtpUIStateFactory$create$1.L$2 = buttonUIStateFactory;
                minKycOtpUIStateFactory$create$1.L$3 = loadingDialogUIState3;
                minKycOtpUIStateFactory$create$1.L$4 = toolbarUIState;
                minKycOtpUIStateFactory$create$1.L$5 = genericErrorBottomSheetUIState;
                minKycOtpUIStateFactory$create$1.L$6 = otpUIState;
                minKycOtpUIStateFactory$create$1.L$7 = proceedBtnUISpecs;
                minKycOtpUIStateFactory$create$1.Z$0 = z;
                minKycOtpUIStateFactory$create$1.label = 3;
                objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], minKycOtpUIStateFactory$create$1);
                if (objB == obj) {
                    return obj;
                }
                toolbarUIState2 = toolbarUIState;
                buttonUIStateFactory2 = buttonUIStateFactory;
                function8 = function6;
                z2 = z;
                objB2 = objB;
                function9 = function7;
                genericErrorBottomSheetUIState2 = genericErrorBottomSheetUIState;
                loadingDialogUIState4 = loadingDialogUIState3;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = minKycOtpUIStateFactory$create$1.Z$0;
                proceedBtnUISpecs = (ProceedBtnUISpecs) minKycOtpUIStateFactory$create$1.L$7;
                otpUIState = (OtpUIState) minKycOtpUIStateFactory$create$1.L$6;
                GenericErrorBottomSheetUIState genericErrorBottomSheetUIState4 = (GenericErrorBottomSheetUIState) minKycOtpUIStateFactory$create$1.L$5;
                ToolbarUIState toolbarUIState4 = (ToolbarUIState) minKycOtpUIStateFactory$create$1.L$4;
                LoadingDialogUIState loadingDialogUIState6 = (LoadingDialogUIState) minKycOtpUIStateFactory$create$1.L$3;
                ButtonUIStateFactory buttonUIStateFactory4 = (ButtonUIStateFactory) minKycOtpUIStateFactory$create$1.L$2;
                function8 = (Function1) minKycOtpUIStateFactory$create$1.L$1;
                function9 = (Function1) minKycOtpUIStateFactory$create$1.L$0;
                ResultKt.b(objB2);
                buttonUIStateFactory2 = buttonUIStateFactory4;
                toolbarUIState2 = toolbarUIState4;
                loadingDialogUIState4 = loadingDialogUIState6;
                genericErrorBottomSheetUIState2 = genericErrorBottomSheetUIState4;
            }
            ButtonUIStateFactory buttonUIStateFactory5 = buttonUIStateFactory2;
            return new MinKycOtpUIState(loadingDialogUIState4, toolbarUIState2, genericErrorBottomSheetUIState2, otpUIState, new ProceedBtnUIState(proceedBtnUISpecs, ButtonUIStateFactory.f(buttonUIStateFactory5, new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8186), new zf0(4, function8, function9), null, z2, 0.0f, 44)));
        }
        ResultKt.b(objB2);
        if (minKycOtpDataState4.e) {
            KycLoadingPurpose kycLoadingPurpose = minKycOtpDataState4.d;
            minKycOtpUIStateFactory$create$1.L$0 = minKycOtpDataState4;
            function3 = function1;
            minKycOtpUIStateFactory$create$1.L$1 = function3;
            function4 = function2;
            minKycOtpUIStateFactory$create$1.L$2 = function4;
            minKycOtpUIStateFactory$create$1.label = 1;
            int i3 = WhenMappings.f4161a[kycLoadingPurpose.ordinal()];
            if (i3 == 1) {
                objB2 = stringProvider2.b(StringEnum.OTP_LOADING, new Object[0], minKycOtpUIStateFactory$create$1);
            } else if (i3 == 2) {
                objB2 = stringProvider2.b(StringEnum.MIN_KYC_VERIFYING, new Object[0], minKycOtpUIStateFactory$create$1);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objB2 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], minKycOtpUIStateFactory$create$1);
            }
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            minKycOtpDataState2 = minKycOtpDataState4;
        } else {
            function3 = function1;
            function4 = function2;
            loadingDialogUIState = null;
        }
        function5 = function4;
        ToolbarUIState toolbarUIState5 = new ToolbarUIState(null, null, null, null, null, ChaloThemeHelper.a().f1916a, null, null, 223);
        kycErrorBottomSheetData = minKycOtpDataState4.c;
        if (kycErrorBottomSheetData != null) {
            bottomSheetEventHandler = new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new wg0(function3, 19)), 63);
            ImageUIState imageUIState = new ImageUIState(IconType.IC_WARNING_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            if (kycErrorBottomSheetData.f4139a.length() > 0) {
                String str = kycErrorBottomSheetData.f4139a;
                UITextStyle uITextStyle = UITextStyle.DisplaySmall;
                UIFontWeight uIFontWeight = UIFontWeight.Bold;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str, uITextStyle, (ChaloColorToken) ChaloColorToken.Black.f9759a, 0, UITextAlign.Left, uIFontWeight, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
            } else {
                chaloTextUIState = null;
            }
            if (kycErrorBottomSheetData.b.length() > 0) {
                chaloTextUIState2 = new TextUIState.ChaloTextUIState(kycErrorBottomSheetData.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Left, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            } else {
                chaloTextUIState2 = null;
            }
            if (kycErrorBottomSheetData.c.length() > 0) {
                loadingDialogUIState2 = loadingDialogUIState;
                stringProvider = stringProvider2;
                buttonUIStateFactory = buttonUIStateFactory3;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState(kycErrorBottomSheetData.c, (UITextStyle) null, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8186), new zf0(5, function3, kycErrorBottomSheetData), null, false, 0.0f, 60);
                bottomSheetEventHandler2 = bottomSheetEventHandler;
            } else {
                stringProvider = stringProvider2;
                loadingDialogUIState2 = loadingDialogUIState;
                buttonUIStateFactory = buttonUIStateFactory3;
                bottomSheetEventHandler2 = bottomSheetEventHandler;
                buttonUIStateF = null;
            }
            genericErrorBottomSheetUIState = new GenericErrorBottomSheetUIState(bottomSheetEventHandler2, imageUIState, chaloTextUIState, chaloTextUIState2, buttonUIStateF);
        } else {
            coroutineSingletons = coroutineSingletons;
            stringProvider = stringProvider2;
            loadingDialogUIState2 = loadingDialogUIState;
            buttonUIStateFactory = buttonUIStateFactory3;
            genericErrorBottomSheetUIState = null;
        }
        minKycOtpUIStateFactory$create$1.L$0 = minKycOtpDataState4;
        minKycOtpUIStateFactory$create$1.L$1 = function3;
        minKycOtpUIStateFactory$create$1.L$2 = function5;
        minKycOtpUIStateFactory$create$1.L$3 = loadingDialogUIState2;
        toolbarUIState = toolbarUIState5;
        minKycOtpUIStateFactory$create$1.L$4 = toolbarUIState;
        minKycOtpUIStateFactory$create$1.L$5 = genericErrorBottomSheetUIState;
        minKycOtpUIStateFactory$create$1.label = 2;
        objC = c(minKycOtpDataState4, function3, function5, minKycOtpUIStateFactory$create$1);
        obj = coroutineSingletons;
        if (objC == obj) {
            return obj;
        }
        minKycOtpDataState3 = minKycOtpDataState4;
        function6 = function5;
        function7 = function3;
        objB2 = objC;
        loadingDialogUIState3 = loadingDialogUIState2;
        otpUIState = (OtpUIState) objB2;
        if (minKycOtpDataState3.f) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        proceedBtnUISpecs = new ProceedBtnUISpecs(f);
        z = minKycOtpDataState3.f;
        minKycOtpUIStateFactory$create$1.L$0 = function7;
        minKycOtpUIStateFactory$create$1.L$1 = function6;
        minKycOtpUIStateFactory$create$1.L$2 = buttonUIStateFactory;
        minKycOtpUIStateFactory$create$1.L$3 = loadingDialogUIState3;
        minKycOtpUIStateFactory$create$1.L$4 = toolbarUIState;
        minKycOtpUIStateFactory$create$1.L$5 = genericErrorBottomSheetUIState;
        minKycOtpUIStateFactory$create$1.L$6 = otpUIState;
        minKycOtpUIStateFactory$create$1.L$7 = proceedBtnUISpecs;
        minKycOtpUIStateFactory$create$1.Z$0 = z;
        minKycOtpUIStateFactory$create$1.label = 3;
        objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], minKycOtpUIStateFactory$create$1);
        if (objB == obj) {
            return obj;
        }
        toolbarUIState2 = toolbarUIState;
        buttonUIStateFactory2 = buttonUIStateFactory;
        function8 = function6;
        z2 = z;
        objB2 = objB;
        function9 = function7;
        genericErrorBottomSheetUIState2 = genericErrorBottomSheetUIState;
        loadingDialogUIState4 = loadingDialogUIState3;
        ButtonUIStateFactory buttonUIStateFactory6 = buttonUIStateFactory2;
        return new MinKycOtpUIState(loadingDialogUIState4, toolbarUIState2, genericErrorBottomSheetUIState2, otpUIState, new ProceedBtnUIState(proceedBtnUISpecs, ButtonUIStateFactory.f(buttonUIStateFactory6, new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8186), new zf0(4, function8, function9), null, z2, 0.0f, 44)));
        minKycOtpDataState4 = minKycOtpDataState2;
        loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.Black_60.f9766a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        function5 = function4;
        ToolbarUIState toolbarUIState6 = new ToolbarUIState(null, null, null, null, null, ChaloThemeHelper.a().f1916a, null, null, 223);
        kycErrorBottomSheetData = minKycOtpDataState4.c;
        if (kycErrorBottomSheetData != null) {
            bottomSheetEventHandler = new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new wg0(function3, 19)), 63);
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_WARNING_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            if (kycErrorBottomSheetData.f4139a.length() > 0) {
                String str2 = kycErrorBottomSheetData.f4139a;
                UITextStyle uITextStyle2 = UITextStyle.DisplaySmall;
                UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str2, uITextStyle2, (ChaloColorToken) ChaloColorToken.Black.f9759a, 0, UITextAlign.Left, uIFontWeight2, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
            } else {
                chaloTextUIState = null;
            }
            if (kycErrorBottomSheetData.b.length() > 0) {
                chaloTextUIState2 = new TextUIState.ChaloTextUIState(kycErrorBottomSheetData.b, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Left, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            } else {
                chaloTextUIState2 = null;
            }
            if (kycErrorBottomSheetData.c.length() > 0) {
                loadingDialogUIState2 = loadingDialogUIState;
                stringProvider = stringProvider2;
                buttonUIStateFactory = buttonUIStateFactory3;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState(kycErrorBottomSheetData.c, (UITextStyle) null, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8186), new zf0(5, function3, kycErrorBottomSheetData), null, false, 0.0f, 60);
                bottomSheetEventHandler2 = bottomSheetEventHandler;
            } else {
                stringProvider = stringProvider2;
                loadingDialogUIState2 = loadingDialogUIState;
                buttonUIStateFactory = buttonUIStateFactory3;
                bottomSheetEventHandler2 = bottomSheetEventHandler;
                buttonUIStateF = null;
            }
            genericErrorBottomSheetUIState = new GenericErrorBottomSheetUIState(bottomSheetEventHandler2, imageUIState2, chaloTextUIState, chaloTextUIState2, buttonUIStateF);
        } else {
            coroutineSingletons = coroutineSingletons;
            stringProvider = stringProvider2;
            loadingDialogUIState2 = loadingDialogUIState;
            buttonUIStateFactory = buttonUIStateFactory3;
            genericErrorBottomSheetUIState = null;
        }
        minKycOtpUIStateFactory$create$1.L$0 = minKycOtpDataState4;
        minKycOtpUIStateFactory$create$1.L$1 = function3;
        minKycOtpUIStateFactory$create$1.L$2 = function5;
        minKycOtpUIStateFactory$create$1.L$3 = loadingDialogUIState2;
        toolbarUIState = toolbarUIState6;
        minKycOtpUIStateFactory$create$1.L$4 = toolbarUIState;
        minKycOtpUIStateFactory$create$1.L$5 = genericErrorBottomSheetUIState;
        minKycOtpUIStateFactory$create$1.label = 2;
        objC = c(minKycOtpDataState4, function3, function5, minKycOtpUIStateFactory$create$1);
        obj = coroutineSingletons;
        if (objC == obj) {
            return obj;
        }
        minKycOtpDataState3 = minKycOtpDataState4;
        function6 = function5;
        function7 = function3;
        objB2 = objC;
        loadingDialogUIState3 = loadingDialogUIState2;
        otpUIState = (OtpUIState) objB2;
        if (minKycOtpDataState3.f) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        proceedBtnUISpecs = new ProceedBtnUISpecs(f);
        z = minKycOtpDataState3.f;
        minKycOtpUIStateFactory$create$1.L$0 = function7;
        minKycOtpUIStateFactory$create$1.L$1 = function6;
        minKycOtpUIStateFactory$create$1.L$2 = buttonUIStateFactory;
        minKycOtpUIStateFactory$create$1.L$3 = loadingDialogUIState3;
        minKycOtpUIStateFactory$create$1.L$4 = toolbarUIState;
        minKycOtpUIStateFactory$create$1.L$5 = genericErrorBottomSheetUIState;
        minKycOtpUIStateFactory$create$1.L$6 = otpUIState;
        minKycOtpUIStateFactory$create$1.L$7 = proceedBtnUISpecs;
        minKycOtpUIStateFactory$create$1.Z$0 = z;
        minKycOtpUIStateFactory$create$1.label = 3;
        objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], minKycOtpUIStateFactory$create$1);
        if (objB == obj) {
            return obj;
        }
        toolbarUIState2 = toolbarUIState;
        buttonUIStateFactory2 = buttonUIStateFactory;
        function8 = function6;
        z2 = z;
        objB2 = objB;
        function9 = function7;
        genericErrorBottomSheetUIState2 = genericErrorBottomSheetUIState;
        loadingDialogUIState4 = loadingDialogUIState3;
        ButtonUIStateFactory buttonUIStateFactory7 = buttonUIStateFactory2;
        return new MinKycOtpUIState(loadingDialogUIState4, toolbarUIState2, genericErrorBottomSheetUIState2, otpUIState, new ProceedBtnUIState(proceedBtnUISpecs, ButtonUIStateFactory.f(buttonUIStateFactory7, new TextUIState.ChaloTextUIState((String) objB2, (UITextStyle) null, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8186), new zf0(4, function8, function9), null, z2, 0.0f, 44)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(MinKycOtpDataState minKycOtpDataState, Function1 function1, Function1 function2, ContinuationImpl continuationImpl) {
        MinKycOtpUIStateFactory$getOtpTextFieldUIState$1 minKycOtpUIStateFactory$getOtpTextFieldUIState$1;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        List listD0;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objB;
        List list;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2;
        if (continuationImpl instanceof MinKycOtpUIStateFactory$getOtpTextFieldUIState$1) {
            minKycOtpUIStateFactory$getOtpTextFieldUIState$1 = (MinKycOtpUIStateFactory$getOtpTextFieldUIState$1) continuationImpl;
            int i = minKycOtpUIStateFactory$getOtpTextFieldUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycOtpUIStateFactory$getOtpTextFieldUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycOtpUIStateFactory$getOtpTextFieldUIState$1 = new MinKycOtpUIStateFactory$getOtpTextFieldUIState$1(this, continuationImpl);
            }
        } else {
            minKycOtpUIStateFactory$getOtpTextFieldUIState$1 = new MinKycOtpUIStateFactory$getOtpTextFieldUIState$1(this, continuationImpl);
        }
        Object obj = minKycOtpUIStateFactory$getOtpTextFieldUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycOtpUIStateFactory$getOtpTextFieldUIState$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(obj);
            String str = minKycOtpDataState.f4145a;
            String str2 = "";
            String str3 = str.length() == 0 ? "" : str;
            UIKeyboardOption uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Number, new UIImeActionHandler(UIImeAction.Done, new wg0(function2, 18)), 1);
            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, new t60(29, minKycOtpDataState, function1), null);
            ChaloColorToken.TextFieldIndicator textFieldIndicator = ChaloColorToken.TextFieldIndicator.f9859a;
            ChaloColorToken.Black_40 black_40 = ChaloColorToken.Black_40.f9764a;
            ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
            ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
            textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str3, textFieldEventHandlerHelper$basic$3B, null, null, null, null, false, uIKeyboardOption, 0, null, new UITextFieldColors(null, null, black_40, black_40, black_40, black_40, transparent, transparent, transparent, textFieldIndicator, orangePrimary, orangePrimary, 3080255), 0.0f, 97276);
            ArrayList arrayList = new ArrayList();
            String str4 = minKycOtpDataState.f4145a;
            if (str4.length() == 0) {
                str4 = "";
            }
            int i3 = minKycOtpDataState.b;
            int i4 = 0;
            while (i4 < i3) {
                String strValueOf = i4 < str4.length() ? String.valueOf(str4.charAt(i4)) : str2;
                boolean z2 = str4.length() == i4 ? z : false;
                arrayList.add(new OtpCharUIState(new OtpCharUISpecs(new BorderUISpec(ChaloThemeHelper.a().b, z2 ? ChaloColorToken.Orange2.f9830a : ChaloColorToken.ShadyGray.f9851a, UIShape.d)), new TextUIState.ChaloTextUIState(strValueOf, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), new DividerUIState(ChaloThemeHelper.a().c, orangePrimary, DividerOrientation.Vertical), z2));
                i4++;
                str2 = str2;
                str4 = str4;
                z = true;
            }
            listD0 = CollectionsKt.D0(arrayList);
            if (minKycOtpDataState.i) {
                OtpError otpError = minKycOtpDataState.j;
                minKycOtpUIStateFactory$getOtpTextFieldUIState$1.L$0 = textFieldUIState;
                minKycOtpUIStateFactory$getOtpTextFieldUIState$1.L$1 = listD0;
                minKycOtpUIStateFactory$getOtpTextFieldUIState$1.label = 1;
                int i5 = WhenMappings.b[otpError.ordinal()];
                StringProvider stringProvider = this.f4160a;
                if (i5 == 1) {
                    objB = stringProvider.b(StringEnum.OTP_EMPTY, new Object[0], minKycOtpUIStateFactory$getOtpTextFieldUIState$1);
                } else if (i5 == 2) {
                    objB = stringProvider.b(StringEnum.OTP_INVALID, new Object[0], minKycOtpUIStateFactory$getOtpTextFieldUIState$1);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objB = stringProvider.b(StringEnum.OTP_VERIFICATION_FAILED, new Object[0], minKycOtpUIStateFactory$getOtpTextFieldUIState$1);
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objB;
                list = listD0;
                textFieldUIState2 = textFieldUIState;
            } else {
                chaloTextUIState = null;
            }
            return new OtpTextFieldUIState(textFieldUIState, listD0, chaloTextUIState);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) minKycOtpUIStateFactory$getOtpTextFieldUIState$1.L$1;
        textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) minKycOtpUIStateFactory$getOtpTextFieldUIState$1.L$0;
        ResultKt.b(obj);
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        listD0 = list;
        textFieldUIState = textFieldUIState2;
        chaloTextUIState = chaloTextUIState2;
        return new OtpTextFieldUIState(textFieldUIState, listD0, chaloTextUIState);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x020d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0212  */
    /* JADX WARN: Code duplicated, block: B:34:0x0261  */
    /* JADX WARN: Code duplicated, block: B:36:0x0267  */
    /* JADX WARN: Code duplicated, block: B:46:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x035e  */
    /* JADX WARN: Code duplicated, block: B:60:0x037c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0384  */
    /* JADX WARN: Code duplicated, block: B:66:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0418  */
    /* JADX WARN: Code duplicated, block: B:76:0x0448  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0309, code lost:
    
        if (r1 == r7) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState r44, kotlin.jvm.functions.Function1 r45, kotlin.jvm.functions.Function1 r46, kotlin.coroutines.jvm.internal.ContinuationImpl r47) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.ui.minkycotp.MinKycOtpUIStateFactory.c(app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
