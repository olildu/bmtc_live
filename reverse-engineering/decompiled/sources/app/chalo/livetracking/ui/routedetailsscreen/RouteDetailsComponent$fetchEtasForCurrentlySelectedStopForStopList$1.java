package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerStopEtaResult;
import app.chalo.utils.PlatformFeature;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1", f = "RouteDetailsComponent.kt", l = {1923, 1927, 1946}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteAppModel $routAppModel;
    final /* synthetic */ StopAppModel $stop;
    final /* synthetic */ String $stopId;
    Object L$0;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/livetracking/frameworklivetracking/LiveTrackingDataManagerStopEtaResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$1", f = "RouteDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super LiveTrackingDataManagerStopEtaResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ RouteAppModel $routAppModel;
        final /* synthetic */ StopAppModel $stop;
        final /* synthetic */ String $stopId;
        int label;
        final /* synthetic */ RouteDetailsComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RouteAppModel routeAppModel, StopAppModel stopAppModel, RouteDetailsComponent routeDetailsComponent, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = routeDetailsComponent;
            this.$routAppModel = routeAppModel;
            this.$stopId = str;
            this.$stop = stopAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            RouteDetailsComponent routeDetailsComponent = this.this$0;
            return new AnonymousClass1(this.$routAppModel, this.$stop, routeDetailsComponent, this.$stopId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            RouteDetailsComponent routeDetailsComponent = this.this$0;
            RouteAppModel routeAppModel = this.$routAppModel;
            String str = routeAppModel.b;
            String str2 = routeAppModel.c;
            String str3 = this.$stop.b;
            routeDetailsComponent.getClass();
            float f = PlatformFeature.f10436a;
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1(RouteAppModel routeAppModel, StopAppModel stopAppModel, RouteDetailsComponent routeDetailsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$stopId = str;
        this.$routAppModel = routeAppModel;
        this.$stop = stopAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1(this.$routAppModel, this.$stop, this.this$0, this.$stopId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r13.collect(r1, r12) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.b(r13)
            goto La4
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.ResultKt.b(r13)
            goto L56
        L21:
            java.lang.Object r1 = r12.L$0
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r1 = (app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel) r1
            kotlin.ResultKt.b(r13)
            goto L3d
        L29:
            kotlin.ResultKt.b(r13)
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r13 = r12.this$0
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r1 = r13.X
            app.chalo.contract.BasicInfoContract r13 = r13.l
            r12.L$0 = r1
            r12.label = r4
            java.lang.Object r13 = r13.c(r12)
            if (r13 != r0) goto L3d
            goto La3
        L3d:
            java.lang.Number r13 = (java.lang.Number) r13
            long r6 = r13.longValue()
            boolean r13 = app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModelKt.b(r1, r6)
            if (r13 == 0) goto L56
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r13 = r12.this$0
            r12.L$0 = r5
            r12.label = r3
            java.lang.Object r13 = app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent.F0(r13, r12)
            if (r13 != r0) goto L56
            goto La3
        L56:
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r13 = r12.this$0
            app.chalo.utils.SystemHelper r1 = r13.L
            long r3 = r1.j()
            r13.q0 = r3
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r13 = r12.this$0
            app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager r1 = r13.u
            java.lang.String r3 = r12.$stopId
            app.chalo.citydata.data.model.app.RouteAppModel r4 = r12.$routAppModel
            java.lang.String r4 = r4.b
            app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel r13 = r13.X
            if (r13 == 0) goto L75
            app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures r13 = r13.h
            if (r13 == 0) goto L75
            java.util.List r13 = r13.f
            goto L76
        L75:
            r13 = r5
        L76:
            kotlinx.coroutines.flow.Flow r13 = r1.f(r3, r4, r13)
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$1 r6 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$1
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r9 = r12.this$0
            app.chalo.citydata.data.model.app.RouteAppModel r7 = r12.$routAppModel
            java.lang.String r10 = r12.$stopId
            app.chalo.citydata.data.model.app.StopAppModel r8 = r12.$stop
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1
            r1.<init>(r13, r6)
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$invokeSuspend$$inlined$filterIsInstance$1 r13 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$invokeSuspend$$inlined$filterIsInstance$1
            r13.<init>()
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$2 r1 = new app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1$2
            app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent r3 = r12.this$0
            r1.<init>()
            r12.L$0 = r5
            r12.label = r2
            java.lang.Object r13 = r13.collect(r1, r12)
            if (r13 != r0) goto La4
        La3:
            return r0
        La4:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$fetchEtasForCurrentlySelectedStopForStopList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
