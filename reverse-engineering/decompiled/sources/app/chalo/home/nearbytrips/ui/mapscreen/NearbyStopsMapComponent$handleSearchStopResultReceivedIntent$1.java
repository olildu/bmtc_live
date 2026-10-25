package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.utils.GeometryUtils;
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
@DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$handleSearchStopResultReceivedIntent$1", f = "NearbyStopsMapComponent.kt", l = {393, 395}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapComponent$handleSearchStopResultReceivedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NearbyStopsMapIntent.SearchStopResultReceivedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ NearbyStopsMapComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapComponent$handleSearchStopResultReceivedIntent$1(NearbyStopsMapIntent.SearchStopResultReceivedIntent searchStopResultReceivedIntent, NearbyStopsMapComponent nearbyStopsMapComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = searchStopResultReceivedIntent;
        this.this$0 = nearbyStopsMapComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyStopsMapComponent$handleSearchStopResultReceivedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopsMapComponent$handleSearchStopResultReceivedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                KotlinToastManager kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        StopAppModel stopAppModel = this.$intent.f3158a;
        ChaloLocationManager chaloLocationManager = this.this$0.k;
        this.label = 2;
        obj = chaloLocationManager.a(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        Double d = latLngA != null ? new Double(GeometryUtils.c(latLngA, this.$intent.f3158a.c)) : null;
        ChaloNavigationManager chaloNavigationManager = this.this$0.t;
        String str = this.$intent.f3158a.f1727a;
        Source source = Source.NEARBY_STOPS_MAP_FRAGMENT;
        String sourceName = source.getSourceName();
        StopAppModel stopAppModel2 = this.$intent.f3158a;
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new StopTripDetailsArgs(str, stopAppModel2.b, stopAppModel2.c, stopAppModel2.d, source, d, null, null, sourceName), null, null, 6));
        return Unit.f17538a;
    }
}
