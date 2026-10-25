package app.chalo.home.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.home.data.repository.IHomeScreenConfigRepository;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.usecase.GetDistinctIdUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/domain/CheckIfAppUpdateRequiredUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfAppUpdateRequiredUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHomeScreenConfigRepository f2988a;
    public final GetDistinctIdUseCase b;
    public final StringProvider c;
    public final BasicInfoContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/domain/CheckIfAppUpdateRequiredUseCase$Companion;", "", "", "APP_VERSION_CODE", "Ljava/lang/String;", "USER_ID_KEY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CheckIfAppUpdateRequiredUseCase(IHomeScreenConfigRepository iHomeScreenConfigRepository, GetDistinctIdUseCase getDistinctIdUseCase, StringProvider stringProvider, BasicInfoContract basicInfoContract) {
        this.f2988a = iHomeScreenConfigRepository;
        this.b = getDistinctIdUseCase;
        this.c = stringProvider;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r10 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase$invoke$1 r0 = (app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase$invoke$1 r0 = new app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase$invoke$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.b(r10)
            goto L91
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L37
            goto L74
        L37:
            r10 = move-exception
            goto L7c
        L39:
            kotlin.ResultKt.b(r10)
            app.chalo.home.data.repository.IHomeScreenConfigRepository r10 = r9.f2988a     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "appVersionCode"
            app.chalo.contract.BasicInfoContract r6 = r9.d     // Catch: java.lang.Exception -> L37
            int r6 = r6.h()     // Catch: java.lang.Exception -> L37
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L37
            kotlin.Pair r7 = new kotlin.Pair     // Catch: java.lang.Exception -> L37
            r7.<init>(r2, r6)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "userId"
            app.chalo.usecase.GetDistinctIdUseCase r6 = r9.b     // Catch: java.lang.Exception -> L37
            java.lang.String r6 = r6.a(r5)     // Catch: java.lang.Exception -> L37
            if (r6 != 0) goto L5c
            java.lang.String r6 = ""
        L5c:
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Exception -> L37
            r8.<init>(r2, r6)     // Catch: java.lang.Exception -> L37
            kotlin.Pair[] r2 = new kotlin.Pair[r4]     // Catch: java.lang.Exception -> L37
            r2[r3] = r7     // Catch: java.lang.Exception -> L37
            r2[r5] = r8     // Catch: java.lang.Exception -> L37
            java.util.Map r2 = kotlin.collections.MapsKt.i(r2)     // Catch: java.lang.Exception -> L37
            r0.label = r5     // Catch: java.lang.Exception -> L37
            java.lang.Object r10 = r10.c(r2, r0)     // Catch: java.lang.Exception -> L37
            if (r10 != r1) goto L74
            goto L90
        L74:
            app.chalo.home.data.model.app.response.CheckAppUpdateResponseAppModel r10 = (app.chalo.home.data.model.app.response.CheckAppUpdateResponseAppModel) r10     // Catch: java.lang.Exception -> L37
            app.chalo.utils.ChaloUseCaseResult$Success r2 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: java.lang.Exception -> L37
            r2.<init>(r10)     // Catch: java.lang.Exception -> L37
            return r2
        L7c:
            java.lang.String r10 = r10.getMessage()
            if (r10 != 0) goto L93
            app.chalo.providers.stringprovider.StringEnum r10 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r0.label = r4
            app.chalo.providers.stringprovider.StringProvider r3 = r9.c
            java.lang.Object r10 = r3.b(r10, r2, r0)
            if (r10 != r1) goto L91
        L90:
            return r1
        L91:
            java.lang.String r10 = (java.lang.String) r10
        L93:
            app.chalo.home.domain.HomeErrorType$Unknown r0 = new app.chalo.home.domain.HomeErrorType$Unknown
            r0.<init>(r10)
            app.chalo.utils.ChaloUseCaseResult$Failure r10 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r10.<init>(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
