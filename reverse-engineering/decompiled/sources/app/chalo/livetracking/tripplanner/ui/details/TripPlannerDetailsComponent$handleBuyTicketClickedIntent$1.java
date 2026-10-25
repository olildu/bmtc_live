package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$handleBuyTicketClickedIntent$1", f = "TripPlannerDetailsComponent.kt", l = {346, 349, 363, 367, 372}, m = "invokeSuspend", v = 1)
final class TripPlannerDetailsComponent$handleBuyTicketClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerDetailsIntent.BuyTicketClickedIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ TripPlannerDetailsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4724a;

        static {
            int[] iArr = new int[RouteBookingType.values().length];
            try {
                iArr[RouteBookingType.TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteBookingType.PREMIUM_BUS_TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteBookingType.AIRPORT_ROUTE_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteBookingType.PASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4724a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsComponent$handleBuyTicketClickedIntent$1(TripPlannerDetailsComponent tripPlannerDetailsComponent, TripPlannerDetailsIntent.BuyTicketClickedIntent buyTicketClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerDetailsComponent;
        this.$intent = buyTicketClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerDetailsComponent$handleBuyTicketClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerDetailsComponent$handleBuyTicketClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0120 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteAppModel routeAppModel;
        TripPlannerLegAppModel.Bus busO0;
        LiveTrackingNavigationContract liveTrackingNavigationContract;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        List list;
        long jLongValue;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = this.this$0.L;
            if (linkedHashMap != null && (routeAppModel = (RouteAppModel) linkedHashMap.get(this.$intent.f4728a)) != null) {
                busO0 = this.this$0.O0(this.$intent.f4728a);
                TripPlannerDetailsComponent tripPlannerDetailsComponent = this.this$0;
                this.L$0 = routeAppModel;
                this.L$1 = busO0;
                this.label = 1;
                if (TripPlannerDetailsComponent.H0(tripPlannerDetailsComponent, busO0, routeAppModel, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i == 1) {
            busO0 = (TripPlannerLegAppModel.Bus) this.L$1;
            routeAppModel = (RouteAppModel) this.L$0;
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 3) {
                if (i == 4) {
                    ResultKt.b(obj);
                    return unit;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            list = (List) this.L$3;
            stopAppModel2 = (StopAppModel) this.L$2;
            stopAppModel = (StopAppModel) this.L$1;
            liveTrackingNavigationContract = (LiveTrackingNavigationContract) this.L$0;
            ResultKt.b(obj);
        }
        jLongValue = ((Number) obj).longValue();
        list2 = list;
        liveTrackingNavigationContract.d(stopAppModel, stopAppModel2, list2, Source.TRIP_PLANNER_DETAILS, jLongValue);
        return unit;
        RouteBookingType routeBookingTypeA = ExtensionsKt.a(routeAppModel.p);
        int i2 = routeBookingTypeA == null ? -1 : WhenMappings.f4724a[routeBookingTypeA.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                TripPlannerDetailsComponent tripPlannerDetailsComponent2 = this.this$0;
                StopAppModel stopAppModel3 = busO0 != null ? busO0.s : null;
                StopAppModel stopAppModel4 = busO0 != null ? busO0.t : null;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (TripPlannerDetailsComponent.G0(tripPlannerDetailsComponent2, routeAppModel, stopAppModel3, stopAppModel4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            }
            if (i2 == 2 || i2 == 3) {
                if (busO0 != null) {
                    liveTrackingNavigationContract = this.this$0.C;
                    stopAppModel = busO0.s;
                    stopAppModel2 = busO0.t;
                    List listR = CollectionsKt.R(routeAppModel.b);
                    TripPlannerDetailsComponent tripPlannerDetailsComponent3 = this.this$0;
                    Long l = tripPlannerDetailsComponent3.P;
                    if (l != null) {
                        jLongValue = l.longValue();
                        list2 = listR;
                    } else {
                        BasicInfoContract basicInfoContract = tripPlannerDetailsComponent3.q;
                        this.L$0 = liveTrackingNavigationContract;
                        this.L$1 = stopAppModel;
                        this.L$2 = stopAppModel2;
                        this.L$3 = listR;
                        this.label = 3;
                        Object objC = basicInfoContract.c(this);
                        if (objC != coroutineSingletons) {
                            list = listR;
                            obj = objC;
                            jLongValue = ((Number) obj).longValue();
                            list2 = list;
                        }
                    }
                    liveTrackingNavigationContract.d(stopAppModel, stopAppModel2, list2, Source.TRIP_PLANNER_DETAILS, jLongValue);
                    return unit;
                }
                TripPlannerDetailsComponent tripPlannerDetailsComponent4 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (TripPlannerDetailsComponent.F0(tripPlannerDetailsComponent4, routeAppModel, this) != coroutineSingletons) {
                    return unit;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        TripPlannerDetailsComponent tripPlannerDetailsComponent5 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 5;
        if (TripPlannerDetailsComponent.F0(tripPlannerDetailsComponent5, routeAppModel, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }
}
