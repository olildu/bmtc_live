package app.chalo.home.ui.regularbus;

import app.chalo.citydata.domain.IsDynamicCityDataFetchEnabledUseCase;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$resetNearbyTripCard$1", f = "RegularBusComponent.kt", l = {1583, 1590, 1584}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$resetNearbyTripCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldForceFetch;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$resetNearbyTripCard$1(RegularBusComponent regularBusComponent, Continuation continuation, boolean z) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
        this.$shouldForceFetch = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$resetNearbyTripCard$1(this.this$0, continuation, this.$shouldForceFetch);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$resetNearbyTripCard$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        LatLng latLng;
        NearbyTripsDataManagerBase nearbyTripsDataManagerBase;
        ChaloTransitMode chaloTransitMode;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            RegularBusComponent regularBusComponent = this.this$0;
            this.label = 1;
            obj = RegularBusComponent.H0(regularBusComponent, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            boolean z2 = this.Z$0;
            int i3 = this.I$0;
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) this.L$2;
            LatLng latLng2 = (LatLng) this.L$1;
            NearbyTripsDataManagerBase nearbyTripsDataManagerBase2 = (NearbyTripsDataManagerBase) this.L$0;
            ResultKt.b(obj);
            chaloTransitMode = chaloTransitMode2;
            nearbyTripsDataManagerBase = nearbyTripsDataManagerBase2;
            i = i3;
            latLng = latLng2;
            z = z2;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        return nearbyTripsDataManagerBase.b(latLng, i, chaloTransitMode, z, zBooleanValue, 1.0d, this) == coroutineSingletons ? coroutineSingletons : unit;
        LatLng latLng3 = (LatLng) obj;
        if (latLng3 != null) {
            RegularBusComponent regularBusComponent2 = this.this$0;
            NearbyTripsDataManagerBase nearbyTripsDataManagerBase3 = regularBusComponent2.l;
            ChaloTransitMode chaloTransitMode3 = ChaloTransitMode.BUS;
            z = this.$shouldForceFetch;
            IsDynamicCityDataFetchEnabledUseCase isDynamicCityDataFetchEnabledUseCase = regularBusComponent2.r;
            this.L$0 = nearbyTripsDataManagerBase3;
            this.L$1 = latLng3;
            this.L$2 = chaloTransitMode3;
            this.I$0 = 1;
            this.Z$0 = z;
            this.label = 2;
            isDynamicCityDataFetchEnabledUseCase.getClass();
            obj = Boolean.TRUE;
            if (obj != coroutineSingletons) {
                i = 1;
                latLng = latLng3;
                nearbyTripsDataManagerBase = nearbyTripsDataManagerBase3;
                chaloTransitMode = chaloTransitMode3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (nearbyTripsDataManagerBase.b(latLng, i, chaloTransitMode, z, zBooleanValue2, 1.0d, this) == coroutineSingletons) {
                }
            }
        }
    }
}
