package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerLiveVehicleResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1", f = "RouteDetailsComponent.kt", l = {2195, 2199, 2207}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$startFetchingLiveVehicleDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerLiveVehicleResult$Success;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$1", f = "RouteDetailsComponent.kt", l = {2208}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<LiveTrackingDataManagerLiveVehicleResult.Success, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RouteDetailsComponent this$0;

        /* JADX INFO: renamed from: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$1$1", f = "RouteDetailsComponent.kt", l = {2209}, m = "invokeSuspend", v = 1)
        final class C01251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LiveTrackingDataManagerLiveVehicleResult.Success $it;
            int label;
            final /* synthetic */ RouteDetailsComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01251(RouteDetailsComponent routeDetailsComponent, LiveTrackingDataManagerLiveVehicleResult.Success success, Continuation continuation) {
                super(2, continuation);
                this.this$0 = routeDetailsComponent;
                this.$it = success;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01251(this.this$0, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01251) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    RouteDetailsComponent routeDetailsComponent = this.this$0;
                    ArrayList arrayList = this.$it.f4206a;
                    this.label = 1;
                    if (RouteDetailsComponent.J0(routeDetailsComponent, arrayList, this) == coroutineSingletons) {
                        return coroutineSingletons;
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
        public AnonymousClass1(RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = routeDetailsComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((LiveTrackingDataManagerLiveVehicleResult.Success) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Job job;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                LiveTrackingDataManagerLiveVehicleResult.Success success = (LiveTrackingDataManagerLiveVehicleResult.Success) this.L$0;
                DefaultScheduler defaultScheduler = this.this$0.J.getDefault();
                C01251 c01251 = new C01251(this.this$0, success, null);
                this.label = 1;
                if (BuildersKt.g(defaultScheduler, c01251, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RouteDetailsComponent routeDetailsComponent = this.this$0;
            RouteAppModel routeAppModel = routeDetailsComponent.Y;
            if (routeAppModel != null && ((job = routeDetailsComponent.e0) == null || !((AbstractCoroutine) job).isActive())) {
                LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable = routeAppModel.o;
                if (!(liveSeatAvailabilityApplicable instanceof LiveSeatAvailabilityApplicable.No)) {
                    Intrinsics.g(liveSeatAvailabilityApplicable, "null cannot be cast to non-null type app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable.Yes");
                    routeDetailsComponent.e0 = BuildersKt.d(routeDetailsComponent.j, routeDetailsComponent.J.getDefault(), null, new RouteDetailsComponent$checkAndStartFetchingLiveSeatAvailability$1(((LiveSeatAvailabilityApplicable.Yes) liveSeatAvailabilityApplicable).c, routeAppModel, routeDetailsComponent, null), 2);
                }
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$startFetchingLiveVehicleDetails$1(RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$startFetchingLiveVehicleDetails$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$startFetchingLiveVehicleDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.j(r1, r9, r8) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.b(r9)
            goto L8b
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.ResultKt.b(r9)
            goto L56
        L21:
            java.lang.Object r1 = r8.L$0
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r1 = (app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel) r1
            kotlin.ResultKt.b(r9)
            goto L3d
        L29:
            kotlin.ResultKt.b(r9)
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r9 = r8.this$0
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r1 = r9.X
            app.chalo.contract.BasicInfoContract r9 = r9.l
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = r9.c(r8)
            if (r9 != r0) goto L3d
            goto L8a
        L3d:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            boolean r9 = app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModelKt.b(r1, r6)
            if (r9 == 0) goto L56
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r9 = r8.this$0
            r8.L$0 = r5
            r8.label = r3
            java.lang.Object r9 = app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.G0(r9, r8)
            if (r9 != r0) goto L56
            goto L8a
        L56:
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r9 = r8.this$0
            app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager r1 = r9.u
            app.chalo.citydata.data.model.app.RouteAppModel r3 = r9.Y
            if (r3 == 0) goto L62
            java.lang.String r3 = r3.b
            if (r3 != 0) goto L64
        L62:
            java.lang.String r3 = ""
        L64:
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r9 = r9.X
            if (r9 == 0) goto L6f
            app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures r9 = r9.h
            if (r9 == 0) goto L6f
            java.util.List r9 = r9.f
            goto L70
        L6f:
            r9 = r5
        L70:
            kotlinx.coroutines.flow.Flow r9 = r1.c(r3, r9)
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$invokeSuspend$$inlined$filterIsInstance$1 r1 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$invokeSuspend$$inlined$filterIsInstance$1
            r1.<init>()
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$1 r9 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1$1
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r3 = r8.this$0
            r9.<init>(r3, r5)
            r8.L$0 = r5
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.j(r1, r9, r8)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$startFetchingLiveVehicleDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
