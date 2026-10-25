package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationDynamicInfoHelper;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleValidationDynamicInfoHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenerateQRCodeForValidationHelper f10535a;
    public final GetTimeRemainingToShowQRValidationOptionUseCase b;
    public final BasicInfoContract c;
    public final ContextScope d;
    public final MutableStateFlow e = StateFlowKt.a(new BleValidationDynamicInfo("", 15000, false));
    public Job f;

    public BleValidationDynamicInfoHelper(CoroutineContextProvider coroutineContextProvider, GenerateQRCodeForValidationHelper generateQRCodeForValidationHelper, GetTimeRemainingToShowQRValidationOptionUseCase getTimeRemainingToShowQRValidationOptionUseCase, BasicInfoContract basicInfoContract) {
        this.f10535a = generateQRCodeForValidationHelper;
        this.b = getTimeRemainingToShowQRValidationOptionUseCase;
        this.c = basicInfoContract;
        this.d = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153 A[PHI: r1 r5 r9 r12
      0x0153: PHI (r1v27 int) = (r1v22 int), (r1v29 int) binds: [B:70:0x019a, B:53:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r5v20 app.chalo.models.validation.ValidationProduct) = (r5v14 app.chalo.models.validation.ValidationProduct), (r5v21 app.chalo.models.validation.ValidationProduct) binds: [B:70:0x019a, B:53:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r9v15 long) = (r9v10 long), (r9v16 long) binds: [B:70:0x019a, B:53:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r12v8 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r12v4 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r12v9 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:70:0x019a, B:53:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX WARN: Code duplicated, block: B:59:0x015f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x019a A[PHI: r1 r5 r9 r11
      0x019a: PHI (r1v22 int) = (r1v20 int), (r1v23 int) binds: [B:64:0x017e, B:69:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r5v14 app.chalo.models.validation.ValidationProduct) = (r5v11 app.chalo.models.validation.ValidationProduct), (r5v15 app.chalo.models.validation.ValidationProduct) binds: [B:64:0x017e, B:69:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r9v10 long) = (r9v8 long), (r9v11 long) binds: [B:64:0x017e, B:69:0x0198] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r11v8 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r11v5 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r11v9 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:64:0x017e, B:69:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0 A[PHI: r1 r6 r9
      0x01c0: PHI (r1v31 int) = (r1v26 int), (r1v26 int), (r1v33 int) binds: [B:73:0x01a1, B:75:0x01a4, B:80:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:73:0x01a1, B:75:0x01a4, B:80:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r9v18 long) = (r9v14 long), (r9v14 long), (r9v19 long) binds: [B:73:0x01a1, B:75:0x01a4, B:80:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018f, code lost:
    
        if (r2 == r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ba, code lost:
    
        if (r2 == r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d9, code lost:
    
        if (r0.emit(r2, r3) == r4) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper r17, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r18, app.chalo.models.validation.ValidationProcessFlowDetails r19, app.chalo.models.validation.ValidationProduct r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper.a(app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.models.validation.ValidationProcessFlowDetails, app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(ProductValidationData productValidationData, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct) {
        Intrinsics.i(productValidationData, "productValidationData");
        Intrinsics.i(validationProcessFlowDetails, "validationProcessFlowDetails");
        Intrinsics.i(validationProduct, "validationProduct");
        Job job = this.f;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.f = BuildersKt.d(this.d, null, null, new BleValidationDynamicInfoHelper$initialize$1(this, productValidationData, validationProcessFlowDetails, validationProduct, null), 3);
    }
}
