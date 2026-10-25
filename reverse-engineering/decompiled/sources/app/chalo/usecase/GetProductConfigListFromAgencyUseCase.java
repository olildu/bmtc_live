package app.chalo.usecase;

import app.chalo.datastore.LocalDataStore;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetProductConfigListFromAgencyUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductConfigListFromAgencyUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f10190a;
    public final GetProductConfigFromProductIdUseCase b;

    public GetProductConfigListFromAgencyUseCase(LocalDataStore localDataStore, GetProductConfigFromProductIdUseCase getProductConfigFromProductIdUseCase) {
        this.f10190a = localDataStore;
        this.b = getProductConfigFromProductIdUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0087 -> B:29:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.usecase.GetProductConfigListFromAgencyUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.usecase.GetProductConfigListFromAgencyUseCase$invoke$1 r0 = (app.chalo.usecase.GetProductConfigListFromAgencyUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.usecase.GetProductConfigListFromAgencyUseCase$invoke$1 r0 = new app.chalo.usecase.GetProductConfigListFromAgencyUseCase$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.b(r8)
            goto L8a
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.b(r8)
            goto L56
        L46:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r7
            r0.label = r4
            app.chalo.datastore.LocalDataStore r8 = r6.f10190a
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L56
            goto L89
        L56:
            java.util.Map r8 = (java.util.Map) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r8 == 0) goto La3
            java.util.Set r8 = r8.keySet()
            if (r8 == 0) goto La3
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r7 = r8
        L6d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La3
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r7
            r0.label = r3
            app.chalo.usecase.GetProductConfigFromProductIdUseCase r5 = r6.b
            java.lang.Object r8 = r5.a(r8, r0)
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel r8 = (app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel) r8
            r5 = 0
            if (r8 == 0) goto L92
            app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel r8 = r8.f8205a
            goto L93
        L92:
            r8 = r5
        L93:
            if (r8 == 0) goto L97
            java.lang.String r5 = r8.g
        L97:
            if (r5 == 0) goto L6d
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 == 0) goto L6d
            r2.add(r8)
            goto L6d
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.GetProductConfigListFromAgencyUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
