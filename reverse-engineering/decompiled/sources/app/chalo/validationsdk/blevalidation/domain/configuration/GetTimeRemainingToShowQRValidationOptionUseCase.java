package app.chalo.validationsdk.blevalidation.domain.configuration;

import app.chalo.contract.BasicInfoContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/configuration/GetTimeRemainingToShowQRValidationOptionUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetTimeRemainingToShowQRValidationOptionUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetRegularBusProductValidationMethodUseCase f10513a;
    public final BasicInfoContract b;

    public GetTimeRemainingToShowQRValidationOptionUseCase(BasicInfoContract basicInfoContract, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase) {
        this.f10513a = getRegularBusProductValidationMethodUseCase;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r10 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r7, app.chalo.models.validation.ValidationProduct r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase$invoke$1 r0 = (app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase$invoke$1 r0 = new app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase$invoke$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r7 = r0.J$0
            kotlin.ResultKt.b(r10)
            goto L6e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            long r7 = r0.J$0
            kotlin.ResultKt.b(r10)
            goto L4a
        L3a:
            kotlin.ResultKt.b(r10)
            r0.J$0 = r7
            r0.label = r4
            app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase r10 = r6.f10513a
            java.lang.Object r10 = r10.b(r9, r0)
            if (r10 != r1) goto L4a
            goto L6d
        L4a:
            app.chalo.models.validation.RegularBusProductAndValidationMethod r10 = (app.chalo.models.validation.RegularBusProductAndValidationMethod) r10
            app.chalo.models.validation.RegularBusSlBleConfig r9 = r10.b
            r4 = -1
            if (r9 == 0) goto L55
            long r9 = r9.g
            goto L56
        L55:
            r9 = r4
        L56:
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L60
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r4)
            return r7
        L60:
            long r7 = r7 + r9
            r0.J$0 = r7
            r0.label = r3
            app.chalo.contract.BasicInfoContract r9 = r6.b
            java.lang.Object r10 = r9.c(r0)
            if (r10 != r1) goto L6e
        L6d:
            return r1
        L6e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            long r7 = r7 - r9
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase.a(long, app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
