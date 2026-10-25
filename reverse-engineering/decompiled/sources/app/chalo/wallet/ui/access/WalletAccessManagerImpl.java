package app.chalo.wallet.ui.access;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.MinKycDetailsArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.ClosedLoopWalletActivationResult;
import app.chalo.walletframework.wallet.domain.GetWalletAppReclaimCompletionTimeUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithReclaimTimeUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.RegisterAndSyncClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.RegisterClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.WalletAutoReclaimUseCase;
import app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime;
import defpackage.gf;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessManagerImpl;", "Lapp/chalo/wallet/ui/access/WalletAccessManager;", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletAccessManagerImpl implements WalletAccessManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f10802a;
    public final GetWalletStatusWithReclaimTimeUseCase b;
    public final RefreshWalletStatusUseCase c;
    public final GetWalletStatusWithoutSyncUseCase d;
    public final GetWalletAppReclaimCompletionTimeUseCase e;
    public final AnalyticsContract f;
    public final PostDeviceIdForWalletMigrationUseCase g;
    public final StringProvider h;
    public final ChaloNavigationManager i;
    public final ChaloConfigFeature j;
    public final UserProfileDetailsProvider k;
    public final TimeUtilsContract l;
    public final KotlinToastManager m;
    public final WalletAutoReclaimUseCase n;
    public final RegisterAndSyncClosedLoopWalletUseCase o;
    public Job p;
    public Job q;
    public final MutableStateFlow r;
    public final SharedFlowImpl s;
    public final StateFlow t;
    public final SharedFlow u;
    public final StateFlow v;
    public final String w;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessManagerImpl$Companion;", "", "", "QUERY_PARAM_USER_NAME", "Ljava/lang/String;", "QUERY_PARAM_MOBILE_NO", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10803a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WalletStatus.values().length];
            try {
                iArr[WalletStatus.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStatus.DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStatus.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_BACKEND_RECLAIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletStatus.FULL_KYC_NEEDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletStatus.BLOCKED_USER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletStatus.CHALO_TIME_UNAVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WalletStatus.KYC_INITIATED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WalletStatus.WALLET_FETCH_PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WalletStatus.WALLET_TIMED_OUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f10803a = iArr;
            int[] iArr2 = new int[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.values().length];
            try {
                iArr2[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.CITY_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.LOCAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.INVALID_WALLET_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.PARSE_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            b = iArr2;
        }
    }

    public WalletAccessManagerImpl(CoroutineScope scope, GetWalletStatusWithReclaimTimeUseCase getWalletStatusWithReclaimTimeUseCase, RefreshWalletStatusUseCase refreshWalletStatusUseCase, GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase, GetWalletAppReclaimCompletionTimeUseCase getWalletAppReclaimCompletionTimeUseCase, AnalyticsContract analyticsContract, PostDeviceIdForWalletMigrationUseCase postDeviceIdForWalletMigrationUseCase, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, ChaloConfigFeature chaloConfigFeature, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract, KotlinToastManager kotlinToastManager, WalletAutoReclaimUseCase walletAutoReclaimUseCase, RegisterAndSyncClosedLoopWalletUseCase registerAndSyncClosedLoopWalletUseCase) {
        Intrinsics.i(scope, "scope");
        this.f10802a = scope;
        this.b = getWalletStatusWithReclaimTimeUseCase;
        this.c = refreshWalletStatusUseCase;
        this.d = getWalletStatusWithoutSyncUseCase;
        this.e = getWalletAppReclaimCompletionTimeUseCase;
        this.f = analyticsContract;
        this.g = postDeviceIdForWalletMigrationUseCase;
        this.h = stringProvider;
        this.i = chaloNavigationManager;
        this.j = chaloConfigFeature;
        this.k = userProfileDetailsProvider;
        this.l = timeUtilsContract;
        this.m = kotlinToastManager;
        this.n = walletAutoReclaimUseCase;
        this.o = registerAndSyncClosedLoopWalletUseCase;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new WalletAccessState(null, null, null, null, null, null, null, 8191));
        this.r = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        this.s = sharedFlowImplB;
        final StateFlow stateFlowC = FlowKt.c(mutableStateFlowA);
        this.t = stateFlowC;
        this.u = FlowKt.b(sharedFlowImplB);
        this.v = FlowKt.G(new Flow<Boolean>() { // from class: app.chalo.wallet.ui.access.WalletAccessManagerImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.wallet.ui.access.WalletAccessManagerImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10806a;

                /* JADX INFO: renamed from: app.chalo.wallet.ui.access.WalletAccessManagerImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessManagerImpl$special$$inlined$map$1$2", f = "WalletAccessManagerImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f10806a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((WalletAccessState) obj).c);
                        anonymousClass1.label = 1;
                        if (this.f10806a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowC.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, scope, SharingStarted.Companion.f17836a, Boolean.FALSE);
        this.w = "wallet access base fragment";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object e(WalletAccessManagerImpl walletAccessManagerImpl, ContinuationImpl continuationImpl) {
        WalletAccessManagerImpl$getReclaimWebLinkUri$1 walletAccessManagerImpl$getReclaimWebLinkUri$1;
        StringBuilder sb;
        StringBuilder sb2;
        String strA;
        UserProfileDetailsProvider userProfileDetailsProvider = walletAccessManagerImpl.k;
        if (continuationImpl instanceof WalletAccessManagerImpl$getReclaimWebLinkUri$1) {
            walletAccessManagerImpl$getReclaimWebLinkUri$1 = (WalletAccessManagerImpl$getReclaimWebLinkUri$1) continuationImpl;
            int i = walletAccessManagerImpl$getReclaimWebLinkUri$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAccessManagerImpl$getReclaimWebLinkUri$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAccessManagerImpl$getReclaimWebLinkUri$1 = new WalletAccessManagerImpl$getReclaimWebLinkUri$1(walletAccessManagerImpl, continuationImpl);
            }
        } else {
            walletAccessManagerImpl$getReclaimWebLinkUri$1 = new WalletAccessManagerImpl$getReclaimWebLinkUri$1(walletAccessManagerImpl, continuationImpl);
        }
        Object obj = walletAccessManagerImpl$getReclaimWebLinkUri$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletAccessManagerImpl$getReclaimWebLinkUri$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            StringBuilder sb3 = new StringBuilder();
            ChaloConfigFeature chaloConfigFeature = walletAccessManagerImpl.j;
            walletAccessManagerImpl$getReclaimWebLinkUri$1.L$0 = sb3;
            walletAccessManagerImpl$getReclaimWebLinkUri$1.L$1 = sb3;
            walletAccessManagerImpl$getReclaimWebLinkUri$1.label = 1;
            Object objA = chaloConfigFeature.a("reclaimPassesRequestUrl", walletAccessManagerImpl$getReclaimWebLinkUri$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            sb = sb3;
            obj = objA;
            sb2 = sb;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb2 = (StringBuilder) walletAccessManagerImpl$getReclaimWebLinkUri$1.L$1;
            sb = (StringBuilder) walletAccessManagerImpl$getReclaimWebLinkUri$1.L$0;
            ResultKt.b(obj);
        }
        String str = (String) obj;
        int length = str.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            boolean z2 = Intrinsics.k(str.charAt(!z ? i3 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i3++;
            } else {
                z = true;
            }
        }
        sb2.append(str.subSequence(i3, length + 1).toString());
        UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
        if (userProfileAppModelF == null || (strA = userProfileAppModelF.a()) == null) {
            strA = "";
        }
        sb.append("?entry.1987039175=".concat(strA));
        UserProfileAppModel userProfileAppModelF2 = userProfileDetailsProvider.f();
        sb.append("&entry.58353678=" + (userProfileAppModelF2 != null ? userProfileAppModelF2.e : null));
        String string = sb.toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }

    @Override // app.chalo.wallet.ui.access.WalletAccessManager
    /* JADX INFO: renamed from: a, reason: from getter */
    public final StateFlow getV() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.wallet.ui.access.WalletAccessManager
    public final Object b(ContinuationImpl continuationImpl) {
        WalletAccessManagerImpl$getWalletAccessInSync$1 walletAccessManagerImpl$getWalletAccessInSync$1;
        if (continuationImpl instanceof WalletAccessManagerImpl$getWalletAccessInSync$1) {
            walletAccessManagerImpl$getWalletAccessInSync$1 = (WalletAccessManagerImpl$getWalletAccessInSync$1) continuationImpl;
            int i = walletAccessManagerImpl$getWalletAccessInSync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAccessManagerImpl$getWalletAccessInSync$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAccessManagerImpl$getWalletAccessInSync$1 = new WalletAccessManagerImpl$getWalletAccessInSync$1(this, continuationImpl);
            }
        } else {
            walletAccessManagerImpl$getWalletAccessInSync$1 = new WalletAccessManagerImpl$getWalletAccessInSync$1(this, continuationImpl);
        }
        Object obj = walletAccessManagerImpl$getWalletAccessInSync$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletAccessManagerImpl$getWalletAccessInSync$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            c(WalletAccessIntent.CheckWalletStatus.f10791a);
            Job job = this.p;
            if (job != null) {
                walletAccessManagerImpl$getWalletAccessInSync$1.label = 1;
                if (((JobSupport) job).V0(walletAccessManagerImpl$getWalletAccessInSync$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return this.v.getValue();
    }

    @Override // app.chalo.wallet.ui.access.WalletAccessManager
    public final void c(WalletAccessIntent intent) {
        Object value;
        WalletAccessState it;
        boolean z;
        Object value2;
        WalletAccessState it2;
        Object value3;
        WalletAccessState it3;
        Object value4;
        Object value5;
        Object value6;
        WalletAccessState it4;
        Object value7;
        WalletAccessState it5;
        Object value8;
        WalletAccessState it6;
        Object value9;
        WalletAccessState it7;
        Intrinsics.i(intent, "intent");
        if (intent.equals(WalletAccessIntent.CheckWalletStatus.f10791a)) {
            g();
            return;
        }
        boolean zEquals = intent.equals(WalletAccessIntent.AppReclaimRetryClicked.f10789a);
        WalletAccessSideEffect.CloseBottomSheet closeBottomSheet = WalletAccessSideEffect.CloseBottomSheet.f10808a;
        MutableStateFlow mutableStateFlow = this.r;
        if (zEquals) {
            f(closeBottomSheet);
            do {
                value9 = mutableStateFlow.getValue();
                it7 = (WalletAccessState) value9;
                Intrinsics.i(it7, "it");
            } while (!mutableStateFlow.c(value9, WalletAccessState.a(it7, null, null, false, false, null, null, 8063)));
            o();
            l(false);
            return;
        }
        boolean zEquals2 = intent.equals(WalletAccessIntent.BackendReclaimKnowMoreClicked.f10790a);
        CoroutineScope coroutineScope = this.f10802a;
        if (zEquals2) {
            BuildersKt.d(coroutineScope, null, null, new WalletAccessManagerImpl$handleBackendReclaimKnowMore$1(this, null), 3);
            return;
        }
        boolean zEquals3 = intent.equals(WalletAccessIntent.FinishFlowLaterClicked.f10792a);
        ChaloNavigationManager chaloNavigationManager = this.i;
        StateFlow stateFlow = this.t;
        if (zEquals3) {
            do {
                value8 = mutableStateFlow.getValue();
                it6 = (WalletAccessState) value8;
                Intrinsics.i(it6, "it");
            } while (!mutableStateFlow.c(value8, WalletAccessState.a(it6, null, null, false, false, null, null, 8063)));
            f(closeBottomSheet);
            Boolean bool = ((WalletAccessState) stateFlow.getValue()).f10810a;
            if (bool != null ? bool.booleanValue() : true) {
                gf.u(null, chaloNavigationManager);
                return;
            }
            return;
        }
        boolean zEquals4 = intent.equals(WalletAccessIntent.FullKYCKnowMoreClicked.f10793a);
        AnalyticsContract analyticsContract = this.f;
        if (zEquals4) {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "full kyc know more clicked", this.w, null, null, false, 28);
            BuildersKt.d(coroutineScope, null, null, new WalletAccessManagerImpl$handleFullKYCKnowMore$1(this, null), 3);
            return;
        }
        if (intent.equals(WalletAccessIntent.LoadMoneyClicked.f10795a)) {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet load money clicked", this.w, null, null, false, 28);
            f(closeBottomSheet);
            do {
                value7 = mutableStateFlow.getValue();
                it5 = (WalletAccessState) value7;
                Intrinsics.i(it5, "it");
            } while (!mutableStateFlow.c(value7, WalletAccessState.a(it5, null, null, false, false, null, null, 8063)));
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WalletLoadMoneyArgs(7), null, null, 6));
            return;
        }
        if (intent.equals(WalletAccessIntent.LoadMoneyLaterClicked.f10796a)) {
            f(closeBottomSheet);
            do {
                value6 = mutableStateFlow.getValue();
                it4 = (WalletAccessState) value6;
                Intrinsics.i(it4, "it");
            } while (!mutableStateFlow.c(value6, WalletAccessState.a(it4, null, null, false, false, null, null, 8063)));
            return;
        }
        if (intent.equals(WalletAccessIntent.LoginRetryClicked.f10797a)) {
            f(closeBottomSheet);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.WALLET_ACCESS_BASE_FRAGMENT, true), null, null, 6));
            do {
                value5 = mutableStateFlow.getValue();
                Intrinsics.i((WalletAccessState) value5, "it");
            } while (!mutableStateFlow.c(value5, new WalletAccessState(((WalletAccessState) stateFlow.getValue()).f10810a, null, null, null, null, null, null, 8054)));
            return;
        }
        if (intent.equals(WalletAccessIntent.NotActivatedProceedClicked.f10798a)) {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "activate wallet clicked", this.w, null, null, false, 28);
            f(closeBottomSheet);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(MinKycDetailsArgs.INSTANCE, null, null, 6));
            do {
                value4 = mutableStateFlow.getValue();
                Intrinsics.i((WalletAccessState) value4, "it");
            } while (!mutableStateFlow.c(value4, new WalletAccessState(((WalletAccessState) stateFlow.getValue()).f10810a, ((WalletAccessState) stateFlow.getValue()).b, null, null, null, null, null, 8044)));
            return;
        }
        if (intent.equals(WalletAccessIntent.RetryRefreshWalletClicked.f10799a)) {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "refresh wallet clicked", this.w, null, null, false, 28);
            f(closeBottomSheet);
            do {
                value3 = mutableStateFlow.getValue();
                it3 = (WalletAccessState) value3;
                Intrinsics.i(it3, "it");
            } while (!mutableStateFlow.c(value3, WalletAccessState.a(it3, null, null, false, false, null, null, 8063)));
            o();
            l(true);
            return;
        }
        if (intent.equals(WalletAccessIntent.UserBlockedKnowMoreClicked.f10801a)) {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet blocked know more clicked", this.w, null, null, false, 28);
            f(closeBottomSheet);
            do {
                value2 = mutableStateFlow.getValue();
                it2 = (WalletAccessState) value2;
                Intrinsics.i(it2, "it");
            } while (!mutableStateFlow.c(value2, WalletAccessState.a(it2, null, null, false, false, null, null, 8063)));
            return;
        }
        if (intent instanceof WalletAccessIntent.InitialisationIntent) {
            WalletAccessIntent.InitialisationIntent initialisationIntent = (WalletAccessIntent.InitialisationIntent) intent;
            do {
                value = mutableStateFlow.getValue();
                it = (WalletAccessState) value;
                Intrinsics.i(it, "it");
                z = initialisationIntent.b;
            } while (!mutableStateFlow.c(value, WalletAccessState.a(it, Boolean.valueOf(z), initialisationIntent.c, false, false, null, initialisationIntent.f10794a, 6140)));
            return;
        }
        if (!intent.equals(WalletAccessIntent.TransferChaloPayClicked.f10800a)) {
            throw new NoWhenBranchMatchedException();
        }
        Job job = this.q;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            WalletTypeIdentifier walletTypeIdentifier = ((WalletAccessState) stateFlow.getValue()).b;
            if (walletTypeIdentifier == null) {
                AnalyticsContractImplKt.b(analyticsContract, "wallet identifier not available", Source.WALLET_ACCESS_BASE_FRAGMENT, vo1.s("flow", "handleTransferChaloPayClicked"), false, 24);
            } else {
                o();
                this.q = BuildersKt.d(coroutineScope, null, null, new WalletAccessManagerImpl$handleTransferChaloPayClicked$1(this, walletTypeIdentifier, null), 3);
            }
        }
    }

    @Override // app.chalo.wallet.ui.access.WalletAccessManager
    /* JADX INFO: renamed from: d, reason: from getter */
    public final StateFlow getT() {
        return this.t;
    }

    public final void f(WalletAccessSideEffect walletAccessSideEffect) {
        BuildersKt.d(this.f10802a, null, null, new WalletAccessManagerImpl$emitSideEffect$1(this, walletAccessSideEffect, null), 3);
    }

    public final void g() {
        WalletTypeIdentifier walletTypeIdentifier = ((WalletAccessState) this.t.getValue()).b;
        if (walletTypeIdentifier == null) {
            return;
        }
        Job job = this.p;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.p = BuildersKt.d(this.f10802a, null, null, new WalletAccessManagerImpl$handleCheckWalletStatus$1(this, walletTypeIdentifier, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object h(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        WalletAccessManagerImpl$handleClosedLoopWalletRegistration$1 walletAccessManagerImpl$handleClosedLoopWalletRegistration$1;
        MutableStateFlow mutableStateFlow;
        Object value;
        WalletAccessState it;
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        WalletTypeIdentifier walletTypeIdentifier2 = walletTypeIdentifier;
        if (continuationImpl instanceof WalletAccessManagerImpl$handleClosedLoopWalletRegistration$1) {
            walletAccessManagerImpl$handleClosedLoopWalletRegistration$1 = (WalletAccessManagerImpl$handleClosedLoopWalletRegistration$1) continuationImpl;
            int i = walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1 = new WalletAccessManagerImpl$handleClosedLoopWalletRegistration$1(this, continuationImpl);
            }
        } else {
            walletAccessManagerImpl$handleClosedLoopWalletRegistration$1 = new WalletAccessManagerImpl$handleClosedLoopWalletRegistration$1(this, continuationImpl);
        }
        Object objA = walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            f(WalletAccessSideEffect.CloseBottomSheet.f10808a);
            do {
                mutableStateFlow = this.r;
                value = mutableStateFlow.getValue();
                it = (WalletAccessState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow.c(value, WalletAccessState.a(it, null, null, false, true, null, null, 7999)));
            walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0 = walletTypeIdentifier2;
            walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label = 1;
            objA = this.o.a(walletTypeIdentifier2, walletAccessManagerImpl$handleClosedLoopWalletRegistration$1);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objA);
                return unit;
            }
            if (i2 == 3) {
                ResultKt.b(objA);
                return unit;
            }
            if (i2 == 4) {
                kotlinToastManager = (KotlinToastManager) walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0;
                ResultKt.b(objA);
                KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
                return unit;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager2 = (KotlinToastManager) walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0;
            ResultKt.b(objA);
            KotlinToastManagerKt.a(kotlinToastManager2, (String) objA, ToastLength.LONG);
            return unit;
        }
        walletTypeIdentifier2 = (WalletTypeIdentifier) walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0;
        ResultKt.b(objA);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            WalletStatusWithReclaimTime walletStatusWithReclaimTime = ((ClosedLoopWalletActivationResult) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f11038a;
            walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0 = null;
            walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label = 2;
            if (j(walletStatusWithReclaimTime, walletTypeIdentifier2, false, walletAccessManagerImpl$handleClosedLoopWalletRegistration$1) == obj) {
                return obj;
            }
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.b[((RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        StringProvider stringProvider = this.h;
        KotlinToastManager kotlinToastManager3 = this.m;
        switch (i3) {
            case 1:
                WalletStatusWithReclaimTime walletStatusWithReclaimTime2 = new WalletStatusWithReclaimTime(WalletStatus.USER_NOT_LOGGED_IN, null);
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0 = null;
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label = 3;
                if (j(walletStatusWithReclaimTime2, walletTypeIdentifier2, false, walletAccessManagerImpl$handleClosedLoopWalletRegistration$1) == obj) {
                    return obj;
                }
                return unit;
            case 2:
                m();
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0 = kotlinToastManager3;
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label = 4;
                objA = stringProvider.b(StringEnum.CITY_NOT_AVAILABLE, new Object[0], walletAccessManagerImpl$handleClosedLoopWalletRegistration$1);
                if (objA != obj) {
                    kotlinToastManager = kotlinToastManager3;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
                    return unit;
                }
                return obj;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m();
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.L$0 = kotlinToastManager3;
                walletAccessManagerImpl$handleClosedLoopWalletRegistration$1.label = 5;
                objA = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], walletAccessManagerImpl$handleClosedLoopWalletRegistration$1);
                if (objA != obj) {
                    kotlinToastManager2 = kotlinToastManager3;
                    KotlinToastManagerKt.a(kotlinToastManager2, (String) objA, ToastLength.LONG);
                    return unit;
                }
                return obj;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.wallet.ui.access.WalletAccessManager
    public final Flow i() {
        return this.u;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x02a3 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ea, code lost:
    
        if (r3 == r5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0237, code lost:
    
        if (r3 == r5) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime r26, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r27, boolean r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.access.WalletAccessManagerImpl.j(app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void k() {
        MutableStateFlow mutableStateFlow;
        Object value;
        WalletAccessState it;
        f(WalletAccessSideEffect.CloseBottomSheet.f10808a);
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
            it = (WalletAccessState) value;
            Intrinsics.i(it, "it");
        } while (!mutableStateFlow.c(value, WalletAccessState.a(it, null, null, true, true, null, null, 7951)));
        l(false);
    }

    public final void l(boolean z) {
        WalletTypeIdentifier walletTypeIdentifier = ((WalletAccessState) this.t.getValue()).b;
        if (walletTypeIdentifier == null) {
            return;
        }
        BuildersKt.d(this.f10802a, null, null, new WalletAccessManagerImpl$refreshWalletStatus$1(this, walletTypeIdentifier, z, null), 3);
    }

    public final void m() {
        MutableStateFlow mutableStateFlow;
        Object value;
        WalletAccessState it;
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
            it = (WalletAccessState) value;
            Intrinsics.i(it, "it");
        } while (!mutableStateFlow.c(value, WalletAccessState.a(it, null, null, false, false, WalletAccessSheet.NeedInternet, null, 7967)));
        f(WalletAccessSideEffect.ShowBottomSheet.f10809a);
    }

    public final void n(Function1 function1) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, (WalletAccessState) function1.invoke((WalletAccessState) value)));
    }

    public final void o() {
        MutableStateFlow mutableStateFlow;
        Object value;
        WalletAccessState it;
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
            it = (WalletAccessState) value;
            Intrinsics.i(it, "it");
        } while (!mutableStateFlow.c(value, WalletAccessState.a(it, null, null, false, true, null, null, 7999)));
    }
}
