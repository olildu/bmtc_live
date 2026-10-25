package app.chalo.location;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import defpackage.ti;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/location/LatLng;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2", f = "ChaloLocationDelegate.android.kt", l = {143}, m = "invokeSuspend", v = 1)
final class ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2 extends SuspendLambda implements Function2<ProducerScope<? super LatLng>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChaloLocationDelegateAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2(ChaloLocationDelegateAndroid chaloLocationDelegateAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloLocationDelegateAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2 chaloLocationDelegateAndroid$getLocationUpdatesFlow$2 = new ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2(this.this$0, continuation);
        chaloLocationDelegateAndroid$getLocationUpdatesFlow$2.L$0 = obj;
        return chaloLocationDelegateAndroid$getLocationUpdatesFlow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            LocationCallback locationCallback = new LocationCallback() { // from class: app.chalo.location.ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2$callback$1
                @Override // com.google.android.gms.location.LocationCallback
                public final void onLocationResult(LocationResult result) {
                    Intrinsics.i(result, "result");
                    List<Location> locations = result.getLocations();
                    Intrinsics.h(locations, "getLocations(...)");
                    Location location = (Location) CollectionsKt.Q(locations);
                    ProducerScope producerScope2 = producerScope;
                    if (location == null) {
                        producerScope2.mo7576trySendJP2dKIU(null);
                    } else {
                        producerScope2.mo7576trySendJP2dKIU(new LatLng(location.getLatitude(), location.getLongitude()));
                    }
                }
            };
            ((FusedLocationProviderClient) this.this$0.c.getValue()).requestLocationUpdates((LocationRequest) this.this$0.d.getValue(), locationCallback, Looper.getMainLooper());
            ti tiVar = new ti(5, this.this$0, locationCallback);
            this.label = 1;
            if (ProduceKt.a(producerScope, tiVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
