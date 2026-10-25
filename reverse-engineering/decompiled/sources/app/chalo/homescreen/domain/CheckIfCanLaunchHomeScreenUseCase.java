package app.chalo.homescreen.domain;

import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/domain/CheckIfCanLaunchHomeScreenUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfCanLaunchHomeScreenUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeScreenConfigManager f3821a;
    public final CityProvider b;

    public CheckIfCanLaunchHomeScreenUseCase(HomeScreenConfigManager homeScreenConfigManager, CityProvider cityProvider) {
        this.f3821a = homeScreenConfigManager;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r6 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase$invoke$1 r0 = (app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase$invoke$1 r0 = new app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase$invoke$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L5a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L44
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            app.chalo.providers.cityprovider.CityProvider r6 = r5.b
            java.lang.Boolean r6 = r6.j()
            if (r6 != r1) goto L44
            goto L59
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4f:
            r0.label = r3
            app.chalo.manager.homescreen.HomeScreenConfigManager r6 = r5.f3821a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            if (r6 == 0) goto L5d
            goto L5e
        L5d:
            r4 = 0
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
