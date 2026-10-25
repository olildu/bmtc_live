package app.chalo.busesaroundyou;

import app.chalo.location.LatLng;
import defpackage.ud;
import java.util.List;
import java.util.Map;
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
@DebugMetadata(c = "app.chalo.busesaroundyou.BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3", f = "BusesAroundYouComponent.kt", l = {322, 330}, m = "invokeSuspend", v = 1)
final class BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LatLng $latLng;
    int label;
    final /* synthetic */ BusesAroundYouComponent this$0;

    /* JADX INFO: renamed from: app.chalo.busesaroundyou.BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BusesAroundYouComponent f1174a;

        public AnonymousClass1(BusesAroundYouComponent busesAroundYouComponent) {
            this.f1174a = busesAroundYouComponent;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List list, Continuation continuation) {
            BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1 busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1;
            if (continuation instanceof BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1) {
                busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1 = (BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1) continuation;
                int i = busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1 = new BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1(this, continuation);
                }
            } else {
                busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1 = new BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1(this, continuation);
            }
            Object objF0 = busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1.label;
            BusesAroundYouComponent busesAroundYouComponent = this.f1174a;
            if (i2 == 0) {
                ResultKt.b(objF0);
                List list2 = ((BusesAroundYouDataState) busesAroundYouComponent.f.getValue()).c.f3616a;
                Map map = ((BusesAroundYouDataState) busesAroundYouComponent.f.getValue()).c.b;
                busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1.label = 1;
                objF0 = BusesAroundYouComponent.F0(busesAroundYouComponent, list2, list, map, busesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1$emit$1);
                if (objF0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objF0);
            }
            busesAroundYouComponent.E0(new ud((List) objF0, 0));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3(BusesAroundYouComponent busesAroundYouComponent, LatLng latLng, Continuation continuation) {
        super(2, continuation);
        this.this$0 = busesAroundYouComponent;
        this.$latLng = latLng;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3(this.this$0, this.$latLng, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L15;
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
            goto L5c
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L38
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.busesaroundyou.BusesAroundYouComponent r6 = r5.this$0
            app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager r1 = r6.r
            app.chalo.location.LatLng r4 = r5.$latLng
            kotlinx.coroutines.flow.StateFlow r6 = r6.f
            java.lang.Object r6 = r6.getValue()
            app.chalo.busesaroundyou.BusesAroundYouDataState r6 = (app.chalo.busesaroundyou.BusesAroundYouDataState) r6
            boolean r6 = r6.e
            r5.label = r3
            java.lang.Object r6 = r1.b(r4, r6, r5)
            if (r6 != r0) goto L38
            goto L5b
        L38:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            app.chalo.location.LatLng r1 = r5.$latLng
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 r6 = app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManagerKt.a(r6, r1)
            app.chalo.busesaroundyou.BusesAroundYouComponent r1 = r5.this$0
            app.chalo.providers.CoroutineContextProvider r1 = r1.s
            kotlinx.coroutines.scheduling.DefaultScheduler r1 = r1.getDefault()
            kotlinx.coroutines.flow.Flow r6 = kotlinx.coroutines.flow.FlowKt.z(r6, r1)
            app.chalo.busesaroundyou.BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1 r1 = new app.chalo.busesaroundyou.BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3$1
            app.chalo.busesaroundyou.BusesAroundYouComponent r3 = r5.this$0
            r1.<init>(r3)
            r5.label = r2
            java.lang.Object r6 = r6.collect(r1, r5)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.busesaroundyou.BusesAroundYouComponent$updateExistingMarkersForUpdatedLocation$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
