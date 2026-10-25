package app.chalo.home.nearbytrips.ui.mapscreen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1", f = "NearbyStopsMapComponent.kt", l = {635, 637}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NearbyStopsMapComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NearbyStopsMapComponent f3142a;

        public AnonymousClass1(NearbyStopsMapComponent nearbyStopsMapComponent) {
            this.f3142a = nearbyStopsMapComponent;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
        
            if (r9.collect(r10, r0) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
        
            if (r10 == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
        
            return r1;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(app.chalo.location.LocationUpdateResult r9, kotlin.coroutines.Continuation r10) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1.AnonymousClass1.emit(app.chalo.location.LocationUpdateResult, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1(NearbyStopsMapComponent nearbyStopsMapComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyStopsMapComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L42
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent r5 = r4.this$0
            app.chalo.location.ChaloLocationManager r5 = r5.k
            r4.label = r3
            java.lang.Object r5 = r5.d()
            if (r5 != r0) goto L2c
            goto L41
        L2c:
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.m(r5)
            app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1$1 r1 = new app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1$1
            app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent r3 = r4.this$0
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$checkLocationStatusAndMoveToCurrentPositionIfPossible$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
