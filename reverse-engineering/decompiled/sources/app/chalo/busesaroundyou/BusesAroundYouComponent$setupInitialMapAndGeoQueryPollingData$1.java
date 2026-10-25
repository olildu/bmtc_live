package app.chalo.busesaroundyou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.busesaroundyou.BusesAroundYouComponent$setupInitialMapAndGeoQueryPollingData$1", f = "BusesAroundYouComponent.kt", l = {289, 295}, m = "invokeSuspend", v = 1)
final class BusesAroundYouComponent$setupInitialMapAndGeoQueryPollingData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BusesAroundYouComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusesAroundYouComponent$setupInitialMapAndGeoQueryPollingData$1(BusesAroundYouComponent busesAroundYouComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = busesAroundYouComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusesAroundYouComponent$setupInitialMapAndGeoQueryPollingData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BusesAroundYouComponent$setupInitialMapAndGeoQueryPollingData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (app.chalo.busesaroundyou.BusesAroundYouComponent.G0(r6, r5) == r0) goto L15;
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
            goto L45
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
            app.chalo.busesaroundyou.BusesAroundYouComponent r6 = r5.this$0
            app.chalo.geoquery.domain.GetGeoQueryCityWiseConfigUseCase r6 = r6.w
            r5.label = r3
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L2c
            goto L44
        L2c:
            app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel r6 = (app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel) r6
            app.chalo.busesaroundyou.BusesAroundYouComponent r1 = r5.this$0
            g r3 = new g
            r4 = 26
            r3.<init>(r6, r4)
            r1.E0(r3)
            app.chalo.busesaroundyou.BusesAroundYouComponent r6 = r5.this$0
            r5.label = r2
            java.lang.Object r6 = app.chalo.busesaroundyou.BusesAroundYouComponent.G0(r6, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.busesaroundyou.BusesAroundYouComponent$setupInitialMapAndGeoQueryPollingData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
