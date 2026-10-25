package app.chalo.home.ui.regularbus;

import app.chalo.location.LocationUpdateResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3", f = "RegularBusComponent.kt", l = {1418, 1421}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$startRequiredCollections$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/location/LocationUpdateResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3$1", f = "RegularBusComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<LocationUpdateResult, Continuation<? super Boolean>, Object> {
        int label;
        final /* synthetic */ RegularBusComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RegularBusComponent regularBusComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = regularBusComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((LocationUpdateResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Boolean.valueOf(this.this$0.s.p());
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RegularBusComponent f3628a;

        public AnonymousClass2(RegularBusComponent regularBusComponent) {
            this.f3628a = regularBusComponent;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007a  */
        /* JADX WARN: Code duplicated, block: B:24:0x007f  */
        /* JADX WARN: Code duplicated, block: B:28:0x008f  */
        /* JADX WARN: Code duplicated, block: B:31:0x009b  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:48:0x00ef A[PHI: r10 r11
          0x00ef: PHI (r10v12 app.chalo.location.LatLng) = (r10v9 app.chalo.location.LatLng), (r10v14 app.chalo.location.LatLng) binds: [B:46:0x00eb, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]
          0x00ef: PHI (r11v45 java.lang.Object) = (r11v35 java.lang.Object), (r11v1 java.lang.Object) binds: [B:46:0x00eb, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:54:0x0121  */
        /* JADX WARN: Code duplicated, block: B:56:0x0125  */
        /* JADX WARN: Code duplicated, block: B:57:0x0132  */
        /* JADX WARN: Code duplicated, block: B:59:0x013a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0158  */
        /* JADX WARN: Code duplicated, block: B:67:0x0160  */
        /* JADX WARN: Code duplicated, block: B:69:0x0168  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:81:0x0191  */
        /* JADX WARN: Code duplicated, block: B:82:0x019a A[DONT_INVERT, PHI: r10
          0x019a: PHI (r10v17 app.chalo.location.LatLng) = 
          (r10v5 app.chalo.location.LatLng)
          (r10v5 app.chalo.location.LatLng)
          (r10v5 app.chalo.location.LatLng)
          (r10v5 app.chalo.location.LatLng)
          (r10v5 app.chalo.location.LatLng)
          (r10v12 app.chalo.location.LatLng)
          (r10v16 app.chalo.location.LatLng)
          (r10v19 app.chalo.location.LatLng)
          (r10v19 app.chalo.location.LatLng)
         binds: [B:66:0x015e, B:81:0x0191, B:77:0x017f, B:78:0x0181, B:56:0x0125, B:52:0x011d, B:14:0x003b, B:63:0x014e, B:64:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:83:0x019c  */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
        
            if (r11 == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
        
            if (app.chalo.home.ui.regularbus.RegularBusComponent.P0(r5, r10, r0) == r1) goto L85;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(app.chalo.location.LocationUpdateResult r10, kotlin.coroutines.Continuation r11) {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3.AnonymousClass2.emit(app.chalo.location.LocationUpdateResult, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$startRequiredCollections$3(RegularBusComponent regularBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$startRequiredCollections$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$startRequiredCollections$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r3.collect(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L4f
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.home.ui.regularbus.RegularBusComponent r6 = r5.this$0
            app.chalo.location.ChaloLocationManager r6 = r6.A
            r5.label = r3
            java.lang.Object r6 = r6.d()
            if (r6 != r0) goto L2c
            goto L4e
        L2c:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.m(r6)
            app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3$1 r1 = new app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3$1
            app.chalo.home.ui.regularbus.RegularBusComponent r3 = r5.this$0
            r4 = 0
            r1.<init>(r3, r4)
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 r3 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1
            r3.<init>(r6, r1)
            app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3$2 r6 = new app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3$2
            app.chalo.home.ui.regularbus.RegularBusComponent r1 = r5.this$0
            r6.<init>(r1)
            r5.label = r2
            java.lang.Object r6 = r3.collect(r6, r5)
            if (r6 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
