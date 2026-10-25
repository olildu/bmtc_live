package app.chalo.tito.domain;

import app.chalo.citydata.manager.CityDataManagerKotlin;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/GetCachedStopFromStopIdUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCachedStopFromStopIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataManagerKotlin f9660a;

    public GetCachedStopFromStopIdUseCase(CityDataManagerKotlin cityDataManagerKotlin) {
        this.f9660a = cityDataManagerKotlin;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r11 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof app.chalo.tito.domain.GetCachedStopFromStopIdUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.tito.domain.GetCachedStopFromStopIdUseCase$invoke$1 r0 = (app.chalo.tito.domain.GetCachedStopFromStopIdUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.tito.domain.GetCachedStopFromStopIdUseCase$invoke$1 r0 = new app.chalo.tito.domain.GetCachedStopFromStopIdUseCase$invoke$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.citydata.manager.CityDataManagerKotlin r3 = r8.f9660a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L50
            if (r2 == r6) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r11)
            goto L84
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.b(r11)
            goto L76
        L43:
            java.lang.Object r9 = r0.L$1
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.b(r11)
            goto L60
        L50:
            kotlin.ResultKt.b(r11)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r6
            java.lang.Object r11 = r3.e(r9, r10, r0)
            if (r11 != r1) goto L60
            goto L83
        L60:
            app.chalo.citydata.data.model.app.StopAppModel r11 = (app.chalo.citydata.data.model.app.StopAppModel) r11
            if (r11 != 0) goto L96
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r5
            r5 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r5, r0)
            if (r11 != r1) goto L73
            goto L83
        L73:
            r7 = r10
            r10 = r9
            r9 = r7
        L76:
            r11 = 0
            r0.L$0 = r11
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r11 = r3.e(r10, r9, r0)
            if (r11 != r1) goto L84
        L83:
            return r1
        L84:
            app.chalo.citydata.data.model.app.StopAppModel r11 = (app.chalo.citydata.data.model.app.StopAppModel) r11
            if (r11 != 0) goto L90
            app.chalo.utils.ChaloUseCaseResult$Failure r9 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.tito.domain.CachedStopFetchFailureReason r10 = app.chalo.tito.domain.CachedStopFetchFailureReason.STOP_NOT_FOUND_IN_CITY_DATA_CACHE
            r9.<init>(r10)
            return r9
        L90:
            app.chalo.utils.ChaloUseCaseResult$Success r9 = new app.chalo.utils.ChaloUseCaseResult$Success
            r9.<init>(r11)
            return r9
        L96:
            app.chalo.utils.ChaloUseCaseResult$Success r9 = new app.chalo.utils.ChaloUseCaseResult$Success
            r9.<init>(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tito.domain.GetCachedStopFromStopIdUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
