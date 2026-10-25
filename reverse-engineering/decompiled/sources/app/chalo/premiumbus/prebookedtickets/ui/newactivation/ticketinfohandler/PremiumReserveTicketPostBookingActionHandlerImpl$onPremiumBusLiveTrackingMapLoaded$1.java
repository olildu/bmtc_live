package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.compose.components.chalomap.ChaloMapLatLngBoundsDetails;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.PlatformFeature;
import defpackage.vw0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl$onPremiumBusLiveTrackingMapLoaded$1", f = "PremiumReserveTicketPostBookingActionHandlerImpl.kt", l = {1337}, m = "invokeSuspend", v = 1)
final class PremiumReserveTicketPostBookingActionHandlerImpl$onPremiumBusLiveTrackingMapLoaded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PremiumReserveTicketPostBookingActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumReserveTicketPostBookingActionHandlerImpl$onPremiumBusLiveTrackingMapLoaded$1(PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumReserveTicketPostBookingActionHandlerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumReserveTicketPostBookingActionHandlerImpl$onPremiumBusLiveTrackingMapLoaded$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumReserveTicketPostBookingActionHandlerImpl$onPremiumBusLiveTrackingMapLoaded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumReserveTicketPostBookingActionHandlerImpl premiumReserveTicketPostBookingActionHandlerImpl = this.this$0;
            List list2 = premiumReserveTicketPostBookingActionHandlerImpl.Z;
            ChaloLocationManager chaloLocationManager = premiumReserveTicketPostBookingActionHandlerImpl.p;
            this.L$0 = list2;
            this.label = 1;
            obj = chaloLocationManager.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            ResultKt.b(obj);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        List list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayListE0 = CollectionsKt.E0(list3);
            if (latLngA != null) {
                LatLng latLng = CityProviderKt.a(this.this$0.q, latLngA) ? latLngA : null;
                if (latLng != null) {
                    arrayListE0.add(latLng);
                }
            }
            LatLngBounds latLngBoundsA = this.this$0.z.a(arrayListE0);
            float f = PlatformFeature.f10436a;
            this.this$0.f0(new vw0(new MapCameraViewState.UpdatedState.BoundToCustomLatLngs(new ChaloMapLatLngBoundsDetails(latLngBoundsA, 200)), 0));
        }
        return Unit.f17538a;
    }
}
