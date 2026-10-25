package app.chalo.geoquery.domain;

import app.chalo.geoquery.data.models.app.GeoQueryResponseAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
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
@DebugMetadata(c = "app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager$processGeoQuerySuccessData$2", f = "GeoSpatialLiveBusesDataPollingManager.kt", l = {120, 122}, m = "invokeSuspend", v = 1)
final class GeoSpatialLiveBusesDataPollingManager$processGeoQuerySuccessData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CityAppModel $currentCity;
    final /* synthetic */ GeoQueryResponseAppModel $response;
    int label;
    final /* synthetic */ GeoSpatialLiveBusesDataPollingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSpatialLiveBusesDataPollingManager$processGeoQuerySuccessData$2(GeoQueryResponseAppModel geoQueryResponseAppModel, GeoSpatialLiveBusesDataPollingManager geoSpatialLiveBusesDataPollingManager, CityAppModel cityAppModel, Continuation continuation) {
        super(2, continuation);
        this.$response = geoQueryResponseAppModel;
        this.this$0 = geoSpatialLiveBusesDataPollingManager;
        this.$currentCity = cityAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GeoSpatialLiveBusesDataPollingManager$processGeoQuerySuccessData$2(this.$response, this.this$0, this.$currentCity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoSpatialLiveBusesDataPollingManager$processGeoQuerySuccessData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager.a(r5, r1, r3, r4) == r0) goto L17;
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
            goto L45
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L32
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.geoquery.data.models.app.GeoQueryResponseAppModel r5 = r4.$response
            kotlinx.serialization.json.JsonObject r5 = r5.b
            if (r5 == 0) goto L32
            app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager r1 = r4.this$0
            app.chalo.features.reportproblem.IReportProblemFeature r1 = r1.d
            r4.label = r3
            java.lang.Object r5 = r1.f(r5, r4)
            if (r5 != r0) goto L32
            goto L44
        L32:
            app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager r5 = r4.this$0
            app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel r1 = r4.$currentCity
            java.lang.String r1 = r1.f8854a
            app.chalo.geoquery.data.models.app.GeoQueryResponseAppModel r3 = r4.$response
            kotlinx.serialization.json.JsonObject r3 = r3.e
            r4.label = r2
            java.lang.Object r5 = app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager.a(r5, r1, r3, r4)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager$processGeoQuerySuccessData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
