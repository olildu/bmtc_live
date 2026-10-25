package app.chalo.electricitybill.ui.invoice;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TextValueUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillPaymentInvoiceScreenArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import defpackage.qp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewIntent;", "Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceDataState;", "Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceViewState;", "Lapp/chalo/electricitybill/ui/invoice/EBillPaymentInvoiceSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillPaymentInvoiceComponent extends ChaloBaseStateMviComponent<EBillPaymentInvoiceViewIntent, EBillPaymentInvoiceDataState, EBillPaymentInvoiceViewState, EBillPaymentInvoiceSideEffect> {
    public final AnalyticsContract k;
    public final ChaloNavigationManager l;
    public final StringProvider m;

    public EBillPaymentInvoiceComponent(ComponentContext componentContext, EBillPaymentInvoiceScreenArgs eBillPaymentInvoiceScreenArgs, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider) {
        Object objB;
        super(componentContext);
        this.k = analyticsContract;
        this.l = chaloNavigationManager;
        this.m = stringProvider;
        String str = eBillPaymentInvoiceScreenArgs.b;
        C0(new EBillPaymentInvoiceViewIntent.InitialIntent(str));
        AnalyticsContract.DefaultImpls.a(analyticsContract, "eBill payment invoice screen opened", "", null, null, false, 28);
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str, ElectricityBillPaymentHistoryUiModel.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel = (ElectricityBillPaymentHistoryUiModel) objB;
        if (electricityBillPaymentHistoryUiModel != null) {
            E0(new qp(electricityBillPaymentHistoryUiModel, 22));
        } else {
            gf.u(null, this.l);
        }
    }

    public static TextValueUIState H0(String str, String str2) {
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
        return new TextValueUIState(new TextUIState.ChaloTextUIState(str, uITextStyle, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str2, uITextStyle, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(EBillPaymentInvoiceDataState eBillPaymentInvoiceDataState, ContinuationImpl continuationImpl) {
        EBillPaymentInvoiceComponent$convertToUiState$1 eBillPaymentInvoiceComponent$convertToUiState$1;
        EBillPaymentInvoiceDataState eBillPaymentInvoiceDataState2;
        ToolbarUIState toolbarUIState;
        ElectricityBillPaymentInvoiceUIState electricityBillPaymentInvoiceUIState;
        ToolbarUIState toolbarUIState2;
        if (continuationImpl instanceof EBillPaymentInvoiceComponent$convertToUiState$1) {
            eBillPaymentInvoiceComponent$convertToUiState$1 = (EBillPaymentInvoiceComponent$convertToUiState$1) continuationImpl;
            int i = eBillPaymentInvoiceComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillPaymentInvoiceComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillPaymentInvoiceComponent$convertToUiState$1 = new EBillPaymentInvoiceComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentInvoiceComponent$convertToUiState$1 = new EBillPaymentInvoiceComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB = eBillPaymentInvoiceComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillPaymentInvoiceComponent$convertToUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            eBillPaymentInvoiceComponent$convertToUiState$1.L$0 = eBillPaymentInvoiceDataState;
            eBillPaymentInvoiceComponent$convertToUiState$1.label = 1;
            objB = this.m.b(StringEnum.PAYMENT_INVOICE, new Object[0], eBillPaymentInvoiceComponent$convertToUiState$1);
            if (objB != obj) {
                eBillPaymentInvoiceDataState2 = eBillPaymentInvoiceDataState;
            }
            return obj;
        }
        if (i2 == 1) {
            eBillPaymentInvoiceDataState2 = (EBillPaymentInvoiceDataState) eBillPaymentInvoiceComponent$convertToUiState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toolbarUIState2 = (ToolbarUIState) eBillPaymentInvoiceComponent$convertToUiState$1.L$0;
            ResultKt.b(objB);
        }
        electricityBillPaymentInvoiceUIState = (ElectricityBillPaymentInvoiceUIState) objB;
        toolbarUIState = toolbarUIState2;
        return new EBillPaymentInvoiceViewState(toolbarUIState, electricityBillPaymentInvoiceUIState);
        toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, null, null, 253);
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel = eBillPaymentInvoiceDataState2.f2588a;
        if (electricityBillPaymentHistoryUiModel != null) {
            eBillPaymentInvoiceComponent$convertToUiState$1.L$0 = toolbarUIState;
            eBillPaymentInvoiceComponent$convertToUiState$1.label = 2;
            objB = G0(electricityBillPaymentHistoryUiModel, eBillPaymentInvoiceComponent$convertToUiState$1);
            if (objB != obj) {
                toolbarUIState2 = toolbarUIState;
                electricityBillPaymentInvoiceUIState = (ElectricityBillPaymentInvoiceUIState) objB;
                toolbarUIState = toolbarUIState2;
            }
            return obj;
        }
        electricityBillPaymentInvoiceUIState = null;
        return new EBillPaymentInvoiceViewState(toolbarUIState, electricityBillPaymentInvoiceUIState);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0176  */
    /* JADX WARN: Code duplicated, block: B:28:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x020b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0241  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object G0(ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel, ContinuationImpl continuationImpl) {
        EBillPaymentInvoiceComponent$getInvoiceScreenUIState$1 eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        int i;
        StringProvider stringProvider;
        float f;
        Object objB;
        CustomerInfoUIState customerInfoUIState;
        TextValueUIState[] textValueUIStateArr;
        Object objB2;
        float f2;
        int i2;
        CustomerInfoUIState customerInfoUIState2;
        TextValueUIState[] textValueUIStateArr2;
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel2;
        EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent;
        Object objB3;
        EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent2;
        TextValueUIState[] textValueUIStateArr3;
        int i3;
        CustomerInfoUIState customerInfoUIState3;
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel3;
        float f3;
        TextValueUIState[] textValueUIStateArr4;
        EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent3;
        CustomerInfoUIState customerInfoUIState4;
        int i4;
        TextValueUIState[] textValueUIStateArr5;
        int i5;
        EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent4;
        TextValueUIState[] textValueUIStateArr6;
        CustomerInfoUIState customerInfoUIState5;
        TextValueUIState[] textValueUIStateArr7;
        TransactionInfoUIState transactionInfoUIState;
        TransactionInfoUIState transactionInfoUIState2;
        CustomerInfoUIState customerInfoUIState6;
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel4;
        float f4;
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel5 = electricityBillPaymentHistoryUiModel;
        if (continuationImpl instanceof EBillPaymentInvoiceComponent$getInvoiceScreenUIState$1) {
            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1 = (EBillPaymentInvoiceComponent$getInvoiceScreenUIState$1) continuationImpl;
            int i6 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = i6 - Integer.MIN_VALUE;
            } else {
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1 = new EBillPaymentInvoiceComponent$getInvoiceScreenUIState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1 = new EBillPaymentInvoiceComponent$getInvoiceScreenUIState$1(this, continuationImpl);
        }
        Object objB4 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        StringProvider stringProvider2 = this.m;
        switch (i7) {
            case 0:
                ResultKt.b(objB4);
                i = 0;
                stringProvider = stringProvider2;
                f = 0.0f;
                chaloTextUIState = new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel5.f, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                StringEnum stringEnum = StringEnum.EBILL_CONSUMER_NUMBER;
                Object[] objArr = {electricityBillPaymentHistoryUiModel5.f2606a};
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel5;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = chaloTextUIState;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = 0.0f;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 1;
                objB = stringProvider.b(stringEnum, objArr, eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                if (objB != coroutineSingletons) {
                    customerInfoUIState = new CustomerInfoUIState(null, chaloTextUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 7);
                    textValueUIStateArr = new TextValueUIState[4];
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel5;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = i;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 2;
                    objB2 = stringProvider.b(StringEnum.TRANSACTION_ID, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                    if (objB2 != coroutineSingletons) {
                        f2 = f;
                        i2 = i;
                        customerInfoUIState2 = customerInfoUIState;
                        textValueUIStateArr2 = textValueUIStateArr;
                        electricityBillPaymentHistoryUiModel2 = electricityBillPaymentHistoryUiModel5;
                        eBillPaymentInvoiceComponent = this;
                        String str = electricityBillPaymentHistoryUiModel2.j;
                        eBillPaymentInvoiceComponent.getClass();
                        textValueUIStateArr[i2] = H0((String) objB2, str);
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel2;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr2;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState2;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr2;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f2;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 1;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 3;
                        objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                        if (objB3 != coroutineSingletons) {
                            eBillPaymentInvoiceComponent2 = this;
                            textValueUIStateArr3 = textValueUIStateArr2;
                            i3 = 1;
                            customerInfoUIState3 = customerInfoUIState2;
                            objB4 = objB3;
                            electricityBillPaymentHistoryUiModel3 = electricityBillPaymentHistoryUiModel2;
                            f3 = f2;
                            textValueUIStateArr4 = textValueUIStateArr3;
                            String strName = electricityBillPaymentHistoryUiModel3.i.name();
                            eBillPaymentInvoiceComponent2.getClass();
                            textValueUIStateArr3[i3] = H0((String) objB4, strName);
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState3;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 2;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 4;
                            objB4 = stringProvider.b(StringEnum.BILL_DATE, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                            if (objB4 != coroutineSingletons) {
                                eBillPaymentInvoiceComponent3 = this;
                                customerInfoUIState4 = customerInfoUIState3;
                                i4 = 2;
                                textValueUIStateArr5 = textValueUIStateArr4;
                                String str2 = electricityBillPaymentHistoryUiModel3.c;
                                eBillPaymentInvoiceComponent3.getClass();
                                textValueUIStateArr5[i4] = H0((String) objB4, str2);
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState4;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                                i5 = 3;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 3;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 5;
                                objB4 = stringProvider.b(StringEnum.PAID_ON, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                                if (objB4 != coroutineSingletons) {
                                    eBillPaymentInvoiceComponent4 = this;
                                    textValueUIStateArr6 = textValueUIStateArr4;
                                    customerInfoUIState5 = customerInfoUIState4;
                                    textValueUIStateArr7 = textValueUIStateArr6;
                                    String str3 = electricityBillPaymentHistoryUiModel3.d;
                                    eBillPaymentInvoiceComponent4.getClass();
                                    textValueUIStateArr6[i5] = H0((String) objB4, str3);
                                    transactionInfoUIState = new TransactionInfoUIState(f3, null, CollectionsKt.S(textValueUIStateArr7), 7);
                                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = customerInfoUIState5;
                                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = transactionInfoUIState;
                                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = null;
                                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = null;
                                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = 0.0f;
                                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 6;
                                    objB4 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                                    if (objB4 != coroutineSingletons) {
                                        transactionInfoUIState2 = transactionInfoUIState;
                                        customerInfoUIState6 = customerInfoUIState5;
                                        electricityBillPaymentHistoryUiModel4 = electricityBillPaymentHistoryUiModel3;
                                        f4 = 0.0f;
                                        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
                                        return new ElectricityBillPaymentInvoiceUIState(customerInfoUIState6, transactionInfoUIState2, new TransactionInfoUIState(f4, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB4, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel4.b, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7), new DividerUIState(0.0f, null, null, 7));
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1;
                ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel6 = (ElectricityBillPaymentHistoryUiModel) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0;
                ResultKt.b(objB4);
                chaloTextUIState = chaloTextUIState2;
                objB = objB4;
                electricityBillPaymentHistoryUiModel5 = electricityBillPaymentHistoryUiModel6;
                stringProvider = stringProvider2;
                f = 0.0f;
                i = 0;
                customerInfoUIState = new CustomerInfoUIState(null, chaloTextUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 7);
                textValueUIStateArr = new TextValueUIState[4];
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel5;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = i;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 2;
                objB2 = stringProvider.b(StringEnum.TRANSACTION_ID, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                if (objB2 != coroutineSingletons) {
                    f2 = f;
                    i2 = i;
                    customerInfoUIState2 = customerInfoUIState;
                    textValueUIStateArr2 = textValueUIStateArr;
                    electricityBillPaymentHistoryUiModel2 = electricityBillPaymentHistoryUiModel5;
                    eBillPaymentInvoiceComponent = this;
                    String str4 = electricityBillPaymentHistoryUiModel2.j;
                    eBillPaymentInvoiceComponent.getClass();
                    textValueUIStateArr[i2] = H0((String) objB2, str4);
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel2;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr2;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState2;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr2;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f2;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 1;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                    if (objB3 != coroutineSingletons) {
                        eBillPaymentInvoiceComponent2 = this;
                        textValueUIStateArr3 = textValueUIStateArr2;
                        i3 = 1;
                        customerInfoUIState3 = customerInfoUIState2;
                        objB4 = objB3;
                        electricityBillPaymentHistoryUiModel3 = electricityBillPaymentHistoryUiModel2;
                        f3 = f2;
                        textValueUIStateArr4 = textValueUIStateArr3;
                        String strName2 = electricityBillPaymentHistoryUiModel3.i.name();
                        eBillPaymentInvoiceComponent2.getClass();
                        textValueUIStateArr3[i3] = H0((String) objB4, strName2);
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState3;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 2;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 4;
                        objB4 = stringProvider.b(StringEnum.BILL_DATE, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                        if (objB4 != coroutineSingletons) {
                            eBillPaymentInvoiceComponent3 = this;
                            customerInfoUIState4 = customerInfoUIState3;
                            i4 = 2;
                            textValueUIStateArr5 = textValueUIStateArr4;
                            String str5 = electricityBillPaymentHistoryUiModel3.c;
                            eBillPaymentInvoiceComponent3.getClass();
                            textValueUIStateArr5[i4] = H0((String) objB4, str5);
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState4;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                            i5 = 3;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 3;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 5;
                            objB4 = stringProvider.b(StringEnum.PAID_ON, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                            if (objB4 != coroutineSingletons) {
                                eBillPaymentInvoiceComponent4 = this;
                                textValueUIStateArr6 = textValueUIStateArr4;
                                customerInfoUIState5 = customerInfoUIState4;
                                textValueUIStateArr7 = textValueUIStateArr6;
                                String str6 = electricityBillPaymentHistoryUiModel3.d;
                                eBillPaymentInvoiceComponent4.getClass();
                                textValueUIStateArr6[i5] = H0((String) objB4, str6);
                                transactionInfoUIState = new TransactionInfoUIState(f3, null, CollectionsKt.S(textValueUIStateArr7), 7);
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = customerInfoUIState5;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = transactionInfoUIState;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = null;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = null;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = 0.0f;
                                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 6;
                                objB4 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                                if (objB4 != coroutineSingletons) {
                                    transactionInfoUIState2 = transactionInfoUIState;
                                    customerInfoUIState6 = customerInfoUIState5;
                                    electricityBillPaymentHistoryUiModel4 = electricityBillPaymentHistoryUiModel3;
                                    f4 = 0.0f;
                                    UITextStyle uITextStyle2 = UITextStyle.DisplaySmall;
                                    return new ElectricityBillPaymentInvoiceUIState(customerInfoUIState6, transactionInfoUIState2, new TransactionInfoUIState(f4, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB4, uITextStyle2, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel4.b, uITextStyle2, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7), new DividerUIState(0.0f, null, null, 7));
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                int i8 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0;
                float f5 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0;
                EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent5 = (EBillPaymentInvoiceComponent) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4;
                TextValueUIState[] textValueUIStateArr8 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3;
                CustomerInfoUIState customerInfoUIState7 = (CustomerInfoUIState) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2;
                TextValueUIState[] textValueUIStateArr9 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1;
                electricityBillPaymentHistoryUiModel2 = (ElectricityBillPaymentHistoryUiModel) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0;
                ResultKt.b(objB4);
                objB2 = objB4;
                textValueUIStateArr2 = textValueUIStateArr9;
                customerInfoUIState2 = customerInfoUIState7;
                textValueUIStateArr = textValueUIStateArr8;
                i2 = i8;
                eBillPaymentInvoiceComponent = eBillPaymentInvoiceComponent5;
                stringProvider = stringProvider2;
                f2 = f5;
                i = 0;
                String str7 = electricityBillPaymentHistoryUiModel2.j;
                eBillPaymentInvoiceComponent.getClass();
                textValueUIStateArr[i2] = H0((String) objB2, str7);
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel2;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr2;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState2;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr2;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f2;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 1;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 3;
                objB3 = stringProvider.b(StringEnum.PAYMENT_STATUS, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                if (objB3 != coroutineSingletons) {
                    eBillPaymentInvoiceComponent2 = this;
                    textValueUIStateArr3 = textValueUIStateArr2;
                    i3 = 1;
                    customerInfoUIState3 = customerInfoUIState2;
                    objB4 = objB3;
                    electricityBillPaymentHistoryUiModel3 = electricityBillPaymentHistoryUiModel2;
                    f3 = f2;
                    textValueUIStateArr4 = textValueUIStateArr3;
                    String strName3 = electricityBillPaymentHistoryUiModel3.i.name();
                    eBillPaymentInvoiceComponent2.getClass();
                    textValueUIStateArr3[i3] = H0((String) objB4, strName3);
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState3;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 2;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 4;
                    objB4 = stringProvider.b(StringEnum.BILL_DATE, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                    if (objB4 != coroutineSingletons) {
                        eBillPaymentInvoiceComponent3 = this;
                        customerInfoUIState4 = customerInfoUIState3;
                        i4 = 2;
                        textValueUIStateArr5 = textValueUIStateArr4;
                        String str8 = electricityBillPaymentHistoryUiModel3.c;
                        eBillPaymentInvoiceComponent3.getClass();
                        textValueUIStateArr5[i4] = H0((String) objB4, str8);
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState4;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                        i5 = 3;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 3;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 5;
                        objB4 = stringProvider.b(StringEnum.PAID_ON, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                        if (objB4 != coroutineSingletons) {
                            eBillPaymentInvoiceComponent4 = this;
                            textValueUIStateArr6 = textValueUIStateArr4;
                            customerInfoUIState5 = customerInfoUIState4;
                            textValueUIStateArr7 = textValueUIStateArr6;
                            String str9 = electricityBillPaymentHistoryUiModel3.d;
                            eBillPaymentInvoiceComponent4.getClass();
                            textValueUIStateArr6[i5] = H0((String) objB4, str9);
                            transactionInfoUIState = new TransactionInfoUIState(f3, null, CollectionsKt.S(textValueUIStateArr7), 7);
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = customerInfoUIState5;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = transactionInfoUIState;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = null;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = null;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = 0.0f;
                            eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 6;
                            objB4 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                            if (objB4 != coroutineSingletons) {
                                transactionInfoUIState2 = transactionInfoUIState;
                                customerInfoUIState6 = customerInfoUIState5;
                                electricityBillPaymentHistoryUiModel4 = electricityBillPaymentHistoryUiModel3;
                                f4 = 0.0f;
                                UITextStyle uITextStyle3 = UITextStyle.DisplaySmall;
                                return new ElectricityBillPaymentInvoiceUIState(customerInfoUIState6, transactionInfoUIState2, new TransactionInfoUIState(f4, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB4, uITextStyle3, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel4.b, uITextStyle3, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7), new DividerUIState(0.0f, null, null, 7));
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                int i9 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0;
                f3 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0;
                EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent6 = (EBillPaymentInvoiceComponent) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4;
                textValueUIStateArr3 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3;
                CustomerInfoUIState customerInfoUIState8 = (CustomerInfoUIState) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2;
                TextValueUIState[] textValueUIStateArr10 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1;
                ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel7 = (ElectricityBillPaymentHistoryUiModel) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0;
                ResultKt.b(objB4);
                electricityBillPaymentHistoryUiModel3 = electricityBillPaymentHistoryUiModel7;
                i3 = i9;
                customerInfoUIState3 = customerInfoUIState8;
                eBillPaymentInvoiceComponent2 = eBillPaymentInvoiceComponent6;
                textValueUIStateArr4 = textValueUIStateArr10;
                stringProvider = stringProvider2;
                i = 0;
                String strName4 = electricityBillPaymentHistoryUiModel3.i.name();
                eBillPaymentInvoiceComponent2.getClass();
                textValueUIStateArr3[i3] = H0((String) objB4, strName4);
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState3;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 2;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 4;
                objB4 = stringProvider.b(StringEnum.BILL_DATE, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                if (objB4 != coroutineSingletons) {
                    eBillPaymentInvoiceComponent3 = this;
                    customerInfoUIState4 = customerInfoUIState3;
                    i4 = 2;
                    textValueUIStateArr5 = textValueUIStateArr4;
                    String str10 = electricityBillPaymentHistoryUiModel3.c;
                    eBillPaymentInvoiceComponent3.getClass();
                    textValueUIStateArr5[i4] = H0((String) objB4, str10);
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState4;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                    i5 = 3;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 3;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 5;
                    objB4 = stringProvider.b(StringEnum.PAID_ON, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                    if (objB4 != coroutineSingletons) {
                        eBillPaymentInvoiceComponent4 = this;
                        textValueUIStateArr6 = textValueUIStateArr4;
                        customerInfoUIState5 = customerInfoUIState4;
                        textValueUIStateArr7 = textValueUIStateArr6;
                        String str11 = electricityBillPaymentHistoryUiModel3.d;
                        eBillPaymentInvoiceComponent4.getClass();
                        textValueUIStateArr6[i5] = H0((String) objB4, str11);
                        transactionInfoUIState = new TransactionInfoUIState(f3, null, CollectionsKt.S(textValueUIStateArr7), 7);
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = customerInfoUIState5;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = transactionInfoUIState;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = null;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = null;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = 0.0f;
                        eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 6;
                        objB4 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                        if (objB4 != coroutineSingletons) {
                            transactionInfoUIState2 = transactionInfoUIState;
                            customerInfoUIState6 = customerInfoUIState5;
                            electricityBillPaymentHistoryUiModel4 = electricityBillPaymentHistoryUiModel3;
                            f4 = 0.0f;
                            UITextStyle uITextStyle4 = UITextStyle.DisplaySmall;
                            return new ElectricityBillPaymentInvoiceUIState(customerInfoUIState6, transactionInfoUIState2, new TransactionInfoUIState(f4, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB4, uITextStyle4, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel4.b, uITextStyle4, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7), new DividerUIState(0.0f, null, null, 7));
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                i4 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0;
                f3 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0;
                EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent7 = (EBillPaymentInvoiceComponent) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4;
                TextValueUIState[] textValueUIStateArr11 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3;
                CustomerInfoUIState customerInfoUIState9 = (CustomerInfoUIState) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2;
                TextValueUIState[] textValueUIStateArr12 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1;
                electricityBillPaymentHistoryUiModel3 = (ElectricityBillPaymentHistoryUiModel) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0;
                ResultKt.b(objB4);
                textValueUIStateArr5 = textValueUIStateArr11;
                textValueUIStateArr4 = textValueUIStateArr12;
                customerInfoUIState4 = customerInfoUIState9;
                eBillPaymentInvoiceComponent3 = eBillPaymentInvoiceComponent7;
                stringProvider = stringProvider2;
                i = 0;
                String str12 = electricityBillPaymentHistoryUiModel3.c;
                eBillPaymentInvoiceComponent3.getClass();
                textValueUIStateArr5[i4] = H0((String) objB4, str12);
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = textValueUIStateArr4;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = customerInfoUIState4;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = textValueUIStateArr4;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = this;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = f3;
                i5 = 3;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0 = 3;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 5;
                objB4 = stringProvider.b(StringEnum.PAID_ON, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                if (objB4 != coroutineSingletons) {
                    eBillPaymentInvoiceComponent4 = this;
                    textValueUIStateArr6 = textValueUIStateArr4;
                    customerInfoUIState5 = customerInfoUIState4;
                    textValueUIStateArr7 = textValueUIStateArr6;
                    String str13 = electricityBillPaymentHistoryUiModel3.d;
                    eBillPaymentInvoiceComponent4.getClass();
                    textValueUIStateArr6[i5] = H0((String) objB4, str13);
                    transactionInfoUIState = new TransactionInfoUIState(f3, null, CollectionsKt.S(textValueUIStateArr7), 7);
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = customerInfoUIState5;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = transactionInfoUIState;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = null;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = null;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = 0.0f;
                    eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 6;
                    objB4 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                    if (objB4 != coroutineSingletons) {
                        transactionInfoUIState2 = transactionInfoUIState;
                        customerInfoUIState6 = customerInfoUIState5;
                        electricityBillPaymentHistoryUiModel4 = electricityBillPaymentHistoryUiModel3;
                        f4 = 0.0f;
                        UITextStyle uITextStyle5 = UITextStyle.DisplaySmall;
                        return new ElectricityBillPaymentInvoiceUIState(customerInfoUIState6, transactionInfoUIState2, new TransactionInfoUIState(f4, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB4, uITextStyle5, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel4.b, uITextStyle5, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7), new DividerUIState(0.0f, null, null, 7));
                    }
                }
                return coroutineSingletons;
            case 5:
                int i10 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.I$0;
                f3 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0;
                EBillPaymentInvoiceComponent eBillPaymentInvoiceComponent8 = (EBillPaymentInvoiceComponent) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4;
                TextValueUIState[] textValueUIStateArr13 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3;
                customerInfoUIState5 = (CustomerInfoUIState) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2;
                TextValueUIState[] textValueUIStateArr14 = (TextValueUIState[]) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1;
                ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel8 = (ElectricityBillPaymentHistoryUiModel) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0;
                ResultKt.b(objB4);
                eBillPaymentInvoiceComponent4 = eBillPaymentInvoiceComponent8;
                electricityBillPaymentHistoryUiModel3 = electricityBillPaymentHistoryUiModel8;
                i = 0;
                textValueUIStateArr7 = textValueUIStateArr14;
                textValueUIStateArr6 = textValueUIStateArr13;
                i5 = i10;
                stringProvider = stringProvider2;
                String str14 = electricityBillPaymentHistoryUiModel3.d;
                eBillPaymentInvoiceComponent4.getClass();
                textValueUIStateArr6[i5] = H0((String) objB4, str14);
                transactionInfoUIState = new TransactionInfoUIState(f3, null, CollectionsKt.S(textValueUIStateArr7), 7);
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0 = electricityBillPaymentHistoryUiModel3;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1 = customerInfoUIState5;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2 = transactionInfoUIState;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$3 = null;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$4 = null;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0 = 0.0f;
                eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.label = 6;
                objB4 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[i], eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1);
                if (objB4 != coroutineSingletons) {
                    transactionInfoUIState2 = transactionInfoUIState;
                    customerInfoUIState6 = customerInfoUIState5;
                    electricityBillPaymentHistoryUiModel4 = electricityBillPaymentHistoryUiModel3;
                    f4 = 0.0f;
                    UITextStyle uITextStyle6 = UITextStyle.DisplaySmall;
                    return new ElectricityBillPaymentInvoiceUIState(customerInfoUIState6, transactionInfoUIState2, new TransactionInfoUIState(f4, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB4, uITextStyle6, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel4.b, uITextStyle6, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7), new DividerUIState(0.0f, null, null, 7));
                }
                return coroutineSingletons;
            case 6:
                f4 = eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.F$0;
                transactionInfoUIState2 = (TransactionInfoUIState) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$2;
                customerInfoUIState6 = (CustomerInfoUIState) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$1;
                electricityBillPaymentHistoryUiModel4 = (ElectricityBillPaymentHistoryUiModel) eBillPaymentInvoiceComponent$getInvoiceScreenUIState$1.L$0;
                ResultKt.b(objB4);
                UITextStyle uITextStyle7 = UITextStyle.DisplaySmall;
                return new ElectricityBillPaymentInvoiceUIState(customerInfoUIState6, transactionInfoUIState2, new TransactionInfoUIState(f4, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB4, uITextStyle7, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel4.b, uITextStyle7, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7), new DividerUIState(0.0f, null, null, 7));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new EBillPaymentInvoiceDataState(null);
    }
}
