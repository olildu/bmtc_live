package app.chalo.electricitybill.ui.paymenthistory;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryIntent;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillHistoryScreenArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
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
import com.arkivanov.decompose.ComponentContext;
import defpackage.b00;
import defpackage.cy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityBillPaymentHistoryComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryIntent;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryDataState;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryViewState;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistorySideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectricityBillPaymentHistoryComponent extends ChaloBaseStateMviComponent<ElectricityPaymentHistoryIntent, ElectricityPaymentHistoryDataState, ElectricityPaymentHistoryViewState, ElectricityPaymentHistorySideEffect> {
    public final AnalyticsContract k;
    public final EBillFetchPaymentHistoryUseCase l;
    public final ChaloNavigationManager m;
    public final StringProvider n;

    public ElectricityBillPaymentHistoryComponent(ComponentContext componentContext, EBillHistoryScreenArgs eBillHistoryScreenArgs, AnalyticsContract analyticsContract, EBillFetchPaymentHistoryUseCase eBillFetchPaymentHistoryUseCase, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider) {
        super(componentContext);
        this.k = analyticsContract;
        this.l = eBillFetchPaymentHistoryUseCase;
        this.m = chaloNavigationManager;
        this.n = stringProvider;
        AnalyticsContract.DefaultImpls.a(analyticsContract, "eBill payment history screen opened", "", null, null, false, 28);
        G0(ElectricityPaymentHistoryIntent.LoadPaymentHistory.f2599a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0128  */
    /* JADX WARN: Code duplicated, block: B:37:0x015a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0160  */
    /* JADX WARN: Code duplicated, block: B:40:0x0164  */
    /* JADX WARN: Code duplicated, block: B:43:0x017b A[LOOP:0: B:41:0x0175->B:43:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0221  */
    /* JADX WARN: Code duplicated, block: B:51:0x0236  */
    /* JADX WARN: Code duplicated, block: B:55:0x0255  */
    /* JADX WARN: Code duplicated, block: B:58:0x026b  */
    /* JADX WARN: Code duplicated, block: B:60:0x026f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0287  */
    /* JADX WARN: Code duplicated, block: B:65:0x029c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(ElectricityPaymentHistoryDataState electricityPaymentHistoryDataState, ContinuationImpl continuationImpl) {
        ElectricityBillPaymentHistoryComponent$convertToUiState$1 electricityBillPaymentHistoryComponent$convertToUiState$1;
        ElectricityPaymentHistoryDataState electricityPaymentHistoryDataState2;
        ToolbarUIState toolbarUIState;
        LoadingDialogUIState loadingDialogUIState;
        ElectricityPaymentHistoryDataState electricityPaymentHistoryDataState3;
        String str;
        ChaloColorToken.Black_87 black_87;
        ElectricityPaymentHistoryScreenUIState historyAvailable;
        List list;
        ArrayList arrayList;
        List list2;
        ElectricityPaymentHistoryScreenUIState electricityPaymentHistoryScreenUIState;
        boolean z;
        SnackbarUIStateFactory snackbarUIStateFactory;
        String str2;
        SnackbarUIState snackbarUIStateA;
        Object objB;
        String str3;
        LoadingDialogUIState loadingDialogUIState2;
        ToolbarUIState toolbarUIState2;
        SnackbarUIStateFactory snackbarUIStateFactory2;
        Object objB2;
        String str4;
        Object objB3;
        String str5;
        SnackbarUIStateFactory snackbarUIStateFactory3;
        if (continuationImpl instanceof ElectricityBillPaymentHistoryComponent$convertToUiState$1) {
            electricityBillPaymentHistoryComponent$convertToUiState$1 = (ElectricityBillPaymentHistoryComponent$convertToUiState$1) continuationImpl;
            int i = electricityBillPaymentHistoryComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                electricityBillPaymentHistoryComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                electricityBillPaymentHistoryComponent$convertToUiState$1 = new ElectricityBillPaymentHistoryComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            electricityBillPaymentHistoryComponent$convertToUiState$1 = new ElectricityBillPaymentHistoryComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB4 = electricityBillPaymentHistoryComponent$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = electricityBillPaymentHistoryComponent$convertToUiState$1.label;
        StringProvider stringProvider = this.n;
        if (i2 == 0) {
            ResultKt.b(objB4);
            electricityPaymentHistoryDataState2 = electricityPaymentHistoryDataState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = electricityPaymentHistoryDataState2;
            electricityBillPaymentHistoryComponent$convertToUiState$1.label = 1;
            objB4 = stringProvider.b(StringEnum.PAYMENT_HISTORY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
            if (objB4 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    SnackbarUIStateFactory snackbarUIStateFactory4 = (SnackbarUIStateFactory) electricityBillPaymentHistoryComponent$convertToUiState$1.L$3;
                    electricityPaymentHistoryScreenUIState = (ElectricityPaymentHistoryScreenUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$2;
                    LoadingDialogUIState loadingDialogUIState3 = (LoadingDialogUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$1;
                    ToolbarUIState toolbarUIState3 = (ToolbarUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$0;
                    ResultKt.b(objB4);
                    snackbarUIStateFactory = snackbarUIStateFactory4;
                    toolbarUIState = toolbarUIState3;
                    loadingDialogUIState2 = loadingDialogUIState3;
                    str4 = (String) objB4;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState2;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$4 = str4;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.RETRY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                    if (objB3 != coroutineSingletons) {
                        str5 = str4;
                        objB4 = objB3;
                        toolbarUIState2 = toolbarUIState;
                        snackbarUIStateFactory3 = snackbarUIStateFactory;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) electricityBillPaymentHistoryComponent$convertToUiState$1.L$4;
                    snackbarUIStateFactory2 = (SnackbarUIStateFactory) electricityBillPaymentHistoryComponent$convertToUiState$1.L$3;
                    electricityPaymentHistoryScreenUIState = (ElectricityPaymentHistoryScreenUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$2;
                    loadingDialogUIState2 = (LoadingDialogUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$1;
                    toolbarUIState2 = (ToolbarUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$0;
                    ResultKt.b(objB4);
                    final int i3 = 1;
                    Function0 function0 = new Function0(this) { // from class: c10
                        public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                    break;
                                default:
                                    this.b.E0(new b00(19));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory2.getClass();
                    snackbarUIStateA = SnackbarUIStateFactory.a(str3, (String) objB4, function0);
                    toolbarUIState = toolbarUIState2;
                    loadingDialogUIState = loadingDialogUIState2;
                    return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
                }
                str5 = (String) electricityBillPaymentHistoryComponent$convertToUiState$1.L$4;
                snackbarUIStateFactory3 = (SnackbarUIStateFactory) electricityBillPaymentHistoryComponent$convertToUiState$1.L$3;
                electricityPaymentHistoryScreenUIState = (ElectricityPaymentHistoryScreenUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$2;
                loadingDialogUIState2 = (LoadingDialogUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$1;
                toolbarUIState2 = (ToolbarUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$0;
                ResultKt.b(objB4);
                final int i4 = 0;
                Function0 function1 = new Function0(this) { // from class: c10
                    public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                break;
                            default:
                                this.b.E0(new b00(19));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                snackbarUIStateFactory3.getClass();
                snackbarUIStateA = SnackbarUIStateFactory.a(str5, (String) objB4, function1);
                toolbarUIState = toolbarUIState2;
                loadingDialogUIState = loadingDialogUIState2;
                return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
            }
            toolbarUIState = (ToolbarUIState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$1;
            electricityPaymentHistoryDataState3 = (ElectricityPaymentHistoryDataState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$0;
            ResultKt.b(objB4);
            loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB4, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
            electricityPaymentHistoryDataState2 = electricityPaymentHistoryDataState3;
            str = electricityPaymentHistoryDataState2.c;
            black_87 = ChaloColorToken.Black_87.f9768a;
            if (str != null) {
                historyAvailable = new ElectricityPaymentHistoryScreenUIState.NoHistoryData(new ImageUIState(IconType.IC_EMPTY_EBILL_PAYMENT_HISTORY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), new TextUIState.ChaloTextUIState(electricityPaymentHistoryDataState2.c, UITextStyle.DisplaySmall, black_87, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
            } else {
                list = electricityPaymentHistoryDataState2.b;
                if (list == null) {
                    list2 = EmptyList.f17557a;
                } else {
                    List<ElectricityBillPaymentHistoryUiModel> list3 = list;
                    arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                    for (ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel : list3) {
                        String str6 = electricityBillPaymentHistoryUiModel.f2606a;
                        UITextStyle uITextStyle = UITextStyle.HeadlineMedium;
                        UIFontWeight uIFontWeight = UIFontWeight.Bold;
                        ArrayList arrayList2 = arrayList;
                        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(str6, uITextStyle, black_87, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel.b, uITextStyle, black_87, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        String str7 = electricityBillPaymentHistoryUiModel.d;
                        UITextStyle uITextStyle2 = UITextStyle.BodySmall;
                        ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
                        arrayList2.add(new EBillHistoryItemUIState(chaloTextUIState, chaloTextUIState2, new TextUIState.ChaloTextUIState(str7, uITextStyle2, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel.i.name(), uITextStyle2, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new cy(7, this, electricityBillPaymentHistoryUiModel))));
                        arrayList = arrayList2;
                    }
                    list2 = arrayList;
                }
                historyAvailable = new ElectricityPaymentHistoryScreenUIState.HistoryAvailable(list2);
            }
            electricityPaymentHistoryScreenUIState = historyAvailable;
            z = electricityPaymentHistoryDataState2.e;
            snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
            if (!z) {
                str2 = electricityPaymentHistoryDataState2.d;
                if (str2 != null) {
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$4 = str2;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.label = 5;
                    objB = stringProvider.b(StringEnum.OKAY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                    if (objB != coroutineSingletons) {
                        str3 = str2;
                        loadingDialogUIState2 = loadingDialogUIState;
                        objB4 = objB;
                        toolbarUIState2 = toolbarUIState;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        final int i5 = 1;
                        Function0 function2 = new Function0(this) { // from class: c10
                            public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                        break;
                                    default:
                                        this.b.E0(new b00(19));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory2.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str3, (String) objB4, function2);
                        toolbarUIState = toolbarUIState2;
                        loadingDialogUIState = loadingDialogUIState2;
                    }
                } else {
                    snackbarUIStateA = null;
                }
                return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
            }
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
            electricityBillPaymentHistoryComponent$convertToUiState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.EBILL_PAYMENT_HISTORY_ERROR_WITH_RETRY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
            if (objB2 != coroutineSingletons) {
                loadingDialogUIState2 = loadingDialogUIState;
                objB4 = objB2;
                str4 = (String) objB4;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState2;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$4 = str4;
                electricityBillPaymentHistoryComponent$convertToUiState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.RETRY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                if (objB3 != coroutineSingletons) {
                    str5 = str4;
                    objB4 = objB3;
                    toolbarUIState2 = toolbarUIState;
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    final int i6 = 0;
                    Function0 function3 = new Function0(this) { // from class: c10
                        public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                    break;
                                default:
                                    this.b.E0(new b00(19));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory3.getClass();
                    snackbarUIStateA = SnackbarUIStateFactory.a(str5, (String) objB4, function3);
                    toolbarUIState = toolbarUIState2;
                    loadingDialogUIState = loadingDialogUIState2;
                    return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
                }
            }
            return coroutineSingletons;
        }
        ElectricityPaymentHistoryDataState electricityPaymentHistoryDataState4 = (ElectricityPaymentHistoryDataState) electricityBillPaymentHistoryComponent$convertToUiState$1.L$0;
        ResultKt.b(objB4);
        electricityPaymentHistoryDataState2 = electricityPaymentHistoryDataState4;
        toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, null, null, 253);
        if (electricityPaymentHistoryDataState2.f2598a) {
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = electricityPaymentHistoryDataState2;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = toolbarUIState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.label = 2;
            objB4 = stringProvider.b(StringEnum.EBILL_PAYMENT_HISTORY_LOADING, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
            if (objB4 != coroutineSingletons) {
                electricityPaymentHistoryDataState3 = electricityPaymentHistoryDataState2;
                loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objB4, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                electricityPaymentHistoryDataState2 = electricityPaymentHistoryDataState3;
                str = electricityPaymentHistoryDataState2.c;
                black_87 = ChaloColorToken.Black_87.f9768a;
                if (str != null) {
                    historyAvailable = new ElectricityPaymentHistoryScreenUIState.NoHistoryData(new ImageUIState(IconType.IC_EMPTY_EBILL_PAYMENT_HISTORY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), new TextUIState.ChaloTextUIState(electricityPaymentHistoryDataState2.c, UITextStyle.DisplaySmall, black_87, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
                } else {
                    list = electricityPaymentHistoryDataState2.b;
                    if (list == null) {
                        list2 = EmptyList.f17557a;
                    } else {
                        List<ElectricityBillPaymentHistoryUiModel> list4 = list;
                        arrayList = new ArrayList(CollectionsKt.v(list4, 10));
                        while (r9.hasNext()) {
                            String str8 = electricityBillPaymentHistoryUiModel.f2606a;
                            UITextStyle uITextStyle3 = UITextStyle.HeadlineMedium;
                            UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
                            ArrayList arrayList3 = arrayList;
                            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(str8, uITextStyle3, black_87, 0, (UITextAlign) null, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                            TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel.b, uITextStyle3, black_87, 0, (UITextAlign) null, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                            String str9 = electricityBillPaymentHistoryUiModel.d;
                            UITextStyle uITextStyle4 = UITextStyle.BodySmall;
                            ChaloColorToken.Black_70 black_71 = ChaloColorToken.Black_70.f9767a;
                            arrayList3.add(new EBillHistoryItemUIState(chaloTextUIState3, chaloTextUIState4, new TextUIState.ChaloTextUIState(str9, uITextStyle4, black_71, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel.i.name(), uITextStyle4, black_71, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new cy(7, this, electricityBillPaymentHistoryUiModel))));
                            arrayList = arrayList3;
                        }
                        list2 = arrayList;
                    }
                    historyAvailable = new ElectricityPaymentHistoryScreenUIState.HistoryAvailable(list2);
                }
                electricityPaymentHistoryScreenUIState = historyAvailable;
                z = electricityPaymentHistoryDataState2.e;
                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                if (!z) {
                    str2 = electricityPaymentHistoryDataState2.d;
                    if (str2 != null) {
                        electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                        electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                        electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                        electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                        electricityBillPaymentHistoryComponent$convertToUiState$1.L$4 = str2;
                        electricityBillPaymentHistoryComponent$convertToUiState$1.label = 5;
                        objB = stringProvider.b(StringEnum.OKAY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                        if (objB != coroutineSingletons) {
                            str3 = str2;
                            loadingDialogUIState2 = loadingDialogUIState;
                            objB4 = objB;
                            toolbarUIState2 = toolbarUIState;
                            snackbarUIStateFactory2 = snackbarUIStateFactory;
                            final int i7 = 1;
                            Function0 function4 = new Function0(this) { // from class: c10
                                public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                            break;
                                        default:
                                            this.b.E0(new b00(19));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            snackbarUIStateFactory2.getClass();
                            snackbarUIStateA = SnackbarUIStateFactory.a(str3, (String) objB4, function4);
                            toolbarUIState = toolbarUIState2;
                            loadingDialogUIState = loadingDialogUIState2;
                        }
                    } else {
                        snackbarUIStateA = null;
                    }
                    return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
                }
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                electricityBillPaymentHistoryComponent$convertToUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.EBILL_PAYMENT_HISTORY_ERROR_WITH_RETRY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons) {
                    loadingDialogUIState2 = loadingDialogUIState;
                    objB4 = objB2;
                    str4 = (String) objB4;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState2;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$4 = str4;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.RETRY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                    if (objB3 != coroutineSingletons) {
                        str5 = str4;
                        objB4 = objB3;
                        toolbarUIState2 = toolbarUIState;
                        snackbarUIStateFactory3 = snackbarUIStateFactory;
                        final int i8 = 0;
                        Function0 function5 = new Function0(this) { // from class: c10
                            public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i8) {
                                    case 0:
                                        this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                        break;
                                    default:
                                        this.b.E0(new b00(19));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory3.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str5, (String) objB4, function5);
                        toolbarUIState = toolbarUIState2;
                        loadingDialogUIState = loadingDialogUIState2;
                        return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
                    }
                }
            }
        } else {
            loadingDialogUIState = null;
            str = electricityPaymentHistoryDataState2.c;
            black_87 = ChaloColorToken.Black_87.f9768a;
            if (str != null) {
                historyAvailable = new ElectricityPaymentHistoryScreenUIState.NoHistoryData(new ImageUIState(IconType.IC_EMPTY_EBILL_PAYMENT_HISTORY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), new TextUIState.ChaloTextUIState(electricityPaymentHistoryDataState2.c, UITextStyle.DisplaySmall, black_87, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152));
            } else {
                list = electricityPaymentHistoryDataState2.b;
                if (list == null) {
                    list2 = EmptyList.f17557a;
                } else {
                    List<ElectricityBillPaymentHistoryUiModel> list5 = list;
                    arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                    while (r9.hasNext()) {
                        String str10 = electricityBillPaymentHistoryUiModel.f2606a;
                        UITextStyle uITextStyle5 = UITextStyle.HeadlineMedium;
                        UIFontWeight uIFontWeight3 = UIFontWeight.Bold;
                        ArrayList arrayList4 = arrayList;
                        TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState(str10, uITextStyle5, black_87, 0, (UITextAlign) null, uIFontWeight3, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel.b, uITextStyle5, black_87, 0, (UITextAlign) null, uIFontWeight3, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        String str11 = electricityBillPaymentHistoryUiModel.d;
                        UITextStyle uITextStyle6 = UITextStyle.BodySmall;
                        ChaloColorToken.Black_70 black_72 = ChaloColorToken.Black_70.f9767a;
                        arrayList4.add(new EBillHistoryItemUIState(chaloTextUIState5, chaloTextUIState6, new TextUIState.ChaloTextUIState(str11, uITextStyle6, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(electricityBillPaymentHistoryUiModel.i.name(), uITextStyle6, black_72, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new cy(7, this, electricityBillPaymentHistoryUiModel))));
                        arrayList = arrayList4;
                    }
                    list2 = arrayList;
                }
                historyAvailable = new ElectricityPaymentHistoryScreenUIState.HistoryAvailable(list2);
            }
            electricityPaymentHistoryScreenUIState = historyAvailable;
            z = electricityPaymentHistoryDataState2.e;
            snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
            if (!z) {
                str2 = electricityPaymentHistoryDataState2.d;
                if (str2 != null) {
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.L$4 = str2;
                    electricityBillPaymentHistoryComponent$convertToUiState$1.label = 5;
                    objB = stringProvider.b(StringEnum.OKAY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                    if (objB != coroutineSingletons) {
                        str3 = str2;
                        loadingDialogUIState2 = loadingDialogUIState;
                        objB4 = objB;
                        toolbarUIState2 = toolbarUIState;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        final int i9 = 1;
                        Function0 function6 = new Function0(this) { // from class: c10
                            public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                        break;
                                    default:
                                        this.b.E0(new b00(19));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory2.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str3, (String) objB4, function6);
                        toolbarUIState = toolbarUIState2;
                        loadingDialogUIState = loadingDialogUIState2;
                    }
                } else {
                    snackbarUIStateA = null;
                }
                return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
            }
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
            electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
            electricityBillPaymentHistoryComponent$convertToUiState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.EBILL_PAYMENT_HISTORY_ERROR_WITH_RETRY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
            if (objB2 != coroutineSingletons) {
                loadingDialogUIState2 = loadingDialogUIState;
                objB4 = objB2;
                str4 = (String) objB4;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$0 = toolbarUIState;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$1 = loadingDialogUIState2;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$2 = electricityPaymentHistoryScreenUIState;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$3 = snackbarUIStateFactory;
                electricityBillPaymentHistoryComponent$convertToUiState$1.L$4 = str4;
                electricityBillPaymentHistoryComponent$convertToUiState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.RETRY, new Object[0], electricityBillPaymentHistoryComponent$convertToUiState$1);
                if (objB3 != coroutineSingletons) {
                    str5 = str4;
                    objB4 = objB3;
                    toolbarUIState2 = toolbarUIState;
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    final int i10 = 0;
                    Function0 function7 = new Function0(this) { // from class: c10
                        public final /* synthetic */ ElectricityBillPaymentHistoryComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    this.b.G0(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a);
                                    break;
                                default:
                                    this.b.E0(new b00(19));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory3.getClass();
                    snackbarUIStateA = SnackbarUIStateFactory.a(str5, (String) objB4, function7);
                    toolbarUIState = toolbarUIState2;
                    loadingDialogUIState = loadingDialogUIState2;
                    return new ElectricityPaymentHistoryViewState(toolbarUIState, loadingDialogUIState, electricityPaymentHistoryScreenUIState, snackbarUIStateA);
                }
            }
        }
        return coroutineSingletons;
    }

    public final void G0(ElectricityPaymentHistoryIntent electricityPaymentHistoryIntent) {
        C0(electricityPaymentHistoryIntent);
        boolean zEquals = electricityPaymentHistoryIntent.equals(ElectricityPaymentHistoryIntent.LoadPaymentHistory.f2599a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            E0(new b00(18));
            BuildersKt.d(contextScope, null, null, new ElectricityBillPaymentHistoryComponent$loadPaymentHistory$2(this, null), 3);
        } else if (electricityPaymentHistoryIntent instanceof ElectricityPaymentHistoryIntent.PaymentHistoryClicked) {
            BuildersKt.d(contextScope, null, null, new ElectricityBillPaymentHistoryComponent$handlePaymentHistoryClickedIntent$1(this, (ElectricityPaymentHistoryIntent.PaymentHistoryClicked) electricityPaymentHistoryIntent, null), 3);
        } else {
            if (!electricityPaymentHistoryIntent.equals(ElectricityPaymentHistoryIntent.RetryFetchPaymentHistory.f2601a)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContract.DefaultImpls.a(this.k, "eBill payment history retry load", "", null, null, false, 28);
            E0(new b00(18));
            BuildersKt.d(contextScope, null, null, new ElectricityBillPaymentHistoryComponent$loadPaymentHistory$2(this, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ElectricityPaymentHistoryDataState(false, null, null, null, false);
    }
}
