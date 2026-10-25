package app.chalo.ridefeedback.domain;

import app.chalo.datastore.LocalDataStore;
import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridehailing.data.RideHailingRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/ClearRideFeedbackDataDuringLogoutUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClearRideFeedbackDataDuringLogoutUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackRepository f9075a;
    public final RideHailingRepository b;
    public final LocalDataStore c;

    public ClearRideFeedbackDataDuringLogoutUseCase(RideFeedbackRepository rideFeedbackRepository, RideHailingRepository rideHailingRepository, LocalDataStore localDataStore) {
        this.f9075a = rideFeedbackRepository;
        this.b = rideHailingRepository;
        this.c = localDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r8.c.c(r9, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase$invoke$1 r0 = (app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase$invoke$1 r0 = new app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase$invoke$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.ridefeedback.data.RideFeedbackRepository r3 = r8.f9075a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L42
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            kotlin.ResultKt.b(r9)
            goto L77
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            kotlin.ResultKt.b(r9)
            goto L66
        L3e:
            kotlin.ResultKt.b(r9)
            goto L5b
        L42:
            kotlin.ResultKt.b(r9)
            goto L52
        L46:
            kotlin.ResultKt.b(r9)
            r0.label = r7
            java.lang.Object r9 = r3.a(r0)
            if (r9 != r1) goto L52
            goto L76
        L52:
            r0.label = r6
            java.lang.Object r9 = r3.g(r0)
            if (r9 != r1) goto L5b
            goto L76
        L5b:
            r0.label = r5
            app.chalo.ridehailing.data.RideHailingRepository r9 = r8.b
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L66
            goto L76
        L66:
            androidx.datastore.preferences.core.Preferences$Key r9 = app.chalo.ridehailing.feedback.AutoRideFeedbackDelegate.u
            java.util.List r9 = kotlin.collections.CollectionsKt.R(r9)
            r0.label = r4
            app.chalo.datastore.LocalDataStore r2 = r8.c
            java.lang.Object r9 = r2.c(r9, r0)
            if (r9 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
