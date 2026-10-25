package app.chalo.home.nearbytrips.domain;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase$fetchNearbyTrips$1", f = "NearbyTripsDataManagerBase.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "invokeSuspend", v = 1)
final class NearbyTripsDataManagerBase$fetchNearbyTrips$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $numOfSummaries;
    final /* synthetic */ Integer $radius;
    final /* synthetic */ LatLng $requestLatLng;
    final /* synthetic */ boolean $shouldSyncRoutesToo;
    final /* synthetic */ ChaloTransitMode $transitMode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NearbyTripsDataManagerBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyTripsDataManagerBase$fetchNearbyTrips$1(NearbyTripsDataManagerBase nearbyTripsDataManagerBase, LatLng latLng, ChaloTransitMode chaloTransitMode, int i, Integer num, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyTripsDataManagerBase;
        this.$requestLatLng = latLng;
        this.$transitMode = chaloTransitMode;
        this.$numOfSummaries = i;
        this.$radius = num;
        this.$shouldSyncRoutesToo = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NearbyTripsDataManagerBase$fetchNearbyTrips$1 nearbyTripsDataManagerBase$fetchNearbyTrips$1 = new NearbyTripsDataManagerBase$fetchNearbyTrips$1(this.this$0, this.$requestLatLng, this.$transitMode, this.$numOfSummaries, this.$radius, this.$shouldSyncRoutesToo, continuation);
        nearbyTripsDataManagerBase$fetchNearbyTrips$1.L$0 = obj;
        return nearbyTripsDataManagerBase$fetchNearbyTrips$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyTripsDataManagerBase$fetchNearbyTrips$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        NearbyTripsDataManagerBase$fetchNearbyTrips$1 nearbyTripsDataManagerBase$fetchNearbyTrips$1;
        CoroutineScope coroutineScope;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MutableStateFlow mutableStateFlow = this.this$0.h;
            LatLng latLng = this.$requestLatLng;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, NearbyTripsDataManagerState.a((NearbyTripsDataManagerState) value, new NearbyTripsFetchStatus.InProgress(latLng))));
            FetchNearbyTripsUseCase fetchNearbyTripsUseCase = this.this$0.c;
            LatLng latLng2 = this.$requestLatLng;
            ChaloTransitMode chaloTransitMode = this.$transitMode;
            int i2 = this.$numOfSummaries;
            Integer num = this.$radius;
            NearbyTripsApiType nearbyTripsApiType = this.$shouldSyncRoutesToo ? NearbyTripsApiType.NEW_WITH_ROUTE_STATUS_UPDATE : NearbyTripsApiType.NEW;
            this.L$0 = coroutineScope2;
            this.label = 1;
            nearbyTripsDataManagerBase$fetchNearbyTrips$1 = this;
            Object objF = fetchNearbyTripsUseCase.f(latLng2, chaloTransitMode, i2, num, nearbyTripsApiType, nearbyTripsDataManagerBase$fetchNearbyTrips$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
            obj = objF;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
            nearbyTripsDataManagerBase$fetchNearbyTrips$1 = this;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        boolean zE = CoroutineScopeKt.e(coroutineScope);
        Unit unit = Unit.f17538a;
        if (zE) {
            nearbyTripsDataManagerBase$fetchNearbyTrips$1.this$0.d(nearbyTripsDataManagerBase$fetchNearbyTrips$1.$requestLatLng, nearbyTripsDataManagerBase$fetchNearbyTrips$1.$numOfSummaries, nearbyTripsDataManagerBase$fetchNearbyTrips$1.$transitMode, chaloUseCaseResult);
            return unit;
        }
        MutableStateFlow mutableStateFlow2 = nearbyTripsDataManagerBase$fetchNearbyTrips$1.this$0.h;
        LatLng latLng3 = nearbyTripsDataManagerBase$fetchNearbyTrips$1.$requestLatLng;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.c(value2, NearbyTripsDataManagerState.a((NearbyTripsDataManagerState) value2, new NearbyTripsFetchStatus.Error.Interrupted(latLng3))));
        return unit;
    }
}
