package app.chalo.busesaroundyou;

import app.chalo.analytics.contract.AnalyticsContract;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.busesaroundyou.BusesAroundYouComponent$sendMarkerShownEvent$1", f = "BusesAroundYouComponent.kt", l = {660}, m = "invokeSuspend", v = 1)
final class BusesAroundYouComponent$sendMarkerShownEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BusesAroundYouComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusesAroundYouComponent$sendMarkerShownEvent$1(BusesAroundYouComponent busesAroundYouComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = busesAroundYouComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusesAroundYouComponent$sendMarkerShownEvent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BusesAroundYouComponent$sendMarkerShownEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.label = 1;
            if (DelayKt.b(10000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (((BusesAroundYouDataState) this.this$0.f.getValue()).c.f3616a.isEmpty()) {
            BusesAroundYouComponent busesAroundYouComponent = this.this$0;
            AnalyticsContract analyticsContract = busesAroundYouComponent.m;
            int iN = busesAroundYouComponent.C.N(busesAroundYouComponent.z.j());
            StringBuilder sb = new StringBuilder();
            sb.append(iN);
            AnalyticsContract.DefaultImpls.a(analyticsContract, "home screen no live vehicles loaded", "", MapsKt.i(new Pair("hourOfEvent", sb.toString()), new Pair("geoSpatialSrc", "chalo")), null, false, 24);
        } else {
            BusesAroundYouComponent busesAroundYouComponent2 = this.this$0;
            AnalyticsContract analyticsContract2 = busesAroundYouComponent2.m;
            Pair pair = new Pair("totalMarkers", String.valueOf(((BusesAroundYouDataState) busesAroundYouComponent2.f.getValue()).c.f3616a.size()));
            BusesAroundYouComponent busesAroundYouComponent3 = this.this$0;
            Pair pair2 = new Pair("hourOfEvent", new Integer(busesAroundYouComponent3.C.N(busesAroundYouComponent3.z.j())));
            long j = ((BusesAroundYouDataState) this.this$0.f.getValue()).j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j);
            AnalyticsContract.DefaultImpls.a(analyticsContract2, "home screen live vehicles shown on map", "", MapsKt.i(pair, pair2, new Pair("firstLoadTimeMillis", sb2.toString()), new Pair("geoSpatialSrc", "chalo")), null, false, 24);
        }
        return Unit.f17538a;
    }
}
