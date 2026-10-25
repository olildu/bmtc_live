package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.contract.ProductConfigFetchHelperContract;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
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
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleInitializationIntent$1$1", f = "TripPlannerResultsComponent.kt", l = {234, 245, 247, 250, 254, 257, 261, 262, 264, 275, 278, 279}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleInitializationIntent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerResultIntent.InitializationIntent $intent;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleInitializationIntent$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleInitializationIntent$1$1$1", f = "TripPlannerResultsComponent.kt", l = {229}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ TripPlannerResultsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TripPlannerResultsComponent tripPlannerResultsComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tripPlannerResultsComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                CityAppModel cityAppModel = (CityAppModel) this.this$0.s.getE().getValue();
                if (cityAppModel != null && cityAppModel.u) {
                    ProductConfigFetchHelperContract productConfigFetchHelperContract = this.this$0.I;
                    this.label = 1;
                    if (productConfigFetchHelperContract.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleInitializationIntent$1$1(TripPlannerResultsComponent tripPlannerResultsComponent, TripPlannerResultIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TripPlannerResultsComponent$handleInitializationIntent$1$1 tripPlannerResultsComponent$handleInitializationIntent$1$1 = new TripPlannerResultsComponent$handleInitializationIntent$1$1(this.this$0, this.$intent, continuation);
        tripPlannerResultsComponent$handleInitializationIntent$1$1.L$0 = obj;
        return tripPlannerResultsComponent$handleInitializationIntent$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleInitializationIntent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0348  */
    /* JADX WARN: Code duplicated, block: B:108:0x0370  */
    /* JADX WARN: Code duplicated, block: B:111:0x0399  */
    /* JADX WARN: Code duplicated, block: B:112:0x039c  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:116:0x03af  */
    /* JADX WARN: Code duplicated, block: B:119:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x03db  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:134:0x0402  */
    /* JADX WARN: Code duplicated, block: B:137:0x0412  */
    /* JADX WARN: Code duplicated, block: B:140:0x041d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0477  */
    /* JADX WARN: Code duplicated, block: B:14:0x00bd A[PHI: r2 r4 r5
      0x00bd: PHI (r2v38 long) = (r2v36 long), (r2v41 long) binds: [B:48:0x01ca, B:13:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r4v15 java.util.List) = (r4v12 java.util.List), (r4v17 java.util.List) binds: [B:48:0x01ca, B:13:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r5v7 java.lang.Object) = (r5v6 java.lang.Object), (r5v11 java.lang.Object) binds: [B:48:0x01ca, B:13:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0150 A[PHI: r2 r4 r13
      0x0150: PHI (r2v12 java.lang.Object) = (r2v10 java.lang.Object), (r2v22 java.lang.Object) binds: [B:25:0x014c, B:19:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r4v4 app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent) = 
      (r4v3 app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent)
      (r4v6 app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent)
     binds: [B:25:0x014c, B:19:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r13v1 long) = (r13v0 long), (r13v2 long) binds: [B:25:0x014c, B:19:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0162  */
    /* JADX WARN: Code duplicated, block: B:33:0x0172 A[PHI: r2 r13
      0x0172: PHI (r2v23 java.lang.Object) = (r2v19 java.lang.Object), (r2v27 java.lang.Object) binds: [B:31:0x016e, B:18:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r13v3 long) = (r13v1 long), (r13v4 long) binds: [B:31:0x016e, B:18:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0180 A[PHI: r2 r13
      0x0180: PHI (r2v28 java.lang.Object) = (r2v25 java.lang.Object), (r2v33 java.lang.Object) binds: [B:34:0x017c, B:17:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r13v5 long) = (r13v3 long), (r13v6 long) binds: [B:34:0x017c, B:17:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0189  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bb A[PHI: r2 r4
      0x01bb: PHI (r2v36 long) = (r2v34 long), (r2v34 long), (r2v37 long) binds: [B:43:0x01a3, B:45:0x01b7, B:15:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r4v12 java.util.List) = (r4v9 java.util.List), (r4v9 java.util.List), (r4v14 java.util.List) binds: [B:43:0x01a3, B:45:0x01b7, B:15:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x020b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:63:0x0246  */
    /* JADX WARN: Code duplicated, block: B:64:0x024b  */
    /* JADX WARN: Code duplicated, block: B:70:0x027d  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f3  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019a, code lost:
    
        if (app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent.I0(r5, r3, r15, r38) == r1) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleInitializationIntent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
