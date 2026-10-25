package app.chalo.home;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.ShouldCallWalletSyncApiUseCase;
import app.chalo.home.ui.base.CommonBottomSheetType;
import app.chalo.home.ui.base.HomeScreenDrawerConfiguration;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.utils.ProductUtils;
import app.chalo.utils.SystemHelper;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/HomeScreenInfoHelperImpl;", "Lapp/chalo/home/contract/HomeScreenInfoHelper;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenInfoHelperImpl implements HomeScreenInfoHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f2860a;
    public final InitiateProductHistorySyncCallUseCase b;
    public final ShouldCallWalletSyncApiUseCase c;
    public final WalletSyncOrchestrator d;
    public final CoroutineContextProvider e;
    public final SystemHelper f;
    public final ProductUtils g;
    public final ChaloChainedBottomSheetFeature h;
    public final CheckIsUserLoggedInUseCase i;
    public final LocalDataStore j;
    public Job k;
    public final MutableStateFlow l = StateFlowKt.a(new HistoryCallApiFetchState());
    public final MutableStateFlow m = StateFlowKt.a(new WalletSyncApiFetchState());
    public final MutableStateFlow n;
    public final MutableStateFlow o;
    public final MutableStateFlow p;
    public final MutableStateFlow q;
    public boolean r;
    public String s;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lapp/chalo/home/HomeScreenInfoHelperImpl$Companion;", "", "", "ORDERED_BOTTOM_SHEET_KEY", "Ljava/lang/String;", "", "RANK_NOTIFICATION_PERMISSION", "I", "RANK_CITY_BOTTOM_SHEET_PROMPT", "RANK_CARD_RECHARGE_BOTTOM_SHEET_PROMPT", "RANK_PASS_STATUS_BOTTOM_SHEET_PROMPT", "RANK_BOOST_RATINGS_DIALOG", "RANK_RIDE_HAILING_USER_FEEDBACK", "RANK_USER_PROFILING_BOTTOM_SHEET", "RANK_CARD_NUMBER_LIST_BOTTOM_SHEET_PROMPT", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public HomeScreenInfoHelperImpl(CityProvider cityProvider, InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, ShouldCallWalletSyncApiUseCase shouldCallWalletSyncApiUseCase, WalletSyncOrchestrator walletSyncOrchestrator, CoroutineContextProvider coroutineContextProvider, SystemHelper systemHelper, ProductUtils productUtils, ChaloChainedBottomSheetFeature chaloChainedBottomSheetFeature, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, LocalDataStore localDataStore) {
        this.f2860a = cityProvider;
        this.b = initiateProductHistorySyncCallUseCase;
        this.c = shouldCallWalletSyncApiUseCase;
        this.d = walletSyncOrchestrator;
        this.e = coroutineContextProvider;
        this.f = systemHelper;
        this.g = productUtils;
        this.h = chaloChainedBottomSheetFeature;
        this.i = checkIsUserLoggedInUseCase;
        this.j = localDataStore;
        Boolean bool = Boolean.TRUE;
        this.n = StateFlowKt.a(bool);
        this.o = StateFlowKt.a(bool);
        this.p = StateFlowKt.a(new SnackBarState());
        this.q = StateFlowKt.a(null);
        this.r = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r11 == r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(app.chalo.home.HomeScreenInfoHelperImpl r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.HomeScreenInfoHelperImpl.v(app.chalo.home.HomeScreenInfoHelperImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void a(SnackBarData snackBarData) {
        Object value;
        MutableStateFlow mutableStateFlow = this.p;
        SnackBarState it = (SnackBarState) mutableStateFlow.getValue();
        Intrinsics.i(it, "it");
        SnackBarState snackBarState = new SnackBarState(snackBarData, true);
        if (it.equals(snackBarState)) {
            return;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, snackBarState));
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final StateFlow b() {
        return FlowKt.c(this.q);
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void c(boolean z) {
        this.o.setValue(Boolean.valueOf(z));
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void d(boolean z) {
        Object value;
        MutableStateFlow mutableStateFlow = this.n;
        if (((Boolean) mutableStateFlow.getValue()).booleanValue() != z) {
            do {
                value = mutableStateFlow.getValue();
                ((Boolean) value).getClass();
            } while (!mutableStateFlow.c(value, Boolean.valueOf(z)));
        }
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void e() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.q;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, null));
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final StateFlow f() {
        return FlowKt.c(this.p);
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getS() {
        return this.s;
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void h(ContextScope parentScope) {
        Intrinsics.i(parentScope, "parentScope");
        Job job = this.k;
        if ((job == null || !((AbstractCoroutine) job).isActive()) && this.i.a()) {
            this.k = BuildersKt.d(parentScope, this.e.b(), null, new HomeScreenInfoHelperImpl$makeNecessaryApiCalls$1(this, null), 2);
        }
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final StateFlow i() {
        return FlowKt.c(this.o);
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void j() {
        this.r = false;
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final StateFlow k() {
        return FlowKt.c(this.l);
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void l(String str) {
        if (str == null || StringsKt.F(str)) {
            str = null;
        }
        this.s = str;
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void m() {
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        MutableStateFlow mutableStateFlow6;
        Object value6;
        Job job = this.k;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.k = null;
        do {
            mutableStateFlow = this.l;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, new HistoryCallApiFetchState()));
        do {
            mutableStateFlow2 = this.m;
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.c(value2, new WalletSyncApiFetchState()));
        do {
            mutableStateFlow3 = this.n;
            value3 = mutableStateFlow3.getValue();
            ((Boolean) value3).getClass();
        } while (!mutableStateFlow3.c(value3, Boolean.TRUE));
        do {
            mutableStateFlow4 = this.o;
            value4 = mutableStateFlow4.getValue();
            ((Boolean) value4).getClass();
        } while (!mutableStateFlow4.c(value4, Boolean.TRUE));
        do {
            mutableStateFlow5 = this.q;
            value5 = mutableStateFlow5.getValue();
        } while (!mutableStateFlow5.c(value5, null));
        do {
            mutableStateFlow6 = this.p;
            value6 = mutableStateFlow6.getValue();
        } while (!mutableStateFlow6.c(value6, new SnackBarState()));
        this.r = true;
        this.s = null;
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final Object n(int i, CommonBottomSheetType commonBottomSheetType, ContinuationImpl continuationImpl) {
        Object objA = this.h.a(i, "ordered_bottomsheet_key", commonBottomSheetType, true, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r12 == r1) goto L42;
     */
    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.HomeScreenInfoHelperImpl.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getR() {
        return this.r;
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void q() {
        Object value;
        MutableStateFlow mutableStateFlow = this.p;
        SnackBarState it = (SnackBarState) mutableStateFlow.getValue();
        Intrinsics.i(it, "it");
        SnackBarState snackBarState = new SnackBarState(it.f2864a, false);
        if (Intrinsics.d(it, snackBarState)) {
            return;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, snackBarState));
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final void r() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.q;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, HomeScreenDrawerConfiguration.ProfileScreenDrawer.INSTANCE));
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final Object s(CommonBottomSheetType commonBottomSheetType, SuspendLambda suspendLambda) {
        Object objC = this.h.c("ordered_bottomsheet_key", commonBottomSheetType, suspendLambda);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final StateFlow t() {
        return FlowKt.c(this.n);
    }

    @Override // app.chalo.home.contract.HomeScreenInfoHelper
    public final String u() {
        String str = this.s;
        this.s = null;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(ContinuationImpl continuationImpl) {
        HomeScreenInfoHelperImpl$isFreshInstall$1 homeScreenInfoHelperImpl$isFreshInstall$1;
        if (continuationImpl instanceof HomeScreenInfoHelperImpl$isFreshInstall$1) {
            homeScreenInfoHelperImpl$isFreshInstall$1 = (HomeScreenInfoHelperImpl$isFreshInstall$1) continuationImpl;
            int i = homeScreenInfoHelperImpl$isFreshInstall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenInfoHelperImpl$isFreshInstall$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenInfoHelperImpl$isFreshInstall$1 = new HomeScreenInfoHelperImpl$isFreshInstall$1(this, continuationImpl);
            }
        } else {
            homeScreenInfoHelperImpl$isFreshInstall$1 = new HomeScreenInfoHelperImpl$isFreshInstall$1(this, continuationImpl);
        }
        Object objV = homeScreenInfoHelperImpl$isFreshInstall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenInfoHelperImpl$isFreshInstall$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.j.e(PreferencesKeys.stringKey("installStatus"));
            homeScreenInfoHelperImpl$isFreshInstall$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, homeScreenInfoHelperImpl$isFreshInstall$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        String str = (String) objV;
        if (!Intrinsics.d(str, "freshInstall") && Intrinsics.d(str, "existingInstall")) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
