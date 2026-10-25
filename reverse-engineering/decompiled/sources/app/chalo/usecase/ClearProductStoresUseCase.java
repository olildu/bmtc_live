package app.chalo.usecase;

import app.chalo.datastore.LocalDataStore;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ClearProductStoresUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClearProductStoresUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f10159a;
    public final LocalDataStore b;
    public final LocalDataStore c;

    public ClearProductStoresUseCase(LocalDataStore localDataStore, LocalDataStore localDataStore2, LocalDataStore localDataStore3) {
        this.f10159a = localDataStore;
        this.b = localDataStore2;
        this.c = localDataStore3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r6.c.b(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.usecase.ClearProductStoresUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.usecase.ClearProductStoresUseCase$invoke$1 r0 = (app.chalo.usecase.ClearProductStoresUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.usecase.ClearProductStoresUseCase$invoke$1 r0 = new app.chalo.usecase.ClearProductStoresUseCase$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r7)
            goto L61
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.b(r7)
            goto L56
        L39:
            kotlin.ResultKt.b(r7)
            goto L4b
        L3d:
            kotlin.ResultKt.b(r7)
            r0.label = r5
            app.chalo.datastore.LocalDataStore r7 = r6.f10159a
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L4b
            goto L60
        L4b:
            r0.label = r4
            app.chalo.datastore.LocalDataStore r7 = r6.b
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L56
            goto L60
        L56:
            r0.label = r3
            app.chalo.datastore.LocalDataStore r7 = r6.c
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.ClearProductStoresUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
