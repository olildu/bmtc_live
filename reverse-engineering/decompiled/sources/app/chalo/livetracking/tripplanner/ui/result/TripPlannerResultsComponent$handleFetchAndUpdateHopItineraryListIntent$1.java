package app.chalo.livetracking.tripplanner.ui.result;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1", f = "TripPlannerResultsComponent.kt", l = {TypedValues.Custom.TYPE_COLOR, TypedValues.Custom.TYPE_DIMENSION, 908, 919, 936}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1 tripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1 = new TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1(this.this$0, continuation);
        tripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1.L$0 = obj;
        return tripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x014d  */
    /* JADX WARN: Code duplicated, block: B:50:0x015c  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0173, code lost:
    
        if (r1 == r13) goto L54;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleFetchAndUpdateHopItineraryListIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
