package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardInfo;
import app.chalo.ncmc.data.appmodel.ChaloCardsAppModel;
import app.chalo.ncmc.data.appmodel.IntentHashAppModel;
import app.chalo.ncmc.data.appmodel.IntentHashAppModelKt;
import app.chalo.ncmc.data.appmodel.OpenCardDetailsAppModel;
import app.chalo.ncmc.domain.ConfirmNcmcOfflineRechargeUseCase;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowUseCase;
import app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigUseCase;
import app.chalo.ncmc.domain.PlaceNcmcOfflineRechargeAndGetOrderIdUseCase;
import app.chalo.ncmc.domain.ProcessUvikResultUseCase;
import app.chalo.ncmc.ui.NcmcOfflineRechargeArgsModel;
import app.chalo.ncmc.uvik.UvikSdkHelper;
import app.chalo.ncmc.uvik.UvikServiceRequest;
import app.chalo.ncmc.uvik.UvikServiceType;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.NcmcOfflineRechargeArgs;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.ComponentContext;
import defpackage.im0;
import defpackage.ln0;
import defpackage.r4;
import defpackage.va;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeViewState;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeDataState;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfflineCardRechargeComponent extends ChaloBaseStateMviComponent<OfflineCardRechargeIntent, OfflineCardRechargeViewState, OfflineCardRechargeViewState, OfflineCardRechargeSideEffect> {
    public Job A;
    public final ComponentContext k;
    public final CurrencyFeature l;
    public final LoadMoneyAmountValidationUseCase m;
    public final StringProvider n;
    public final GetNcmcCardAndRechargeConfigUseCase o;
    public final GetMaskedCardNoFromCardNoUseCase p;
    public final PlaceNcmcOfflineRechargeAndGetOrderIdUseCase q;
    public final ConfirmNcmcOfflineRechargeUseCase r;
    public final GenerateUvikIntentHashUseCase s;
    public final ProcessUvikResultUseCase t;
    public final UvikSdkHelper u;
    public final FetchChaloCardInfoToShowUseCase v;
    public final AnalyticsContract w;
    public final ChaloNavigationManager x;
    public final KotlinToastManager y;
    public boolean z;

    public OfflineCardRechargeComponent(NcmcOfflineRechargeArgs ncmcOfflineRechargeArgs, ComponentContext componentContext, CurrencyFeature currencyFeature, LoadMoneyAmountValidationUseCase loadMoneyAmountValidationUseCase, StringProvider stringProvider, GetNcmcCardAndRechargeConfigUseCase getNcmcCardAndRechargeConfigUseCase, GetMaskedCardNoFromCardNoUseCase getMaskedCardNoFromCardNoUseCase, PlaceNcmcOfflineRechargeAndGetOrderIdUseCase placeNcmcOfflineRechargeAndGetOrderIdUseCase, ConfirmNcmcOfflineRechargeUseCase confirmNcmcOfflineRechargeUseCase, GenerateUvikIntentHashUseCase generateUvikIntentHashUseCase, ProcessUvikResultUseCase processUvikResultUseCase, UvikSdkHelper uvikSdkHelper, FetchChaloCardInfoToShowUseCase fetchChaloCardInfoToShowUseCase, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = componentContext;
        this.l = currencyFeature;
        this.m = loadMoneyAmountValidationUseCase;
        this.n = stringProvider;
        this.o = getNcmcCardAndRechargeConfigUseCase;
        this.p = getMaskedCardNoFromCardNoUseCase;
        this.q = placeNcmcOfflineRechargeAndGetOrderIdUseCase;
        this.r = confirmNcmcOfflineRechargeUseCase;
        this.s = generateUvikIntentHashUseCase;
        this.t = processUvikResultUseCase;
        this.u = uvikSdkHelper;
        this.v = fetchChaloCardInfoToShowUseCase;
        this.w = analyticsContract;
        this.x = chaloNavigationManager;
        this.y = kotlinToastManager;
        Json json = ChaloJson.b;
        String str = ncmcOfflineRechargeArgs.b;
        json.getClass();
        NcmcOfflineRechargeArgsModel ncmcOfflineRechargeArgsModel = (NcmcOfflineRechargeArgsModel) json.b(str, NcmcOfflineRechargeArgsModel.INSTANCE.serializer());
        I0(new OfflineCardRechargeIntent.InitialIntent(ncmcOfflineRechargeArgsModel.f6267a, ncmcOfflineRechargeArgsModel.c, ncmcOfflineRechargeArgsModel.e, ncmcOfflineRechargeArgsModel.f, ncmcOfflineRechargeArgsModel.b, ncmcOfflineRechargeArgsModel.d));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r0 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent r11, java.lang.String r12, java.lang.String r13, long r14, java.lang.String r16, java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r0 = r18
            r11.getClass()
            boolean r1 = r0 instanceof app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$checkOfflineOrderStatus$1
            if (r1 == 0) goto L19
            r1 = r0
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$checkOfflineOrderStatus$1 r1 = (app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$checkOfflineOrderStatus$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.label = r2
        L17:
            r9 = r1
            goto L1f
        L19:
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$checkOfflineOrderStatus$1 r1 = new app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$checkOfflineOrderStatus$1
            r1.<init>(r11, r0)
            goto L17
        L1f:
            java.lang.Object r0 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L3d
            if (r2 != r10) goto L35
            java.lang.Object r12 = r9.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r0)
            goto L74
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            kotlin.ResultKt.b(r0)
            goto L56
        L41:
            kotlin.ResultKt.b(r0)
            app.chalo.ncmc.domain.ConfirmNcmcOfflineRechargeUseCase r2 = r11.r
            r9.label = r3
            r8 = r12
            r6 = r13
            r3 = r14
            r5 = r16
            r7 = r17
            java.lang.Object r0 = r2.a(r3, r5, r6, r7, r8, r9)
            if (r0 != r1) goto L56
            goto L73
        L56:
            app.chalo.utils.ChaloUseCaseResult r0 = (app.chalo.utils.ChaloUseCaseResult) r0
            boolean r12 = r0 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r12 == 0) goto L8e
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = (app.chalo.utils.ChaloUseCaseResult.Failure) r0
            java.lang.Object r12 = r0.f10418a
            java.lang.String r12 = (java.lang.String) r12
            app.chalo.providers.stringprovider.StringProvider r13 = r11.n
            app.chalo.providers.stringprovider.StringEnum r0 = app.chalo.providers.stringprovider.StringEnum.NCMC_BALANCE_ERROR_MSG
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r9.L$0 = r12
            r9.label = r10
            java.lang.Object r0 = r13.b(r0, r2, r9)
            if (r0 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r12 = app.chalo.extensions.StringExtsKt.b(r12, r0)
            ln0 r13 = new ln0
            r0 = 3
            r13.<init>(r0)
            r11.E0(r13)
            hj0 r13 = new hj0
            r0 = 17
            r13.<init>(r12, r0)
            r11.E0(r13)
            goto Lbd
        L8e:
            boolean r12 = r0 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r12 == 0) goto Lc0
            ln0 r12 = new ln0
            r13 = 3
            r12.<init>(r13)
            r11.E0(r12)
            ln0 r12 = new ln0
            r13 = 1
            r12.<init>(r13)
            r11.E0(r12)
            app.chalo.analytics.contract.AnalyticsContract r0 = r11.w
            app.chalo.constants.Source r2 = app.chalo.constants.Source.NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN
            kotlinx.coroutines.flow.StateFlow r11 = r11.f
            java.lang.Object r11 = r11.getValue()
            app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState r11 = (app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState) r11
            r12 = 0
            java.util.LinkedHashMap r3 = app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeContractKt.a(r11, r12)
            r4 = 0
            r5 = 24
            java.lang.String r1 = "ncmc offline recharge success"
            app.chalo.analytics.AnalyticsContractImplKt.b(r0, r1, r2, r3, r4, r5)
        Lbd:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        Lc0:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent.F0(app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(OfflineCardRechargeComponent offlineCardRechargeComponent, UvikServiceType uvikServiceType, IntentHashAppModel intentHashAppModel, ContinuationImpl continuationImpl) {
        OfflineCardRechargeComponent$initiateUvikTap$1 offlineCardRechargeComponent$initiateUvikTap$1;
        KotlinToastManager kotlinToastManager;
        offlineCardRechargeComponent.getClass();
        if (continuationImpl instanceof OfflineCardRechargeComponent$initiateUvikTap$1) {
            offlineCardRechargeComponent$initiateUvikTap$1 = (OfflineCardRechargeComponent$initiateUvikTap$1) continuationImpl;
            int i = offlineCardRechargeComponent$initiateUvikTap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                offlineCardRechargeComponent$initiateUvikTap$1.label = i - Integer.MIN_VALUE;
            } else {
                offlineCardRechargeComponent$initiateUvikTap$1 = new OfflineCardRechargeComponent$initiateUvikTap$1(offlineCardRechargeComponent, continuationImpl);
            }
        } else {
            offlineCardRechargeComponent$initiateUvikTap$1 = new OfflineCardRechargeComponent$initiateUvikTap$1(offlineCardRechargeComponent, continuationImpl);
        }
        Object objB = offlineCardRechargeComponent$initiateUvikTap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = offlineCardRechargeComponent$initiateUvikTap$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            UvikServiceRequest uvikServiceRequestA = IntentHashAppModelKt.a(intentHashAppModel, uvikServiceType);
            boolean z = false;
            if (uvikServiceRequestA != null) {
                offlineCardRechargeComponent.E0(new va(z, 10));
                Job job = offlineCardRechargeComponent.A;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                offlineCardRechargeComponent.A = BuildersKt.d(offlineCardRechargeComponent.j, null, null, new OfflineCardRechargeComponent$initiateAndCheckForUvikTapResult$1(offlineCardRechargeComponent, uvikServiceRequestA, null), 3);
            } else {
                offlineCardRechargeComponent.E0(new va(z, 10));
                KotlinToastManager kotlinToastManager2 = offlineCardRechargeComponent.y;
                offlineCardRechargeComponent$initiateUvikTap$1.L$0 = kotlinToastManager2;
                offlineCardRechargeComponent$initiateUvikTap$1.label = 1;
                objB = offlineCardRechargeComponent.n.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], offlineCardRechargeComponent$initiateUvikTap$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) offlineCardRechargeComponent$initiateUvikTap$1.L$0;
        ResultKt.b(objB);
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(OfflineCardRechargeComponent offlineCardRechargeComponent, ContinuationImpl continuationImpl) {
        OfflineCardRechargeComponent$refreshCardBalance$1 offlineCardRechargeComponent$refreshCardBalance$1;
        Object obj;
        ChaloCardDetails chaloCardDetailsA;
        offlineCardRechargeComponent.getClass();
        if (continuationImpl instanceof OfflineCardRechargeComponent$refreshCardBalance$1) {
            offlineCardRechargeComponent$refreshCardBalance$1 = (OfflineCardRechargeComponent$refreshCardBalance$1) continuationImpl;
            int i = offlineCardRechargeComponent$refreshCardBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                offlineCardRechargeComponent$refreshCardBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                offlineCardRechargeComponent$refreshCardBalance$1 = new OfflineCardRechargeComponent$refreshCardBalance$1(offlineCardRechargeComponent, continuationImpl);
            }
        } else {
            offlineCardRechargeComponent$refreshCardBalance$1 = new OfflineCardRechargeComponent$refreshCardBalance$1(offlineCardRechargeComponent, continuationImpl);
        }
        Object objA = offlineCardRechargeComponent$refreshCardBalance$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = offlineCardRechargeComponent$refreshCardBalance$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            offlineCardRechargeComponent.E0(new im0(27));
            FetchChaloCardInfoToShowUseCase fetchChaloCardInfoToShowUseCase = offlineCardRechargeComponent.v;
            offlineCardRechargeComponent$refreshCardBalance$1.label = 1;
            objA = fetchChaloCardInfoToShowUseCase.a(true, offlineCardRechargeComponent$refreshCardBalance$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        offlineCardRechargeComponent.E0(new im0(28));
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            offlineCardRechargeComponent.E0(new im0(29));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((OfflineCardRechargeViewState) offlineCardRechargeComponent.f.getValue()).d;
            Iterator it = ((ChaloCardsAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f6136a.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ChaloCardDetails chaloCardDetailsA2 = ((ChaloCardInfo) next).a();
                OpenCardDetailsAppModel openCardDetailsAppModel = chaloCardDetailsA2 instanceof OpenCardDetailsAppModel ? (OpenCardDetailsAppModel) chaloCardDetailsA2 : null;
                if (Intrinsics.d(openCardDetailsAppModel != null ? openCardDetailsAppModel.k : null, str)) {
                    obj = next;
                    break;
                }
            }
            ChaloCardInfo chaloCardInfo = (ChaloCardInfo) obj;
            if (chaloCardInfo == null || (chaloCardDetailsA = chaloCardInfo.a()) == null) {
                offlineCardRechargeComponent.E0(new ln0(0));
            } else {
                int iIntValue = chaloCardDetailsA.c().intValue();
                offlineCardRechargeComponent.E0(new r4(iIntValue, offlineCardRechargeComponent.l.a(iIntValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
            }
        }
        return Unit.f17538a;
    }

    public final void I0(OfflineCardRechargeIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof OfflineCardRechargeIntent.InitialIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new OfflineCardRechargeComponent$handleInitializationIntent$1((OfflineCardRechargeIntent.InitialIntent) intent, this, null), 3);
            return;
        }
        if (intent instanceof OfflineCardRechargeIntent.RechargeAmountEntered) {
            BuildersKt.d(contextScope, null, null, new OfflineCardRechargeComponent$handleRechargeAmountEnteredIntent$1(this, ((OfflineCardRechargeIntent.RechargeAmountEntered) intent).f6394a, null), 3);
            return;
        }
        boolean zEquals = intent.equals(OfflineCardRechargeIntent.OnRechargeClicked.f6392a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            r0(OfflineCardRechargeSideEffect.HideKeyboard.f6398a);
            AnalyticsContractImplKt.b(this.w, "ncmc load balance next clicked", Source.NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN, OfflineCardRechargeContractKt.a((OfflineCardRechargeViewState) stateFlow.getValue(), null), false, 24);
            BuildersKt.d(contextScope, null, null, new OfflineCardRechargeComponent$startOfflineRechargeFlow$1(this, null), 3);
            return;
        }
        if (intent.equals(OfflineCardRechargeIntent.OnAddMoneyClicked.f6391a)) {
            BuildersKt.d(contextScope, null, null, new OfflineCardRechargeComponent$handleOnAddMoneyClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(OfflineCardRechargeIntent.OnSnackbarDismissed.f6393a)) {
            E0(new ln0(2));
            return;
        }
        if (intent.equals(OfflineCardRechargeIntent.TncDialogueAccepted.f6395a)) {
            BuildersKt.d(contextScope, null, null, new OfflineCardRechargeComponent$startOfflineRechargeFlow$1(this, null), 3);
            return;
        }
        if (intent.equals(OfflineCardRechargeIntent.TncDialogueCancelled.f6396a)) {
            E0(new im0(26));
            return;
        }
        boolean zEquals2 = intent.equals(OfflineCardRechargeIntent.OfflineRechargeSuccessfulNegativeBtnClicked.f6389a);
        ChaloNavigationManager chaloNavigationManager = this.x;
        if (zEquals2) {
            ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7));
            return;
        }
        if (!intent.equals(OfflineCardRechargeIntent.OfflineRechargeSuccessfulPositiveBtnClicked.f6390a)) {
            if (!intent.equals(OfflineCardRechargeIntent.NavigateToHome.f6388a)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7));
        } else if (((OfflineCardRechargeViewState) stateFlow.getValue()).p) {
            BuildersKt.d(contextScope, null, null, new OfflineCardRechargeComponent$startUvikTapFlowForBalanceUpdate$1(this, UvikServiceType.BALANCE_UPDATE, null), 3);
        } else {
            ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (OfflineCardRechargeViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new OfflineCardRechargeViewState(2097151);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new OfflineCardRechargeViewState(2097151);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        if (this.z) {
            this.z = false;
            BuildersKt.d(this.j, null, null, new OfflineCardRechargeComponent$handleOnViewStateActive$1(this, null), 3);
        }
    }
}
