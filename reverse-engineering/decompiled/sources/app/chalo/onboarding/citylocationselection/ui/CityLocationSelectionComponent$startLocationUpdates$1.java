package app.chalo.onboarding.citylocationselection.ui;

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
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1", f = "CityLocationSelectionComponent.kt", l = {839, 842}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$startLocationUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX INFO: renamed from: app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1$2", f = "CityLocationSelectionComponent.kt", l = {850, 852}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CityLocationSelectionComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CityLocationSelectionComponent cityLocationSelectionComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cityLocationSelectionComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
                app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent r5 = r4.this$0
                app.chalo.location.ChaloLocationManager r5 = r5.l
                r4.label = r3
                java.lang.Object r5 = r5.d()
                if (r5 != r0) goto L2c
                goto L41
            L2c:
                kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
                kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.m(r5)
                app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1$2$1 r1 = new app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1$2$1
                app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent r3 = r4.this$0
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
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$startLocationUpdates$1(CityLocationSelectionComponent cityLocationSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$startLocationUpdates$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$startLocationUpdates$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r7 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            kotlin.Unit r3 = kotlin.Unit.f17538a
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r7)
            goto L61
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.b(r7)
            goto L48
        L1e:
            kotlin.ResultKt.b(r7)
            app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent r7 = r6.this$0
            kotlinx.coroutines.Job r7 = r7.F
            if (r7 == 0) goto L30
            kotlinx.coroutines.AbstractCoroutine r7 = (kotlinx.coroutines.AbstractCoroutine) r7
            boolean r7 = r7.isActive()
            if (r7 != r4) goto L30
            goto L53
        L30:
            app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent r7 = r6.this$0
            app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource r7 = r7.s
            androidx.datastore.core.DataStore r7 = r7.b
            kotlinx.coroutines.flow.Flow r7 = r7.getData()
            app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1 r1 = new app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1
            r1.<init>(r7)
            r6.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.v(r1, r6)
            if (r7 != r0) goto L48
            goto L60
        L48:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L54
            int r7 = r7.length()
            if (r7 != 0) goto L53
            goto L54
        L53:
            return r3
        L54:
            app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent r7 = r6.this$0
            app.chalo.location.ChaloLocationManager r7 = r7.l
            r6.label = r2
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L61
        L60:
            return r0
        L61:
            app.chalo.location.LocationUpdateResult r7 = (app.chalo.location.LocationUpdateResult) r7
            app.chalo.models.LocationAppModel r7 = r7.a()
            r0 = 0
            if (r7 == 0) goto L6f
            app.chalo.location.LatLng r7 = r7.a()
            goto L70
        L6f:
            r7 = r0
        L70:
            r1 = 3
            if (r7 == 0) goto L80
            app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent r2 = r6.this$0
            kotlinx.coroutines.internal.ContextScope r4 = r2.j
            app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1 r5 = new app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1
            r5.<init>(r2, r7, r0)
            kotlinx.coroutines.BuildersKt.d(r4, r0, r0, r5, r1)
            return r3
        L80:
            app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent r7 = r6.this$0
            kotlinx.coroutines.internal.ContextScope r2 = r7.j
            app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1$2 r4 = new app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1$2
            r4.<init>(r7, r0)
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.d(r2, r0, r0, r4, r1)
            r7.F = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$startLocationUpdates$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
