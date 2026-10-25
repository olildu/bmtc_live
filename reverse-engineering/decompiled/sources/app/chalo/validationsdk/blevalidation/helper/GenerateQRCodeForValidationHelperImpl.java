package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/GenerateQRCodeForValidationHelperImpl;", "Lapp/chalo/validationsdk/blevalidation/helper/GenerateQRCodeForValidationHelper;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenerateQRCodeForValidationHelperImpl implements GenerateQRCodeForValidationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationQrGenerator f10557a;
    public final BmrclMetroValidationQrGenerator b;
    public final CrashlyticsLogger c;

    public GenerateQRCodeForValidationHelperImpl(ValidationQrGenerator validationQrGenerator, BmrclMetroValidationQrGenerator bmrclMetroValidationQrGenerator, CrashlyticsLogger crashlyticsLogger) {
        this.f10557a = validationQrGenerator;
        this.b = bmrclMetroValidationQrGenerator;
        this.c = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if (r10 == r1) goto L34;
     */
    @Override // app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r6, kotlin.jvm.functions.Function1 r7, app.chalo.models.validation.ValidationProduct r8, app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl$invoke$1 r0 = (app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl$invoke$1 r0 = new app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl$invoke$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L64
        L2a:
            r6 = move-exception
            goto L6d
        L2c:
            r6 = move-exception
            goto L75
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L50
        L3a:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme$Default r10 = app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme.Default.f10473a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r9, r10)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r10 == 0) goto L53
            app.chalo.validationsdk.blevalidation.helper.ValidationQrGenerator r9 = r5.f10557a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.label = r4     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r10 = r9.a(r6, r7, r8, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r10 != r1) goto L50
            goto L63
        L50:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            return r10
        L53:
            boolean r8 = r9 instanceof app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme.BmrclMetro     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 == 0) goto L67
            app.chalo.validationsdk.blevalidation.helper.BmrclMetroValidationQrGenerator r8 = r5.b     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme$BmrclMetro r9 = (app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme.BmrclMetro) r9     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.label = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r10 = r8.b(r6, r7, r9, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r10 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            return r10
        L67:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r6.<init>()     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            throw r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
        L6d:
            app.chalo.crashlytics.CrashlyticsLogger r7 = r5.c
            r7.i(r6)
            java.lang.String r6 = ""
            return r6
        L75:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl.a(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, kotlin.jvm.functions.Function1, app.chalo.models.validation.ValidationProduct, app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelper
    public final Object b(ProductValidationData productValidationData, ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        GenerateQRCodeForValidationHelperImpl$invoke$2 generateQRCodeForValidationHelperImpl$invoke$2;
        GenerateQRCodeForValidationHelperImpl generateQRCodeForValidationHelperImpl;
        Exception exc;
        if (continuationImpl instanceof GenerateQRCodeForValidationHelperImpl$invoke$2) {
            generateQRCodeForValidationHelperImpl$invoke$2 = (GenerateQRCodeForValidationHelperImpl$invoke$2) continuationImpl;
            int i = generateQRCodeForValidationHelperImpl$invoke$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateQRCodeForValidationHelperImpl$invoke$2.label = i - Integer.MIN_VALUE;
            } else {
                generateQRCodeForValidationHelperImpl$invoke$2 = new GenerateQRCodeForValidationHelperImpl$invoke$2(this, continuationImpl);
            }
        } else {
            generateQRCodeForValidationHelperImpl$invoke$2 = new GenerateQRCodeForValidationHelperImpl$invoke$2(this, continuationImpl);
        }
        GenerateQRCodeForValidationHelperImpl$invoke$2 generateQRCodeForValidationHelperImpl$invoke$3 = generateQRCodeForValidationHelperImpl$invoke$2;
        Object objA = generateQRCodeForValidationHelperImpl$invoke$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = generateQRCodeForValidationHelperImpl$invoke$3.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            try {
                GenerateQRCodeForValidationHelperImpl$invoke$3 generateQRCodeForValidationHelperImpl$invoke$4 = new GenerateQRCodeForValidationHelperImpl$invoke$3(productValidationData, null);
                DynamicQrScheme.Default r5 = DynamicQrScheme.Default.f10473a;
                generateQRCodeForValidationHelperImpl$invoke$3.label = 1;
                generateQRCodeForValidationHelperImpl = this;
                try {
                    objA = generateQRCodeForValidationHelperImpl.a(productValidationData, generateQRCodeForValidationHelperImpl$invoke$4, validationProduct, r5, generateQRCodeForValidationHelperImpl$invoke$3);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (CancellationException e) {
                    e = e;
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    generateQRCodeForValidationHelperImpl.c.i(exc);
                    return "";
                }
            } catch (CancellationException e3) {
                e = e3;
                throw e;
            } catch (Exception e4) {
                e = e4;
                generateQRCodeForValidationHelperImpl = this;
                exc = e;
                generateQRCodeForValidationHelperImpl.c.i(exc);
                return "";
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.b(objA);
                generateQRCodeForValidationHelperImpl = this;
            } catch (CancellationException e5) {
                throw e5;
            } catch (Exception e6) {
                exc = e6;
                generateQRCodeForValidationHelperImpl = this;
                generateQRCodeForValidationHelperImpl.c.i(exc);
                return "";
            }
        }
        return (String) objA;
    }
}
