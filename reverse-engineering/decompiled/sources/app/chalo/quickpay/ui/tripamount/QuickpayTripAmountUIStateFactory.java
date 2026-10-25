package app.chalo.quickpay.ui.tripamount;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayBottomSheetError;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType;
import app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUIStateFactory;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
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
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.lx0;
import defpackage.sn0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayTripAmountUIStateFactory;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickpayTripAmountUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f8902a;
    public final CurrencyFeature b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8903a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TripAmountState.values().length];
            try {
                iArr[TripAmountState.CORRECT_AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TripAmountState.WALLET_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TripAmountState.NO_AMOUNT_ENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TripAmountState.INCORRECT_AMOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TripAmountState.EXCEEDS_MAX_AMOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8903a = iArr;
            int[] iArr2 = new int[QuickpayBottomSheetError.values().length];
            try {
                iArr2[QuickpayBottomSheetError.WALLET_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[QuickpayBottomSheetError.BALANCE_NOT_SUFFICIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[QuickpayBottomSheetError.USER_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[QuickpayBottomSheetError.SOMETHING_WENT_WRONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    public QuickpayTripAmountUIStateFactory(StringProvider stringProvider, CurrencyFeature currencyFeature) {
        this.f8902a = stringProvider;
        this.b = currencyFeature;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(QuickpayBottomSheetError quickpayBottomSheetError, Function1 function1, ContinuationImpl continuationImpl) {
        QuickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1 quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1;
        ButtonUIStateFactory buttonUIStateFactory;
        String str;
        if (continuationImpl instanceof QuickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1) {
            quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1 = (QuickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1) continuationImpl;
            int i = quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.label = i - Integer.MIN_VALUE;
            } else {
                quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1 = new QuickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1(this, continuationImpl);
            }
        } else {
            quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1 = new QuickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1(this, continuationImpl);
        }
        Object objB = quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            StringProvider stringProvider = this.f8902a;
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            if (quickpayBottomSheetError != null) {
                int i3 = WhenMappings.b[quickpayBottomSheetError.ordinal()];
                if (i3 == 1) {
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$0 = function1;
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$1 = buttonUIStateFactory2;
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.label = 2;
                    objB = stringProvider.b(StringEnum.RETRY, new Object[0], quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1);
                    if (objB != coroutineSingletons) {
                        buttonUIStateFactory = buttonUIStateFactory2;
                        str = (String) objB;
                    }
                } else if (i3 != 2) {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$0 = function1;
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$1 = buttonUIStateFactory2;
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.label = 2;
                    objB = stringProvider.b(StringEnum.RETRY, new Object[0], quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1);
                    if (objB != coroutineSingletons) {
                        buttonUIStateFactory = buttonUIStateFactory2;
                        str = (String) objB;
                    }
                } else {
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$0 = function1;
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$1 = buttonUIStateFactory2;
                    quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.label = 1;
                    objB = stringProvider.b(StringEnum.RECHARGE, new Object[0], quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1);
                    if (objB != coroutineSingletons) {
                        buttonUIStateFactory = buttonUIStateFactory2;
                        str = (String) objB;
                    }
                }
            } else {
                quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$0 = function1;
                quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$1 = buttonUIStateFactory2;
                quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.label = 3;
                objB = stringProvider.b(StringEnum.QUICK_PAY_VERIFICATION_BUTTON, new Object[0], quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1);
                if (objB != coroutineSingletons) {
                    buttonUIStateFactory = buttonUIStateFactory2;
                    str = (String) objB;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            buttonUIStateFactory = (ButtonUIStateFactory) quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$1;
            function1 = (Function1) quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        } else if (i2 == 2) {
            buttonUIStateFactory = (ButtonUIStateFactory) quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$1;
            function1 = (Function1) quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory = (ButtonUIStateFactory) quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$1;
            function1 = (Function1) quickpayTripAmountUIStateFactory$confirmationSheetNextBtn$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        }
        return ButtonUIStateFactory.g(buttonUIStateFactory, str, new lx0(function1, 16), null, null, false, 0.0f, 60);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0523  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x024f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0287  */
    /* JADX WARN: Code duplicated, block: B:35:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0310  */
    /* JADX WARN: Code duplicated, block: B:47:0x0338  */
    /* JADX WARN: Code duplicated, block: B:50:0x0387  */
    /* JADX WARN: Code duplicated, block: B:54:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0405  */
    /* JADX WARN: Code duplicated, block: B:73:0x041b  */
    /* JADX WARN: Code duplicated, block: B:76:0x042d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0459  */
    /* JADX WARN: Code duplicated, block: B:79:0x045d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0470  */
    /* JADX WARN: Code duplicated, block: B:84:0x047a  */
    /* JADX WARN: Code duplicated, block: B:87:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:90:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:95:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0504  */
    /* JADX WARN: Code duplicated, block: B:99:0x0507  */
    public final Object b(QuickpayTripAmountDataState quickpayTripAmountDataState, Function1 function1, ContinuationImpl continuationImpl) {
        QuickpayTripAmountUIStateFactory$convertToUIState$1 quickpayTripAmountUIStateFactory$convertToUIState$1;
        ToolbarUIState toolbarUIState;
        int i;
        TextUIState.ChaloTextUIState chaloTextUIState;
        boolean z;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        char c;
        Object objB2;
        Function1 function2;
        ToolbarUIState toolbarUIState2;
        QuickpayTripAmountDataState quickpayTripAmountDataState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        String str;
        StringProvider stringProvider;
        QuickpayDisclaimerUIState quickpayDisclaimerUIState;
        Object objD;
        QuickpayTripAmountDataState quickpayTripAmountDataState3;
        Function1 function3;
        ToolbarUIState toolbarUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        QuickpayDisclaimerUIState quickpayDisclaimerUIState2;
        TextUIState textUIState;
        StringProvider stringProvider2;
        Object objB3;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        ToolbarUIState toolbarUIState4;
        TextUIState textUIState2;
        QuickpayTripAmountDataState quickpayTripAmountDataState4;
        Function1 function4;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        Function1 function5;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        QuickpayTripAmountDataState quickpayTripAmountDataState5;
        StringProvider stringProvider3;
        DividerUIState dividerUIState;
        String str2;
        Object objC;
        ToolbarUIState toolbarUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        QuickpayTripAmountDataState quickpayTripAmountDataState6;
        QuickpayDisclaimerUIState quickpayDisclaimerUIState3;
        DividerUIState dividerUIState2;
        Function1 function6;
        BaseTextFieldUIState baseTextFieldUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        DividerUIState dividerUIState3;
        StringProvider stringProvider4;
        Object objB4;
        BaseTextFieldUIState baseTextFieldUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        TextUIState textUIState3;
        QuickpayTripAmountDataState quickpayTripAmountDataState7;
        ButtonUIStateFactory buttonUIStateFactory2;
        ToolbarUIState toolbarUIState6;
        Function1 function7;
        QuickpayDisclaimerUIState quickpayDisclaimerUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        DividerUIState dividerUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        int i2;
        boolean z2;
        ButtonUIState buttonUIStateG;
        QuickpayTripAmountDataState quickpayTripAmountDataState8;
        LoadingDialogUIState loadingDialogUIStateA;
        DialogUIStateFactory dialogUIStateFactory;
        DialogUIStateFactory dialogUIStateFactory2;
        QuickpayTripAmountScreenBottomSheetType quickpayTripAmountScreenBottomSheetType;
        ButtonUIState buttonUIState;
        QuickpayBottomSheetUIState quickpayBottomSheetUIState;
        BaseTextFieldUIState baseTextFieldUIState3;
        DividerUIState dividerUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState14;
        TextUIState textUIState4;
        QuickpayDisclaimerUIState quickpayDisclaimerUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState15;
        TextUIState.ChaloTextUIState chaloTextUIState16;
        ToolbarUIState toolbarUIState7;
        LoadingDialogUIState loadingDialogUIState;
        Object objF;
        BaseTextFieldUIState baseTextFieldUIState4;
        DividerUIState dividerUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState17;
        TextUIState textUIState5;
        QuickpayDisclaimerUIState quickpayDisclaimerUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState18;
        TextUIState.ChaloTextUIState chaloTextUIState19;
        ToolbarUIState toolbarUIState8;
        LoadingDialogUIState loadingDialogUIState2;
        Object objE;
        QuickpayBottomSheetUIState quickpayBottomSheetUIState2;
        QuickpayTripAmountDataState quickpayTripAmountDataState9 = quickpayTripAmountDataState;
        Function1 function8 = function1;
        if (continuationImpl instanceof QuickpayTripAmountUIStateFactory$convertToUIState$1) {
            quickpayTripAmountUIStateFactory$convertToUIState$1 = (QuickpayTripAmountUIStateFactory$convertToUIState$1) continuationImpl;
            int i3 = quickpayTripAmountUIStateFactory$convertToUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                quickpayTripAmountUIStateFactory$convertToUIState$1 = new QuickpayTripAmountUIStateFactory$convertToUIState$1(this, continuationImpl);
            }
        } else {
            quickpayTripAmountUIStateFactory$convertToUIState$1 = new QuickpayTripAmountUIStateFactory$convertToUIState$1(this, continuationImpl);
        }
        Object objB5 = quickpayTripAmountUIStateFactory$convertToUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = quickpayTripAmountUIStateFactory$convertToUIState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        StringProvider stringProvider5 = this.f8902a;
        switch (i4) {
            case 0:
                ResultKt.b(objB5);
                long j = quickpayTripAmountDataState9.d;
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new lx0(function8, 19));
                if (j == -1) {
                    i = 0;
                    chaloTextUIState = null;
                } else {
                    i = 0;
                    chaloTextUIState = new TextUIState.ChaloTextUIState(this.b.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), UITextStyle.BodyLarge, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                }
                toolbarUIState = new ToolbarUIState(null, null, null, null, CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(new ImageUIState(IconType.WALLET_MENU_ICON, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), chaloTextUIState, uiEventHandler$Companion$fromLambda$1A, null, null, 120)), 0.0f, null, null, 239);
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState9;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function8;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState;
                z = true;
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 1;
                objB = stringProvider5.b(StringEnum.PAY_FOR_TICKET, new Object[i], quickpayTripAmountUIStateFactory$convertToUIState$1);
                if (objB != obj) {
                    chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState9;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function8;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState2;
                    c = 2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 2;
                    objB2 = stringProvider5.b(StringEnum.TEXT_ENTER_BUS_TICKET_AMOUNT_TITLE, new Object[i], quickpayTripAmountUIStateFactory$convertToUIState$1);
                    if (objB2 == obj) {
                        function2 = function8;
                        toolbarUIState2 = toolbarUIState;
                        objB5 = objB2;
                        quickpayTripAmountDataState2 = quickpayTripAmountDataState9;
                        chaloTextUIState3 = chaloTextUIState2;
                        chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        str = quickpayTripAmountDataState2.c;
                        if (str != null || str.length() == 0) {
                            stringProvider = stringProvider5;
                            quickpayDisclaimerUIState = null;
                        } else {
                            stringProvider = stringProvider5;
                            quickpayDisclaimerUIState = new QuickpayDisclaimerUIState(new TextUIState.ChaloTextUIState(quickpayTripAmountDataState2.c, UITextStyle.HeadlineSmall, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        }
                        TripAmountState tripAmountState = quickpayTripAmountDataState2.f8872a;
                        long j2 = quickpayTripAmountDataState2.h;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 3;
                        objD = d(tripAmountState, j2, quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objD != obj) {
                            quickpayTripAmountDataState3 = quickpayTripAmountDataState2;
                            function3 = function2;
                            toolbarUIState3 = toolbarUIState2;
                            chaloTextUIState5 = chaloTextUIState4;
                            objB5 = objD;
                            chaloTextUIState6 = chaloTextUIState3;
                            quickpayDisclaimerUIState2 = quickpayDisclaimerUIState;
                            textUIState = (TextUIState) objB5;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 4;
                            stringProvider2 = stringProvider;
                            objB3 = stringProvider2.b(StringEnum.VIEW_CHALO_PAY_HISTORY, new Object[i], quickpayTripAmountUIStateFactory$convertToUIState$1);
                            if (objB3 == obj) {
                                ToolbarUIState toolbarUIState9 = toolbarUIState3;
                                chaloTextUIState7 = chaloTextUIState5;
                                toolbarUIState4 = toolbarUIState9;
                                TextUIState.ChaloTextUIState chaloTextUIState20 = chaloTextUIState6;
                                textUIState2 = textUIState;
                                objB5 = objB3;
                                quickpayTripAmountDataState4 = quickpayTripAmountDataState3;
                                function4 = function3;
                                chaloTextUIState8 = chaloTextUIState20;
                                function5 = function4;
                                quickpayTripAmountDataState5 = quickpayTripAmountDataState4;
                                stringProvider3 = stringProvider2;
                                chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, orangePrimary, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new lx0(function4, 12)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                                dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.GreyColor.f9806a, null, 4);
                                str2 = quickpayTripAmountDataState5.b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState5;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function5;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState9;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 5;
                                objC = c(str2, quickpayTripAmountUIStateFactory$convertToUIState$1, function5);
                                if (objC != obj) {
                                    toolbarUIState5 = toolbarUIState4;
                                    chaloTextUIState10 = chaloTextUIState9;
                                    quickpayTripAmountDataState6 = quickpayTripAmountDataState5;
                                    quickpayDisclaimerUIState3 = quickpayDisclaimerUIState2;
                                    dividerUIState2 = dividerUIState;
                                    function6 = function5;
                                    objB5 = objC;
                                    baseTextFieldUIState = (BaseTextFieldUIState) objB5;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState6;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function6;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState3;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState10;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateFactory;
                                    dividerUIState3 = dividerUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 6;
                                    stringProvider4 = stringProvider3;
                                    objB4 = stringProvider4.b(StringEnum.PAY_CONDUCTOR_BUTTON, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                                    if (objB4 == obj) {
                                        TextUIState textUIState6 = textUIState2;
                                        baseTextFieldUIState2 = baseTextFieldUIState;
                                        objB5 = objB4;
                                        chaloTextUIState11 = chaloTextUIState8;
                                        textUIState3 = textUIState6;
                                        quickpayTripAmountDataState7 = quickpayTripAmountDataState6;
                                        buttonUIStateFactory2 = buttonUIStateFactory;
                                        toolbarUIState6 = toolbarUIState5;
                                        function7 = function6;
                                        quickpayDisclaimerUIState4 = quickpayDisclaimerUIState3;
                                        chaloTextUIState12 = chaloTextUIState7;
                                        dividerUIState4 = dividerUIState3;
                                        chaloTextUIState13 = chaloTextUIState10;
                                        String str3 = (String) objB5;
                                        lx0 lx0Var = new lx0(function7, 13);
                                        i2 = WhenMappings.f8903a[quickpayTripAmountDataState7.f8872a.ordinal()];
                                        if (i2 != 1 || i2 == 2) {
                                            z2 = true;
                                        } else {
                                            if (i2 != 3 && i2 != 4 && i2 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            z2 = false;
                                        }
                                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str3, lx0Var, null, null, z2, 0.0f, 44);
                                        if (!quickpayTripAmountDataState7.f) {
                                            quickpayTripAmountDataState8 = quickpayTripAmountDataState7;
                                            loadingDialogUIStateA = null;
                                            quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                            if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                                objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                                if (objE != obj) {
                                                    baseTextFieldUIState4 = baseTextFieldUIState2;
                                                    dividerUIState6 = dividerUIState4;
                                                    chaloTextUIState17 = chaloTextUIState13;
                                                    textUIState5 = textUIState3;
                                                    quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                                    chaloTextUIState18 = chaloTextUIState12;
                                                    chaloTextUIState19 = chaloTextUIState11;
                                                    toolbarUIState8 = toolbarUIState6;
                                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                                    quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                                    loadingDialogUIState = loadingDialogUIState2;
                                                    buttonUIState = buttonUIStateG;
                                                    toolbarUIState7 = toolbarUIState8;
                                                    baseTextFieldUIState3 = baseTextFieldUIState4;
                                                    dividerUIState5 = dividerUIState6;
                                                    chaloTextUIState14 = chaloTextUIState17;
                                                    textUIState4 = textUIState5;
                                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                                    chaloTextUIState15 = chaloTextUIState18;
                                                    chaloTextUIState16 = chaloTextUIState19;
                                                    quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                                }
                                            } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                                String str4 = quickpayTripAmountDataState8.j;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                                objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str4, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                                if (objF == obj) {
                                                    return obj;
                                                }
                                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                                dividerUIState6 = dividerUIState4;
                                                chaloTextUIState17 = chaloTextUIState13;
                                                textUIState5 = textUIState3;
                                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                                chaloTextUIState18 = chaloTextUIState12;
                                                chaloTextUIState19 = chaloTextUIState11;
                                                toolbarUIState8 = toolbarUIState6;
                                                loadingDialogUIState2 = loadingDialogUIStateA;
                                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                                loadingDialogUIState = loadingDialogUIState2;
                                                buttonUIState = buttonUIStateG;
                                                toolbarUIState7 = toolbarUIState8;
                                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                                dividerUIState5 = dividerUIState6;
                                                chaloTextUIState14 = chaloTextUIState17;
                                                textUIState4 = textUIState5;
                                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                                chaloTextUIState15 = chaloTextUIState18;
                                                chaloTextUIState16 = chaloTextUIState19;
                                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                            } else {
                                                if (quickpayTripAmountScreenBottomSheetType != null) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                buttonUIState = buttonUIStateG;
                                                quickpayBottomSheetUIState = null;
                                                baseTextFieldUIState3 = baseTextFieldUIState2;
                                                dividerUIState5 = dividerUIState4;
                                                chaloTextUIState14 = chaloTextUIState13;
                                                textUIState4 = textUIState3;
                                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                                chaloTextUIState15 = chaloTextUIState12;
                                                chaloTextUIState16 = chaloTextUIState11;
                                                toolbarUIState7 = toolbarUIState6;
                                                loadingDialogUIState = loadingDialogUIStateA;
                                            }
                                            return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                                        }
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState7;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function7;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState11;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState12;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState3;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState13;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState2;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateG;
                                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = dialogUIStateFactory;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 7;
                                        objB5 = stringProvider4.b(StringEnum.QUICKPAY_INTERNET_LOADING_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                                        if (objB5 != obj) {
                                            buttonUIStateG = buttonUIStateG;
                                            dialogUIStateFactory2 = dialogUIStateFactory;
                                            dialogUIStateFactory2.getClass();
                                            QuickpayTripAmountDataState quickpayTripAmountDataState10 = quickpayTripAmountDataState7;
                                            loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                                            quickpayTripAmountDataState8 = quickpayTripAmountDataState10;
                                            quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                            if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                                objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                                if (objE != obj) {
                                                    baseTextFieldUIState4 = baseTextFieldUIState2;
                                                    dividerUIState6 = dividerUIState4;
                                                    chaloTextUIState17 = chaloTextUIState13;
                                                    textUIState5 = textUIState3;
                                                    quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                                    chaloTextUIState18 = chaloTextUIState12;
                                                    chaloTextUIState19 = chaloTextUIState11;
                                                    toolbarUIState8 = toolbarUIState6;
                                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                                    quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                                    loadingDialogUIState = loadingDialogUIState2;
                                                    buttonUIState = buttonUIStateG;
                                                    toolbarUIState7 = toolbarUIState8;
                                                    baseTextFieldUIState3 = baseTextFieldUIState4;
                                                    dividerUIState5 = dividerUIState6;
                                                    chaloTextUIState14 = chaloTextUIState17;
                                                    textUIState4 = textUIState5;
                                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                                    chaloTextUIState15 = chaloTextUIState18;
                                                    chaloTextUIState16 = chaloTextUIState19;
                                                    quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                                }
                                            } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                                String str5 = quickpayTripAmountDataState8.j;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                                objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str5, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                                if (objF == obj) {
                                                    return obj;
                                                }
                                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                                dividerUIState6 = dividerUIState4;
                                                chaloTextUIState17 = chaloTextUIState13;
                                                textUIState5 = textUIState3;
                                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                                chaloTextUIState18 = chaloTextUIState12;
                                                chaloTextUIState19 = chaloTextUIState11;
                                                toolbarUIState8 = toolbarUIState6;
                                                loadingDialogUIState2 = loadingDialogUIStateA;
                                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                                loadingDialogUIState = loadingDialogUIState2;
                                                buttonUIState = buttonUIStateG;
                                                toolbarUIState7 = toolbarUIState8;
                                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                                dividerUIState5 = dividerUIState6;
                                                chaloTextUIState14 = chaloTextUIState17;
                                                textUIState4 = textUIState5;
                                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                                chaloTextUIState15 = chaloTextUIState18;
                                                chaloTextUIState16 = chaloTextUIState19;
                                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                            } else {
                                                if (quickpayTripAmountScreenBottomSheetType != null) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                buttonUIState = buttonUIStateG;
                                                quickpayBottomSheetUIState = null;
                                                baseTextFieldUIState3 = baseTextFieldUIState2;
                                                dividerUIState5 = dividerUIState4;
                                                chaloTextUIState14 = chaloTextUIState13;
                                                textUIState4 = textUIState3;
                                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                                chaloTextUIState15 = chaloTextUIState12;
                                                chaloTextUIState16 = chaloTextUIState11;
                                                toolbarUIState7 = toolbarUIState6;
                                                loadingDialogUIState = loadingDialogUIStateA;
                                            }
                                            return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return obj;
                }
                return obj;
            case 1:
                ToolbarUIState toolbarUIState10 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                function8 = (Function1) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                QuickpayTripAmountDataState quickpayTripAmountDataState11 = (QuickpayTripAmountDataState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                objB = objB5;
                i = 0;
                z = true;
                toolbarUIState = toolbarUIState10;
                quickpayTripAmountDataState9 = quickpayTripAmountDataState11;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState9;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function8;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState2;
                c = 2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 2;
                objB2 = stringProvider5.b(StringEnum.TEXT_ENTER_BUS_TICKET_AMOUNT_TITLE, new Object[i], quickpayTripAmountUIStateFactory$convertToUIState$1);
                if (objB2 == obj) {
                    function2 = function8;
                    toolbarUIState2 = toolbarUIState;
                    objB5 = objB2;
                    quickpayTripAmountDataState2 = quickpayTripAmountDataState9;
                    chaloTextUIState3 = chaloTextUIState2;
                    chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    str = quickpayTripAmountDataState2.c;
                    if (str != null) {
                        stringProvider = stringProvider5;
                        quickpayDisclaimerUIState = null;
                    } else {
                        stringProvider = stringProvider5;
                        quickpayDisclaimerUIState = null;
                    }
                    TripAmountState tripAmountState2 = quickpayTripAmountDataState2.f8872a;
                    long j3 = quickpayTripAmountDataState2.h;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 3;
                    objD = d(tripAmountState2, j3, quickpayTripAmountUIStateFactory$convertToUIState$1);
                    if (objD != obj) {
                        quickpayTripAmountDataState3 = quickpayTripAmountDataState2;
                        function3 = function2;
                        toolbarUIState3 = toolbarUIState2;
                        chaloTextUIState5 = chaloTextUIState4;
                        objB5 = objD;
                        chaloTextUIState6 = chaloTextUIState3;
                        quickpayDisclaimerUIState2 = quickpayDisclaimerUIState;
                        textUIState = (TextUIState) objB5;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 4;
                        stringProvider2 = stringProvider;
                        objB3 = stringProvider2.b(StringEnum.VIEW_CHALO_PAY_HISTORY, new Object[i], quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objB3 == obj) {
                            ToolbarUIState toolbarUIState11 = toolbarUIState3;
                            chaloTextUIState7 = chaloTextUIState5;
                            toolbarUIState4 = toolbarUIState11;
                            TextUIState.ChaloTextUIState chaloTextUIState21 = chaloTextUIState6;
                            textUIState2 = textUIState;
                            objB5 = objB3;
                            quickpayTripAmountDataState4 = quickpayTripAmountDataState3;
                            function4 = function3;
                            chaloTextUIState8 = chaloTextUIState21;
                            function5 = function4;
                            quickpayTripAmountDataState5 = quickpayTripAmountDataState4;
                            stringProvider3 = stringProvider2;
                            chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, orangePrimary, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new lx0(function4, 12)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                            dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.GreyColor.f9806a, null, 4);
                            str2 = quickpayTripAmountDataState5.b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState5;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function5;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState9;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 5;
                            objC = c(str2, quickpayTripAmountUIStateFactory$convertToUIState$1, function5);
                            if (objC != obj) {
                                toolbarUIState5 = toolbarUIState4;
                                chaloTextUIState10 = chaloTextUIState9;
                                quickpayTripAmountDataState6 = quickpayTripAmountDataState5;
                                quickpayDisclaimerUIState3 = quickpayDisclaimerUIState2;
                                dividerUIState2 = dividerUIState;
                                function6 = function5;
                                objB5 = objC;
                                baseTextFieldUIState = (BaseTextFieldUIState) objB5;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState6;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function6;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState3;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState10;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateFactory;
                                dividerUIState3 = dividerUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 6;
                                stringProvider4 = stringProvider3;
                                objB4 = stringProvider4.b(StringEnum.PAY_CONDUCTOR_BUTTON, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                                if (objB4 == obj) {
                                    TextUIState textUIState7 = textUIState2;
                                    baseTextFieldUIState2 = baseTextFieldUIState;
                                    objB5 = objB4;
                                    chaloTextUIState11 = chaloTextUIState8;
                                    textUIState3 = textUIState7;
                                    quickpayTripAmountDataState7 = quickpayTripAmountDataState6;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    toolbarUIState6 = toolbarUIState5;
                                    function7 = function6;
                                    quickpayDisclaimerUIState4 = quickpayDisclaimerUIState3;
                                    chaloTextUIState12 = chaloTextUIState7;
                                    dividerUIState4 = dividerUIState3;
                                    chaloTextUIState13 = chaloTextUIState10;
                                    String str6 = (String) objB5;
                                    lx0 lx0Var2 = new lx0(function7, 13);
                                    i2 = WhenMappings.f8903a[quickpayTripAmountDataState7.f8872a.ordinal()];
                                    if (i2 != 1) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str6, lx0Var2, null, null, z2, 0.0f, 44);
                                    if (!quickpayTripAmountDataState7.f) {
                                        quickpayTripAmountDataState8 = quickpayTripAmountDataState7;
                                        loadingDialogUIStateA = null;
                                        quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                        if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                            objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                            if (objE != obj) {
                                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                                dividerUIState6 = dividerUIState4;
                                                chaloTextUIState17 = chaloTextUIState13;
                                                textUIState5 = textUIState3;
                                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                                chaloTextUIState18 = chaloTextUIState12;
                                                chaloTextUIState19 = chaloTextUIState11;
                                                toolbarUIState8 = toolbarUIState6;
                                                loadingDialogUIState2 = loadingDialogUIStateA;
                                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                                loadingDialogUIState = loadingDialogUIState2;
                                                buttonUIState = buttonUIStateG;
                                                toolbarUIState7 = toolbarUIState8;
                                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                                dividerUIState5 = dividerUIState6;
                                                chaloTextUIState14 = chaloTextUIState17;
                                                textUIState4 = textUIState5;
                                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                                chaloTextUIState15 = chaloTextUIState18;
                                                chaloTextUIState16 = chaloTextUIState19;
                                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                            }
                                        } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                            String str7 = quickpayTripAmountDataState8.j;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                            objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str7, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                            if (objF == obj) {
                                                return obj;
                                            }
                                            baseTextFieldUIState4 = baseTextFieldUIState2;
                                            dividerUIState6 = dividerUIState4;
                                            chaloTextUIState17 = chaloTextUIState13;
                                            textUIState5 = textUIState3;
                                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                            chaloTextUIState18 = chaloTextUIState12;
                                            chaloTextUIState19 = chaloTextUIState11;
                                            toolbarUIState8 = toolbarUIState6;
                                            loadingDialogUIState2 = loadingDialogUIStateA;
                                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                            loadingDialogUIState = loadingDialogUIState2;
                                            buttonUIState = buttonUIStateG;
                                            toolbarUIState7 = toolbarUIState8;
                                            baseTextFieldUIState3 = baseTextFieldUIState4;
                                            dividerUIState5 = dividerUIState6;
                                            chaloTextUIState14 = chaloTextUIState17;
                                            textUIState4 = textUIState5;
                                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                            chaloTextUIState15 = chaloTextUIState18;
                                            chaloTextUIState16 = chaloTextUIState19;
                                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                        } else {
                                            if (quickpayTripAmountScreenBottomSheetType != null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            buttonUIState = buttonUIStateG;
                                            quickpayBottomSheetUIState = null;
                                            baseTextFieldUIState3 = baseTextFieldUIState2;
                                            dividerUIState5 = dividerUIState4;
                                            chaloTextUIState14 = chaloTextUIState13;
                                            textUIState4 = textUIState3;
                                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                            chaloTextUIState15 = chaloTextUIState12;
                                            chaloTextUIState16 = chaloTextUIState11;
                                            toolbarUIState7 = toolbarUIState6;
                                            loadingDialogUIState = loadingDialogUIStateA;
                                        }
                                        return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                                    }
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState7;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function7;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState11;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState12;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState3;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState13;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateG;
                                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = dialogUIStateFactory;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 7;
                                    objB5 = stringProvider4.b(StringEnum.QUICKPAY_INTERNET_LOADING_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                                    if (objB5 != obj) {
                                        buttonUIStateG = buttonUIStateG;
                                        dialogUIStateFactory2 = dialogUIStateFactory;
                                        dialogUIStateFactory2.getClass();
                                        QuickpayTripAmountDataState quickpayTripAmountDataState12 = quickpayTripAmountDataState7;
                                        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                                        quickpayTripAmountDataState8 = quickpayTripAmountDataState12;
                                        quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                        if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                            objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                            if (objE != obj) {
                                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                                dividerUIState6 = dividerUIState4;
                                                chaloTextUIState17 = chaloTextUIState13;
                                                textUIState5 = textUIState3;
                                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                                chaloTextUIState18 = chaloTextUIState12;
                                                chaloTextUIState19 = chaloTextUIState11;
                                                toolbarUIState8 = toolbarUIState6;
                                                loadingDialogUIState2 = loadingDialogUIStateA;
                                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                                loadingDialogUIState = loadingDialogUIState2;
                                                buttonUIState = buttonUIStateG;
                                                toolbarUIState7 = toolbarUIState8;
                                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                                dividerUIState5 = dividerUIState6;
                                                chaloTextUIState14 = chaloTextUIState17;
                                                textUIState4 = textUIState5;
                                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                                chaloTextUIState15 = chaloTextUIState18;
                                                chaloTextUIState16 = chaloTextUIState19;
                                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                            }
                                        } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                            String str8 = quickpayTripAmountDataState8.j;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                            objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str8, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                            if (objF == obj) {
                                                return obj;
                                            }
                                            baseTextFieldUIState4 = baseTextFieldUIState2;
                                            dividerUIState6 = dividerUIState4;
                                            chaloTextUIState17 = chaloTextUIState13;
                                            textUIState5 = textUIState3;
                                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                            chaloTextUIState18 = chaloTextUIState12;
                                            chaloTextUIState19 = chaloTextUIState11;
                                            toolbarUIState8 = toolbarUIState6;
                                            loadingDialogUIState2 = loadingDialogUIStateA;
                                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                            loadingDialogUIState = loadingDialogUIState2;
                                            buttonUIState = buttonUIStateG;
                                            toolbarUIState7 = toolbarUIState8;
                                            baseTextFieldUIState3 = baseTextFieldUIState4;
                                            dividerUIState5 = dividerUIState6;
                                            chaloTextUIState14 = chaloTextUIState17;
                                            textUIState4 = textUIState5;
                                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                            chaloTextUIState15 = chaloTextUIState18;
                                            chaloTextUIState16 = chaloTextUIState19;
                                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                        } else {
                                            if (quickpayTripAmountScreenBottomSheetType != null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            buttonUIState = buttonUIStateG;
                                            quickpayBottomSheetUIState = null;
                                            baseTextFieldUIState3 = baseTextFieldUIState2;
                                            dividerUIState5 = dividerUIState4;
                                            chaloTextUIState14 = chaloTextUIState13;
                                            textUIState4 = textUIState3;
                                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                            chaloTextUIState15 = chaloTextUIState12;
                                            chaloTextUIState16 = chaloTextUIState11;
                                            toolbarUIState7 = toolbarUIState6;
                                            loadingDialogUIState = loadingDialogUIStateA;
                                        }
                                        return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                Function1 function9 = (Function1) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                QuickpayTripAmountDataState quickpayTripAmountDataState13 = (QuickpayTripAmountDataState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                function2 = function9;
                quickpayTripAmountDataState2 = quickpayTripAmountDataState13;
                i = 0;
                z = true;
                c = 2;
                chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                str = quickpayTripAmountDataState2.c;
                if (str != null) {
                    stringProvider = stringProvider5;
                    quickpayDisclaimerUIState = null;
                } else {
                    stringProvider = stringProvider5;
                    quickpayDisclaimerUIState = null;
                }
                TripAmountState tripAmountState3 = quickpayTripAmountDataState2.f8872a;
                long j4 = quickpayTripAmountDataState2.h;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState3;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState4;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState;
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 3;
                objD = d(tripAmountState3, j4, quickpayTripAmountUIStateFactory$convertToUIState$1);
                if (objD != obj) {
                    quickpayTripAmountDataState3 = quickpayTripAmountDataState2;
                    function3 = function2;
                    toolbarUIState3 = toolbarUIState2;
                    chaloTextUIState5 = chaloTextUIState4;
                    objB5 = objD;
                    chaloTextUIState6 = chaloTextUIState3;
                    quickpayDisclaimerUIState2 = quickpayDisclaimerUIState;
                    textUIState = (TextUIState) objB5;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState6;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 4;
                    stringProvider2 = stringProvider;
                    objB3 = stringProvider2.b(StringEnum.VIEW_CHALO_PAY_HISTORY, new Object[i], quickpayTripAmountUIStateFactory$convertToUIState$1);
                    if (objB3 == obj) {
                        ToolbarUIState toolbarUIState12 = toolbarUIState3;
                        chaloTextUIState7 = chaloTextUIState5;
                        toolbarUIState4 = toolbarUIState12;
                        TextUIState.ChaloTextUIState chaloTextUIState22 = chaloTextUIState6;
                        textUIState2 = textUIState;
                        objB5 = objB3;
                        quickpayTripAmountDataState4 = quickpayTripAmountDataState3;
                        function4 = function3;
                        chaloTextUIState8 = chaloTextUIState22;
                        function5 = function4;
                        quickpayTripAmountDataState5 = quickpayTripAmountDataState4;
                        stringProvider3 = stringProvider2;
                        chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, orangePrimary, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new lx0(function4, 12)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                        dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.GreyColor.f9806a, null, 4);
                        str2 = quickpayTripAmountDataState5.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState5;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function5;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState9;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 5;
                        objC = c(str2, quickpayTripAmountUIStateFactory$convertToUIState$1, function5);
                        if (objC != obj) {
                            toolbarUIState5 = toolbarUIState4;
                            chaloTextUIState10 = chaloTextUIState9;
                            quickpayTripAmountDataState6 = quickpayTripAmountDataState5;
                            quickpayDisclaimerUIState3 = quickpayDisclaimerUIState2;
                            dividerUIState2 = dividerUIState;
                            function6 = function5;
                            objB5 = objC;
                            baseTextFieldUIState = (BaseTextFieldUIState) objB5;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState10;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateFactory;
                            dividerUIState3 = dividerUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 6;
                            stringProvider4 = stringProvider3;
                            objB4 = stringProvider4.b(StringEnum.PAY_CONDUCTOR_BUTTON, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                            if (objB4 == obj) {
                                TextUIState textUIState8 = textUIState2;
                                baseTextFieldUIState2 = baseTextFieldUIState;
                                objB5 = objB4;
                                chaloTextUIState11 = chaloTextUIState8;
                                textUIState3 = textUIState8;
                                quickpayTripAmountDataState7 = quickpayTripAmountDataState6;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                toolbarUIState6 = toolbarUIState5;
                                function7 = function6;
                                quickpayDisclaimerUIState4 = quickpayDisclaimerUIState3;
                                chaloTextUIState12 = chaloTextUIState7;
                                dividerUIState4 = dividerUIState3;
                                chaloTextUIState13 = chaloTextUIState10;
                                String str9 = (String) objB5;
                                lx0 lx0Var3 = new lx0(function7, 13);
                                i2 = WhenMappings.f8903a[quickpayTripAmountDataState7.f8872a.ordinal()];
                                if (i2 != 1) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str9, lx0Var3, null, null, z2, 0.0f, 44);
                                if (!quickpayTripAmountDataState7.f) {
                                    quickpayTripAmountDataState8 = quickpayTripAmountDataState7;
                                    loadingDialogUIStateA = null;
                                    quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                    if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                        objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                        if (objE != obj) {
                                            baseTextFieldUIState4 = baseTextFieldUIState2;
                                            dividerUIState6 = dividerUIState4;
                                            chaloTextUIState17 = chaloTextUIState13;
                                            textUIState5 = textUIState3;
                                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                            chaloTextUIState18 = chaloTextUIState12;
                                            chaloTextUIState19 = chaloTextUIState11;
                                            toolbarUIState8 = toolbarUIState6;
                                            loadingDialogUIState2 = loadingDialogUIStateA;
                                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                            loadingDialogUIState = loadingDialogUIState2;
                                            buttonUIState = buttonUIStateG;
                                            toolbarUIState7 = toolbarUIState8;
                                            baseTextFieldUIState3 = baseTextFieldUIState4;
                                            dividerUIState5 = dividerUIState6;
                                            chaloTextUIState14 = chaloTextUIState17;
                                            textUIState4 = textUIState5;
                                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                            chaloTextUIState15 = chaloTextUIState18;
                                            chaloTextUIState16 = chaloTextUIState19;
                                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                        }
                                    } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                        String str10 = quickpayTripAmountDataState8.j;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                        objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str10, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                        if (objF == obj) {
                                            return obj;
                                        }
                                        baseTextFieldUIState4 = baseTextFieldUIState2;
                                        dividerUIState6 = dividerUIState4;
                                        chaloTextUIState17 = chaloTextUIState13;
                                        textUIState5 = textUIState3;
                                        quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                        chaloTextUIState18 = chaloTextUIState12;
                                        chaloTextUIState19 = chaloTextUIState11;
                                        toolbarUIState8 = toolbarUIState6;
                                        loadingDialogUIState2 = loadingDialogUIStateA;
                                        quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                        loadingDialogUIState = loadingDialogUIState2;
                                        buttonUIState = buttonUIStateG;
                                        toolbarUIState7 = toolbarUIState8;
                                        baseTextFieldUIState3 = baseTextFieldUIState4;
                                        dividerUIState5 = dividerUIState6;
                                        chaloTextUIState14 = chaloTextUIState17;
                                        textUIState4 = textUIState5;
                                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                        chaloTextUIState15 = chaloTextUIState18;
                                        chaloTextUIState16 = chaloTextUIState19;
                                        quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                    } else {
                                        if (quickpayTripAmountScreenBottomSheetType != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        buttonUIState = buttonUIStateG;
                                        quickpayBottomSheetUIState = null;
                                        baseTextFieldUIState3 = baseTextFieldUIState2;
                                        dividerUIState5 = dividerUIState4;
                                        chaloTextUIState14 = chaloTextUIState13;
                                        textUIState4 = textUIState3;
                                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                        chaloTextUIState15 = chaloTextUIState12;
                                        chaloTextUIState16 = chaloTextUIState11;
                                        toolbarUIState7 = toolbarUIState6;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                    }
                                    return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                                }
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState7;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function7;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState11;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState12;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState3;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState13;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateG;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = dialogUIStateFactory;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 7;
                                objB5 = stringProvider4.b(StringEnum.QUICKPAY_INTERNET_LOADING_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                                if (objB5 != obj) {
                                    buttonUIStateG = buttonUIStateG;
                                    dialogUIStateFactory2 = dialogUIStateFactory;
                                    dialogUIStateFactory2.getClass();
                                    QuickpayTripAmountDataState quickpayTripAmountDataState14 = quickpayTripAmountDataState7;
                                    loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                                    quickpayTripAmountDataState8 = quickpayTripAmountDataState14;
                                    quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                    if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                        objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                        if (objE != obj) {
                                            baseTextFieldUIState4 = baseTextFieldUIState2;
                                            dividerUIState6 = dividerUIState4;
                                            chaloTextUIState17 = chaloTextUIState13;
                                            textUIState5 = textUIState3;
                                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                            chaloTextUIState18 = chaloTextUIState12;
                                            chaloTextUIState19 = chaloTextUIState11;
                                            toolbarUIState8 = toolbarUIState6;
                                            loadingDialogUIState2 = loadingDialogUIStateA;
                                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                            loadingDialogUIState = loadingDialogUIState2;
                                            buttonUIState = buttonUIStateG;
                                            toolbarUIState7 = toolbarUIState8;
                                            baseTextFieldUIState3 = baseTextFieldUIState4;
                                            dividerUIState5 = dividerUIState6;
                                            chaloTextUIState14 = chaloTextUIState17;
                                            textUIState4 = textUIState5;
                                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                            chaloTextUIState15 = chaloTextUIState18;
                                            chaloTextUIState16 = chaloTextUIState19;
                                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                        }
                                    } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                        String str11 = quickpayTripAmountDataState8.j;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                        objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str11, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                        if (objF == obj) {
                                            return obj;
                                        }
                                        baseTextFieldUIState4 = baseTextFieldUIState2;
                                        dividerUIState6 = dividerUIState4;
                                        chaloTextUIState17 = chaloTextUIState13;
                                        textUIState5 = textUIState3;
                                        quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                        chaloTextUIState18 = chaloTextUIState12;
                                        chaloTextUIState19 = chaloTextUIState11;
                                        toolbarUIState8 = toolbarUIState6;
                                        loadingDialogUIState2 = loadingDialogUIStateA;
                                        quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                        loadingDialogUIState = loadingDialogUIState2;
                                        buttonUIState = buttonUIStateG;
                                        toolbarUIState7 = toolbarUIState8;
                                        baseTextFieldUIState3 = baseTextFieldUIState4;
                                        dividerUIState5 = dividerUIState6;
                                        chaloTextUIState14 = chaloTextUIState17;
                                        textUIState4 = textUIState5;
                                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                        chaloTextUIState15 = chaloTextUIState18;
                                        chaloTextUIState16 = chaloTextUIState19;
                                        quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                    } else {
                                        if (quickpayTripAmountScreenBottomSheetType != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        buttonUIState = buttonUIStateG;
                                        quickpayBottomSheetUIState = null;
                                        baseTextFieldUIState3 = baseTextFieldUIState2;
                                        dividerUIState5 = dividerUIState4;
                                        chaloTextUIState14 = chaloTextUIState13;
                                        textUIState4 = textUIState3;
                                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                        chaloTextUIState15 = chaloTextUIState12;
                                        chaloTextUIState16 = chaloTextUIState11;
                                        toolbarUIState7 = toolbarUIState6;
                                        loadingDialogUIState = loadingDialogUIStateA;
                                    }
                                    return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                                }
                            }
                        }
                    }
                }
                return obj;
            case 3:
                quickpayDisclaimerUIState2 = (QuickpayDisclaimerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$5;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$4;
                chaloTextUIState6 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                ToolbarUIState toolbarUIState13 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                Function1 function10 = (Function1) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                QuickpayTripAmountDataState quickpayTripAmountDataState15 = (QuickpayTripAmountDataState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                quickpayTripAmountDataState3 = quickpayTripAmountDataState15;
                stringProvider = stringProvider5;
                function3 = function10;
                toolbarUIState3 = toolbarUIState13;
                i = 0;
                textUIState = (TextUIState) objB5;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState3;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function3;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState3;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState6;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState5;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState;
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 4;
                stringProvider2 = stringProvider;
                objB3 = stringProvider2.b(StringEnum.VIEW_CHALO_PAY_HISTORY, new Object[i], quickpayTripAmountUIStateFactory$convertToUIState$1);
                if (objB3 == obj) {
                    ToolbarUIState toolbarUIState14 = toolbarUIState3;
                    chaloTextUIState7 = chaloTextUIState5;
                    toolbarUIState4 = toolbarUIState14;
                    TextUIState.ChaloTextUIState chaloTextUIState23 = chaloTextUIState6;
                    textUIState2 = textUIState;
                    objB5 = objB3;
                    quickpayTripAmountDataState4 = quickpayTripAmountDataState3;
                    function4 = function3;
                    chaloTextUIState8 = chaloTextUIState23;
                    function5 = function4;
                    quickpayTripAmountDataState5 = quickpayTripAmountDataState4;
                    stringProvider3 = stringProvider2;
                    chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, orangePrimary, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new lx0(function4, 12)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                    dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.GreyColor.f9806a, null, 4);
                    str2 = quickpayTripAmountDataState5.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState5;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function5;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState9;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 5;
                    objC = c(str2, quickpayTripAmountUIStateFactory$convertToUIState$1, function5);
                    if (objC != obj) {
                        toolbarUIState5 = toolbarUIState4;
                        chaloTextUIState10 = chaloTextUIState9;
                        quickpayTripAmountDataState6 = quickpayTripAmountDataState5;
                        quickpayDisclaimerUIState3 = quickpayDisclaimerUIState2;
                        dividerUIState2 = dividerUIState;
                        function6 = function5;
                        objB5 = objC;
                        baseTextFieldUIState = (BaseTextFieldUIState) objB5;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState10;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateFactory;
                        dividerUIState3 = dividerUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 6;
                        stringProvider4 = stringProvider3;
                        objB4 = stringProvider4.b(StringEnum.PAY_CONDUCTOR_BUTTON, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objB4 == obj) {
                            TextUIState textUIState9 = textUIState2;
                            baseTextFieldUIState2 = baseTextFieldUIState;
                            objB5 = objB4;
                            chaloTextUIState11 = chaloTextUIState8;
                            textUIState3 = textUIState9;
                            quickpayTripAmountDataState7 = quickpayTripAmountDataState6;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            toolbarUIState6 = toolbarUIState5;
                            function7 = function6;
                            quickpayDisclaimerUIState4 = quickpayDisclaimerUIState3;
                            chaloTextUIState12 = chaloTextUIState7;
                            dividerUIState4 = dividerUIState3;
                            chaloTextUIState13 = chaloTextUIState10;
                            String str12 = (String) objB5;
                            lx0 lx0Var4 = new lx0(function7, 13);
                            i2 = WhenMappings.f8903a[quickpayTripAmountDataState7.f8872a.ordinal()];
                            if (i2 != 1) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str12, lx0Var4, null, null, z2, 0.0f, 44);
                            if (!quickpayTripAmountDataState7.f) {
                                quickpayTripAmountDataState8 = quickpayTripAmountDataState7;
                                loadingDialogUIStateA = null;
                                quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                    objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                    if (objE != obj) {
                                        baseTextFieldUIState4 = baseTextFieldUIState2;
                                        dividerUIState6 = dividerUIState4;
                                        chaloTextUIState17 = chaloTextUIState13;
                                        textUIState5 = textUIState3;
                                        quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                        chaloTextUIState18 = chaloTextUIState12;
                                        chaloTextUIState19 = chaloTextUIState11;
                                        toolbarUIState8 = toolbarUIState6;
                                        loadingDialogUIState2 = loadingDialogUIStateA;
                                        quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                        loadingDialogUIState = loadingDialogUIState2;
                                        buttonUIState = buttonUIStateG;
                                        toolbarUIState7 = toolbarUIState8;
                                        baseTextFieldUIState3 = baseTextFieldUIState4;
                                        dividerUIState5 = dividerUIState6;
                                        chaloTextUIState14 = chaloTextUIState17;
                                        textUIState4 = textUIState5;
                                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                        chaloTextUIState15 = chaloTextUIState18;
                                        chaloTextUIState16 = chaloTextUIState19;
                                        quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                    }
                                } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                    String str13 = quickpayTripAmountDataState8.j;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                    objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str13, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                    if (objF == obj) {
                                        return obj;
                                    }
                                    baseTextFieldUIState4 = baseTextFieldUIState2;
                                    dividerUIState6 = dividerUIState4;
                                    chaloTextUIState17 = chaloTextUIState13;
                                    textUIState5 = textUIState3;
                                    quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                    chaloTextUIState18 = chaloTextUIState12;
                                    chaloTextUIState19 = chaloTextUIState11;
                                    toolbarUIState8 = toolbarUIState6;
                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                    quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                    loadingDialogUIState = loadingDialogUIState2;
                                    buttonUIState = buttonUIStateG;
                                    toolbarUIState7 = toolbarUIState8;
                                    baseTextFieldUIState3 = baseTextFieldUIState4;
                                    dividerUIState5 = dividerUIState6;
                                    chaloTextUIState14 = chaloTextUIState17;
                                    textUIState4 = textUIState5;
                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                    chaloTextUIState15 = chaloTextUIState18;
                                    chaloTextUIState16 = chaloTextUIState19;
                                    quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                } else {
                                    if (quickpayTripAmountScreenBottomSheetType != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    buttonUIState = buttonUIStateG;
                                    quickpayBottomSheetUIState = null;
                                    baseTextFieldUIState3 = baseTextFieldUIState2;
                                    dividerUIState5 = dividerUIState4;
                                    chaloTextUIState14 = chaloTextUIState13;
                                    textUIState4 = textUIState3;
                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                    chaloTextUIState15 = chaloTextUIState12;
                                    chaloTextUIState16 = chaloTextUIState11;
                                    toolbarUIState7 = toolbarUIState6;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                }
                                return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                            }
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState7;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function7;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState11;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState12;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState13;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateG;
                            dialogUIStateFactory = DialogUIStateFactory.f9989a;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = dialogUIStateFactory;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 7;
                            objB5 = stringProvider4.b(StringEnum.QUICKPAY_INTERNET_LOADING_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                            if (objB5 != obj) {
                                buttonUIStateG = buttonUIStateG;
                                dialogUIStateFactory2 = dialogUIStateFactory;
                                dialogUIStateFactory2.getClass();
                                QuickpayTripAmountDataState quickpayTripAmountDataState16 = quickpayTripAmountDataState7;
                                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                                quickpayTripAmountDataState8 = quickpayTripAmountDataState16;
                                quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                                if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                    objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                    if (objE != obj) {
                                        baseTextFieldUIState4 = baseTextFieldUIState2;
                                        dividerUIState6 = dividerUIState4;
                                        chaloTextUIState17 = chaloTextUIState13;
                                        textUIState5 = textUIState3;
                                        quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                        chaloTextUIState18 = chaloTextUIState12;
                                        chaloTextUIState19 = chaloTextUIState11;
                                        toolbarUIState8 = toolbarUIState6;
                                        loadingDialogUIState2 = loadingDialogUIStateA;
                                        quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                        loadingDialogUIState = loadingDialogUIState2;
                                        buttonUIState = buttonUIStateG;
                                        toolbarUIState7 = toolbarUIState8;
                                        baseTextFieldUIState3 = baseTextFieldUIState4;
                                        dividerUIState5 = dividerUIState6;
                                        chaloTextUIState14 = chaloTextUIState17;
                                        textUIState4 = textUIState5;
                                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                        chaloTextUIState15 = chaloTextUIState18;
                                        chaloTextUIState16 = chaloTextUIState19;
                                        quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                    }
                                } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                    String str14 = quickpayTripAmountDataState8.j;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                    objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str14, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                    if (objF == obj) {
                                        return obj;
                                    }
                                    baseTextFieldUIState4 = baseTextFieldUIState2;
                                    dividerUIState6 = dividerUIState4;
                                    chaloTextUIState17 = chaloTextUIState13;
                                    textUIState5 = textUIState3;
                                    quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                    chaloTextUIState18 = chaloTextUIState12;
                                    chaloTextUIState19 = chaloTextUIState11;
                                    toolbarUIState8 = toolbarUIState6;
                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                    quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                    loadingDialogUIState = loadingDialogUIState2;
                                    buttonUIState = buttonUIStateG;
                                    toolbarUIState7 = toolbarUIState8;
                                    baseTextFieldUIState3 = baseTextFieldUIState4;
                                    dividerUIState5 = dividerUIState6;
                                    chaloTextUIState14 = chaloTextUIState17;
                                    textUIState4 = textUIState5;
                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                    chaloTextUIState15 = chaloTextUIState18;
                                    chaloTextUIState16 = chaloTextUIState19;
                                    quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                } else {
                                    if (quickpayTripAmountScreenBottomSheetType != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    buttonUIState = buttonUIStateG;
                                    quickpayBottomSheetUIState = null;
                                    baseTextFieldUIState3 = baseTextFieldUIState2;
                                    dividerUIState5 = dividerUIState4;
                                    chaloTextUIState14 = chaloTextUIState13;
                                    textUIState4 = textUIState3;
                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                    chaloTextUIState15 = chaloTextUIState12;
                                    chaloTextUIState16 = chaloTextUIState11;
                                    toolbarUIState7 = toolbarUIState6;
                                    loadingDialogUIState = loadingDialogUIStateA;
                                }
                                return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                            }
                        }
                    }
                }
                return obj;
            case 4:
                TextUIState textUIState10 = (TextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$6;
                QuickpayDisclaimerUIState quickpayDisclaimerUIState7 = (QuickpayDisclaimerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState24 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState25 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                ToolbarUIState toolbarUIState15 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                Function1 function11 = (Function1) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                QuickpayTripAmountDataState quickpayTripAmountDataState17 = (QuickpayTripAmountDataState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                textUIState2 = textUIState10;
                quickpayDisclaimerUIState2 = quickpayDisclaimerUIState7;
                toolbarUIState4 = toolbarUIState15;
                chaloTextUIState7 = chaloTextUIState24;
                quickpayTripAmountDataState4 = quickpayTripAmountDataState17;
                stringProvider2 = stringProvider5;
                function4 = function11;
                chaloTextUIState8 = chaloTextUIState25;
                function5 = function4;
                quickpayTripAmountDataState5 = quickpayTripAmountDataState4;
                stringProvider3 = stringProvider2;
                chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.HeadlineSmall, orangePrimary, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, UiEventHandler.Companion.a(new lx0(function4, 12)), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7896);
                dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.GreyColor.f9806a, null, 4);
                str2 = quickpayTripAmountDataState5.b;
                if (str2 == null) {
                    str2 = "";
                }
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState5;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function5;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState4;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState9;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState;
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 5;
                objC = c(str2, quickpayTripAmountUIStateFactory$convertToUIState$1, function5);
                if (objC != obj) {
                    toolbarUIState5 = toolbarUIState4;
                    chaloTextUIState10 = chaloTextUIState9;
                    quickpayTripAmountDataState6 = quickpayTripAmountDataState5;
                    quickpayDisclaimerUIState3 = quickpayDisclaimerUIState2;
                    dividerUIState2 = dividerUIState;
                    function6 = function5;
                    objB5 = objC;
                    baseTextFieldUIState = (BaseTextFieldUIState) objB5;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState6;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function6;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState10;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateFactory;
                    dividerUIState3 = dividerUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 6;
                    stringProvider4 = stringProvider3;
                    objB4 = stringProvider4.b(StringEnum.PAY_CONDUCTOR_BUTTON, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                    if (objB4 == obj) {
                        TextUIState textUIState11 = textUIState2;
                        baseTextFieldUIState2 = baseTextFieldUIState;
                        objB5 = objB4;
                        chaloTextUIState11 = chaloTextUIState8;
                        textUIState3 = textUIState11;
                        quickpayTripAmountDataState7 = quickpayTripAmountDataState6;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        toolbarUIState6 = toolbarUIState5;
                        function7 = function6;
                        quickpayDisclaimerUIState4 = quickpayDisclaimerUIState3;
                        chaloTextUIState12 = chaloTextUIState7;
                        dividerUIState4 = dividerUIState3;
                        chaloTextUIState13 = chaloTextUIState10;
                        String str15 = (String) objB5;
                        lx0 lx0Var5 = new lx0(function7, 13);
                        i2 = WhenMappings.f8903a[quickpayTripAmountDataState7.f8872a.ordinal()];
                        if (i2 != 1) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str15, lx0Var5, null, null, z2, 0.0f, 44);
                        if (!quickpayTripAmountDataState7.f) {
                            quickpayTripAmountDataState8 = quickpayTripAmountDataState7;
                            loadingDialogUIStateA = null;
                            quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                            if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                if (objE != obj) {
                                    baseTextFieldUIState4 = baseTextFieldUIState2;
                                    dividerUIState6 = dividerUIState4;
                                    chaloTextUIState17 = chaloTextUIState13;
                                    textUIState5 = textUIState3;
                                    quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                    chaloTextUIState18 = chaloTextUIState12;
                                    chaloTextUIState19 = chaloTextUIState11;
                                    toolbarUIState8 = toolbarUIState6;
                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                    quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                    loadingDialogUIState = loadingDialogUIState2;
                                    buttonUIState = buttonUIStateG;
                                    toolbarUIState7 = toolbarUIState8;
                                    baseTextFieldUIState3 = baseTextFieldUIState4;
                                    dividerUIState5 = dividerUIState6;
                                    chaloTextUIState14 = chaloTextUIState17;
                                    textUIState4 = textUIState5;
                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                    chaloTextUIState15 = chaloTextUIState18;
                                    chaloTextUIState16 = chaloTextUIState19;
                                    quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                }
                            } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                String str16 = quickpayTripAmountDataState8.j;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str16, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                if (objF == obj) {
                                    return obj;
                                }
                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                dividerUIState6 = dividerUIState4;
                                chaloTextUIState17 = chaloTextUIState13;
                                textUIState5 = textUIState3;
                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                chaloTextUIState18 = chaloTextUIState12;
                                chaloTextUIState19 = chaloTextUIState11;
                                toolbarUIState8 = toolbarUIState6;
                                loadingDialogUIState2 = loadingDialogUIStateA;
                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                loadingDialogUIState = loadingDialogUIState2;
                                buttonUIState = buttonUIStateG;
                                toolbarUIState7 = toolbarUIState8;
                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                dividerUIState5 = dividerUIState6;
                                chaloTextUIState14 = chaloTextUIState17;
                                textUIState4 = textUIState5;
                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                chaloTextUIState15 = chaloTextUIState18;
                                chaloTextUIState16 = chaloTextUIState19;
                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                            } else {
                                if (quickpayTripAmountScreenBottomSheetType != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                buttonUIState = buttonUIStateG;
                                quickpayBottomSheetUIState = null;
                                baseTextFieldUIState3 = baseTextFieldUIState2;
                                dividerUIState5 = dividerUIState4;
                                chaloTextUIState14 = chaloTextUIState13;
                                textUIState4 = textUIState3;
                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                chaloTextUIState15 = chaloTextUIState12;
                                chaloTextUIState16 = chaloTextUIState11;
                                toolbarUIState7 = toolbarUIState6;
                                loadingDialogUIState = loadingDialogUIStateA;
                            }
                            return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                        }
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState7;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function7;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState11;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState12;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState13;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateG;
                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = dialogUIStateFactory;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 7;
                        objB5 = stringProvider4.b(StringEnum.QUICKPAY_INTERNET_LOADING_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objB5 != obj) {
                            buttonUIStateG = buttonUIStateG;
                            dialogUIStateFactory2 = dialogUIStateFactory;
                            dialogUIStateFactory2.getClass();
                            QuickpayTripAmountDataState quickpayTripAmountDataState18 = quickpayTripAmountDataState7;
                            loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                            quickpayTripAmountDataState8 = quickpayTripAmountDataState18;
                            quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                            if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                                objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                if (objE != obj) {
                                    baseTextFieldUIState4 = baseTextFieldUIState2;
                                    dividerUIState6 = dividerUIState4;
                                    chaloTextUIState17 = chaloTextUIState13;
                                    textUIState5 = textUIState3;
                                    quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                    chaloTextUIState18 = chaloTextUIState12;
                                    chaloTextUIState19 = chaloTextUIState11;
                                    toolbarUIState8 = toolbarUIState6;
                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                    quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                    loadingDialogUIState = loadingDialogUIState2;
                                    buttonUIState = buttonUIStateG;
                                    toolbarUIState7 = toolbarUIState8;
                                    baseTextFieldUIState3 = baseTextFieldUIState4;
                                    dividerUIState5 = dividerUIState6;
                                    chaloTextUIState14 = chaloTextUIState17;
                                    textUIState4 = textUIState5;
                                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                    chaloTextUIState15 = chaloTextUIState18;
                                    chaloTextUIState16 = chaloTextUIState19;
                                    quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                                }
                            } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                                String str17 = quickpayTripAmountDataState8.j;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                                objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str17, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                                if (objF == obj) {
                                    return obj;
                                }
                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                dividerUIState6 = dividerUIState4;
                                chaloTextUIState17 = chaloTextUIState13;
                                textUIState5 = textUIState3;
                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                chaloTextUIState18 = chaloTextUIState12;
                                chaloTextUIState19 = chaloTextUIState11;
                                toolbarUIState8 = toolbarUIState6;
                                loadingDialogUIState2 = loadingDialogUIStateA;
                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                                loadingDialogUIState = loadingDialogUIState2;
                                buttonUIState = buttonUIStateG;
                                toolbarUIState7 = toolbarUIState8;
                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                dividerUIState5 = dividerUIState6;
                                chaloTextUIState14 = chaloTextUIState17;
                                textUIState4 = textUIState5;
                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                chaloTextUIState15 = chaloTextUIState18;
                                chaloTextUIState16 = chaloTextUIState19;
                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                            } else {
                                if (quickpayTripAmountScreenBottomSheetType != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                buttonUIState = buttonUIStateG;
                                quickpayBottomSheetUIState = null;
                                baseTextFieldUIState3 = baseTextFieldUIState2;
                                dividerUIState5 = dividerUIState4;
                                chaloTextUIState14 = chaloTextUIState13;
                                textUIState4 = textUIState3;
                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                                chaloTextUIState15 = chaloTextUIState12;
                                chaloTextUIState16 = chaloTextUIState11;
                                toolbarUIState7 = toolbarUIState6;
                                loadingDialogUIState = loadingDialogUIStateA;
                            }
                            return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                        }
                    }
                }
                return obj;
            case 5:
                dividerUIState2 = (DividerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$8;
                chaloTextUIState10 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$7;
                textUIState2 = (TextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$6;
                quickpayDisclaimerUIState3 = (QuickpayDisclaimerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$5;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$4;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState5 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                function6 = (Function1) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                quickpayTripAmountDataState6 = (QuickpayTripAmountDataState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                stringProvider3 = stringProvider5;
                baseTextFieldUIState = (BaseTextFieldUIState) objB5;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState6;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function6;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState5;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState8;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState7;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState3;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState10;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateFactory;
                dividerUIState3 = dividerUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 6;
                stringProvider4 = stringProvider3;
                objB4 = stringProvider4.b(StringEnum.PAY_CONDUCTOR_BUTTON, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                if (objB4 == obj) {
                    TextUIState textUIState12 = textUIState2;
                    baseTextFieldUIState2 = baseTextFieldUIState;
                    objB5 = objB4;
                    chaloTextUIState11 = chaloTextUIState8;
                    textUIState3 = textUIState12;
                    quickpayTripAmountDataState7 = quickpayTripAmountDataState6;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    toolbarUIState6 = toolbarUIState5;
                    function7 = function6;
                    quickpayDisclaimerUIState4 = quickpayDisclaimerUIState3;
                    chaloTextUIState12 = chaloTextUIState7;
                    dividerUIState4 = dividerUIState3;
                    chaloTextUIState13 = chaloTextUIState10;
                    String str18 = (String) objB5;
                    lx0 lx0Var6 = new lx0(function7, 13);
                    i2 = WhenMappings.f8903a[quickpayTripAmountDataState7.f8872a.ordinal()];
                    if (i2 != 1) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str18, lx0Var6, null, null, z2, 0.0f, 44);
                    if (!quickpayTripAmountDataState7.f) {
                        quickpayTripAmountDataState8 = quickpayTripAmountDataState7;
                        loadingDialogUIStateA = null;
                        quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                        if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                            objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                            if (objE != obj) {
                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                dividerUIState6 = dividerUIState4;
                                chaloTextUIState17 = chaloTextUIState13;
                                textUIState5 = textUIState3;
                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                chaloTextUIState18 = chaloTextUIState12;
                                chaloTextUIState19 = chaloTextUIState11;
                                toolbarUIState8 = toolbarUIState6;
                                loadingDialogUIState2 = loadingDialogUIStateA;
                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                loadingDialogUIState = loadingDialogUIState2;
                                buttonUIState = buttonUIStateG;
                                toolbarUIState7 = toolbarUIState8;
                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                dividerUIState5 = dividerUIState6;
                                chaloTextUIState14 = chaloTextUIState17;
                                textUIState4 = textUIState5;
                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                chaloTextUIState15 = chaloTextUIState18;
                                chaloTextUIState16 = chaloTextUIState19;
                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                            }
                        } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                            String str19 = quickpayTripAmountDataState8.j;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                            objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str19, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                            if (objF == obj) {
                                return obj;
                            }
                            baseTextFieldUIState4 = baseTextFieldUIState2;
                            dividerUIState6 = dividerUIState4;
                            chaloTextUIState17 = chaloTextUIState13;
                            textUIState5 = textUIState3;
                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                            chaloTextUIState18 = chaloTextUIState12;
                            chaloTextUIState19 = chaloTextUIState11;
                            toolbarUIState8 = toolbarUIState6;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                            loadingDialogUIState = loadingDialogUIState2;
                            buttonUIState = buttonUIStateG;
                            toolbarUIState7 = toolbarUIState8;
                            baseTextFieldUIState3 = baseTextFieldUIState4;
                            dividerUIState5 = dividerUIState6;
                            chaloTextUIState14 = chaloTextUIState17;
                            textUIState4 = textUIState5;
                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                            chaloTextUIState15 = chaloTextUIState18;
                            chaloTextUIState16 = chaloTextUIState19;
                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                        } else {
                            if (quickpayTripAmountScreenBottomSheetType != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            buttonUIState = buttonUIStateG;
                            quickpayBottomSheetUIState = null;
                            baseTextFieldUIState3 = baseTextFieldUIState2;
                            dividerUIState5 = dividerUIState4;
                            chaloTextUIState14 = chaloTextUIState13;
                            textUIState4 = textUIState3;
                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                            chaloTextUIState15 = chaloTextUIState12;
                            chaloTextUIState16 = chaloTextUIState11;
                            toolbarUIState7 = toolbarUIState6;
                            loadingDialogUIState = loadingDialogUIStateA;
                        }
                        return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                    }
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState7;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function7;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState11;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState12;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState13;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateG;
                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = dialogUIStateFactory;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 7;
                    objB5 = stringProvider4.b(StringEnum.QUICKPAY_INTERNET_LOADING_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                    if (objB5 != obj) {
                        buttonUIStateG = buttonUIStateG;
                        dialogUIStateFactory2 = dialogUIStateFactory;
                        dialogUIStateFactory2.getClass();
                        QuickpayTripAmountDataState quickpayTripAmountDataState19 = quickpayTripAmountDataState7;
                        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                        quickpayTripAmountDataState8 = quickpayTripAmountDataState19;
                        quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                        if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                            objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                            if (objE != obj) {
                                baseTextFieldUIState4 = baseTextFieldUIState2;
                                dividerUIState6 = dividerUIState4;
                                chaloTextUIState17 = chaloTextUIState13;
                                textUIState5 = textUIState3;
                                quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                                chaloTextUIState18 = chaloTextUIState12;
                                chaloTextUIState19 = chaloTextUIState11;
                                toolbarUIState8 = toolbarUIState6;
                                loadingDialogUIState2 = loadingDialogUIStateA;
                                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                                loadingDialogUIState = loadingDialogUIState2;
                                buttonUIState = buttonUIStateG;
                                toolbarUIState7 = toolbarUIState8;
                                baseTextFieldUIState3 = baseTextFieldUIState4;
                                dividerUIState5 = dividerUIState6;
                                chaloTextUIState14 = chaloTextUIState17;
                                textUIState4 = textUIState5;
                                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                                chaloTextUIState15 = chaloTextUIState18;
                                chaloTextUIState16 = chaloTextUIState19;
                                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                            }
                        } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                            String str110 = quickpayTripAmountDataState8.j;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                            quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                            objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str110, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                            if (objF == obj) {
                                return obj;
                            }
                            baseTextFieldUIState4 = baseTextFieldUIState2;
                            dividerUIState6 = dividerUIState4;
                            chaloTextUIState17 = chaloTextUIState13;
                            textUIState5 = textUIState3;
                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                            chaloTextUIState18 = chaloTextUIState12;
                            chaloTextUIState19 = chaloTextUIState11;
                            toolbarUIState8 = toolbarUIState6;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                            loadingDialogUIState = loadingDialogUIState2;
                            buttonUIState = buttonUIStateG;
                            toolbarUIState7 = toolbarUIState8;
                            baseTextFieldUIState3 = baseTextFieldUIState4;
                            dividerUIState5 = dividerUIState6;
                            chaloTextUIState14 = chaloTextUIState17;
                            textUIState4 = textUIState5;
                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                            chaloTextUIState15 = chaloTextUIState18;
                            chaloTextUIState16 = chaloTextUIState19;
                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                        } else {
                            if (quickpayTripAmountScreenBottomSheetType != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            buttonUIState = buttonUIStateG;
                            quickpayBottomSheetUIState = null;
                            baseTextFieldUIState3 = baseTextFieldUIState2;
                            dividerUIState5 = dividerUIState4;
                            chaloTextUIState14 = chaloTextUIState13;
                            textUIState4 = textUIState3;
                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                            chaloTextUIState15 = chaloTextUIState12;
                            chaloTextUIState16 = chaloTextUIState11;
                            toolbarUIState7 = toolbarUIState6;
                            loadingDialogUIState = loadingDialogUIStateA;
                        }
                        return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                    }
                }
                return obj;
            case 6:
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) quickpayTripAmountUIStateFactory$convertToUIState$1.L$10;
                BaseTextFieldUIState baseTextFieldUIState5 = (BaseTextFieldUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$9;
                DividerUIState dividerUIState7 = (DividerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$8;
                TextUIState.ChaloTextUIState chaloTextUIState26 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$7;
                TextUIState textUIState13 = (TextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$6;
                QuickpayDisclaimerUIState quickpayDisclaimerUIState8 = (QuickpayDisclaimerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState27 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState28 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                ToolbarUIState toolbarUIState16 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                Function1 function12 = (Function1) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                QuickpayTripAmountDataState quickpayTripAmountDataState20 = (QuickpayTripAmountDataState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                function7 = function12;
                quickpayDisclaimerUIState4 = quickpayDisclaimerUIState8;
                buttonUIStateFactory2 = buttonUIStateFactory3;
                stringProvider4 = stringProvider5;
                chaloTextUIState11 = chaloTextUIState28;
                chaloTextUIState13 = chaloTextUIState26;
                toolbarUIState6 = toolbarUIState16;
                textUIState3 = textUIState13;
                quickpayTripAmountDataState7 = quickpayTripAmountDataState20;
                chaloTextUIState12 = chaloTextUIState27;
                dividerUIState4 = dividerUIState7;
                baseTextFieldUIState2 = baseTextFieldUIState5;
                String str111 = (String) objB5;
                lx0 lx0Var7 = new lx0(function7, 13);
                i2 = WhenMappings.f8903a[quickpayTripAmountDataState7.f8872a.ordinal()];
                if (i2 != 1) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str111, lx0Var7, null, null, z2, 0.0f, 44);
                if (!quickpayTripAmountDataState7.f) {
                    quickpayTripAmountDataState8 = quickpayTripAmountDataState7;
                    loadingDialogUIStateA = null;
                    quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                    if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                        objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objE != obj) {
                            baseTextFieldUIState4 = baseTextFieldUIState2;
                            dividerUIState6 = dividerUIState4;
                            chaloTextUIState17 = chaloTextUIState13;
                            textUIState5 = textUIState3;
                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                            chaloTextUIState18 = chaloTextUIState12;
                            chaloTextUIState19 = chaloTextUIState11;
                            toolbarUIState8 = toolbarUIState6;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                            loadingDialogUIState = loadingDialogUIState2;
                            buttonUIState = buttonUIStateG;
                            toolbarUIState7 = toolbarUIState8;
                            baseTextFieldUIState3 = baseTextFieldUIState4;
                            dividerUIState5 = dividerUIState6;
                            chaloTextUIState14 = chaloTextUIState17;
                            textUIState4 = textUIState5;
                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                            chaloTextUIState15 = chaloTextUIState18;
                            chaloTextUIState16 = chaloTextUIState19;
                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                        }
                    } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                        String str112 = quickpayTripAmountDataState8.j;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                        objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str112, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objF == obj) {
                            return obj;
                        }
                        baseTextFieldUIState4 = baseTextFieldUIState2;
                        dividerUIState6 = dividerUIState4;
                        chaloTextUIState17 = chaloTextUIState13;
                        textUIState5 = textUIState3;
                        quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                        chaloTextUIState18 = chaloTextUIState12;
                        chaloTextUIState19 = chaloTextUIState11;
                        toolbarUIState8 = toolbarUIState6;
                        loadingDialogUIState2 = loadingDialogUIStateA;
                        quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                        loadingDialogUIState = loadingDialogUIState2;
                        buttonUIState = buttonUIStateG;
                        toolbarUIState7 = toolbarUIState8;
                        baseTextFieldUIState3 = baseTextFieldUIState4;
                        dividerUIState5 = dividerUIState6;
                        chaloTextUIState14 = chaloTextUIState17;
                        textUIState4 = textUIState5;
                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                        chaloTextUIState15 = chaloTextUIState18;
                        chaloTextUIState16 = chaloTextUIState19;
                        quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                    } else {
                        if (quickpayTripAmountScreenBottomSheetType != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        buttonUIState = buttonUIStateG;
                        quickpayBottomSheetUIState = null;
                        baseTextFieldUIState3 = baseTextFieldUIState2;
                        dividerUIState5 = dividerUIState4;
                        chaloTextUIState14 = chaloTextUIState13;
                        textUIState4 = textUIState3;
                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                        chaloTextUIState15 = chaloTextUIState12;
                        chaloTextUIState16 = chaloTextUIState11;
                        toolbarUIState7 = toolbarUIState6;
                        loadingDialogUIState = loadingDialogUIStateA;
                    }
                    return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                }
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = quickpayTripAmountDataState7;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = function7;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = toolbarUIState6;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = chaloTextUIState11;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = chaloTextUIState12;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = quickpayDisclaimerUIState4;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = textUIState3;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = chaloTextUIState13;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = dividerUIState4;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = baseTextFieldUIState2;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = buttonUIStateG;
                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = dialogUIStateFactory;
                quickpayTripAmountUIStateFactory$convertToUIState$1.label = 7;
                objB5 = stringProvider4.b(StringEnum.QUICKPAY_INTERNET_LOADING_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$convertToUIState$1);
                if (objB5 != obj) {
                    buttonUIStateG = buttonUIStateG;
                    dialogUIStateFactory2 = dialogUIStateFactory;
                    dialogUIStateFactory2.getClass();
                    QuickpayTripAmountDataState quickpayTripAmountDataState110 = quickpayTripAmountDataState7;
                    loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                    quickpayTripAmountDataState8 = quickpayTripAmountDataState110;
                    quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                    if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                        objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objE != obj) {
                            baseTextFieldUIState4 = baseTextFieldUIState2;
                            dividerUIState6 = dividerUIState4;
                            chaloTextUIState17 = chaloTextUIState13;
                            textUIState5 = textUIState3;
                            quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                            chaloTextUIState18 = chaloTextUIState12;
                            chaloTextUIState19 = chaloTextUIState11;
                            toolbarUIState8 = toolbarUIState6;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                            loadingDialogUIState = loadingDialogUIState2;
                            buttonUIState = buttonUIStateG;
                            toolbarUIState7 = toolbarUIState8;
                            baseTextFieldUIState3 = baseTextFieldUIState4;
                            dividerUIState5 = dividerUIState6;
                            chaloTextUIState14 = chaloTextUIState17;
                            textUIState4 = textUIState5;
                            quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                            chaloTextUIState15 = chaloTextUIState18;
                            chaloTextUIState16 = chaloTextUIState19;
                            quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                        }
                    } else if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                        String str113 = quickpayTripAmountDataState8.j;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                        quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                        objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str113, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                        if (objF == obj) {
                            return obj;
                        }
                        baseTextFieldUIState4 = baseTextFieldUIState2;
                        dividerUIState6 = dividerUIState4;
                        chaloTextUIState17 = chaloTextUIState13;
                        textUIState5 = textUIState3;
                        quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                        chaloTextUIState18 = chaloTextUIState12;
                        chaloTextUIState19 = chaloTextUIState11;
                        toolbarUIState8 = toolbarUIState6;
                        loadingDialogUIState2 = loadingDialogUIStateA;
                        quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                        loadingDialogUIState = loadingDialogUIState2;
                        buttonUIState = buttonUIStateG;
                        toolbarUIState7 = toolbarUIState8;
                        baseTextFieldUIState3 = baseTextFieldUIState4;
                        dividerUIState5 = dividerUIState6;
                        chaloTextUIState14 = chaloTextUIState17;
                        textUIState4 = textUIState5;
                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                        chaloTextUIState15 = chaloTextUIState18;
                        chaloTextUIState16 = chaloTextUIState19;
                        quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                    } else {
                        if (quickpayTripAmountScreenBottomSheetType != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        buttonUIState = buttonUIStateG;
                        quickpayBottomSheetUIState = null;
                        baseTextFieldUIState3 = baseTextFieldUIState2;
                        dividerUIState5 = dividerUIState4;
                        chaloTextUIState14 = chaloTextUIState13;
                        textUIState4 = textUIState3;
                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                        chaloTextUIState15 = chaloTextUIState12;
                        chaloTextUIState16 = chaloTextUIState11;
                        toolbarUIState7 = toolbarUIState6;
                        loadingDialogUIState = loadingDialogUIStateA;
                    }
                    return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
                }
                return obj;
            case 7:
                dialogUIStateFactory2 = (DialogUIStateFactory) quickpayTripAmountUIStateFactory$convertToUIState$1.L$11;
                buttonUIStateG = (ButtonUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$10;
                baseTextFieldUIState2 = (BaseTextFieldUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$9;
                dividerUIState4 = (DividerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$8;
                chaloTextUIState13 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$7;
                textUIState3 = (TextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$6;
                quickpayDisclaimerUIState4 = (QuickpayDisclaimerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$5;
                chaloTextUIState12 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$4;
                chaloTextUIState11 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState6 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                function7 = (Function1) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                quickpayTripAmountDataState7 = (QuickpayTripAmountDataState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                dialogUIStateFactory2.getClass();
                QuickpayTripAmountDataState quickpayTripAmountDataState111 = quickpayTripAmountDataState7;
                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB5);
                quickpayTripAmountDataState8 = quickpayTripAmountDataState111;
                quickpayTripAmountScreenBottomSheetType = quickpayTripAmountDataState8.g;
                if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 8;
                    objE = e(function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                    if (objE != obj) {
                        baseTextFieldUIState4 = baseTextFieldUIState2;
                        dividerUIState6 = dividerUIState4;
                        chaloTextUIState17 = chaloTextUIState13;
                        textUIState5 = textUIState3;
                        quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                        chaloTextUIState18 = chaloTextUIState12;
                        chaloTextUIState19 = chaloTextUIState11;
                        toolbarUIState8 = toolbarUIState6;
                        loadingDialogUIState2 = loadingDialogUIStateA;
                        quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                        loadingDialogUIState = loadingDialogUIState2;
                        buttonUIState = buttonUIStateG;
                        toolbarUIState7 = toolbarUIState8;
                        baseTextFieldUIState3 = baseTextFieldUIState4;
                        dividerUIState5 = dividerUIState6;
                        chaloTextUIState14 = chaloTextUIState17;
                        textUIState4 = textUIState5;
                        quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                        chaloTextUIState15 = chaloTextUIState18;
                        chaloTextUIState16 = chaloTextUIState19;
                        quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                    }
                    return obj;
                }
                if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                    String str114 = quickpayTripAmountDataState8.j;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$0 = toolbarUIState6;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$1 = chaloTextUIState11;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$2 = chaloTextUIState12;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$3 = quickpayDisclaimerUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$4 = textUIState3;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$5 = chaloTextUIState13;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$6 = dividerUIState4;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$7 = baseTextFieldUIState2;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$8 = buttonUIStateG;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$9 = loadingDialogUIStateA;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$10 = null;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.L$11 = null;
                    quickpayTripAmountUIStateFactory$convertToUIState$1.label = 9;
                    objF = f((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) quickpayTripAmountScreenBottomSheetType, str114, function7, quickpayTripAmountUIStateFactory$convertToUIState$1);
                    if (objF == obj) {
                        return obj;
                    }
                    baseTextFieldUIState4 = baseTextFieldUIState2;
                    dividerUIState6 = dividerUIState4;
                    chaloTextUIState17 = chaloTextUIState13;
                    textUIState5 = textUIState3;
                    quickpayDisclaimerUIState6 = quickpayDisclaimerUIState4;
                    chaloTextUIState18 = chaloTextUIState12;
                    chaloTextUIState19 = chaloTextUIState11;
                    toolbarUIState8 = toolbarUIState6;
                    loadingDialogUIState2 = loadingDialogUIStateA;
                    quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                    loadingDialogUIState = loadingDialogUIState2;
                    buttonUIState = buttonUIStateG;
                    toolbarUIState7 = toolbarUIState8;
                    baseTextFieldUIState3 = baseTextFieldUIState4;
                    dividerUIState5 = dividerUIState6;
                    chaloTextUIState14 = chaloTextUIState17;
                    textUIState4 = textUIState5;
                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                    chaloTextUIState15 = chaloTextUIState18;
                    chaloTextUIState16 = chaloTextUIState19;
                    quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                } else {
                    if (quickpayTripAmountScreenBottomSheetType != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buttonUIState = buttonUIStateG;
                    quickpayBottomSheetUIState = null;
                    baseTextFieldUIState3 = baseTextFieldUIState2;
                    dividerUIState5 = dividerUIState4;
                    chaloTextUIState14 = chaloTextUIState13;
                    textUIState4 = textUIState3;
                    quickpayDisclaimerUIState5 = quickpayDisclaimerUIState4;
                    chaloTextUIState15 = chaloTextUIState12;
                    chaloTextUIState16 = chaloTextUIState11;
                    toolbarUIState7 = toolbarUIState6;
                    loadingDialogUIState = loadingDialogUIStateA;
                }
                return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
            case 8:
                loadingDialogUIState2 = (LoadingDialogUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$9;
                buttonUIStateG = (ButtonUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$8;
                baseTextFieldUIState4 = (BaseTextFieldUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$7;
                dividerUIState6 = (DividerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$6;
                chaloTextUIState17 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$5;
                textUIState5 = (TextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$4;
                quickpayDisclaimerUIState6 = (QuickpayDisclaimerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                chaloTextUIState18 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                chaloTextUIState19 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                toolbarUIState8 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                objE = objB5;
                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objE;
                loadingDialogUIState = loadingDialogUIState2;
                buttonUIState = buttonUIStateG;
                toolbarUIState7 = toolbarUIState8;
                baseTextFieldUIState3 = baseTextFieldUIState4;
                dividerUIState5 = dividerUIState6;
                chaloTextUIState14 = chaloTextUIState17;
                textUIState4 = textUIState5;
                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                chaloTextUIState15 = chaloTextUIState18;
                chaloTextUIState16 = chaloTextUIState19;
                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
            case 9:
                loadingDialogUIState2 = (LoadingDialogUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$9;
                buttonUIStateG = (ButtonUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$8;
                baseTextFieldUIState4 = (BaseTextFieldUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$7;
                dividerUIState6 = (DividerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$6;
                chaloTextUIState17 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$5;
                textUIState5 = (TextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$4;
                quickpayDisclaimerUIState6 = (QuickpayDisclaimerUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$3;
                chaloTextUIState18 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$2;
                chaloTextUIState19 = (TextUIState.ChaloTextUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$1;
                toolbarUIState8 = (ToolbarUIState) quickpayTripAmountUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB5);
                objF = objB5;
                quickpayBottomSheetUIState2 = (QuickpayBottomSheetUIState) objF;
                loadingDialogUIState = loadingDialogUIState2;
                buttonUIState = buttonUIStateG;
                toolbarUIState7 = toolbarUIState8;
                baseTextFieldUIState3 = baseTextFieldUIState4;
                dividerUIState5 = dividerUIState6;
                chaloTextUIState14 = chaloTextUIState17;
                textUIState4 = textUIState5;
                quickpayDisclaimerUIState5 = quickpayDisclaimerUIState6;
                chaloTextUIState15 = chaloTextUIState18;
                chaloTextUIState16 = chaloTextUIState19;
                quickpayBottomSheetUIState = quickpayBottomSheetUIState2;
                return new QuickPayTripAmountUIState(toolbarUIState7, chaloTextUIState16, chaloTextUIState15, quickpayDisclaimerUIState5, baseTextFieldUIState3, textUIState4, chaloTextUIState14, dividerUIState5, buttonUIState, loadingDialogUIState, quickpayBottomSheetUIState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, ContinuationImpl continuationImpl, Function1 function1) {
        QuickpayTripAmountUIStateFactory$enterAmountTextField$1 quickpayTripAmountUIStateFactory$enterAmountTextField$1;
        String str2;
        Function1 function2;
        if (continuationImpl instanceof QuickpayTripAmountUIStateFactory$enterAmountTextField$1) {
            quickpayTripAmountUIStateFactory$enterAmountTextField$1 = (QuickpayTripAmountUIStateFactory$enterAmountTextField$1) continuationImpl;
            int i = quickpayTripAmountUIStateFactory$enterAmountTextField$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickpayTripAmountUIStateFactory$enterAmountTextField$1.label = i - Integer.MIN_VALUE;
            } else {
                quickpayTripAmountUIStateFactory$enterAmountTextField$1 = new QuickpayTripAmountUIStateFactory$enterAmountTextField$1(this, continuationImpl);
            }
        } else {
            quickpayTripAmountUIStateFactory$enterAmountTextField$1 = new QuickpayTripAmountUIStateFactory$enterAmountTextField$1(this, continuationImpl);
        }
        Object obj = quickpayTripAmountUIStateFactory$enterAmountTextField$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickpayTripAmountUIStateFactory$enterAmountTextField$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strD = str.length() == 0 ? this.b.d() : str;
            quickpayTripAmountUIStateFactory$enterAmountTextField$1.L$0 = function1;
            quickpayTripAmountUIStateFactory$enterAmountTextField$1.L$1 = strD;
            quickpayTripAmountUIStateFactory$enterAmountTextField$1.label = 1;
            Object objB = this.f8902a.b(StringEnum.ENTER_TICKET_AMOUNT, new Object[0], quickpayTripAmountUIStateFactory$enterAmountTextField$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = strD;
            obj = objB;
            function2 = function1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) quickpayTripAmountUIStateFactory$enterAmountTextField$1.L$1;
            function2 = (Function1) quickpayTripAmountUIStateFactory$enterAmountTextField$1.L$0;
            ResultKt.b(obj);
            str2 = str3;
        }
        TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, new sn0(function2, 27), null);
        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
        UIKeyboardOption uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Decimal, null, 5);
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        ChaloColorToken.TextFieldIndicator textFieldIndicator = ChaloColorToken.TextFieldIndicator.f9859a;
        return new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B, uITextStyle, textLabel, textLabel, null, false, uIKeyboardOption, 0, null, new UITextFieldColors(black_87, black_87, null, null, null, null, textFieldIndicator, textFieldIndicator, null, null, ChaloColorToken.OrangePrimary.f9835a, null, 4174844), 0.0f, 97164);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r1 == r3) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState r17, long r18, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory$errorText$1
            if (r2 == 0) goto L17
            r2 = r1
            app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory$errorText$1 r2 = (app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory$errorText$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory$errorText$1 r2 = new app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory$errorText$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            kotlin.ResultKt.b(r1)
            goto L8c
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.ResultKt.b(r1)
            goto L6f
        L3a:
            kotlin.ResultKt.b(r1)
            int[] r1 = app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory.WhenMappings.f8903a
            int r4 = r17.ordinal()
            r1 = r1[r4]
            if (r1 == r6) goto La4
            if (r1 == r5) goto La4
            r4 = 3
            if (r1 == r4) goto La4
            r4 = 4
            if (r1 == r4) goto L59
            r4 = 5
            if (r1 != r4) goto L53
            goto L59
        L53:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L59:
            app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState r1 = app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState.INCORRECT_AMOUNT
            r4 = 0
            app.chalo.providers.stringprovider.StringProvider r7 = r0.f8902a
            r8 = r17
            if (r8 != r1) goto L73
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.TEXT_INCORRECT_AMOUNT
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2.label = r6
            java.lang.Object r1 = r7.b(r1, r4, r2)
            if (r1 != r3) goto L6f
            goto L8b
        L6f:
            java.lang.String r1 = (java.lang.String) r1
        L71:
            r3 = r1
            goto L8f
        L73:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.TEXT_AMOUNT_EXCEEDS_MAX_QUICK_PAY_AMOUNT
            app.chalo.features.wallet.CurrencyFeature r8 = r0.b
            app.chalo.constants.CurrencyRoundOffLogic r9 = app.chalo.constants.CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING
            r10 = r18
            java.lang.String r8 = r8.a(r10, r9)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r8
            r2.label = r5
            java.lang.Object r1 = r7.b(r1, r6, r2)
            if (r1 != r3) goto L8c
        L8b:
            return r3
        L8c:
            java.lang.String r1 = (java.lang.String) r1
            goto L71
        L8f:
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r2 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            app.chalo.uistate.text.UITextStyle r4 = app.chalo.uistate.text.UITextStyle.BodyMedium
            r14 = 0
            r15 = 8184(0x1ff8, float:1.1468E-41)
            app.chalo.uistate.base.ChaloColorToken$ErrorColor r5 = app.chalo.uistate.base.ChaloColorToken.ErrorColor.f9794a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        La4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory.d(app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x013e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0164  */
    /* JADX WARN: Code duplicated, block: B:37:0x0188  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(Function1 function1, ContinuationImpl continuationImpl) {
        QuickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1 quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1;
        IconType iconType;
        Function1 function2;
        BottomSheetUIStateFactory bottomSheetUIStateFactory;
        String title;
        IconType iconType2;
        BottomSheetUIStateFactory bottomSheetUIStateFactory2;
        String str;
        UITextAlign uITextAlign;
        Object objB;
        String str2;
        Function1 function3;
        BottomSheetUIStateFactory bottomSheetUIStateFactory3;
        UITextAlign titleAlignment;
        UITextAlign messageAlignment;
        IconType iconType3;
        String str3;
        lx0 lx0Var;
        DrawType.Icon icon;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIState buttonUIStateG;
        if (continuationImpl instanceof QuickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1) {
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1 = (QuickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1) continuationImpl;
            int i = quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.label = i - Integer.MIN_VALUE;
            } else {
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1 = new QuickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1(this, continuationImpl);
            }
        } else {
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1 = new QuickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1(this, continuationImpl);
        }
        Object objB2 = quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.label;
        StringProvider stringProvider = this.f8902a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            iconType = IconType.NO_INTERNET_ERROR;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$0 = function1;
            BottomSheetUIStateFactory bottomSheetUIStateFactory4 = BottomSheetUIStateFactory.f9905a;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$1 = bottomSheetUIStateFactory4;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$2 = iconType;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.label = 1;
            objB2 = stringProvider.b(StringEnum.QUICKPAY_INTERNET_HEADER, new Object[0], quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1);
            if (objB2 != coroutineSingletons) {
                function2 = function1;
                bottomSheetUIStateFactory = bottomSheetUIStateFactory4;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            iconType = (IconType) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$2;
            bottomSheetUIStateFactory = (BottomSheetUIStateFactory) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$1;
            function2 = (Function1) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$0;
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                String str4 = (String) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$3;
                IconType iconType4 = (IconType) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$2;
                BottomSheetUIStateFactory bottomSheetUIStateFactory5 = (BottomSheetUIStateFactory) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$1;
                function2 = (Function1) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$0;
                ResultKt.b(objB2);
                title = str4;
                bottomSheetUIStateFactory2 = bottomSheetUIStateFactory5;
                iconType2 = iconType4;
                str = (String) objB2;
                uITextAlign = UITextAlign.Center;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$0 = function2;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$1 = bottomSheetUIStateFactory2;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$2 = iconType2;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$3 = title;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$4 = str;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$5 = uITextAlign;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$6 = uITextAlign;
                quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.label = 3;
                objB = stringProvider.b(StringEnum.RETRY, new Object[0], quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1);
                if (objB != coroutineSingletons) {
                    Function1 function4 = function2;
                    str2 = str;
                    objB2 = objB;
                    function3 = function4;
                    bottomSheetUIStateFactory3 = bottomSheetUIStateFactory2;
                    titleAlignment = uITextAlign;
                    messageAlignment = titleAlignment;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UITextAlign uITextAlign2 = (UITextAlign) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$6;
            titleAlignment = (UITextAlign) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$5;
            String str5 = (String) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$4;
            title = (String) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$3;
            iconType2 = (IconType) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$2;
            bottomSheetUIStateFactory3 = (BottomSheetUIStateFactory) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$1;
            function3 = (Function1) quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$0;
            ResultKt.b(objB2);
            messageAlignment = uITextAlign2;
            str2 = str5;
        }
        iconType3 = iconType2;
        str3 = (String) objB2;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs = new BottomSheetContentUiSpecs(new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h), UiAlignment.Horizontal.Center.f9884a, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
        lx0Var = new lx0(function3, 17);
        bottomSheetUIStateFactory3.getClass();
        Intrinsics.i(title, "title");
        Intrinsics.i(titleAlignment, "titleAlignment");
        Intrinsics.i(messageAlignment, "messageAlignment");
        if (iconType3 != null) {
            icon = new DrawType.Icon(new ImageUIState(iconType3, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().b0), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
        } else {
            icon = null;
        }
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(title, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, titleAlignment, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
        if (str2 != null) {
            chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, messageAlignment, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
        } else {
            chaloTextUIState = null;
        }
        if (str3 != null) {
            buttonUIStateG = ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, str3, lx0Var, null, null, false, 0.0f, 60);
        } else {
            buttonUIStateG = null;
        }
        return new QuickpayBottomSheetUIState.PrerequisitesBottomSheetUIState(new BottomSheetUiState(new BottomSheetUiSpec(new UIShape.Rectangle(Dp.m7278constructorimpl(ChaloThemeHelper.a().e + ChaloThemeHelper.a().d), Dp.m7278constructorimpl(ChaloThemeHelper.a().e + ChaloThemeHelper.a().d), 0.0f, 0.0f, 12), 14), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new lx0(function3, 18)), 63)), new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs, icon, chaloTextUIState2, chaloTextUIState, buttonUIStateG, null, null, TsExtractor.TS_STREAM_TYPE_AC3));
        String str6 = (String) objB2;
        quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$0 = function2;
        quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$1 = bottomSheetUIStateFactory;
        quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$2 = iconType;
        quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$3 = str6;
        quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.QUICKPAY_INTERNET_MESSAGE, new Object[0], quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1);
        if (objB3 != coroutineSingletons) {
            title = str6;
            objB2 = objB3;
            BottomSheetUIStateFactory bottomSheetUIStateFactory6 = bottomSheetUIStateFactory;
            iconType2 = iconType;
            bottomSheetUIStateFactory2 = bottomSheetUIStateFactory6;
            str = (String) objB2;
            uITextAlign = UITextAlign.Center;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$0 = function2;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$1 = bottomSheetUIStateFactory2;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$2 = iconType2;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$3 = title;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$4 = str;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$5 = uITextAlign;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.L$6 = uITextAlign;
            quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1.label = 3;
            objB = stringProvider.b(StringEnum.RETRY, new Object[0], quickpayTripAmountUIStateFactory$prerequisitesBottomSheet$1);
            if (objB != coroutineSingletons) {
                Function1 function5 = function2;
                str2 = str;
                objB2 = objB;
                function3 = function5;
                bottomSheetUIStateFactory3 = bottomSheetUIStateFactory2;
                titleAlignment = uITextAlign;
                messageAlignment = titleAlignment;
                iconType3 = iconType2;
                str3 = (String) objB2;
                BottomSheetContentUiSpecs bottomSheetContentUiSpecs2 = new BottomSheetContentUiSpecs(new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h), UiAlignment.Horizontal.Center.f9884a, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                lx0Var = new lx0(function3, 17);
                bottomSheetUIStateFactory3.getClass();
                Intrinsics.i(title, "title");
                Intrinsics.i(titleAlignment, "titleAlignment");
                Intrinsics.i(messageAlignment, "messageAlignment");
                if (iconType3 != null) {
                    icon = new DrawType.Icon(new ImageUIState(iconType3, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().b0), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
                } else {
                    icon = null;
                }
                TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(title, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, titleAlignment, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
                if (str2 != null) {
                    chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, messageAlignment, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
                } else {
                    chaloTextUIState = null;
                }
                if (str3 != null) {
                    buttonUIStateG = ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, str3, lx0Var, null, null, false, 0.0f, 60);
                } else {
                    buttonUIStateG = null;
                }
                return new QuickpayBottomSheetUIState.PrerequisitesBottomSheetUIState(new BottomSheetUiState(new BottomSheetUiSpec(new UIShape.Rectangle(Dp.m7278constructorimpl(ChaloThemeHelper.a().e + ChaloThemeHelper.a().d), Dp.m7278constructorimpl(ChaloThemeHelper.a().e + ChaloThemeHelper.a().d), 0.0f, 0.0f, 12), 14), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(new lx0(function3, 18)), 63)), new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs2, icon, chaloTextUIState3, chaloTextUIState, buttonUIStateG, null, null, TsExtractor.TS_STREAM_TYPE_AC3));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:34:0x0228  */
    /* JADX WARN: Code duplicated, block: B:35:0x022c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0237  */
    /* JADX WARN: Code duplicated, block: B:39:0x023b  */
    /* JADX WARN: Code duplicated, block: B:40:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0266  */
    /* JADX WARN: Code duplicated, block: B:53:0x0283  */
    /* JADX WARN: Code duplicated, block: B:61:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0312 A[PHI: r1 r2 r5 r6 r7 r10 r12 r13 r14 r15 r16
      0x0312: PHI (r1v27 'prefix' java.lang.String) = (r1v24 'prefix' java.lang.String), (r1v33 'prefix' java.lang.String) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r2v32 java.lang.Object) = (r2v31 java.lang.Object), (r2v1 java.lang.Object) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r5v28 app.chalo.uistate.text.TextUIStateFactory) = (r5v24 app.chalo.uistate.text.TextUIStateFactory), (r5v35 app.chalo.uistate.text.TextUIStateFactory) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r6v28 'tncUrl' java.lang.String) = (r6v24 'tncUrl' java.lang.String), (r6v31 'tncUrl' java.lang.String) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r7v23 app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType$QuickPayConfirmationBottomSheet) = 
      (r7v19 app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType$QuickPayConfirmationBottomSheet)
      (r7v26 app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType$QuickPayConfirmationBottomSheet)
     binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r10v24 kotlin.jvm.functions.Function1) = (r10v20 kotlin.jvm.functions.Function1), (r10v26 kotlin.jvm.functions.Function1) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r12v22 app.chalo.uistate.text.TextUIState) = (r12v18 app.chalo.uistate.text.TextUIState), (r12v24 app.chalo.uistate.text.TextUIState) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r13v13 app.chalo.uistate.text.TextUIState) = (r13v9 app.chalo.uistate.text.TextUIState), (r13v16 app.chalo.uistate.text.TextUIState) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r14v11 app.chalo.uistate.text.TextUIState) = (r14v7 app.chalo.uistate.text.TextUIState), (r14v14 app.chalo.uistate.text.TextUIState) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r15v7 app.chalo.uistate.text.TextUIState) = (r15v3 app.chalo.uistate.text.TextUIState), (r15v9 app.chalo.uistate.text.TextUIState) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0312: PHI (r16v6 char) = (r8v0 char), (r16v7 char) binds: [B:63:0x030e, B:14:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0356  */
    /* JADX WARN: Code duplicated, block: B:69:0x035b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0360  */
    /* JADX WARN: Code duplicated, block: B:72:0x0368  */
    /* JADX WARN: Code duplicated, block: B:76:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0418  */
    /* JADX WARN: Code duplicated, block: B:89:0x042c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0431  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x025d, code lost:
    
        if (r2 == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027c, code lost:
    
        if (r2 == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0299, code lost:
    
        if (r2 == r4) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet r33, java.lang.String r34, kotlin.jvm.functions.Function1 r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory.f(app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType$QuickPayConfirmationBottomSheet, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
