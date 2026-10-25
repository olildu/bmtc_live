package app.chalo.electricitybill.ui.ebillfetch;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.domain.EBillFetchUseCase;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchIntent;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.EBillAmountScreenArgs;
import app.chalo.scenes.args.EBillFetchScreenArgs;
import app.chalo.scenes.args.EBillHistoryScreenArgs;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.snackbar.SnackbarUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basicWithCharConstraint$3;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.b00;
import defpackage.n8;
import defpackage.qp;
import defpackage.s00;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchIntent;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchDataState;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchViewState;", "Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillFetchComponent extends ChaloBaseStateMviComponent<EBillFetchIntent, EBillFetchDataState, EBillFetchViewState, EBillFetchSideEffect> {
    public final NetworkStateManager k;
    public final EBillFetchUseCase l;
    public final ChaloNavigationManager m;
    public final AnalyticsContract n;
    public final StringProvider o;

    /* JADX INFO: renamed from: app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent$1", f = "EBillFetchComponent.kt", l = {57}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EBillFetchComponent.this.new AnonymousClass1(continuation);
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
                StateFlow stateFlowB = EBillFetchComponent.this.k.b();
                final EBillFetchComponent eBillFetchComponent = EBillFetchComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        eBillFetchComponent.H0(new EBillFetchIntent.InternetConnectionIntent((NetworkConnectionType) obj2));
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchComponent$Companion;", "", "", "CONSUMER_NUMBER_DEFAULT_LENGTH", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public EBillFetchComponent(ComponentContext componentContext, EBillFetchScreenArgs eBillFetchScreenArgs, NetworkStateManager networkStateManager, EBillFetchUseCase eBillFetchUseCase, ChaloNavigationManager chaloNavigationManager, AnalyticsContract analyticsContract, StringProvider stringProvider) {
        super(componentContext);
        this.k = networkStateManager;
        this.l = eBillFetchUseCase;
        this.m = chaloNavigationManager;
        this.n = analyticsContract;
        this.o = stringProvider;
        AnalyticsContract.DefaultImpls.a(analyticsContract, "eBill fetch screen opened", "", null, null, false, 28);
        D0(new AnonymousClass1(null));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x02ac A[PHI: r1 r2 r5 r6 r8 r9 r11 r12
      0x02ac: PHI (r1v13 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r1v10 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r1v17 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r2v18 java.lang.Object) = (r2v17 java.lang.Object), (r2v1 java.lang.Object) binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r5v18 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r5v14 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r5v21 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r6v16 app.chalo.uistate.dialog.LoadingDialogUIState) = (r6v12 app.chalo.uistate.dialog.LoadingDialogUIState), (r6v19 app.chalo.uistate.dialog.LoadingDialogUIState) binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r8v18 app.chalo.uistate.toolbar.ToolbarUIState) = (r8v14 app.chalo.uistate.toolbar.ToolbarUIState), (r8v21 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r9v10 app.chalo.electricitybill.ui.ebillfetch.EBillFetchUISpecs) = 
      (r9v6 app.chalo.electricitybill.ui.ebillfetch.EBillFetchUISpecs)
      (r9v13 app.chalo.electricitybill.ui.ebillfetch.EBillFetchUISpecs)
     binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v14 java.lang.String) binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r12v4 app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState) = 
      (r12v2 app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState)
      (r12v7 app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState)
     binds: [B:45:0x03ec, B:23:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0365  */
    /* JADX WARN: Code duplicated, block: B:43:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0468  */
    /* JADX WARN: Code duplicated, block: B:50:0x048a  */
    /* JADX WARN: Code duplicated, block: B:54:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0518 A[PHI: r1 r2 r5 r6 r8 r9 r11 r12 r13 r14
      0x0518: PHI (r1v22 app.chalo.uistate.button.ButtonUIState) = (r1v19 app.chalo.uistate.button.ButtonUIState), (r1v26 app.chalo.uistate.button.ButtonUIState) binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r2v28 java.lang.Object) = (r2v27 java.lang.Object), (r2v1 java.lang.Object) binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r5v25 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r5v22 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r5v27 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r6v23 app.chalo.uistate.textField.BaseTextFieldUIState$TextFieldUIState) = 
      (r6v20 app.chalo.uistate.textField.BaseTextFieldUIState$TextFieldUIState)
      (r6v26 app.chalo.uistate.textField.BaseTextFieldUIState$TextFieldUIState)
     binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r8v25 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r8v22 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r8v28 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r9v17 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r9v14 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r9v20 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r11v18 app.chalo.uistate.dialog.LoadingDialogUIState) = (r11v15 app.chalo.uistate.dialog.LoadingDialogUIState), (r11v21 app.chalo.uistate.dialog.LoadingDialogUIState) binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r12v11 app.chalo.uistate.toolbar.ToolbarUIState) = (r12v8 app.chalo.uistate.toolbar.ToolbarUIState), (r12v14 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r13v8 app.chalo.electricitybill.ui.ebillfetch.EBillFetchUISpecs) = 
      (r13v5 app.chalo.electricitybill.ui.ebillfetch.EBillFetchUISpecs)
      (r13v12 app.chalo.electricitybill.ui.ebillfetch.EBillFetchUISpecs)
     binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]
      0x0518: PHI (r14v10 app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState) = 
      (r14v7 app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState)
      (r14v13 app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState)
     binds: [B:56:0x0514, B:21:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0553  */
    /* JADX WARN: Code duplicated, block: B:63:0x057d  */
    /* JADX WARN: Code duplicated, block: B:66:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x05be  */
    /* JADX WARN: Code duplicated, block: B:71:0x0600  */
    /* JADX WARN: Code duplicated, block: B:75:0x0656  */
    /* JADX WARN: Code duplicated, block: B:77:0x0690  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x071d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0751  */
    /* JADX WARN: Code duplicated, block: B:91:0x075b  */
    /* JADX WARN: Code duplicated, block: B:94:0x078c  */
    /* JADX WARN: Code duplicated, block: B:98:0x07c8  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(EBillFetchDataState eBillFetchDataState, ContinuationImpl continuationImpl) {
        EBillFetchComponent$convertToUiState$1 eBillFetchComponent$convertToUiState$1;
        EBillFetchUISpecs eBillFetchUISpecs;
        ToolbarUIState toolbarUIState;
        LoadingDialogUIState loadingDialogUIStateA;
        EBillFetchUISpecs eBillFetchUISpecs2;
        ToolbarUIState toolbarUIState2;
        Object obj;
        DialogUIStateFactory dialogUIStateFactory;
        Object objB;
        EBillFetchDataState eBillFetchDataState2;
        LoadingDialogUIState loadingDialogUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objB2;
        EBillFetchDataState eBillFetchDataState3;
        ToolbarUIState toolbarUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        EBillFetchUISpecs eBillFetchUISpecs3;
        LoadingDialogUIState loadingDialogUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        String str;
        UITextStyle uITextStyle;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ButtonUIStateFactory buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        Object objB3;
        EBillFetchUISpecs eBillFetchUISpecs4;
        ButtonUIStateFactory buttonUIStateFactory2;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        final EBillFetchDataState eBillFetchDataState4;
        LoadingDialogUIState loadingDialogUIState3;
        ToolbarUIState toolbarUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2;
        ButtonUIState buttonUIStateF;
        ClickableTextUiState clickableTextUiState;
        final EBillFetchComponent eBillFetchComponent;
        StringProvider stringProvider;
        CoroutineSingletons coroutineSingletons;
        EBillFetchUISpecs eBillFetchUISpecs5;
        ButtonUIState buttonUIState;
        ConfirmationDialogUiState confirmationDialogUiStateB;
        Object objB4;
        DialogUIStateFactory dialogUIStateFactory2;
        ClickableTextUiState clickableTextUiState2;
        ToolbarUIState toolbarUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        ButtonUIState buttonUIState2;
        EBillFetchDataState eBillFetchDataState5;
        LoadingDialogUIState loadingDialogUIState4;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState3;
        EBillFetchUISpecs eBillFetchUISpecs6;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        String str3;
        Object objB5;
        CoroutineSingletons coroutineSingletons2;
        DialogUIStateFactory dialogUIStateFactory3;
        EBillFetchDataState eBillFetchDataState6;
        String str4;
        String str5;
        CoroutineSingletons coroutineSingletons3;
        EBillFetchDataState eBillFetchDataState7;
        StringProvider stringProvider2;
        Object objB6;
        String str6;
        EBillFetchUISpecs eBillFetchUISpecs7;
        Object obj2;
        CoroutineSingletons coroutineSingletons4;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState4;
        ButtonUIState buttonUIState3;
        LoadingDialogUIState loadingDialogUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        TextUIState.ChaloTextUIState chaloTextUIState14;
        ClickableTextUiState clickableTextUiState3;
        DialogUIStateFactory dialogUIStateFactory4;
        String str7;
        EBillFetchDataState eBillFetchDataState8;
        String str8;
        EBillFetchUISpecs eBillFetchUISpecs8;
        Object objB7;
        TextUIState.ChaloTextUIState chaloTextUIState15;
        String str9;
        String str10;
        String str11;
        TextUIState.ChaloTextUIState chaloTextUIState16;
        TextUIState.ChaloTextUIState chaloTextUIState17;
        ClickableTextUiState clickableTextUiState4;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState5;
        boolean z;
        SnackbarUIStateFactory snackbarUIStateFactory;
        CoroutineSingletons coroutineSingletons5;
        StringProvider stringProvider3;
        ConfirmationDialogUiState confirmationDialogUiState;
        EBillFetchUISpecs eBillFetchUISpecs9;
        TextUIState.ChaloTextUIState chaloTextUIState18;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState19;
        TextUIState.ChaloTextUIState chaloTextUIState20;
        SnackbarUIState snackbarUIStateA;
        LoadingDialogUIState loadingDialogUIState6;
        ToolbarUIState toolbarUIState6;
        ButtonUIState buttonUIState4;
        ClickableTextUiState clickableTextUiState5;
        Object objB8;
        CoroutineSingletons coroutineSingletons6;
        SnackbarUIStateFactory snackbarUIStateFactory2;
        ButtonUIState buttonUIState5;
        ToolbarUIState toolbarUIState7;
        TextUIState.ChaloTextUIState chaloTextUIState21;
        TextUIState.ChaloTextUIState chaloTextUIState22;
        ConfirmationDialogUiState confirmationDialogUiState2;
        LoadingDialogUIState loadingDialogUIState7;
        TextUIState.ChaloTextUIState chaloTextUIState23;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState7;
        ClickableTextUiState clickableTextUiState6;
        Object objB9;
        CoroutineSingletons coroutineSingletons7;
        ToolbarUIState toolbarUIState8;
        TextUIState.ChaloTextUIState chaloTextUIState24;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState8;
        ClickableTextUiState clickableTextUiState7;
        EBillFetchUISpecs eBillFetchUISpecs10;
        SnackbarUIStateFactory snackbarUIStateFactory3;
        ButtonUIState buttonUIState6;
        LoadingDialogUIState loadingDialogUIState8;
        TextUIState.ChaloTextUIState chaloTextUIState25;
        TextUIState.ChaloTextUIState chaloTextUIState26;
        ConfirmationDialogUiState confirmationDialogUiState3;
        String str12;
        CoroutineSingletons coroutineSingletons8;
        ToolbarUIState toolbarUIState9;
        Object objB10;
        String str13;
        TextUIState.ChaloTextUIState chaloTextUIState27;
        TextUIState.ChaloTextUIState chaloTextUIState28;
        LoadingDialogUIState loadingDialogUIState9;
        final EBillFetchDataState eBillFetchDataState9;
        EBillFetchUISpecs eBillFetchUISpecs11;
        ToolbarUIState toolbarUIState10;
        String str14;
        CoroutineSingletons coroutineSingletons9;
        SnackbarUIStateFactory snackbarUIStateFactory4;
        Object objB11;
        String str15;
        EBillFetchUISpecs eBillFetchUISpecs12;
        TextUIState.ChaloTextUIState chaloTextUIState29;
        LoadingDialogUIState loadingDialogUIState10;
        SnackbarUIStateFactory snackbarUIStateFactory5;
        EBillFetchDataState eBillFetchDataState10 = eBillFetchDataState;
        if (continuationImpl instanceof EBillFetchComponent$convertToUiState$1) {
            eBillFetchComponent$convertToUiState$1 = (EBillFetchComponent$convertToUiState$1) continuationImpl;
            int i = eBillFetchComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillFetchComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillFetchComponent$convertToUiState$1 = new EBillFetchComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            eBillFetchComponent$convertToUiState$1 = new EBillFetchComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB12 = eBillFetchComponent$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillFetchComponent$convertToUiState$1.label;
        DialogUIStateFactory dialogUIStateFactory5 = DialogUIStateFactory.f9989a;
        StringProvider stringProvider4 = this.o;
        switch (i2) {
            case 0:
                ResultKt.b(objB12);
                eBillFetchUISpecs = new EBillFetchUISpecs();
                toolbarUIState = new ToolbarUIState(null, null, null, null, null, 0.0f, null, null, 255);
                if (eBillFetchDataState10.f2558a) {
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState10;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                    eBillFetchComponent$convertToUiState$1.L$3 = dialogUIStateFactory5;
                    eBillFetchComponent$convertToUiState$1.label = 1;
                    Object objB13 = stringProvider4.b(StringEnum.LOADING_THREE_DOTS, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB13 != coroutineSingletons10) {
                        eBillFetchUISpecs2 = eBillFetchUISpecs;
                        toolbarUIState2 = toolbarUIState;
                        obj = objB13;
                        dialogUIStateFactory = dialogUIStateFactory5;
                        dialogUIStateFactory.getClass();
                        loadingDialogUIStateA = DialogUIStateFactory.a((String) obj);
                        toolbarUIState = toolbarUIState2;
                        eBillFetchUISpecs = eBillFetchUISpecs2;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState10;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIStateA;
                        eBillFetchComponent$convertToUiState$1.label = 2;
                        objB = stringProvider4.b(StringEnum.EBILL_FETCH_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB != coroutineSingletons10) {
                            eBillFetchDataState2 = eBillFetchDataState10;
                            loadingDialogUIState = loadingDialogUIStateA;
                            objB12 = objB;
                            chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState2;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState;
                            eBillFetchComponent$convertToUiState$1.label = 3;
                            objB2 = stringProvider4.b(StringEnum.EBILL_FETCH_SUBTITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB2 != coroutineSingletons10) {
                                eBillFetchDataState3 = eBillFetchDataState2;
                                toolbarUIState3 = toolbarUIState;
                                chaloTextUIState2 = chaloTextUIState;
                                objB12 = objB2;
                                eBillFetchUISpecs3 = eBillFetchUISpecs;
                                loadingDialogUIState2 = loadingDialogUIState;
                                chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                str = eBillFetchDataState3.d;
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                                eBillFetchComponent$convertToUiState$1.L$1 = str;
                                eBillFetchComponent$convertToUiState$1.L$2 = eBillFetchUISpecs3;
                                eBillFetchComponent$convertToUiState$1.L$3 = toolbarUIState3;
                                eBillFetchComponent$convertToUiState$1.L$4 = loadingDialogUIState2;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState2;
                                eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState3;
                                eBillFetchComponent$convertToUiState$1.label = 4;
                                objB12 = stringProvider4.b(StringEnum.CONSUMER_NUMBER, new Object[0], eBillFetchComponent$convertToUiState$1);
                                if (objB12 != coroutineSingletons10) {
                                    String str16 = str;
                                    uITextStyle = UITextStyle.BodyMedium;
                                    TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB12, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                                    TextFieldEventHandlerHelper$basicWithCharConstraint$3 textFieldEventHandlerHelper$basicWithCharConstraint$3C = TextFieldEventHandlerHelper.c(9, new qp(this, 18));
                                    UIKeyboardOption uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                                    ChaloColorToken.TextFieldIndicator textFieldIndicator = ChaloColorToken.TextFieldIndicator.f9859a;
                                    textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str16, textFieldEventHandlerHelper$basicWithCharConstraint$3C, null, textLabel, null, null, false, uIKeyboardOption, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator, textFieldIndicator, textFieldIndicator, textFieldIndicator, null, null, 4178943), 0.0f, 97244);
                                    str2 = eBillFetchDataState3.b;
                                    if (str2 != null) {
                                        chaloTextUIState4 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                    } else {
                                        chaloTextUIState4 = null;
                                    }
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs3;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState4;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateFactory;
                                    chaloTextUIState5 = chaloTextUIState3;
                                    eBillFetchComponent$convertToUiState$1.label = 5;
                                    objB3 = stringProvider4.b(StringEnum.NEXT_CAPS, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    if (objB3 != coroutineSingletons10) {
                                        eBillFetchUISpecs4 = eBillFetchUISpecs3;
                                        buttonUIStateFactory2 = buttonUIStateFactory;
                                        chaloTextUIState6 = chaloTextUIState2;
                                        chaloTextUIState7 = chaloTextUIState4;
                                        eBillFetchDataState4 = eBillFetchDataState3;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        toolbarUIState4 = toolbarUIState3;
                                        chaloTextUIState8 = chaloTextUIState5;
                                        textFieldUIState2 = textFieldUIState;
                                        objB12 = objB3;
                                        TextUIState.ChaloTextUIState chaloTextUIState30 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                        final int i3 = 0;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIState30, new Function0(this) { // from class: t00
                                            public final /* synthetic */ EBillFetchComponent b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i3) {
                                                    case 0:
                                                        this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState4.d));
                                                        break;
                                                    default:
                                                        this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState4.d));
                                                        break;
                                                }
                                                return Unit.f17538a;
                                            }
                                        }, null, eBillFetchDataState4.c, 0.0f, 44);
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                        eBillFetchComponent$convertToUiState$1.label = 6;
                                        objB12 = stringProvider4.b(StringEnum.VIEW_PAYMENT_HISTORY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        if (objB12 != coroutineSingletons10) {
                                            final int i4 = 0;
                                            clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                                                public final /* synthetic */ EBillFetchComponent b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i4) {
                                                        case 0:
                                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                            break;
                                                        case 1:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                            break;
                                                        case 2:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                            break;
                                                        default:
                                                            this.b.E0(new b00(4));
                                                            break;
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            }), 30);
                                            if (eBillFetchDataState4.e) {
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                                                eBillFetchComponent$convertToUiState$1.label = 7;
                                                objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                if (objB4 != coroutineSingletons10) {
                                                    coroutineSingletons10 = coroutineSingletons10;
                                                    objB12 = objB4;
                                                    dialogUIStateFactory2 = dialogUIStateFactory5;
                                                    clickableTextUiState2 = clickableTextUiState;
                                                    toolbarUIState5 = toolbarUIState4;
                                                    chaloTextUIState9 = chaloTextUIState8;
                                                    buttonUIState2 = buttonUIStateF;
                                                    eBillFetchDataState5 = eBillFetchDataState4;
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    textFieldUIState3 = textFieldUIState2;
                                                    eBillFetchUISpecs6 = eBillFetchUISpecs4;
                                                    chaloTextUIState10 = chaloTextUIState6;
                                                    chaloTextUIState11 = chaloTextUIState7;
                                                    str3 = (String) objB12;
                                                    CoroutineSingletons coroutineSingletons11 = coroutineSingletons10;
                                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                                                    eBillFetchComponent$convertToUiState$1.L$11 = str3;
                                                    eBillFetchComponent$convertToUiState$1.label = 8;
                                                    objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                    coroutineSingletons2 = coroutineSingletons11;
                                                    if (objB5 == coroutineSingletons2) {
                                                        return coroutineSingletons2;
                                                    }
                                                    dialogUIStateFactory3 = dialogUIStateFactory2;
                                                    eBillFetchDataState6 = eBillFetchDataState5;
                                                    str4 = str3;
                                                    objB12 = objB5;
                                                    str5 = (String) objB12;
                                                    coroutineSingletons3 = coroutineSingletons2;
                                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                                                    eBillFetchComponent$convertToUiState$1.L$11 = str4;
                                                    eBillFetchComponent$convertToUiState$1.L$12 = str5;
                                                    eBillFetchComponent$convertToUiState$1.label = 9;
                                                    eBillFetchDataState7 = eBillFetchDataState6;
                                                    stringProvider2 = stringProvider4;
                                                    objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                    if (objB6 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    EBillFetchUISpecs eBillFetchUISpecs13 = eBillFetchUISpecs6;
                                                    str6 = str4;
                                                    eBillFetchUISpecs7 = eBillFetchUISpecs13;
                                                    obj2 = objB6;
                                                    coroutineSingletons4 = coroutineSingletons3;
                                                    chaloTextUIState12 = chaloTextUIState10;
                                                    textFieldUIState4 = textFieldUIState3;
                                                    buttonUIState3 = buttonUIState2;
                                                    loadingDialogUIState5 = loadingDialogUIState4;
                                                    chaloTextUIState13 = chaloTextUIState9;
                                                    chaloTextUIState14 = chaloTextUIState11;
                                                    clickableTextUiState3 = clickableTextUiState2;
                                                    dialogUIStateFactory4 = dialogUIStateFactory3;
                                                    str7 = str5;
                                                    eBillFetchDataState8 = eBillFetchDataState7;
                                                    str8 = (String) obj2;
                                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                                                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                                                    eBillFetchComponent$convertToUiState$1.L$11 = str6;
                                                    eBillFetchComponent$convertToUiState$1.L$12 = str7;
                                                    eBillFetchComponent$convertToUiState$1.L$13 = str8;
                                                    eBillFetchComponent$convertToUiState$1.label = 10;
                                                    eBillFetchUISpecs8 = eBillFetchUISpecs7;
                                                    stringProvider = stringProvider2;
                                                    objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                    coroutineSingletons = coroutineSingletons4;
                                                    if (objB7 == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    chaloTextUIState15 = chaloTextUIState12;
                                                    str9 = str7;
                                                    str10 = str6;
                                                    str11 = str8;
                                                    chaloTextUIState16 = chaloTextUIState13;
                                                    chaloTextUIState17 = chaloTextUIState14;
                                                    clickableTextUiState4 = clickableTextUiState3;
                                                    textFieldUIState5 = textFieldUIState4;
                                                    buttonUIState = buttonUIState3;
                                                    loadingDialogUIState3 = loadingDialogUIState5;
                                                    String str17 = (String) objB7;
                                                    final int i5 = 1;
                                                    eBillFetchComponent = this;
                                                    Function0 function0 = new Function0(eBillFetchComponent) { // from class: u00
                                                        public final /* synthetic */ EBillFetchComponent b;

                                                        {
                                                            this.b = eBillFetchComponent;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            switch (i5) {
                                                                case 0:
                                                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                                    break;
                                                                case 1:
                                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                                    break;
                                                                case 2:
                                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                                    break;
                                                                default:
                                                                    this.b.E0(new b00(4));
                                                                    break;
                                                            }
                                                            return Unit.f17538a;
                                                        }
                                                    };
                                                    EBillFetchDataState eBillFetchDataState11 = eBillFetchDataState8;
                                                    final int i6 = 2;
                                                    Function0 function1 = new Function0(eBillFetchComponent) { // from class: u00
                                                        public final /* synthetic */ EBillFetchComponent b;

                                                        {
                                                            this.b = eBillFetchComponent;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            switch (i6) {
                                                                case 0:
                                                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                                    break;
                                                                case 1:
                                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                                    break;
                                                                case 2:
                                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                                    break;
                                                                default:
                                                                    this.b.E0(new b00(4));
                                                                    break;
                                                            }
                                                            return Unit.f17538a;
                                                        }
                                                    };
                                                    dialogUIStateFactory4.getClass();
                                                    confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str17, function0, function1);
                                                    ToolbarUIState toolbarUIState11 = toolbarUIState5;
                                                    clickableTextUiState = clickableTextUiState4;
                                                    toolbarUIState4 = toolbarUIState11;
                                                    chaloTextUIState7 = chaloTextUIState17;
                                                    textFieldUIState2 = textFieldUIState5;
                                                    eBillFetchUISpecs5 = eBillFetchUISpecs8;
                                                    chaloTextUIState8 = chaloTextUIState16;
                                                    chaloTextUIState6 = chaloTextUIState15;
                                                    eBillFetchDataState4 = eBillFetchDataState11;
                                                }
                                            } else {
                                                eBillFetchComponent = this;
                                                ButtonUIState buttonUIState7 = buttonUIStateF;
                                                stringProvider = stringProvider4;
                                                coroutineSingletons = coroutineSingletons10;
                                                eBillFetchUISpecs5 = eBillFetchUISpecs4;
                                                buttonUIState = buttonUIState7;
                                                confirmationDialogUiStateB = null;
                                            }
                                            z = eBillFetchDataState4.f;
                                            snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                            if (z) {
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                                eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                                                eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                                                eBillFetchComponent$convertToUiState$1.L$12 = null;
                                                eBillFetchComponent$convertToUiState$1.L$13 = null;
                                                eBillFetchComponent$convertToUiState$1.label = 11;
                                                objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                coroutineSingletons7 = coroutineSingletons;
                                                if (objB9 == coroutineSingletons7) {
                                                    return coroutineSingletons7;
                                                }
                                                ConfirmationDialogUiState confirmationDialogUiState4 = confirmationDialogUiStateB;
                                                objB12 = objB9;
                                                toolbarUIState8 = toolbarUIState4;
                                                chaloTextUIState24 = chaloTextUIState6;
                                                textFieldUIState8 = textFieldUIState2;
                                                clickableTextUiState7 = clickableTextUiState;
                                                eBillFetchUISpecs10 = eBillFetchUISpecs5;
                                                snackbarUIStateFactory3 = snackbarUIStateFactory;
                                                buttonUIState6 = buttonUIState;
                                                loadingDialogUIState8 = loadingDialogUIState3;
                                                chaloTextUIState25 = chaloTextUIState8;
                                                chaloTextUIState26 = chaloTextUIState7;
                                                confirmationDialogUiState3 = confirmationDialogUiState4;
                                                str12 = (String) objB12;
                                                coroutineSingletons8 = coroutineSingletons7;
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                                                eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                                                eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                                                eBillFetchComponent$convertToUiState$1.L$12 = str12;
                                                toolbarUIState9 = toolbarUIState8;
                                                eBillFetchComponent$convertToUiState$1.label = 12;
                                                objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                if (objB10 == coroutineSingletons8) {
                                                    return coroutineSingletons8;
                                                }
                                                str13 = str12;
                                                chaloTextUIState27 = chaloTextUIState25;
                                                chaloTextUIState28 = chaloTextUIState24;
                                                loadingDialogUIState9 = loadingDialogUIState8;
                                                eBillFetchDataState9 = eBillFetchDataState4;
                                                eBillFetchUISpecs11 = eBillFetchUISpecs10;
                                                toolbarUIState10 = toolbarUIState9;
                                                objB12 = objB10;
                                                final int i7 = 1;
                                                Function0 function2 = new Function0(this) { // from class: t00
                                                    public final /* synthetic */ EBillFetchComponent b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        switch (i7) {
                                                            case 0:
                                                                this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                                                break;
                                                            default:
                                                                this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                                                break;
                                                        }
                                                        return Unit.f17538a;
                                                    }
                                                };
                                                snackbarUIStateFactory3.getClass();
                                                chaloTextUIState19 = chaloTextUIState27;
                                                snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function2);
                                                confirmationDialogUiState = confirmationDialogUiState3;
                                                clickableTextUiState5 = clickableTextUiState7;
                                                buttonUIState4 = buttonUIState6;
                                                chaloTextUIState18 = chaloTextUIState26;
                                                textFieldUIState6 = textFieldUIState8;
                                                chaloTextUIState20 = chaloTextUIState28;
                                                loadingDialogUIState6 = loadingDialogUIState9;
                                                toolbarUIState6 = toolbarUIState10;
                                                eBillFetchUISpecs9 = eBillFetchUISpecs11;
                                            } else {
                                                coroutineSingletons5 = coroutineSingletons;
                                                stringProvider3 = stringProvider;
                                                if (eBillFetchDataState4.g) {
                                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                                    eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                                    eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                                                    eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                                                    eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                                                    eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                                                    eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                                                    eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                                                    eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                                                    eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                                                    eBillFetchComponent$convertToUiState$1.L$11 = null;
                                                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                                                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                                                    eBillFetchComponent$convertToUiState$1.label = 13;
                                                    objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                    coroutineSingletons6 = coroutineSingletons5;
                                                    if (objB8 == coroutineSingletons6) {
                                                        return coroutineSingletons6;
                                                    }
                                                    ConfirmationDialogUiState confirmationDialogUiState5 = confirmationDialogUiStateB;
                                                    objB12 = objB8;
                                                    snackbarUIStateFactory2 = snackbarUIStateFactory;
                                                    buttonUIState5 = buttonUIState;
                                                    toolbarUIState7 = toolbarUIState4;
                                                    chaloTextUIState21 = chaloTextUIState8;
                                                    chaloTextUIState22 = chaloTextUIState7;
                                                    confirmationDialogUiState2 = confirmationDialogUiState5;
                                                    loadingDialogUIState7 = loadingDialogUIState3;
                                                    chaloTextUIState23 = chaloTextUIState6;
                                                    textFieldUIState7 = textFieldUIState2;
                                                    clickableTextUiState6 = clickableTextUiState;
                                                    str14 = (String) objB12;
                                                    coroutineSingletons9 = coroutineSingletons6;
                                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                                    eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                                                    eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                                                    eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                                                    eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                                                    eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                                                    eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                                                    eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                                                    eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                                                    eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                                                    eBillFetchComponent$convertToUiState$1.L$11 = str14;
                                                    snackbarUIStateFactory4 = snackbarUIStateFactory2;
                                                    eBillFetchComponent$convertToUiState$1.label = 14;
                                                    objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                    if (objB11 == coroutineSingletons9) {
                                                        return coroutineSingletons9;
                                                    }
                                                    str15 = str14;
                                                    eBillFetchUISpecs12 = eBillFetchUISpecs5;
                                                    chaloTextUIState29 = chaloTextUIState21;
                                                    loadingDialogUIState10 = loadingDialogUIState7;
                                                    snackbarUIStateFactory5 = snackbarUIStateFactory4;
                                                    objB12 = objB11;
                                                    final int i8 = 3;
                                                    Function0 function3 = new Function0(this) { // from class: u00
                                                        public final /* synthetic */ EBillFetchComponent b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            switch (i8) {
                                                                case 0:
                                                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                                    break;
                                                                case 1:
                                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                                    break;
                                                                case 2:
                                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                                    break;
                                                                default:
                                                                    this.b.E0(new b00(4));
                                                                    break;
                                                            }
                                                            return Unit.f17538a;
                                                        }
                                                    };
                                                    snackbarUIStateFactory5.getClass();
                                                    snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function3);
                                                    eBillFetchUISpecs9 = eBillFetchUISpecs12;
                                                    confirmationDialogUiState = confirmationDialogUiState2;
                                                    clickableTextUiState5 = clickableTextUiState6;
                                                    buttonUIState4 = buttonUIState5;
                                                    chaloTextUIState18 = chaloTextUIState22;
                                                    textFieldUIState6 = textFieldUIState7;
                                                    chaloTextUIState19 = chaloTextUIState29;
                                                    chaloTextUIState20 = chaloTextUIState23;
                                                    loadingDialogUIState6 = loadingDialogUIState10;
                                                    toolbarUIState6 = toolbarUIState7;
                                                } else {
                                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                                    eBillFetchUISpecs9 = eBillFetchUISpecs5;
                                                    chaloTextUIState18 = chaloTextUIState7;
                                                    textFieldUIState6 = textFieldUIState2;
                                                    chaloTextUIState19 = chaloTextUIState8;
                                                    chaloTextUIState20 = chaloTextUIState6;
                                                    snackbarUIStateA = null;
                                                    loadingDialogUIState6 = loadingDialogUIState3;
                                                    toolbarUIState6 = toolbarUIState4;
                                                    buttonUIState4 = buttonUIState;
                                                    clickableTextUiState5 = clickableTextUiState;
                                                }
                                            }
                                            return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    loadingDialogUIStateA = null;
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState10;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIStateA;
                    eBillFetchComponent$convertToUiState$1.label = 2;
                    objB = stringProvider4.b(StringEnum.EBILL_FETCH_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB != coroutineSingletons10) {
                        eBillFetchDataState2 = eBillFetchDataState10;
                        loadingDialogUIState = loadingDialogUIStateA;
                        objB12 = objB;
                        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState2;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState;
                        eBillFetchComponent$convertToUiState$1.label = 3;
                        objB2 = stringProvider4.b(StringEnum.EBILL_FETCH_SUBTITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB2 != coroutineSingletons10) {
                            eBillFetchDataState3 = eBillFetchDataState2;
                            toolbarUIState3 = toolbarUIState;
                            chaloTextUIState2 = chaloTextUIState;
                            objB12 = objB2;
                            eBillFetchUISpecs3 = eBillFetchUISpecs;
                            loadingDialogUIState2 = loadingDialogUIState;
                            chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            str = eBillFetchDataState3.d;
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                            eBillFetchComponent$convertToUiState$1.L$1 = str;
                            eBillFetchComponent$convertToUiState$1.L$2 = eBillFetchUISpecs3;
                            eBillFetchComponent$convertToUiState$1.L$3 = toolbarUIState3;
                            eBillFetchComponent$convertToUiState$1.L$4 = loadingDialogUIState2;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState2;
                            eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState3;
                            eBillFetchComponent$convertToUiState$1.label = 4;
                            objB12 = stringProvider4.b(StringEnum.CONSUMER_NUMBER, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB12 != coroutineSingletons10) {
                                String str18 = str;
                                uITextStyle = UITextStyle.BodyMedium;
                                TextFieldLabelPlaceholderUIState.TextLabel textLabel2 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB12, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                                TextFieldEventHandlerHelper$basicWithCharConstraint$3 textFieldEventHandlerHelper$basicWithCharConstraint$3C2 = TextFieldEventHandlerHelper.c(9, new qp(this, 18));
                                UIKeyboardOption uIKeyboardOption2 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                                ChaloColorToken.TextFieldIndicator textFieldIndicator2 = ChaloColorToken.TextFieldIndicator.f9859a;
                                textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str18, textFieldEventHandlerHelper$basicWithCharConstraint$3C2, null, textLabel2, null, null, false, uIKeyboardOption2, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator2, textFieldIndicator2, textFieldIndicator2, textFieldIndicator2, null, null, 4178943), 0.0f, 97244);
                                str2 = eBillFetchDataState3.b;
                                if (str2 != null) {
                                    chaloTextUIState4 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                } else {
                                    chaloTextUIState4 = null;
                                }
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs3;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState3;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState2;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState3;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState4;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateFactory;
                                chaloTextUIState5 = chaloTextUIState3;
                                eBillFetchComponent$convertToUiState$1.label = 5;
                                objB3 = stringProvider4.b(StringEnum.NEXT_CAPS, new Object[0], eBillFetchComponent$convertToUiState$1);
                                if (objB3 != coroutineSingletons10) {
                                    eBillFetchUISpecs4 = eBillFetchUISpecs3;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    chaloTextUIState6 = chaloTextUIState2;
                                    chaloTextUIState7 = chaloTextUIState4;
                                    eBillFetchDataState4 = eBillFetchDataState3;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    toolbarUIState4 = toolbarUIState3;
                                    chaloTextUIState8 = chaloTextUIState5;
                                    textFieldUIState2 = textFieldUIState;
                                    objB12 = objB3;
                                    TextUIState.ChaloTextUIState chaloTextUIState31 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                    final int i9 = 0;
                                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIState31, new Function0(this) { // from class: t00
                                        public final /* synthetic */ EBillFetchComponent b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i9) {
                                                case 0:
                                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState4.d));
                                                    break;
                                                default:
                                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState4.d));
                                                    break;
                                            }
                                            return Unit.f17538a;
                                        }
                                    }, null, eBillFetchDataState4.c, 0.0f, 44);
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                    eBillFetchComponent$convertToUiState$1.label = 6;
                                    objB12 = stringProvider4.b(StringEnum.VIEW_PAYMENT_HISTORY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    if (objB12 != coroutineSingletons10) {
                                        final int i10 = 0;
                                        clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                                            public final /* synthetic */ EBillFetchComponent b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i10) {
                                                    case 0:
                                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                        break;
                                                    case 1:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                        break;
                                                    case 2:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                        break;
                                                    default:
                                                        this.b.E0(new b00(4));
                                                        break;
                                                }
                                                return Unit.f17538a;
                                            }
                                        }), 30);
                                        if (eBillFetchDataState4.e) {
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                                            eBillFetchComponent$convertToUiState$1.label = 7;
                                            objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            if (objB4 != coroutineSingletons10) {
                                                coroutineSingletons10 = coroutineSingletons10;
                                                objB12 = objB4;
                                                dialogUIStateFactory2 = dialogUIStateFactory5;
                                                clickableTextUiState2 = clickableTextUiState;
                                                toolbarUIState5 = toolbarUIState4;
                                                chaloTextUIState9 = chaloTextUIState8;
                                                buttonUIState2 = buttonUIStateF;
                                                eBillFetchDataState5 = eBillFetchDataState4;
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                textFieldUIState3 = textFieldUIState2;
                                                eBillFetchUISpecs6 = eBillFetchUISpecs4;
                                                chaloTextUIState10 = chaloTextUIState6;
                                                chaloTextUIState11 = chaloTextUIState7;
                                                str3 = (String) objB12;
                                                CoroutineSingletons coroutineSingletons12 = coroutineSingletons10;
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                                                eBillFetchComponent$convertToUiState$1.L$11 = str3;
                                                eBillFetchComponent$convertToUiState$1.label = 8;
                                                objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                coroutineSingletons2 = coroutineSingletons12;
                                                if (objB5 == coroutineSingletons2) {
                                                    return coroutineSingletons2;
                                                }
                                                dialogUIStateFactory3 = dialogUIStateFactory2;
                                                eBillFetchDataState6 = eBillFetchDataState5;
                                                str4 = str3;
                                                objB12 = objB5;
                                                str5 = (String) objB12;
                                                coroutineSingletons3 = coroutineSingletons2;
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                                                eBillFetchComponent$convertToUiState$1.L$11 = str4;
                                                eBillFetchComponent$convertToUiState$1.L$12 = str5;
                                                eBillFetchComponent$convertToUiState$1.label = 9;
                                                eBillFetchDataState7 = eBillFetchDataState6;
                                                stringProvider2 = stringProvider4;
                                                objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                if (objB6 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                EBillFetchUISpecs eBillFetchUISpecs14 = eBillFetchUISpecs6;
                                                str6 = str4;
                                                eBillFetchUISpecs7 = eBillFetchUISpecs14;
                                                obj2 = objB6;
                                                coroutineSingletons4 = coroutineSingletons3;
                                                chaloTextUIState12 = chaloTextUIState10;
                                                textFieldUIState4 = textFieldUIState3;
                                                buttonUIState3 = buttonUIState2;
                                                loadingDialogUIState5 = loadingDialogUIState4;
                                                chaloTextUIState13 = chaloTextUIState9;
                                                chaloTextUIState14 = chaloTextUIState11;
                                                clickableTextUiState3 = clickableTextUiState2;
                                                dialogUIStateFactory4 = dialogUIStateFactory3;
                                                str7 = str5;
                                                eBillFetchDataState8 = eBillFetchDataState7;
                                                str8 = (String) obj2;
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                                                eBillFetchComponent$convertToUiState$1.L$11 = str6;
                                                eBillFetchComponent$convertToUiState$1.L$12 = str7;
                                                eBillFetchComponent$convertToUiState$1.L$13 = str8;
                                                eBillFetchComponent$convertToUiState$1.label = 10;
                                                eBillFetchUISpecs8 = eBillFetchUISpecs7;
                                                stringProvider = stringProvider2;
                                                objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                coroutineSingletons = coroutineSingletons4;
                                                if (objB7 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                chaloTextUIState15 = chaloTextUIState12;
                                                str9 = str7;
                                                str10 = str6;
                                                str11 = str8;
                                                chaloTextUIState16 = chaloTextUIState13;
                                                chaloTextUIState17 = chaloTextUIState14;
                                                clickableTextUiState4 = clickableTextUiState3;
                                                textFieldUIState5 = textFieldUIState4;
                                                buttonUIState = buttonUIState3;
                                                loadingDialogUIState3 = loadingDialogUIState5;
                                                String str19 = (String) objB7;
                                                final int i11 = 1;
                                                eBillFetchComponent = this;
                                                Function0 function4 = new Function0(eBillFetchComponent) { // from class: u00
                                                    public final /* synthetic */ EBillFetchComponent b;

                                                    {
                                                        this.b = eBillFetchComponent;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        switch (i11) {
                                                            case 0:
                                                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                                break;
                                                            case 1:
                                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                                break;
                                                            case 2:
                                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                                break;
                                                            default:
                                                                this.b.E0(new b00(4));
                                                                break;
                                                        }
                                                        return Unit.f17538a;
                                                    }
                                                };
                                                EBillFetchDataState eBillFetchDataState12 = eBillFetchDataState8;
                                                final int i12 = 2;
                                                Function0 function5 = new Function0(eBillFetchComponent) { // from class: u00
                                                    public final /* synthetic */ EBillFetchComponent b;

                                                    {
                                                        this.b = eBillFetchComponent;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        switch (i12) {
                                                            case 0:
                                                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                                break;
                                                            case 1:
                                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                                break;
                                                            case 2:
                                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                                break;
                                                            default:
                                                                this.b.E0(new b00(4));
                                                                break;
                                                        }
                                                        return Unit.f17538a;
                                                    }
                                                };
                                                dialogUIStateFactory4.getClass();
                                                confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str19, function4, function5);
                                                ToolbarUIState toolbarUIState12 = toolbarUIState5;
                                                clickableTextUiState = clickableTextUiState4;
                                                toolbarUIState4 = toolbarUIState12;
                                                chaloTextUIState7 = chaloTextUIState17;
                                                textFieldUIState2 = textFieldUIState5;
                                                eBillFetchUISpecs5 = eBillFetchUISpecs8;
                                                chaloTextUIState8 = chaloTextUIState16;
                                                chaloTextUIState6 = chaloTextUIState15;
                                                eBillFetchDataState4 = eBillFetchDataState12;
                                            }
                                        } else {
                                            eBillFetchComponent = this;
                                            ButtonUIState buttonUIState8 = buttonUIStateF;
                                            stringProvider = stringProvider4;
                                            coroutineSingletons = coroutineSingletons10;
                                            eBillFetchUISpecs5 = eBillFetchUISpecs4;
                                            buttonUIState = buttonUIState8;
                                            confirmationDialogUiStateB = null;
                                        }
                                        z = eBillFetchDataState4.f;
                                        snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                        if (z) {
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                            eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                                            eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                                            eBillFetchComponent$convertToUiState$1.L$12 = null;
                                            eBillFetchComponent$convertToUiState$1.L$13 = null;
                                            eBillFetchComponent$convertToUiState$1.label = 11;
                                            objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            coroutineSingletons7 = coroutineSingletons;
                                            if (objB9 == coroutineSingletons7) {
                                                return coroutineSingletons7;
                                            }
                                            ConfirmationDialogUiState confirmationDialogUiState6 = confirmationDialogUiStateB;
                                            objB12 = objB9;
                                            toolbarUIState8 = toolbarUIState4;
                                            chaloTextUIState24 = chaloTextUIState6;
                                            textFieldUIState8 = textFieldUIState2;
                                            clickableTextUiState7 = clickableTextUiState;
                                            eBillFetchUISpecs10 = eBillFetchUISpecs5;
                                            snackbarUIStateFactory3 = snackbarUIStateFactory;
                                            buttonUIState6 = buttonUIState;
                                            loadingDialogUIState8 = loadingDialogUIState3;
                                            chaloTextUIState25 = chaloTextUIState8;
                                            chaloTextUIState26 = chaloTextUIState7;
                                            confirmationDialogUiState3 = confirmationDialogUiState6;
                                            str12 = (String) objB12;
                                            coroutineSingletons8 = coroutineSingletons7;
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                                            eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                                            eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                                            eBillFetchComponent$convertToUiState$1.L$12 = str12;
                                            toolbarUIState9 = toolbarUIState8;
                                            eBillFetchComponent$convertToUiState$1.label = 12;
                                            objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            if (objB10 == coroutineSingletons8) {
                                                return coroutineSingletons8;
                                            }
                                            str13 = str12;
                                            chaloTextUIState27 = chaloTextUIState25;
                                            chaloTextUIState28 = chaloTextUIState24;
                                            loadingDialogUIState9 = loadingDialogUIState8;
                                            eBillFetchDataState9 = eBillFetchDataState4;
                                            eBillFetchUISpecs11 = eBillFetchUISpecs10;
                                            toolbarUIState10 = toolbarUIState9;
                                            objB12 = objB10;
                                            final int i13 = 1;
                                            Function0 function6 = new Function0(this) { // from class: t00
                                                public final /* synthetic */ EBillFetchComponent b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                                            break;
                                                        default:
                                                            this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                                            break;
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            };
                                            snackbarUIStateFactory3.getClass();
                                            chaloTextUIState19 = chaloTextUIState27;
                                            snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function6);
                                            confirmationDialogUiState = confirmationDialogUiState3;
                                            clickableTextUiState5 = clickableTextUiState7;
                                            buttonUIState4 = buttonUIState6;
                                            chaloTextUIState18 = chaloTextUIState26;
                                            textFieldUIState6 = textFieldUIState8;
                                            chaloTextUIState20 = chaloTextUIState28;
                                            loadingDialogUIState6 = loadingDialogUIState9;
                                            toolbarUIState6 = toolbarUIState10;
                                            eBillFetchUISpecs9 = eBillFetchUISpecs11;
                                        } else {
                                            coroutineSingletons5 = coroutineSingletons;
                                            stringProvider3 = stringProvider;
                                            if (eBillFetchDataState4.g) {
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                                eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                                eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                                                eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                                                eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                                                eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                                                eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                                                eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                                                eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                                                eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                                                eBillFetchComponent$convertToUiState$1.L$11 = null;
                                                eBillFetchComponent$convertToUiState$1.L$12 = null;
                                                eBillFetchComponent$convertToUiState$1.L$13 = null;
                                                eBillFetchComponent$convertToUiState$1.label = 13;
                                                objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                coroutineSingletons6 = coroutineSingletons5;
                                                if (objB8 == coroutineSingletons6) {
                                                    return coroutineSingletons6;
                                                }
                                                ConfirmationDialogUiState confirmationDialogUiState7 = confirmationDialogUiStateB;
                                                objB12 = objB8;
                                                snackbarUIStateFactory2 = snackbarUIStateFactory;
                                                buttonUIState5 = buttonUIState;
                                                toolbarUIState7 = toolbarUIState4;
                                                chaloTextUIState21 = chaloTextUIState8;
                                                chaloTextUIState22 = chaloTextUIState7;
                                                confirmationDialogUiState2 = confirmationDialogUiState7;
                                                loadingDialogUIState7 = loadingDialogUIState3;
                                                chaloTextUIState23 = chaloTextUIState6;
                                                textFieldUIState7 = textFieldUIState2;
                                                clickableTextUiState6 = clickableTextUiState;
                                                str14 = (String) objB12;
                                                coroutineSingletons9 = coroutineSingletons6;
                                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                                eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                                                eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                                                eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                                                eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                                                eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                                                eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                                                eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                                                eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                                                eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                                                eBillFetchComponent$convertToUiState$1.L$11 = str14;
                                                snackbarUIStateFactory4 = snackbarUIStateFactory2;
                                                eBillFetchComponent$convertToUiState$1.label = 14;
                                                objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                                if (objB11 == coroutineSingletons9) {
                                                    return coroutineSingletons9;
                                                }
                                                str15 = str14;
                                                eBillFetchUISpecs12 = eBillFetchUISpecs5;
                                                chaloTextUIState29 = chaloTextUIState21;
                                                loadingDialogUIState10 = loadingDialogUIState7;
                                                snackbarUIStateFactory5 = snackbarUIStateFactory4;
                                                objB12 = objB11;
                                                final int i14 = 3;
                                                Function0 function7 = new Function0(this) { // from class: u00
                                                    public final /* synthetic */ EBillFetchComponent b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        switch (i14) {
                                                            case 0:
                                                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                                break;
                                                            case 1:
                                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                                break;
                                                            case 2:
                                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                                break;
                                                            default:
                                                                this.b.E0(new b00(4));
                                                                break;
                                                        }
                                                        return Unit.f17538a;
                                                    }
                                                };
                                                snackbarUIStateFactory5.getClass();
                                                snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function7);
                                                eBillFetchUISpecs9 = eBillFetchUISpecs12;
                                                confirmationDialogUiState = confirmationDialogUiState2;
                                                clickableTextUiState5 = clickableTextUiState6;
                                                buttonUIState4 = buttonUIState5;
                                                chaloTextUIState18 = chaloTextUIState22;
                                                textFieldUIState6 = textFieldUIState7;
                                                chaloTextUIState19 = chaloTextUIState29;
                                                chaloTextUIState20 = chaloTextUIState23;
                                                loadingDialogUIState6 = loadingDialogUIState10;
                                                toolbarUIState6 = toolbarUIState7;
                                            } else {
                                                confirmationDialogUiState = confirmationDialogUiStateB;
                                                eBillFetchUISpecs9 = eBillFetchUISpecs5;
                                                chaloTextUIState18 = chaloTextUIState7;
                                                textFieldUIState6 = textFieldUIState2;
                                                chaloTextUIState19 = chaloTextUIState8;
                                                chaloTextUIState20 = chaloTextUIState6;
                                                snackbarUIStateA = null;
                                                loadingDialogUIState6 = loadingDialogUIState3;
                                                toolbarUIState6 = toolbarUIState4;
                                                buttonUIState4 = buttonUIState;
                                                clickableTextUiState5 = clickableTextUiState;
                                            }
                                        }
                                        return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
                                    }
                                }
                            }
                        }
                    }
                }
                coroutineSingletons10 = coroutineSingletons10;
                return coroutineSingletons10;
            case 1:
                DialogUIStateFactory dialogUIStateFactory6 = (DialogUIStateFactory) eBillFetchComponent$convertToUiState$1.L$3;
                ToolbarUIState toolbarUIState13 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                EBillFetchUISpecs eBillFetchUISpecs15 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchDataState eBillFetchDataState13 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                dialogUIStateFactory = dialogUIStateFactory6;
                eBillFetchDataState10 = eBillFetchDataState13;
                eBillFetchUISpecs2 = eBillFetchUISpecs15;
                toolbarUIState2 = toolbarUIState13;
                obj = objB12;
                dialogUIStateFactory.getClass();
                loadingDialogUIStateA = DialogUIStateFactory.a((String) obj);
                toolbarUIState = toolbarUIState2;
                eBillFetchUISpecs = eBillFetchUISpecs2;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState10;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIStateA;
                eBillFetchComponent$convertToUiState$1.label = 2;
                objB = stringProvider4.b(StringEnum.EBILL_FETCH_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB != coroutineSingletons10) {
                    eBillFetchDataState2 = eBillFetchDataState10;
                    loadingDialogUIState = loadingDialogUIStateA;
                    objB12 = objB;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState2;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState;
                    eBillFetchComponent$convertToUiState$1.label = 3;
                    objB2 = stringProvider4.b(StringEnum.EBILL_FETCH_SUBTITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB2 != coroutineSingletons10) {
                        eBillFetchDataState3 = eBillFetchDataState2;
                        toolbarUIState3 = toolbarUIState;
                        chaloTextUIState2 = chaloTextUIState;
                        objB12 = objB2;
                        eBillFetchUISpecs3 = eBillFetchUISpecs;
                        loadingDialogUIState2 = loadingDialogUIState;
                        chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        str = eBillFetchDataState3.d;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                        eBillFetchComponent$convertToUiState$1.L$1 = str;
                        eBillFetchComponent$convertToUiState$1.L$2 = eBillFetchUISpecs3;
                        eBillFetchComponent$convertToUiState$1.L$3 = toolbarUIState3;
                        eBillFetchComponent$convertToUiState$1.L$4 = loadingDialogUIState2;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState2;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState3;
                        eBillFetchComponent$convertToUiState$1.label = 4;
                        objB12 = stringProvider4.b(StringEnum.CONSUMER_NUMBER, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB12 != coroutineSingletons10) {
                            String str110 = str;
                            uITextStyle = UITextStyle.BodyMedium;
                            TextFieldLabelPlaceholderUIState.TextLabel textLabel3 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB12, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                            TextFieldEventHandlerHelper$basicWithCharConstraint$3 textFieldEventHandlerHelper$basicWithCharConstraint$3C3 = TextFieldEventHandlerHelper.c(9, new qp(this, 18));
                            UIKeyboardOption uIKeyboardOption3 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                            ChaloColorToken.TextFieldIndicator textFieldIndicator3 = ChaloColorToken.TextFieldIndicator.f9859a;
                            textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str110, textFieldEventHandlerHelper$basicWithCharConstraint$3C3, null, textLabel3, null, null, false, uIKeyboardOption3, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator3, textFieldIndicator3, textFieldIndicator3, textFieldIndicator3, null, null, 4178943), 0.0f, 97244);
                            str2 = eBillFetchDataState3.b;
                            if (str2 != null) {
                                chaloTextUIState4 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            } else {
                                chaloTextUIState4 = null;
                            }
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs3;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState3;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState2;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState3;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState4;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateFactory;
                            chaloTextUIState5 = chaloTextUIState3;
                            eBillFetchComponent$convertToUiState$1.label = 5;
                            objB3 = stringProvider4.b(StringEnum.NEXT_CAPS, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB3 != coroutineSingletons10) {
                                eBillFetchUISpecs4 = eBillFetchUISpecs3;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                chaloTextUIState6 = chaloTextUIState2;
                                chaloTextUIState7 = chaloTextUIState4;
                                eBillFetchDataState4 = eBillFetchDataState3;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                toolbarUIState4 = toolbarUIState3;
                                chaloTextUIState8 = chaloTextUIState5;
                                textFieldUIState2 = textFieldUIState;
                                objB12 = objB3;
                                TextUIState.ChaloTextUIState chaloTextUIState32 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                                final int i15 = 0;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIState32, new Function0(this) { // from class: t00
                                    public final /* synthetic */ EBillFetchComponent b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState4.d));
                                                break;
                                            default:
                                                this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState4.d));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                }, null, eBillFetchDataState4.c, 0.0f, 44);
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                eBillFetchComponent$convertToUiState$1.label = 6;
                                objB12 = stringProvider4.b(StringEnum.VIEW_PAYMENT_HISTORY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                if (objB12 != coroutineSingletons10) {
                                    final int i16 = 0;
                                    clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                                        public final /* synthetic */ EBillFetchComponent b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                    break;
                                                case 1:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                    break;
                                                case 2:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                    break;
                                                default:
                                                    this.b.E0(new b00(4));
                                                    break;
                                            }
                                            return Unit.f17538a;
                                        }
                                    }), 30);
                                    if (eBillFetchDataState4.e) {
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                                        eBillFetchComponent$convertToUiState$1.label = 7;
                                        objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        if (objB4 != coroutineSingletons10) {
                                            coroutineSingletons10 = coroutineSingletons10;
                                            objB12 = objB4;
                                            dialogUIStateFactory2 = dialogUIStateFactory5;
                                            clickableTextUiState2 = clickableTextUiState;
                                            toolbarUIState5 = toolbarUIState4;
                                            chaloTextUIState9 = chaloTextUIState8;
                                            buttonUIState2 = buttonUIStateF;
                                            eBillFetchDataState5 = eBillFetchDataState4;
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            textFieldUIState3 = textFieldUIState2;
                                            eBillFetchUISpecs6 = eBillFetchUISpecs4;
                                            chaloTextUIState10 = chaloTextUIState6;
                                            chaloTextUIState11 = chaloTextUIState7;
                                            str3 = (String) objB12;
                                            CoroutineSingletons coroutineSingletons13 = coroutineSingletons10;
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                                            eBillFetchComponent$convertToUiState$1.L$11 = str3;
                                            eBillFetchComponent$convertToUiState$1.label = 8;
                                            objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            coroutineSingletons2 = coroutineSingletons13;
                                            if (objB5 == coroutineSingletons2) {
                                                return coroutineSingletons2;
                                            }
                                            dialogUIStateFactory3 = dialogUIStateFactory2;
                                            eBillFetchDataState6 = eBillFetchDataState5;
                                            str4 = str3;
                                            objB12 = objB5;
                                            str5 = (String) objB12;
                                            coroutineSingletons3 = coroutineSingletons2;
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                                            eBillFetchComponent$convertToUiState$1.L$11 = str4;
                                            eBillFetchComponent$convertToUiState$1.L$12 = str5;
                                            eBillFetchComponent$convertToUiState$1.label = 9;
                                            eBillFetchDataState7 = eBillFetchDataState6;
                                            stringProvider2 = stringProvider4;
                                            objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            if (objB6 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            EBillFetchUISpecs eBillFetchUISpecs16 = eBillFetchUISpecs6;
                                            str6 = str4;
                                            eBillFetchUISpecs7 = eBillFetchUISpecs16;
                                            obj2 = objB6;
                                            coroutineSingletons4 = coroutineSingletons3;
                                            chaloTextUIState12 = chaloTextUIState10;
                                            textFieldUIState4 = textFieldUIState3;
                                            buttonUIState3 = buttonUIState2;
                                            loadingDialogUIState5 = loadingDialogUIState4;
                                            chaloTextUIState13 = chaloTextUIState9;
                                            chaloTextUIState14 = chaloTextUIState11;
                                            clickableTextUiState3 = clickableTextUiState2;
                                            dialogUIStateFactory4 = dialogUIStateFactory3;
                                            str7 = str5;
                                            eBillFetchDataState8 = eBillFetchDataState7;
                                            str8 = (String) obj2;
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                                            eBillFetchComponent$convertToUiState$1.L$11 = str6;
                                            eBillFetchComponent$convertToUiState$1.L$12 = str7;
                                            eBillFetchComponent$convertToUiState$1.L$13 = str8;
                                            eBillFetchComponent$convertToUiState$1.label = 10;
                                            eBillFetchUISpecs8 = eBillFetchUISpecs7;
                                            stringProvider = stringProvider2;
                                            objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            coroutineSingletons = coroutineSingletons4;
                                            if (objB7 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            chaloTextUIState15 = chaloTextUIState12;
                                            str9 = str7;
                                            str10 = str6;
                                            str11 = str8;
                                            chaloTextUIState16 = chaloTextUIState13;
                                            chaloTextUIState17 = chaloTextUIState14;
                                            clickableTextUiState4 = clickableTextUiState3;
                                            textFieldUIState5 = textFieldUIState4;
                                            buttonUIState = buttonUIState3;
                                            loadingDialogUIState3 = loadingDialogUIState5;
                                            String str111 = (String) objB7;
                                            final int i17 = 1;
                                            eBillFetchComponent = this;
                                            Function0 function8 = new Function0(eBillFetchComponent) { // from class: u00
                                                public final /* synthetic */ EBillFetchComponent b;

                                                {
                                                    this.b = eBillFetchComponent;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i17) {
                                                        case 0:
                                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                            break;
                                                        case 1:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                            break;
                                                        case 2:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                            break;
                                                        default:
                                                            this.b.E0(new b00(4));
                                                            break;
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            };
                                            EBillFetchDataState eBillFetchDataState14 = eBillFetchDataState8;
                                            final int i18 = 2;
                                            Function0 function9 = new Function0(eBillFetchComponent) { // from class: u00
                                                public final /* synthetic */ EBillFetchComponent b;

                                                {
                                                    this.b = eBillFetchComponent;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i18) {
                                                        case 0:
                                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                            break;
                                                        case 1:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                            break;
                                                        case 2:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                            break;
                                                        default:
                                                            this.b.E0(new b00(4));
                                                            break;
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            };
                                            dialogUIStateFactory4.getClass();
                                            confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str111, function8, function9);
                                            ToolbarUIState toolbarUIState14 = toolbarUIState5;
                                            clickableTextUiState = clickableTextUiState4;
                                            toolbarUIState4 = toolbarUIState14;
                                            chaloTextUIState7 = chaloTextUIState17;
                                            textFieldUIState2 = textFieldUIState5;
                                            eBillFetchUISpecs5 = eBillFetchUISpecs8;
                                            chaloTextUIState8 = chaloTextUIState16;
                                            chaloTextUIState6 = chaloTextUIState15;
                                            eBillFetchDataState4 = eBillFetchDataState14;
                                        }
                                    } else {
                                        eBillFetchComponent = this;
                                        ButtonUIState buttonUIState9 = buttonUIStateF;
                                        stringProvider = stringProvider4;
                                        coroutineSingletons = coroutineSingletons10;
                                        eBillFetchUISpecs5 = eBillFetchUISpecs4;
                                        buttonUIState = buttonUIState9;
                                        confirmationDialogUiStateB = null;
                                    }
                                    z = eBillFetchDataState4.f;
                                    snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                    if (z) {
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                        eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                                        eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                                        eBillFetchComponent$convertToUiState$1.label = 11;
                                        objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        coroutineSingletons7 = coroutineSingletons;
                                        if (objB9 == coroutineSingletons7) {
                                            return coroutineSingletons7;
                                        }
                                        ConfirmationDialogUiState confirmationDialogUiState8 = confirmationDialogUiStateB;
                                        objB12 = objB9;
                                        toolbarUIState8 = toolbarUIState4;
                                        chaloTextUIState24 = chaloTextUIState6;
                                        textFieldUIState8 = textFieldUIState2;
                                        clickableTextUiState7 = clickableTextUiState;
                                        eBillFetchUISpecs10 = eBillFetchUISpecs5;
                                        snackbarUIStateFactory3 = snackbarUIStateFactory;
                                        buttonUIState6 = buttonUIState;
                                        loadingDialogUIState8 = loadingDialogUIState3;
                                        chaloTextUIState25 = chaloTextUIState8;
                                        chaloTextUIState26 = chaloTextUIState7;
                                        confirmationDialogUiState3 = confirmationDialogUiState8;
                                        str12 = (String) objB12;
                                        coroutineSingletons8 = coroutineSingletons7;
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                                        eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                                        eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                                        eBillFetchComponent$convertToUiState$1.L$12 = str12;
                                        toolbarUIState9 = toolbarUIState8;
                                        eBillFetchComponent$convertToUiState$1.label = 12;
                                        objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        if (objB10 == coroutineSingletons8) {
                                            return coroutineSingletons8;
                                        }
                                        str13 = str12;
                                        chaloTextUIState27 = chaloTextUIState25;
                                        chaloTextUIState28 = chaloTextUIState24;
                                        loadingDialogUIState9 = loadingDialogUIState8;
                                        eBillFetchDataState9 = eBillFetchDataState4;
                                        eBillFetchUISpecs11 = eBillFetchUISpecs10;
                                        toolbarUIState10 = toolbarUIState9;
                                        objB12 = objB10;
                                        final int i19 = 1;
                                        Function0 function10 = new Function0(this) { // from class: t00
                                            public final /* synthetic */ EBillFetchComponent b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i19) {
                                                    case 0:
                                                        this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                                        break;
                                                    default:
                                                        this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                                        break;
                                                }
                                                return Unit.f17538a;
                                            }
                                        };
                                        snackbarUIStateFactory3.getClass();
                                        chaloTextUIState19 = chaloTextUIState27;
                                        snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function10);
                                        confirmationDialogUiState = confirmationDialogUiState3;
                                        clickableTextUiState5 = clickableTextUiState7;
                                        buttonUIState4 = buttonUIState6;
                                        chaloTextUIState18 = chaloTextUIState26;
                                        textFieldUIState6 = textFieldUIState8;
                                        chaloTextUIState20 = chaloTextUIState28;
                                        loadingDialogUIState6 = loadingDialogUIState9;
                                        toolbarUIState6 = toolbarUIState10;
                                        eBillFetchUISpecs9 = eBillFetchUISpecs11;
                                    } else {
                                        coroutineSingletons5 = coroutineSingletons;
                                        stringProvider3 = stringProvider;
                                        if (eBillFetchDataState4.g) {
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                            eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                            eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                                            eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                                            eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                                            eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                                            eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                                            eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                                            eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                                            eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                                            eBillFetchComponent$convertToUiState$1.L$11 = null;
                                            eBillFetchComponent$convertToUiState$1.L$12 = null;
                                            eBillFetchComponent$convertToUiState$1.L$13 = null;
                                            eBillFetchComponent$convertToUiState$1.label = 13;
                                            objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            coroutineSingletons6 = coroutineSingletons5;
                                            if (objB8 == coroutineSingletons6) {
                                                return coroutineSingletons6;
                                            }
                                            ConfirmationDialogUiState confirmationDialogUiState9 = confirmationDialogUiStateB;
                                            objB12 = objB8;
                                            snackbarUIStateFactory2 = snackbarUIStateFactory;
                                            buttonUIState5 = buttonUIState;
                                            toolbarUIState7 = toolbarUIState4;
                                            chaloTextUIState21 = chaloTextUIState8;
                                            chaloTextUIState22 = chaloTextUIState7;
                                            confirmationDialogUiState2 = confirmationDialogUiState9;
                                            loadingDialogUIState7 = loadingDialogUIState3;
                                            chaloTextUIState23 = chaloTextUIState6;
                                            textFieldUIState7 = textFieldUIState2;
                                            clickableTextUiState6 = clickableTextUiState;
                                            str14 = (String) objB12;
                                            coroutineSingletons9 = coroutineSingletons6;
                                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                            eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                                            eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                                            eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                                            eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                                            eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                                            eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                                            eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                                            eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                                            eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                                            eBillFetchComponent$convertToUiState$1.L$11 = str14;
                                            snackbarUIStateFactory4 = snackbarUIStateFactory2;
                                            eBillFetchComponent$convertToUiState$1.label = 14;
                                            objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                            if (objB11 == coroutineSingletons9) {
                                                return coroutineSingletons9;
                                            }
                                            str15 = str14;
                                            eBillFetchUISpecs12 = eBillFetchUISpecs5;
                                            chaloTextUIState29 = chaloTextUIState21;
                                            loadingDialogUIState10 = loadingDialogUIState7;
                                            snackbarUIStateFactory5 = snackbarUIStateFactory4;
                                            objB12 = objB11;
                                            final int i110 = 3;
                                            Function0 function11 = new Function0(this) { // from class: u00
                                                public final /* synthetic */ EBillFetchComponent b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i110) {
                                                        case 0:
                                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                            break;
                                                        case 1:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                            break;
                                                        case 2:
                                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                            break;
                                                        default:
                                                            this.b.E0(new b00(4));
                                                            break;
                                                    }
                                                    return Unit.f17538a;
                                                }
                                            };
                                            snackbarUIStateFactory5.getClass();
                                            snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function11);
                                            eBillFetchUISpecs9 = eBillFetchUISpecs12;
                                            confirmationDialogUiState = confirmationDialogUiState2;
                                            clickableTextUiState5 = clickableTextUiState6;
                                            buttonUIState4 = buttonUIState5;
                                            chaloTextUIState18 = chaloTextUIState22;
                                            textFieldUIState6 = textFieldUIState7;
                                            chaloTextUIState19 = chaloTextUIState29;
                                            chaloTextUIState20 = chaloTextUIState23;
                                            loadingDialogUIState6 = loadingDialogUIState10;
                                            toolbarUIState6 = toolbarUIState7;
                                        } else {
                                            confirmationDialogUiState = confirmationDialogUiStateB;
                                            eBillFetchUISpecs9 = eBillFetchUISpecs5;
                                            chaloTextUIState18 = chaloTextUIState7;
                                            textFieldUIState6 = textFieldUIState2;
                                            chaloTextUIState19 = chaloTextUIState8;
                                            chaloTextUIState20 = chaloTextUIState6;
                                            snackbarUIStateA = null;
                                            loadingDialogUIState6 = loadingDialogUIState3;
                                            toolbarUIState6 = toolbarUIState4;
                                            buttonUIState4 = buttonUIState;
                                            clickableTextUiState5 = clickableTextUiState;
                                        }
                                    }
                                    return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
                                }
                            }
                        }
                    }
                }
                coroutineSingletons10 = coroutineSingletons10;
                return coroutineSingletons10;
            case 2:
                loadingDialogUIState = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                toolbarUIState = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                eBillFetchUISpecs = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                eBillFetchDataState2 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.DisplayMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState2;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState;
                eBillFetchComponent$convertToUiState$1.label = 3;
                objB2 = stringProvider4.b(StringEnum.EBILL_FETCH_SUBTITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons10) {
                    eBillFetchDataState3 = eBillFetchDataState2;
                    toolbarUIState3 = toolbarUIState;
                    chaloTextUIState2 = chaloTextUIState;
                    objB12 = objB2;
                    eBillFetchUISpecs3 = eBillFetchUISpecs;
                    loadingDialogUIState2 = loadingDialogUIState;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    str = eBillFetchDataState3.d;
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                    eBillFetchComponent$convertToUiState$1.L$1 = str;
                    eBillFetchComponent$convertToUiState$1.L$2 = eBillFetchUISpecs3;
                    eBillFetchComponent$convertToUiState$1.L$3 = toolbarUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = loadingDialogUIState2;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState2;
                    eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState3;
                    eBillFetchComponent$convertToUiState$1.label = 4;
                    objB12 = stringProvider4.b(StringEnum.CONSUMER_NUMBER, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB12 != coroutineSingletons10) {
                        String str112 = str;
                        uITextStyle = UITextStyle.BodyMedium;
                        TextFieldLabelPlaceholderUIState.TextLabel textLabel4 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB12, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                        TextFieldEventHandlerHelper$basicWithCharConstraint$3 textFieldEventHandlerHelper$basicWithCharConstraint$3C4 = TextFieldEventHandlerHelper.c(9, new qp(this, 18));
                        UIKeyboardOption uIKeyboardOption4 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                        ChaloColorToken.TextFieldIndicator textFieldIndicator4 = ChaloColorToken.TextFieldIndicator.f9859a;
                        textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str112, textFieldEventHandlerHelper$basicWithCharConstraint$3C4, null, textLabel4, null, null, false, uIKeyboardOption4, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator4, textFieldIndicator4, textFieldIndicator4, textFieldIndicator4, null, null, 4178943), 0.0f, 97244);
                        str2 = eBillFetchDataState3.b;
                        if (str2 != null) {
                            chaloTextUIState4 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        } else {
                            chaloTextUIState4 = null;
                        }
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs3;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState3;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState2;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState3;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState4;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateFactory;
                        chaloTextUIState5 = chaloTextUIState3;
                        eBillFetchComponent$convertToUiState$1.label = 5;
                        objB3 = stringProvider4.b(StringEnum.NEXT_CAPS, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB3 != coroutineSingletons10) {
                            eBillFetchUISpecs4 = eBillFetchUISpecs3;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            chaloTextUIState6 = chaloTextUIState2;
                            chaloTextUIState7 = chaloTextUIState4;
                            eBillFetchDataState4 = eBillFetchDataState3;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            toolbarUIState4 = toolbarUIState3;
                            chaloTextUIState8 = chaloTextUIState5;
                            textFieldUIState2 = textFieldUIState;
                            objB12 = objB3;
                            TextUIState.ChaloTextUIState chaloTextUIState33 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            final int i111 = 0;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIState33, new Function0(this) { // from class: t00
                                public final /* synthetic */ EBillFetchComponent b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i111) {
                                        case 0:
                                            this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState4.d));
                                            break;
                                        default:
                                            this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState4.d));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            }, null, eBillFetchDataState4.c, 0.0f, 44);
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                            eBillFetchComponent$convertToUiState$1.label = 6;
                            objB12 = stringProvider4.b(StringEnum.VIEW_PAYMENT_HISTORY, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB12 != coroutineSingletons10) {
                                final int i112 = 0;
                                clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                                    public final /* synthetic */ EBillFetchComponent b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i112) {
                                            case 0:
                                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                break;
                                            case 1:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                break;
                                            case 2:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                break;
                                            default:
                                                this.b.E0(new b00(4));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                }), 30);
                                if (eBillFetchDataState4.e) {
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                                    eBillFetchComponent$convertToUiState$1.label = 7;
                                    objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    if (objB4 != coroutineSingletons10) {
                                        coroutineSingletons10 = coroutineSingletons10;
                                        objB12 = objB4;
                                        dialogUIStateFactory2 = dialogUIStateFactory5;
                                        clickableTextUiState2 = clickableTextUiState;
                                        toolbarUIState5 = toolbarUIState4;
                                        chaloTextUIState9 = chaloTextUIState8;
                                        buttonUIState2 = buttonUIStateF;
                                        eBillFetchDataState5 = eBillFetchDataState4;
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        textFieldUIState3 = textFieldUIState2;
                                        eBillFetchUISpecs6 = eBillFetchUISpecs4;
                                        chaloTextUIState10 = chaloTextUIState6;
                                        chaloTextUIState11 = chaloTextUIState7;
                                        str3 = (String) objB12;
                                        CoroutineSingletons coroutineSingletons14 = coroutineSingletons10;
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                                        eBillFetchComponent$convertToUiState$1.L$11 = str3;
                                        eBillFetchComponent$convertToUiState$1.label = 8;
                                        objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        coroutineSingletons2 = coroutineSingletons14;
                                        if (objB5 == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        dialogUIStateFactory3 = dialogUIStateFactory2;
                                        eBillFetchDataState6 = eBillFetchDataState5;
                                        str4 = str3;
                                        objB12 = objB5;
                                        str5 = (String) objB12;
                                        coroutineSingletons3 = coroutineSingletons2;
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                                        eBillFetchComponent$convertToUiState$1.L$11 = str4;
                                        eBillFetchComponent$convertToUiState$1.L$12 = str5;
                                        eBillFetchComponent$convertToUiState$1.label = 9;
                                        eBillFetchDataState7 = eBillFetchDataState6;
                                        stringProvider2 = stringProvider4;
                                        objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        if (objB6 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        EBillFetchUISpecs eBillFetchUISpecs17 = eBillFetchUISpecs6;
                                        str6 = str4;
                                        eBillFetchUISpecs7 = eBillFetchUISpecs17;
                                        obj2 = objB6;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        chaloTextUIState12 = chaloTextUIState10;
                                        textFieldUIState4 = textFieldUIState3;
                                        buttonUIState3 = buttonUIState2;
                                        loadingDialogUIState5 = loadingDialogUIState4;
                                        chaloTextUIState13 = chaloTextUIState9;
                                        chaloTextUIState14 = chaloTextUIState11;
                                        clickableTextUiState3 = clickableTextUiState2;
                                        dialogUIStateFactory4 = dialogUIStateFactory3;
                                        str7 = str5;
                                        eBillFetchDataState8 = eBillFetchDataState7;
                                        str8 = (String) obj2;
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                                        eBillFetchComponent$convertToUiState$1.L$11 = str6;
                                        eBillFetchComponent$convertToUiState$1.L$12 = str7;
                                        eBillFetchComponent$convertToUiState$1.L$13 = str8;
                                        eBillFetchComponent$convertToUiState$1.label = 10;
                                        eBillFetchUISpecs8 = eBillFetchUISpecs7;
                                        stringProvider = stringProvider2;
                                        objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        coroutineSingletons = coroutineSingletons4;
                                        if (objB7 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        chaloTextUIState15 = chaloTextUIState12;
                                        str9 = str7;
                                        str10 = str6;
                                        str11 = str8;
                                        chaloTextUIState16 = chaloTextUIState13;
                                        chaloTextUIState17 = chaloTextUIState14;
                                        clickableTextUiState4 = clickableTextUiState3;
                                        textFieldUIState5 = textFieldUIState4;
                                        buttonUIState = buttonUIState3;
                                        loadingDialogUIState3 = loadingDialogUIState5;
                                        String str113 = (String) objB7;
                                        final int i113 = 1;
                                        eBillFetchComponent = this;
                                        Function0 function12 = new Function0(eBillFetchComponent) { // from class: u00
                                            public final /* synthetic */ EBillFetchComponent b;

                                            {
                                                this.b = eBillFetchComponent;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i113) {
                                                    case 0:
                                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                        break;
                                                    case 1:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                        break;
                                                    case 2:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                        break;
                                                    default:
                                                        this.b.E0(new b00(4));
                                                        break;
                                                }
                                                return Unit.f17538a;
                                            }
                                        };
                                        EBillFetchDataState eBillFetchDataState15 = eBillFetchDataState8;
                                        final int i114 = 2;
                                        Function0 function13 = new Function0(eBillFetchComponent) { // from class: u00
                                            public final /* synthetic */ EBillFetchComponent b;

                                            {
                                                this.b = eBillFetchComponent;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i114) {
                                                    case 0:
                                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                        break;
                                                    case 1:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                        break;
                                                    case 2:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                        break;
                                                    default:
                                                        this.b.E0(new b00(4));
                                                        break;
                                                }
                                                return Unit.f17538a;
                                            }
                                        };
                                        dialogUIStateFactory4.getClass();
                                        confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str113, function12, function13);
                                        ToolbarUIState toolbarUIState15 = toolbarUIState5;
                                        clickableTextUiState = clickableTextUiState4;
                                        toolbarUIState4 = toolbarUIState15;
                                        chaloTextUIState7 = chaloTextUIState17;
                                        textFieldUIState2 = textFieldUIState5;
                                        eBillFetchUISpecs5 = eBillFetchUISpecs8;
                                        chaloTextUIState8 = chaloTextUIState16;
                                        chaloTextUIState6 = chaloTextUIState15;
                                        eBillFetchDataState4 = eBillFetchDataState15;
                                    }
                                } else {
                                    eBillFetchComponent = this;
                                    ButtonUIState buttonUIState10 = buttonUIStateF;
                                    stringProvider = stringProvider4;
                                    coroutineSingletons = coroutineSingletons10;
                                    eBillFetchUISpecs5 = eBillFetchUISpecs4;
                                    buttonUIState = buttonUIState10;
                                    confirmationDialogUiStateB = null;
                                }
                                z = eBillFetchDataState4.f;
                                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                                if (z) {
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                                    eBillFetchComponent$convertToUiState$1.label = 11;
                                    objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    coroutineSingletons7 = coroutineSingletons;
                                    if (objB9 == coroutineSingletons7) {
                                        return coroutineSingletons7;
                                    }
                                    ConfirmationDialogUiState confirmationDialogUiState10 = confirmationDialogUiStateB;
                                    objB12 = objB9;
                                    toolbarUIState8 = toolbarUIState4;
                                    chaloTextUIState24 = chaloTextUIState6;
                                    textFieldUIState8 = textFieldUIState2;
                                    clickableTextUiState7 = clickableTextUiState;
                                    eBillFetchUISpecs10 = eBillFetchUISpecs5;
                                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                                    buttonUIState6 = buttonUIState;
                                    loadingDialogUIState8 = loadingDialogUIState3;
                                    chaloTextUIState25 = chaloTextUIState8;
                                    chaloTextUIState26 = chaloTextUIState7;
                                    confirmationDialogUiState3 = confirmationDialogUiState10;
                                    str12 = (String) objB12;
                                    coroutineSingletons8 = coroutineSingletons7;
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                                    eBillFetchComponent$convertToUiState$1.L$12 = str12;
                                    toolbarUIState9 = toolbarUIState8;
                                    eBillFetchComponent$convertToUiState$1.label = 12;
                                    objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    if (objB10 == coroutineSingletons8) {
                                        return coroutineSingletons8;
                                    }
                                    str13 = str12;
                                    chaloTextUIState27 = chaloTextUIState25;
                                    chaloTextUIState28 = chaloTextUIState24;
                                    loadingDialogUIState9 = loadingDialogUIState8;
                                    eBillFetchDataState9 = eBillFetchDataState4;
                                    eBillFetchUISpecs11 = eBillFetchUISpecs10;
                                    toolbarUIState10 = toolbarUIState9;
                                    objB12 = objB10;
                                    final int i115 = 1;
                                    Function0 function14 = new Function0(this) { // from class: t00
                                        public final /* synthetic */ EBillFetchComponent b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i115) {
                                                case 0:
                                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                                    break;
                                                default:
                                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                                    break;
                                            }
                                            return Unit.f17538a;
                                        }
                                    };
                                    snackbarUIStateFactory3.getClass();
                                    chaloTextUIState19 = chaloTextUIState27;
                                    snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function14);
                                    confirmationDialogUiState = confirmationDialogUiState3;
                                    clickableTextUiState5 = clickableTextUiState7;
                                    buttonUIState4 = buttonUIState6;
                                    chaloTextUIState18 = chaloTextUIState26;
                                    textFieldUIState6 = textFieldUIState8;
                                    chaloTextUIState20 = chaloTextUIState28;
                                    loadingDialogUIState6 = loadingDialogUIState9;
                                    toolbarUIState6 = toolbarUIState10;
                                    eBillFetchUISpecs9 = eBillFetchUISpecs11;
                                } else {
                                    coroutineSingletons5 = coroutineSingletons;
                                    stringProvider3 = stringProvider;
                                    if (eBillFetchDataState4.g) {
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                                        eBillFetchComponent$convertToUiState$1.L$11 = null;
                                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                                        eBillFetchComponent$convertToUiState$1.label = 13;
                                        objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        coroutineSingletons6 = coroutineSingletons5;
                                        if (objB8 == coroutineSingletons6) {
                                            return coroutineSingletons6;
                                        }
                                        ConfirmationDialogUiState confirmationDialogUiState11 = confirmationDialogUiStateB;
                                        objB12 = objB8;
                                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                                        buttonUIState5 = buttonUIState;
                                        toolbarUIState7 = toolbarUIState4;
                                        chaloTextUIState21 = chaloTextUIState8;
                                        chaloTextUIState22 = chaloTextUIState7;
                                        confirmationDialogUiState2 = confirmationDialogUiState11;
                                        loadingDialogUIState7 = loadingDialogUIState3;
                                        chaloTextUIState23 = chaloTextUIState6;
                                        textFieldUIState7 = textFieldUIState2;
                                        clickableTextUiState6 = clickableTextUiState;
                                        str14 = (String) objB12;
                                        coroutineSingletons9 = coroutineSingletons6;
                                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                                        eBillFetchComponent$convertToUiState$1.L$11 = str14;
                                        snackbarUIStateFactory4 = snackbarUIStateFactory2;
                                        eBillFetchComponent$convertToUiState$1.label = 14;
                                        objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                        if (objB11 == coroutineSingletons9) {
                                            return coroutineSingletons9;
                                        }
                                        str15 = str14;
                                        eBillFetchUISpecs12 = eBillFetchUISpecs5;
                                        chaloTextUIState29 = chaloTextUIState21;
                                        loadingDialogUIState10 = loadingDialogUIState7;
                                        snackbarUIStateFactory5 = snackbarUIStateFactory4;
                                        objB12 = objB11;
                                        final int i116 = 3;
                                        Function0 function15 = new Function0(this) { // from class: u00
                                            public final /* synthetic */ EBillFetchComponent b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i116) {
                                                    case 0:
                                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                        break;
                                                    case 1:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                        break;
                                                    case 2:
                                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                        break;
                                                    default:
                                                        this.b.E0(new b00(4));
                                                        break;
                                                }
                                                return Unit.f17538a;
                                            }
                                        };
                                        snackbarUIStateFactory5.getClass();
                                        snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function15);
                                        eBillFetchUISpecs9 = eBillFetchUISpecs12;
                                        confirmationDialogUiState = confirmationDialogUiState2;
                                        clickableTextUiState5 = clickableTextUiState6;
                                        buttonUIState4 = buttonUIState5;
                                        chaloTextUIState18 = chaloTextUIState22;
                                        textFieldUIState6 = textFieldUIState7;
                                        chaloTextUIState19 = chaloTextUIState29;
                                        chaloTextUIState20 = chaloTextUIState23;
                                        loadingDialogUIState6 = loadingDialogUIState10;
                                        toolbarUIState6 = toolbarUIState7;
                                    } else {
                                        confirmationDialogUiState = confirmationDialogUiStateB;
                                        eBillFetchUISpecs9 = eBillFetchUISpecs5;
                                        chaloTextUIState18 = chaloTextUIState7;
                                        textFieldUIState6 = textFieldUIState2;
                                        chaloTextUIState19 = chaloTextUIState8;
                                        chaloTextUIState20 = chaloTextUIState6;
                                        snackbarUIStateA = null;
                                        loadingDialogUIState6 = loadingDialogUIState3;
                                        toolbarUIState6 = toolbarUIState4;
                                        buttonUIState4 = buttonUIState;
                                        clickableTextUiState5 = clickableTextUiState;
                                    }
                                }
                                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
                            }
                        }
                    }
                }
                coroutineSingletons10 = coroutineSingletons10;
                return coroutineSingletons10;
            case 3:
                TextUIState.ChaloTextUIState chaloTextUIState34 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                LoadingDialogUIState loadingDialogUIState11 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                ToolbarUIState toolbarUIState16 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                EBillFetchUISpecs eBillFetchUISpecs18 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchDataState eBillFetchDataState16 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                eBillFetchDataState3 = eBillFetchDataState16;
                eBillFetchUISpecs3 = eBillFetchUISpecs18;
                toolbarUIState3 = toolbarUIState16;
                loadingDialogUIState2 = loadingDialogUIState11;
                chaloTextUIState2 = chaloTextUIState34;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                str = eBillFetchDataState3.d;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                eBillFetchComponent$convertToUiState$1.L$1 = str;
                eBillFetchComponent$convertToUiState$1.L$2 = eBillFetchUISpecs3;
                eBillFetchComponent$convertToUiState$1.L$3 = toolbarUIState3;
                eBillFetchComponent$convertToUiState$1.L$4 = loadingDialogUIState2;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState2;
                eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState3;
                eBillFetchComponent$convertToUiState$1.label = 4;
                objB12 = stringProvider4.b(StringEnum.CONSUMER_NUMBER, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB12 != coroutineSingletons10) {
                    String str114 = str;
                    uITextStyle = UITextStyle.BodyMedium;
                    TextFieldLabelPlaceholderUIState.TextLabel textLabel5 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB12, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                    TextFieldEventHandlerHelper$basicWithCharConstraint$3 textFieldEventHandlerHelper$basicWithCharConstraint$3C5 = TextFieldEventHandlerHelper.c(9, new qp(this, 18));
                    UIKeyboardOption uIKeyboardOption5 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                    ChaloColorToken.TextFieldIndicator textFieldIndicator5 = ChaloColorToken.TextFieldIndicator.f9859a;
                    textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str114, textFieldEventHandlerHelper$basicWithCharConstraint$3C5, null, textLabel5, null, null, false, uIKeyboardOption5, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator5, textFieldIndicator5, textFieldIndicator5, textFieldIndicator5, null, null, 4178943), 0.0f, 97244);
                    str2 = eBillFetchDataState3.b;
                    if (str2 != null) {
                        chaloTextUIState4 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    } else {
                        chaloTextUIState4 = null;
                    }
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs3;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState3;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState2;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState3;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState4;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateFactory;
                    chaloTextUIState5 = chaloTextUIState3;
                    eBillFetchComponent$convertToUiState$1.label = 5;
                    objB3 = stringProvider4.b(StringEnum.NEXT_CAPS, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB3 != coroutineSingletons10) {
                        eBillFetchUISpecs4 = eBillFetchUISpecs3;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        chaloTextUIState6 = chaloTextUIState2;
                        chaloTextUIState7 = chaloTextUIState4;
                        eBillFetchDataState4 = eBillFetchDataState3;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        toolbarUIState4 = toolbarUIState3;
                        chaloTextUIState8 = chaloTextUIState5;
                        textFieldUIState2 = textFieldUIState;
                        objB12 = objB3;
                        TextUIState.ChaloTextUIState chaloTextUIState35 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        final int i117 = 0;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIState35, new Function0(this) { // from class: t00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i117) {
                                    case 0:
                                        this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState4.d));
                                        break;
                                    default:
                                        this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState4.d));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        }, null, eBillFetchDataState4.c, 0.0f, 44);
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                        eBillFetchComponent$convertToUiState$1.label = 6;
                        objB12 = stringProvider4.b(StringEnum.VIEW_PAYMENT_HISTORY, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB12 != coroutineSingletons10) {
                            final int i118 = 0;
                            clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                                public final /* synthetic */ EBillFetchComponent b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i118) {
                                        case 0:
                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                            break;
                                        case 1:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                            break;
                                        case 2:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                            break;
                                        default:
                                            this.b.E0(new b00(4));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            }), 30);
                            if (eBillFetchDataState4.e) {
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                                eBillFetchComponent$convertToUiState$1.label = 7;
                                objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                                if (objB4 != coroutineSingletons10) {
                                    coroutineSingletons10 = coroutineSingletons10;
                                    objB12 = objB4;
                                    dialogUIStateFactory2 = dialogUIStateFactory5;
                                    clickableTextUiState2 = clickableTextUiState;
                                    toolbarUIState5 = toolbarUIState4;
                                    chaloTextUIState9 = chaloTextUIState8;
                                    buttonUIState2 = buttonUIStateF;
                                    eBillFetchDataState5 = eBillFetchDataState4;
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    textFieldUIState3 = textFieldUIState2;
                                    eBillFetchUISpecs6 = eBillFetchUISpecs4;
                                    chaloTextUIState10 = chaloTextUIState6;
                                    chaloTextUIState11 = chaloTextUIState7;
                                    str3 = (String) objB12;
                                    CoroutineSingletons coroutineSingletons15 = coroutineSingletons10;
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                                    eBillFetchComponent$convertToUiState$1.L$11 = str3;
                                    eBillFetchComponent$convertToUiState$1.label = 8;
                                    objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    coroutineSingletons2 = coroutineSingletons15;
                                    if (objB5 == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    dialogUIStateFactory3 = dialogUIStateFactory2;
                                    eBillFetchDataState6 = eBillFetchDataState5;
                                    str4 = str3;
                                    objB12 = objB5;
                                    str5 = (String) objB12;
                                    coroutineSingletons3 = coroutineSingletons2;
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                                    eBillFetchComponent$convertToUiState$1.L$11 = str4;
                                    eBillFetchComponent$convertToUiState$1.L$12 = str5;
                                    eBillFetchComponent$convertToUiState$1.label = 9;
                                    eBillFetchDataState7 = eBillFetchDataState6;
                                    stringProvider2 = stringProvider4;
                                    objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    if (objB6 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    EBillFetchUISpecs eBillFetchUISpecs19 = eBillFetchUISpecs6;
                                    str6 = str4;
                                    eBillFetchUISpecs7 = eBillFetchUISpecs19;
                                    obj2 = objB6;
                                    coroutineSingletons4 = coroutineSingletons3;
                                    chaloTextUIState12 = chaloTextUIState10;
                                    textFieldUIState4 = textFieldUIState3;
                                    buttonUIState3 = buttonUIState2;
                                    loadingDialogUIState5 = loadingDialogUIState4;
                                    chaloTextUIState13 = chaloTextUIState9;
                                    chaloTextUIState14 = chaloTextUIState11;
                                    clickableTextUiState3 = clickableTextUiState2;
                                    dialogUIStateFactory4 = dialogUIStateFactory3;
                                    str7 = str5;
                                    eBillFetchDataState8 = eBillFetchDataState7;
                                    str8 = (String) obj2;
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                                    eBillFetchComponent$convertToUiState$1.L$11 = str6;
                                    eBillFetchComponent$convertToUiState$1.L$12 = str7;
                                    eBillFetchComponent$convertToUiState$1.L$13 = str8;
                                    eBillFetchComponent$convertToUiState$1.label = 10;
                                    eBillFetchUISpecs8 = eBillFetchUISpecs7;
                                    stringProvider = stringProvider2;
                                    objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    coroutineSingletons = coroutineSingletons4;
                                    if (objB7 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    chaloTextUIState15 = chaloTextUIState12;
                                    str9 = str7;
                                    str10 = str6;
                                    str11 = str8;
                                    chaloTextUIState16 = chaloTextUIState13;
                                    chaloTextUIState17 = chaloTextUIState14;
                                    clickableTextUiState4 = clickableTextUiState3;
                                    textFieldUIState5 = textFieldUIState4;
                                    buttonUIState = buttonUIState3;
                                    loadingDialogUIState3 = loadingDialogUIState5;
                                    String str115 = (String) objB7;
                                    final int i119 = 1;
                                    eBillFetchComponent = this;
                                    Function0 function16 = new Function0(eBillFetchComponent) { // from class: u00
                                        public final /* synthetic */ EBillFetchComponent b;

                                        {
                                            this.b = eBillFetchComponent;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i119) {
                                                case 0:
                                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                    break;
                                                case 1:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                    break;
                                                case 2:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                    break;
                                                default:
                                                    this.b.E0(new b00(4));
                                                    break;
                                            }
                                            return Unit.f17538a;
                                        }
                                    };
                                    EBillFetchDataState eBillFetchDataState17 = eBillFetchDataState8;
                                    final int i1110 = 2;
                                    Function0 function17 = new Function0(eBillFetchComponent) { // from class: u00
                                        public final /* synthetic */ EBillFetchComponent b;

                                        {
                                            this.b = eBillFetchComponent;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i1110) {
                                                case 0:
                                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                    break;
                                                case 1:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                    break;
                                                case 2:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                    break;
                                                default:
                                                    this.b.E0(new b00(4));
                                                    break;
                                            }
                                            return Unit.f17538a;
                                        }
                                    };
                                    dialogUIStateFactory4.getClass();
                                    confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str115, function16, function17);
                                    ToolbarUIState toolbarUIState17 = toolbarUIState5;
                                    clickableTextUiState = clickableTextUiState4;
                                    toolbarUIState4 = toolbarUIState17;
                                    chaloTextUIState7 = chaloTextUIState17;
                                    textFieldUIState2 = textFieldUIState5;
                                    eBillFetchUISpecs5 = eBillFetchUISpecs8;
                                    chaloTextUIState8 = chaloTextUIState16;
                                    chaloTextUIState6 = chaloTextUIState15;
                                    eBillFetchDataState4 = eBillFetchDataState17;
                                }
                            } else {
                                eBillFetchComponent = this;
                                ButtonUIState buttonUIState11 = buttonUIStateF;
                                stringProvider = stringProvider4;
                                coroutineSingletons = coroutineSingletons10;
                                eBillFetchUISpecs5 = eBillFetchUISpecs4;
                                buttonUIState = buttonUIState11;
                                confirmationDialogUiStateB = null;
                            }
                            z = eBillFetchDataState4.f;
                            snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                            if (z) {
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                                eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                                eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                                eBillFetchComponent$convertToUiState$1.L$12 = null;
                                eBillFetchComponent$convertToUiState$1.L$13 = null;
                                eBillFetchComponent$convertToUiState$1.label = 11;
                                objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                                coroutineSingletons7 = coroutineSingletons;
                                if (objB9 == coroutineSingletons7) {
                                    return coroutineSingletons7;
                                }
                                ConfirmationDialogUiState confirmationDialogUiState12 = confirmationDialogUiStateB;
                                objB12 = objB9;
                                toolbarUIState8 = toolbarUIState4;
                                chaloTextUIState24 = chaloTextUIState6;
                                textFieldUIState8 = textFieldUIState2;
                                clickableTextUiState7 = clickableTextUiState;
                                eBillFetchUISpecs10 = eBillFetchUISpecs5;
                                snackbarUIStateFactory3 = snackbarUIStateFactory;
                                buttonUIState6 = buttonUIState;
                                loadingDialogUIState8 = loadingDialogUIState3;
                                chaloTextUIState25 = chaloTextUIState8;
                                chaloTextUIState26 = chaloTextUIState7;
                                confirmationDialogUiState3 = confirmationDialogUiState12;
                                str12 = (String) objB12;
                                coroutineSingletons8 = coroutineSingletons7;
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                                eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                                eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                                eBillFetchComponent$convertToUiState$1.L$12 = str12;
                                toolbarUIState9 = toolbarUIState8;
                                eBillFetchComponent$convertToUiState$1.label = 12;
                                objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                if (objB10 == coroutineSingletons8) {
                                    return coroutineSingletons8;
                                }
                                str13 = str12;
                                chaloTextUIState27 = chaloTextUIState25;
                                chaloTextUIState28 = chaloTextUIState24;
                                loadingDialogUIState9 = loadingDialogUIState8;
                                eBillFetchDataState9 = eBillFetchDataState4;
                                eBillFetchUISpecs11 = eBillFetchUISpecs10;
                                toolbarUIState10 = toolbarUIState9;
                                objB12 = objB10;
                                final int i1111 = 1;
                                Function0 function18 = new Function0(this) { // from class: t00
                                    public final /* synthetic */ EBillFetchComponent b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i1111) {
                                            case 0:
                                                this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                                break;
                                            default:
                                                this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                };
                                snackbarUIStateFactory3.getClass();
                                chaloTextUIState19 = chaloTextUIState27;
                                snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function18);
                                confirmationDialogUiState = confirmationDialogUiState3;
                                clickableTextUiState5 = clickableTextUiState7;
                                buttonUIState4 = buttonUIState6;
                                chaloTextUIState18 = chaloTextUIState26;
                                textFieldUIState6 = textFieldUIState8;
                                chaloTextUIState20 = chaloTextUIState28;
                                loadingDialogUIState6 = loadingDialogUIState9;
                                toolbarUIState6 = toolbarUIState10;
                                eBillFetchUISpecs9 = eBillFetchUISpecs11;
                            } else {
                                coroutineSingletons5 = coroutineSingletons;
                                stringProvider3 = stringProvider;
                                if (eBillFetchDataState4.g) {
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                    eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                    eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                                    eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                                    eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                                    eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                                    eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                                    eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                                    eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                                    eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                                    eBillFetchComponent$convertToUiState$1.L$11 = null;
                                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                                    eBillFetchComponent$convertToUiState$1.label = 13;
                                    objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    coroutineSingletons6 = coroutineSingletons5;
                                    if (objB8 == coroutineSingletons6) {
                                        return coroutineSingletons6;
                                    }
                                    ConfirmationDialogUiState confirmationDialogUiState13 = confirmationDialogUiStateB;
                                    objB12 = objB8;
                                    snackbarUIStateFactory2 = snackbarUIStateFactory;
                                    buttonUIState5 = buttonUIState;
                                    toolbarUIState7 = toolbarUIState4;
                                    chaloTextUIState21 = chaloTextUIState8;
                                    chaloTextUIState22 = chaloTextUIState7;
                                    confirmationDialogUiState2 = confirmationDialogUiState13;
                                    loadingDialogUIState7 = loadingDialogUIState3;
                                    chaloTextUIState23 = chaloTextUIState6;
                                    textFieldUIState7 = textFieldUIState2;
                                    clickableTextUiState6 = clickableTextUiState;
                                    str14 = (String) objB12;
                                    coroutineSingletons9 = coroutineSingletons6;
                                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                    eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                                    eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                                    eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                                    eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                                    eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                                    eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                                    eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                                    eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                                    eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                                    eBillFetchComponent$convertToUiState$1.L$11 = str14;
                                    snackbarUIStateFactory4 = snackbarUIStateFactory2;
                                    eBillFetchComponent$convertToUiState$1.label = 14;
                                    objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                    if (objB11 == coroutineSingletons9) {
                                        return coroutineSingletons9;
                                    }
                                    str15 = str14;
                                    eBillFetchUISpecs12 = eBillFetchUISpecs5;
                                    chaloTextUIState29 = chaloTextUIState21;
                                    loadingDialogUIState10 = loadingDialogUIState7;
                                    snackbarUIStateFactory5 = snackbarUIStateFactory4;
                                    objB12 = objB11;
                                    final int i1112 = 3;
                                    Function0 function19 = new Function0(this) { // from class: u00
                                        public final /* synthetic */ EBillFetchComponent b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i1112) {
                                                case 0:
                                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                    break;
                                                case 1:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                    break;
                                                case 2:
                                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                    break;
                                                default:
                                                    this.b.E0(new b00(4));
                                                    break;
                                            }
                                            return Unit.f17538a;
                                        }
                                    };
                                    snackbarUIStateFactory5.getClass();
                                    snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function19);
                                    eBillFetchUISpecs9 = eBillFetchUISpecs12;
                                    confirmationDialogUiState = confirmationDialogUiState2;
                                    clickableTextUiState5 = clickableTextUiState6;
                                    buttonUIState4 = buttonUIState5;
                                    chaloTextUIState18 = chaloTextUIState22;
                                    textFieldUIState6 = textFieldUIState7;
                                    chaloTextUIState19 = chaloTextUIState29;
                                    chaloTextUIState20 = chaloTextUIState23;
                                    loadingDialogUIState6 = loadingDialogUIState10;
                                    toolbarUIState6 = toolbarUIState7;
                                } else {
                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                    eBillFetchUISpecs9 = eBillFetchUISpecs5;
                                    chaloTextUIState18 = chaloTextUIState7;
                                    textFieldUIState6 = textFieldUIState2;
                                    chaloTextUIState19 = chaloTextUIState8;
                                    chaloTextUIState20 = chaloTextUIState6;
                                    snackbarUIStateA = null;
                                    loadingDialogUIState6 = loadingDialogUIState3;
                                    toolbarUIState6 = toolbarUIState4;
                                    buttonUIState4 = buttonUIState;
                                    clickableTextUiState5 = clickableTextUiState;
                                }
                            }
                            return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
                        }
                    }
                }
                coroutineSingletons10 = coroutineSingletons10;
                return coroutineSingletons10;
            case 4:
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$6;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                loadingDialogUIState2 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$4;
                toolbarUIState3 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$3;
                eBillFetchUISpecs3 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$2;
                str = (String) eBillFetchComponent$convertToUiState$1.L$1;
                eBillFetchDataState3 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                String str116 = str;
                uITextStyle = UITextStyle.BodyMedium;
                TextFieldLabelPlaceholderUIState.TextLabel textLabel6 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB12, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
                TextFieldEventHandlerHelper$basicWithCharConstraint$3 textFieldEventHandlerHelper$basicWithCharConstraint$3C6 = TextFieldEventHandlerHelper.c(9, new qp(this, 18));
                UIKeyboardOption uIKeyboardOption6 = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
                ChaloColorToken.TextFieldIndicator textFieldIndicator6 = ChaloColorToken.TextFieldIndicator.f9859a;
                textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str116, textFieldEventHandlerHelper$basicWithCharConstraint$3C6, null, textLabel6, null, null, false, uIKeyboardOption6, 0, null, new UITextFieldColors(null, null, null, null, null, null, textFieldIndicator6, textFieldIndicator6, textFieldIndicator6, textFieldIndicator6, null, null, 4178943), 0.0f, 97244);
                str2 = eBillFetchDataState3.b;
                if (str2 != null) {
                    chaloTextUIState4 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                } else {
                    chaloTextUIState4 = null;
                }
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState3;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs3;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState3;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState2;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState3;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState4;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateFactory;
                chaloTextUIState5 = chaloTextUIState3;
                eBillFetchComponent$convertToUiState$1.label = 5;
                objB3 = stringProvider4.b(StringEnum.NEXT_CAPS, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB3 != coroutineSingletons10) {
                    eBillFetchUISpecs4 = eBillFetchUISpecs3;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    chaloTextUIState6 = chaloTextUIState2;
                    chaloTextUIState7 = chaloTextUIState4;
                    eBillFetchDataState4 = eBillFetchDataState3;
                    loadingDialogUIState3 = loadingDialogUIState2;
                    toolbarUIState4 = toolbarUIState3;
                    chaloTextUIState8 = chaloTextUIState5;
                    textFieldUIState2 = textFieldUIState;
                    objB12 = objB3;
                    TextUIState.ChaloTextUIState chaloTextUIState36 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    final int i1113 = 0;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIState36, new Function0(this) { // from class: t00
                        public final /* synthetic */ EBillFetchComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i1113) {
                                case 0:
                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState4.d));
                                    break;
                                default:
                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState4.d));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, null, eBillFetchDataState4.c, 0.0f, 44);
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                    eBillFetchComponent$convertToUiState$1.label = 6;
                    objB12 = stringProvider4.b(StringEnum.VIEW_PAYMENT_HISTORY, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB12 != coroutineSingletons10) {
                        final int i1114 = 0;
                        clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i1114) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        }), 30);
                        if (eBillFetchDataState4.e) {
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                            eBillFetchComponent$convertToUiState$1.label = 7;
                            objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB4 != coroutineSingletons10) {
                                coroutineSingletons10 = coroutineSingletons10;
                                objB12 = objB4;
                                dialogUIStateFactory2 = dialogUIStateFactory5;
                                clickableTextUiState2 = clickableTextUiState;
                                toolbarUIState5 = toolbarUIState4;
                                chaloTextUIState9 = chaloTextUIState8;
                                buttonUIState2 = buttonUIStateF;
                                eBillFetchDataState5 = eBillFetchDataState4;
                                loadingDialogUIState4 = loadingDialogUIState3;
                                textFieldUIState3 = textFieldUIState2;
                                eBillFetchUISpecs6 = eBillFetchUISpecs4;
                                chaloTextUIState10 = chaloTextUIState6;
                                chaloTextUIState11 = chaloTextUIState7;
                                str3 = (String) objB12;
                                CoroutineSingletons coroutineSingletons16 = coroutineSingletons10;
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                                eBillFetchComponent$convertToUiState$1.L$11 = str3;
                                eBillFetchComponent$convertToUiState$1.label = 8;
                                objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                                coroutineSingletons2 = coroutineSingletons16;
                                if (objB5 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                dialogUIStateFactory3 = dialogUIStateFactory2;
                                eBillFetchDataState6 = eBillFetchDataState5;
                                str4 = str3;
                                objB12 = objB5;
                                str5 = (String) objB12;
                                coroutineSingletons3 = coroutineSingletons2;
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                                eBillFetchComponent$convertToUiState$1.L$11 = str4;
                                eBillFetchComponent$convertToUiState$1.L$12 = str5;
                                eBillFetchComponent$convertToUiState$1.label = 9;
                                eBillFetchDataState7 = eBillFetchDataState6;
                                stringProvider2 = stringProvider4;
                                objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                                if (objB6 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                EBillFetchUISpecs eBillFetchUISpecs110 = eBillFetchUISpecs6;
                                str6 = str4;
                                eBillFetchUISpecs7 = eBillFetchUISpecs110;
                                obj2 = objB6;
                                coroutineSingletons4 = coroutineSingletons3;
                                chaloTextUIState12 = chaloTextUIState10;
                                textFieldUIState4 = textFieldUIState3;
                                buttonUIState3 = buttonUIState2;
                                loadingDialogUIState5 = loadingDialogUIState4;
                                chaloTextUIState13 = chaloTextUIState9;
                                chaloTextUIState14 = chaloTextUIState11;
                                clickableTextUiState3 = clickableTextUiState2;
                                dialogUIStateFactory4 = dialogUIStateFactory3;
                                str7 = str5;
                                eBillFetchDataState8 = eBillFetchDataState7;
                                str8 = (String) obj2;
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                                eBillFetchComponent$convertToUiState$1.L$11 = str6;
                                eBillFetchComponent$convertToUiState$1.L$12 = str7;
                                eBillFetchComponent$convertToUiState$1.L$13 = str8;
                                eBillFetchComponent$convertToUiState$1.label = 10;
                                eBillFetchUISpecs8 = eBillFetchUISpecs7;
                                stringProvider = stringProvider2;
                                objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                                coroutineSingletons = coroutineSingletons4;
                                if (objB7 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                chaloTextUIState15 = chaloTextUIState12;
                                str9 = str7;
                                str10 = str6;
                                str11 = str8;
                                chaloTextUIState16 = chaloTextUIState13;
                                chaloTextUIState17 = chaloTextUIState14;
                                clickableTextUiState4 = clickableTextUiState3;
                                textFieldUIState5 = textFieldUIState4;
                                buttonUIState = buttonUIState3;
                                loadingDialogUIState3 = loadingDialogUIState5;
                                String str117 = (String) objB7;
                                final int i1115 = 1;
                                eBillFetchComponent = this;
                                Function0 function110 = new Function0(eBillFetchComponent) { // from class: u00
                                    public final /* synthetic */ EBillFetchComponent b;

                                    {
                                        this.b = eBillFetchComponent;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i1115) {
                                            case 0:
                                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                break;
                                            case 1:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                break;
                                            case 2:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                break;
                                            default:
                                                this.b.E0(new b00(4));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                };
                                EBillFetchDataState eBillFetchDataState18 = eBillFetchDataState8;
                                final int i1116 = 2;
                                Function0 function111 = new Function0(eBillFetchComponent) { // from class: u00
                                    public final /* synthetic */ EBillFetchComponent b;

                                    {
                                        this.b = eBillFetchComponent;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i1116) {
                                            case 0:
                                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                break;
                                            case 1:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                break;
                                            case 2:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                break;
                                            default:
                                                this.b.E0(new b00(4));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                };
                                dialogUIStateFactory4.getClass();
                                confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str117, function110, function111);
                                ToolbarUIState toolbarUIState18 = toolbarUIState5;
                                clickableTextUiState = clickableTextUiState4;
                                toolbarUIState4 = toolbarUIState18;
                                chaloTextUIState7 = chaloTextUIState17;
                                textFieldUIState2 = textFieldUIState5;
                                eBillFetchUISpecs5 = eBillFetchUISpecs8;
                                chaloTextUIState8 = chaloTextUIState16;
                                chaloTextUIState6 = chaloTextUIState15;
                                eBillFetchDataState4 = eBillFetchDataState18;
                            }
                        } else {
                            eBillFetchComponent = this;
                            ButtonUIState buttonUIState12 = buttonUIStateF;
                            stringProvider = stringProvider4;
                            coroutineSingletons = coroutineSingletons10;
                            eBillFetchUISpecs5 = eBillFetchUISpecs4;
                            buttonUIState = buttonUIState12;
                            confirmationDialogUiStateB = null;
                        }
                        z = eBillFetchDataState4.f;
                        snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                        if (z) {
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                            eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                            eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                            eBillFetchComponent$convertToUiState$1.L$12 = null;
                            eBillFetchComponent$convertToUiState$1.L$13 = null;
                            eBillFetchComponent$convertToUiState$1.label = 11;
                            objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                            coroutineSingletons7 = coroutineSingletons;
                            if (objB9 == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                            ConfirmationDialogUiState confirmationDialogUiState14 = confirmationDialogUiStateB;
                            objB12 = objB9;
                            toolbarUIState8 = toolbarUIState4;
                            chaloTextUIState24 = chaloTextUIState6;
                            textFieldUIState8 = textFieldUIState2;
                            clickableTextUiState7 = clickableTextUiState;
                            eBillFetchUISpecs10 = eBillFetchUISpecs5;
                            snackbarUIStateFactory3 = snackbarUIStateFactory;
                            buttonUIState6 = buttonUIState;
                            loadingDialogUIState8 = loadingDialogUIState3;
                            chaloTextUIState25 = chaloTextUIState8;
                            chaloTextUIState26 = chaloTextUIState7;
                            confirmationDialogUiState3 = confirmationDialogUiState14;
                            str12 = (String) objB12;
                            coroutineSingletons8 = coroutineSingletons7;
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                            eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                            eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                            eBillFetchComponent$convertToUiState$1.L$12 = str12;
                            toolbarUIState9 = toolbarUIState8;
                            eBillFetchComponent$convertToUiState$1.label = 12;
                            objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB10 == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                            str13 = str12;
                            chaloTextUIState27 = chaloTextUIState25;
                            chaloTextUIState28 = chaloTextUIState24;
                            loadingDialogUIState9 = loadingDialogUIState8;
                            eBillFetchDataState9 = eBillFetchDataState4;
                            eBillFetchUISpecs11 = eBillFetchUISpecs10;
                            toolbarUIState10 = toolbarUIState9;
                            objB12 = objB10;
                            final int i1117 = 1;
                            Function0 function112 = new Function0(this) { // from class: t00
                                public final /* synthetic */ EBillFetchComponent b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i1117) {
                                        case 0:
                                            this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                            break;
                                        default:
                                            this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            snackbarUIStateFactory3.getClass();
                            chaloTextUIState19 = chaloTextUIState27;
                            snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function112);
                            confirmationDialogUiState = confirmationDialogUiState3;
                            clickableTextUiState5 = clickableTextUiState7;
                            buttonUIState4 = buttonUIState6;
                            chaloTextUIState18 = chaloTextUIState26;
                            textFieldUIState6 = textFieldUIState8;
                            chaloTextUIState20 = chaloTextUIState28;
                            loadingDialogUIState6 = loadingDialogUIState9;
                            toolbarUIState6 = toolbarUIState10;
                            eBillFetchUISpecs9 = eBillFetchUISpecs11;
                        } else {
                            coroutineSingletons5 = coroutineSingletons;
                            stringProvider3 = stringProvider;
                            if (eBillFetchDataState4.g) {
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                                eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                                eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                                eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                                eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                                eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                                eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                                eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                                eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                                eBillFetchComponent$convertToUiState$1.L$11 = null;
                                eBillFetchComponent$convertToUiState$1.L$12 = null;
                                eBillFetchComponent$convertToUiState$1.L$13 = null;
                                eBillFetchComponent$convertToUiState$1.label = 13;
                                objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                                coroutineSingletons6 = coroutineSingletons5;
                                if (objB8 == coroutineSingletons6) {
                                    return coroutineSingletons6;
                                }
                                ConfirmationDialogUiState confirmationDialogUiState15 = confirmationDialogUiStateB;
                                objB12 = objB8;
                                snackbarUIStateFactory2 = snackbarUIStateFactory;
                                buttonUIState5 = buttonUIState;
                                toolbarUIState7 = toolbarUIState4;
                                chaloTextUIState21 = chaloTextUIState8;
                                chaloTextUIState22 = chaloTextUIState7;
                                confirmationDialogUiState2 = confirmationDialogUiState15;
                                loadingDialogUIState7 = loadingDialogUIState3;
                                chaloTextUIState23 = chaloTextUIState6;
                                textFieldUIState7 = textFieldUIState2;
                                clickableTextUiState6 = clickableTextUiState;
                                str14 = (String) objB12;
                                coroutineSingletons9 = coroutineSingletons6;
                                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                                eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                                eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                                eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                                eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                                eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                                eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                                eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                                eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                                eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                                eBillFetchComponent$convertToUiState$1.L$11 = str14;
                                snackbarUIStateFactory4 = snackbarUIStateFactory2;
                                eBillFetchComponent$convertToUiState$1.label = 14;
                                objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                                if (objB11 == coroutineSingletons9) {
                                    return coroutineSingletons9;
                                }
                                str15 = str14;
                                eBillFetchUISpecs12 = eBillFetchUISpecs5;
                                chaloTextUIState29 = chaloTextUIState21;
                                loadingDialogUIState10 = loadingDialogUIState7;
                                snackbarUIStateFactory5 = snackbarUIStateFactory4;
                                objB12 = objB11;
                                final int i1118 = 3;
                                Function0 function113 = new Function0(this) { // from class: u00
                                    public final /* synthetic */ EBillFetchComponent b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i1118) {
                                            case 0:
                                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                                break;
                                            case 1:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                                break;
                                            case 2:
                                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                                break;
                                            default:
                                                this.b.E0(new b00(4));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                };
                                snackbarUIStateFactory5.getClass();
                                snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function113);
                                eBillFetchUISpecs9 = eBillFetchUISpecs12;
                                confirmationDialogUiState = confirmationDialogUiState2;
                                clickableTextUiState5 = clickableTextUiState6;
                                buttonUIState4 = buttonUIState5;
                                chaloTextUIState18 = chaloTextUIState22;
                                textFieldUIState6 = textFieldUIState7;
                                chaloTextUIState19 = chaloTextUIState29;
                                chaloTextUIState20 = chaloTextUIState23;
                                loadingDialogUIState6 = loadingDialogUIState10;
                                toolbarUIState6 = toolbarUIState7;
                            } else {
                                confirmationDialogUiState = confirmationDialogUiStateB;
                                eBillFetchUISpecs9 = eBillFetchUISpecs5;
                                chaloTextUIState18 = chaloTextUIState7;
                                textFieldUIState6 = textFieldUIState2;
                                chaloTextUIState19 = chaloTextUIState8;
                                chaloTextUIState20 = chaloTextUIState6;
                                snackbarUIStateA = null;
                                loadingDialogUIState6 = loadingDialogUIState3;
                                toolbarUIState6 = toolbarUIState4;
                                buttonUIState4 = buttonUIState;
                                clickableTextUiState5 = clickableTextUiState;
                            }
                        }
                        return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
                    }
                }
                coroutineSingletons10 = coroutineSingletons10;
                return coroutineSingletons10;
            case 5:
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) eBillFetchComponent$convertToUiState$1.L$8;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                chaloTextUIState6 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                loadingDialogUIState3 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                toolbarUIState4 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                eBillFetchUISpecs4 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                eBillFetchDataState4 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                buttonUIStateFactory2 = buttonUIStateFactory3;
                TextUIState.ChaloTextUIState chaloTextUIState37 = new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                final int i1119 = 0;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIState37, new Function0(this) { // from class: t00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i1119) {
                            case 0:
                                this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState4.d));
                                break;
                            default:
                                this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState4.d));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, null, eBillFetchDataState4.c, 0.0f, 44);
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                eBillFetchComponent$convertToUiState$1.label = 6;
                objB12 = stringProvider4.b(StringEnum.VIEW_PAYMENT_HISTORY, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB12 != coroutineSingletons10) {
                    final int i11110 = 0;
                    clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                        public final /* synthetic */ EBillFetchComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i11110) {
                                case 0:
                                    this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                    break;
                                case 1:
                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                    break;
                                case 2:
                                    this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                    break;
                                default:
                                    this.b.E0(new b00(4));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }), 30);
                    if (eBillFetchDataState4.e) {
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                        eBillFetchComponent$convertToUiState$1.label = 7;
                        objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB4 != coroutineSingletons10) {
                            coroutineSingletons10 = coroutineSingletons10;
                            objB12 = objB4;
                            dialogUIStateFactory2 = dialogUIStateFactory5;
                            clickableTextUiState2 = clickableTextUiState;
                            toolbarUIState5 = toolbarUIState4;
                            chaloTextUIState9 = chaloTextUIState8;
                            buttonUIState2 = buttonUIStateF;
                            eBillFetchDataState5 = eBillFetchDataState4;
                            loadingDialogUIState4 = loadingDialogUIState3;
                            textFieldUIState3 = textFieldUIState2;
                            eBillFetchUISpecs6 = eBillFetchUISpecs4;
                            chaloTextUIState10 = chaloTextUIState6;
                            chaloTextUIState11 = chaloTextUIState7;
                            str3 = (String) objB12;
                            CoroutineSingletons coroutineSingletons17 = coroutineSingletons10;
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                            eBillFetchComponent$convertToUiState$1.L$11 = str3;
                            eBillFetchComponent$convertToUiState$1.label = 8;
                            objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                            coroutineSingletons2 = coroutineSingletons17;
                            if (objB5 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            dialogUIStateFactory3 = dialogUIStateFactory2;
                            eBillFetchDataState6 = eBillFetchDataState5;
                            str4 = str3;
                            objB12 = objB5;
                            str5 = (String) objB12;
                            coroutineSingletons3 = coroutineSingletons2;
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                            eBillFetchComponent$convertToUiState$1.L$11 = str4;
                            eBillFetchComponent$convertToUiState$1.L$12 = str5;
                            eBillFetchComponent$convertToUiState$1.label = 9;
                            eBillFetchDataState7 = eBillFetchDataState6;
                            stringProvider2 = stringProvider4;
                            objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB6 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            EBillFetchUISpecs eBillFetchUISpecs111 = eBillFetchUISpecs6;
                            str6 = str4;
                            eBillFetchUISpecs7 = eBillFetchUISpecs111;
                            obj2 = objB6;
                            coroutineSingletons4 = coroutineSingletons3;
                            chaloTextUIState12 = chaloTextUIState10;
                            textFieldUIState4 = textFieldUIState3;
                            buttonUIState3 = buttonUIState2;
                            loadingDialogUIState5 = loadingDialogUIState4;
                            chaloTextUIState13 = chaloTextUIState9;
                            chaloTextUIState14 = chaloTextUIState11;
                            clickableTextUiState3 = clickableTextUiState2;
                            dialogUIStateFactory4 = dialogUIStateFactory3;
                            str7 = str5;
                            eBillFetchDataState8 = eBillFetchDataState7;
                            str8 = (String) obj2;
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                            eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                            eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                            eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                            eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                            eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                            eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                            eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                            eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                            eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                            eBillFetchComponent$convertToUiState$1.L$11 = str6;
                            eBillFetchComponent$convertToUiState$1.L$12 = str7;
                            eBillFetchComponent$convertToUiState$1.L$13 = str8;
                            eBillFetchComponent$convertToUiState$1.label = 10;
                            eBillFetchUISpecs8 = eBillFetchUISpecs7;
                            stringProvider = stringProvider2;
                            objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                            coroutineSingletons = coroutineSingletons4;
                            if (objB7 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            chaloTextUIState15 = chaloTextUIState12;
                            str9 = str7;
                            str10 = str6;
                            str11 = str8;
                            chaloTextUIState16 = chaloTextUIState13;
                            chaloTextUIState17 = chaloTextUIState14;
                            clickableTextUiState4 = clickableTextUiState3;
                            textFieldUIState5 = textFieldUIState4;
                            buttonUIState = buttonUIState3;
                            loadingDialogUIState3 = loadingDialogUIState5;
                            String str118 = (String) objB7;
                            final int i11111 = 1;
                            eBillFetchComponent = this;
                            Function0 function114 = new Function0(eBillFetchComponent) { // from class: u00
                                public final /* synthetic */ EBillFetchComponent b;

                                {
                                    this.b = eBillFetchComponent;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i11111) {
                                        case 0:
                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                            break;
                                        case 1:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                            break;
                                        case 2:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                            break;
                                        default:
                                            this.b.E0(new b00(4));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            EBillFetchDataState eBillFetchDataState19 = eBillFetchDataState8;
                            final int i11112 = 2;
                            Function0 function115 = new Function0(eBillFetchComponent) { // from class: u00
                                public final /* synthetic */ EBillFetchComponent b;

                                {
                                    this.b = eBillFetchComponent;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i11112) {
                                        case 0:
                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                            break;
                                        case 1:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                            break;
                                        case 2:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                            break;
                                        default:
                                            this.b.E0(new b00(4));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            dialogUIStateFactory4.getClass();
                            confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str118, function114, function115);
                            ToolbarUIState toolbarUIState19 = toolbarUIState5;
                            clickableTextUiState = clickableTextUiState4;
                            toolbarUIState4 = toolbarUIState19;
                            chaloTextUIState7 = chaloTextUIState17;
                            textFieldUIState2 = textFieldUIState5;
                            eBillFetchUISpecs5 = eBillFetchUISpecs8;
                            chaloTextUIState8 = chaloTextUIState16;
                            chaloTextUIState6 = chaloTextUIState15;
                            eBillFetchDataState4 = eBillFetchDataState19;
                        }
                    } else {
                        eBillFetchComponent = this;
                        ButtonUIState buttonUIState13 = buttonUIStateF;
                        stringProvider = stringProvider4;
                        coroutineSingletons = coroutineSingletons10;
                        eBillFetchUISpecs5 = eBillFetchUISpecs4;
                        buttonUIState = buttonUIState13;
                        confirmationDialogUiStateB = null;
                    }
                    z = eBillFetchDataState4.f;
                    snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                    if (z) {
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                        eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                        eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                        eBillFetchComponent$convertToUiState$1.label = 11;
                        objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons7 = coroutineSingletons;
                        if (objB9 == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                        ConfirmationDialogUiState confirmationDialogUiState16 = confirmationDialogUiStateB;
                        objB12 = objB9;
                        toolbarUIState8 = toolbarUIState4;
                        chaloTextUIState24 = chaloTextUIState6;
                        textFieldUIState8 = textFieldUIState2;
                        clickableTextUiState7 = clickableTextUiState;
                        eBillFetchUISpecs10 = eBillFetchUISpecs5;
                        snackbarUIStateFactory3 = snackbarUIStateFactory;
                        buttonUIState6 = buttonUIState;
                        loadingDialogUIState8 = loadingDialogUIState3;
                        chaloTextUIState25 = chaloTextUIState8;
                        chaloTextUIState26 = chaloTextUIState7;
                        confirmationDialogUiState3 = confirmationDialogUiState16;
                        str12 = (String) objB12;
                        coroutineSingletons8 = coroutineSingletons7;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                        eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                        eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                        eBillFetchComponent$convertToUiState$1.L$12 = str12;
                        toolbarUIState9 = toolbarUIState8;
                        eBillFetchComponent$convertToUiState$1.label = 12;
                        objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB10 == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                        str13 = str12;
                        chaloTextUIState27 = chaloTextUIState25;
                        chaloTextUIState28 = chaloTextUIState24;
                        loadingDialogUIState9 = loadingDialogUIState8;
                        eBillFetchDataState9 = eBillFetchDataState4;
                        eBillFetchUISpecs11 = eBillFetchUISpecs10;
                        toolbarUIState10 = toolbarUIState9;
                        objB12 = objB10;
                        final int i11113 = 1;
                        Function0 function116 = new Function0(this) { // from class: t00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11113) {
                                    case 0:
                                        this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                        break;
                                    default:
                                        this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory3.getClass();
                        chaloTextUIState19 = chaloTextUIState27;
                        snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function116);
                        confirmationDialogUiState = confirmationDialogUiState3;
                        clickableTextUiState5 = clickableTextUiState7;
                        buttonUIState4 = buttonUIState6;
                        chaloTextUIState18 = chaloTextUIState26;
                        textFieldUIState6 = textFieldUIState8;
                        chaloTextUIState20 = chaloTextUIState28;
                        loadingDialogUIState6 = loadingDialogUIState9;
                        toolbarUIState6 = toolbarUIState10;
                        eBillFetchUISpecs9 = eBillFetchUISpecs11;
                    } else {
                        coroutineSingletons5 = coroutineSingletons;
                        stringProvider3 = stringProvider;
                        if (eBillFetchDataState4.g) {
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                            eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                            eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                            eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                            eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                            eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                            eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                            eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                            eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                            eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                            eBillFetchComponent$convertToUiState$1.L$11 = null;
                            eBillFetchComponent$convertToUiState$1.L$12 = null;
                            eBillFetchComponent$convertToUiState$1.L$13 = null;
                            eBillFetchComponent$convertToUiState$1.label = 13;
                            objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                            coroutineSingletons6 = coroutineSingletons5;
                            if (objB8 == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                            ConfirmationDialogUiState confirmationDialogUiState17 = confirmationDialogUiStateB;
                            objB12 = objB8;
                            snackbarUIStateFactory2 = snackbarUIStateFactory;
                            buttonUIState5 = buttonUIState;
                            toolbarUIState7 = toolbarUIState4;
                            chaloTextUIState21 = chaloTextUIState8;
                            chaloTextUIState22 = chaloTextUIState7;
                            confirmationDialogUiState2 = confirmationDialogUiState17;
                            loadingDialogUIState7 = loadingDialogUIState3;
                            chaloTextUIState23 = chaloTextUIState6;
                            textFieldUIState7 = textFieldUIState2;
                            clickableTextUiState6 = clickableTextUiState;
                            str14 = (String) objB12;
                            coroutineSingletons9 = coroutineSingletons6;
                            eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                            eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                            eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                            eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                            eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                            eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                            eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                            eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                            eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                            eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                            eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                            eBillFetchComponent$convertToUiState$1.L$11 = str14;
                            snackbarUIStateFactory4 = snackbarUIStateFactory2;
                            eBillFetchComponent$convertToUiState$1.label = 14;
                            objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                            if (objB11 == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                            str15 = str14;
                            eBillFetchUISpecs12 = eBillFetchUISpecs5;
                            chaloTextUIState29 = chaloTextUIState21;
                            loadingDialogUIState10 = loadingDialogUIState7;
                            snackbarUIStateFactory5 = snackbarUIStateFactory4;
                            objB12 = objB11;
                            final int i11114 = 3;
                            Function0 function117 = new Function0(this) { // from class: u00
                                public final /* synthetic */ EBillFetchComponent b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i11114) {
                                        case 0:
                                            this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                            break;
                                        case 1:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                            break;
                                        case 2:
                                            this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                            break;
                                        default:
                                            this.b.E0(new b00(4));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            snackbarUIStateFactory5.getClass();
                            snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function117);
                            eBillFetchUISpecs9 = eBillFetchUISpecs12;
                            confirmationDialogUiState = confirmationDialogUiState2;
                            clickableTextUiState5 = clickableTextUiState6;
                            buttonUIState4 = buttonUIState5;
                            chaloTextUIState18 = chaloTextUIState22;
                            textFieldUIState6 = textFieldUIState7;
                            chaloTextUIState19 = chaloTextUIState29;
                            chaloTextUIState20 = chaloTextUIState23;
                            loadingDialogUIState6 = loadingDialogUIState10;
                            toolbarUIState6 = toolbarUIState7;
                        } else {
                            confirmationDialogUiState = confirmationDialogUiStateB;
                            eBillFetchUISpecs9 = eBillFetchUISpecs5;
                            chaloTextUIState18 = chaloTextUIState7;
                            textFieldUIState6 = textFieldUIState2;
                            chaloTextUIState19 = chaloTextUIState8;
                            chaloTextUIState20 = chaloTextUIState6;
                            snackbarUIStateA = null;
                            loadingDialogUIState6 = loadingDialogUIState3;
                            toolbarUIState6 = toolbarUIState4;
                            buttonUIState4 = buttonUIState;
                            clickableTextUiState5 = clickableTextUiState;
                        }
                    }
                    return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
                }
                coroutineSingletons10 = coroutineSingletons10;
                return coroutineSingletons10;
            case 6:
                buttonUIStateF = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$8;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                chaloTextUIState6 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                loadingDialogUIState3 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                toolbarUIState4 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                eBillFetchUISpecs4 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                eBillFetchDataState4 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                final int i11115 = 0;
                clickableTextUiState = new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) objB12, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, UiEventHandler.Companion.a(new Function0(this) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11115) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }), 30);
                if (eBillFetchDataState4.e) {
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs4;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIStateF;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                    eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory5;
                    eBillFetchComponent$convertToUiState$1.label = 7;
                    objB4 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_TITLE, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB4 != coroutineSingletons10) {
                        coroutineSingletons10 = coroutineSingletons10;
                        objB12 = objB4;
                        dialogUIStateFactory2 = dialogUIStateFactory5;
                        clickableTextUiState2 = clickableTextUiState;
                        toolbarUIState5 = toolbarUIState4;
                        chaloTextUIState9 = chaloTextUIState8;
                        buttonUIState2 = buttonUIStateF;
                        eBillFetchDataState5 = eBillFetchDataState4;
                        loadingDialogUIState4 = loadingDialogUIState3;
                        textFieldUIState3 = textFieldUIState2;
                        eBillFetchUISpecs6 = eBillFetchUISpecs4;
                        chaloTextUIState10 = chaloTextUIState6;
                        chaloTextUIState11 = chaloTextUIState7;
                        str3 = (String) objB12;
                        CoroutineSingletons coroutineSingletons18 = coroutineSingletons10;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.L$11 = str3;
                        eBillFetchComponent$convertToUiState$1.label = 8;
                        objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons2 = coroutineSingletons18;
                        if (objB5 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        dialogUIStateFactory3 = dialogUIStateFactory2;
                        eBillFetchDataState6 = eBillFetchDataState5;
                        str4 = str3;
                        objB12 = objB5;
                        str5 = (String) objB12;
                        coroutineSingletons3 = coroutineSingletons2;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                        eBillFetchComponent$convertToUiState$1.L$11 = str4;
                        eBillFetchComponent$convertToUiState$1.L$12 = str5;
                        eBillFetchComponent$convertToUiState$1.label = 9;
                        eBillFetchDataState7 = eBillFetchDataState6;
                        stringProvider2 = stringProvider4;
                        objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB6 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        EBillFetchUISpecs eBillFetchUISpecs112 = eBillFetchUISpecs6;
                        str6 = str4;
                        eBillFetchUISpecs7 = eBillFetchUISpecs112;
                        obj2 = objB6;
                        coroutineSingletons4 = coroutineSingletons3;
                        chaloTextUIState12 = chaloTextUIState10;
                        textFieldUIState4 = textFieldUIState3;
                        buttonUIState3 = buttonUIState2;
                        loadingDialogUIState5 = loadingDialogUIState4;
                        chaloTextUIState13 = chaloTextUIState9;
                        chaloTextUIState14 = chaloTextUIState11;
                        clickableTextUiState3 = clickableTextUiState2;
                        dialogUIStateFactory4 = dialogUIStateFactory3;
                        str7 = str5;
                        eBillFetchDataState8 = eBillFetchDataState7;
                        str8 = (String) obj2;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                        eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                        eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                        eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                        eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                        eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                        eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                        eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                        eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                        eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                        eBillFetchComponent$convertToUiState$1.L$11 = str6;
                        eBillFetchComponent$convertToUiState$1.L$12 = str7;
                        eBillFetchComponent$convertToUiState$1.L$13 = str8;
                        eBillFetchComponent$convertToUiState$1.label = 10;
                        eBillFetchUISpecs8 = eBillFetchUISpecs7;
                        stringProvider = stringProvider2;
                        objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons = coroutineSingletons4;
                        if (objB7 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        chaloTextUIState15 = chaloTextUIState12;
                        str9 = str7;
                        str10 = str6;
                        str11 = str8;
                        chaloTextUIState16 = chaloTextUIState13;
                        chaloTextUIState17 = chaloTextUIState14;
                        clickableTextUiState4 = clickableTextUiState3;
                        textFieldUIState5 = textFieldUIState4;
                        buttonUIState = buttonUIState3;
                        loadingDialogUIState3 = loadingDialogUIState5;
                        String str119 = (String) objB7;
                        final int i11116 = 1;
                        eBillFetchComponent = this;
                        Function0 function118 = new Function0(eBillFetchComponent) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = eBillFetchComponent;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11116) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        EBillFetchDataState eBillFetchDataState110 = eBillFetchDataState8;
                        final int i11117 = 2;
                        Function0 function119 = new Function0(eBillFetchComponent) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = eBillFetchComponent;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11117) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        dialogUIStateFactory4.getClass();
                        confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str119, function118, function119);
                        ToolbarUIState toolbarUIState110 = toolbarUIState5;
                        clickableTextUiState = clickableTextUiState4;
                        toolbarUIState4 = toolbarUIState110;
                        chaloTextUIState7 = chaloTextUIState17;
                        textFieldUIState2 = textFieldUIState5;
                        eBillFetchUISpecs5 = eBillFetchUISpecs8;
                        chaloTextUIState8 = chaloTextUIState16;
                        chaloTextUIState6 = chaloTextUIState15;
                        eBillFetchDataState4 = eBillFetchDataState110;
                    }
                    coroutineSingletons10 = coroutineSingletons10;
                    return coroutineSingletons10;
                }
                eBillFetchComponent = this;
                ButtonUIState buttonUIState14 = buttonUIStateF;
                stringProvider = stringProvider4;
                coroutineSingletons = coroutineSingletons10;
                eBillFetchUISpecs5 = eBillFetchUISpecs4;
                buttonUIState = buttonUIState14;
                confirmationDialogUiStateB = null;
                z = eBillFetchDataState4.f;
                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                if (z) {
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                    eBillFetchComponent$convertToUiState$1.label = 11;
                    objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                    coroutineSingletons7 = coroutineSingletons;
                    if (objB9 == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                    ConfirmationDialogUiState confirmationDialogUiState18 = confirmationDialogUiStateB;
                    objB12 = objB9;
                    toolbarUIState8 = toolbarUIState4;
                    chaloTextUIState24 = chaloTextUIState6;
                    textFieldUIState8 = textFieldUIState2;
                    clickableTextUiState7 = clickableTextUiState;
                    eBillFetchUISpecs10 = eBillFetchUISpecs5;
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    buttonUIState6 = buttonUIState;
                    loadingDialogUIState8 = loadingDialogUIState3;
                    chaloTextUIState25 = chaloTextUIState8;
                    chaloTextUIState26 = chaloTextUIState7;
                    confirmationDialogUiState3 = confirmationDialogUiState18;
                    str12 = (String) objB12;
                    coroutineSingletons8 = coroutineSingletons7;
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                    eBillFetchComponent$convertToUiState$1.L$12 = str12;
                    toolbarUIState9 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.label = 12;
                    objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB10 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    str13 = str12;
                    chaloTextUIState27 = chaloTextUIState25;
                    chaloTextUIState28 = chaloTextUIState24;
                    loadingDialogUIState9 = loadingDialogUIState8;
                    eBillFetchDataState9 = eBillFetchDataState4;
                    eBillFetchUISpecs11 = eBillFetchUISpecs10;
                    toolbarUIState10 = toolbarUIState9;
                    objB12 = objB10;
                    final int i11118 = 1;
                    Function0 function1110 = new Function0(this) { // from class: t00
                        public final /* synthetic */ EBillFetchComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i11118) {
                                case 0:
                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                    break;
                                default:
                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory3.getClass();
                    chaloTextUIState19 = chaloTextUIState27;
                    snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function1110);
                    confirmationDialogUiState = confirmationDialogUiState3;
                    clickableTextUiState5 = clickableTextUiState7;
                    buttonUIState4 = buttonUIState6;
                    chaloTextUIState18 = chaloTextUIState26;
                    textFieldUIState6 = textFieldUIState8;
                    chaloTextUIState20 = chaloTextUIState28;
                    loadingDialogUIState6 = loadingDialogUIState9;
                    toolbarUIState6 = toolbarUIState10;
                    eBillFetchUISpecs9 = eBillFetchUISpecs11;
                } else {
                    coroutineSingletons5 = coroutineSingletons;
                    stringProvider3 = stringProvider;
                    if (eBillFetchDataState4.g) {
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                        eBillFetchComponent$convertToUiState$1.L$11 = null;
                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                        eBillFetchComponent$convertToUiState$1.label = 13;
                        objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons6 = coroutineSingletons5;
                        if (objB8 == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        ConfirmationDialogUiState confirmationDialogUiState19 = confirmationDialogUiStateB;
                        objB12 = objB8;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        buttonUIState5 = buttonUIState;
                        toolbarUIState7 = toolbarUIState4;
                        chaloTextUIState21 = chaloTextUIState8;
                        chaloTextUIState22 = chaloTextUIState7;
                        confirmationDialogUiState2 = confirmationDialogUiState19;
                        loadingDialogUIState7 = loadingDialogUIState3;
                        chaloTextUIState23 = chaloTextUIState6;
                        textFieldUIState7 = textFieldUIState2;
                        clickableTextUiState6 = clickableTextUiState;
                        str14 = (String) objB12;
                        coroutineSingletons9 = coroutineSingletons6;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.L$11 = str14;
                        snackbarUIStateFactory4 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.label = 14;
                        objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB11 == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        str15 = str14;
                        eBillFetchUISpecs12 = eBillFetchUISpecs5;
                        chaloTextUIState29 = chaloTextUIState21;
                        loadingDialogUIState10 = loadingDialogUIState7;
                        snackbarUIStateFactory5 = snackbarUIStateFactory4;
                        objB12 = objB11;
                        final int i11119 = 3;
                        Function0 function1111 = new Function0(this) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11119) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory5.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function1111);
                        eBillFetchUISpecs9 = eBillFetchUISpecs12;
                        confirmationDialogUiState = confirmationDialogUiState2;
                        clickableTextUiState5 = clickableTextUiState6;
                        buttonUIState4 = buttonUIState5;
                        chaloTextUIState18 = chaloTextUIState22;
                        textFieldUIState6 = textFieldUIState7;
                        chaloTextUIState19 = chaloTextUIState29;
                        chaloTextUIState20 = chaloTextUIState23;
                        loadingDialogUIState6 = loadingDialogUIState10;
                        toolbarUIState6 = toolbarUIState7;
                    } else {
                        confirmationDialogUiState = confirmationDialogUiStateB;
                        eBillFetchUISpecs9 = eBillFetchUISpecs5;
                        chaloTextUIState18 = chaloTextUIState7;
                        textFieldUIState6 = textFieldUIState2;
                        chaloTextUIState19 = chaloTextUIState8;
                        chaloTextUIState20 = chaloTextUIState6;
                        snackbarUIStateA = null;
                        loadingDialogUIState6 = loadingDialogUIState3;
                        toolbarUIState6 = toolbarUIState4;
                        buttonUIState4 = buttonUIState;
                        clickableTextUiState5 = clickableTextUiState;
                    }
                }
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 7:
                DialogUIStateFactory dialogUIStateFactory7 = (DialogUIStateFactory) eBillFetchComponent$convertToUiState$1.L$10;
                ClickableTextUiState clickableTextUiState8 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$9;
                ButtonUIState buttonUIState15 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$8;
                TextUIState.ChaloTextUIState chaloTextUIState38 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState9 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState39 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState40 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                LoadingDialogUIState loadingDialogUIState12 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                ToolbarUIState toolbarUIState20 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                EBillFetchUISpecs eBillFetchUISpecs20 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchDataState eBillFetchDataState20 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                chaloTextUIState11 = chaloTextUIState38;
                eBillFetchUISpecs6 = eBillFetchUISpecs20;
                loadingDialogUIState4 = loadingDialogUIState12;
                chaloTextUIState9 = chaloTextUIState39;
                dialogUIStateFactory2 = dialogUIStateFactory7;
                clickableTextUiState2 = clickableTextUiState8;
                eBillFetchDataState5 = eBillFetchDataState20;
                toolbarUIState5 = toolbarUIState20;
                chaloTextUIState10 = chaloTextUIState40;
                textFieldUIState3 = textFieldUIState9;
                buttonUIState2 = buttonUIState15;
                str3 = (String) objB12;
                CoroutineSingletons coroutineSingletons19 = coroutineSingletons10;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState5;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory2;
                eBillFetchComponent$convertToUiState$1.L$11 = str3;
                eBillFetchComponent$convertToUiState$1.label = 8;
                objB5 = stringProvider4.b(StringEnum.PROCEED_WITH_EBILL_PAYMENT_DESC, new Object[0], eBillFetchComponent$convertToUiState$1);
                coroutineSingletons2 = coroutineSingletons19;
                if (objB5 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                dialogUIStateFactory3 = dialogUIStateFactory2;
                eBillFetchDataState6 = eBillFetchDataState5;
                str4 = str3;
                objB12 = objB5;
                str5 = (String) objB12;
                coroutineSingletons3 = coroutineSingletons2;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                eBillFetchComponent$convertToUiState$1.L$11 = str4;
                eBillFetchComponent$convertToUiState$1.L$12 = str5;
                eBillFetchComponent$convertToUiState$1.label = 9;
                eBillFetchDataState7 = eBillFetchDataState6;
                stringProvider2 = stringProvider4;
                objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB6 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                EBillFetchUISpecs eBillFetchUISpecs113 = eBillFetchUISpecs6;
                str6 = str4;
                eBillFetchUISpecs7 = eBillFetchUISpecs113;
                obj2 = objB6;
                coroutineSingletons4 = coroutineSingletons3;
                chaloTextUIState12 = chaloTextUIState10;
                textFieldUIState4 = textFieldUIState3;
                buttonUIState3 = buttonUIState2;
                loadingDialogUIState5 = loadingDialogUIState4;
                chaloTextUIState13 = chaloTextUIState9;
                chaloTextUIState14 = chaloTextUIState11;
                clickableTextUiState3 = clickableTextUiState2;
                dialogUIStateFactory4 = dialogUIStateFactory3;
                str7 = str5;
                eBillFetchDataState8 = eBillFetchDataState7;
                str8 = (String) obj2;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                eBillFetchComponent$convertToUiState$1.L$11 = str6;
                eBillFetchComponent$convertToUiState$1.L$12 = str7;
                eBillFetchComponent$convertToUiState$1.L$13 = str8;
                eBillFetchComponent$convertToUiState$1.label = 10;
                eBillFetchUISpecs8 = eBillFetchUISpecs7;
                stringProvider = stringProvider2;
                objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                coroutineSingletons = coroutineSingletons4;
                if (objB7 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTextUIState15 = chaloTextUIState12;
                str9 = str7;
                str10 = str6;
                str11 = str8;
                chaloTextUIState16 = chaloTextUIState13;
                chaloTextUIState17 = chaloTextUIState14;
                clickableTextUiState4 = clickableTextUiState3;
                textFieldUIState5 = textFieldUIState4;
                buttonUIState = buttonUIState3;
                loadingDialogUIState3 = loadingDialogUIState5;
                String str1110 = (String) objB7;
                final int i111110 = 1;
                eBillFetchComponent = this;
                Function0 function1112 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i111110) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                EBillFetchDataState eBillFetchDataState111 = eBillFetchDataState8;
                final int i111111 = 2;
                Function0 function1113 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i111111) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                dialogUIStateFactory4.getClass();
                confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str1110, function1112, function1113);
                ToolbarUIState toolbarUIState111 = toolbarUIState5;
                clickableTextUiState = clickableTextUiState4;
                toolbarUIState4 = toolbarUIState111;
                chaloTextUIState7 = chaloTextUIState17;
                textFieldUIState2 = textFieldUIState5;
                eBillFetchUISpecs5 = eBillFetchUISpecs8;
                chaloTextUIState8 = chaloTextUIState16;
                chaloTextUIState6 = chaloTextUIState15;
                eBillFetchDataState4 = eBillFetchDataState111;
                z = eBillFetchDataState4.f;
                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                if (z) {
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                    eBillFetchComponent$convertToUiState$1.label = 11;
                    objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                    coroutineSingletons7 = coroutineSingletons;
                    if (objB9 == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                    ConfirmationDialogUiState confirmationDialogUiState110 = confirmationDialogUiStateB;
                    objB12 = objB9;
                    toolbarUIState8 = toolbarUIState4;
                    chaloTextUIState24 = chaloTextUIState6;
                    textFieldUIState8 = textFieldUIState2;
                    clickableTextUiState7 = clickableTextUiState;
                    eBillFetchUISpecs10 = eBillFetchUISpecs5;
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    buttonUIState6 = buttonUIState;
                    loadingDialogUIState8 = loadingDialogUIState3;
                    chaloTextUIState25 = chaloTextUIState8;
                    chaloTextUIState26 = chaloTextUIState7;
                    confirmationDialogUiState3 = confirmationDialogUiState110;
                    str12 = (String) objB12;
                    coroutineSingletons8 = coroutineSingletons7;
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                    eBillFetchComponent$convertToUiState$1.L$12 = str12;
                    toolbarUIState9 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.label = 12;
                    objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB10 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    str13 = str12;
                    chaloTextUIState27 = chaloTextUIState25;
                    chaloTextUIState28 = chaloTextUIState24;
                    loadingDialogUIState9 = loadingDialogUIState8;
                    eBillFetchDataState9 = eBillFetchDataState4;
                    eBillFetchUISpecs11 = eBillFetchUISpecs10;
                    toolbarUIState10 = toolbarUIState9;
                    objB12 = objB10;
                    final int i111112 = 1;
                    Function0 function1114 = new Function0(this) { // from class: t00
                        public final /* synthetic */ EBillFetchComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i111112) {
                                case 0:
                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                    break;
                                default:
                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory3.getClass();
                    chaloTextUIState19 = chaloTextUIState27;
                    snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function1114);
                    confirmationDialogUiState = confirmationDialogUiState3;
                    clickableTextUiState5 = clickableTextUiState7;
                    buttonUIState4 = buttonUIState6;
                    chaloTextUIState18 = chaloTextUIState26;
                    textFieldUIState6 = textFieldUIState8;
                    chaloTextUIState20 = chaloTextUIState28;
                    loadingDialogUIState6 = loadingDialogUIState9;
                    toolbarUIState6 = toolbarUIState10;
                    eBillFetchUISpecs9 = eBillFetchUISpecs11;
                } else {
                    coroutineSingletons5 = coroutineSingletons;
                    stringProvider3 = stringProvider;
                    if (eBillFetchDataState4.g) {
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                        eBillFetchComponent$convertToUiState$1.L$11 = null;
                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                        eBillFetchComponent$convertToUiState$1.label = 13;
                        objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons6 = coroutineSingletons5;
                        if (objB8 == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        ConfirmationDialogUiState confirmationDialogUiState111 = confirmationDialogUiStateB;
                        objB12 = objB8;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        buttonUIState5 = buttonUIState;
                        toolbarUIState7 = toolbarUIState4;
                        chaloTextUIState21 = chaloTextUIState8;
                        chaloTextUIState22 = chaloTextUIState7;
                        confirmationDialogUiState2 = confirmationDialogUiState111;
                        loadingDialogUIState7 = loadingDialogUIState3;
                        chaloTextUIState23 = chaloTextUIState6;
                        textFieldUIState7 = textFieldUIState2;
                        clickableTextUiState6 = clickableTextUiState;
                        str14 = (String) objB12;
                        coroutineSingletons9 = coroutineSingletons6;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.L$11 = str14;
                        snackbarUIStateFactory4 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.label = 14;
                        objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB11 == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        str15 = str14;
                        eBillFetchUISpecs12 = eBillFetchUISpecs5;
                        chaloTextUIState29 = chaloTextUIState21;
                        loadingDialogUIState10 = loadingDialogUIState7;
                        snackbarUIStateFactory5 = snackbarUIStateFactory4;
                        objB12 = objB11;
                        final int i111113 = 3;
                        Function0 function1115 = new Function0(this) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i111113) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory5.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function1115);
                        eBillFetchUISpecs9 = eBillFetchUISpecs12;
                        confirmationDialogUiState = confirmationDialogUiState2;
                        clickableTextUiState5 = clickableTextUiState6;
                        buttonUIState4 = buttonUIState5;
                        chaloTextUIState18 = chaloTextUIState22;
                        textFieldUIState6 = textFieldUIState7;
                        chaloTextUIState19 = chaloTextUIState29;
                        chaloTextUIState20 = chaloTextUIState23;
                        loadingDialogUIState6 = loadingDialogUIState10;
                        toolbarUIState6 = toolbarUIState7;
                    } else {
                        confirmationDialogUiState = confirmationDialogUiStateB;
                        eBillFetchUISpecs9 = eBillFetchUISpecs5;
                        chaloTextUIState18 = chaloTextUIState7;
                        textFieldUIState6 = textFieldUIState2;
                        chaloTextUIState19 = chaloTextUIState8;
                        chaloTextUIState20 = chaloTextUIState6;
                        snackbarUIStateA = null;
                        loadingDialogUIState6 = loadingDialogUIState3;
                        toolbarUIState6 = toolbarUIState4;
                        buttonUIState4 = buttonUIState;
                        clickableTextUiState5 = clickableTextUiState;
                    }
                }
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 8:
                String str20 = (String) eBillFetchComponent$convertToUiState$1.L$11;
                DialogUIStateFactory dialogUIStateFactory8 = (DialogUIStateFactory) eBillFetchComponent$convertToUiState$1.L$10;
                clickableTextUiState2 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$9;
                buttonUIState2 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$8;
                chaloTextUIState11 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                textFieldUIState3 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                chaloTextUIState9 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                chaloTextUIState10 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                loadingDialogUIState4 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                toolbarUIState5 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                eBillFetchUISpecs6 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchDataState eBillFetchDataState21 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                coroutineSingletons2 = coroutineSingletons10;
                dialogUIStateFactory3 = dialogUIStateFactory8;
                eBillFetchDataState6 = eBillFetchDataState21;
                str4 = str20;
                str5 = (String) objB12;
                coroutineSingletons3 = coroutineSingletons2;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState6;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs6;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState4;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState10;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState9;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState3;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState11;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState2;
                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState2;
                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory3;
                eBillFetchComponent$convertToUiState$1.L$11 = str4;
                eBillFetchComponent$convertToUiState$1.L$12 = str5;
                eBillFetchComponent$convertToUiState$1.label = 9;
                eBillFetchDataState7 = eBillFetchDataState6;
                stringProvider2 = stringProvider4;
                objB6 = stringProvider2.b(StringEnum.YES, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB6 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                EBillFetchUISpecs eBillFetchUISpecs114 = eBillFetchUISpecs6;
                str6 = str4;
                eBillFetchUISpecs7 = eBillFetchUISpecs114;
                obj2 = objB6;
                coroutineSingletons4 = coroutineSingletons3;
                chaloTextUIState12 = chaloTextUIState10;
                textFieldUIState4 = textFieldUIState3;
                buttonUIState3 = buttonUIState2;
                loadingDialogUIState5 = loadingDialogUIState4;
                chaloTextUIState13 = chaloTextUIState9;
                chaloTextUIState14 = chaloTextUIState11;
                clickableTextUiState3 = clickableTextUiState2;
                dialogUIStateFactory4 = dialogUIStateFactory3;
                str7 = str5;
                eBillFetchDataState8 = eBillFetchDataState7;
                str8 = (String) obj2;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                eBillFetchComponent$convertToUiState$1.L$11 = str6;
                eBillFetchComponent$convertToUiState$1.L$12 = str7;
                eBillFetchComponent$convertToUiState$1.L$13 = str8;
                eBillFetchComponent$convertToUiState$1.label = 10;
                eBillFetchUISpecs8 = eBillFetchUISpecs7;
                stringProvider = stringProvider2;
                objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                coroutineSingletons = coroutineSingletons4;
                if (objB7 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTextUIState15 = chaloTextUIState12;
                str9 = str7;
                str10 = str6;
                str11 = str8;
                chaloTextUIState16 = chaloTextUIState13;
                chaloTextUIState17 = chaloTextUIState14;
                clickableTextUiState4 = clickableTextUiState3;
                textFieldUIState5 = textFieldUIState4;
                buttonUIState = buttonUIState3;
                loadingDialogUIState3 = loadingDialogUIState5;
                String str1111 = (String) objB7;
                final int i111114 = 1;
                eBillFetchComponent = this;
                Function0 function1116 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i111114) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                EBillFetchDataState eBillFetchDataState112 = eBillFetchDataState8;
                final int i111115 = 2;
                Function0 function1117 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i111115) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                dialogUIStateFactory4.getClass();
                confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str1111, function1116, function1117);
                ToolbarUIState toolbarUIState112 = toolbarUIState5;
                clickableTextUiState = clickableTextUiState4;
                toolbarUIState4 = toolbarUIState112;
                chaloTextUIState7 = chaloTextUIState17;
                textFieldUIState2 = textFieldUIState5;
                eBillFetchUISpecs5 = eBillFetchUISpecs8;
                chaloTextUIState8 = chaloTextUIState16;
                chaloTextUIState6 = chaloTextUIState15;
                eBillFetchDataState4 = eBillFetchDataState112;
                z = eBillFetchDataState4.f;
                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                if (z) {
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                    eBillFetchComponent$convertToUiState$1.label = 11;
                    objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                    coroutineSingletons7 = coroutineSingletons;
                    if (objB9 == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                    ConfirmationDialogUiState confirmationDialogUiState112 = confirmationDialogUiStateB;
                    objB12 = objB9;
                    toolbarUIState8 = toolbarUIState4;
                    chaloTextUIState24 = chaloTextUIState6;
                    textFieldUIState8 = textFieldUIState2;
                    clickableTextUiState7 = clickableTextUiState;
                    eBillFetchUISpecs10 = eBillFetchUISpecs5;
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    buttonUIState6 = buttonUIState;
                    loadingDialogUIState8 = loadingDialogUIState3;
                    chaloTextUIState25 = chaloTextUIState8;
                    chaloTextUIState26 = chaloTextUIState7;
                    confirmationDialogUiState3 = confirmationDialogUiState112;
                    str12 = (String) objB12;
                    coroutineSingletons8 = coroutineSingletons7;
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                    eBillFetchComponent$convertToUiState$1.L$12 = str12;
                    toolbarUIState9 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.label = 12;
                    objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB10 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    str13 = str12;
                    chaloTextUIState27 = chaloTextUIState25;
                    chaloTextUIState28 = chaloTextUIState24;
                    loadingDialogUIState9 = loadingDialogUIState8;
                    eBillFetchDataState9 = eBillFetchDataState4;
                    eBillFetchUISpecs11 = eBillFetchUISpecs10;
                    toolbarUIState10 = toolbarUIState9;
                    objB12 = objB10;
                    final int i111116 = 1;
                    Function0 function1118 = new Function0(this) { // from class: t00
                        public final /* synthetic */ EBillFetchComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i111116) {
                                case 0:
                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                    break;
                                default:
                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory3.getClass();
                    chaloTextUIState19 = chaloTextUIState27;
                    snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function1118);
                    confirmationDialogUiState = confirmationDialogUiState3;
                    clickableTextUiState5 = clickableTextUiState7;
                    buttonUIState4 = buttonUIState6;
                    chaloTextUIState18 = chaloTextUIState26;
                    textFieldUIState6 = textFieldUIState8;
                    chaloTextUIState20 = chaloTextUIState28;
                    loadingDialogUIState6 = loadingDialogUIState9;
                    toolbarUIState6 = toolbarUIState10;
                    eBillFetchUISpecs9 = eBillFetchUISpecs11;
                } else {
                    coroutineSingletons5 = coroutineSingletons;
                    stringProvider3 = stringProvider;
                    if (eBillFetchDataState4.g) {
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                        eBillFetchComponent$convertToUiState$1.L$11 = null;
                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                        eBillFetchComponent$convertToUiState$1.label = 13;
                        objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons6 = coroutineSingletons5;
                        if (objB8 == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        ConfirmationDialogUiState confirmationDialogUiState113 = confirmationDialogUiStateB;
                        objB12 = objB8;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        buttonUIState5 = buttonUIState;
                        toolbarUIState7 = toolbarUIState4;
                        chaloTextUIState21 = chaloTextUIState8;
                        chaloTextUIState22 = chaloTextUIState7;
                        confirmationDialogUiState2 = confirmationDialogUiState113;
                        loadingDialogUIState7 = loadingDialogUIState3;
                        chaloTextUIState23 = chaloTextUIState6;
                        textFieldUIState7 = textFieldUIState2;
                        clickableTextUiState6 = clickableTextUiState;
                        str14 = (String) objB12;
                        coroutineSingletons9 = coroutineSingletons6;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.L$11 = str14;
                        snackbarUIStateFactory4 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.label = 14;
                        objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB11 == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        str15 = str14;
                        eBillFetchUISpecs12 = eBillFetchUISpecs5;
                        chaloTextUIState29 = chaloTextUIState21;
                        loadingDialogUIState10 = loadingDialogUIState7;
                        snackbarUIStateFactory5 = snackbarUIStateFactory4;
                        objB12 = objB11;
                        final int i111117 = 3;
                        Function0 function1119 = new Function0(this) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i111117) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory5.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function1119);
                        eBillFetchUISpecs9 = eBillFetchUISpecs12;
                        confirmationDialogUiState = confirmationDialogUiState2;
                        clickableTextUiState5 = clickableTextUiState6;
                        buttonUIState4 = buttonUIState5;
                        chaloTextUIState18 = chaloTextUIState22;
                        textFieldUIState6 = textFieldUIState7;
                        chaloTextUIState19 = chaloTextUIState29;
                        chaloTextUIState20 = chaloTextUIState23;
                        loadingDialogUIState6 = loadingDialogUIState10;
                        toolbarUIState6 = toolbarUIState7;
                    } else {
                        confirmationDialogUiState = confirmationDialogUiStateB;
                        eBillFetchUISpecs9 = eBillFetchUISpecs5;
                        chaloTextUIState18 = chaloTextUIState7;
                        textFieldUIState6 = textFieldUIState2;
                        chaloTextUIState19 = chaloTextUIState8;
                        chaloTextUIState20 = chaloTextUIState6;
                        snackbarUIStateA = null;
                        loadingDialogUIState6 = loadingDialogUIState3;
                        toolbarUIState6 = toolbarUIState4;
                        buttonUIState4 = buttonUIState;
                        clickableTextUiState5 = clickableTextUiState;
                    }
                }
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 9:
                String str21 = (String) eBillFetchComponent$convertToUiState$1.L$12;
                String str22 = (String) eBillFetchComponent$convertToUiState$1.L$11;
                DialogUIStateFactory dialogUIStateFactory9 = (DialogUIStateFactory) eBillFetchComponent$convertToUiState$1.L$10;
                ClickableTextUiState clickableTextUiState9 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$9;
                ButtonUIState buttonUIState16 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$8;
                TextUIState.ChaloTextUIState chaloTextUIState41 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState10 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState42 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState43 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                LoadingDialogUIState loadingDialogUIState13 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                toolbarUIState5 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                EBillFetchUISpecs eBillFetchUISpecs21 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchDataState eBillFetchDataState22 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                str6 = str22;
                chaloTextUIState12 = chaloTextUIState43;
                textFieldUIState4 = textFieldUIState10;
                buttonUIState3 = buttonUIState16;
                loadingDialogUIState5 = loadingDialogUIState13;
                chaloTextUIState13 = chaloTextUIState42;
                chaloTextUIState14 = chaloTextUIState41;
                clickableTextUiState3 = clickableTextUiState9;
                dialogUIStateFactory4 = dialogUIStateFactory9;
                coroutineSingletons4 = coroutineSingletons10;
                stringProvider2 = stringProvider4;
                str7 = str21;
                obj2 = objB12;
                eBillFetchDataState8 = eBillFetchDataState22;
                eBillFetchUISpecs7 = eBillFetchUISpecs21;
                str8 = (String) obj2;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState8;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs7;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState5;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState5;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState12;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState13;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState4;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState14;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState3;
                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState3;
                eBillFetchComponent$convertToUiState$1.L$10 = dialogUIStateFactory4;
                eBillFetchComponent$convertToUiState$1.L$11 = str6;
                eBillFetchComponent$convertToUiState$1.L$12 = str7;
                eBillFetchComponent$convertToUiState$1.L$13 = str8;
                eBillFetchComponent$convertToUiState$1.label = 10;
                eBillFetchUISpecs8 = eBillFetchUISpecs7;
                stringProvider = stringProvider2;
                objB7 = stringProvider.b(StringEnum.CANCEL, new Object[0], eBillFetchComponent$convertToUiState$1);
                coroutineSingletons = coroutineSingletons4;
                if (objB7 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTextUIState15 = chaloTextUIState12;
                str9 = str7;
                str10 = str6;
                str11 = str8;
                chaloTextUIState16 = chaloTextUIState13;
                chaloTextUIState17 = chaloTextUIState14;
                clickableTextUiState4 = clickableTextUiState3;
                textFieldUIState5 = textFieldUIState4;
                buttonUIState = buttonUIState3;
                loadingDialogUIState3 = loadingDialogUIState5;
                String str1112 = (String) objB7;
                final int i111118 = 1;
                eBillFetchComponent = this;
                Function0 function11110 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i111118) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                EBillFetchDataState eBillFetchDataState113 = eBillFetchDataState8;
                final int i111119 = 2;
                Function0 function11111 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i111119) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                dialogUIStateFactory4.getClass();
                confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str1112, function11110, function11111);
                ToolbarUIState toolbarUIState113 = toolbarUIState5;
                clickableTextUiState = clickableTextUiState4;
                toolbarUIState4 = toolbarUIState113;
                chaloTextUIState7 = chaloTextUIState17;
                textFieldUIState2 = textFieldUIState5;
                eBillFetchUISpecs5 = eBillFetchUISpecs8;
                chaloTextUIState8 = chaloTextUIState16;
                chaloTextUIState6 = chaloTextUIState15;
                eBillFetchDataState4 = eBillFetchDataState113;
                z = eBillFetchDataState4.f;
                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                if (z) {
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                    eBillFetchComponent$convertToUiState$1.label = 11;
                    objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                    coroutineSingletons7 = coroutineSingletons;
                    if (objB9 == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                    ConfirmationDialogUiState confirmationDialogUiState114 = confirmationDialogUiStateB;
                    objB12 = objB9;
                    toolbarUIState8 = toolbarUIState4;
                    chaloTextUIState24 = chaloTextUIState6;
                    textFieldUIState8 = textFieldUIState2;
                    clickableTextUiState7 = clickableTextUiState;
                    eBillFetchUISpecs10 = eBillFetchUISpecs5;
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    buttonUIState6 = buttonUIState;
                    loadingDialogUIState8 = loadingDialogUIState3;
                    chaloTextUIState25 = chaloTextUIState8;
                    chaloTextUIState26 = chaloTextUIState7;
                    confirmationDialogUiState3 = confirmationDialogUiState114;
                    str12 = (String) objB12;
                    coroutineSingletons8 = coroutineSingletons7;
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                    eBillFetchComponent$convertToUiState$1.L$12 = str12;
                    toolbarUIState9 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.label = 12;
                    objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB10 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    str13 = str12;
                    chaloTextUIState27 = chaloTextUIState25;
                    chaloTextUIState28 = chaloTextUIState24;
                    loadingDialogUIState9 = loadingDialogUIState8;
                    eBillFetchDataState9 = eBillFetchDataState4;
                    eBillFetchUISpecs11 = eBillFetchUISpecs10;
                    toolbarUIState10 = toolbarUIState9;
                    objB12 = objB10;
                    final int i1111110 = 1;
                    Function0 function11112 = new Function0(this) { // from class: t00
                        public final /* synthetic */ EBillFetchComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i1111110) {
                                case 0:
                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                    break;
                                default:
                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory3.getClass();
                    chaloTextUIState19 = chaloTextUIState27;
                    snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function11112);
                    confirmationDialogUiState = confirmationDialogUiState3;
                    clickableTextUiState5 = clickableTextUiState7;
                    buttonUIState4 = buttonUIState6;
                    chaloTextUIState18 = chaloTextUIState26;
                    textFieldUIState6 = textFieldUIState8;
                    chaloTextUIState20 = chaloTextUIState28;
                    loadingDialogUIState6 = loadingDialogUIState9;
                    toolbarUIState6 = toolbarUIState10;
                    eBillFetchUISpecs9 = eBillFetchUISpecs11;
                } else {
                    coroutineSingletons5 = coroutineSingletons;
                    stringProvider3 = stringProvider;
                    if (eBillFetchDataState4.g) {
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                        eBillFetchComponent$convertToUiState$1.L$11 = null;
                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                        eBillFetchComponent$convertToUiState$1.label = 13;
                        objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons6 = coroutineSingletons5;
                        if (objB8 == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        ConfirmationDialogUiState confirmationDialogUiState115 = confirmationDialogUiStateB;
                        objB12 = objB8;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        buttonUIState5 = buttonUIState;
                        toolbarUIState7 = toolbarUIState4;
                        chaloTextUIState21 = chaloTextUIState8;
                        chaloTextUIState22 = chaloTextUIState7;
                        confirmationDialogUiState2 = confirmationDialogUiState115;
                        loadingDialogUIState7 = loadingDialogUIState3;
                        chaloTextUIState23 = chaloTextUIState6;
                        textFieldUIState7 = textFieldUIState2;
                        clickableTextUiState6 = clickableTextUiState;
                        str14 = (String) objB12;
                        coroutineSingletons9 = coroutineSingletons6;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.L$11 = str14;
                        snackbarUIStateFactory4 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.label = 14;
                        objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB11 == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        str15 = str14;
                        eBillFetchUISpecs12 = eBillFetchUISpecs5;
                        chaloTextUIState29 = chaloTextUIState21;
                        loadingDialogUIState10 = loadingDialogUIState7;
                        snackbarUIStateFactory5 = snackbarUIStateFactory4;
                        objB12 = objB11;
                        final int i1111111 = 3;
                        Function0 function11113 = new Function0(this) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i1111111) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory5.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function11113);
                        eBillFetchUISpecs9 = eBillFetchUISpecs12;
                        confirmationDialogUiState = confirmationDialogUiState2;
                        clickableTextUiState5 = clickableTextUiState6;
                        buttonUIState4 = buttonUIState5;
                        chaloTextUIState18 = chaloTextUIState22;
                        textFieldUIState6 = textFieldUIState7;
                        chaloTextUIState19 = chaloTextUIState29;
                        chaloTextUIState20 = chaloTextUIState23;
                        loadingDialogUIState6 = loadingDialogUIState10;
                        toolbarUIState6 = toolbarUIState7;
                    } else {
                        confirmationDialogUiState = confirmationDialogUiStateB;
                        eBillFetchUISpecs9 = eBillFetchUISpecs5;
                        chaloTextUIState18 = chaloTextUIState7;
                        textFieldUIState6 = textFieldUIState2;
                        chaloTextUIState19 = chaloTextUIState8;
                        chaloTextUIState20 = chaloTextUIState6;
                        snackbarUIStateA = null;
                        loadingDialogUIState6 = loadingDialogUIState3;
                        toolbarUIState6 = toolbarUIState4;
                        buttonUIState4 = buttonUIState;
                        clickableTextUiState5 = clickableTextUiState;
                    }
                }
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 10:
                String str23 = (String) eBillFetchComponent$convertToUiState$1.L$13;
                str9 = (String) eBillFetchComponent$convertToUiState$1.L$12;
                String str24 = (String) eBillFetchComponent$convertToUiState$1.L$11;
                dialogUIStateFactory4 = (DialogUIStateFactory) eBillFetchComponent$convertToUiState$1.L$10;
                ClickableTextUiState clickableTextUiState10 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$9;
                buttonUIState3 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$8;
                TextUIState.ChaloTextUIState chaloTextUIState44 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState11 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState45 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState46 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                loadingDialogUIState5 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                ToolbarUIState toolbarUIState21 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                eBillFetchUISpecs8 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchDataState eBillFetchDataState23 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                objB7 = objB12;
                chaloTextUIState15 = chaloTextUIState46;
                toolbarUIState5 = toolbarUIState21;
                eBillFetchDataState8 = eBillFetchDataState23;
                stringProvider = stringProvider4;
                coroutineSingletons = coroutineSingletons10;
                str10 = str24;
                str11 = str23;
                chaloTextUIState16 = chaloTextUIState45;
                chaloTextUIState17 = chaloTextUIState44;
                textFieldUIState5 = textFieldUIState11;
                clickableTextUiState4 = clickableTextUiState10;
                buttonUIState = buttonUIState3;
                loadingDialogUIState3 = loadingDialogUIState5;
                String str1113 = (String) objB7;
                final int i1111112 = 1;
                eBillFetchComponent = this;
                Function0 function11114 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i1111112) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                EBillFetchDataState eBillFetchDataState114 = eBillFetchDataState8;
                final int i1111113 = 2;
                Function0 function11115 = new Function0(eBillFetchComponent) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = eBillFetchComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i1111113) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                dialogUIStateFactory4.getClass();
                confirmationDialogUiStateB = DialogUIStateFactory.b(str10, str9, str11, str1113, function11114, function11115);
                ToolbarUIState toolbarUIState114 = toolbarUIState5;
                clickableTextUiState = clickableTextUiState4;
                toolbarUIState4 = toolbarUIState114;
                chaloTextUIState7 = chaloTextUIState17;
                textFieldUIState2 = textFieldUIState5;
                eBillFetchUISpecs5 = eBillFetchUISpecs8;
                chaloTextUIState8 = chaloTextUIState16;
                chaloTextUIState6 = chaloTextUIState15;
                eBillFetchDataState4 = eBillFetchDataState114;
                z = eBillFetchDataState4.f;
                snackbarUIStateFactory = SnackbarUIStateFactory.f10071a;
                if (z) {
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs5;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState4;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState3;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState6;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState8;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState2;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState7;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiStateB;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory;
                    eBillFetchComponent$convertToUiState$1.L$12 = null;
                    eBillFetchComponent$convertToUiState$1.L$13 = null;
                    eBillFetchComponent$convertToUiState$1.label = 11;
                    objB9 = stringProvider.b(StringEnum.EBILL_FETCH_ERROR, new Object[0], eBillFetchComponent$convertToUiState$1);
                    coroutineSingletons7 = coroutineSingletons;
                    if (objB9 == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                    ConfirmationDialogUiState confirmationDialogUiState116 = confirmationDialogUiStateB;
                    objB12 = objB9;
                    toolbarUIState8 = toolbarUIState4;
                    chaloTextUIState24 = chaloTextUIState6;
                    textFieldUIState8 = textFieldUIState2;
                    clickableTextUiState7 = clickableTextUiState;
                    eBillFetchUISpecs10 = eBillFetchUISpecs5;
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    buttonUIState6 = buttonUIState;
                    loadingDialogUIState8 = loadingDialogUIState3;
                    chaloTextUIState25 = chaloTextUIState8;
                    chaloTextUIState26 = chaloTextUIState7;
                    confirmationDialogUiState3 = confirmationDialogUiState116;
                    str12 = (String) objB12;
                    coroutineSingletons8 = coroutineSingletons7;
                    eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                    eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                    eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                    eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                    eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                    eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                    eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                    eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                    eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                    eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                    eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                    eBillFetchComponent$convertToUiState$1.L$12 = str12;
                    toolbarUIState9 = toolbarUIState8;
                    eBillFetchComponent$convertToUiState$1.label = 12;
                    objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                    if (objB10 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    str13 = str12;
                    chaloTextUIState27 = chaloTextUIState25;
                    chaloTextUIState28 = chaloTextUIState24;
                    loadingDialogUIState9 = loadingDialogUIState8;
                    eBillFetchDataState9 = eBillFetchDataState4;
                    eBillFetchUISpecs11 = eBillFetchUISpecs10;
                    toolbarUIState10 = toolbarUIState9;
                    objB12 = objB10;
                    final int i1111114 = 1;
                    Function0 function11116 = new Function0(this) { // from class: t00
                        public final /* synthetic */ EBillFetchComponent b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i1111114) {
                                case 0:
                                    this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                    break;
                                default:
                                    this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory3.getClass();
                    chaloTextUIState19 = chaloTextUIState27;
                    snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function11116);
                    confirmationDialogUiState = confirmationDialogUiState3;
                    clickableTextUiState5 = clickableTextUiState7;
                    buttonUIState4 = buttonUIState6;
                    chaloTextUIState18 = chaloTextUIState26;
                    textFieldUIState6 = textFieldUIState8;
                    chaloTextUIState20 = chaloTextUIState28;
                    loadingDialogUIState6 = loadingDialogUIState9;
                    toolbarUIState6 = toolbarUIState10;
                    eBillFetchUISpecs9 = eBillFetchUISpecs11;
                } else {
                    coroutineSingletons5 = coroutineSingletons;
                    stringProvider3 = stringProvider;
                    if (eBillFetchDataState4.g) {
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState4;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState3;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState6;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState8;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState2;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState7;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiStateB;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory;
                        eBillFetchComponent$convertToUiState$1.L$11 = null;
                        eBillFetchComponent$convertToUiState$1.L$12 = null;
                        eBillFetchComponent$convertToUiState$1.L$13 = null;
                        eBillFetchComponent$convertToUiState$1.label = 13;
                        objB8 = stringProvider3.b(StringEnum.NO_INTERNET, new Object[0], eBillFetchComponent$convertToUiState$1);
                        coroutineSingletons6 = coroutineSingletons5;
                        if (objB8 == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        ConfirmationDialogUiState confirmationDialogUiState117 = confirmationDialogUiStateB;
                        objB12 = objB8;
                        snackbarUIStateFactory2 = snackbarUIStateFactory;
                        buttonUIState5 = buttonUIState;
                        toolbarUIState7 = toolbarUIState4;
                        chaloTextUIState21 = chaloTextUIState8;
                        chaloTextUIState22 = chaloTextUIState7;
                        confirmationDialogUiState2 = confirmationDialogUiState117;
                        loadingDialogUIState7 = loadingDialogUIState3;
                        chaloTextUIState23 = chaloTextUIState6;
                        textFieldUIState7 = textFieldUIState2;
                        clickableTextUiState6 = clickableTextUiState;
                        str14 = (String) objB12;
                        coroutineSingletons9 = coroutineSingletons6;
                        eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                        eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                        eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                        eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                        eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                        eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                        eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                        eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                        eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                        eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                        eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.L$11 = str14;
                        snackbarUIStateFactory4 = snackbarUIStateFactory2;
                        eBillFetchComponent$convertToUiState$1.label = 14;
                        objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                        if (objB11 == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        str15 = str14;
                        eBillFetchUISpecs12 = eBillFetchUISpecs5;
                        chaloTextUIState29 = chaloTextUIState21;
                        loadingDialogUIState10 = loadingDialogUIState7;
                        snackbarUIStateFactory5 = snackbarUIStateFactory4;
                        objB12 = objB11;
                        final int i1111115 = 3;
                        Function0 function11117 = new Function0(this) { // from class: u00
                            public final /* synthetic */ EBillFetchComponent b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i1111115) {
                                    case 0:
                                        this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                        break;
                                    case 1:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                        break;
                                    case 2:
                                        this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                        break;
                                    default:
                                        this.b.E0(new b00(4));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        snackbarUIStateFactory5.getClass();
                        snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function11117);
                        eBillFetchUISpecs9 = eBillFetchUISpecs12;
                        confirmationDialogUiState = confirmationDialogUiState2;
                        clickableTextUiState5 = clickableTextUiState6;
                        buttonUIState4 = buttonUIState5;
                        chaloTextUIState18 = chaloTextUIState22;
                        textFieldUIState6 = textFieldUIState7;
                        chaloTextUIState19 = chaloTextUIState29;
                        chaloTextUIState20 = chaloTextUIState23;
                        loadingDialogUIState6 = loadingDialogUIState10;
                        toolbarUIState6 = toolbarUIState7;
                    } else {
                        confirmationDialogUiState = confirmationDialogUiStateB;
                        eBillFetchUISpecs9 = eBillFetchUISpecs5;
                        chaloTextUIState18 = chaloTextUIState7;
                        textFieldUIState6 = textFieldUIState2;
                        chaloTextUIState19 = chaloTextUIState8;
                        chaloTextUIState20 = chaloTextUIState6;
                        snackbarUIStateA = null;
                        loadingDialogUIState6 = loadingDialogUIState3;
                        toolbarUIState6 = toolbarUIState4;
                        buttonUIState4 = buttonUIState;
                        clickableTextUiState5 = clickableTextUiState;
                    }
                }
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 11:
                SnackbarUIStateFactory snackbarUIStateFactory6 = (SnackbarUIStateFactory) eBillFetchComponent$convertToUiState$1.L$11;
                confirmationDialogUiState3 = (ConfirmationDialogUiState) eBillFetchComponent$convertToUiState$1.L$10;
                clickableTextUiState7 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$9;
                buttonUIState6 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$8;
                chaloTextUIState26 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                textFieldUIState8 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                chaloTextUIState25 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                chaloTextUIState24 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                loadingDialogUIState8 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                ToolbarUIState toolbarUIState22 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                eBillFetchUISpecs10 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchDataState eBillFetchDataState24 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                toolbarUIState8 = toolbarUIState22;
                eBillFetchDataState4 = eBillFetchDataState24;
                stringProvider = stringProvider4;
                coroutineSingletons7 = coroutineSingletons10;
                snackbarUIStateFactory3 = snackbarUIStateFactory6;
                str12 = (String) objB12;
                coroutineSingletons8 = coroutineSingletons7;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchDataState4;
                eBillFetchComponent$convertToUiState$1.L$1 = eBillFetchUISpecs10;
                eBillFetchComponent$convertToUiState$1.L$2 = toolbarUIState8;
                eBillFetchComponent$convertToUiState$1.L$3 = loadingDialogUIState8;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState24;
                eBillFetchComponent$convertToUiState$1.L$5 = chaloTextUIState25;
                eBillFetchComponent$convertToUiState$1.L$6 = textFieldUIState8;
                eBillFetchComponent$convertToUiState$1.L$7 = chaloTextUIState26;
                eBillFetchComponent$convertToUiState$1.L$8 = buttonUIState6;
                eBillFetchComponent$convertToUiState$1.L$9 = clickableTextUiState7;
                eBillFetchComponent$convertToUiState$1.L$10 = confirmationDialogUiState3;
                eBillFetchComponent$convertToUiState$1.L$11 = snackbarUIStateFactory3;
                eBillFetchComponent$convertToUiState$1.L$12 = str12;
                toolbarUIState9 = toolbarUIState8;
                eBillFetchComponent$convertToUiState$1.label = 12;
                objB10 = stringProvider.b(StringEnum.RETRY, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB10 == coroutineSingletons8) {
                    return coroutineSingletons8;
                }
                str13 = str12;
                chaloTextUIState27 = chaloTextUIState25;
                chaloTextUIState28 = chaloTextUIState24;
                loadingDialogUIState9 = loadingDialogUIState8;
                eBillFetchDataState9 = eBillFetchDataState4;
                eBillFetchUISpecs11 = eBillFetchUISpecs10;
                toolbarUIState10 = toolbarUIState9;
                objB12 = objB10;
                final int i1111116 = 1;
                Function0 function11118 = new Function0(this) { // from class: t00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i1111116) {
                            case 0:
                                this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                break;
                            default:
                                this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                snackbarUIStateFactory3.getClass();
                chaloTextUIState19 = chaloTextUIState27;
                snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function11118);
                confirmationDialogUiState = confirmationDialogUiState3;
                clickableTextUiState5 = clickableTextUiState7;
                buttonUIState4 = buttonUIState6;
                chaloTextUIState18 = chaloTextUIState26;
                textFieldUIState6 = textFieldUIState8;
                chaloTextUIState20 = chaloTextUIState28;
                loadingDialogUIState6 = loadingDialogUIState9;
                toolbarUIState6 = toolbarUIState10;
                eBillFetchUISpecs9 = eBillFetchUISpecs11;
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 12:
                str13 = (String) eBillFetchComponent$convertToUiState$1.L$12;
                snackbarUIStateFactory3 = (SnackbarUIStateFactory) eBillFetchComponent$convertToUiState$1.L$11;
                confirmationDialogUiState3 = (ConfirmationDialogUiState) eBillFetchComponent$convertToUiState$1.L$10;
                clickableTextUiState7 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$9;
                buttonUIState6 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$8;
                chaloTextUIState26 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$7;
                textFieldUIState8 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$6;
                chaloTextUIState27 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$5;
                chaloTextUIState28 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                loadingDialogUIState9 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$3;
                toolbarUIState10 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$2;
                eBillFetchUISpecs11 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$1;
                eBillFetchDataState9 = (EBillFetchDataState) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                final int i1111117 = 1;
                Function0 function11119 = new Function0(this) { // from class: t00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i1111117) {
                            case 0:
                                this.b.H0(new EBillFetchIntent.NextClickIntent(eBillFetchDataState9.d));
                                break;
                            default:
                                this.b.H0(new EBillFetchIntent.RetryBillFetchIntent(eBillFetchDataState9.d));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                snackbarUIStateFactory3.getClass();
                chaloTextUIState19 = chaloTextUIState27;
                snackbarUIStateA = SnackbarUIStateFactory.a(str13, (String) objB12, function11119);
                confirmationDialogUiState = confirmationDialogUiState3;
                clickableTextUiState5 = clickableTextUiState7;
                buttonUIState4 = buttonUIState6;
                chaloTextUIState18 = chaloTextUIState26;
                textFieldUIState6 = textFieldUIState8;
                chaloTextUIState20 = chaloTextUIState28;
                loadingDialogUIState6 = loadingDialogUIState9;
                toolbarUIState6 = toolbarUIState10;
                eBillFetchUISpecs9 = eBillFetchUISpecs11;
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 13:
                snackbarUIStateFactory2 = (SnackbarUIStateFactory) eBillFetchComponent$convertToUiState$1.L$10;
                confirmationDialogUiState2 = (ConfirmationDialogUiState) eBillFetchComponent$convertToUiState$1.L$9;
                clickableTextUiState6 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$8;
                buttonUIState5 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$7;
                chaloTextUIState22 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$6;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState12 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$5;
                chaloTextUIState21 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState47 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$3;
                loadingDialogUIState7 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState23 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$1;
                EBillFetchUISpecs eBillFetchUISpecs22 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                stringProvider3 = stringProvider4;
                coroutineSingletons6 = coroutineSingletons10;
                eBillFetchUISpecs5 = eBillFetchUISpecs22;
                textFieldUIState7 = textFieldUIState12;
                chaloTextUIState23 = chaloTextUIState47;
                toolbarUIState7 = toolbarUIState23;
                str14 = (String) objB12;
                coroutineSingletons9 = coroutineSingletons6;
                eBillFetchComponent$convertToUiState$1.L$0 = eBillFetchUISpecs5;
                eBillFetchComponent$convertToUiState$1.L$1 = toolbarUIState7;
                eBillFetchComponent$convertToUiState$1.L$2 = loadingDialogUIState7;
                eBillFetchComponent$convertToUiState$1.L$3 = chaloTextUIState23;
                eBillFetchComponent$convertToUiState$1.L$4 = chaloTextUIState21;
                eBillFetchComponent$convertToUiState$1.L$5 = textFieldUIState7;
                eBillFetchComponent$convertToUiState$1.L$6 = chaloTextUIState22;
                eBillFetchComponent$convertToUiState$1.L$7 = buttonUIState5;
                eBillFetchComponent$convertToUiState$1.L$8 = clickableTextUiState6;
                eBillFetchComponent$convertToUiState$1.L$9 = confirmationDialogUiState2;
                eBillFetchComponent$convertToUiState$1.L$10 = snackbarUIStateFactory2;
                eBillFetchComponent$convertToUiState$1.L$11 = str14;
                snackbarUIStateFactory4 = snackbarUIStateFactory2;
                eBillFetchComponent$convertToUiState$1.label = 14;
                objB11 = stringProvider3.b(StringEnum.OKAY, new Object[0], eBillFetchComponent$convertToUiState$1);
                if (objB11 == coroutineSingletons9) {
                    return coroutineSingletons9;
                }
                str15 = str14;
                eBillFetchUISpecs12 = eBillFetchUISpecs5;
                chaloTextUIState29 = chaloTextUIState21;
                loadingDialogUIState10 = loadingDialogUIState7;
                snackbarUIStateFactory5 = snackbarUIStateFactory4;
                objB12 = objB11;
                final int i1111118 = 3;
                Function0 function111110 = new Function0(this) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i1111118) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                snackbarUIStateFactory5.getClass();
                snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function111110);
                eBillFetchUISpecs9 = eBillFetchUISpecs12;
                confirmationDialogUiState = confirmationDialogUiState2;
                clickableTextUiState5 = clickableTextUiState6;
                buttonUIState4 = buttonUIState5;
                chaloTextUIState18 = chaloTextUIState22;
                textFieldUIState6 = textFieldUIState7;
                chaloTextUIState19 = chaloTextUIState29;
                chaloTextUIState20 = chaloTextUIState23;
                loadingDialogUIState6 = loadingDialogUIState10;
                toolbarUIState6 = toolbarUIState7;
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            case 14:
                str15 = (String) eBillFetchComponent$convertToUiState$1.L$11;
                snackbarUIStateFactory5 = (SnackbarUIStateFactory) eBillFetchComponent$convertToUiState$1.L$10;
                confirmationDialogUiState2 = (ConfirmationDialogUiState) eBillFetchComponent$convertToUiState$1.L$9;
                clickableTextUiState6 = (ClickableTextUiState) eBillFetchComponent$convertToUiState$1.L$8;
                buttonUIState5 = (ButtonUIState) eBillFetchComponent$convertToUiState$1.L$7;
                chaloTextUIState22 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$6;
                textFieldUIState7 = (BaseTextFieldUIState.TextFieldUIState) eBillFetchComponent$convertToUiState$1.L$5;
                chaloTextUIState29 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$4;
                chaloTextUIState23 = (TextUIState.ChaloTextUIState) eBillFetchComponent$convertToUiState$1.L$3;
                loadingDialogUIState10 = (LoadingDialogUIState) eBillFetchComponent$convertToUiState$1.L$2;
                toolbarUIState7 = (ToolbarUIState) eBillFetchComponent$convertToUiState$1.L$1;
                eBillFetchUISpecs12 = (EBillFetchUISpecs) eBillFetchComponent$convertToUiState$1.L$0;
                ResultKt.b(objB12);
                final int i1111119 = 3;
                Function0 function111111 = new Function0(this) { // from class: u00
                    public final /* synthetic */ EBillFetchComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i1111119) {
                            case 0:
                                this.b.H0(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a);
                                break;
                            case 1:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a);
                                break;
                            case 2:
                                this.b.H0(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a);
                                break;
                            default:
                                this.b.E0(new b00(4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                snackbarUIStateFactory5.getClass();
                snackbarUIStateA = SnackbarUIStateFactory.a(str15, (String) objB12, function111111);
                eBillFetchUISpecs9 = eBillFetchUISpecs12;
                confirmationDialogUiState = confirmationDialogUiState2;
                clickableTextUiState5 = clickableTextUiState6;
                buttonUIState4 = buttonUIState5;
                chaloTextUIState18 = chaloTextUIState22;
                textFieldUIState6 = textFieldUIState7;
                chaloTextUIState19 = chaloTextUIState29;
                chaloTextUIState20 = chaloTextUIState23;
                loadingDialogUIState6 = loadingDialogUIState10;
                toolbarUIState6 = toolbarUIState7;
                return new EBillFetchViewState(eBillFetchUISpecs9, toolbarUIState6, loadingDialogUIState6, chaloTextUIState20, chaloTextUIState19, textFieldUIState6, chaloTextUIState18, buttonUIState4, clickableTextUiState5, confirmationDialogUiState, snackbarUIStateA);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void G0(ElectricityBillAppModel electricityBillAppModel) {
        Json json = ChaloJson.b;
        json.getClass();
        this.m.b(new ChaloNavigationRequest.Navigate(new EBillAmountScreenArgs(json.a(ElectricityBillAppModel.INSTANCE.serializer(), electricityBillAppModel)), null, null, 6));
    }

    public final void H0(EBillFetchIntent eBillFetchIntent) {
        C0(eBillFetchIntent);
        if (eBillFetchIntent instanceof EBillFetchIntent.InternetConnectionIntent) {
            E0(new qp((EBillFetchIntent.InternetConnectionIntent) eBillFetchIntent, 19));
            return;
        }
        boolean z = eBillFetchIntent instanceof EBillFetchIntent.NextClickIntent;
        int i = 3;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new EBillFetchComponent$navigateToEBillAmountScreenIfPossible$1(this, ((EBillFetchIntent.NextClickIntent) eBillFetchIntent).f2562a, null), 3);
            return;
        }
        if (eBillFetchIntent instanceof EBillFetchIntent.NumberEnteredIntent) {
            EBillFetchIntent.NumberEnteredIntent numberEnteredIntent = (EBillFetchIntent.NumberEnteredIntent) eBillFetchIntent;
            String str = numberEnteredIntent.f2563a;
            this.l.getClass();
            E0(new n8(str != null && str.length() != 0 && str.length() >= 9 && str.length() <= 9, numberEnteredIntent, i));
            return;
        }
        if (eBillFetchIntent instanceof EBillFetchIntent.ProceedWithPaymentClickedIntent) {
            ElectricityBillAppModel electricityBillAppModel = ((EBillFetchIntent.ProceedWithPaymentClickedIntent) eBillFetchIntent).f2564a;
            E0(new s00(electricityBillAppModel, 1));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            MixpanelUtil.a(linkedHashMap, electricityBillAppModel);
            AnalyticsContract.DefaultImpls.a(this.n, "eBill fetch screen next btn clicked", "", linkedHashMap, null, false, 24);
            G0(electricityBillAppModel);
            return;
        }
        if (eBillFetchIntent instanceof EBillFetchIntent.RetryBillFetchIntent) {
            BuildersKt.d(contextScope, null, null, new EBillFetchComponent$navigateToEBillAmountScreenIfPossible$1(this, ((EBillFetchIntent.RetryBillFetchIntent) eBillFetchIntent).f2565a, null), 3);
            return;
        }
        if (eBillFetchIntent.equals(EBillFetchIntent.ViewPaymentHistoryIntent.f2566a)) {
            AnalyticsContract.DefaultImpls.a(this.n, "eBill fetch screen show history btn clicked", "", null, null, false, 28);
            E0(new b00(i));
            this.m.b(new ChaloNavigationRequest.Navigate(EBillHistoryScreenArgs.INSTANCE, null, null, 6));
            return;
        }
        if (eBillFetchIntent.equals(EBillFetchIntent.EBillPaymentDialogNegativeBtnClickedIntent.f2559a)) {
            AnalyticsContract.DefaultImpls.a(this.n, "eBill payment already done dialog cancel clicked", "", null, null, false, 28);
            E0(new b00(5));
            return;
        }
        if (!eBillFetchIntent.equals(EBillFetchIntent.EBillPaymentDialogPositiveBtnClickedIntent.f2560a)) {
            throw new NoWhenBranchMatchedException();
        }
        ElectricityBillAppModel electricityBillAppModel2 = ((EBillFetchDataState) this.f.getValue()).h;
        if (electricityBillAppModel2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        MixpanelUtil mixpanelUtil2 = MixpanelUtil.f9617a;
        MixpanelUtil.a(linkedHashMap2, electricityBillAppModel2);
        AnalyticsContract.DefaultImpls.a(this.n, "eBill payment already done dialog ok clicked", "", linkedHashMap2, null, false, 24);
        E0(new b00(2));
        H0(new EBillFetchIntent.ProceedWithPaymentClickedIntent(electricityBillAppModel2));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new EBillFetchDataState(false, null, false, "", false, false, false, null);
    }
}
