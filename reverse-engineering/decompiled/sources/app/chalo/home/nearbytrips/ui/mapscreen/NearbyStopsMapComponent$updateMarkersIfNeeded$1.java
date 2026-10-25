package app.chalo.home.nearbytrips.ui.mapscreen;

import defpackage.ej0;
import java.util.ArrayList;
import java.util.Iterator;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$updateMarkersIfNeeded$1", f = "NearbyStopsMapComponent.kt", l = {813}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapComponent$updateMarkersIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Float $currentMapZoom;
    final /* synthetic */ String $currentlySelectedStopId;
    Object L$0;
    int label;
    final /* synthetic */ NearbyStopsMapComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapComponent$updateMarkersIfNeeded$1(NearbyStopsMapComponent nearbyStopsMapComponent, String str, Float f, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyStopsMapComponent;
        this.$currentlySelectedStopId = str;
        this.$currentMapZoom = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyStopsMapComponent$updateMarkersIfNeeded$1(this.this$0, this.$currentlySelectedStopId, this.$currentMapZoom, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopsMapComponent$updateMarkersIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NearbyStopsMapComponent$updateMarkersIfNeeded$1 nearbyStopsMapComponent$updateMarkersIfNeeded$1;
        NearbyStopsDataInfo nearbyStopsDataInfo;
        List list;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            NearbyStopsDataInfo nearbyStopsDataInfo2 = ((NearbyStopsMapState) this.this$0.f.getValue()).e;
            if (nearbyStopsDataInfo2 == null || (list2 = nearbyStopsDataInfo2.b) == null) {
                nearbyStopsMapComponent$updateMarkersIfNeeded$1 = this;
                nearbyStopsDataInfo = nearbyStopsDataInfo2;
                list = null;
            } else {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NearbyStopsDataAndMarkerHolder) it.next()).f3139a);
                }
                NearbyStopsMapComponent nearbyStopsMapComponent = this.this$0;
                List list4 = nearbyStopsDataInfo2.b;
                String str = this.$currentlySelectedStopId;
                Float f = this.$currentMapZoom;
                float fFloatValue = f != null ? f.floatValue() : 12.0f;
                this.L$0 = nearbyStopsDataInfo2;
                this.label = 1;
                nearbyStopsMapComponent$updateMarkersIfNeeded$1 = this;
                Object objK0 = nearbyStopsMapComponent.K0(arrayList, list4, str, fFloatValue, nearbyStopsMapComponent$updateMarkersIfNeeded$1);
                if (objK0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                nearbyStopsDataInfo = nearbyStopsDataInfo2;
                obj = objK0;
            }
            nearbyStopsMapComponent$updateMarkersIfNeeded$1.this$0.E0(new ej0(12, nearbyStopsDataInfo, list));
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nearbyStopsDataInfo = (NearbyStopsDataInfo) this.L$0;
        ResultKt.b(obj);
        nearbyStopsMapComponent$updateMarkersIfNeeded$1 = this;
        list = (List) obj;
        nearbyStopsMapComponent$updateMarkersIfNeeded$1.this$0.E0(new ej0(12, nearbyStopsDataInfo, list));
        return Unit.f17538a;
    }
}
