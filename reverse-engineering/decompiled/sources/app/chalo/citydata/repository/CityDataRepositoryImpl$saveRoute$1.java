package app.chalo.citydata.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.citydata.repository.CityDataRepositoryImpl", f = "CityDataRepositoryImpl.kt", l = {84, EACTags.HISTORICAL_BYTES}, m = "saveRoute", v = 1)
final class CityDataRepositoryImpl$saveRoute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CityDataRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityDataRepositoryImpl$saveRoute$1(CityDataRepositoryImpl cityDataRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = cityDataRepositoryImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (r13.c(r1, r0) == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r12.result = r13
            int r13 = r12.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r13 | r0
            r12.label = r13
            app.chalo.citydata.repository.CityDataRepositoryImpl r13 = r12.this$0
            r13.getClass()
            int r1 = r12.label
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r12.label = r1
            r0 = r12
            goto L1e
        L19:
            app.chalo.citydata.repository.CityDataRepositoryImpl$saveRoute$1 r0 = new app.chalo.citydata.repository.CityDataRepositoryImpl$saveRoute$1
            r0.<init>(r13, r12)
        L1e:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L4c
            if (r3 == r6) goto L39
            if (r3 != r5) goto L31
            kotlin.ResultKt.b(r1)
            goto L82
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L39:
            java.lang.Object r13 = r0.L$2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r3 = r0.L$1
            app.chalo.citydata.data.model.app.RouteAppModel r3 = (app.chalo.citydata.data.model.app.RouteAppModel) r3
            java.lang.Object r6 = r0.L$0
            app.chalo.citydata.repository.local.RouteLocalDataSource r6 = (app.chalo.citydata.repository.local.RouteLocalDataSource) r6
            kotlin.ResultKt.b(r1)
            r7 = r13
            r13 = r6
            r6 = r3
            goto L67
        L4c:
            kotlin.ResultKt.b(r1)
            app.chalo.citydata.repository.local.RouteLocalDataSource r1 = r13.b
            r0.L$0 = r1
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r6
            app.chalo.contract.BasicInfoContract r13 = r13.c
            java.lang.Object r13 = r13.c(r0)
            if (r13 != r2) goto L62
            goto L81
        L62:
            r6 = r1
            r1 = r13
            r13 = r6
            r6 = r4
            r7 = r6
        L67:
            java.lang.Number r1 = (java.lang.Number) r1
            long r8 = r1.longValue()
            r10 = -1
            app.chalo.citydata.repository.local.room.entity.RouteEntity r1 = app.chalo.citydata.data.model.mapper.AppToEntityKt.b(r6, r7, r8, r10)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r5
            java.lang.Object r13 = r13.c(r1, r0)
            if (r13 != r2) goto L82
        L81:
            return r2
        L82:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citydata.repository.CityDataRepositoryImpl$saveRoute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
