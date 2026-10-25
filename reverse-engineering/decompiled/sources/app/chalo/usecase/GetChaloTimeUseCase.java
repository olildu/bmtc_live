package app.chalo.usecase;

import app.chalo.features.chalotime.ChaloTimeProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetChaloTimeUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetChaloTimeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTimeProvider f10178a;

    public GetChaloTimeUseCase(ChaloTimeProvider chaloTimeProvider) {
        this.f10178a = chaloTimeProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.usecase.GetChaloTimeUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.usecase.GetChaloTimeUseCase$invoke$1 r0 = (app.chalo.usecase.GetChaloTimeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.usecase.GetChaloTimeUseCase$invoke$1 r0 = new app.chalo.usecase.GetChaloTimeUseCase$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.features.chalotime.ChaloTimeProvider r3 = r6.f10178a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r7)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.b(r7)
            goto L44
        L38:
            kotlin.ResultKt.b(r7)
            r0.label = r5
            java.lang.Object r7 = r3.c(r0)
            if (r7 != r1) goto L44
            goto L54
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            r0.label = r4
            java.lang.Object r7 = r3.b(r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L68
            long r0 = r7.longValue()
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r7.<init>(r2)
            return r7
        L68:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.usecase.ChaloTimeAvailability r0 = app.chalo.usecase.ChaloTimeAvailability.CHALO_TIME_NOT_AVAILABLE
            r7.<init>(r0)
            return r7
        L70:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.usecase.ChaloTimeAvailability r0 = app.chalo.usecase.ChaloTimeAvailability.CHALO_TIME_NOT_AVAILABLE
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.GetChaloTimeUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
