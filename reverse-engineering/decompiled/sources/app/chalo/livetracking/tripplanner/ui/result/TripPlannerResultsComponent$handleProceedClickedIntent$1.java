package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.location.LatLng;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import com.google.firebase.messaging.ServiceStarter;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleProceedClickedIntent$1", f = "TripPlannerResultsComponent.kt", l = {448, 455, 470, 481, 489, 484, ServiceStarter.ERROR_UNKNOWN, 509, 512}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleProceedClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.ProceedClickedIntent $intent;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleProceedClickedIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/location/LatLng;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleProceedClickedIntent$1$1", f = "TripPlannerResultsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LatLng>, Object> {
        final /* synthetic */ UniversalSearchDescriptiveLocationAppModel $fromSearch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, Continuation continuation) {
            super(2, continuation);
            this.$fromSearch = universalSearchDescriptiveLocationAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$fromSearch, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return this.$fromSearch.e;
        }
    }

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleProceedClickedIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/location/LatLng;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleProceedClickedIntent$1$2", f = "TripPlannerResultsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LatLng>, Object> {
        final /* synthetic */ UniversalSearchDescriptiveLocationAppModel $toSearch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, Continuation continuation) {
            super(2, continuation);
            this.$toSearch = universalSearchDescriptiveLocationAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$toSearch, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return this.$toSearch.e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleProceedClickedIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, TripPlannerResultIntent.ProceedClickedIntent proceedClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$intent = proceedClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TripPlannerResultsComponent$handleProceedClickedIntent$1 tripPlannerResultsComponent$handleProceedClickedIntent$1 = new TripPlannerResultsComponent$handleProceedClickedIntent$1(this.this$0, this.$intent, continuation);
        tripPlannerResultsComponent$handleProceedClickedIntent$1.L$0 = obj;
        return tripPlannerResultsComponent$handleProceedClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleProceedClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x012d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0143  */
    /* JADX WARN: Code duplicated, block: B:32:0x014c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0177  */
    /* JADX WARN: Code duplicated, block: B:39:0x0196  */
    /* JADX WARN: Code duplicated, block: B:40:0x019c  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x020d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0231  */
    /* JADX WARN: Code duplicated, block: B:59:0x0237  */
    /* JADX WARN: Code duplicated, block: B:62:0x0255  */
    /* JADX WARN: Code duplicated, block: B:65:0x0259 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x025a  */
    /* JADX WARN: Code duplicated, block: B:68:0x025e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0286  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0273, code lost:
    
        if (r0 == r13) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x029c, code lost:
    
        if (r1 == r13) goto L77;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleProceedClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
