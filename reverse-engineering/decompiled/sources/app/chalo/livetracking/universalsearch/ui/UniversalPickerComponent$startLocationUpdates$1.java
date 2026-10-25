package app.chalo.livetracking.universalsearch.ui;

import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LocationUpdateResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$startLocationUpdates$1", f = "UniversalPickerComponent.kt", l = {1466}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$startLocationUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$startLocationUpdates$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$startLocationUpdates$1$1", f = "UniversalPickerComponent.kt", l = {1475, 1477}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UniversalPickerComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UniversalPickerComponent universalPickerComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = universalPickerComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
                app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r5 = r4.this$0
                app.chalo.location.ChaloLocationManager r5 = r5.w
                r4.label = r3
                java.lang.Object r5 = r5.d()
                if (r5 != r0) goto L2c
                goto L41
            L2c:
                kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
                kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.m(r5)
                app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$startLocationUpdates$1$1$1 r1 = new app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$startLocationUpdates$1$1$1
                app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r3 = r4.this$0
                r1.<init>()
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r5 = kotlin.Unit.f17538a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$startLocationUpdates$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$startLocationUpdates$1(UniversalPickerComponent universalPickerComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UniversalPickerComponent$startLocationUpdates$1 universalPickerComponent$startLocationUpdates$1 = new UniversalPickerComponent$startLocationUpdates$1(this.this$0, continuation);
        universalPickerComponent$startLocationUpdates$1.L$0 = obj;
        return universalPickerComponent$startLocationUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$startLocationUpdates$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ChaloLocationManager chaloLocationManager = this.this$0.w;
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objA = chaloLocationManager.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        LocationUpdateResult locationUpdateResult = (LocationUpdateResult) obj;
        boolean z = locationUpdateResult instanceof LocationUpdateResult.LocationReceived;
        Unit unit = Unit.f17538a;
        if (z) {
            UniversalPickerComponent.G0(this.this$0, ((LocationUpdateResult.LocationReceived) locationUpdateResult).f5154a);
            return unit;
        }
        Job job = this.this$0.F;
        if (job != null && ((AbstractCoroutine) job).isActive()) {
            return unit;
        }
        UniversalPickerComponent universalPickerComponent = this.this$0;
        universalPickerComponent.F = BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(universalPickerComponent, null), 3);
        return unit;
    }
}
