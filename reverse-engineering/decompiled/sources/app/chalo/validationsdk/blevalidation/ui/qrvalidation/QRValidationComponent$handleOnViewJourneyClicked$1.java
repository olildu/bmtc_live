package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleOnViewJourneyClicked$1", f = "QRValidationComponent.kt", l = {595, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 597, 624, 634, 665}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleOnViewJourneyClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleOnViewJourneyClicked$1(QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleOnViewJourneyClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleOnViewJourneyClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0055 A[PHI: r0 r1 r2 r3 r4 r6 r7
      0x0055: PHI (r0v13 app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode) = 
      (r0v7 app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode)
      (r0v17 app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode)
     binds: [B:30:0x00c2, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r1v8 java.lang.String) = (r1v5 java.lang.String), (r1v12 java.lang.String) binds: [B:30:0x00c2, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v7 java.lang.String) binds: [B:30:0x00c2, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r3v1 app.chalo.location.LatLng) = (r3v0 app.chalo.location.LatLng), (r3v4 app.chalo.location.LatLng) binds: [B:30:0x00c2, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r4v1 app.chalo.location.LatLng) = (r4v0 app.chalo.location.LatLng), (r4v4 app.chalo.location.LatLng) binds: [B:30:0x00c2, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r6v1 app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase) = 
      (r6v0 app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase)
      (r6v4 app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase)
     binds: [B:30:0x00c2, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r7v3 java.lang.Object) = (r7v2 java.lang.Object), (r7v6 java.lang.Object) binds: [B:30:0x00c2, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec A[PHI: r0 r5
      0x00ec: PHI (r0v18 java.lang.Object) = (r0v15 java.lang.Object), (r0v37 java.lang.Object) binds: [B:33:0x00e8, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r5v3 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleOnViewJourneyClicked$1) = 
      (r5v2 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleOnViewJourneyClicked$1)
      (r5v0 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleOnViewJourneyClicked$1)
     binds: [B:33:0x00e8, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:39:0x0122  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:48:0x014c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    /* JADX WARN: Code duplicated, block: B:59:0x0171  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da  */
    /* JADX WARN: Code duplicated, block: B:86:0x0221  */
    /* JADX WARN: Code duplicated, block: B:89:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[LOOP:0: B:49:0x0150->B:90:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[LOOP:1: B:60:0x0175->B:93:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r0 == r13) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019f, code lost:
    
        if (r0 == r13) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c1, code lost:
    
        if (r1 == r13) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0218, code lost:
    
        if (r1 == r13) goto L83;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleOnViewJourneyClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
