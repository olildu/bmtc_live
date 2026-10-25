package app.chalo.electricitybill.ui.ebillpaymentsuccess;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessComponent;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessIntent;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentStatus;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.EBillPaymentInvoiceScreenArgs;
import app.chalo.scenes.args.EBillPaymentSuccessArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.wn;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessIntent;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessDataState;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessViewState;", "Lapp/chalo/electricitybill/ui/ebillpaymentsuccess/EBillPaymentSuccessSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillPaymentSuccessComponent extends ChaloBaseStateMviComponent<EBillPaymentSuccessIntent, EBillPaymentSuccessDataState, EBillPaymentSuccessViewState, EBillPaymentSuccessSideEffect> {
    public final StringProvider k;
    public final AnalyticsContract l;
    public final ChaloNavigationManager m;
    public final CityProvider n;
    public final CurrencyFeature o;
    public final TimeUtilsContract p;

    public EBillPaymentSuccessComponent(ComponentContext componentContext, EBillPaymentSuccessArgs eBillPaymentSuccessArgs, StringProvider stringProvider, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, CityProvider cityProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract) {
        super(componentContext);
        this.k = stringProvider;
        this.l = analyticsContract;
        this.m = chaloNavigationManager;
        this.n = cityProvider;
        this.o = currencyFeature;
        this.p = timeUtilsContract;
        G0(new EBillPaymentSuccessIntent.StartingIntent(eBillPaymentSuccessArgs.b, eBillPaymentSuccessArgs.c));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object F0(ContinuationImpl continuationImpl) {
        EBillPaymentSuccessComponent$convertToUiState$1 eBillPaymentSuccessComponent$convertToUiState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ButtonUIStateFactory buttonUIStateFactory;
        ButtonUIState buttonUIStateG;
        Object objB;
        ButtonUIState buttonUIState;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        if (continuationImpl instanceof EBillPaymentSuccessComponent$convertToUiState$1) {
            eBillPaymentSuccessComponent$convertToUiState$1 = (EBillPaymentSuccessComponent$convertToUiState$1) continuationImpl;
            int i = eBillPaymentSuccessComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillPaymentSuccessComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillPaymentSuccessComponent$convertToUiState$1 = new EBillPaymentSuccessComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentSuccessComponent$convertToUiState$1 = new EBillPaymentSuccessComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB2 = eBillPaymentSuccessComponent$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillPaymentSuccessComponent$convertToUiState$1.label;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        StringProvider stringProvider = this.k;
        if (i2 == 0) {
            ResultKt.b(objB2);
            eBillPaymentSuccessComponent$convertToUiState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.EBILL_PAYMENT_SUCCESS_TITLE, new Object[0], eBillPaymentSuccessComponent$convertToUiState$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) eBillPaymentSuccessComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
                eBillPaymentSuccessComponent$convertToUiState$1.L$0 = chaloTextUIState;
                eBillPaymentSuccessComponent$convertToUiState$1.L$1 = chaloTextUIState2;
                eBillPaymentSuccessComponent$convertToUiState$1.L$2 = buttonUIStateFactory2;
                eBillPaymentSuccessComponent$convertToUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentSuccessComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons) {
                    chaloTextUIState3 = chaloTextUIState2;
                    buttonUIStateFactory = buttonUIStateFactory2;
                    String str = (String) objB2;
                    final int i3 = 0;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str, new Function0(this) { // from class: z00
                        public final /* synthetic */ EBillPaymentSuccessComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    this.b.G0(EBillPaymentSuccessIntent.OkayClickIntent.f2583a);
                                    break;
                                default:
                                    this.b.G0(EBillPaymentSuccessIntent.ViewInvoiceClickIntent.f2585a);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, null, null, false, 0.0f, 60);
                    eBillPaymentSuccessComponent$convertToUiState$1.L$0 = chaloTextUIState;
                    eBillPaymentSuccessComponent$convertToUiState$1.L$1 = chaloTextUIState3;
                    eBillPaymentSuccessComponent$convertToUiState$1.L$2 = buttonUIStateG;
                    eBillPaymentSuccessComponent$convertToUiState$1.L$3 = buttonUIStateFactory2;
                    eBillPaymentSuccessComponent$convertToUiState$1.label = 4;
                    objB = stringProvider.b(StringEnum.VIEW_INVOICE_CAPS, new Object[0], eBillPaymentSuccessComponent$convertToUiState$1);
                    if (objB != coroutineSingletons) {
                        buttonUIState = buttonUIStateG;
                        objB2 = objB;
                        chaloTextUIState4 = chaloTextUIState;
                        chaloTextUIState5 = chaloTextUIState3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) eBillPaymentSuccessComponent$convertToUiState$1.L$2;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) eBillPaymentSuccessComponent$convertToUiState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) eBillPaymentSuccessComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                buttonUIStateFactory = buttonUIStateFactory3;
                chaloTextUIState = chaloTextUIState6;
                String str2 = (String) objB2;
                final int i4 = 0;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str2, new Function0(this) { // from class: z00
                    public final /* synthetic */ EBillPaymentSuccessComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                this.b.G0(EBillPaymentSuccessIntent.OkayClickIntent.f2583a);
                                break;
                            default:
                                this.b.G0(EBillPaymentSuccessIntent.ViewInvoiceClickIntent.f2585a);
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, null, null, false, 0.0f, 60);
                eBillPaymentSuccessComponent$convertToUiState$1.L$0 = chaloTextUIState;
                eBillPaymentSuccessComponent$convertToUiState$1.L$1 = chaloTextUIState3;
                eBillPaymentSuccessComponent$convertToUiState$1.L$2 = buttonUIStateG;
                eBillPaymentSuccessComponent$convertToUiState$1.L$3 = buttonUIStateFactory2;
                eBillPaymentSuccessComponent$convertToUiState$1.label = 4;
                objB = stringProvider.b(StringEnum.VIEW_INVOICE_CAPS, new Object[0], eBillPaymentSuccessComponent$convertToUiState$1);
                if (objB != coroutineSingletons) {
                    buttonUIState = buttonUIStateG;
                    objB2 = objB;
                    chaloTextUIState4 = chaloTextUIState;
                    chaloTextUIState5 = chaloTextUIState3;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory2 = (ButtonUIStateFactory) eBillPaymentSuccessComponent$convertToUiState$1.L$3;
            buttonUIState = (ButtonUIState) eBillPaymentSuccessComponent$convertToUiState$1.L$2;
            chaloTextUIState5 = (TextUIState.ChaloTextUIState) eBillPaymentSuccessComponent$convertToUiState$1.L$1;
            chaloTextUIState4 = (TextUIState.ChaloTextUIState) eBillPaymentSuccessComponent$convertToUiState$1.L$0;
            ResultKt.b(objB2);
        }
        String str3 = (String) objB2;
        final int i5 = 1;
        return new EBillPaymentSuccessViewState(chaloTextUIState4, chaloTextUIState5, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, str3, new Function0(this) { // from class: z00
            public final /* synthetic */ EBillPaymentSuccessComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        this.b.G0(EBillPaymentSuccessIntent.OkayClickIntent.f2583a);
                        break;
                    default:
                        this.b.G0(EBillPaymentSuccessIntent.ViewInvoiceClickIntent.f2585a);
                        break;
                }
                return Unit.f17538a;
            }
        }, null, false, 60));
        UITextStyle uITextStyle = UITextStyle.DisplayMedium;
        UIFontWeight uIFontWeight = UIFontWeight.Bold;
        TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objB2, uITextStyle, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
        eBillPaymentSuccessComponent$convertToUiState$1.L$0 = chaloTextUIState7;
        eBillPaymentSuccessComponent$convertToUiState$1.label = 2;
        objB2 = stringProvider.b(StringEnum.EBILL_PAYMENT_SUCCESS_SUB_TITLE, new Object[0], eBillPaymentSuccessComponent$convertToUiState$1);
        if (objB2 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState7;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            eBillPaymentSuccessComponent$convertToUiState$1.L$0 = chaloTextUIState;
            eBillPaymentSuccessComponent$convertToUiState$1.L$1 = chaloTextUIState2;
            eBillPaymentSuccessComponent$convertToUiState$1.L$2 = buttonUIStateFactory2;
            eBillPaymentSuccessComponent$convertToUiState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentSuccessComponent$convertToUiState$1);
            if (objB2 != coroutineSingletons) {
                chaloTextUIState3 = chaloTextUIState2;
                buttonUIStateFactory = buttonUIStateFactory2;
                String str4 = (String) objB2;
                final int i6 = 0;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str4, new Function0(this) { // from class: z00
                    public final /* synthetic */ EBillPaymentSuccessComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                this.b.G0(EBillPaymentSuccessIntent.OkayClickIntent.f2583a);
                                break;
                            default:
                                this.b.G0(EBillPaymentSuccessIntent.ViewInvoiceClickIntent.f2585a);
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, null, null, false, 0.0f, 60);
                eBillPaymentSuccessComponent$convertToUiState$1.L$0 = chaloTextUIState;
                eBillPaymentSuccessComponent$convertToUiState$1.L$1 = chaloTextUIState3;
                eBillPaymentSuccessComponent$convertToUiState$1.L$2 = buttonUIStateG;
                eBillPaymentSuccessComponent$convertToUiState$1.L$3 = buttonUIStateFactory2;
                eBillPaymentSuccessComponent$convertToUiState$1.label = 4;
                objB = stringProvider.b(StringEnum.VIEW_INVOICE_CAPS, new Object[0], eBillPaymentSuccessComponent$convertToUiState$1);
                if (objB != coroutineSingletons) {
                    buttonUIState = buttonUIStateG;
                    objB2 = objB;
                    chaloTextUIState4 = chaloTextUIState;
                    chaloTextUIState5 = chaloTextUIState3;
                    String str5 = (String) objB2;
                    final int i7 = 1;
                    return new EBillPaymentSuccessViewState(chaloTextUIState4, chaloTextUIState5, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, str5, new Function0(this) { // from class: z00
                        public final /* synthetic */ EBillPaymentSuccessComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    this.b.G0(EBillPaymentSuccessIntent.OkayClickIntent.f2583a);
                                    break;
                                default:
                                    this.b.G0(EBillPaymentSuccessIntent.ViewInvoiceClickIntent.f2585a);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, null, false, 60));
                }
            }
        }
        return coroutineSingletons;
    }

    public final void G0(EBillPaymentSuccessIntent eBillPaymentSuccessIntent) {
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel;
        String str;
        String str2;
        Long l;
        Object objB;
        Object objB2;
        C0(eBillPaymentSuccessIntent);
        boolean z = eBillPaymentSuccessIntent instanceof EBillPaymentSuccessIntent.StartingIntent;
        ChaloNavigationManager chaloNavigationManager = this.m;
        if (z) {
            EBillPaymentSuccessIntent.StartingIntent startingIntent = (EBillPaymentSuccessIntent.StartingIntent) eBillPaymentSuccessIntent;
            AnalyticsContract.DefaultImpls.a(this.l, "eBill payment success screen opened", "", null, null, false, 28);
            ChaloJson chaloJson = ChaloJson.f6455a;
            String str3 = startingIntent.b;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str3, CreateOrderResponseAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            CreateOrderResponseAppModel createOrderResponseAppModel = (CreateOrderResponseAppModel) objB;
            ChaloJson chaloJson2 = ChaloJson.f6455a;
            String str4 = startingIntent.f2584a;
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str4, ElectricityBillAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB2 = null;
            }
            ElectricityBillAppModel electricityBillAppModel = (ElectricityBillAppModel) objB2;
            if (createOrderResponseAppModel == null || electricityBillAppModel == null) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                return;
            } else {
                E0(new wn(20, createOrderResponseAppModel, electricityBillAppModel));
                return;
            }
        }
        boolean z2 = eBillPaymentSuccessIntent instanceof EBillPaymentSuccessIntent.OkayClickIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            ElectricityBillAppModel electricityBillAppModel2 = ((EBillPaymentSuccessDataState) stateFlow.getValue()).f2582a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (electricityBillAppModel2 != null) {
                MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
                MixpanelUtil.a(linkedHashMap, electricityBillAppModel2);
            }
            AnalyticsContract.DefaultImpls.a(this.l, "eBill payment success screen ok clicked", "", linkedHashMap, null, false, 24);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
            return;
        }
        if (!(eBillPaymentSuccessIntent instanceof EBillPaymentSuccessIntent.ViewInvoiceClickIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        ElectricityBillAppModel electricityBillAppModel3 = ((EBillPaymentSuccessDataState) stateFlow.getValue()).f2582a;
        CreateOrderResponseAppModel createOrderResponseAppModel2 = ((EBillPaymentSuccessDataState) stateFlow.getValue()).b;
        String str5 = "";
        if (createOrderResponseAppModel2 == null || electricityBillAppModel3 == null) {
            electricityBillPaymentHistoryUiModel = null;
        } else {
            String str6 = electricityBillAppModel3.c;
            String strA = this.o.a(createOrderResponseAppModel2.f5638a, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            long j = electricityBillAppModel3.f2538a;
            TimeUtilsContract timeUtilsContract = this.p;
            String strG = timeUtilsContract.g(j);
            OrderBookingInfoAppModel orderBookingInfoAppModel = createOrderResponseAppModel2.c;
            String strG2 = timeUtilsContract.g((orderBookingInfoAppModel == null || (l = orderBookingInfoAppModel.f5642a) == null) ? -1L : l.longValue());
            String strB = CityProviderKt.b(this.n);
            String str7 = strB == null ? "" : strB;
            String str8 = electricityBillAppModel3.d;
            String strG3 = timeUtilsContract.g(electricityBillAppModel3.b);
            String str9 = createOrderResponseAppModel2.b;
            electricityBillPaymentHistoryUiModel = new ElectricityBillPaymentHistoryUiModel(str6, strA, strG, strG2, str7, str8, strG3, str9, ElectricityBillPaymentStatus.Success, str9);
        }
        ElectricityBillAppModel electricityBillAppModel4 = ((EBillPaymentSuccessDataState) stateFlow.getValue()).f2582a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (electricityBillAppModel4 != null) {
            MixpanelUtil mixpanelUtil2 = MixpanelUtil.f9617a;
            MixpanelUtil.a(linkedHashMap2, electricityBillAppModel4);
        }
        if (electricityBillPaymentHistoryUiModel == null || (str = electricityBillPaymentHistoryUiModel.j) == null) {
            str = "";
        }
        linkedHashMap2.put("transaction id", str);
        if (electricityBillPaymentHistoryUiModel != null && (str2 = electricityBillPaymentHistoryUiModel.h) != null) {
            str5 = str2;
        }
        linkedHashMap2.put("referenceId", str5);
        AnalyticsContract.DefaultImpls.a(this.l, "eBill payment success screen view invoice clicked", "", linkedHashMap2, null, false, 24);
        Json json3 = ChaloJson.b;
        json3.getClass();
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new EBillPaymentInvoiceScreenArgs(json3.a(BuiltinSerializersKt.c(ElectricityBillPaymentHistoryUiModel.INSTANCE.serializer()), electricityBillPaymentHistoryUiModel)), null, null, 6));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final /* bridge */ /* synthetic */ Object p0(Object obj, ContinuationImpl continuationImpl) {
        return F0(continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new EBillPaymentSuccessDataState(null, null);
    }
}
