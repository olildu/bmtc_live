package app.chalo.productactivation.domain;

import app.chalo.blevalidation.CheckBluetoothPermissionHelper;
import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.contract.BasicInfoContract;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/domain/ShouldCheckBLEPermissionForActivationUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShouldCheckBLEPermissionForActivationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetRegularBusProductValidationMethodUseCase f8023a;
    public final IsBluetoothFeatureAvailableUseCase b;
    public final CheckBluetoothPermissionHelper c;
    public final BasicInfoContract d;

    public ShouldCheckBLEPermissionForActivationUseCase(GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase, IsBluetoothFeatureAvailableUseCase isBluetoothFeatureAvailableUseCase, CheckBluetoothPermissionHelper checkBluetoothPermissionHelper, BasicInfoContract basicInfoContract) {
        this.f8023a = getRegularBusProductValidationMethodUseCase;
        this.b = isBluetoothFeatureAvailableUseCase;
        this.c = checkBluetoothPermissionHelper;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r7 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.models.validation.ValidationProduct r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase$invoke$1 r0 = (app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase$invoke$1 r0 = new app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase$invoke$1
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
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r7)
            goto L46
        L36:
            kotlin.ResultKt.b(r7)
            float r7 = app.chalo.utils.PlatformFeature.f10436a
            r0.label = r4
            app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase r7 = r5.f8023a
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L46
            goto L6b
        L46:
            app.chalo.models.validation.RegularBusProductAndValidationMethod r7 = (app.chalo.models.validation.RegularBusProductAndValidationMethod) r7
            app.chalo.models.validation.RegularBusSlBleConfig r6 = r7.b
            if (r6 == 0) goto L59
            app.chalo.contract.BasicInfoContract r7 = r5.d
            int r7 = r7.h()
            boolean r6 = r6.a(r7)
            if (r6 != 0) goto L59
            goto L75
        L59:
            app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase r6 = r5.b
            boolean r6 = r6.a()
            if (r6 == 0) goto L75
            r0.label = r3
            app.chalo.blevalidation.CheckBluetoothPermissionHelper r6 = r5.c
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L75
            goto L76
        L75:
            r4 = 0
        L76:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase.a(app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
