package app.chalo.tito.domain;

import app.chalo.tito.data.TITOValidationDataRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/GetAllActiveTappedInTripsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAllActiveTappedInTripsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TITOValidationDataRepository f9658a;

    public GetAllActiveTappedInTripsUseCase(TITOValidationDataRepository tITOValidationDataRepository) {
        this.f9658a = tITOValidationDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r7 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.tito.domain.GetAllActiveTappedInTripsUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.tito.domain.GetAllActiveTappedInTripsUseCase$invoke$1 r0 = (app.chalo.tito.domain.GetAllActiveTappedInTripsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.tito.domain.GetAllActiveTappedInTripsUseCase$invoke$1 r0 = new app.chalo.tito.domain.GetAllActiveTappedInTripsUseCase$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r7)
            goto L44
        L36:
            kotlin.ResultKt.b(r7)
            r0.label = r4
            app.chalo.tito.data.TITOValidationDataRepository r7 = r5.f9658a
            java.lang.Object r7 = r7.h(r6, r0)
            if (r7 != r1) goto L44
            goto L4e
        L44:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.v(r7, r0)
            if (r7 != r1) goto L4f
        L4e:
            return r1
        L4f:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L78
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r7.next()
            r1 = r0
            app.chalo.titoridedetail.data.app.TITOValidationAppModel r1 = (app.chalo.titoridedetail.data.app.TITOValidationAppModel) r1
            app.chalo.titoridedetail.data.app.TitoValidationStatus r1 = r1.d
            boolean r1 = app.chalo.titoridedetail.data.app.TitoValidationStatusKt.a(r1)
            if (r1 == 0) goto L5e
            r6.add(r0)
            goto L5e
        L77:
            return r6
        L78:
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.f17557a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tito.domain.GetAllActiveTappedInTripsUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
