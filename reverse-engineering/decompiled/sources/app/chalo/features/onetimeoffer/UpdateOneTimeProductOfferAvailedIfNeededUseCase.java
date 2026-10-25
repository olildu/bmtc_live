package app.chalo.features.onetimeoffer;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/onetimeoffer/UpdateOneTimeProductOfferAvailedIfNeededUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateOneTimeProductOfferAvailedIfNeededUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetOneTimeOfferConfigUseCase f2736a;
    public final IUserPreferencesDataStore b;

    public UpdateOneTimeProductOfferAvailedIfNeededUseCase(GetOneTimeOfferConfigUseCase getOneTimeOfferConfigUseCase, IUserPreferencesDataStore iUserPreferencesDataStore) {
        this.f2736a = getOneTimeOfferConfigUseCase;
        this.b = iUserPreferencesDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r5.b.c(r6, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase$invoke$1 r0 = (app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase$invoke$1 r0 = new app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r7)
            goto L4a
        L3a:
            kotlin.ResultKt.b(r7)
            r0.L$0 = r6
            r0.label = r4
            app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase r7 = r5.f2736a
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L4a
            goto L5f
        L4a:
            app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel r7 = (app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel) r7
            boolean r7 = app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModelKt.a(r7, r6)
            if (r7 == 0) goto L60
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            app.chalo.features.onetimeoffer.IUserPreferencesDataStore r7 = r5.b
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L61
        L5f:
            return r1
        L60:
            r4 = 0
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
