package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.ondc.domain.FetchOndcMetroLineStopsUseCase;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepository;
import app.chalo.recent.model.app.RecentAdditionalRouteInfoModel;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/RouteBasedMetroLandingScreenHelper;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenHelper;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteBasedMetroLandingScreenHelper implements MetroLandingScreenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchOndcMetroLineStopsUseCase f5513a;
    public final StringProvider b;
    public final CityProvider c;
    public final BasicInfoContract d;
    public final RecentRepositoryProvider e;
    public final CoroutineContextProvider f;
    public final MutableStateFlow g = StateFlowKt.a(new MetroLandingScreenHelperState());
    public final BufferedChannel h = ChannelKt.a(-2, 6, null);
    public final ContextScope i;

    public RouteBasedMetroLandingScreenHelper(FetchOndcMetroLineStopsUseCase fetchOndcMetroLineStopsUseCase, StringProvider stringProvider, CityProvider cityProvider, BasicInfoContract basicInfoContract, RecentRepositoryProvider recentRepositoryProvider, CoroutineContextProvider coroutineContextProvider) {
        this.f5513a = fetchOndcMetroLineStopsUseCase;
        this.b = stringProvider;
        this.c = cityProvider;
        this.d = basicInfoContract;
        this.e = recentRepositoryProvider;
        this.f = coroutineContextProvider;
        this.i = CoroutineScopeKt.a(coroutineContextProvider.a().plus(SupervisorKt.b()));
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final void a() {
        this.h.close(null);
        CoroutineScopeKt.b(this.i, null);
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final Flow b() {
        return FlowKt.D(this.h);
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final Object d(MetroLandingScreenDataState metroLandingScreenDataState, ContinuationImpl continuationImpl) {
        RouteBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        String str;
        String str2;
        String str3;
        String str4;
        RecentAdditionalRouteInfoModel metro;
        ChaloTransitMode chaloTransitMode;
        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel;
        if (continuationImpl instanceof RouteBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1) {
            routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 = (RouteBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1) continuationImpl;
            int i = routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label = i - Integer.MIN_VALUE;
            } else {
                routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 = new RouteBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1(this, continuationImpl);
            }
        } else {
            routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1 = new RouteBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1(this, continuationImpl);
        }
        Object objC = routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            MetroLineListItemState metroLineListItemState = metroLandingScreenDataState.j;
            stopAppModel = metroLandingScreenDataState.k;
            stopAppModel2 = metroLandingScreenDataState.l;
            if (((metroLineListItemState == null || (ondcMetroRouteSearchAppModel = metroLineListItemState.f5509a) == null) ? null : ondcMetroRouteSearchAppModel.f6766a) != null) {
                if ((stopAppModel != null ? stopAppModel.f1727a : null) != null) {
                    if ((stopAppModel2 != null ? stopAppModel2.f1727a : null) != null) {
                        str = metroLineListItemState.f5509a.f6766a + "-" + stopAppModel.f1727a + "-" + stopAppModel2.f1727a;
                        String strB = CityProviderKt.b(this.c);
                        if (strB == null) {
                            strB = "";
                        }
                        str2 = strB;
                        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel2 = metroLineListItemState.f5509a;
                        str3 = ondcMetroRouteSearchAppModel2.f6766a;
                        str4 = ondcMetroRouteSearchAppModel2.b;
                        OriginDestinationAdditionalRouteInfoAppModel originDestinationAdditionalRouteInfoAppModel = ondcMetroRouteSearchAppModel2.i;
                        if (originDestinationAdditionalRouteInfoAppModel instanceof OriginDestinationAdditionalRouteInfoAppModel.Metro) {
                            metro = new RecentAdditionalRouteInfoModel.Metro(((OriginDestinationAdditionalRouteInfoAppModel.Metro) originDestinationAdditionalRouteInfoAppModel).b);
                        } else {
                            boolean z = originDestinationAdditionalRouteInfoAppModel instanceof OriginDestinationAdditionalRouteInfoAppModel.Bus;
                            metro = RecentAdditionalRouteInfoModel.Bus.f8995a;
                            if (!z && originDestinationAdditionalRouteInfoAppModel != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        chaloTransitMode = ChaloTransitMode.METRO;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$0 = str;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$1 = str2;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$2 = str3;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$3 = str4;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$4 = metro;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$5 = stopAppModel;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$6 = stopAppModel2;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$7 = chaloTransitMode;
                        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label = 1;
                        objC = this.d.c(routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1);
                        if (objC != coroutineSingletons) {
                        }
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
        chaloTransitMode = (ChaloTransitMode) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$7;
        stopAppModel2 = (StopAppModel) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$6;
        stopAppModel = (StopAppModel) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$5;
        metro = (RecentAdditionalRouteInfoModel) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$4;
        str4 = (String) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$3;
        str3 = (String) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$2;
        str2 = (String) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$1;
        str = (String) routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$0;
        ResultKt.b(objC);
        RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel = new RecentStopAndRouteBasedAppModel(str, str2, str3, str4, metro, stopAppModel, stopAppModel2, chaloTransitMode, ((Number) objC).longValue(), 1);
        StopAndRouteBasedRecentRepository stopAndRouteBasedRecentRepositoryG = this.e.getF();
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$0 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$1 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$2 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$3 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$4 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$5 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$6 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.L$7 = null;
        routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1.label = 2;
        return stopAndRouteBasedRecentRepositoryG.b(recentStopAndRouteBasedAppModel, true, routeBasedMetroLandingScreenHelper$saveOrUpdateRecentTripToStore$1) == coroutineSingletons ? coroutineSingletons : unit;
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
            boolean r0 = r7 instanceof app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper$getRecentSearchedTrips$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper$getRecentSearchedTrips$1 r0 = (app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper$getRecentSearchedTrips$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper$getRecentSearchedTrips$1 r0 = new app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper$getRecentSearchedTrips$1
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
            app.chalo.recent.database.repository.recent.RecentRepositoryProvider r7 = r6.e
            app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepository r7 = r7.getF()
            app.chalo.providers.cityprovider.CityProvider r2 = r6.c
            java.lang.String r2 = app.chalo.providers.cityprovider.CityProviderKt.b(r2)
            if (r2 != 0) goto L49
            java.lang.String r2 = ""
        L49:
            app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r5 = app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode.METRO
            java.util.Set r5 = kotlin.collections.SetsKt.g(r5)
            r0.label = r4
            java.lang.Object r7 = r7.a(r2, r5, r0)
            if (r7 != r1) goto L58
            goto L68
        L58:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper$getRecentSearchedTrips$2 r2 = new app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper$getRecentSearchedTrips$2
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
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r0 == r1) goto L27;
     */
    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(app.chalo.metro.ui.landing.MetroLandingScreenDataState r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.metro.ui.landing.RouteBasedMetroLandingScreenHelper.f(app.chalo.metro.ui.landing.MetroLandingScreenDataState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void g(MetroLandingScreenHelperSideEffect metroLandingScreenHelperSideEffect) {
        BuildersKt.d(this.i, null, null, new RouteBasedMetroLandingScreenHelper$emitSideEffect$1(this, metroLandingScreenHelperSideEffect, null), 3);
    }

    @Override // app.chalo.metro.ui.landing.MetroLandingScreenHelper
    public final StateFlow getState() {
        return FlowKt.c(this.g);
    }
}
