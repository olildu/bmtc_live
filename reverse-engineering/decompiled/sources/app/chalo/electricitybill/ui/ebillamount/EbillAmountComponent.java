package app.chalo.electricitybill.ui.ebillamount;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.domain.EBillAmountUseCase;
import app.chalo.electricitybill.exception.EBillAmountException;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TextValueUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.EBillAmountScreenArgs;
import app.chalo.scenes.args.EBillPaymentConfirmationArgs;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
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
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import defpackage.hq0;
import defpackage.qp;
import defpackage.wn;
import defpackage.xx;
import defpackage.yg;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EbillAmountComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountDataState;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountViewState;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EbillAmountComponent extends ChaloBaseStateMviComponent<EBillAmountIntent, EBillAmountDataState, EBillAmountViewState, EBillAmountSideEffect> {
    public final ComponentContext k;
    public final CurrencyFeature l;
    public final EBillAmountUseCase m;
    public final AnalyticsContract n;
    public final ChaloNavigationManager o;
    public final StringProvider p;
    public final TimeUtilsContract q;
    public final KotlinToastManager r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EbillAmountComponent(EBillAmountScreenArgs args, ComponentContext componentContext, CurrencyFeature currencyFeature, EBillAmountUseCase eBillAmountUseCase, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = componentContext;
        this.l = currencyFeature;
        this.m = eBillAmountUseCase;
        this.n = analyticsContract;
        this.o = chaloNavigationManager;
        this.p = stringProvider;
        this.q = timeUtilsContract;
        this.r = kotlinToastManager;
        G0(new EBillAmountIntent.StartingIntent(args.b));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x0239  */
    /* JADX WARN: Code duplicated, block: B:36:0x0264  */
    /* JADX WARN: Code duplicated, block: B:40:0x026e  */
    /* JADX WARN: Code duplicated, block: B:44:0x028b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0304  */
    /* JADX WARN: Code duplicated, block: B:48:0x0326  */
    /* JADX WARN: Code duplicated, block: B:52:0x0349  */
    /* JADX WARN: Code duplicated, block: B:55:0x039c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0403  */
    /* JADX WARN: Code duplicated, block: B:61:0x0433  */
    /* JADX WARN: Code duplicated, block: B:64:0x043e  */
    /* JADX WARN: Code duplicated, block: B:67:0x047e  */
    /* JADX WARN: Code duplicated, block: B:71:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x0548  */
    /* JADX WARN: Code duplicated, block: B:77:0x0598  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(EBillAmountDataState eBillAmountDataState, ContinuationImpl continuationImpl) {
        EbillAmountComponent$convertToUiState$1 ebillAmountComponent$convertToUiState$1;
        Object obj;
        EBillAmountDataState eBillAmountDataState2;
        ToolbarUIState toolbarUIState;
        int i;
        char c;
        Object objB;
        EBillAmountDataState eBillAmountDataState3;
        Object obj2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        StringProvider stringProvider;
        int i2;
        Object objB2;
        Object obj3;
        EBillAmountDataState eBillAmountDataState4;
        ToolbarUIState toolbarUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ChaloColorToken.Black_70 black_70;
        String str;
        String strD;
        Object objB3;
        EBillAmountDataState eBillAmountDataState5;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        UITextStyle uITextStyle;
        ChaloColorToken.Black_70 black_71;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        String str3;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ButtonUIStateFactory buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        Object objB4;
        EBillAmountDataState eBillAmountDataState6;
        ToolbarUIState toolbarUIState3;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2;
        ButtonUIStateFactory buttonUIStateFactory2;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        EnterAmountCardUIState enterAmountCardUIState;
        ElectricityBillAppModel electricityBillAppModel;
        ChaloColorToken.Black_70 black_72;
        EnterAmountCardUIState enterAmountCardUIState2;
        EBillAmountDataState eBillAmountDataState7;
        CustomerInfoUIState customerInfoUIState;
        ChaloPadding chaloPadding;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        EBillAmountDataState eBillAmountDataState8;
        Object objB5;
        EBillAmountDataState eBillAmountDataState9;
        ChaloPadding chaloPadding2;
        EnterAmountCardUIState enterAmountCardUIState3;
        Object obj4;
        ToolbarUIState toolbarUIState4;
        ElectricityBillAppModel electricityBillAppModel2;
        CustomerInfoUIState customerInfoUIState2;
        TransactionInfoUIState transactionInfoUIState;
        float f;
        ChaloPadding chaloPadding3;
        TextValueUIState[] textValueUIStateArr;
        Object objB6;
        EBillAmountDataState eBillAmountDataState10;
        Object obj5;
        ToolbarUIState toolbarUIState5;
        EnterAmountCardUIState enterAmountCardUIState4;
        TextValueUIState[] textValueUIStateArr2;
        ChaloPadding chaloPadding4;
        int i3;
        Object objB7;
        TextValueUIState[] textValueUIStateArr3;
        TextValueUIState[] textValueUIStateArr4;
        EnterAmountCardUIState enterAmountCardUIState5;
        int i4;
        TextValueUIState[] textValueUIStateArr5;
        Object objB8;
        TextValueUIState[] textValueUIStateArr6;
        TextValueUIState[] textValueUIStateArr7;
        float f2;
        EBillAmountDataState eBillAmountDataState11;
        EnterAmountCardUIState enterAmountCardUIState6;
        ToolbarUIState toolbarUIState6;
        ChaloPadding chaloPadding5;
        int i5;
        if (continuationImpl instanceof EbillAmountComponent$convertToUiState$1) {
            ebillAmountComponent$convertToUiState$1 = (EbillAmountComponent$convertToUiState$1) continuationImpl;
            int i6 = ebillAmountComponent$convertToUiState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ebillAmountComponent$convertToUiState$1.label = i6 - Integer.MIN_VALUE;
            } else {
                ebillAmountComponent$convertToUiState$1 = new EbillAmountComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            ebillAmountComponent$convertToUiState$1 = new EbillAmountComponent$convertToUiState$1(this, continuationImpl);
        }
        Object obj6 = ebillAmountComponent$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = ebillAmountComponent$convertToUiState$1.label;
        CurrencyFeature currencyFeature = this.l;
        TimeUtilsContract timeUtilsContract = this.q;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        ChaloColorToken.Black_70 black_73 = ChaloColorToken.Black_70.f9767a;
        StringProvider stringProvider2 = this.p;
        switch (i7) {
            case 0:
                ResultKt.b(obj6);
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState;
                ebillAmountComponent$convertToUiState$1.label = 1;
                Object objB9 = stringProvider2.b(StringEnum.BEST_ELECTRICITY_PAYMENT, new Object[0], ebillAmountComponent$convertToUiState$1);
                if (objB9 != coroutineSingletons) {
                    obj = objB9;
                    eBillAmountDataState2 = eBillAmountDataState;
                    toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, null, null, 253);
                    i = 0;
                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState2;
                    ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState;
                    c = 2;
                    ebillAmountComponent$convertToUiState$1.label = 2;
                    objB = stringProvider2.b(StringEnum.ENTER_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                    if (objB != coroutineSingletons) {
                        eBillAmountDataState3 = eBillAmountDataState2;
                        obj2 = objB;
                        stringProvider = stringProvider2;
                        i2 = i;
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState3;
                        ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState;
                        ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState;
                        ebillAmountComponent$convertToUiState$1.label = 3;
                        objB2 = stringProvider.b(StringEnum.EBILL_AMOUNT_SUBTITLE, new Object[i2], ebillAmountComponent$convertToUiState$1);
                        if (objB2 != coroutineSingletons) {
                            obj3 = objB2;
                            eBillAmountDataState4 = eBillAmountDataState3;
                            toolbarUIState2 = toolbarUIState;
                            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.BodyMedium, black_73, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            black_70 = black_73;
                            str = eBillAmountDataState4.c;
                            if (str != null || str.length() == 0) {
                                strD = currencyFeature.d();
                            } else {
                                strD = eBillAmountDataState4.c;
                            }
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState4;
                            ebillAmountComponent$convertToUiState$1.L$1 = strD;
                            ebillAmountComponent$convertToUiState$1.L$2 = toolbarUIState2;
                            ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState;
                            ebillAmountComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                            ebillAmountComponent$convertToUiState$1.label = 4;
                            objB3 = stringProvider.b(StringEnum.HINT_AMOUNT, new Object[i2], ebillAmountComponent$convertToUiState$1);
                            if (objB3 != coroutineSingletons) {
                                eBillAmountDataState5 = eBillAmountDataState4;
                                str2 = strD;
                                chaloTextUIState3 = chaloTextUIState;
                                chaloTextUIState4 = chaloTextUIState2;
                                uITextStyle = UITextStyle.BodyMedium;
                                TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB3, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                                black_71 = black_70;
                                TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, new qp(this, 23), null);
                                UIKeyboardOption uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                                ChaloColorToken.TextFieldIndicator textFieldIndicator = ChaloColorToken.TextFieldIndicator.f9859a;
                                textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B, null, textLabel, null, null, false, uIKeyboardOption, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator, textFieldIndicator, textFieldIndicator, textFieldIndicator, null, null, 4178943), 0.0f, 97244);
                                str3 = eBillAmountDataState5.d;
                                if (str3 != null) {
                                    chaloTextUIState5 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                } else {
                                    chaloTextUIState5 = null;
                                }
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState5;
                                ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState2;
                                ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState4;
                                ebillAmountComponent$convertToUiState$1.L$4 = textFieldUIState;
                                ebillAmountComponent$convertToUiState$1.L$5 = chaloTextUIState5;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                ebillAmountComponent$convertToUiState$1.L$6 = buttonUIStateFactory;
                                chaloTextUIState6 = chaloTextUIState5;
                                ebillAmountComponent$convertToUiState$1.label = 5;
                                objB4 = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], ebillAmountComponent$convertToUiState$1);
                                if (objB4 != coroutineSingletons) {
                                    eBillAmountDataState6 = eBillAmountDataState5;
                                    toolbarUIState3 = toolbarUIState2;
                                    textFieldUIState2 = textFieldUIState;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    enterAmountCardUIState = new EnterAmountCardUIState(chaloTextUIState3, chaloTextUIState4, textFieldUIState2, chaloTextUIState7, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new xx(this, 7), null, eBillAmountDataState6.f2548a, 0.0f, 44));
                                    electricityBillAppModel = eBillAmountDataState6.b;
                                    if (electricityBillAppModel != null) {
                                        black_72 = black_71;
                                        enterAmountCardUIState2 = enterAmountCardUIState;
                                        eBillAmountDataState7 = eBillAmountDataState6;
                                        customerInfoUIState = null;
                                        toolbarUIState4 = toolbarUIState3;
                                        electricityBillAppModel2 = eBillAmountDataState7.b;
                                        if (electricityBillAppModel2 != null) {
                                            f = ChaloThemeHelper.a().d;
                                            float f3 = ChaloThemeHelper.a().g;
                                            float f4 = ChaloThemeHelper.a().h;
                                            chaloPadding3 = new ChaloPadding(f3, f4, f4, f3);
                                            textValueUIStateArr = new TextValueUIState[3];
                                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                            ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                                            ebillAmountComponent$convertToUiState$1.label = 7;
                                            objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                            if (objB6 != coroutineSingletons) {
                                                EnterAmountCardUIState enterAmountCardUIState7 = enterAmountCardUIState2;
                                                eBillAmountDataState10 = eBillAmountDataState7;
                                                obj5 = objB6;
                                                toolbarUIState5 = toolbarUIState4;
                                                enterAmountCardUIState4 = enterAmountCardUIState7;
                                                textValueUIStateArr2 = textValueUIStateArr;
                                                chaloPadding4 = chaloPadding3;
                                                i3 = 0;
                                                UITextStyle uITextStyle2 = UITextStyle.BodyMedium;
                                                textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle2, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle2, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                                ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                                ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                                ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                                ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                                ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                                ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                                ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                                ebillAmountComponent$convertToUiState$1.label = 8;
                                                objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                                if (objB7 != coroutineSingletons) {
                                                    textValueUIStateArr3 = textValueUIStateArr;
                                                    textValueUIStateArr4 = textValueUIStateArr3;
                                                    enterAmountCardUIState5 = enterAmountCardUIState4;
                                                    i4 = 1;
                                                    String str4 = (String) objB7;
                                                    UITextStyle uITextStyle3 = UITextStyle.BodyMedium;
                                                    textValueUIStateArr5 = textValueUIStateArr3;
                                                    textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str4, uITextStyle3, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle3, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                                    ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                                    ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                                    ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                                    ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                                    ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                                    ebillAmountComponent$convertToUiState$1.L$7 = null;
                                                    ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                                    ebillAmountComponent$convertToUiState$1.label = 9;
                                                    objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                                    if (objB8 != coroutineSingletons) {
                                                        textValueUIStateArr6 = textValueUIStateArr5;
                                                        textValueUIStateArr7 = textValueUIStateArr6;
                                                        f2 = f;
                                                        eBillAmountDataState11 = eBillAmountDataState10;
                                                        enterAmountCardUIState6 = enterAmountCardUIState5;
                                                        customerInfoUIState2 = customerInfoUIState;
                                                        toolbarUIState6 = toolbarUIState5;
                                                        chaloPadding5 = chaloPadding4;
                                                        obj6 = objB8;
                                                        i5 = 2;
                                                        UITextStyle uITextStyle4 = UITextStyle.HeadlineMedium;
                                                        ChaloColorToken.Black_87 black_88 = black_87;
                                                        textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle4, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle4, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                        transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                                        enterAmountCardUIState2 = enterAmountCardUIState6;
                                                        toolbarUIState4 = toolbarUIState6;
                                                    }
                                                }
                                            }
                                        } else {
                                            customerInfoUIState2 = customerInfoUIState;
                                            transactionInfoUIState = null;
                                        }
                                        return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                                    }
                                    float f5 = ChaloThemeHelper.a().g;
                                    float f6 = ChaloThemeHelper.a().h;
                                    chaloPadding = new ChaloPadding(f5, f6, f6, f5);
                                    eBillAmountDataState8 = eBillAmountDataState6;
                                    chaloTextUIState8 = new TextUIState.ChaloTextUIState(electricityBillAppModel.d, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                    StringEnum stringEnum = StringEnum.EBILL_CONSUMER_NUMBER;
                                    Object[] objArr = {electricityBillAppModel.c};
                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState8;
                                    ebillAmountComponent$convertToUiState$1.L$1 = chaloTextUIState8;
                                    ebillAmountComponent$convertToUiState$1.L$2 = chaloPadding;
                                    ebillAmountComponent$convertToUiState$1.L$3 = toolbarUIState3;
                                    ebillAmountComponent$convertToUiState$1.L$4 = enterAmountCardUIState;
                                    ebillAmountComponent$convertToUiState$1.L$5 = null;
                                    ebillAmountComponent$convertToUiState$1.L$6 = null;
                                    ebillAmountComponent$convertToUiState$1.F$0 = 0.0f;
                                    ebillAmountComponent$convertToUiState$1.label = 6;
                                    objB5 = stringProvider.b(stringEnum, objArr, ebillAmountComponent$convertToUiState$1);
                                    if (objB5 != coroutineSingletons) {
                                        eBillAmountDataState9 = eBillAmountDataState8;
                                        chaloPadding2 = chaloPadding;
                                        enterAmountCardUIState3 = enterAmountCardUIState;
                                        obj4 = objB5;
                                        black_72 = black_71;
                                        EBillAmountDataState eBillAmountDataState12 = eBillAmountDataState9;
                                        customerInfoUIState = new CustomerInfoUIState(chaloPadding2, chaloTextUIState8, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.BodyMedium, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
                                        eBillAmountDataState7 = eBillAmountDataState12;
                                        enterAmountCardUIState2 = enterAmountCardUIState3;
                                        toolbarUIState4 = toolbarUIState3;
                                        electricityBillAppModel2 = eBillAmountDataState7.b;
                                        if (electricityBillAppModel2 != null) {
                                            f = ChaloThemeHelper.a().d;
                                            float f7 = ChaloThemeHelper.a().g;
                                            float f8 = ChaloThemeHelper.a().h;
                                            chaloPadding3 = new ChaloPadding(f7, f8, f8, f7);
                                            textValueUIStateArr = new TextValueUIState[3];
                                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                            ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                                            ebillAmountComponent$convertToUiState$1.label = 7;
                                            objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                            if (objB6 != coroutineSingletons) {
                                                EnterAmountCardUIState enterAmountCardUIState8 = enterAmountCardUIState2;
                                                eBillAmountDataState10 = eBillAmountDataState7;
                                                obj5 = objB6;
                                                toolbarUIState5 = toolbarUIState4;
                                                enterAmountCardUIState4 = enterAmountCardUIState8;
                                                textValueUIStateArr2 = textValueUIStateArr;
                                                chaloPadding4 = chaloPadding3;
                                                i3 = 0;
                                                UITextStyle uITextStyle5 = UITextStyle.BodyMedium;
                                                textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle5, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle5, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                                ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                                ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                                ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                                ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                                ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                                ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                                ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                                ebillAmountComponent$convertToUiState$1.label = 8;
                                                objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                                if (objB7 != coroutineSingletons) {
                                                    textValueUIStateArr3 = textValueUIStateArr;
                                                    textValueUIStateArr4 = textValueUIStateArr3;
                                                    enterAmountCardUIState5 = enterAmountCardUIState4;
                                                    i4 = 1;
                                                    String str5 = (String) objB7;
                                                    UITextStyle uITextStyle6 = UITextStyle.BodyMedium;
                                                    textValueUIStateArr5 = textValueUIStateArr3;
                                                    textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str5, uITextStyle6, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle6, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                                    ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                                    ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                                    ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                                    ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                                    ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                                    ebillAmountComponent$convertToUiState$1.L$7 = null;
                                                    ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                                    ebillAmountComponent$convertToUiState$1.label = 9;
                                                    objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                                    if (objB8 != coroutineSingletons) {
                                                        textValueUIStateArr6 = textValueUIStateArr5;
                                                        textValueUIStateArr7 = textValueUIStateArr6;
                                                        f2 = f;
                                                        eBillAmountDataState11 = eBillAmountDataState10;
                                                        enterAmountCardUIState6 = enterAmountCardUIState5;
                                                        customerInfoUIState2 = customerInfoUIState;
                                                        toolbarUIState6 = toolbarUIState5;
                                                        chaloPadding5 = chaloPadding4;
                                                        obj6 = objB8;
                                                        i5 = 2;
                                                        UITextStyle uITextStyle7 = UITextStyle.HeadlineMedium;
                                                        ChaloColorToken.Black_87 black_89 = black_87;
                                                        textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle7, black_89, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle7, black_89, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                        transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                                        enterAmountCardUIState2 = enterAmountCardUIState6;
                                                        toolbarUIState4 = toolbarUIState6;
                                                    }
                                                }
                                            }
                                        } else {
                                            customerInfoUIState2 = customerInfoUIState;
                                            transactionInfoUIState = null;
                                        }
                                        return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                obj = obj6;
                eBillAmountDataState2 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, null, null, 253);
                i = 0;
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState2;
                ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState;
                c = 2;
                ebillAmountComponent$convertToUiState$1.label = 2;
                objB = stringProvider2.b(StringEnum.ENTER_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                if (objB != coroutineSingletons) {
                    eBillAmountDataState3 = eBillAmountDataState2;
                    obj2 = objB;
                    stringProvider = stringProvider2;
                    i2 = i;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState3;
                    ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState;
                    ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState;
                    ebillAmountComponent$convertToUiState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.EBILL_AMOUNT_SUBTITLE, new Object[i2], ebillAmountComponent$convertToUiState$1);
                    if (objB2 != coroutineSingletons) {
                        obj3 = objB2;
                        eBillAmountDataState4 = eBillAmountDataState3;
                        toolbarUIState2 = toolbarUIState;
                        chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.BodyMedium, black_73, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        black_70 = black_73;
                        str = eBillAmountDataState4.c;
                        if (str != null) {
                            strD = currencyFeature.d();
                        } else {
                            strD = currencyFeature.d();
                        }
                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState4;
                        ebillAmountComponent$convertToUiState$1.L$1 = strD;
                        ebillAmountComponent$convertToUiState$1.L$2 = toolbarUIState2;
                        ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState;
                        ebillAmountComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                        ebillAmountComponent$convertToUiState$1.label = 4;
                        objB3 = stringProvider.b(StringEnum.HINT_AMOUNT, new Object[i2], ebillAmountComponent$convertToUiState$1);
                        if (objB3 != coroutineSingletons) {
                            eBillAmountDataState5 = eBillAmountDataState4;
                            str2 = strD;
                            chaloTextUIState3 = chaloTextUIState;
                            chaloTextUIState4 = chaloTextUIState2;
                            uITextStyle = UITextStyle.BodyMedium;
                            TextFieldLabelPlaceholderUIState.TextLabel textLabel2 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB3, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                            black_71 = black_70;
                            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B2 = TextFieldEventHandlerHelper.b(2, new qp(this, 23), null);
                            UIKeyboardOption uIKeyboardOption2 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                            ChaloColorToken.TextFieldIndicator textFieldIndicator2 = ChaloColorToken.TextFieldIndicator.f9859a;
                            textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B2, null, textLabel2, null, null, false, uIKeyboardOption2, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator2, textFieldIndicator2, textFieldIndicator2, textFieldIndicator2, null, null, 4178943), 0.0f, 97244);
                            str3 = eBillAmountDataState5.d;
                            if (str3 != null) {
                                chaloTextUIState5 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            } else {
                                chaloTextUIState5 = null;
                            }
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState5;
                            ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState2;
                            ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                            ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState4;
                            ebillAmountComponent$convertToUiState$1.L$4 = textFieldUIState;
                            ebillAmountComponent$convertToUiState$1.L$5 = chaloTextUIState5;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            ebillAmountComponent$convertToUiState$1.L$6 = buttonUIStateFactory;
                            chaloTextUIState6 = chaloTextUIState5;
                            ebillAmountComponent$convertToUiState$1.label = 5;
                            objB4 = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], ebillAmountComponent$convertToUiState$1);
                            if (objB4 != coroutineSingletons) {
                                eBillAmountDataState6 = eBillAmountDataState5;
                                toolbarUIState3 = toolbarUIState2;
                                textFieldUIState2 = textFieldUIState;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                chaloTextUIState7 = chaloTextUIState6;
                                enterAmountCardUIState = new EnterAmountCardUIState(chaloTextUIState3, chaloTextUIState4, textFieldUIState2, chaloTextUIState7, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new xx(this, 7), null, eBillAmountDataState6.f2548a, 0.0f, 44));
                                electricityBillAppModel = eBillAmountDataState6.b;
                                if (electricityBillAppModel != null) {
                                    black_72 = black_71;
                                    enterAmountCardUIState2 = enterAmountCardUIState;
                                    eBillAmountDataState7 = eBillAmountDataState6;
                                    customerInfoUIState = null;
                                    toolbarUIState4 = toolbarUIState3;
                                    electricityBillAppModel2 = eBillAmountDataState7.b;
                                    if (electricityBillAppModel2 != null) {
                                        f = ChaloThemeHelper.a().d;
                                        float f9 = ChaloThemeHelper.a().g;
                                        float f10 = ChaloThemeHelper.a().h;
                                        chaloPadding3 = new ChaloPadding(f9, f10, f10, f9);
                                        textValueUIStateArr = new TextValueUIState[3];
                                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                        ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                        ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                        ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                        ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                        ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                                        ebillAmountComponent$convertToUiState$1.label = 7;
                                        objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                        if (objB6 != coroutineSingletons) {
                                            EnterAmountCardUIState enterAmountCardUIState9 = enterAmountCardUIState2;
                                            eBillAmountDataState10 = eBillAmountDataState7;
                                            obj5 = objB6;
                                            toolbarUIState5 = toolbarUIState4;
                                            enterAmountCardUIState4 = enterAmountCardUIState9;
                                            textValueUIStateArr2 = textValueUIStateArr;
                                            chaloPadding4 = chaloPadding3;
                                            i3 = 0;
                                            UITextStyle uITextStyle8 = UITextStyle.BodyMedium;
                                            textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle8, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle8, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                            ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                                            ebillAmountComponent$convertToUiState$1.label = 8;
                                            objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                            if (objB7 != coroutineSingletons) {
                                                textValueUIStateArr3 = textValueUIStateArr;
                                                textValueUIStateArr4 = textValueUIStateArr3;
                                                enterAmountCardUIState5 = enterAmountCardUIState4;
                                                i4 = 1;
                                                String str6 = (String) objB7;
                                                UITextStyle uITextStyle9 = UITextStyle.BodyMedium;
                                                textValueUIStateArr5 = textValueUIStateArr3;
                                                textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str6, uITextStyle9, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle9, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                                ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                                ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                                ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                                ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                                ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                                ebillAmountComponent$convertToUiState$1.L$7 = null;
                                                ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                                ebillAmountComponent$convertToUiState$1.label = 9;
                                                objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                                if (objB8 != coroutineSingletons) {
                                                    textValueUIStateArr6 = textValueUIStateArr5;
                                                    textValueUIStateArr7 = textValueUIStateArr6;
                                                    f2 = f;
                                                    eBillAmountDataState11 = eBillAmountDataState10;
                                                    enterAmountCardUIState6 = enterAmountCardUIState5;
                                                    customerInfoUIState2 = customerInfoUIState;
                                                    toolbarUIState6 = toolbarUIState5;
                                                    chaloPadding5 = chaloPadding4;
                                                    obj6 = objB8;
                                                    i5 = 2;
                                                    UITextStyle uITextStyle10 = UITextStyle.HeadlineMedium;
                                                    ChaloColorToken.Black_87 black_810 = black_87;
                                                    textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle10, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle10, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                    transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                                    enterAmountCardUIState2 = enterAmountCardUIState6;
                                                    toolbarUIState4 = toolbarUIState6;
                                                }
                                            }
                                        }
                                    } else {
                                        customerInfoUIState2 = customerInfoUIState;
                                        transactionInfoUIState = null;
                                    }
                                    return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                                }
                                float f11 = ChaloThemeHelper.a().g;
                                float f12 = ChaloThemeHelper.a().h;
                                chaloPadding = new ChaloPadding(f11, f12, f12, f11);
                                eBillAmountDataState8 = eBillAmountDataState6;
                                chaloTextUIState8 = new TextUIState.ChaloTextUIState(electricityBillAppModel.d, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                StringEnum stringEnum2 = StringEnum.EBILL_CONSUMER_NUMBER;
                                Object[] objArr2 = {electricityBillAppModel.c};
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState8;
                                ebillAmountComponent$convertToUiState$1.L$1 = chaloTextUIState8;
                                ebillAmountComponent$convertToUiState$1.L$2 = chaloPadding;
                                ebillAmountComponent$convertToUiState$1.L$3 = toolbarUIState3;
                                ebillAmountComponent$convertToUiState$1.L$4 = enterAmountCardUIState;
                                ebillAmountComponent$convertToUiState$1.L$5 = null;
                                ebillAmountComponent$convertToUiState$1.L$6 = null;
                                ebillAmountComponent$convertToUiState$1.F$0 = 0.0f;
                                ebillAmountComponent$convertToUiState$1.label = 6;
                                objB5 = stringProvider.b(stringEnum2, objArr2, ebillAmountComponent$convertToUiState$1);
                                if (objB5 != coroutineSingletons) {
                                    eBillAmountDataState9 = eBillAmountDataState8;
                                    chaloPadding2 = chaloPadding;
                                    enterAmountCardUIState3 = enterAmountCardUIState;
                                    obj4 = objB5;
                                    black_72 = black_71;
                                    EBillAmountDataState eBillAmountDataState13 = eBillAmountDataState9;
                                    customerInfoUIState = new CustomerInfoUIState(chaloPadding2, chaloTextUIState8, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.BodyMedium, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
                                    eBillAmountDataState7 = eBillAmountDataState13;
                                    enterAmountCardUIState2 = enterAmountCardUIState3;
                                    toolbarUIState4 = toolbarUIState3;
                                    electricityBillAppModel2 = eBillAmountDataState7.b;
                                    if (electricityBillAppModel2 != null) {
                                        f = ChaloThemeHelper.a().d;
                                        float f13 = ChaloThemeHelper.a().g;
                                        float f14 = ChaloThemeHelper.a().h;
                                        chaloPadding3 = new ChaloPadding(f13, f14, f14, f13);
                                        textValueUIStateArr = new TextValueUIState[3];
                                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                        ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                        ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                        ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                        ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                        ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                                        ebillAmountComponent$convertToUiState$1.label = 7;
                                        objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                        if (objB6 != coroutineSingletons) {
                                            EnterAmountCardUIState enterAmountCardUIState10 = enterAmountCardUIState2;
                                            eBillAmountDataState10 = eBillAmountDataState7;
                                            obj5 = objB6;
                                            toolbarUIState5 = toolbarUIState4;
                                            enterAmountCardUIState4 = enterAmountCardUIState10;
                                            textValueUIStateArr2 = textValueUIStateArr;
                                            chaloPadding4 = chaloPadding3;
                                            i3 = 0;
                                            UITextStyle uITextStyle11 = UITextStyle.BodyMedium;
                                            textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle11, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle11, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                            ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                                            ebillAmountComponent$convertToUiState$1.label = 8;
                                            objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                            if (objB7 != coroutineSingletons) {
                                                textValueUIStateArr3 = textValueUIStateArr;
                                                textValueUIStateArr4 = textValueUIStateArr3;
                                                enterAmountCardUIState5 = enterAmountCardUIState4;
                                                i4 = 1;
                                                String str7 = (String) objB7;
                                                UITextStyle uITextStyle12 = UITextStyle.BodyMedium;
                                                textValueUIStateArr5 = textValueUIStateArr3;
                                                textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str7, uITextStyle12, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle12, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                                ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                                ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                                ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                                ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                                ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                                ebillAmountComponent$convertToUiState$1.L$7 = null;
                                                ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                                ebillAmountComponent$convertToUiState$1.label = 9;
                                                objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                                if (objB8 != coroutineSingletons) {
                                                    textValueUIStateArr6 = textValueUIStateArr5;
                                                    textValueUIStateArr7 = textValueUIStateArr6;
                                                    f2 = f;
                                                    eBillAmountDataState11 = eBillAmountDataState10;
                                                    enterAmountCardUIState6 = enterAmountCardUIState5;
                                                    customerInfoUIState2 = customerInfoUIState;
                                                    toolbarUIState6 = toolbarUIState5;
                                                    chaloPadding5 = chaloPadding4;
                                                    obj6 = objB8;
                                                    i5 = 2;
                                                    UITextStyle uITextStyle13 = UITextStyle.HeadlineMedium;
                                                    ChaloColorToken.Black_87 black_811 = black_87;
                                                    textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle13, black_811, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle13, black_811, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                    transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                                    enterAmountCardUIState2 = enterAmountCardUIState6;
                                                    toolbarUIState4 = toolbarUIState6;
                                                }
                                            }
                                        }
                                    } else {
                                        customerInfoUIState2 = customerInfoUIState;
                                        transactionInfoUIState = null;
                                    }
                                    return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                ToolbarUIState toolbarUIState7 = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$1;
                EBillAmountDataState eBillAmountDataState14 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj6);
                eBillAmountDataState3 = eBillAmountDataState14;
                i = 0;
                c = 2;
                toolbarUIState = toolbarUIState7;
                obj2 = obj6;
                stringProvider = stringProvider2;
                i2 = i;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState3;
                ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState;
                ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState;
                ebillAmountComponent$convertToUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.EBILL_AMOUNT_SUBTITLE, new Object[i2], ebillAmountComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons) {
                    obj3 = objB2;
                    eBillAmountDataState4 = eBillAmountDataState3;
                    toolbarUIState2 = toolbarUIState;
                    chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.BodyMedium, black_73, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    black_70 = black_73;
                    str = eBillAmountDataState4.c;
                    if (str != null) {
                        strD = currencyFeature.d();
                    } else {
                        strD = currencyFeature.d();
                    }
                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState4;
                    ebillAmountComponent$convertToUiState$1.L$1 = strD;
                    ebillAmountComponent$convertToUiState$1.L$2 = toolbarUIState2;
                    ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState;
                    ebillAmountComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                    ebillAmountComponent$convertToUiState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.HINT_AMOUNT, new Object[i2], ebillAmountComponent$convertToUiState$1);
                    if (objB3 != coroutineSingletons) {
                        eBillAmountDataState5 = eBillAmountDataState4;
                        str2 = strD;
                        chaloTextUIState3 = chaloTextUIState;
                        chaloTextUIState4 = chaloTextUIState2;
                        uITextStyle = UITextStyle.BodyMedium;
                        TextFieldLabelPlaceholderUIState.TextLabel textLabel3 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB3, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                        black_71 = black_70;
                        TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B3 = TextFieldEventHandlerHelper.b(2, new qp(this, 23), null);
                        UIKeyboardOption uIKeyboardOption3 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                        ChaloColorToken.TextFieldIndicator textFieldIndicator3 = ChaloColorToken.TextFieldIndicator.f9859a;
                        textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B3, null, textLabel3, null, null, false, uIKeyboardOption3, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator3, textFieldIndicator3, textFieldIndicator3, textFieldIndicator3, null, null, 4178943), 0.0f, 97244);
                        str3 = eBillAmountDataState5.d;
                        if (str3 != null) {
                            chaloTextUIState5 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        } else {
                            chaloTextUIState5 = null;
                        }
                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState5;
                        ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState2;
                        ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                        ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState4;
                        ebillAmountComponent$convertToUiState$1.L$4 = textFieldUIState;
                        ebillAmountComponent$convertToUiState$1.L$5 = chaloTextUIState5;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        ebillAmountComponent$convertToUiState$1.L$6 = buttonUIStateFactory;
                        chaloTextUIState6 = chaloTextUIState5;
                        ebillAmountComponent$convertToUiState$1.label = 5;
                        objB4 = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], ebillAmountComponent$convertToUiState$1);
                        if (objB4 != coroutineSingletons) {
                            eBillAmountDataState6 = eBillAmountDataState5;
                            toolbarUIState3 = toolbarUIState2;
                            textFieldUIState2 = textFieldUIState;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            chaloTextUIState7 = chaloTextUIState6;
                            enterAmountCardUIState = new EnterAmountCardUIState(chaloTextUIState3, chaloTextUIState4, textFieldUIState2, chaloTextUIState7, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new xx(this, 7), null, eBillAmountDataState6.f2548a, 0.0f, 44));
                            electricityBillAppModel = eBillAmountDataState6.b;
                            if (electricityBillAppModel != null) {
                                black_72 = black_71;
                                enterAmountCardUIState2 = enterAmountCardUIState;
                                eBillAmountDataState7 = eBillAmountDataState6;
                                customerInfoUIState = null;
                                toolbarUIState4 = toolbarUIState3;
                                electricityBillAppModel2 = eBillAmountDataState7.b;
                                if (electricityBillAppModel2 != null) {
                                    f = ChaloThemeHelper.a().d;
                                    float f15 = ChaloThemeHelper.a().g;
                                    float f16 = ChaloThemeHelper.a().h;
                                    chaloPadding3 = new ChaloPadding(f15, f16, f16, f15);
                                    textValueUIStateArr = new TextValueUIState[3];
                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                    ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                    ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                    ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                    ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                    ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                    ebillAmountComponent$convertToUiState$1.label = 7;
                                    objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                    if (objB6 != coroutineSingletons) {
                                        EnterAmountCardUIState enterAmountCardUIState11 = enterAmountCardUIState2;
                                        eBillAmountDataState10 = eBillAmountDataState7;
                                        obj5 = objB6;
                                        toolbarUIState5 = toolbarUIState4;
                                        enterAmountCardUIState4 = enterAmountCardUIState11;
                                        textValueUIStateArr2 = textValueUIStateArr;
                                        chaloPadding4 = chaloPadding3;
                                        i3 = 0;
                                        UITextStyle uITextStyle14 = UITextStyle.BodyMedium;
                                        textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle14, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle14, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                        ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                        ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                        ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                        ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                        ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                                        ebillAmountComponent$convertToUiState$1.label = 8;
                                        objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                        if (objB7 != coroutineSingletons) {
                                            textValueUIStateArr3 = textValueUIStateArr;
                                            textValueUIStateArr4 = textValueUIStateArr3;
                                            enterAmountCardUIState5 = enterAmountCardUIState4;
                                            i4 = 1;
                                            String str8 = (String) objB7;
                                            UITextStyle uITextStyle15 = UITextStyle.BodyMedium;
                                            textValueUIStateArr5 = textValueUIStateArr3;
                                            textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str8, uITextStyle15, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle15, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                            ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                            ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                            ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                            ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                            ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                            ebillAmountComponent$convertToUiState$1.L$7 = null;
                                            ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                                            ebillAmountComponent$convertToUiState$1.label = 9;
                                            objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                            if (objB8 != coroutineSingletons) {
                                                textValueUIStateArr6 = textValueUIStateArr5;
                                                textValueUIStateArr7 = textValueUIStateArr6;
                                                f2 = f;
                                                eBillAmountDataState11 = eBillAmountDataState10;
                                                enterAmountCardUIState6 = enterAmountCardUIState5;
                                                customerInfoUIState2 = customerInfoUIState;
                                                toolbarUIState6 = toolbarUIState5;
                                                chaloPadding5 = chaloPadding4;
                                                obj6 = objB8;
                                                i5 = 2;
                                                UITextStyle uITextStyle16 = UITextStyle.HeadlineMedium;
                                                ChaloColorToken.Black_87 black_812 = black_87;
                                                textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle16, black_812, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle16, black_812, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                                enterAmountCardUIState2 = enterAmountCardUIState6;
                                                toolbarUIState4 = toolbarUIState6;
                                            }
                                        }
                                    }
                                } else {
                                    customerInfoUIState2 = customerInfoUIState;
                                    transactionInfoUIState = null;
                                }
                                return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                            }
                            float f17 = ChaloThemeHelper.a().g;
                            float f18 = ChaloThemeHelper.a().h;
                            chaloPadding = new ChaloPadding(f17, f18, f18, f17);
                            eBillAmountDataState8 = eBillAmountDataState6;
                            chaloTextUIState8 = new TextUIState.ChaloTextUIState(electricityBillAppModel.d, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            StringEnum stringEnum3 = StringEnum.EBILL_CONSUMER_NUMBER;
                            Object[] objArr3 = {electricityBillAppModel.c};
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState8;
                            ebillAmountComponent$convertToUiState$1.L$1 = chaloTextUIState8;
                            ebillAmountComponent$convertToUiState$1.L$2 = chaloPadding;
                            ebillAmountComponent$convertToUiState$1.L$3 = toolbarUIState3;
                            ebillAmountComponent$convertToUiState$1.L$4 = enterAmountCardUIState;
                            ebillAmountComponent$convertToUiState$1.L$5 = null;
                            ebillAmountComponent$convertToUiState$1.L$6 = null;
                            ebillAmountComponent$convertToUiState$1.F$0 = 0.0f;
                            ebillAmountComponent$convertToUiState$1.label = 6;
                            objB5 = stringProvider.b(stringEnum3, objArr3, ebillAmountComponent$convertToUiState$1);
                            if (objB5 != coroutineSingletons) {
                                eBillAmountDataState9 = eBillAmountDataState8;
                                chaloPadding2 = chaloPadding;
                                enterAmountCardUIState3 = enterAmountCardUIState;
                                obj4 = objB5;
                                black_72 = black_71;
                                EBillAmountDataState eBillAmountDataState15 = eBillAmountDataState9;
                                customerInfoUIState = new CustomerInfoUIState(chaloPadding2, chaloTextUIState8, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.BodyMedium, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
                                eBillAmountDataState7 = eBillAmountDataState15;
                                enterAmountCardUIState2 = enterAmountCardUIState3;
                                toolbarUIState4 = toolbarUIState3;
                                electricityBillAppModel2 = eBillAmountDataState7.b;
                                if (electricityBillAppModel2 != null) {
                                    f = ChaloThemeHelper.a().d;
                                    float f19 = ChaloThemeHelper.a().g;
                                    float f110 = ChaloThemeHelper.a().h;
                                    chaloPadding3 = new ChaloPadding(f19, f110, f110, f19);
                                    textValueUIStateArr = new TextValueUIState[3];
                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                    ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                    ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                    ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                    ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                    ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                    ebillAmountComponent$convertToUiState$1.label = 7;
                                    objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                    if (objB6 != coroutineSingletons) {
                                        EnterAmountCardUIState enterAmountCardUIState12 = enterAmountCardUIState2;
                                        eBillAmountDataState10 = eBillAmountDataState7;
                                        obj5 = objB6;
                                        toolbarUIState5 = toolbarUIState4;
                                        enterAmountCardUIState4 = enterAmountCardUIState12;
                                        textValueUIStateArr2 = textValueUIStateArr;
                                        chaloPadding4 = chaloPadding3;
                                        i3 = 0;
                                        UITextStyle uITextStyle17 = UITextStyle.BodyMedium;
                                        textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle17, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle17, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                        ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                        ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                        ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                        ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                        ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                        ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                                        ebillAmountComponent$convertToUiState$1.label = 8;
                                        objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                        if (objB7 != coroutineSingletons) {
                                            textValueUIStateArr3 = textValueUIStateArr;
                                            textValueUIStateArr4 = textValueUIStateArr3;
                                            enterAmountCardUIState5 = enterAmountCardUIState4;
                                            i4 = 1;
                                            String str9 = (String) objB7;
                                            UITextStyle uITextStyle18 = UITextStyle.BodyMedium;
                                            textValueUIStateArr5 = textValueUIStateArr3;
                                            textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str9, uITextStyle18, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle18, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                            ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                            ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                            ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                            ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                            ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                            ebillAmountComponent$convertToUiState$1.L$7 = null;
                                            ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                                            ebillAmountComponent$convertToUiState$1.label = 9;
                                            objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                            if (objB8 != coroutineSingletons) {
                                                textValueUIStateArr6 = textValueUIStateArr5;
                                                textValueUIStateArr7 = textValueUIStateArr6;
                                                f2 = f;
                                                eBillAmountDataState11 = eBillAmountDataState10;
                                                enterAmountCardUIState6 = enterAmountCardUIState5;
                                                customerInfoUIState2 = customerInfoUIState;
                                                toolbarUIState6 = toolbarUIState5;
                                                chaloPadding5 = chaloPadding4;
                                                obj6 = objB8;
                                                i5 = 2;
                                                UITextStyle uITextStyle19 = UITextStyle.HeadlineMedium;
                                                ChaloColorToken.Black_87 black_813 = black_87;
                                                textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle19, black_813, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle19, black_813, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                                transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                                enterAmountCardUIState2 = enterAmountCardUIState6;
                                                toolbarUIState4 = toolbarUIState6;
                                            }
                                        }
                                    }
                                } else {
                                    customerInfoUIState2 = customerInfoUIState;
                                    transactionInfoUIState = null;
                                }
                                return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                obj3 = obj6;
                TextUIState.ChaloTextUIState chaloTextUIState9 = (TextUIState.ChaloTextUIState) ebillAmountComponent$convertToUiState$1.L$2;
                toolbarUIState = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$1;
                eBillAmountDataState3 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj3);
                chaloTextUIState = chaloTextUIState9;
                stringProvider = stringProvider2;
                i2 = 0;
                eBillAmountDataState4 = eBillAmountDataState3;
                toolbarUIState2 = toolbarUIState;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.BodyMedium, black_73, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                black_70 = black_73;
                str = eBillAmountDataState4.c;
                if (str != null) {
                    strD = currencyFeature.d();
                } else {
                    strD = currencyFeature.d();
                }
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState4;
                ebillAmountComponent$convertToUiState$1.L$1 = strD;
                ebillAmountComponent$convertToUiState$1.L$2 = toolbarUIState2;
                ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState;
                ebillAmountComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                ebillAmountComponent$convertToUiState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.HINT_AMOUNT, new Object[i2], ebillAmountComponent$convertToUiState$1);
                if (objB3 != coroutineSingletons) {
                    eBillAmountDataState5 = eBillAmountDataState4;
                    str2 = strD;
                    chaloTextUIState3 = chaloTextUIState;
                    chaloTextUIState4 = chaloTextUIState2;
                    uITextStyle = UITextStyle.BodyMedium;
                    TextFieldLabelPlaceholderUIState.TextLabel textLabel4 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB3, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                    black_71 = black_70;
                    TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B4 = TextFieldEventHandlerHelper.b(2, new qp(this, 23), null);
                    UIKeyboardOption uIKeyboardOption4 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                    ChaloColorToken.TextFieldIndicator textFieldIndicator4 = ChaloColorToken.TextFieldIndicator.f9859a;
                    textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B4, null, textLabel4, null, null, false, uIKeyboardOption4, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator4, textFieldIndicator4, textFieldIndicator4, textFieldIndicator4, null, null, 4178943), 0.0f, 97244);
                    str3 = eBillAmountDataState5.d;
                    if (str3 != null) {
                        chaloTextUIState5 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    } else {
                        chaloTextUIState5 = null;
                    }
                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState5;
                    ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState2;
                    ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                    ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState4;
                    ebillAmountComponent$convertToUiState$1.L$4 = textFieldUIState;
                    ebillAmountComponent$convertToUiState$1.L$5 = chaloTextUIState5;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    ebillAmountComponent$convertToUiState$1.L$6 = buttonUIStateFactory;
                    chaloTextUIState6 = chaloTextUIState5;
                    ebillAmountComponent$convertToUiState$1.label = 5;
                    objB4 = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], ebillAmountComponent$convertToUiState$1);
                    if (objB4 != coroutineSingletons) {
                        eBillAmountDataState6 = eBillAmountDataState5;
                        toolbarUIState3 = toolbarUIState2;
                        textFieldUIState2 = textFieldUIState;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        chaloTextUIState7 = chaloTextUIState6;
                        enterAmountCardUIState = new EnterAmountCardUIState(chaloTextUIState3, chaloTextUIState4, textFieldUIState2, chaloTextUIState7, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new xx(this, 7), null, eBillAmountDataState6.f2548a, 0.0f, 44));
                        electricityBillAppModel = eBillAmountDataState6.b;
                        if (electricityBillAppModel != null) {
                            black_72 = black_71;
                            enterAmountCardUIState2 = enterAmountCardUIState;
                            eBillAmountDataState7 = eBillAmountDataState6;
                            customerInfoUIState = null;
                            toolbarUIState4 = toolbarUIState3;
                            electricityBillAppModel2 = eBillAmountDataState7.b;
                            if (electricityBillAppModel2 != null) {
                                f = ChaloThemeHelper.a().d;
                                float f111 = ChaloThemeHelper.a().g;
                                float f112 = ChaloThemeHelper.a().h;
                                chaloPadding3 = new ChaloPadding(f111, f112, f112, f111);
                                textValueUIStateArr = new TextValueUIState[3];
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                ebillAmountComponent$convertToUiState$1.label = 7;
                                objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                if (objB6 != coroutineSingletons) {
                                    EnterAmountCardUIState enterAmountCardUIState13 = enterAmountCardUIState2;
                                    eBillAmountDataState10 = eBillAmountDataState7;
                                    obj5 = objB6;
                                    toolbarUIState5 = toolbarUIState4;
                                    enterAmountCardUIState4 = enterAmountCardUIState13;
                                    textValueUIStateArr2 = textValueUIStateArr;
                                    chaloPadding4 = chaloPadding3;
                                    i3 = 0;
                                    UITextStyle uITextStyle110 = UITextStyle.BodyMedium;
                                    textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle110, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle110, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                    ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                    ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                    ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                    ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                    ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                    ebillAmountComponent$convertToUiState$1.label = 8;
                                    objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                    if (objB7 != coroutineSingletons) {
                                        textValueUIStateArr3 = textValueUIStateArr;
                                        textValueUIStateArr4 = textValueUIStateArr3;
                                        enterAmountCardUIState5 = enterAmountCardUIState4;
                                        i4 = 1;
                                        String str10 = (String) objB7;
                                        UITextStyle uITextStyle111 = UITextStyle.BodyMedium;
                                        textValueUIStateArr5 = textValueUIStateArr3;
                                        textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str10, uITextStyle111, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle111, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                        ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                        ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                        ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                        ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                        ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                        ebillAmountComponent$convertToUiState$1.L$7 = null;
                                        ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                                        ebillAmountComponent$convertToUiState$1.label = 9;
                                        objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                        if (objB8 != coroutineSingletons) {
                                            textValueUIStateArr6 = textValueUIStateArr5;
                                            textValueUIStateArr7 = textValueUIStateArr6;
                                            f2 = f;
                                            eBillAmountDataState11 = eBillAmountDataState10;
                                            enterAmountCardUIState6 = enterAmountCardUIState5;
                                            customerInfoUIState2 = customerInfoUIState;
                                            toolbarUIState6 = toolbarUIState5;
                                            chaloPadding5 = chaloPadding4;
                                            obj6 = objB8;
                                            i5 = 2;
                                            UITextStyle uITextStyle112 = UITextStyle.HeadlineMedium;
                                            ChaloColorToken.Black_87 black_814 = black_87;
                                            textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle112, black_814, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle112, black_814, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                            transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                            enterAmountCardUIState2 = enterAmountCardUIState6;
                                            toolbarUIState4 = toolbarUIState6;
                                        }
                                    }
                                }
                            } else {
                                customerInfoUIState2 = customerInfoUIState;
                                transactionInfoUIState = null;
                            }
                            return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                        }
                        float f113 = ChaloThemeHelper.a().g;
                        float f114 = ChaloThemeHelper.a().h;
                        chaloPadding = new ChaloPadding(f113, f114, f114, f113);
                        eBillAmountDataState8 = eBillAmountDataState6;
                        chaloTextUIState8 = new TextUIState.ChaloTextUIState(electricityBillAppModel.d, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        StringEnum stringEnum4 = StringEnum.EBILL_CONSUMER_NUMBER;
                        Object[] objArr4 = {electricityBillAppModel.c};
                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState8;
                        ebillAmountComponent$convertToUiState$1.L$1 = chaloTextUIState8;
                        ebillAmountComponent$convertToUiState$1.L$2 = chaloPadding;
                        ebillAmountComponent$convertToUiState$1.L$3 = toolbarUIState3;
                        ebillAmountComponent$convertToUiState$1.L$4 = enterAmountCardUIState;
                        ebillAmountComponent$convertToUiState$1.L$5 = null;
                        ebillAmountComponent$convertToUiState$1.L$6 = null;
                        ebillAmountComponent$convertToUiState$1.F$0 = 0.0f;
                        ebillAmountComponent$convertToUiState$1.label = 6;
                        objB5 = stringProvider.b(stringEnum4, objArr4, ebillAmountComponent$convertToUiState$1);
                        if (objB5 != coroutineSingletons) {
                            eBillAmountDataState9 = eBillAmountDataState8;
                            chaloPadding2 = chaloPadding;
                            enterAmountCardUIState3 = enterAmountCardUIState;
                            obj4 = objB5;
                            black_72 = black_71;
                            EBillAmountDataState eBillAmountDataState16 = eBillAmountDataState9;
                            customerInfoUIState = new CustomerInfoUIState(chaloPadding2, chaloTextUIState8, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.BodyMedium, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
                            eBillAmountDataState7 = eBillAmountDataState16;
                            enterAmountCardUIState2 = enterAmountCardUIState3;
                            toolbarUIState4 = toolbarUIState3;
                            electricityBillAppModel2 = eBillAmountDataState7.b;
                            if (electricityBillAppModel2 != null) {
                                f = ChaloThemeHelper.a().d;
                                float f115 = ChaloThemeHelper.a().g;
                                float f116 = ChaloThemeHelper.a().h;
                                chaloPadding3 = new ChaloPadding(f115, f116, f116, f115);
                                textValueUIStateArr = new TextValueUIState[3];
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                                ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                                ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                                ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                                ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                ebillAmountComponent$convertToUiState$1.I$0 = 0;
                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                ebillAmountComponent$convertToUiState$1.label = 7;
                                objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                if (objB6 != coroutineSingletons) {
                                    EnterAmountCardUIState enterAmountCardUIState14 = enterAmountCardUIState2;
                                    eBillAmountDataState10 = eBillAmountDataState7;
                                    obj5 = objB6;
                                    toolbarUIState5 = toolbarUIState4;
                                    enterAmountCardUIState4 = enterAmountCardUIState14;
                                    textValueUIStateArr2 = textValueUIStateArr;
                                    chaloPadding4 = chaloPadding3;
                                    i3 = 0;
                                    UITextStyle uITextStyle113 = UITextStyle.BodyMedium;
                                    textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle113, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle113, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                    ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                    ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                    ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                    ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                    ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                    ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                    ebillAmountComponent$convertToUiState$1.label = 8;
                                    objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                    if (objB7 != coroutineSingletons) {
                                        textValueUIStateArr3 = textValueUIStateArr;
                                        textValueUIStateArr4 = textValueUIStateArr3;
                                        enterAmountCardUIState5 = enterAmountCardUIState4;
                                        i4 = 1;
                                        String str11 = (String) objB7;
                                        UITextStyle uITextStyle114 = UITextStyle.BodyMedium;
                                        textValueUIStateArr5 = textValueUIStateArr3;
                                        textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str11, uITextStyle114, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle114, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                        ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                        ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                        ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                        ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                        ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                        ebillAmountComponent$convertToUiState$1.L$7 = null;
                                        ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                                        ebillAmountComponent$convertToUiState$1.label = 9;
                                        objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                        if (objB8 != coroutineSingletons) {
                                            textValueUIStateArr6 = textValueUIStateArr5;
                                            textValueUIStateArr7 = textValueUIStateArr6;
                                            f2 = f;
                                            eBillAmountDataState11 = eBillAmountDataState10;
                                            enterAmountCardUIState6 = enterAmountCardUIState5;
                                            customerInfoUIState2 = customerInfoUIState;
                                            toolbarUIState6 = toolbarUIState5;
                                            chaloPadding5 = chaloPadding4;
                                            obj6 = objB8;
                                            i5 = 2;
                                            UITextStyle uITextStyle115 = UITextStyle.HeadlineMedium;
                                            ChaloColorToken.Black_87 black_815 = black_87;
                                            textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle115, black_815, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle115, black_815, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                            transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                            enterAmountCardUIState2 = enterAmountCardUIState6;
                                            toolbarUIState4 = toolbarUIState6;
                                        }
                                    }
                                }
                            } else {
                                customerInfoUIState2 = customerInfoUIState;
                                transactionInfoUIState = null;
                            }
                            return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                TextUIState.ChaloTextUIState chaloTextUIState10 = (TextUIState.ChaloTextUIState) ebillAmountComponent$convertToUiState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState11 = (TextUIState.ChaloTextUIState) ebillAmountComponent$convertToUiState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$2;
                String str12 = (String) ebillAmountComponent$convertToUiState$1.L$1;
                EBillAmountDataState eBillAmountDataState17 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj6);
                str2 = str12;
                eBillAmountDataState5 = eBillAmountDataState17;
                stringProvider = stringProvider2;
                chaloTextUIState4 = chaloTextUIState10;
                chaloTextUIState3 = chaloTextUIState11;
                objB3 = obj6;
                black_70 = black_73;
                uITextStyle = UITextStyle.BodyMedium;
                TextFieldLabelPlaceholderUIState.TextLabel textLabel5 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB3, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                black_71 = black_70;
                TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B5 = TextFieldEventHandlerHelper.b(2, new qp(this, 23), null);
                UIKeyboardOption uIKeyboardOption5 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                ChaloColorToken.TextFieldIndicator textFieldIndicator5 = ChaloColorToken.TextFieldIndicator.f9859a;
                textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B5, null, textLabel5, null, null, false, uIKeyboardOption5, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator5, textFieldIndicator5, textFieldIndicator5, textFieldIndicator5, null, null, 4178943), 0.0f, 97244);
                str3 = eBillAmountDataState5.d;
                if (str3 != null) {
                    chaloTextUIState5 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                } else {
                    chaloTextUIState5 = null;
                }
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState5;
                ebillAmountComponent$convertToUiState$1.L$1 = toolbarUIState2;
                ebillAmountComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                ebillAmountComponent$convertToUiState$1.L$3 = chaloTextUIState4;
                ebillAmountComponent$convertToUiState$1.L$4 = textFieldUIState;
                ebillAmountComponent$convertToUiState$1.L$5 = chaloTextUIState5;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                ebillAmountComponent$convertToUiState$1.L$6 = buttonUIStateFactory;
                chaloTextUIState6 = chaloTextUIState5;
                ebillAmountComponent$convertToUiState$1.label = 5;
                objB4 = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], ebillAmountComponent$convertToUiState$1);
                if (objB4 != coroutineSingletons) {
                    eBillAmountDataState6 = eBillAmountDataState5;
                    toolbarUIState3 = toolbarUIState2;
                    textFieldUIState2 = textFieldUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    chaloTextUIState7 = chaloTextUIState6;
                    enterAmountCardUIState = new EnterAmountCardUIState(chaloTextUIState3, chaloTextUIState4, textFieldUIState2, chaloTextUIState7, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new xx(this, 7), null, eBillAmountDataState6.f2548a, 0.0f, 44));
                    electricityBillAppModel = eBillAmountDataState6.b;
                    if (electricityBillAppModel != null) {
                        black_72 = black_71;
                        enterAmountCardUIState2 = enterAmountCardUIState;
                        eBillAmountDataState7 = eBillAmountDataState6;
                        customerInfoUIState = null;
                        toolbarUIState4 = toolbarUIState3;
                        electricityBillAppModel2 = eBillAmountDataState7.b;
                        if (electricityBillAppModel2 != null) {
                            f = ChaloThemeHelper.a().d;
                            float f117 = ChaloThemeHelper.a().g;
                            float f118 = ChaloThemeHelper.a().h;
                            chaloPadding3 = new ChaloPadding(f117, f118, f118, f117);
                            textValueUIStateArr = new TextValueUIState[3];
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                            ebillAmountComponent$convertToUiState$1.I$0 = 0;
                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                            ebillAmountComponent$convertToUiState$1.label = 7;
                            objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                            if (objB6 != coroutineSingletons) {
                                EnterAmountCardUIState enterAmountCardUIState15 = enterAmountCardUIState2;
                                eBillAmountDataState10 = eBillAmountDataState7;
                                obj5 = objB6;
                                toolbarUIState5 = toolbarUIState4;
                                enterAmountCardUIState4 = enterAmountCardUIState15;
                                textValueUIStateArr2 = textValueUIStateArr;
                                chaloPadding4 = chaloPadding3;
                                i3 = 0;
                                UITextStyle uITextStyle116 = UITextStyle.BodyMedium;
                                textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle116, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle116, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                ebillAmountComponent$convertToUiState$1.label = 8;
                                objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                if (objB7 != coroutineSingletons) {
                                    textValueUIStateArr3 = textValueUIStateArr;
                                    textValueUIStateArr4 = textValueUIStateArr3;
                                    enterAmountCardUIState5 = enterAmountCardUIState4;
                                    i4 = 1;
                                    String str13 = (String) objB7;
                                    UITextStyle uITextStyle117 = UITextStyle.BodyMedium;
                                    textValueUIStateArr5 = textValueUIStateArr3;
                                    textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str13, uITextStyle117, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle117, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                    ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                    ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                    ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                    ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                    ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                    ebillAmountComponent$convertToUiState$1.L$7 = null;
                                    ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                    ebillAmountComponent$convertToUiState$1.label = 9;
                                    objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                    if (objB8 != coroutineSingletons) {
                                        textValueUIStateArr6 = textValueUIStateArr5;
                                        textValueUIStateArr7 = textValueUIStateArr6;
                                        f2 = f;
                                        eBillAmountDataState11 = eBillAmountDataState10;
                                        enterAmountCardUIState6 = enterAmountCardUIState5;
                                        customerInfoUIState2 = customerInfoUIState;
                                        toolbarUIState6 = toolbarUIState5;
                                        chaloPadding5 = chaloPadding4;
                                        obj6 = objB8;
                                        i5 = 2;
                                        UITextStyle uITextStyle118 = UITextStyle.HeadlineMedium;
                                        ChaloColorToken.Black_87 black_816 = black_87;
                                        textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle118, black_816, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle118, black_816, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                        transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                        enterAmountCardUIState2 = enterAmountCardUIState6;
                                        toolbarUIState4 = toolbarUIState6;
                                    }
                                }
                            }
                        } else {
                            customerInfoUIState2 = customerInfoUIState;
                            transactionInfoUIState = null;
                        }
                        return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                    }
                    float f119 = ChaloThemeHelper.a().g;
                    float f1110 = ChaloThemeHelper.a().h;
                    chaloPadding = new ChaloPadding(f119, f1110, f1110, f119);
                    eBillAmountDataState8 = eBillAmountDataState6;
                    chaloTextUIState8 = new TextUIState.ChaloTextUIState(electricityBillAppModel.d, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    StringEnum stringEnum5 = StringEnum.EBILL_CONSUMER_NUMBER;
                    Object[] objArr5 = {electricityBillAppModel.c};
                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState8;
                    ebillAmountComponent$convertToUiState$1.L$1 = chaloTextUIState8;
                    ebillAmountComponent$convertToUiState$1.L$2 = chaloPadding;
                    ebillAmountComponent$convertToUiState$1.L$3 = toolbarUIState3;
                    ebillAmountComponent$convertToUiState$1.L$4 = enterAmountCardUIState;
                    ebillAmountComponent$convertToUiState$1.L$5 = null;
                    ebillAmountComponent$convertToUiState$1.L$6 = null;
                    ebillAmountComponent$convertToUiState$1.F$0 = 0.0f;
                    ebillAmountComponent$convertToUiState$1.label = 6;
                    objB5 = stringProvider.b(stringEnum5, objArr5, ebillAmountComponent$convertToUiState$1);
                    if (objB5 != coroutineSingletons) {
                        eBillAmountDataState9 = eBillAmountDataState8;
                        chaloPadding2 = chaloPadding;
                        enterAmountCardUIState3 = enterAmountCardUIState;
                        obj4 = objB5;
                        black_72 = black_71;
                        EBillAmountDataState eBillAmountDataState18 = eBillAmountDataState9;
                        customerInfoUIState = new CustomerInfoUIState(chaloPadding2, chaloTextUIState8, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.BodyMedium, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
                        eBillAmountDataState7 = eBillAmountDataState18;
                        enterAmountCardUIState2 = enterAmountCardUIState3;
                        toolbarUIState4 = toolbarUIState3;
                        electricityBillAppModel2 = eBillAmountDataState7.b;
                        if (electricityBillAppModel2 != null) {
                            f = ChaloThemeHelper.a().d;
                            float f1111 = ChaloThemeHelper.a().g;
                            float f1112 = ChaloThemeHelper.a().h;
                            chaloPadding3 = new ChaloPadding(f1111, f1112, f1112, f1111);
                            textValueUIStateArr = new TextValueUIState[3];
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                            ebillAmountComponent$convertToUiState$1.I$0 = 0;
                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                            ebillAmountComponent$convertToUiState$1.label = 7;
                            objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                            if (objB6 != coroutineSingletons) {
                                EnterAmountCardUIState enterAmountCardUIState16 = enterAmountCardUIState2;
                                eBillAmountDataState10 = eBillAmountDataState7;
                                obj5 = objB6;
                                toolbarUIState5 = toolbarUIState4;
                                enterAmountCardUIState4 = enterAmountCardUIState16;
                                textValueUIStateArr2 = textValueUIStateArr;
                                chaloPadding4 = chaloPadding3;
                                i3 = 0;
                                UITextStyle uITextStyle119 = UITextStyle.BodyMedium;
                                textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle119, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle119, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                                ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                                ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                                ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                                ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                                ebillAmountComponent$convertToUiState$1.I$0 = 1;
                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                ebillAmountComponent$convertToUiState$1.label = 8;
                                objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                                if (objB7 != coroutineSingletons) {
                                    textValueUIStateArr3 = textValueUIStateArr;
                                    textValueUIStateArr4 = textValueUIStateArr3;
                                    enterAmountCardUIState5 = enterAmountCardUIState4;
                                    i4 = 1;
                                    String str14 = (String) objB7;
                                    UITextStyle uITextStyle1110 = UITextStyle.BodyMedium;
                                    textValueUIStateArr5 = textValueUIStateArr3;
                                    textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str14, uITextStyle1110, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle1110, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                    ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                    ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                    ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                    ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                    ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                    ebillAmountComponent$convertToUiState$1.L$7 = null;
                                    ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                                    ebillAmountComponent$convertToUiState$1.label = 9;
                                    objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                    if (objB8 != coroutineSingletons) {
                                        textValueUIStateArr6 = textValueUIStateArr5;
                                        textValueUIStateArr7 = textValueUIStateArr6;
                                        f2 = f;
                                        eBillAmountDataState11 = eBillAmountDataState10;
                                        enterAmountCardUIState6 = enterAmountCardUIState5;
                                        customerInfoUIState2 = customerInfoUIState;
                                        toolbarUIState6 = toolbarUIState5;
                                        chaloPadding5 = chaloPadding4;
                                        obj6 = objB8;
                                        i5 = 2;
                                        UITextStyle uITextStyle1111 = UITextStyle.HeadlineMedium;
                                        ChaloColorToken.Black_87 black_817 = black_87;
                                        textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle1111, black_817, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle1111, black_817, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                        transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                        enterAmountCardUIState2 = enterAmountCardUIState6;
                                        toolbarUIState4 = toolbarUIState6;
                                    }
                                }
                            }
                        } else {
                            customerInfoUIState2 = customerInfoUIState;
                            transactionInfoUIState = null;
                        }
                        return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                    }
                }
                return coroutineSingletons;
            case 5:
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) ebillAmountComponent$convertToUiState$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState12 = (TextUIState.ChaloTextUIState) ebillAmountComponent$convertToUiState$1.L$5;
                textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) ebillAmountComponent$convertToUiState$1.L$4;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) ebillAmountComponent$convertToUiState$1.L$3;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) ebillAmountComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState8 = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$1;
                EBillAmountDataState eBillAmountDataState19 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj6);
                chaloTextUIState7 = chaloTextUIState12;
                toolbarUIState3 = toolbarUIState8;
                stringProvider = stringProvider2;
                eBillAmountDataState6 = eBillAmountDataState19;
                black_71 = black_73;
                buttonUIStateFactory2 = buttonUIStateFactory3;
                objB4 = obj6;
                enterAmountCardUIState = new EnterAmountCardUIState(chaloTextUIState3, chaloTextUIState4, textFieldUIState2, chaloTextUIState7, ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new xx(this, 7), null, eBillAmountDataState6.f2548a, 0.0f, 44));
                electricityBillAppModel = eBillAmountDataState6.b;
                if (electricityBillAppModel != null) {
                    black_72 = black_71;
                    enterAmountCardUIState2 = enterAmountCardUIState;
                    eBillAmountDataState7 = eBillAmountDataState6;
                    customerInfoUIState = null;
                    toolbarUIState4 = toolbarUIState3;
                    electricityBillAppModel2 = eBillAmountDataState7.b;
                    if (electricityBillAppModel2 != null) {
                        f = ChaloThemeHelper.a().d;
                        float f1113 = ChaloThemeHelper.a().g;
                        float f1114 = ChaloThemeHelper.a().h;
                        chaloPadding3 = new ChaloPadding(f1113, f1114, f1114, f1113);
                        textValueUIStateArr = new TextValueUIState[3];
                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                        ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                        ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                        ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                        ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                        ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                        ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                        ebillAmountComponent$convertToUiState$1.I$0 = 0;
                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                        ebillAmountComponent$convertToUiState$1.label = 7;
                        objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                        if (objB6 != coroutineSingletons) {
                            EnterAmountCardUIState enterAmountCardUIState17 = enterAmountCardUIState2;
                            eBillAmountDataState10 = eBillAmountDataState7;
                            obj5 = objB6;
                            toolbarUIState5 = toolbarUIState4;
                            enterAmountCardUIState4 = enterAmountCardUIState17;
                            textValueUIStateArr2 = textValueUIStateArr;
                            chaloPadding4 = chaloPadding3;
                            i3 = 0;
                            UITextStyle uITextStyle1112 = UITextStyle.BodyMedium;
                            textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle1112, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle1112, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                            ebillAmountComponent$convertToUiState$1.I$0 = 1;
                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                            ebillAmountComponent$convertToUiState$1.label = 8;
                            objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                            if (objB7 != coroutineSingletons) {
                                textValueUIStateArr3 = textValueUIStateArr;
                                textValueUIStateArr4 = textValueUIStateArr3;
                                enterAmountCardUIState5 = enterAmountCardUIState4;
                                i4 = 1;
                                String str15 = (String) objB7;
                                UITextStyle uITextStyle1113 = UITextStyle.BodyMedium;
                                textValueUIStateArr5 = textValueUIStateArr3;
                                textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str15, uITextStyle1113, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle1113, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                ebillAmountComponent$convertToUiState$1.L$7 = null;
                                ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                ebillAmountComponent$convertToUiState$1.label = 9;
                                objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                if (objB8 != coroutineSingletons) {
                                    textValueUIStateArr6 = textValueUIStateArr5;
                                    textValueUIStateArr7 = textValueUIStateArr6;
                                    f2 = f;
                                    eBillAmountDataState11 = eBillAmountDataState10;
                                    enterAmountCardUIState6 = enterAmountCardUIState5;
                                    customerInfoUIState2 = customerInfoUIState;
                                    toolbarUIState6 = toolbarUIState5;
                                    chaloPadding5 = chaloPadding4;
                                    obj6 = objB8;
                                    i5 = 2;
                                    UITextStyle uITextStyle1114 = UITextStyle.HeadlineMedium;
                                    ChaloColorToken.Black_87 black_818 = black_87;
                                    textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle1114, black_818, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle1114, black_818, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                    transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                    enterAmountCardUIState2 = enterAmountCardUIState6;
                                    toolbarUIState4 = toolbarUIState6;
                                }
                            }
                        }
                    } else {
                        customerInfoUIState2 = customerInfoUIState;
                        transactionInfoUIState = null;
                    }
                    return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                }
                float f1115 = ChaloThemeHelper.a().g;
                float f1116 = ChaloThemeHelper.a().h;
                chaloPadding = new ChaloPadding(f1115, f1116, f1116, f1115);
                eBillAmountDataState8 = eBillAmountDataState6;
                chaloTextUIState8 = new TextUIState.ChaloTextUIState(electricityBillAppModel.d, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                StringEnum stringEnum6 = StringEnum.EBILL_CONSUMER_NUMBER;
                Object[] objArr6 = {electricityBillAppModel.c};
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState8;
                ebillAmountComponent$convertToUiState$1.L$1 = chaloTextUIState8;
                ebillAmountComponent$convertToUiState$1.L$2 = chaloPadding;
                ebillAmountComponent$convertToUiState$1.L$3 = toolbarUIState3;
                ebillAmountComponent$convertToUiState$1.L$4 = enterAmountCardUIState;
                ebillAmountComponent$convertToUiState$1.L$5 = null;
                ebillAmountComponent$convertToUiState$1.L$6 = null;
                ebillAmountComponent$convertToUiState$1.F$0 = 0.0f;
                ebillAmountComponent$convertToUiState$1.label = 6;
                objB5 = stringProvider.b(stringEnum6, objArr6, ebillAmountComponent$convertToUiState$1);
                if (objB5 != coroutineSingletons) {
                    eBillAmountDataState9 = eBillAmountDataState8;
                    chaloPadding2 = chaloPadding;
                    enterAmountCardUIState3 = enterAmountCardUIState;
                    obj4 = objB5;
                    black_72 = black_71;
                    EBillAmountDataState eBillAmountDataState110 = eBillAmountDataState9;
                    customerInfoUIState = new CustomerInfoUIState(chaloPadding2, chaloTextUIState8, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.BodyMedium, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
                    eBillAmountDataState7 = eBillAmountDataState110;
                    enterAmountCardUIState2 = enterAmountCardUIState3;
                    toolbarUIState4 = toolbarUIState3;
                    electricityBillAppModel2 = eBillAmountDataState7.b;
                    if (electricityBillAppModel2 != null) {
                        f = ChaloThemeHelper.a().d;
                        float f1117 = ChaloThemeHelper.a().g;
                        float f1118 = ChaloThemeHelper.a().h;
                        chaloPadding3 = new ChaloPadding(f1117, f1118, f1118, f1117);
                        textValueUIStateArr = new TextValueUIState[3];
                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                        ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                        ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                        ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                        ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                        ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                        ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                        ebillAmountComponent$convertToUiState$1.I$0 = 0;
                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                        ebillAmountComponent$convertToUiState$1.label = 7;
                        objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                        if (objB6 != coroutineSingletons) {
                            EnterAmountCardUIState enterAmountCardUIState18 = enterAmountCardUIState2;
                            eBillAmountDataState10 = eBillAmountDataState7;
                            obj5 = objB6;
                            toolbarUIState5 = toolbarUIState4;
                            enterAmountCardUIState4 = enterAmountCardUIState18;
                            textValueUIStateArr2 = textValueUIStateArr;
                            chaloPadding4 = chaloPadding3;
                            i3 = 0;
                            UITextStyle uITextStyle1115 = UITextStyle.BodyMedium;
                            textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle1115, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle1115, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                            ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                            ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                            ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                            ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                            ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                            ebillAmountComponent$convertToUiState$1.I$0 = 1;
                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                            ebillAmountComponent$convertToUiState$1.label = 8;
                            objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                            if (objB7 != coroutineSingletons) {
                                textValueUIStateArr3 = textValueUIStateArr;
                                textValueUIStateArr4 = textValueUIStateArr3;
                                enterAmountCardUIState5 = enterAmountCardUIState4;
                                i4 = 1;
                                String str16 = (String) objB7;
                                UITextStyle uITextStyle1116 = UITextStyle.BodyMedium;
                                textValueUIStateArr5 = textValueUIStateArr3;
                                textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str16, uITextStyle1116, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle1116, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                                ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                                ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                                ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                                ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                                ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                                ebillAmountComponent$convertToUiState$1.L$7 = null;
                                ebillAmountComponent$convertToUiState$1.I$0 = 2;
                                ebillAmountComponent$convertToUiState$1.F$0 = f;
                                ebillAmountComponent$convertToUiState$1.label = 9;
                                objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                                if (objB8 != coroutineSingletons) {
                                    textValueUIStateArr6 = textValueUIStateArr5;
                                    textValueUIStateArr7 = textValueUIStateArr6;
                                    f2 = f;
                                    eBillAmountDataState11 = eBillAmountDataState10;
                                    enterAmountCardUIState6 = enterAmountCardUIState5;
                                    customerInfoUIState2 = customerInfoUIState;
                                    toolbarUIState6 = toolbarUIState5;
                                    chaloPadding5 = chaloPadding4;
                                    obj6 = objB8;
                                    i5 = 2;
                                    UITextStyle uITextStyle1117 = UITextStyle.HeadlineMedium;
                                    ChaloColorToken.Black_87 black_819 = black_87;
                                    textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle1117, black_819, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle1117, black_819, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                    transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                    enterAmountCardUIState2 = enterAmountCardUIState6;
                                    toolbarUIState4 = toolbarUIState6;
                                }
                            }
                        }
                    } else {
                        customerInfoUIState2 = customerInfoUIState;
                        transactionInfoUIState = null;
                    }
                    return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                }
                return coroutineSingletons;
            case 6:
                EnterAmountCardUIState enterAmountCardUIState19 = (EnterAmountCardUIState) ebillAmountComponent$convertToUiState$1.L$4;
                toolbarUIState3 = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$3;
                chaloPadding2 = (ChaloPadding) ebillAmountComponent$convertToUiState$1.L$2;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) ebillAmountComponent$convertToUiState$1.L$1;
                eBillAmountDataState9 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj6);
                enterAmountCardUIState3 = enterAmountCardUIState19;
                stringProvider = stringProvider2;
                obj4 = obj6;
                black_71 = black_73;
                black_72 = black_71;
                EBillAmountDataState eBillAmountDataState111 = eBillAmountDataState9;
                customerInfoUIState = new CustomerInfoUIState(chaloPadding2, chaloTextUIState8, new TextUIState.ChaloTextUIState((String) obj4, UITextStyle.BodyMedium, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
                eBillAmountDataState7 = eBillAmountDataState111;
                enterAmountCardUIState2 = enterAmountCardUIState3;
                toolbarUIState4 = toolbarUIState3;
                electricityBillAppModel2 = eBillAmountDataState7.b;
                if (electricityBillAppModel2 != null) {
                    f = ChaloThemeHelper.a().d;
                    float f1119 = ChaloThemeHelper.a().g;
                    float f11110 = ChaloThemeHelper.a().h;
                    chaloPadding3 = new ChaloPadding(f1119, f11110, f11110, f1119);
                    textValueUIStateArr = new TextValueUIState[3];
                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState7;
                    ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                    ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                    ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding3;
                    ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState4;
                    ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState2;
                    ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                    ebillAmountComponent$convertToUiState$1.I$0 = 0;
                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                    ebillAmountComponent$convertToUiState$1.label = 7;
                    objB6 = stringProvider.b(StringEnum.BILL_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                    if (objB6 != coroutineSingletons) {
                        EnterAmountCardUIState enterAmountCardUIState110 = enterAmountCardUIState2;
                        eBillAmountDataState10 = eBillAmountDataState7;
                        obj5 = objB6;
                        toolbarUIState5 = toolbarUIState4;
                        enterAmountCardUIState4 = enterAmountCardUIState110;
                        textValueUIStateArr2 = textValueUIStateArr;
                        chaloPadding4 = chaloPadding3;
                        i3 = 0;
                        UITextStyle uITextStyle1118 = UITextStyle.BodyMedium;
                        textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle1118, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle1118, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                        ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                        ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                        ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                        ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                        ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                        ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                        ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                        ebillAmountComponent$convertToUiState$1.I$0 = 1;
                        ebillAmountComponent$convertToUiState$1.F$0 = f;
                        ebillAmountComponent$convertToUiState$1.label = 8;
                        objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                        if (objB7 != coroutineSingletons) {
                            textValueUIStateArr3 = textValueUIStateArr;
                            textValueUIStateArr4 = textValueUIStateArr3;
                            enterAmountCardUIState5 = enterAmountCardUIState4;
                            i4 = 1;
                            String str17 = (String) objB7;
                            UITextStyle uITextStyle1119 = UITextStyle.BodyMedium;
                            textValueUIStateArr5 = textValueUIStateArr3;
                            textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str17, uITextStyle1119, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle1119, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                            ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                            ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                            ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                            ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                            ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                            ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                            ebillAmountComponent$convertToUiState$1.L$7 = null;
                            ebillAmountComponent$convertToUiState$1.I$0 = 2;
                            ebillAmountComponent$convertToUiState$1.F$0 = f;
                            ebillAmountComponent$convertToUiState$1.label = 9;
                            objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                            if (objB8 != coroutineSingletons) {
                                textValueUIStateArr6 = textValueUIStateArr5;
                                textValueUIStateArr7 = textValueUIStateArr6;
                                f2 = f;
                                eBillAmountDataState11 = eBillAmountDataState10;
                                enterAmountCardUIState6 = enterAmountCardUIState5;
                                customerInfoUIState2 = customerInfoUIState;
                                toolbarUIState6 = toolbarUIState5;
                                chaloPadding5 = chaloPadding4;
                                obj6 = objB8;
                                i5 = 2;
                                UITextStyle uITextStyle11110 = UITextStyle.HeadlineMedium;
                                ChaloColorToken.Black_87 black_8110 = black_87;
                                textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle11110, black_8110, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle11110, black_8110, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                                enterAmountCardUIState2 = enterAmountCardUIState6;
                                toolbarUIState4 = toolbarUIState6;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                customerInfoUIState2 = customerInfoUIState;
                transactionInfoUIState = null;
                return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
            case 7:
                float f20 = ebillAmountComponent$convertToUiState$1.F$0;
                int i8 = ebillAmountComponent$convertToUiState$1.I$0;
                CustomerInfoUIState customerInfoUIState3 = (CustomerInfoUIState) ebillAmountComponent$convertToUiState$1.L$7;
                EnterAmountCardUIState enterAmountCardUIState20 = (EnterAmountCardUIState) ebillAmountComponent$convertToUiState$1.L$6;
                ToolbarUIState toolbarUIState9 = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$5;
                ChaloPadding chaloPadding6 = (ChaloPadding) ebillAmountComponent$convertToUiState$1.L$4;
                TextValueUIState[] textValueUIStateArr8 = (TextValueUIState[]) ebillAmountComponent$convertToUiState$1.L$3;
                TextValueUIState[] textValueUIStateArr9 = (TextValueUIState[]) ebillAmountComponent$convertToUiState$1.L$2;
                ElectricityBillAppModel electricityBillAppModel3 = (ElectricityBillAppModel) ebillAmountComponent$convertToUiState$1.L$1;
                EBillAmountDataState eBillAmountDataState20 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj6);
                i3 = i8;
                textValueUIStateArr2 = textValueUIStateArr8;
                electricityBillAppModel2 = electricityBillAppModel3;
                f = f20;
                black_72 = black_73;
                customerInfoUIState = customerInfoUIState3;
                chaloPadding4 = chaloPadding6;
                textValueUIStateArr = textValueUIStateArr9;
                stringProvider = stringProvider2;
                toolbarUIState5 = toolbarUIState9;
                enterAmountCardUIState4 = enterAmountCardUIState20;
                eBillAmountDataState10 = eBillAmountDataState20;
                obj5 = obj6;
                UITextStyle uITextStyle11111 = UITextStyle.BodyMedium;
                textValueUIStateArr2[i3] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj5, uITextStyle11111, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.f2538a), uITextStyle11111, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                ebillAmountComponent$convertToUiState$1.L$1 = electricityBillAppModel2;
                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr;
                ebillAmountComponent$convertToUiState$1.L$3 = textValueUIStateArr;
                ebillAmountComponent$convertToUiState$1.L$4 = chaloPadding4;
                ebillAmountComponent$convertToUiState$1.L$5 = toolbarUIState5;
                ebillAmountComponent$convertToUiState$1.L$6 = enterAmountCardUIState4;
                ebillAmountComponent$convertToUiState$1.L$7 = customerInfoUIState;
                ebillAmountComponent$convertToUiState$1.I$0 = 1;
                ebillAmountComponent$convertToUiState$1.F$0 = f;
                ebillAmountComponent$convertToUiState$1.label = 8;
                objB7 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], ebillAmountComponent$convertToUiState$1);
                if (objB7 != coroutineSingletons) {
                    textValueUIStateArr3 = textValueUIStateArr;
                    textValueUIStateArr4 = textValueUIStateArr3;
                    enterAmountCardUIState5 = enterAmountCardUIState4;
                    i4 = 1;
                    String str18 = (String) objB7;
                    UITextStyle uITextStyle11112 = UITextStyle.BodyMedium;
                    textValueUIStateArr5 = textValueUIStateArr3;
                    textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str18, uITextStyle11112, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle11112, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                    ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                    ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                    ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                    ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                    ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                    ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                    ebillAmountComponent$convertToUiState$1.L$7 = null;
                    ebillAmountComponent$convertToUiState$1.I$0 = 2;
                    ebillAmountComponent$convertToUiState$1.F$0 = f;
                    ebillAmountComponent$convertToUiState$1.label = 9;
                    objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                    if (objB8 != coroutineSingletons) {
                        textValueUIStateArr6 = textValueUIStateArr5;
                        textValueUIStateArr7 = textValueUIStateArr6;
                        f2 = f;
                        eBillAmountDataState11 = eBillAmountDataState10;
                        enterAmountCardUIState6 = enterAmountCardUIState5;
                        customerInfoUIState2 = customerInfoUIState;
                        toolbarUIState6 = toolbarUIState5;
                        chaloPadding5 = chaloPadding4;
                        obj6 = objB8;
                        i5 = 2;
                        UITextStyle uITextStyle11113 = UITextStyle.HeadlineMedium;
                        ChaloColorToken.Black_87 black_8111 = black_87;
                        textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle11113, black_8111, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle11113, black_8111, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                        enterAmountCardUIState2 = enterAmountCardUIState6;
                        toolbarUIState4 = toolbarUIState6;
                        return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                    }
                }
                return coroutineSingletons;
            case 8:
                f = ebillAmountComponent$convertToUiState$1.F$0;
                int i9 = ebillAmountComponent$convertToUiState$1.I$0;
                CustomerInfoUIState customerInfoUIState4 = (CustomerInfoUIState) ebillAmountComponent$convertToUiState$1.L$7;
                EnterAmountCardUIState enterAmountCardUIState21 = (EnterAmountCardUIState) ebillAmountComponent$convertToUiState$1.L$6;
                ToolbarUIState toolbarUIState10 = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$5;
                ChaloPadding chaloPadding7 = (ChaloPadding) ebillAmountComponent$convertToUiState$1.L$4;
                TextValueUIState[] textValueUIStateArr10 = (TextValueUIState[]) ebillAmountComponent$convertToUiState$1.L$3;
                TextValueUIState[] textValueUIStateArr11 = (TextValueUIState[]) ebillAmountComponent$convertToUiState$1.L$2;
                ElectricityBillAppModel electricityBillAppModel4 = (ElectricityBillAppModel) ebillAmountComponent$convertToUiState$1.L$1;
                EBillAmountDataState eBillAmountDataState21 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj6);
                electricityBillAppModel2 = electricityBillAppModel4;
                textValueUIStateArr4 = textValueUIStateArr10;
                black_87 = black_87;
                black_72 = black_73;
                i4 = i9;
                chaloPadding4 = chaloPadding7;
                stringProvider = stringProvider2;
                enterAmountCardUIState5 = enterAmountCardUIState21;
                textValueUIStateArr3 = textValueUIStateArr11;
                toolbarUIState5 = toolbarUIState10;
                customerInfoUIState = customerInfoUIState4;
                eBillAmountDataState10 = eBillAmountDataState21;
                objB7 = obj6;
                String str19 = (String) objB7;
                UITextStyle uITextStyle11114 = UITextStyle.BodyMedium;
                textValueUIStateArr5 = textValueUIStateArr3;
                textValueUIStateArr4[i4] = new TextValueUIState(new TextUIState.ChaloTextUIState(str19, uITextStyle11114, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle11114, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                ebillAmountComponent$convertToUiState$1.L$0 = eBillAmountDataState10;
                ebillAmountComponent$convertToUiState$1.L$1 = textValueUIStateArr5;
                ebillAmountComponent$convertToUiState$1.L$2 = textValueUIStateArr5;
                ebillAmountComponent$convertToUiState$1.L$3 = chaloPadding4;
                ebillAmountComponent$convertToUiState$1.L$4 = toolbarUIState5;
                ebillAmountComponent$convertToUiState$1.L$5 = enterAmountCardUIState5;
                ebillAmountComponent$convertToUiState$1.L$6 = customerInfoUIState;
                ebillAmountComponent$convertToUiState$1.L$7 = null;
                ebillAmountComponent$convertToUiState$1.I$0 = 2;
                ebillAmountComponent$convertToUiState$1.F$0 = f;
                ebillAmountComponent$convertToUiState$1.label = 9;
                objB8 = stringProvider.b(StringEnum.DUE_AMOUNT, new Object[0], ebillAmountComponent$convertToUiState$1);
                if (objB8 != coroutineSingletons) {
                    textValueUIStateArr6 = textValueUIStateArr5;
                    textValueUIStateArr7 = textValueUIStateArr6;
                    f2 = f;
                    eBillAmountDataState11 = eBillAmountDataState10;
                    enterAmountCardUIState6 = enterAmountCardUIState5;
                    customerInfoUIState2 = customerInfoUIState;
                    toolbarUIState6 = toolbarUIState5;
                    chaloPadding5 = chaloPadding4;
                    obj6 = objB8;
                    i5 = 2;
                    UITextStyle uITextStyle11115 = UITextStyle.HeadlineMedium;
                    ChaloColorToken.Black_87 black_8112 = black_87;
                    textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle11115, black_8112, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle11115, black_8112, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                    enterAmountCardUIState2 = enterAmountCardUIState6;
                    toolbarUIState4 = toolbarUIState6;
                    return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
                }
                return coroutineSingletons;
            case 9:
                f2 = ebillAmountComponent$convertToUiState$1.F$0;
                int i10 = ebillAmountComponent$convertToUiState$1.I$0;
                customerInfoUIState2 = (CustomerInfoUIState) ebillAmountComponent$convertToUiState$1.L$6;
                enterAmountCardUIState6 = (EnterAmountCardUIState) ebillAmountComponent$convertToUiState$1.L$5;
                toolbarUIState6 = (ToolbarUIState) ebillAmountComponent$convertToUiState$1.L$4;
                chaloPadding5 = (ChaloPadding) ebillAmountComponent$convertToUiState$1.L$3;
                TextValueUIState[] textValueUIStateArr12 = (TextValueUIState[]) ebillAmountComponent$convertToUiState$1.L$2;
                TextValueUIState[] textValueUIStateArr13 = (TextValueUIState[]) ebillAmountComponent$convertToUiState$1.L$1;
                eBillAmountDataState11 = (EBillAmountDataState) ebillAmountComponent$convertToUiState$1.L$0;
                ResultKt.b(obj6);
                i5 = i10;
                textValueUIStateArr6 = textValueUIStateArr12;
                textValueUIStateArr7 = textValueUIStateArr13;
                black_87 = black_87;
                UITextStyle uITextStyle11116 = UITextStyle.HeadlineMedium;
                ChaloColorToken.Black_87 black_8113 = black_87;
                textValueUIStateArr6[i5] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj6, uITextStyle11116, black_8113, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(currencyFeature.a(eBillAmountDataState11.b.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle11116, black_8113, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                transactionInfoUIState = new TransactionInfoUIState(f2, chaloPadding5, CollectionsKt.S(textValueUIStateArr7), 1);
                enterAmountCardUIState2 = enterAmountCardUIState6;
                toolbarUIState4 = toolbarUIState6;
                return new EBillAmountViewState(toolbarUIState4, enterAmountCardUIState2, customerInfoUIState2, transactionInfoUIState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void G0(EBillAmountIntent eBillAmountIntent) {
        Object objB;
        ChaloUseCaseResult failure;
        C0(eBillAmountIntent);
        boolean z = eBillAmountIntent instanceof EBillAmountIntent.AmountEnteredIntent;
        StateFlow stateFlow = this.f;
        EBillAmountUseCase eBillAmountUseCase = this.m;
        if (z) {
            EBillAmountIntent.AmountEnteredIntent amountEnteredIntent = (EBillAmountIntent.AmountEnteredIntent) eBillAmountIntent;
            ElectricityBillAppModel electricityBillAppModel = ((EBillAmountDataState) stateFlow.getValue()).b;
            String enteredAmountString = amountEnteredIntent.f2549a;
            eBillAmountUseCase.getClass();
            Intrinsics.i(enteredAmountString, "enteredAmountString");
            if (electricityBillAppModel == null) {
                failure = new ChaloUseCaseResult.Failure(new EBillAmountException("Amount should be more than 0"));
            } else {
                int i = electricityBillAppModel.f;
                int iB = enteredAmountString.length() != 0 ? (int) eBillAmountUseCase.f2543a.b(enteredAmountString) : -1;
                if (1 <= iB && iB < 1700001 && i <= iB) {
                    failure = new ChaloUseCaseResult.Success(enteredAmountString);
                } else if (iB <= 0) {
                    failure = new ChaloUseCaseResult.Failure(new EBillAmountException("Amount should be more than 0"));
                } else if (iB < i) {
                    failure = new ChaloUseCaseResult.Failure(new EBillAmountException("Amount should be more than due amount"));
                } else {
                    failure = iB > 1700000 ? new ChaloUseCaseResult.Failure(new EBillAmountException("Amount cannot be greater than Rs 17000")) : new ChaloUseCaseResult.Success(enteredAmountString);
                }
            }
            if (failure instanceof ChaloUseCaseResult.Success) {
                E0(new yg((ChaloUseCaseResult.Success) failure, 4));
                return;
            } else {
                if (!(failure instanceof ChaloUseCaseResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new wn(21, (ChaloUseCaseResult.Failure) failure, amountEnteredIntent));
                return;
            }
        }
        boolean zEquals = eBillAmountIntent.equals(EBillAmountIntent.NextBtnClickIntent.f2550a);
        ChaloNavigationManager chaloNavigationManager = this.o;
        if (!zEquals) {
            if (!(eBillAmountIntent instanceof EBillAmountIntent.StartingIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContract.DefaultImpls.a(this.n, "eBill amount screen opend", "", null, null, false, 28);
            ChaloJson chaloJson = ChaloJson.f6455a;
            String str = ((EBillAmountIntent.StartingIntent) eBillAmountIntent).f2551a;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, ElectricityBillAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            ElectricityBillAppModel electricityBillAppModel2 = (ElectricityBillAppModel) objB;
            if (electricityBillAppModel2 != null) {
                E0(new wn(22, electricityBillAppModel2, this.l.a(electricityBillAppModel2.g, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
                return;
            } else {
                gf.u(null, chaloNavigationManager);
                return;
            }
        }
        ElectricityBillAppModel electricityBillAppModel3 = ((EBillAmountDataState) stateFlow.getValue()).b;
        String str2 = ((EBillAmountDataState) stateFlow.getValue()).c;
        if (electricityBillAppModel3 == null || str2 == null) {
            hq0.s(this.r, "Null values when trying to proceed with payment");
            return;
        }
        eBillAmountUseCase.getClass();
        int iB2 = str2.length() != 0 ? (int) eBillAmountUseCase.f2543a.b(str2) : -1;
        long j = electricityBillAppModel3.f2538a;
        long j2 = electricityBillAppModel3.b;
        String consumerNumber = electricityBillAppModel3.c;
        String customerName = electricityBillAppModel3.d;
        boolean z2 = electricityBillAppModel3.e;
        int i2 = electricityBillAppModel3.f;
        String str3 = electricityBillAppModel3.h;
        Intrinsics.i(consumerNumber, "consumerNumber");
        Intrinsics.i(customerName, "customerName");
        ElectricityBillAppModel electricityBillAppModel4 = new ElectricityBillAppModel(j, j2, consumerNumber, customerName, z2, i2, iB2, str3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
        MixpanelUtil.a(linkedHashMap, electricityBillAppModel4);
        AnalyticsContract.DefaultImpls.a(this.n, "eBill amount screen next btn clicked", "", linkedHashMap, null, false, 24);
        Json json2 = ChaloJson.b;
        json2.getClass();
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new EBillPaymentConfirmationArgs(json2.a(ElectricityBillAppModel.INSTANCE.serializer(), electricityBillAppModel4)), null, null, 6));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new EBillAmountDataState(false, null, null, null);
    }
}
