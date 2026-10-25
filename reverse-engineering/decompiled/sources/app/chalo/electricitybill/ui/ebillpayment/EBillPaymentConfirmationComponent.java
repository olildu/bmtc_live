package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.domain.EBillCreateOrderUseCase;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TextValueUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillPaymentConfirmationArgs;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ButtonContainerUIState;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TermTextUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.snackbar.SnackbarUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.b00;
import defpackage.cb0;
import defpackage.gf;
import defpackage.qp;
import defpackage.s00;
import defpackage.y00;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationIntent;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationDataState;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationViewState;", "Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillPaymentConfirmationComponent extends ChaloBaseStateMviComponent<EBillPaymentConfirmationIntent, EBillPaymentConfirmationDataState, EBillPaymentConfirmationViewState, EBillPaymentConfirmationSideEffect> {
    public final ChaloNavigationManager k;
    public final AnalyticsContract l;
    public final EBillCreateOrderUseCase m;
    public final KotlinToastManager n;
    public final UserProfileDetailsProvider o;
    public final TimeUtilsContract p;
    public final StringProvider q;
    public final NetworkStateManager r;
    public final CheckoutResultStateManager s;
    public final CurrencyFeature t;
    public String u;
    public Job v;
    public TnCDialogUIState w;

    /* JADX INFO: renamed from: app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent$1", f = "EBillPaymentConfirmationComponent.kt", l = {85}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EBillPaymentConfirmationComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow stateFlowB = EBillPaymentConfirmationComponent.this.r.b();
                final EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent = EBillPaymentConfirmationComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        eBillPaymentConfirmationComponent.K0(new EBillPaymentConfirmationIntent.InternetConnectionIntent((NetworkConnectionType) obj2));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlowB.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent$2", f = "EBillPaymentConfirmationComponent.kt", l = {99}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EBillPaymentConfirmationComponent.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent = EBillPaymentConfirmationComponent.this;
                CheckoutResultStateManager checkoutResultStateManager = eBillPaymentConfirmationComponent.s;
                StateKeeper b = eBillPaymentConfirmationComponent.f5983a.getB();
                ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
                ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("Ebill_Payment_Confirmation_SK_Key", b, companion.serializer(), companion.serializer(), new y00(EBillPaymentConfirmationComponent.this, 4));
                if (resultStateRecoveredDataA != null) {
                    EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent2 = EBillPaymentConfirmationComponent.this;
                    Flow flow = resultStateRecoveredDataA.b;
                    this.label = 1;
                    obj = eBillPaymentConfirmationComponent2.b.v(flow, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return unit;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ResultStateData resultStateData = (ResultStateData) obj;
            if (resultStateData instanceof ResultStateData.Cancelled) {
                EBillPaymentConfirmationComponent.this.u = null;
                return unit;
            }
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent3 = EBillPaymentConfirmationComponent.this;
            eBillPaymentConfirmationComponent3.u = null;
            CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
            if (checkoutResultState instanceof CheckoutResultState.Success) {
                eBillPaymentConfirmationComponent3.K0(EBillPaymentConfirmationIntent.PaymentCompletedIntent.f2573a);
                return unit;
            }
            if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                throw new NoWhenBranchMatchedException();
            }
            return unit;
        }
    }

    public EBillPaymentConfirmationComponent(ComponentContext componentContext, EBillPaymentConfirmationArgs eBillPaymentConfirmationArgs, ChaloNavigationManager chaloNavigationManager, AnalyticsContract analyticsContract, EBillCreateOrderUseCase eBillCreateOrderUseCase, KotlinToastManager kotlinToastManager, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract, StringProvider stringProvider, NetworkStateManager networkStateManager, CheckoutResultStateManager checkoutResultStateManager, CurrencyFeature currencyFeature) {
        super(componentContext);
        this.k = chaloNavigationManager;
        this.l = analyticsContract;
        this.m = eBillCreateOrderUseCase;
        this.n = kotlinToastManager;
        this.o = userProfileDetailsProvider;
        this.p = timeUtilsContract;
        this.q = stringProvider;
        this.r = networkStateManager;
        this.s = checkoutResultStateManager;
        this.t = currencyFeature;
        D0(new AnonymousClass1(null));
        K0(new EBillPaymentConfirmationIntent.StartingIntent(eBillPaymentConfirmationArgs.b));
        this.v = BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0173  */
    /* JADX WARN: Code duplicated, block: B:32:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x01c1 A[PHI: r1 r4 r8 r9 r10
      0x01c1: PHI (r1v13 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:34:0x01bd, B:17:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r4v14 app.chalo.electricitybill.ui.uistate.CustomerInfoUIState) = 
      (r4v11 app.chalo.electricitybill.ui.uistate.CustomerInfoUIState)
      (r4v16 app.chalo.electricitybill.ui.uistate.CustomerInfoUIState)
     binds: [B:34:0x01bd, B:17:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r8v12 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = (r8v8 app.chalo.uistate.text.TextUIState$ChaloTextUIState), (r8v14 app.chalo.uistate.text.TextUIState$ChaloTextUIState) binds: [B:34:0x01bd, B:17:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r9v10 app.chalo.uistate.toolbar.ToolbarUIState) = (r9v6 app.chalo.uistate.toolbar.ToolbarUIState), (r9v13 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:34:0x01bd, B:17:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r10v7 app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState) = 
      (r10v5 app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState)
      (r10v10 app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState)
     binds: [B:34:0x01bd, B:17:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0212  */
    /* JADX WARN: Code duplicated, block: B:51:0x021d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0222  */
    /* JADX WARN: Code duplicated, block: B:57:0x0243  */
    /* JADX WARN: Code duplicated, block: B:61:0x026f  */
    /* JADX WARN: Code duplicated, block: B:64:0x028c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0293  */
    /* JADX WARN: Code duplicated, block: B:70:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState, ContinuationImpl continuationImpl) {
        EBillPaymentConfirmationComponent$convertToUiState$1 eBillPaymentConfirmationComponent$convertToUiState$1;
        EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState2;
        ToolbarUIState toolbarUIState;
        EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState3;
        ToolbarUIState toolbarUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ToolbarUIState toolbarUIState3;
        CustomerInfoUIState customerInfoUIState;
        TransactionInfoUIState transactionInfoUIState;
        ElectricityBillAppModel electricityBillAppModel;
        Long l;
        Object objJ0;
        ToolbarUIState toolbarUIState4;
        EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState5;
        TransactionInfoUIState transactionInfoUIState2;
        CustomerInfoUIState customerInfoUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TotalAmountUIState totalAmountUIState;
        LoadingDialogUIState loadingDialogUIStateA;
        DialogUIStateFactory dialogUIStateFactory;
        DialogUIStateFactory dialogUIStateFactory2;
        LoadingDialogUIState loadingDialogUIState;
        SnackbarUIState snackbarUIStateA;
        SnackbarUIStateFactory snackbarUIStateFactory;
        Object objB;
        EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState6;
        ToolbarUIState toolbarUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        CustomerInfoUIState customerInfoUIState3;
        TransactionInfoUIState transactionInfoUIState3;
        TotalAmountUIState totalAmountUIState2;
        LoadingDialogUIState loadingDialogUIState2;
        String str;
        LoadingDialogUIState loadingDialogUIState3;
        SnackbarUIStateFactory snackbarUIStateFactory2;
        TotalAmountUIState totalAmountUIState3;
        TransactionInfoUIState transactionInfoUIState4;
        CustomerInfoUIState customerInfoUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        SnackbarUIState snackbarUIState;
        TnCDialogUIState tnCDialogUIState;
        ToolbarUIState toolbarUIState6;
        LoadingDialogUIState loadingDialogUIState4;
        TotalAmountUIState totalAmountUIState4;
        TransactionInfoUIState transactionInfoUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        CustomerInfoUIState customerInfoUIState5;
        Object objI0;
        SnackbarUIState snackbarUIState2;
        ToolbarUIState toolbarUIState7;
        if (continuationImpl instanceof EBillPaymentConfirmationComponent$convertToUiState$1) {
            eBillPaymentConfirmationComponent$convertToUiState$1 = (EBillPaymentConfirmationComponent$convertToUiState$1) continuationImpl;
            int i = eBillPaymentConfirmationComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillPaymentConfirmationComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillPaymentConfirmationComponent$convertToUiState$1 = new EBillPaymentConfirmationComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentConfirmationComponent$convertToUiState$1 = new EBillPaymentConfirmationComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB2 = eBillPaymentConfirmationComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillPaymentConfirmationComponent$convertToUiState$1.label;
        StringProvider stringProvider = this.q;
        switch (i2) {
            case 0:
                ResultKt.b(objB2);
                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState;
                eBillPaymentConfirmationComponent$convertToUiState$1.label = 1;
                objB2 = stringProvider.b(StringEnum.BEST_ELECTRICITY_BILL, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                if (objB2 != obj) {
                    eBillPaymentConfirmationDataState2 = eBillPaymentConfirmationDataState;
                    toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, null, null, 253);
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 2;
                    objB2 = stringProvider.b(StringEnum.EBILL_CONFIRM_PAYMENT_TITLE, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objB2 != obj) {
                        eBillPaymentConfirmationDataState3 = eBillPaymentConfirmationDataState2;
                        toolbarUIState2 = toolbarUIState;
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        ElectricityBillAppModel electricityBillAppModel2 = eBillPaymentConfirmationDataState3.c;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 3;
                        objB2 = H0(electricityBillAppModel2, eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objB2 != obj) {
                            eBillPaymentConfirmationDataState4 = eBillPaymentConfirmationDataState3;
                            chaloTextUIState2 = chaloTextUIState;
                            toolbarUIState3 = toolbarUIState2;
                            customerInfoUIState = (CustomerInfoUIState) objB2;
                            ElectricityBillAppModel electricityBillAppModel3 = eBillPaymentConfirmationDataState4.c;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 4;
                            objB2 = G0(electricityBillAppModel3, eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objB2 != obj) {
                                transactionInfoUIState = (TransactionInfoUIState) objB2;
                                electricityBillAppModel = eBillPaymentConfirmationDataState4.c;
                                if (electricityBillAppModel != null) {
                                    l = new Long(electricityBillAppModel.g);
                                } else {
                                    l = null;
                                }
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 5;
                                objJ0 = J0(l, eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objJ0 != obj) {
                                    toolbarUIState4 = toolbarUIState3;
                                    eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState4;
                                    transactionInfoUIState2 = transactionInfoUIState;
                                    customerInfoUIState2 = customerInfoUIState;
                                    objB2 = objJ0;
                                    chaloTextUIState3 = chaloTextUIState2;
                                    totalAmountUIState = (TotalAmountUIState) objB2;
                                    if (eBillPaymentConfirmationDataState5.f2570a) {
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 6;
                                        objB2 = stringProvider.b(StringEnum.LOADING_THREE_DOTS, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objB2 != obj) {
                                            dialogUIStateFactory2 = dialogUIStateFactory;
                                            dialogUIStateFactory2.getClass();
                                            loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                            if (!eBillPaymentConfirmationDataState5.e) {
                                                loadingDialogUIState = loadingDialogUIStateA;
                                                snackbarUIStateA = null;
                                                totalAmountUIState3 = totalAmountUIState;
                                                transactionInfoUIState4 = transactionInfoUIState2;
                                                customerInfoUIState4 = customerInfoUIState2;
                                                chaloTextUIState5 = chaloTextUIState3;
                                                if (eBillPaymentConfirmationDataState5.b) {
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                    if (objI0 != obj) {
                                                        snackbarUIState2 = snackbarUIStateA;
                                                        objB2 = objI0;
                                                        toolbarUIState7 = toolbarUIState4;
                                                        tnCDialogUIState = (TnCDialogUIState) objB2;
                                                        toolbarUIState6 = toolbarUIState7;
                                                        snackbarUIState = snackbarUIState2;
                                                        loadingDialogUIState4 = loadingDialogUIState;
                                                        totalAmountUIState4 = totalAmountUIState3;
                                                        transactionInfoUIState5 = transactionInfoUIState4;
                                                        customerInfoUIState5 = customerInfoUIState4;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                    }
                                                } else {
                                                    snackbarUIState = snackbarUIStateA;
                                                    tnCDialogUIState = null;
                                                    toolbarUIState6 = toolbarUIState4;
                                                    loadingDialogUIState4 = loadingDialogUIState;
                                                    totalAmountUIState4 = totalAmountUIState3;
                                                    transactionInfoUIState5 = transactionInfoUIState4;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    customerInfoUIState5 = customerInfoUIState4;
                                                }
                                                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                            }
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                            snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                                            objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                            if (objB != obj) {
                                                eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                                toolbarUIState5 = toolbarUIState4;
                                                chaloTextUIState4 = chaloTextUIState3;
                                                customerInfoUIState3 = customerInfoUIState2;
                                                transactionInfoUIState3 = transactionInfoUIState2;
                                                totalAmountUIState2 = totalAmountUIState;
                                                loadingDialogUIState2 = loadingDialogUIStateA;
                                                objB2 = objB;
                                                str = (String) objB2;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                                objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                                if (objB2 != obj) {
                                                    loadingDialogUIState3 = loadingDialogUIState2;
                                                    totalAmountUIState = totalAmountUIState2;
                                                    transactionInfoUIState2 = transactionInfoUIState3;
                                                    customerInfoUIState2 = customerInfoUIState3;
                                                    chaloTextUIState3 = chaloTextUIState4;
                                                    toolbarUIState4 = toolbarUIState5;
                                                    eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                                    snackbarUIStateFactory2 = snackbarUIStateFactory;
                                                    y00 y00Var = new y00(this, 0);
                                                    snackbarUIStateFactory2.getClass();
                                                    snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var);
                                                    loadingDialogUIState = loadingDialogUIState3;
                                                    totalAmountUIState3 = totalAmountUIState;
                                                    transactionInfoUIState4 = transactionInfoUIState2;
                                                    customerInfoUIState4 = customerInfoUIState2;
                                                    chaloTextUIState5 = chaloTextUIState3;
                                                    if (eBillPaymentConfirmationDataState5.b) {
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                        objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                        if (objI0 != obj) {
                                                            snackbarUIState2 = snackbarUIStateA;
                                                            objB2 = objI0;
                                                            toolbarUIState7 = toolbarUIState4;
                                                            tnCDialogUIState = (TnCDialogUIState) objB2;
                                                            toolbarUIState6 = toolbarUIState7;
                                                            snackbarUIState = snackbarUIState2;
                                                            loadingDialogUIState4 = loadingDialogUIState;
                                                            totalAmountUIState4 = totalAmountUIState3;
                                                            transactionInfoUIState5 = transactionInfoUIState4;
                                                            customerInfoUIState5 = customerInfoUIState4;
                                                            chaloTextUIState6 = chaloTextUIState5;
                                                        }
                                                    } else {
                                                        snackbarUIState = snackbarUIStateA;
                                                        tnCDialogUIState = null;
                                                        toolbarUIState6 = toolbarUIState4;
                                                        loadingDialogUIState4 = loadingDialogUIState;
                                                        totalAmountUIState4 = totalAmountUIState3;
                                                        transactionInfoUIState5 = transactionInfoUIState4;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                        customerInfoUIState5 = customerInfoUIState4;
                                                    }
                                                    return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                                }
                                            }
                                        }
                                    } else {
                                        loadingDialogUIStateA = null;
                                        if (!eBillPaymentConfirmationDataState5.e) {
                                            loadingDialogUIState = loadingDialogUIStateA;
                                            snackbarUIStateA = null;
                                            totalAmountUIState3 = totalAmountUIState;
                                            transactionInfoUIState4 = transactionInfoUIState2;
                                            customerInfoUIState4 = customerInfoUIState2;
                                            chaloTextUIState5 = chaloTextUIState3;
                                            if (eBillPaymentConfirmationDataState5.b) {
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                if (objI0 != obj) {
                                                    snackbarUIState2 = snackbarUIStateA;
                                                    objB2 = objI0;
                                                    toolbarUIState7 = toolbarUIState4;
                                                    tnCDialogUIState = (TnCDialogUIState) objB2;
                                                    toolbarUIState6 = toolbarUIState7;
                                                    snackbarUIState = snackbarUIState2;
                                                    loadingDialogUIState4 = loadingDialogUIState;
                                                    totalAmountUIState4 = totalAmountUIState3;
                                                    transactionInfoUIState5 = transactionInfoUIState4;
                                                    customerInfoUIState5 = customerInfoUIState4;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                }
                                            } else {
                                                snackbarUIState = snackbarUIStateA;
                                                tnCDialogUIState = null;
                                                toolbarUIState6 = toolbarUIState4;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                customerInfoUIState5 = customerInfoUIState4;
                                            }
                                            return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                        }
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                        snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                                        objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objB != obj) {
                                            eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                            toolbarUIState5 = toolbarUIState4;
                                            chaloTextUIState4 = chaloTextUIState3;
                                            customerInfoUIState3 = customerInfoUIState2;
                                            transactionInfoUIState3 = transactionInfoUIState2;
                                            totalAmountUIState2 = totalAmountUIState;
                                            loadingDialogUIState2 = loadingDialogUIStateA;
                                            objB2 = objB;
                                            str = (String) objB2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                            objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                            if (objB2 != obj) {
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                totalAmountUIState = totalAmountUIState2;
                                                transactionInfoUIState2 = transactionInfoUIState3;
                                                customerInfoUIState2 = customerInfoUIState3;
                                                chaloTextUIState3 = chaloTextUIState4;
                                                toolbarUIState4 = toolbarUIState5;
                                                eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                                snackbarUIStateFactory2 = snackbarUIStateFactory;
                                                y00 y00Var2 = new y00(this, 0);
                                                snackbarUIStateFactory2.getClass();
                                                snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var2);
                                                loadingDialogUIState = loadingDialogUIState3;
                                                totalAmountUIState3 = totalAmountUIState;
                                                transactionInfoUIState4 = transactionInfoUIState2;
                                                customerInfoUIState4 = customerInfoUIState2;
                                                chaloTextUIState5 = chaloTextUIState3;
                                                if (eBillPaymentConfirmationDataState5.b) {
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                    if (objI0 != obj) {
                                                        snackbarUIState2 = snackbarUIStateA;
                                                        objB2 = objI0;
                                                        toolbarUIState7 = toolbarUIState4;
                                                        tnCDialogUIState = (TnCDialogUIState) objB2;
                                                        toolbarUIState6 = toolbarUIState7;
                                                        snackbarUIState = snackbarUIState2;
                                                        loadingDialogUIState4 = loadingDialogUIState;
                                                        totalAmountUIState4 = totalAmountUIState3;
                                                        transactionInfoUIState5 = transactionInfoUIState4;
                                                        customerInfoUIState5 = customerInfoUIState4;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                    }
                                                } else {
                                                    snackbarUIState = snackbarUIStateA;
                                                    tnCDialogUIState = null;
                                                    toolbarUIState6 = toolbarUIState4;
                                                    loadingDialogUIState4 = loadingDialogUIState;
                                                    totalAmountUIState4 = totalAmountUIState3;
                                                    transactionInfoUIState5 = transactionInfoUIState4;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    customerInfoUIState5 = customerInfoUIState4;
                                                }
                                                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                eBillPaymentConfirmationDataState2 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, null, null, 253);
                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState;
                eBillPaymentConfirmationComponent$convertToUiState$1.label = 2;
                objB2 = stringProvider.b(StringEnum.EBILL_CONFIRM_PAYMENT_TITLE, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                if (objB2 != obj) {
                    eBillPaymentConfirmationDataState3 = eBillPaymentConfirmationDataState2;
                    toolbarUIState2 = toolbarUIState;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    ElectricityBillAppModel electricityBillAppModel4 = eBillPaymentConfirmationDataState3.c;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 3;
                    objB2 = H0(electricityBillAppModel4, eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objB2 != obj) {
                        eBillPaymentConfirmationDataState4 = eBillPaymentConfirmationDataState3;
                        chaloTextUIState2 = chaloTextUIState;
                        toolbarUIState3 = toolbarUIState2;
                        customerInfoUIState = (CustomerInfoUIState) objB2;
                        ElectricityBillAppModel electricityBillAppModel5 = eBillPaymentConfirmationDataState4.c;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 4;
                        objB2 = G0(electricityBillAppModel5, eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objB2 != obj) {
                            transactionInfoUIState = (TransactionInfoUIState) objB2;
                            electricityBillAppModel = eBillPaymentConfirmationDataState4.c;
                            if (electricityBillAppModel != null) {
                                l = new Long(electricityBillAppModel.g);
                            } else {
                                l = null;
                            }
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 5;
                            objJ0 = J0(l, eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objJ0 != obj) {
                                toolbarUIState4 = toolbarUIState3;
                                eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState4;
                                transactionInfoUIState2 = transactionInfoUIState;
                                customerInfoUIState2 = customerInfoUIState;
                                objB2 = objJ0;
                                chaloTextUIState3 = chaloTextUIState2;
                                totalAmountUIState = (TotalAmountUIState) objB2;
                                if (eBillPaymentConfirmationDataState5.f2570a) {
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 6;
                                    objB2 = stringProvider.b(StringEnum.LOADING_THREE_DOTS, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objB2 != obj) {
                                        dialogUIStateFactory2 = dialogUIStateFactory;
                                        dialogUIStateFactory2.getClass();
                                        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                        if (!eBillPaymentConfirmationDataState5.e) {
                                            loadingDialogUIState = loadingDialogUIStateA;
                                            snackbarUIStateA = null;
                                            totalAmountUIState3 = totalAmountUIState;
                                            transactionInfoUIState4 = transactionInfoUIState2;
                                            customerInfoUIState4 = customerInfoUIState2;
                                            chaloTextUIState5 = chaloTextUIState3;
                                            if (eBillPaymentConfirmationDataState5.b) {
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                if (objI0 != obj) {
                                                    snackbarUIState2 = snackbarUIStateA;
                                                    objB2 = objI0;
                                                    toolbarUIState7 = toolbarUIState4;
                                                    tnCDialogUIState = (TnCDialogUIState) objB2;
                                                    toolbarUIState6 = toolbarUIState7;
                                                    snackbarUIState = snackbarUIState2;
                                                    loadingDialogUIState4 = loadingDialogUIState;
                                                    totalAmountUIState4 = totalAmountUIState3;
                                                    transactionInfoUIState5 = transactionInfoUIState4;
                                                    customerInfoUIState5 = customerInfoUIState4;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                }
                                            } else {
                                                snackbarUIState = snackbarUIStateA;
                                                tnCDialogUIState = null;
                                                toolbarUIState6 = toolbarUIState4;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                customerInfoUIState5 = customerInfoUIState4;
                                            }
                                            return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                        }
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                        snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                                        objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objB != obj) {
                                            eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                            toolbarUIState5 = toolbarUIState4;
                                            chaloTextUIState4 = chaloTextUIState3;
                                            customerInfoUIState3 = customerInfoUIState2;
                                            transactionInfoUIState3 = transactionInfoUIState2;
                                            totalAmountUIState2 = totalAmountUIState;
                                            loadingDialogUIState2 = loadingDialogUIStateA;
                                            objB2 = objB;
                                            str = (String) objB2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                            objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                            if (objB2 != obj) {
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                totalAmountUIState = totalAmountUIState2;
                                                transactionInfoUIState2 = transactionInfoUIState3;
                                                customerInfoUIState2 = customerInfoUIState3;
                                                chaloTextUIState3 = chaloTextUIState4;
                                                toolbarUIState4 = toolbarUIState5;
                                                eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                                snackbarUIStateFactory2 = snackbarUIStateFactory;
                                                y00 y00Var3 = new y00(this, 0);
                                                snackbarUIStateFactory2.getClass();
                                                snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var3);
                                                loadingDialogUIState = loadingDialogUIState3;
                                                totalAmountUIState3 = totalAmountUIState;
                                                transactionInfoUIState4 = transactionInfoUIState2;
                                                customerInfoUIState4 = customerInfoUIState2;
                                                chaloTextUIState5 = chaloTextUIState3;
                                                if (eBillPaymentConfirmationDataState5.b) {
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                    if (objI0 != obj) {
                                                        snackbarUIState2 = snackbarUIStateA;
                                                        objB2 = objI0;
                                                        toolbarUIState7 = toolbarUIState4;
                                                        tnCDialogUIState = (TnCDialogUIState) objB2;
                                                        toolbarUIState6 = toolbarUIState7;
                                                        snackbarUIState = snackbarUIState2;
                                                        loadingDialogUIState4 = loadingDialogUIState;
                                                        totalAmountUIState4 = totalAmountUIState3;
                                                        transactionInfoUIState5 = transactionInfoUIState4;
                                                        customerInfoUIState5 = customerInfoUIState4;
                                                        chaloTextUIState6 = chaloTextUIState5;
                                                    }
                                                } else {
                                                    snackbarUIState = snackbarUIStateA;
                                                    tnCDialogUIState = null;
                                                    toolbarUIState6 = toolbarUIState4;
                                                    loadingDialogUIState4 = loadingDialogUIState;
                                                    totalAmountUIState4 = totalAmountUIState3;
                                                    transactionInfoUIState5 = transactionInfoUIState4;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                    customerInfoUIState5 = customerInfoUIState4;
                                                }
                                                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                            }
                                        }
                                    }
                                } else {
                                    loadingDialogUIStateA = null;
                                    if (!eBillPaymentConfirmationDataState5.e) {
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        snackbarUIStateA = null;
                                        totalAmountUIState3 = totalAmountUIState;
                                        transactionInfoUIState4 = transactionInfoUIState2;
                                        customerInfoUIState4 = customerInfoUIState2;
                                        chaloTextUIState5 = chaloTextUIState3;
                                        if (eBillPaymentConfirmationDataState5.b) {
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                            objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                            if (objI0 != obj) {
                                                snackbarUIState2 = snackbarUIStateA;
                                                objB2 = objI0;
                                                toolbarUIState7 = toolbarUIState4;
                                                tnCDialogUIState = (TnCDialogUIState) objB2;
                                                toolbarUIState6 = toolbarUIState7;
                                                snackbarUIState = snackbarUIState2;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                customerInfoUIState5 = customerInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                            }
                                        } else {
                                            snackbarUIState = snackbarUIStateA;
                                            tnCDialogUIState = null;
                                            toolbarUIState6 = toolbarUIState4;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            customerInfoUIState5 = customerInfoUIState4;
                                        }
                                        return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                    }
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                    snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                                    objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objB != obj) {
                                        eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                        toolbarUIState5 = toolbarUIState4;
                                        chaloTextUIState4 = chaloTextUIState3;
                                        customerInfoUIState3 = customerInfoUIState2;
                                        transactionInfoUIState3 = transactionInfoUIState2;
                                        totalAmountUIState2 = totalAmountUIState;
                                        loadingDialogUIState2 = loadingDialogUIStateA;
                                        objB2 = objB;
                                        str = (String) objB2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                        objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objB2 != obj) {
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            totalAmountUIState = totalAmountUIState2;
                                            transactionInfoUIState2 = transactionInfoUIState3;
                                            customerInfoUIState2 = customerInfoUIState3;
                                            chaloTextUIState3 = chaloTextUIState4;
                                            toolbarUIState4 = toolbarUIState5;
                                            eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                            snackbarUIStateFactory2 = snackbarUIStateFactory;
                                            y00 y00Var4 = new y00(this, 0);
                                            snackbarUIStateFactory2.getClass();
                                            snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var4);
                                            loadingDialogUIState = loadingDialogUIState3;
                                            totalAmountUIState3 = totalAmountUIState;
                                            transactionInfoUIState4 = transactionInfoUIState2;
                                            customerInfoUIState4 = customerInfoUIState2;
                                            chaloTextUIState5 = chaloTextUIState3;
                                            if (eBillPaymentConfirmationDataState5.b) {
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                if (objI0 != obj) {
                                                    snackbarUIState2 = snackbarUIStateA;
                                                    objB2 = objI0;
                                                    toolbarUIState7 = toolbarUIState4;
                                                    tnCDialogUIState = (TnCDialogUIState) objB2;
                                                    toolbarUIState6 = toolbarUIState7;
                                                    snackbarUIState = snackbarUIState2;
                                                    loadingDialogUIState4 = loadingDialogUIState;
                                                    totalAmountUIState4 = totalAmountUIState3;
                                                    transactionInfoUIState5 = transactionInfoUIState4;
                                                    customerInfoUIState5 = customerInfoUIState4;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                }
                                            } else {
                                                snackbarUIState = snackbarUIStateA;
                                                tnCDialogUIState = null;
                                                toolbarUIState6 = toolbarUIState4;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                customerInfoUIState5 = customerInfoUIState4;
                                            }
                                            return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                toolbarUIState2 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                eBillPaymentConfirmationDataState3 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                ElectricityBillAppModel electricityBillAppModel6 = eBillPaymentConfirmationDataState3.c;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState3;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState;
                eBillPaymentConfirmationComponent$convertToUiState$1.label = 3;
                objB2 = H0(electricityBillAppModel6, eBillPaymentConfirmationComponent$convertToUiState$1);
                if (objB2 != obj) {
                    eBillPaymentConfirmationDataState4 = eBillPaymentConfirmationDataState3;
                    chaloTextUIState2 = chaloTextUIState;
                    toolbarUIState3 = toolbarUIState2;
                    customerInfoUIState = (CustomerInfoUIState) objB2;
                    ElectricityBillAppModel electricityBillAppModel7 = eBillPaymentConfirmationDataState4.c;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 4;
                    objB2 = G0(electricityBillAppModel7, eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objB2 != obj) {
                        transactionInfoUIState = (TransactionInfoUIState) objB2;
                        electricityBillAppModel = eBillPaymentConfirmationDataState4.c;
                        if (electricityBillAppModel != null) {
                            l = new Long(electricityBillAppModel.g);
                        } else {
                            l = null;
                        }
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 5;
                        objJ0 = J0(l, eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objJ0 != obj) {
                            toolbarUIState4 = toolbarUIState3;
                            eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState4;
                            transactionInfoUIState2 = transactionInfoUIState;
                            customerInfoUIState2 = customerInfoUIState;
                            objB2 = objJ0;
                            chaloTextUIState3 = chaloTextUIState2;
                            totalAmountUIState = (TotalAmountUIState) objB2;
                            if (eBillPaymentConfirmationDataState5.f2570a) {
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 6;
                                objB2 = stringProvider.b(StringEnum.LOADING_THREE_DOTS, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objB2 != obj) {
                                    dialogUIStateFactory2 = dialogUIStateFactory;
                                    dialogUIStateFactory2.getClass();
                                    loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                    if (!eBillPaymentConfirmationDataState5.e) {
                                        loadingDialogUIState = loadingDialogUIStateA;
                                        snackbarUIStateA = null;
                                        totalAmountUIState3 = totalAmountUIState;
                                        transactionInfoUIState4 = transactionInfoUIState2;
                                        customerInfoUIState4 = customerInfoUIState2;
                                        chaloTextUIState5 = chaloTextUIState3;
                                        if (eBillPaymentConfirmationDataState5.b) {
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                            objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                            if (objI0 != obj) {
                                                snackbarUIState2 = snackbarUIStateA;
                                                objB2 = objI0;
                                                toolbarUIState7 = toolbarUIState4;
                                                tnCDialogUIState = (TnCDialogUIState) objB2;
                                                toolbarUIState6 = toolbarUIState7;
                                                snackbarUIState = snackbarUIState2;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                customerInfoUIState5 = customerInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                            }
                                        } else {
                                            snackbarUIState = snackbarUIStateA;
                                            tnCDialogUIState = null;
                                            toolbarUIState6 = toolbarUIState4;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            customerInfoUIState5 = customerInfoUIState4;
                                        }
                                        return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                    }
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                    snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                                    objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objB != obj) {
                                        eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                        toolbarUIState5 = toolbarUIState4;
                                        chaloTextUIState4 = chaloTextUIState3;
                                        customerInfoUIState3 = customerInfoUIState2;
                                        transactionInfoUIState3 = transactionInfoUIState2;
                                        totalAmountUIState2 = totalAmountUIState;
                                        loadingDialogUIState2 = loadingDialogUIStateA;
                                        objB2 = objB;
                                        str = (String) objB2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                        objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objB2 != obj) {
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            totalAmountUIState = totalAmountUIState2;
                                            transactionInfoUIState2 = transactionInfoUIState3;
                                            customerInfoUIState2 = customerInfoUIState3;
                                            chaloTextUIState3 = chaloTextUIState4;
                                            toolbarUIState4 = toolbarUIState5;
                                            eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                            snackbarUIStateFactory2 = snackbarUIStateFactory;
                                            y00 y00Var5 = new y00(this, 0);
                                            snackbarUIStateFactory2.getClass();
                                            snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var5);
                                            loadingDialogUIState = loadingDialogUIState3;
                                            totalAmountUIState3 = totalAmountUIState;
                                            transactionInfoUIState4 = transactionInfoUIState2;
                                            customerInfoUIState4 = customerInfoUIState2;
                                            chaloTextUIState5 = chaloTextUIState3;
                                            if (eBillPaymentConfirmationDataState5.b) {
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                                objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                                if (objI0 != obj) {
                                                    snackbarUIState2 = snackbarUIStateA;
                                                    objB2 = objI0;
                                                    toolbarUIState7 = toolbarUIState4;
                                                    tnCDialogUIState = (TnCDialogUIState) objB2;
                                                    toolbarUIState6 = toolbarUIState7;
                                                    snackbarUIState = snackbarUIState2;
                                                    loadingDialogUIState4 = loadingDialogUIState;
                                                    totalAmountUIState4 = totalAmountUIState3;
                                                    transactionInfoUIState5 = transactionInfoUIState4;
                                                    customerInfoUIState5 = customerInfoUIState4;
                                                    chaloTextUIState6 = chaloTextUIState5;
                                                }
                                            } else {
                                                snackbarUIState = snackbarUIStateA;
                                                tnCDialogUIState = null;
                                                toolbarUIState6 = toolbarUIState4;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                                customerInfoUIState5 = customerInfoUIState4;
                                            }
                                            return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                        }
                                    }
                                }
                            } else {
                                loadingDialogUIStateA = null;
                                if (!eBillPaymentConfirmationDataState5.e) {
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    snackbarUIStateA = null;
                                    totalAmountUIState3 = totalAmountUIState;
                                    transactionInfoUIState4 = transactionInfoUIState2;
                                    customerInfoUIState4 = customerInfoUIState2;
                                    chaloTextUIState5 = chaloTextUIState3;
                                    if (eBillPaymentConfirmationDataState5.b) {
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                        objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objI0 != obj) {
                                            snackbarUIState2 = snackbarUIStateA;
                                            objB2 = objI0;
                                            toolbarUIState7 = toolbarUIState4;
                                            tnCDialogUIState = (TnCDialogUIState) objB2;
                                            toolbarUIState6 = toolbarUIState7;
                                            snackbarUIState = snackbarUIState2;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            customerInfoUIState5 = customerInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                        }
                                    } else {
                                        snackbarUIState = snackbarUIStateA;
                                        tnCDialogUIState = null;
                                        toolbarUIState6 = toolbarUIState4;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                        customerInfoUIState5 = customerInfoUIState4;
                                    }
                                    return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                }
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                                objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objB != obj) {
                                    eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                    toolbarUIState5 = toolbarUIState4;
                                    chaloTextUIState4 = chaloTextUIState3;
                                    customerInfoUIState3 = customerInfoUIState2;
                                    transactionInfoUIState3 = transactionInfoUIState2;
                                    totalAmountUIState2 = totalAmountUIState;
                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                    objB2 = objB;
                                    str = (String) objB2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                    objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objB2 != obj) {
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        totalAmountUIState = totalAmountUIState2;
                                        transactionInfoUIState2 = transactionInfoUIState3;
                                        customerInfoUIState2 = customerInfoUIState3;
                                        chaloTextUIState3 = chaloTextUIState4;
                                        toolbarUIState4 = toolbarUIState5;
                                        eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                                        y00 y00Var6 = new y00(this, 0);
                                        snackbarUIStateFactory2.getClass();
                                        snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var6);
                                        loadingDialogUIState = loadingDialogUIState3;
                                        totalAmountUIState3 = totalAmountUIState;
                                        transactionInfoUIState4 = transactionInfoUIState2;
                                        customerInfoUIState4 = customerInfoUIState2;
                                        chaloTextUIState5 = chaloTextUIState3;
                                        if (eBillPaymentConfirmationDataState5.b) {
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                            objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                            if (objI0 != obj) {
                                                snackbarUIState2 = snackbarUIStateA;
                                                objB2 = objI0;
                                                toolbarUIState7 = toolbarUIState4;
                                                tnCDialogUIState = (TnCDialogUIState) objB2;
                                                toolbarUIState6 = toolbarUIState7;
                                                snackbarUIState = snackbarUIState2;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                customerInfoUIState5 = customerInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                            }
                                        } else {
                                            snackbarUIState = snackbarUIStateA;
                                            tnCDialogUIState = null;
                                            toolbarUIState6 = toolbarUIState4;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            customerInfoUIState5 = customerInfoUIState4;
                                        }
                                        return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 3:
                TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState8 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState7 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                eBillPaymentConfirmationDataState4 = eBillPaymentConfirmationDataState7;
                toolbarUIState3 = toolbarUIState8;
                chaloTextUIState2 = chaloTextUIState7;
                customerInfoUIState = (CustomerInfoUIState) objB2;
                ElectricityBillAppModel electricityBillAppModel8 = eBillPaymentConfirmationDataState4.c;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                eBillPaymentConfirmationComponent$convertToUiState$1.label = 4;
                objB2 = G0(electricityBillAppModel8, eBillPaymentConfirmationComponent$convertToUiState$1);
                if (objB2 != obj) {
                    transactionInfoUIState = (TransactionInfoUIState) objB2;
                    electricityBillAppModel = eBillPaymentConfirmationDataState4.c;
                    if (electricityBillAppModel != null) {
                        l = new Long(electricityBillAppModel.g);
                    } else {
                        l = null;
                    }
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 5;
                    objJ0 = J0(l, eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objJ0 != obj) {
                        toolbarUIState4 = toolbarUIState3;
                        eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState4;
                        transactionInfoUIState2 = transactionInfoUIState;
                        customerInfoUIState2 = customerInfoUIState;
                        objB2 = objJ0;
                        chaloTextUIState3 = chaloTextUIState2;
                        totalAmountUIState = (TotalAmountUIState) objB2;
                        if (eBillPaymentConfirmationDataState5.f2570a) {
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                            dialogUIStateFactory = DialogUIStateFactory.f9989a;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 6;
                            objB2 = stringProvider.b(StringEnum.LOADING_THREE_DOTS, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objB2 != obj) {
                                dialogUIStateFactory2 = dialogUIStateFactory;
                                dialogUIStateFactory2.getClass();
                                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                                if (!eBillPaymentConfirmationDataState5.e) {
                                    loadingDialogUIState = loadingDialogUIStateA;
                                    snackbarUIStateA = null;
                                    totalAmountUIState3 = totalAmountUIState;
                                    transactionInfoUIState4 = transactionInfoUIState2;
                                    customerInfoUIState4 = customerInfoUIState2;
                                    chaloTextUIState5 = chaloTextUIState3;
                                    if (eBillPaymentConfirmationDataState5.b) {
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                        objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objI0 != obj) {
                                            snackbarUIState2 = snackbarUIStateA;
                                            objB2 = objI0;
                                            toolbarUIState7 = toolbarUIState4;
                                            tnCDialogUIState = (TnCDialogUIState) objB2;
                                            toolbarUIState6 = toolbarUIState7;
                                            snackbarUIState = snackbarUIState2;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            customerInfoUIState5 = customerInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                        }
                                    } else {
                                        snackbarUIState = snackbarUIStateA;
                                        tnCDialogUIState = null;
                                        toolbarUIState6 = toolbarUIState4;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                        customerInfoUIState5 = customerInfoUIState4;
                                    }
                                    return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                }
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                                objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objB != obj) {
                                    eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                    toolbarUIState5 = toolbarUIState4;
                                    chaloTextUIState4 = chaloTextUIState3;
                                    customerInfoUIState3 = customerInfoUIState2;
                                    transactionInfoUIState3 = transactionInfoUIState2;
                                    totalAmountUIState2 = totalAmountUIState;
                                    loadingDialogUIState2 = loadingDialogUIStateA;
                                    objB2 = objB;
                                    str = (String) objB2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                    objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objB2 != obj) {
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        totalAmountUIState = totalAmountUIState2;
                                        transactionInfoUIState2 = transactionInfoUIState3;
                                        customerInfoUIState2 = customerInfoUIState3;
                                        chaloTextUIState3 = chaloTextUIState4;
                                        toolbarUIState4 = toolbarUIState5;
                                        eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                                        y00 y00Var7 = new y00(this, 0);
                                        snackbarUIStateFactory2.getClass();
                                        snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var7);
                                        loadingDialogUIState = loadingDialogUIState3;
                                        totalAmountUIState3 = totalAmountUIState;
                                        transactionInfoUIState4 = transactionInfoUIState2;
                                        customerInfoUIState4 = customerInfoUIState2;
                                        chaloTextUIState5 = chaloTextUIState3;
                                        if (eBillPaymentConfirmationDataState5.b) {
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                            objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                            if (objI0 != obj) {
                                                snackbarUIState2 = snackbarUIStateA;
                                                objB2 = objI0;
                                                toolbarUIState7 = toolbarUIState4;
                                                tnCDialogUIState = (TnCDialogUIState) objB2;
                                                toolbarUIState6 = toolbarUIState7;
                                                snackbarUIState = snackbarUIState2;
                                                loadingDialogUIState4 = loadingDialogUIState;
                                                totalAmountUIState4 = totalAmountUIState3;
                                                transactionInfoUIState5 = transactionInfoUIState4;
                                                customerInfoUIState5 = customerInfoUIState4;
                                                chaloTextUIState6 = chaloTextUIState5;
                                            }
                                        } else {
                                            snackbarUIState = snackbarUIStateA;
                                            tnCDialogUIState = null;
                                            toolbarUIState6 = toolbarUIState4;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            customerInfoUIState5 = customerInfoUIState4;
                                        }
                                        return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                    }
                                }
                            }
                        } else {
                            loadingDialogUIStateA = null;
                            if (!eBillPaymentConfirmationDataState5.e) {
                                loadingDialogUIState = loadingDialogUIStateA;
                                snackbarUIStateA = null;
                                totalAmountUIState3 = totalAmountUIState;
                                transactionInfoUIState4 = transactionInfoUIState2;
                                customerInfoUIState4 = customerInfoUIState2;
                                chaloTextUIState5 = chaloTextUIState3;
                                if (eBillPaymentConfirmationDataState5.b) {
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objI0 != obj) {
                                        snackbarUIState2 = snackbarUIStateA;
                                        objB2 = objI0;
                                        toolbarUIState7 = toolbarUIState4;
                                        tnCDialogUIState = (TnCDialogUIState) objB2;
                                        toolbarUIState6 = toolbarUIState7;
                                        snackbarUIState = snackbarUIState2;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        customerInfoUIState5 = customerInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                    }
                                } else {
                                    snackbarUIState = snackbarUIStateA;
                                    tnCDialogUIState = null;
                                    toolbarUIState6 = toolbarUIState4;
                                    loadingDialogUIState4 = loadingDialogUIState;
                                    totalAmountUIState4 = totalAmountUIState3;
                                    transactionInfoUIState5 = transactionInfoUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    customerInfoUIState5 = customerInfoUIState4;
                                }
                                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                            }
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                            snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                            objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objB != obj) {
                                eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                toolbarUIState5 = toolbarUIState4;
                                chaloTextUIState4 = chaloTextUIState3;
                                customerInfoUIState3 = customerInfoUIState2;
                                transactionInfoUIState3 = transactionInfoUIState2;
                                totalAmountUIState2 = totalAmountUIState;
                                loadingDialogUIState2 = loadingDialogUIStateA;
                                objB2 = objB;
                                str = (String) objB2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objB2 != obj) {
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    totalAmountUIState = totalAmountUIState2;
                                    transactionInfoUIState2 = transactionInfoUIState3;
                                    customerInfoUIState2 = customerInfoUIState3;
                                    chaloTextUIState3 = chaloTextUIState4;
                                    toolbarUIState4 = toolbarUIState5;
                                    eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                    snackbarUIStateFactory2 = snackbarUIStateFactory;
                                    y00 y00Var8 = new y00(this, 0);
                                    snackbarUIStateFactory2.getClass();
                                    snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var8);
                                    loadingDialogUIState = loadingDialogUIState3;
                                    totalAmountUIState3 = totalAmountUIState;
                                    transactionInfoUIState4 = transactionInfoUIState2;
                                    customerInfoUIState4 = customerInfoUIState2;
                                    chaloTextUIState5 = chaloTextUIState3;
                                    if (eBillPaymentConfirmationDataState5.b) {
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                        objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objI0 != obj) {
                                            snackbarUIState2 = snackbarUIStateA;
                                            objB2 = objI0;
                                            toolbarUIState7 = toolbarUIState4;
                                            tnCDialogUIState = (TnCDialogUIState) objB2;
                                            toolbarUIState6 = toolbarUIState7;
                                            snackbarUIState = snackbarUIState2;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            customerInfoUIState5 = customerInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                        }
                                    } else {
                                        snackbarUIState = snackbarUIStateA;
                                        tnCDialogUIState = null;
                                        toolbarUIState6 = toolbarUIState4;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                        customerInfoUIState5 = customerInfoUIState4;
                                    }
                                    return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                }
                            }
                        }
                    }
                }
                return obj;
            case 4:
                customerInfoUIState = (CustomerInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$3;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$2;
                toolbarUIState3 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                eBillPaymentConfirmationDataState4 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                transactionInfoUIState = (TransactionInfoUIState) objB2;
                electricityBillAppModel = eBillPaymentConfirmationDataState4.c;
                if (electricityBillAppModel != null) {
                    l = new Long(electricityBillAppModel.g);
                } else {
                    l = null;
                }
                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState4;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState3;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState;
                eBillPaymentConfirmationComponent$convertToUiState$1.label = 5;
                objJ0 = J0(l, eBillPaymentConfirmationComponent$convertToUiState$1);
                if (objJ0 != obj) {
                    toolbarUIState4 = toolbarUIState3;
                    eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState4;
                    transactionInfoUIState2 = transactionInfoUIState;
                    customerInfoUIState2 = customerInfoUIState;
                    objB2 = objJ0;
                    chaloTextUIState3 = chaloTextUIState2;
                    totalAmountUIState = (TotalAmountUIState) objB2;
                    if (eBillPaymentConfirmationDataState5.f2570a) {
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 6;
                        objB2 = stringProvider.b(StringEnum.LOADING_THREE_DOTS, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objB2 != obj) {
                            dialogUIStateFactory2 = dialogUIStateFactory;
                            dialogUIStateFactory2.getClass();
                            loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                            if (!eBillPaymentConfirmationDataState5.e) {
                                loadingDialogUIState = loadingDialogUIStateA;
                                snackbarUIStateA = null;
                                totalAmountUIState3 = totalAmountUIState;
                                transactionInfoUIState4 = transactionInfoUIState2;
                                customerInfoUIState4 = customerInfoUIState2;
                                chaloTextUIState5 = chaloTextUIState3;
                                if (eBillPaymentConfirmationDataState5.b) {
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objI0 != obj) {
                                        snackbarUIState2 = snackbarUIStateA;
                                        objB2 = objI0;
                                        toolbarUIState7 = toolbarUIState4;
                                        tnCDialogUIState = (TnCDialogUIState) objB2;
                                        toolbarUIState6 = toolbarUIState7;
                                        snackbarUIState = snackbarUIState2;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        customerInfoUIState5 = customerInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                    }
                                } else {
                                    snackbarUIState = snackbarUIStateA;
                                    tnCDialogUIState = null;
                                    toolbarUIState6 = toolbarUIState4;
                                    loadingDialogUIState4 = loadingDialogUIState;
                                    totalAmountUIState4 = totalAmountUIState3;
                                    transactionInfoUIState5 = transactionInfoUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    customerInfoUIState5 = customerInfoUIState4;
                                }
                                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                            }
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                            snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                            objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objB != obj) {
                                eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                                toolbarUIState5 = toolbarUIState4;
                                chaloTextUIState4 = chaloTextUIState3;
                                customerInfoUIState3 = customerInfoUIState2;
                                transactionInfoUIState3 = transactionInfoUIState2;
                                totalAmountUIState2 = totalAmountUIState;
                                loadingDialogUIState2 = loadingDialogUIStateA;
                                objB2 = objB;
                                str = (String) objB2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                                objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objB2 != obj) {
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    totalAmountUIState = totalAmountUIState2;
                                    transactionInfoUIState2 = transactionInfoUIState3;
                                    customerInfoUIState2 = customerInfoUIState3;
                                    chaloTextUIState3 = chaloTextUIState4;
                                    toolbarUIState4 = toolbarUIState5;
                                    eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                    snackbarUIStateFactory2 = snackbarUIStateFactory;
                                    y00 y00Var9 = new y00(this, 0);
                                    snackbarUIStateFactory2.getClass();
                                    snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var9);
                                    loadingDialogUIState = loadingDialogUIState3;
                                    totalAmountUIState3 = totalAmountUIState;
                                    transactionInfoUIState4 = transactionInfoUIState2;
                                    customerInfoUIState4 = customerInfoUIState2;
                                    chaloTextUIState5 = chaloTextUIState3;
                                    if (eBillPaymentConfirmationDataState5.b) {
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                        objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                        if (objI0 != obj) {
                                            snackbarUIState2 = snackbarUIStateA;
                                            objB2 = objI0;
                                            toolbarUIState7 = toolbarUIState4;
                                            tnCDialogUIState = (TnCDialogUIState) objB2;
                                            toolbarUIState6 = toolbarUIState7;
                                            snackbarUIState = snackbarUIState2;
                                            loadingDialogUIState4 = loadingDialogUIState;
                                            totalAmountUIState4 = totalAmountUIState3;
                                            transactionInfoUIState5 = transactionInfoUIState4;
                                            customerInfoUIState5 = customerInfoUIState4;
                                            chaloTextUIState6 = chaloTextUIState5;
                                        }
                                    } else {
                                        snackbarUIState = snackbarUIStateA;
                                        tnCDialogUIState = null;
                                        toolbarUIState6 = toolbarUIState4;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                        customerInfoUIState5 = customerInfoUIState4;
                                    }
                                    return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                                }
                            }
                        }
                    } else {
                        loadingDialogUIStateA = null;
                        if (!eBillPaymentConfirmationDataState5.e) {
                            loadingDialogUIState = loadingDialogUIStateA;
                            snackbarUIStateA = null;
                            totalAmountUIState3 = totalAmountUIState;
                            transactionInfoUIState4 = transactionInfoUIState2;
                            customerInfoUIState4 = customerInfoUIState2;
                            chaloTextUIState5 = chaloTextUIState3;
                            if (eBillPaymentConfirmationDataState5.b) {
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objI0 != obj) {
                                    snackbarUIState2 = snackbarUIStateA;
                                    objB2 = objI0;
                                    toolbarUIState7 = toolbarUIState4;
                                    tnCDialogUIState = (TnCDialogUIState) objB2;
                                    toolbarUIState6 = toolbarUIState7;
                                    snackbarUIState = snackbarUIState2;
                                    loadingDialogUIState4 = loadingDialogUIState;
                                    totalAmountUIState4 = totalAmountUIState3;
                                    transactionInfoUIState5 = transactionInfoUIState4;
                                    customerInfoUIState5 = customerInfoUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                }
                            } else {
                                snackbarUIState = snackbarUIStateA;
                                tnCDialogUIState = null;
                                toolbarUIState6 = toolbarUIState4;
                                loadingDialogUIState4 = loadingDialogUIState;
                                totalAmountUIState4 = totalAmountUIState3;
                                transactionInfoUIState5 = transactionInfoUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                                customerInfoUIState5 = customerInfoUIState4;
                            }
                            return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                        }
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                        snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                        objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objB != obj) {
                            eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                            toolbarUIState5 = toolbarUIState4;
                            chaloTextUIState4 = chaloTextUIState3;
                            customerInfoUIState3 = customerInfoUIState2;
                            transactionInfoUIState3 = transactionInfoUIState2;
                            totalAmountUIState2 = totalAmountUIState;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            objB2 = objB;
                            str = (String) objB2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                            objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objB2 != obj) {
                                loadingDialogUIState3 = loadingDialogUIState2;
                                totalAmountUIState = totalAmountUIState2;
                                transactionInfoUIState2 = transactionInfoUIState3;
                                customerInfoUIState2 = customerInfoUIState3;
                                chaloTextUIState3 = chaloTextUIState4;
                                toolbarUIState4 = toolbarUIState5;
                                eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                snackbarUIStateFactory2 = snackbarUIStateFactory;
                                y00 y00Var10 = new y00(this, 0);
                                snackbarUIStateFactory2.getClass();
                                snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var10);
                                loadingDialogUIState = loadingDialogUIState3;
                                totalAmountUIState3 = totalAmountUIState;
                                transactionInfoUIState4 = transactionInfoUIState2;
                                customerInfoUIState4 = customerInfoUIState2;
                                chaloTextUIState5 = chaloTextUIState3;
                                if (eBillPaymentConfirmationDataState5.b) {
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objI0 != obj) {
                                        snackbarUIState2 = snackbarUIStateA;
                                        objB2 = objI0;
                                        toolbarUIState7 = toolbarUIState4;
                                        tnCDialogUIState = (TnCDialogUIState) objB2;
                                        toolbarUIState6 = toolbarUIState7;
                                        snackbarUIState = snackbarUIState2;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        customerInfoUIState5 = customerInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                    }
                                } else {
                                    snackbarUIState = snackbarUIStateA;
                                    tnCDialogUIState = null;
                                    toolbarUIState6 = toolbarUIState4;
                                    loadingDialogUIState4 = loadingDialogUIState;
                                    totalAmountUIState4 = totalAmountUIState3;
                                    transactionInfoUIState5 = transactionInfoUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    customerInfoUIState5 = customerInfoUIState4;
                                }
                                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                            }
                        }
                    }
                }
                return obj;
            case 5:
                TransactionInfoUIState transactionInfoUIState6 = (TransactionInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$4;
                CustomerInfoUIState customerInfoUIState6 = (CustomerInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState9 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                EBillPaymentConfirmationDataState eBillPaymentConfirmationDataState8 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                toolbarUIState4 = toolbarUIState9;
                eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState8;
                customerInfoUIState2 = customerInfoUIState6;
                chaloTextUIState3 = chaloTextUIState8;
                transactionInfoUIState2 = transactionInfoUIState6;
                totalAmountUIState = (TotalAmountUIState) objB2;
                if (eBillPaymentConfirmationDataState5.f2570a) {
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = dialogUIStateFactory;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 6;
                    objB2 = stringProvider.b(StringEnum.LOADING_THREE_DOTS, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objB2 != obj) {
                        dialogUIStateFactory2 = dialogUIStateFactory;
                        dialogUIStateFactory2.getClass();
                        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                        if (!eBillPaymentConfirmationDataState5.e) {
                            loadingDialogUIState = loadingDialogUIStateA;
                            snackbarUIStateA = null;
                            totalAmountUIState3 = totalAmountUIState;
                            transactionInfoUIState4 = transactionInfoUIState2;
                            customerInfoUIState4 = customerInfoUIState2;
                            chaloTextUIState5 = chaloTextUIState3;
                            if (eBillPaymentConfirmationDataState5.b) {
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objI0 != obj) {
                                    snackbarUIState2 = snackbarUIStateA;
                                    objB2 = objI0;
                                    toolbarUIState7 = toolbarUIState4;
                                    tnCDialogUIState = (TnCDialogUIState) objB2;
                                    toolbarUIState6 = toolbarUIState7;
                                    snackbarUIState = snackbarUIState2;
                                    loadingDialogUIState4 = loadingDialogUIState;
                                    totalAmountUIState4 = totalAmountUIState3;
                                    transactionInfoUIState5 = transactionInfoUIState4;
                                    customerInfoUIState5 = customerInfoUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                }
                            } else {
                                snackbarUIState = snackbarUIStateA;
                                tnCDialogUIState = null;
                                toolbarUIState6 = toolbarUIState4;
                                loadingDialogUIState4 = loadingDialogUIState;
                                totalAmountUIState4 = totalAmountUIState3;
                                transactionInfoUIState5 = transactionInfoUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                                customerInfoUIState5 = customerInfoUIState4;
                            }
                            return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                        }
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                        snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                        objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objB != obj) {
                            eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                            toolbarUIState5 = toolbarUIState4;
                            chaloTextUIState4 = chaloTextUIState3;
                            customerInfoUIState3 = customerInfoUIState2;
                            transactionInfoUIState3 = transactionInfoUIState2;
                            totalAmountUIState2 = totalAmountUIState;
                            loadingDialogUIState2 = loadingDialogUIStateA;
                            objB2 = objB;
                            str = (String) objB2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                            objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objB2 != obj) {
                                loadingDialogUIState3 = loadingDialogUIState2;
                                totalAmountUIState = totalAmountUIState2;
                                transactionInfoUIState2 = transactionInfoUIState3;
                                customerInfoUIState2 = customerInfoUIState3;
                                chaloTextUIState3 = chaloTextUIState4;
                                toolbarUIState4 = toolbarUIState5;
                                eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                                snackbarUIStateFactory2 = snackbarUIStateFactory;
                                y00 y00Var11 = new y00(this, 0);
                                snackbarUIStateFactory2.getClass();
                                snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var11);
                                loadingDialogUIState = loadingDialogUIState3;
                                totalAmountUIState3 = totalAmountUIState;
                                transactionInfoUIState4 = transactionInfoUIState2;
                                customerInfoUIState4 = customerInfoUIState2;
                                chaloTextUIState5 = chaloTextUIState3;
                                if (eBillPaymentConfirmationDataState5.b) {
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                    if (objI0 != obj) {
                                        snackbarUIState2 = snackbarUIStateA;
                                        objB2 = objI0;
                                        toolbarUIState7 = toolbarUIState4;
                                        tnCDialogUIState = (TnCDialogUIState) objB2;
                                        toolbarUIState6 = toolbarUIState7;
                                        snackbarUIState = snackbarUIState2;
                                        loadingDialogUIState4 = loadingDialogUIState;
                                        totalAmountUIState4 = totalAmountUIState3;
                                        transactionInfoUIState5 = transactionInfoUIState4;
                                        customerInfoUIState5 = customerInfoUIState4;
                                        chaloTextUIState6 = chaloTextUIState5;
                                    }
                                } else {
                                    snackbarUIState = snackbarUIStateA;
                                    tnCDialogUIState = null;
                                    toolbarUIState6 = toolbarUIState4;
                                    loadingDialogUIState4 = loadingDialogUIState;
                                    totalAmountUIState4 = totalAmountUIState3;
                                    transactionInfoUIState5 = transactionInfoUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    customerInfoUIState5 = customerInfoUIState4;
                                }
                                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                            }
                        }
                    }
                } else {
                    loadingDialogUIStateA = null;
                    if (!eBillPaymentConfirmationDataState5.e) {
                        loadingDialogUIState = loadingDialogUIStateA;
                        snackbarUIStateA = null;
                        totalAmountUIState3 = totalAmountUIState;
                        transactionInfoUIState4 = transactionInfoUIState2;
                        customerInfoUIState4 = customerInfoUIState2;
                        chaloTextUIState5 = chaloTextUIState3;
                        if (eBillPaymentConfirmationDataState5.b) {
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                            objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objI0 != obj) {
                                snackbarUIState2 = snackbarUIStateA;
                                objB2 = objI0;
                                toolbarUIState7 = toolbarUIState4;
                                tnCDialogUIState = (TnCDialogUIState) objB2;
                                toolbarUIState6 = toolbarUIState7;
                                snackbarUIState = snackbarUIState2;
                                loadingDialogUIState4 = loadingDialogUIState;
                                totalAmountUIState4 = totalAmountUIState3;
                                transactionInfoUIState5 = transactionInfoUIState4;
                                customerInfoUIState5 = customerInfoUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                            }
                        } else {
                            snackbarUIState = snackbarUIStateA;
                            tnCDialogUIState = null;
                            toolbarUIState6 = toolbarUIState4;
                            loadingDialogUIState4 = loadingDialogUIState;
                            totalAmountUIState4 = totalAmountUIState3;
                            transactionInfoUIState5 = transactionInfoUIState4;
                            chaloTextUIState6 = chaloTextUIState5;
                            customerInfoUIState5 = customerInfoUIState4;
                        }
                        return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                    }
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                    snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                    objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objB != obj) {
                        eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                        toolbarUIState5 = toolbarUIState4;
                        chaloTextUIState4 = chaloTextUIState3;
                        customerInfoUIState3 = customerInfoUIState2;
                        transactionInfoUIState3 = transactionInfoUIState2;
                        totalAmountUIState2 = totalAmountUIState;
                        loadingDialogUIState2 = loadingDialogUIStateA;
                        objB2 = objB;
                        str = (String) objB2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                        objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objB2 != obj) {
                            loadingDialogUIState3 = loadingDialogUIState2;
                            totalAmountUIState = totalAmountUIState2;
                            transactionInfoUIState2 = transactionInfoUIState3;
                            customerInfoUIState2 = customerInfoUIState3;
                            chaloTextUIState3 = chaloTextUIState4;
                            toolbarUIState4 = toolbarUIState5;
                            eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                            snackbarUIStateFactory2 = snackbarUIStateFactory;
                            y00 y00Var12 = new y00(this, 0);
                            snackbarUIStateFactory2.getClass();
                            snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var12);
                            loadingDialogUIState = loadingDialogUIState3;
                            totalAmountUIState3 = totalAmountUIState;
                            transactionInfoUIState4 = transactionInfoUIState2;
                            customerInfoUIState4 = customerInfoUIState2;
                            chaloTextUIState5 = chaloTextUIState3;
                            if (eBillPaymentConfirmationDataState5.b) {
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                                eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                                objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                                if (objI0 != obj) {
                                    snackbarUIState2 = snackbarUIStateA;
                                    objB2 = objI0;
                                    toolbarUIState7 = toolbarUIState4;
                                    tnCDialogUIState = (TnCDialogUIState) objB2;
                                    toolbarUIState6 = toolbarUIState7;
                                    snackbarUIState = snackbarUIState2;
                                    loadingDialogUIState4 = loadingDialogUIState;
                                    totalAmountUIState4 = totalAmountUIState3;
                                    transactionInfoUIState5 = transactionInfoUIState4;
                                    customerInfoUIState5 = customerInfoUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                }
                            } else {
                                snackbarUIState = snackbarUIStateA;
                                tnCDialogUIState = null;
                                toolbarUIState6 = toolbarUIState4;
                                loadingDialogUIState4 = loadingDialogUIState;
                                totalAmountUIState4 = totalAmountUIState3;
                                transactionInfoUIState5 = transactionInfoUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                                customerInfoUIState5 = customerInfoUIState4;
                            }
                            return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                        }
                    }
                }
                return obj;
            case 6:
                dialogUIStateFactory2 = (DialogUIStateFactory) eBillPaymentConfirmationComponent$convertToUiState$1.L$6;
                totalAmountUIState = (TotalAmountUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$5;
                transactionInfoUIState2 = (TransactionInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$4;
                customerInfoUIState2 = (CustomerInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$3;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$2;
                toolbarUIState4 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                eBillPaymentConfirmationDataState5 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                dialogUIStateFactory2.getClass();
                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB2);
                if (!eBillPaymentConfirmationDataState5.e) {
                    loadingDialogUIState = loadingDialogUIStateA;
                    snackbarUIStateA = null;
                    totalAmountUIState3 = totalAmountUIState;
                    transactionInfoUIState4 = transactionInfoUIState2;
                    customerInfoUIState4 = customerInfoUIState2;
                    chaloTextUIState5 = chaloTextUIState3;
                    if (eBillPaymentConfirmationDataState5.b) {
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                        objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objI0 != obj) {
                            snackbarUIState2 = snackbarUIStateA;
                            objB2 = objI0;
                            toolbarUIState7 = toolbarUIState4;
                            tnCDialogUIState = (TnCDialogUIState) objB2;
                            toolbarUIState6 = toolbarUIState7;
                            snackbarUIState = snackbarUIState2;
                            loadingDialogUIState4 = loadingDialogUIState;
                            totalAmountUIState4 = totalAmountUIState3;
                            transactionInfoUIState5 = transactionInfoUIState4;
                            customerInfoUIState5 = customerInfoUIState4;
                            chaloTextUIState6 = chaloTextUIState5;
                        }
                    } else {
                        snackbarUIState = snackbarUIStateA;
                        tnCDialogUIState = null;
                        toolbarUIState6 = toolbarUIState4;
                        loadingDialogUIState4 = loadingDialogUIState;
                        totalAmountUIState4 = totalAmountUIState3;
                        transactionInfoUIState5 = transactionInfoUIState4;
                        chaloTextUIState6 = chaloTextUIState5;
                        customerInfoUIState5 = customerInfoUIState4;
                    }
                    return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                }
                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState5;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState4;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState3;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIStateA;
                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                eBillPaymentConfirmationComponent$convertToUiState$1.label = 7;
                objB = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                if (objB != obj) {
                    eBillPaymentConfirmationDataState6 = eBillPaymentConfirmationDataState5;
                    toolbarUIState5 = toolbarUIState4;
                    chaloTextUIState4 = chaloTextUIState3;
                    customerInfoUIState3 = customerInfoUIState2;
                    transactionInfoUIState3 = transactionInfoUIState2;
                    totalAmountUIState2 = totalAmountUIState;
                    loadingDialogUIState2 = loadingDialogUIStateA;
                    objB2 = objB;
                    str = (String) objB2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                    objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objB2 != obj) {
                        loadingDialogUIState3 = loadingDialogUIState2;
                        totalAmountUIState = totalAmountUIState2;
                        transactionInfoUIState2 = transactionInfoUIState3;
                        customerInfoUIState2 = customerInfoUIState3;
                        chaloTextUIState3 = chaloTextUIState4;
                        toolbarUIState4 = toolbarUIState5;
                        eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        y00 y00Var13 = new y00(this, 0);
                        snackbarUIStateFactory2.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var13);
                        loadingDialogUIState = loadingDialogUIState3;
                        totalAmountUIState3 = totalAmountUIState;
                        transactionInfoUIState4 = transactionInfoUIState2;
                        customerInfoUIState4 = customerInfoUIState2;
                        chaloTextUIState5 = chaloTextUIState3;
                        if (eBillPaymentConfirmationDataState5.b) {
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                            eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                            eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                            objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                            if (objI0 != obj) {
                                snackbarUIState2 = snackbarUIStateA;
                                objB2 = objI0;
                                toolbarUIState7 = toolbarUIState4;
                                tnCDialogUIState = (TnCDialogUIState) objB2;
                                toolbarUIState6 = toolbarUIState7;
                                snackbarUIState = snackbarUIState2;
                                loadingDialogUIState4 = loadingDialogUIState;
                                totalAmountUIState4 = totalAmountUIState3;
                                transactionInfoUIState5 = transactionInfoUIState4;
                                customerInfoUIState5 = customerInfoUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                            }
                        } else {
                            snackbarUIState = snackbarUIStateA;
                            tnCDialogUIState = null;
                            toolbarUIState6 = toolbarUIState4;
                            loadingDialogUIState4 = loadingDialogUIState;
                            totalAmountUIState4 = totalAmountUIState3;
                            transactionInfoUIState5 = transactionInfoUIState4;
                            chaloTextUIState6 = chaloTextUIState5;
                            customerInfoUIState5 = customerInfoUIState4;
                        }
                        return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                    }
                }
                return obj;
            case 7:
                SnackbarUIStateFactory snackbarUIStateFactory3 = (SnackbarUIStateFactory) eBillPaymentConfirmationComponent$convertToUiState$1.L$7;
                loadingDialogUIState2 = (LoadingDialogUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$6;
                totalAmountUIState2 = (TotalAmountUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$5;
                transactionInfoUIState3 = (TransactionInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$4;
                customerInfoUIState3 = (CustomerInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$3;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$2;
                toolbarUIState5 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                eBillPaymentConfirmationDataState6 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                snackbarUIStateFactory = snackbarUIStateFactory3;
                str = (String) objB2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = eBillPaymentConfirmationDataState6;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = toolbarUIState5;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = chaloTextUIState4;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = customerInfoUIState3;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = transactionInfoUIState3;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = totalAmountUIState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = loadingDialogUIState2;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = snackbarUIStateFactory;
                eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = str;
                eBillPaymentConfirmationComponent$convertToUiState$1.label = 8;
                objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], eBillPaymentConfirmationComponent$convertToUiState$1);
                if (objB2 != obj) {
                    loadingDialogUIState3 = loadingDialogUIState2;
                    totalAmountUIState = totalAmountUIState2;
                    transactionInfoUIState2 = transactionInfoUIState3;
                    customerInfoUIState2 = customerInfoUIState3;
                    chaloTextUIState3 = chaloTextUIState4;
                    toolbarUIState4 = toolbarUIState5;
                    eBillPaymentConfirmationDataState5 = eBillPaymentConfirmationDataState6;
                    snackbarUIStateFactory2 = snackbarUIStateFactory;
                    y00 y00Var14 = new y00(this, 0);
                    snackbarUIStateFactory2.getClass();
                    snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var14);
                    loadingDialogUIState = loadingDialogUIState3;
                    totalAmountUIState3 = totalAmountUIState;
                    transactionInfoUIState4 = transactionInfoUIState2;
                    customerInfoUIState4 = customerInfoUIState2;
                    chaloTextUIState5 = chaloTextUIState3;
                    if (eBillPaymentConfirmationDataState5.b) {
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                        eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                        eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                        objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                        if (objI0 != obj) {
                            snackbarUIState2 = snackbarUIStateA;
                            objB2 = objI0;
                            toolbarUIState7 = toolbarUIState4;
                            tnCDialogUIState = (TnCDialogUIState) objB2;
                            toolbarUIState6 = toolbarUIState7;
                            snackbarUIState = snackbarUIState2;
                            loadingDialogUIState4 = loadingDialogUIState;
                            totalAmountUIState4 = totalAmountUIState3;
                            transactionInfoUIState5 = transactionInfoUIState4;
                            customerInfoUIState5 = customerInfoUIState4;
                            chaloTextUIState6 = chaloTextUIState5;
                        }
                    } else {
                        snackbarUIState = snackbarUIStateA;
                        tnCDialogUIState = null;
                        toolbarUIState6 = toolbarUIState4;
                        loadingDialogUIState4 = loadingDialogUIState;
                        totalAmountUIState4 = totalAmountUIState3;
                        transactionInfoUIState5 = transactionInfoUIState4;
                        chaloTextUIState6 = chaloTextUIState5;
                        customerInfoUIState5 = customerInfoUIState4;
                    }
                    return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
                }
                return obj;
            case 8:
                str = (String) eBillPaymentConfirmationComponent$convertToUiState$1.L$8;
                snackbarUIStateFactory2 = (SnackbarUIStateFactory) eBillPaymentConfirmationComponent$convertToUiState$1.L$7;
                loadingDialogUIState3 = (LoadingDialogUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$6;
                totalAmountUIState = (TotalAmountUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$5;
                transactionInfoUIState2 = (TransactionInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$4;
                customerInfoUIState2 = (CustomerInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$3;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$2;
                toolbarUIState4 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                eBillPaymentConfirmationDataState5 = (EBillPaymentConfirmationDataState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                y00 y00Var15 = new y00(this, 0);
                snackbarUIStateFactory2.getClass();
                snackbarUIStateA = SnackbarUIStateFactory.a(str, (String) objB2, y00Var15);
                loadingDialogUIState = loadingDialogUIState3;
                totalAmountUIState3 = totalAmountUIState;
                transactionInfoUIState4 = transactionInfoUIState2;
                customerInfoUIState4 = customerInfoUIState2;
                chaloTextUIState5 = chaloTextUIState3;
                if (eBillPaymentConfirmationDataState5.b) {
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$0 = toolbarUIState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$1 = chaloTextUIState5;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$2 = customerInfoUIState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$3 = transactionInfoUIState4;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$4 = totalAmountUIState3;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$5 = loadingDialogUIState;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$6 = snackbarUIStateA;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$7 = null;
                    eBillPaymentConfirmationComponent$convertToUiState$1.L$8 = null;
                    eBillPaymentConfirmationComponent$convertToUiState$1.label = 9;
                    objI0 = I0(eBillPaymentConfirmationComponent$convertToUiState$1);
                    if (objI0 != obj) {
                        snackbarUIState2 = snackbarUIStateA;
                        objB2 = objI0;
                        toolbarUIState7 = toolbarUIState4;
                        tnCDialogUIState = (TnCDialogUIState) objB2;
                        toolbarUIState6 = toolbarUIState7;
                        snackbarUIState = snackbarUIState2;
                        loadingDialogUIState4 = loadingDialogUIState;
                        totalAmountUIState4 = totalAmountUIState3;
                        transactionInfoUIState5 = transactionInfoUIState4;
                        customerInfoUIState5 = customerInfoUIState4;
                        chaloTextUIState6 = chaloTextUIState5;
                    }
                    return obj;
                }
                snackbarUIState = snackbarUIStateA;
                tnCDialogUIState = null;
                toolbarUIState6 = toolbarUIState4;
                loadingDialogUIState4 = loadingDialogUIState;
                totalAmountUIState4 = totalAmountUIState3;
                transactionInfoUIState5 = transactionInfoUIState4;
                chaloTextUIState6 = chaloTextUIState5;
                customerInfoUIState5 = customerInfoUIState4;
                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
            case 9:
                snackbarUIState2 = (SnackbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$6;
                loadingDialogUIState = (LoadingDialogUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$5;
                totalAmountUIState3 = (TotalAmountUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$4;
                transactionInfoUIState4 = (TransactionInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$3;
                customerInfoUIState4 = (CustomerInfoUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$2;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$1;
                toolbarUIState7 = (ToolbarUIState) eBillPaymentConfirmationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB2);
                tnCDialogUIState = (TnCDialogUIState) objB2;
                toolbarUIState6 = toolbarUIState7;
                snackbarUIState = snackbarUIState2;
                loadingDialogUIState4 = loadingDialogUIState;
                totalAmountUIState4 = totalAmountUIState3;
                transactionInfoUIState5 = transactionInfoUIState4;
                customerInfoUIState5 = customerInfoUIState4;
                chaloTextUIState6 = chaloTextUIState5;
                return new EBillPaymentConfirmationViewState(toolbarUIState6, chaloTextUIState6, customerInfoUIState5, transactionInfoUIState5, totalAmountUIState4, loadingDialogUIState4, tnCDialogUIState, snackbarUIState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object G0(ElectricityBillAppModel electricityBillAppModel, ContinuationImpl continuationImpl) {
        EBillPaymentConfirmationComponent$getBillInfoUIState$1 eBillPaymentConfirmationComponent$getBillInfoUIState$1;
        float f;
        ChaloPadding chaloPadding;
        TextValueUIState[] textValueUIStateArr;
        Object objB;
        int i;
        TextValueUIState[] textValueUIStateArr2;
        TextValueUIState[] textValueUIStateArr3;
        ElectricityBillAppModel electricityBillAppModel2;
        float f2;
        TextValueUIState[] textValueUIStateArr4;
        int i2;
        ElectricityBillAppModel electricityBillAppModel3 = electricityBillAppModel;
        if (continuationImpl instanceof EBillPaymentConfirmationComponent$getBillInfoUIState$1) {
            eBillPaymentConfirmationComponent$getBillInfoUIState$1 = (EBillPaymentConfirmationComponent$getBillInfoUIState$1) continuationImpl;
            int i3 = eBillPaymentConfirmationComponent$getBillInfoUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eBillPaymentConfirmationComponent$getBillInfoUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                eBillPaymentConfirmationComponent$getBillInfoUIState$1 = new EBillPaymentConfirmationComponent$getBillInfoUIState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentConfirmationComponent$getBillInfoUIState$1 = new EBillPaymentConfirmationComponent$getBillInfoUIState$1(this, continuationImpl);
        }
        Object obj = eBillPaymentConfirmationComponent$getBillInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = eBillPaymentConfirmationComponent$getBillInfoUIState$1.label;
        TimeUtilsContract timeUtilsContract = this.p;
        ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
        StringProvider stringProvider = this.q;
        if (i4 == 0) {
            ResultKt.b(obj);
            if (electricityBillAppModel3 == null) {
                return null;
            }
            f = ChaloThemeHelper.a().d;
            float f3 = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f3, f3, f3, f3);
            textValueUIStateArr = new TextValueUIState[2];
            eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$0 = electricityBillAppModel3;
            eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$1 = textValueUIStateArr;
            eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$2 = textValueUIStateArr;
            eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$3 = chaloPadding;
            eBillPaymentConfirmationComponent$getBillInfoUIState$1.I$0 = 0;
            eBillPaymentConfirmationComponent$getBillInfoUIState$1.F$0 = f;
            eBillPaymentConfirmationComponent$getBillInfoUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.BILL_DATE, new Object[0], eBillPaymentConfirmationComponent$getBillInfoUIState$1);
            if (objB != coroutineSingletons) {
                i = 0;
                textValueUIStateArr2 = textValueUIStateArr;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            float f4 = eBillPaymentConfirmationComponent$getBillInfoUIState$1.F$0;
            int i5 = eBillPaymentConfirmationComponent$getBillInfoUIState$1.I$0;
            ChaloPadding chaloPadding2 = (ChaloPadding) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$3;
            TextValueUIState[] textValueUIStateArr5 = (TextValueUIState[]) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$2;
            TextValueUIState[] textValueUIStateArr6 = (TextValueUIState[]) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$1;
            ElectricityBillAppModel electricityBillAppModel4 = (ElectricityBillAppModel) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$0;
            ResultKt.b(obj);
            i = i5;
            chaloPadding = chaloPadding2;
            textValueUIStateArr2 = textValueUIStateArr5;
            textValueUIStateArr = textValueUIStateArr6;
            objB = obj;
            f = f4;
            electricityBillAppModel3 = electricityBillAppModel4;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = eBillPaymentConfirmationComponent$getBillInfoUIState$1.F$0;
            int i6 = eBillPaymentConfirmationComponent$getBillInfoUIState$1.I$0;
            chaloPadding = (ChaloPadding) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$3;
            TextValueUIState[] textValueUIStateArr7 = (TextValueUIState[]) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$2;
            TextValueUIState[] textValueUIStateArr8 = (TextValueUIState[]) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$1;
            electricityBillAppModel2 = (ElectricityBillAppModel) eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$0;
            ResultKt.b(obj);
            i2 = i6;
            textValueUIStateArr3 = textValueUIStateArr7;
            textValueUIStateArr4 = textValueUIStateArr8;
        }
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        textValueUIStateArr3[i2] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj, uITextStyle, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        return new TransactionInfoUIState(f2, chaloPadding, CollectionsKt.S(textValueUIStateArr4), 1);
        UITextStyle uITextStyle2 = UITextStyle.BodyMedium;
        textValueUIStateArr3 = textValueUIStateArr;
        textValueUIStateArr2[i] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB, uITextStyle2, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel3.f2538a), uITextStyle2, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$0 = electricityBillAppModel3;
        eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$1 = textValueUIStateArr3;
        eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$2 = textValueUIStateArr3;
        eBillPaymentConfirmationComponent$getBillInfoUIState$1.L$3 = chaloPadding;
        eBillPaymentConfirmationComponent$getBillInfoUIState$1.I$0 = 1;
        eBillPaymentConfirmationComponent$getBillInfoUIState$1.F$0 = f;
        eBillPaymentConfirmationComponent$getBillInfoUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.DUE_DATE, new Object[0], eBillPaymentConfirmationComponent$getBillInfoUIState$1);
        coroutineSingletons = coroutineSingletons;
        if (objB2 != coroutineSingletons) {
            electricityBillAppModel2 = electricityBillAppModel3;
            f2 = f;
            obj = objB2;
            textValueUIStateArr4 = textValueUIStateArr3;
            i2 = 1;
            UITextStyle uITextStyle3 = UITextStyle.BodyMedium;
            textValueUIStateArr3[i2] = new TextValueUIState(new TextUIState.ChaloTextUIState((String) obj, uITextStyle3, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(timeUtilsContract.g(electricityBillAppModel2.b), uITextStyle3, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            return new TransactionInfoUIState(f2, chaloPadding, CollectionsKt.S(textValueUIStateArr4), 1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object H0(ElectricityBillAppModel electricityBillAppModel, ContinuationImpl continuationImpl) {
        EBillPaymentConfirmationComponent$getConsumerInfoUIState$1 eBillPaymentConfirmationComponent$getConsumerInfoUIState$1;
        ChaloPadding chaloPadding;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof EBillPaymentConfirmationComponent$getConsumerInfoUIState$1) {
            eBillPaymentConfirmationComponent$getConsumerInfoUIState$1 = (EBillPaymentConfirmationComponent$getConsumerInfoUIState$1) continuationImpl;
            int i = eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillPaymentConfirmationComponent$getConsumerInfoUIState$1 = new EBillPaymentConfirmationComponent$getConsumerInfoUIState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentConfirmationComponent$getConsumerInfoUIState$1 = new EBillPaymentConfirmationComponent$getConsumerInfoUIState$1(this, continuationImpl);
        }
        Object obj = eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (electricityBillAppModel == null) {
                return null;
            }
            float f = ChaloThemeHelper.a().h;
            ChaloPadding chaloPadding2 = new ChaloPadding(f, f, f, f);
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(electricityBillAppModel.d, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            StringEnum stringEnum = StringEnum.EBILL_CONSUMER_NUMBER;
            Object[] objArr = {electricityBillAppModel.c};
            eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.L$0 = chaloTextUIState2;
            eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.L$1 = chaloPadding2;
            eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.F$0 = 0.0f;
            eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.label = 1;
            Object objB = this.q.b(stringEnum, objArr, eBillPaymentConfirmationComponent$getConsumerInfoUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objB;
            chaloPadding = chaloPadding2;
            chaloTextUIState = chaloTextUIState2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloPadding = (ChaloPadding) eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.L$1;
            chaloTextUIState = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$getConsumerInfoUIState$1.L$0;
            ResultKt.b(obj);
        }
        return new CustomerInfoUIState(chaloPadding, chaloTextUIState, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyLarge, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), 3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x013c  */
    /* JADX WARN: Code duplicated, block: B:37:0x015c  */
    /* JADX WARN: Code duplicated, block: B:41:0x017c  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a9 A[LOOP:0: B:43:0x019b->B:47:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0209  */
    /* JADX WARN: Code duplicated, block: B:57:0x025c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object I0(ContinuationImpl continuationImpl) {
        EBillPaymentConfirmationComponent$getTnCDialogUIState$1 eBillPaymentConfirmationComponent$getTnCDialogUIState$1;
        EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object[] objArr;
        EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent2;
        int i;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Object[] objArr2;
        EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent3;
        EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent4;
        Object[] objArr3;
        int i2;
        Object[] objArr4;
        Object[] objArr5;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ArrayList arrayList;
        int i3;
        List list;
        EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent5;
        int i4;
        ButtonUIState buttonUIState;
        Object objB;
        ButtonUIState buttonUIState2;
        List list2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        if (continuationImpl instanceof EBillPaymentConfirmationComponent$getTnCDialogUIState$1) {
            eBillPaymentConfirmationComponent$getTnCDialogUIState$1 = (EBillPaymentConfirmationComponent$getTnCDialogUIState$1) continuationImpl;
            int i5 = eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = i5 - Integer.MIN_VALUE;
            } else {
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1 = new EBillPaymentConfirmationComponent$getTnCDialogUIState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentConfirmationComponent$getTnCDialogUIState$1 = new EBillPaymentConfirmationComponent$getTnCDialogUIState$1(this, continuationImpl);
        }
        Object objB2 = eBillPaymentConfirmationComponent$getTnCDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label;
        int i7 = 2;
        int i8 = 3;
        int i9 = 1;
        StringProvider stringProvider = this.q;
        switch (i6) {
            case 0:
                ResultKt.b(objB2);
                StateFlow stateFlow = this.f;
                if (((EBillPaymentConfirmationDataState) stateFlow.getValue()).c == null) {
                    return null;
                }
                ElectricityBillAppModel electricityBillAppModel = ((EBillPaymentConfirmationDataState) stateFlow.getValue()).c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (electricityBillAppModel != null) {
                    MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
                    MixpanelUtil.a(linkedHashMap, electricityBillAppModel);
                }
                AnalyticsContract.DefaultImpls.a(this.l, "eBill payment tnc dialog shown", "", linkedHashMap, null, false, 24);
                if (this.w == null) {
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = this;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 1;
                    objB2 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS_CAPS_C, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                    if (objB2 != coroutineSingletons) {
                        eBillPaymentConfirmationComponent = this;
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156);
                        objArr = new String[3];
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = this;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 0;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 2;
                        objB2 = stringProvider.b(StringEnum.EBILL_TERM_ONE, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                        if (objB2 != coroutineSingletons) {
                            eBillPaymentConfirmationComponent2 = this;
                            i = 0;
                            chaloTextUIState2 = chaloTextUIState;
                            objArr2 = objArr;
                            objArr[i] = objB2;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState2;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr2;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = eBillPaymentConfirmationComponent2;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr2;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 1;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 3;
                            objB2 = stringProvider.b(StringEnum.EBILL_TERM_TWO, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                            if (objB2 != coroutineSingletons) {
                                eBillPaymentConfirmationComponent3 = eBillPaymentConfirmationComponent2;
                                eBillPaymentConfirmationComponent4 = eBillPaymentConfirmationComponent;
                                objArr3 = objArr2;
                                objArr3[i9] = objB2;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState2;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr2;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = eBillPaymentConfirmationComponent3;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr2;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 2;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 4;
                                objB2 = stringProvider.b(StringEnum.EBILL_TERM_THREE, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                                if (objB2 != coroutineSingletons) {
                                    i2 = 2;
                                    objArr4 = objArr2;
                                    objArr5 = objArr4;
                                    chaloTextUIState3 = chaloTextUIState2;
                                    objArr4[i2] = objB2;
                                    List listS = CollectionsKt.S(objArr5);
                                    eBillPaymentConfirmationComponent3.getClass();
                                    List list3 = listS;
                                    arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                                    i3 = 0;
                                    for (Object obj : list3) {
                                        i4 = i3 + 1;
                                        if (i3 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        String strH = cb0.h(i4, ". ");
                                        UITextStyle uITextStyle = UITextStyle.BodyMedium;
                                        ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
                                        arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                                        i3 = i4;
                                    }
                                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = arrayList;
                                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = null;
                                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = null;
                                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 5;
                                    objB2 = stringProvider.b(StringEnum.CANCEL_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                                    if (objB2 != coroutineSingletons) {
                                        list = arrayList;
                                        eBillPaymentConfirmationComponent5 = eBillPaymentConfirmationComponent4;
                                        buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i7)), 0.0f, null, 222);
                                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = list;
                                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent5;
                                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = buttonUIState;
                                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 6;
                                        objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                                        if (objB != coroutineSingletons) {
                                            buttonUIState2 = buttonUIState;
                                            objB2 = objB;
                                            list2 = list;
                                            chaloTextUIState4 = chaloTextUIState3;
                                            eBillPaymentConfirmationComponent5.w = new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState4, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i8)), 0.0f, null, 222), 9), 33);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return this.w;
            case 1:
                EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent6 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0;
                ResultKt.b(objB2);
                eBillPaymentConfirmationComponent = eBillPaymentConfirmationComponent6;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156);
                objArr = new String[3];
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = this;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 0;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 2;
                objB2 = stringProvider.b(StringEnum.EBILL_TERM_ONE, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                if (objB2 != coroutineSingletons) {
                    eBillPaymentConfirmationComponent2 = this;
                    i = 0;
                    chaloTextUIState2 = chaloTextUIState;
                    objArr2 = objArr;
                    objArr[i] = objB2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = eBillPaymentConfirmationComponent2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 1;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.EBILL_TERM_TWO, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                    if (objB2 != coroutineSingletons) {
                        eBillPaymentConfirmationComponent3 = eBillPaymentConfirmationComponent2;
                        eBillPaymentConfirmationComponent4 = eBillPaymentConfirmationComponent;
                        objArr3 = objArr2;
                        objArr3[i9] = objB2;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState2;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr2;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = eBillPaymentConfirmationComponent3;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr2;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 2;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.EBILL_TERM_THREE, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                        if (objB2 != coroutineSingletons) {
                            i2 = 2;
                            objArr4 = objArr2;
                            objArr5 = objArr4;
                            chaloTextUIState3 = chaloTextUIState2;
                            objArr4[i2] = objB2;
                            List listS2 = CollectionsKt.S(objArr5);
                            eBillPaymentConfirmationComponent3.getClass();
                            List list4 = listS2;
                            arrayList = new ArrayList(CollectionsKt.v(list4, 10));
                            i3 = 0;
                            while (r1.hasNext()) {
                                i4 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                String strH2 = cb0.h(i4, ". ");
                                UITextStyle uITextStyle2 = UITextStyle.BodyMedium;
                                ChaloColorToken.Black_60 black_61 = ChaloColorToken.Black_60.f9766a;
                                arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH2, uITextStyle2, black_61, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle2, black_61, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                                i3 = i4;
                            }
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = arrayList;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = null;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = null;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 5;
                            objB2 = stringProvider.b(StringEnum.CANCEL_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                            if (objB2 != coroutineSingletons) {
                                list = arrayList;
                                eBillPaymentConfirmationComponent5 = eBillPaymentConfirmationComponent4;
                                buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i7)), 0.0f, null, 222);
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = list;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent5;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = buttonUIState;
                                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 6;
                                objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                                if (objB != coroutineSingletons) {
                                    buttonUIState2 = buttonUIState;
                                    objB2 = objB;
                                    list2 = list;
                                    chaloTextUIState4 = chaloTextUIState3;
                                    eBillPaymentConfirmationComponent5.w = new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState4, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i8)), 0.0f, null, 222), 9), 33);
                                    return this.w;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                i = eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0;
                objArr = (String[]) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4;
                eBillPaymentConfirmationComponent2 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3;
                eBillPaymentConfirmationComponent = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2;
                objArr2 = (String[]) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0;
                ResultKt.b(objB2);
                objArr[i] = objB2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = eBillPaymentConfirmationComponent2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 1;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.EBILL_TERM_TWO, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                if (objB2 != coroutineSingletons) {
                    eBillPaymentConfirmationComponent3 = eBillPaymentConfirmationComponent2;
                    eBillPaymentConfirmationComponent4 = eBillPaymentConfirmationComponent;
                    objArr3 = objArr2;
                    objArr3[i9] = objB2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = eBillPaymentConfirmationComponent3;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 2;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.EBILL_TERM_THREE, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                    if (objB2 != coroutineSingletons) {
                        i2 = 2;
                        objArr4 = objArr2;
                        objArr5 = objArr4;
                        chaloTextUIState3 = chaloTextUIState2;
                        objArr4[i2] = objB2;
                        List listS3 = CollectionsKt.S(objArr5);
                        eBillPaymentConfirmationComponent3.getClass();
                        List list5 = listS3;
                        arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                        i3 = 0;
                        while (r1.hasNext()) {
                            i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            String strH3 = cb0.h(i4, ". ");
                            UITextStyle uITextStyle3 = UITextStyle.BodyMedium;
                            ChaloColorToken.Black_60 black_62 = ChaloColorToken.Black_60.f9766a;
                            arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH3, uITextStyle3, black_62, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle3, black_62, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                            i3 = i4;
                        }
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = arrayList;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = null;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = null;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.CANCEL_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                        if (objB2 != coroutineSingletons) {
                            list = arrayList;
                            eBillPaymentConfirmationComponent5 = eBillPaymentConfirmationComponent4;
                            buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i7)), 0.0f, null, 222);
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = list;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent5;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = buttonUIState;
                            eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 6;
                            objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                            if (objB != coroutineSingletons) {
                                buttonUIState2 = buttonUIState;
                                objB2 = objB;
                                list2 = list;
                                chaloTextUIState4 = chaloTextUIState3;
                                eBillPaymentConfirmationComponent5.w = new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState4, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i8)), 0.0f, null, 222), 9), 33);
                                return this.w;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                i9 = eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0;
                objArr3 = (String[]) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4;
                eBillPaymentConfirmationComponent3 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3;
                eBillPaymentConfirmationComponent4 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2;
                String[] strArr = (String[]) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState2 = chaloTextUIState5;
                objArr2 = strArr;
                objArr3[i9] = objB2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = objArr2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = eBillPaymentConfirmationComponent3;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = objArr2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0 = 2;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.EBILL_TERM_THREE, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                if (objB2 != coroutineSingletons) {
                    i2 = 2;
                    objArr4 = objArr2;
                    objArr5 = objArr4;
                    chaloTextUIState3 = chaloTextUIState2;
                    objArr4[i2] = objB2;
                    List listS4 = CollectionsKt.S(objArr5);
                    eBillPaymentConfirmationComponent3.getClass();
                    List list6 = listS4;
                    arrayList = new ArrayList(CollectionsKt.v(list6, 10));
                    i3 = 0;
                    while (r1.hasNext()) {
                        i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        String strH4 = cb0.h(i4, ". ");
                        UITextStyle uITextStyle4 = UITextStyle.BodyMedium;
                        ChaloColorToken.Black_60 black_63 = ChaloColorToken.Black_60.f9766a;
                        arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH4, uITextStyle4, black_63, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle4, black_63, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                        i3 = i4;
                    }
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = arrayList;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = null;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = null;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.CANCEL_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                    if (objB2 != coroutineSingletons) {
                        list = arrayList;
                        eBillPaymentConfirmationComponent5 = eBillPaymentConfirmationComponent4;
                        buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i7)), 0.0f, null, 222);
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = list;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent5;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = buttonUIState;
                        eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 6;
                        objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                        if (objB != coroutineSingletons) {
                            buttonUIState2 = buttonUIState;
                            objB2 = objB;
                            list2 = list;
                            chaloTextUIState4 = chaloTextUIState3;
                            eBillPaymentConfirmationComponent5.w = new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState4, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i8)), 0.0f, null, 222), 9), 33);
                            return this.w;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                i2 = eBillPaymentConfirmationComponent$getTnCDialogUIState$1.I$0;
                objArr4 = (String[]) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4;
                eBillPaymentConfirmationComponent3 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3;
                eBillPaymentConfirmationComponent4 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2;
                objArr5 = (String[]) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0;
                ResultKt.b(objB2);
                objArr4[i2] = objB2;
                List listS5 = CollectionsKt.S(objArr5);
                eBillPaymentConfirmationComponent3.getClass();
                List list7 = listS5;
                arrayList = new ArrayList(CollectionsKt.v(list7, 10));
                i3 = 0;
                while (r1.hasNext()) {
                    i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    String strH5 = cb0.h(i4, ". ");
                    UITextStyle uITextStyle5 = UITextStyle.BodyMedium;
                    ChaloColorToken.Black_60 black_64 = ChaloColorToken.Black_60.f9766a;
                    arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH5, uITextStyle5, black_64, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle5, black_64, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                    i3 = i4;
                }
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = arrayList;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent4;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = null;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$4 = null;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 5;
                objB2 = stringProvider.b(StringEnum.CANCEL_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                if (objB2 != coroutineSingletons) {
                    list = arrayList;
                    eBillPaymentConfirmationComponent5 = eBillPaymentConfirmationComponent4;
                    buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i7)), 0.0f, null, 222);
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = list;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent5;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = buttonUIState;
                    eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 6;
                    objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                    if (objB != coroutineSingletons) {
                        buttonUIState2 = buttonUIState;
                        objB2 = objB;
                        list2 = list;
                        chaloTextUIState4 = chaloTextUIState3;
                        eBillPaymentConfirmationComponent5.w = new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState4, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i8)), 0.0f, null, 222), 9), 33);
                        return this.w;
                    }
                }
                return coroutineSingletons;
            case 5:
                eBillPaymentConfirmationComponent5 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2;
                list = (List) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState3 = chaloTextUIState6;
                buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i7)), 0.0f, null, 222);
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0 = chaloTextUIState3;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1 = list;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2 = eBillPaymentConfirmationComponent5;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3 = buttonUIState;
                eBillPaymentConfirmationComponent$getTnCDialogUIState$1.label = 6;
                objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTnCDialogUIState$1);
                if (objB != coroutineSingletons) {
                    buttonUIState2 = buttonUIState;
                    objB2 = objB;
                    list2 = list;
                    chaloTextUIState4 = chaloTextUIState3;
                    eBillPaymentConfirmationComponent5.w = new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState4, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i8)), 0.0f, null, 222), 9), 33);
                    return this.w;
                }
                return coroutineSingletons;
            case 6:
                buttonUIState2 = (ButtonUIState) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$3;
                eBillPaymentConfirmationComponent5 = (EBillPaymentConfirmationComponent) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$2;
                List list8 = (List) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) eBillPaymentConfirmationComponent$getTnCDialogUIState$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState4 = chaloTextUIState7;
                list2 = list8;
                eBillPaymentConfirmationComponent5.w = new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState4, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new y00(this, i8)), 0.0f, null, 222), 9), 33);
                return this.w;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J0(Long l, ContinuationImpl continuationImpl) {
        EBillPaymentConfirmationComponent$getTotalAmountCardUIState$1 eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1;
        Long l2;
        float f;
        ButtonUIStateFactory buttonUIStateFactory;
        TransactionInfoUIState transactionInfoUIState;
        if (continuationImpl instanceof EBillPaymentConfirmationComponent$getTotalAmountCardUIState$1) {
            eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1 = (EBillPaymentConfirmationComponent$getTotalAmountCardUIState$1) continuationImpl;
            int i = eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1 = new EBillPaymentConfirmationComponent$getTotalAmountCardUIState$1(this, continuationImpl);
            }
        } else {
            eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1 = new EBillPaymentConfirmationComponent$getTotalAmountCardUIState$1(this, continuationImpl);
        }
        Object objB = eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.label;
        StringProvider stringProvider = this.q;
        if (i2 == 0) {
            ResultKt.b(objB);
            eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.L$0 = l;
            eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.F$0 = 0.0f;
            eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1);
            if (objB != coroutineSingletons) {
                l2 = l;
                f = 0.0f;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            f = eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.F$0;
            l2 = (Long) eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory = (ButtonUIStateFactory) eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.L$1;
            transactionInfoUIState = (TransactionInfoUIState) eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.L$0;
            ResultKt.b(objB);
        }
        return new TotalAmountUIState(transactionInfoUIState, ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new y00(this, 1), null, false, 0.0f, 60));
        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        TransactionInfoUIState transactionInfoUIState2 = new TransactionInfoUIState(f, null, CollectionsKt.R(new TextValueUIState(new TextUIState.ChaloTextUIState((String) objB, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(this.t.a(l2 != null ? l2.longValue() : 0L, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), 7);
        eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.L$0 = transactionInfoUIState2;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.L$1 = buttonUIStateFactory2;
        eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], eBillPaymentConfirmationComponent$getTotalAmountCardUIState$1);
        if (objB != coroutineSingletons) {
            buttonUIStateFactory = buttonUIStateFactory2;
            transactionInfoUIState = transactionInfoUIState2;
            return new TotalAmountUIState(transactionInfoUIState, ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new y00(this, 1), null, false, 0.0f, 60));
        }
        return coroutineSingletons;
    }

    public final void K0(EBillPaymentConfirmationIntent eBillPaymentConfirmationIntent) {
        Object objB;
        C0(eBillPaymentConfirmationIntent);
        if (eBillPaymentConfirmationIntent instanceof EBillPaymentConfirmationIntent.InternetConnectionIntent) {
            E0(new qp((EBillPaymentConfirmationIntent.InternetConnectionIntent) eBillPaymentConfirmationIntent, 20));
            return;
        }
        boolean zEquals = eBillPaymentConfirmationIntent.equals(EBillPaymentConfirmationIntent.PayBtnClickIntent.f2572a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            ElectricityBillAppModel electricityBillAppModel = ((EBillPaymentConfirmationDataState) stateFlow.getValue()).c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (electricityBillAppModel != null) {
                MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
                MixpanelUtil.a(linkedHashMap, electricityBillAppModel);
            }
            AnalyticsContract.DefaultImpls.a(this.l, "eBill payment confirmation screen payment btn clicked", "", linkedHashMap, null, false, 24);
            E0(new b00(10));
            return;
        }
        boolean zEquals2 = eBillPaymentConfirmationIntent.equals(EBillPaymentConfirmationIntent.PaymentCompletedIntent.f2573a);
        ContextScope contextScope = this.j;
        if (zEquals2) {
            BuildersKt.d(contextScope, null, null, new EBillPaymentConfirmationComponent$handlePaymentCompletedIntent$1(this, null), 3);
            return;
        }
        if (!(eBillPaymentConfirmationIntent instanceof EBillPaymentConfirmationIntent.StartingIntent)) {
            if (eBillPaymentConfirmationIntent instanceof EBillPaymentConfirmationIntent.TnCAcceptClickIntent) {
                BuildersKt.d(contextScope, null, null, new EBillPaymentConfirmationComponent$handleTnCAcceptClickIntent$1(this, (EBillPaymentConfirmationIntent.TnCAcceptClickIntent) eBillPaymentConfirmationIntent, null), 3);
                return;
            }
            if (!eBillPaymentConfirmationIntent.equals(EBillPaymentConfirmationIntent.TnCDialogDismissIntent.f2576a)) {
                throw new NoWhenBranchMatchedException();
            }
            ElectricityBillAppModel electricityBillAppModel2 = ((EBillPaymentConfirmationDataState) stateFlow.getValue()).c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (electricityBillAppModel2 != null) {
                MixpanelUtil mixpanelUtil2 = MixpanelUtil.f9617a;
                MixpanelUtil.a(linkedHashMap2, electricityBillAppModel2);
            }
            AnalyticsContract.DefaultImpls.a(this.l, "eBill payment tnc reject clicked", "", linkedHashMap2, null, false, 24);
            E0(new b00(11));
            return;
        }
        AnalyticsContract.DefaultImpls.a(this.l, "eBill payment confirmation screen opened", "", null, null, false, 28);
        E0(new b00(9));
        ChaloJson chaloJson = ChaloJson.f6455a;
        String str = ((EBillPaymentConfirmationIntent.StartingIntent) eBillPaymentConfirmationIntent).f2574a;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str, ElectricityBillAppModel.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        ElectricityBillAppModel electricityBillAppModel3 = (ElectricityBillAppModel) objB;
        if (electricityBillAppModel3 != null) {
            E0(new s00(electricityBillAppModel3, 2));
        } else {
            gf.u(null, this.k);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new EBillPaymentConfirmationDataState(false, false, null, null, false);
    }
}
