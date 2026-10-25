package app.chalo.routeselection.ui;

import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import defpackage.l11;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {232, 233}, m = "invokeSuspend", v = 1)
final class StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

    /* JADX INFO: renamed from: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "recentTripList", "", "Lapp/chalo/recent/model/app/RecentStopBasedTripAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4$1", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends RecentStopBasedTripAppModel>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (Continuation) obj2);
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
            this.this$0.E0(new l11((List) this.L$0, 10));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.j((kotlinx.coroutines.flow.Flow) r6, r1, r5) == r0) goto L18;
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
            goto L50
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L3d
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r6 = r5.this$0
            app.chalo.recent.database.repository.recent.RecentRepositoryProvider r6 = r6.r
            app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository r6 = r6.getC()
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r1 = r5.this$0
            app.chalo.providers.cityprovider.CityProvider r1 = r1.q
            java.lang.String r1 = app.chalo.providers.cityprovider.CityProviderKt.b(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = ""
        L33:
            r5.label = r3
            r3 = 5
            java.lang.Object r6 = r6.d(r1, r3, r5)
            if (r6 != r0) goto L3d
            goto L4f
        L3d:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4$1 r1 = new app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4$1
            app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent r3 = r5.this$0
            r4 = 0
            r1.<init>(r3, r4)
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.j(r6, r1, r5)
            if (r6 != r0) goto L50
        L4f:
            return r0
        L50:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleViewCreatedIntent$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
