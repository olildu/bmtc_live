package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/StopBasedMetroLandingScreenHelper;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenHelper;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopBasedMetroLandingScreenHelper implements MetroLandingScreenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f5514a;
    public final BasicInfoContract b;
    public final RecentRepositoryProvider c;
    public final CoroutineContextProvider d;
    public final MutableStateFlow e = StateFlowKt.a(new MetroLandingScreenHelperState());
    public final BufferedChannel f = ChannelKt.a(-2, 6, null);
    public final ContextScope g;

    public StopBasedMetroLandingScreenHelper(CityProvider cityProvider, BasicInfoContract basicInfoContract, RecentRepositoryProvider recentRepositoryProvider, CoroutineContextProvider coroutineContextProvider) {
        this.f5514a = cityProvider;
        this.b = basicInfoContract;
        this.c = recentRepositoryProvider;
        this.d = coroutineContextProvider;
        this.g = CoroutineScopeKt.a(coroutineContextProvider.a().plus(SupervisorKt.b()));
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final void a() {
        this.f.close(null);
        CoroutineScopeKt.b(this.g, null);
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final Flow b() {
        return FlowKt.D(this.f);
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final Object d(MetroLandingScreenDataState metroLandingScreenDataState, ContinuationImpl continuationImpl) {
        StopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        String strN;
        String str;
        ChaloTransitMode chaloTransitMode;
        if (continuationImpl instanceof StopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1) {
            stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 = (StopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1) continuationImpl;
            int i = stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 = new StopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1(this, continuationImpl);
            }
        } else {
            stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 = new StopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1(this, continuationImpl);
        }
        Object objC = stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            stopAppModel = metroLandingScreenDataState.k;
            stopAppModel2 = metroLandingScreenDataState.l;
            if ((stopAppModel != null ? stopAppModel.f1727a : null) != null) {
                if ((stopAppModel2 != null ? stopAppModel2.f1727a : null) != null) {
                    strN = vo1.n(stopAppModel.f1727a, "-", stopAppModel2.f1727a);
                    String strB = CityProviderKt.b(this.f5514a);
                    if (strB == null) {
                        strB = "";
                    }
                    str = strB;
                    chaloTransitMode = ChaloTransitMode.METRO;
                    stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$0 = strN;
                    stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$1 = str;
                    stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$2 = stopAppModel;
                    stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$3 = stopAppModel2;
                    stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$4 = chaloTransitMode;
                    stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label = 1;
                    objC = this.b.c(stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1);
                    if (objC != coroutineSingletons) {
                    }
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        chaloTransitMode = (ChaloTransitMode) stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$4;
        stopAppModel2 = (StopAppModel) stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$3;
        stopAppModel = (StopAppModel) stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$2;
        str = (String) stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$1;
        strN = (String) stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$0;
        ResultKt.b(objC);
        RecentStopBasedTripAppModel recentStopBasedTripAppModel = new RecentStopBasedTripAppModel(strN, str, stopAppModel, stopAppModel2, chaloTransitMode, ((Number) objC).longValue(), 1);
        StopBasedTripRecentRepository stopBasedTripRecentRepositoryC = this.c.getC();
        stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$0 = null;
        stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$1 = null;
        stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$2 = null;
        stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$3 = null;
        stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$4 = null;
        stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label = 2;
        return stopBasedTripRecentRepositoryC.c(recentStopBasedTripAppModel, true, stopBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1) == coroutineSingletons ? coroutineSingletons : unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.j((kotlinx.coroutines.flow.Flow) r7, r2, r0) == r1) goto L24;
     */
    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper$getRecentSearchedTrips$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper$getRecentSearchedTrips$1 r0 = (app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper$getRecentSearchedTrips$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper$getRecentSearchedTrips$1 r0 = new app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper$getRecentSearchedTrips$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L69
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            kotlin.ResultKt.b(r7)
            goto L58
        L36:
            kotlin.ResultKt.b(r7)
            app.chalo.recent.database.repository.recent.RecentRepositoryProvider r7 = r6.c
            app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository r7 = r7.getC()
            app.chalo.providers.cityprovider.CityProvider r2 = r6.f5514a
            java.lang.String r2 = app.chalo.providers.cityprovider.CityProviderKt.b(r2)
            if (r2 != 0) goto L49
            java.lang.String r2 = ""
        L49:
            app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r5 = app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode.METRO
            java.util.Set r5 = kotlin.collections.SetsKt.g(r5)
            r0.label = r4
            java.lang.Object r7 = r7.e(r2, r5, r0)
            if (r7 != r1) goto L58
            goto L68
        L58:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper$getRecentSearchedTrips$2 r2 = new app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper$getRecentSearchedTrips$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.j(r7, r2, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.landing.StopBasedMetroLandingScreenHelper.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final Object f(MetroLandingScreenDataState metroLandingScreenDataState, Continuation continuation) {
        return MetroStopsListResultType.WithoutMapping.f5512a;
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final StateFlow getState() {
        return FlowKt.c(this.e);
    }
}
