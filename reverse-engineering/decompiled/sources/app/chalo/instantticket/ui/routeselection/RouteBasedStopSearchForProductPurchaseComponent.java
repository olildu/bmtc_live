package app.chalo.instantticket.ui.routeselection;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.ProductBookingBranding;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.ui.routeselection.RouteSelectionStopType;
import app.chalo.instantticket.ui.routeselection.RouteSelectionViewState;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PickRouteLocationArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.utils.KUUID;
import com.arkivanov.decompose.ComponentContext;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/RouteBasedStopSearchForProductPurchaseComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionIntent;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionViewState;", "Lapp/chalo/instantticket/ui/routeselection/RouteSelectionSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteBasedStopSearchForProductPurchaseComponent extends ChaloBaseStateMviComponent<RouteSelectionIntent, RouteSelectionViewState, RouteSelectionViewState, RouteSelectionSideEffect> {
    public final TicketPurchaseArgs.RouteSelectionArgs k;
    public final StringProvider l;
    public final InstantTicketConfigHelper m;
    public final ProductBookingDataStore n;
    public final AnalyticsContract o;
    public final ChaloNavigationManager p;
    public final KotlinToastManager q;
    public final RouteSearchResultStateManager r;
    public Job s;
    public final String t;
    public boolean u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3963a;

        static {
            int[] iArr = new int[RouteSelectionStopType.values().length];
            try {
                iArr[RouteSelectionStopType.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteSelectionStopType.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteSelectionStopType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3963a = iArr;
        }
    }

    public RouteBasedStopSearchForProductPurchaseComponent(ComponentContext componentContext, TicketPurchaseArgs.RouteSelectionArgs routeSelectionArgs, StringProvider stringProvider, InstantTicketConfigHelper instantTicketConfigHelper, ProductBookingDataStore productBookingDataStore, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, RouteSearchResultStateManager routeSearchResultStateManager) {
        super(componentContext);
        this.k = routeSelectionArgs;
        this.l = stringProvider;
        this.m = instantTicketConfigHelper;
        this.n = productBookingDataStore;
        this.o = analyticsContract;
        this.p = chaloNavigationManager;
        this.q = kotlinToastManager;
        this.r = routeSearchResultStateManager;
        this.t = KUUID.a();
        this.u = true;
        Source source = Source.ROUTE_SELECTION_FRAGMENT;
        if (!(routeSelectionArgs instanceof TicketPurchaseArgs.RouteSelectionArgs.InstantTicket)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContractImplKt.b(analyticsContract, "route based stop selection screen opened", source, vo1.s("flowType", "Instant Ticket"), false, 24);
    }

    public final void F0(RouteSelectionIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof RouteSelectionIntent.SelectRouteClicked;
        ContextScope contextScope = this.j;
        if (z) {
            Job job = this.s;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            String str = this.t;
            this.s = BuildersKt.d(contextScope, null, null, new RouteBasedStopSearchForProductPurchaseComponent$collectInstantTicketResult$1(this, str, null), 3);
            this.p.b(new ChaloNavigationRequest.Navigate(new PickRouteLocationArgs(str, this.k instanceof TicketPurchaseArgs.RouteSelectionArgs.InstantTicket, Source.PRODUCT_BOOKING_SRC), null, null, 6));
            return;
        }
        if (intent instanceof RouteSelectionIntent.SelectStopClicked) {
            RouteSelectionStopType routeSelectionStopType = ((RouteSelectionIntent.SelectStopClicked) intent).f3967a;
            AnalyticsContractImplKt.b(this.o, "find my ticket fare stop clicked", Source.ROUTE_SELECTION_FRAGMENT, vo1.s("stop type", routeSelectionStopType.name()), false, 24);
            BuildersKt.d(contextScope, null, null, new RouteBasedStopSearchForProductPurchaseComponent$handleSelectStopClickedIntent$1(this, routeSelectionStopType, null), 3);
            return;
        }
        final int i = 0;
        final int i2 = 1;
        if (intent instanceof RouteSelectionIntent.RouteDetailsFetched) {
            ProductBookingRouteDetails productBookingRouteDetails = ((RouteSelectionIntent.RouteDetailsFetched) intent).f3965a;
            AnalyticsContractImplKt.b(this.o, "find my ticket fare route number entered", Source.ROUTE_SELECTION_FRAGMENT, MapsKt.i(new Pair("route id", productBookingRouteDetails.b), new Pair("route name", productBookingRouteDetails.f8194a)), false, 24);
            BuildersKt.d(contextScope, null, null, new RouteBasedStopSearchForProductPurchaseComponent$handleRouteDetailsFetchedIntent$1(this, productBookingRouteDetails, null), 3);
            return;
        }
        boolean z2 = intent instanceof RouteSelectionIntent.StopDetailsFetched;
        StateFlow stateFlow = this.f;
        if (!z2) {
            if (!(intent instanceof RouteSelectionIntent.NextButtonClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContractImplKt.b(this.o, "find my ticket fare route details next clicked", Source.ROUTE_SELECTION_FRAGMENT, MapsKt.i(new Pair("route id", ((RouteSelectionViewState) stateFlow.getValue()).f3969a.f8194a), new Pair("route name", ((RouteSelectionViewState) stateFlow.getValue()).f3969a.b), new Pair("from stop id", ((RouteSelectionViewState) stateFlow.getValue()).b.f8199a), new Pair("from stop name", ((RouteSelectionViewState) stateFlow.getValue()).b.b), new Pair("to stop id", ((RouteSelectionViewState) stateFlow.getValue()).c.f8199a), new Pair("to stop name", ((RouteSelectionViewState) stateFlow.getValue()).c.b)), false, 24);
            BuildersKt.d(contextScope, null, null, new RouteBasedStopSearchForProductPurchaseComponent$handleNextButtonClickedIntent$1(this, null), 3);
            return;
        }
        final ProductBookingStopDetails productBookingStopDetails = ((RouteSelectionIntent.StopDetailsFetched) intent).f3968a;
        AnalyticsContractImplKt.b(this.o, "find my ticket fare stop entered", Source.ROUTE_SELECTION_FRAGMENT, MapsKt.i(new Pair("stop id", productBookingStopDetails.f8199a), new Pair("stop name", productBookingStopDetails.b)), false, 24);
        int i3 = WhenMappings.f3963a[((RouteSelectionViewState) stateFlow.getValue()).g.ordinal()];
        if (i3 == 1) {
            E0(new Function1() { // from class: m31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            RouteSelectionViewState it = (RouteSelectionViewState) obj;
                            Intrinsics.i(it, "it");
                            return RouteSelectionViewState.a(it, null, productBookingStopDetails, null, null, false, RouteSelectionStopType.NONE, null, null, false, 989);
                        default:
                            RouteSelectionViewState it2 = (RouteSelectionViewState) obj;
                            Intrinsics.i(it2, "it");
                            return RouteSelectionViewState.a(it2, null, null, productBookingStopDetails, null, false, RouteSelectionStopType.NONE, null, null, false, 987);
                    }
                }
            });
        } else if (i3 == 2) {
            E0(new Function1() { // from class: m31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            RouteSelectionViewState it = (RouteSelectionViewState) obj;
                            Intrinsics.i(it, "it");
                            return RouteSelectionViewState.a(it, null, productBookingStopDetails, null, null, false, RouteSelectionStopType.NONE, null, null, false, 989);
                        default:
                            RouteSelectionViewState it2 = (RouteSelectionViewState) obj;
                            Intrinsics.i(it2, "it");
                            return RouteSelectionViewState.a(it2, null, null, productBookingStopDetails, null, false, RouteSelectionStopType.NONE, null, null, false, 987);
                    }
                }
            });
        } else if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (RouteSelectionViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        ProductBookingRouteDetails productBookingRouteDetails = new ProductBookingRouteDetails("", "", "", emptyList, emptyList, false);
        ProductBookingStopDetails productBookingStopDetails = new ProductBookingStopDetails("", "", null);
        ProductBookingStopDetails productBookingStopDetails2 = new ProductBookingStopDetails("", "", null);
        ProductBookingBranding.None none = ProductBookingBranding.None.INSTANCE;
        RouteSelectionStopType routeSelectionStopType = RouteSelectionStopType.NONE;
        return new RouteSelectionViewState(productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2, none, false, routeSelectionStopType, routeSelectionStopType, emptyList, null, false);
    }
}
