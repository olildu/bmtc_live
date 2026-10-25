package app.chalo.validationsdk.blevalidation.domain.qrvalidation;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.location.ChaloLocationManager;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QRValidationLifecycleDelegateImpl;", "Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QRValidationLifecycleDelegate;", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QRValidationLifecycleDelegateImpl implements QRValidationLifecycleDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f10517a;
    public final GenerateQRCodeForValidationHelper b;
    public final ChaloLocationManager c;
    public final CityProvider d;
    public final CrashlyticsLogger e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QRValidationLifecycleDelegateImpl$Companion;", "", "", "QR_UPDATE_INTERVAL", "J", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10518a;

        static {
            int[] iArr = new int[QRValidationType.values().length];
            try {
                iArr[QRValidationType.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QRValidationType.STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10518a = iArr;
        }
    }

    public QRValidationLifecycleDelegateImpl(BasicInfoContract basicInfoContract, GenerateQRCodeForValidationHelper generateQRCodeForValidationHelper, ChaloLocationManager chaloLocationManager, CityProvider cityProvider, CrashlyticsLogger crashlyticsLogger) {
        this.f10517a = basicInfoContract;
        this.b = generateQRCodeForValidationHelper;
        this.c = chaloLocationManager;
        this.d = cityProvider;
        this.e = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object b(QRValidationLifecycleDelegateImpl qRValidationLifecycleDelegateImpl, QRValidationLifecycleResult qRValidationLifecycleResult, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        QRValidationLifecycleDelegateImpl$checkExpiryIfDue$1 qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1;
        QRValidationLifecycleResult qRValidationLifecycleResult2;
        Object obj;
        ProductValidationData productValidationData2;
        QRValidationLifecycleResult qRValidationLifecycleResult3;
        long j;
        qRValidationLifecycleDelegateImpl.getClass();
        if (continuationImpl instanceof QRValidationLifecycleDelegateImpl$checkExpiryIfDue$1) {
            qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1 = (QRValidationLifecycleDelegateImpl$checkExpiryIfDue$1) continuationImpl;
            int i = qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1 = new QRValidationLifecycleDelegateImpl$checkExpiryIfDue$1(qRValidationLifecycleDelegateImpl, continuationImpl);
            }
        } else {
            qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1 = new QRValidationLifecycleDelegateImpl$checkExpiryIfDue$1(qRValidationLifecycleDelegateImpl, continuationImpl);
        }
        Object obj2 = qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            BasicInfoContract basicInfoContract = qRValidationLifecycleDelegateImpl.f10517a;
            qRValidationLifecycleResult2 = qRValidationLifecycleResult;
            qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.L$0 = qRValidationLifecycleResult2;
            qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.L$1 = productValidationData;
            qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.label = 1;
            Object objC = basicInfoContract.c(qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1);
            if (objC != coroutineSingletons) {
                obj = objC;
                productValidationData2 = productValidationData;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            productValidationData2 = (ProductValidationData) qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.L$1;
            QRValidationLifecycleResult qRValidationLifecycleResult4 = (QRValidationLifecycleResult) qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.L$0;
            ResultKt.b(obj2);
            obj = obj2;
            qRValidationLifecycleResult2 = qRValidationLifecycleResult4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.J$0;
            QRValidationLifecycleResult qRValidationLifecycleResult5 = (QRValidationLifecycleResult) qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.L$0;
            ResultKt.b(obj2);
            qRValidationLifecycleResult3 = qRValidationLifecycleResult5;
            j = j2;
        }
        return QRValidationLifecycleResult.a(qRValidationLifecycleResult3, null, !((Boolean) obj2).booleanValue(), j, 0L, false, 53);
        long jLongValue = ((Number) obj).longValue();
        if (productValidationData2.w() > jLongValue - qRValidationLifecycleResult2.d) {
            return null;
        }
        qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.L$0 = qRValidationLifecycleResult2;
        qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.L$1 = null;
        qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.J$0 = jLongValue;
        qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1.label = 2;
        Object objC2 = productValidationData2.C(qRValidationLifecycleDelegateImpl$checkExpiryIfDue$1);
        if (objC2 != coroutineSingletons) {
            qRValidationLifecycleResult3 = qRValidationLifecycleResult2;
            j = jLongValue;
            obj2 = objC2;
            return QRValidationLifecycleResult.a(qRValidationLifecycleResult3, null, !((Boolean) obj2).booleanValue(), j, 0L, false, 53);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final Object c(QRValidationLifecycleDelegateImpl qRValidationLifecycleDelegateImpl, QRValidationLifecycleResult qRValidationLifecycleResult, ProductValidationData productValidationData, ValidationProduct validationProduct, long j, ContinuationImpl continuationImpl) {
        QRValidationLifecycleDelegateImpl$refreshQrIfDue$1 qRValidationLifecycleDelegateImpl$refreshQrIfDue$1;
        Object obj;
        long j2;
        ValidationProduct validationProduct2;
        QRValidationLifecycleResult qRValidationLifecycleResult2;
        long j3;
        QRValidationLifecycleResult qRValidationLifecycleResult3;
        ArrayList arrayList;
        QRValidationLifecycleResult qRValidationLifecycleResult4 = qRValidationLifecycleResult;
        ProductValidationData productValidationData2 = productValidationData;
        qRValidationLifecycleDelegateImpl.getClass();
        if (continuationImpl instanceof QRValidationLifecycleDelegateImpl$refreshQrIfDue$1) {
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1 = (QRValidationLifecycleDelegateImpl$refreshQrIfDue$1) continuationImpl;
            int i = qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationLifecycleDelegateImpl$refreshQrIfDue$1 = new QRValidationLifecycleDelegateImpl$refreshQrIfDue$1(qRValidationLifecycleDelegateImpl, continuationImpl);
            }
        } else {
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1 = new QRValidationLifecycleDelegateImpl$refreshQrIfDue$1(qRValidationLifecycleDelegateImpl, continuationImpl);
        }
        Object objC = qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (j - qRValidationLifecycleResult4.e < productValidationData2.j()) {
                return null;
            }
            QRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1 qRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1 = new QRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1(productValidationData2, null);
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$0 = qRValidationLifecycleResult4;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$1 = productValidationData2;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$2 = validationProduct;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.J$0 = j;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.label = 1;
            Object objC2 = TimeoutKt.c(1000L, qRValidationLifecycleDelegateImpl$refreshQrIfDue$isProductStillUsable$1, qRValidationLifecycleDelegateImpl$refreshQrIfDue$1);
            if (objC2 != obj2) {
                obj = objC2;
                j2 = j;
                validationProduct2 = validationProduct;
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                QRValidationLifecycleResult qRValidationLifecycleResult5 = (QRValidationLifecycleResult) qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$0;
                ResultKt.b(objC);
                qRValidationLifecycleResult3 = qRValidationLifecycleResult5;
                return QRValidationLifecycleResult.a(qRValidationLifecycleResult3, null, !((Boolean) objC).booleanValue(), 0L, 0L, false, 61);
            }
            long j4 = qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.J$0;
            QRValidationLifecycleResult qRValidationLifecycleResult6 = (QRValidationLifecycleResult) qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$0;
            ResultKt.b(objC);
            j3 = j4;
            qRValidationLifecycleResult2 = qRValidationLifecycleResult6;
            List<QrInfo> list = (List) objC;
            arrayList = new ArrayList();
            for (QrInfo qrInfo : list) {
                if (qrInfo != null) {
                    arrayList.add(qrInfo);
                }
            }
            return QRValidationLifecycleResult.a(qRValidationLifecycleResult2, arrayList, false, 0L, j3, h(list), 14);
        }
        long j5 = qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.J$0;
        validationProduct2 = (ValidationProduct) qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$2;
        ProductValidationData productValidationData3 = (ProductValidationData) qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$1;
        QRValidationLifecycleResult qRValidationLifecycleResult7 = (QRValidationLifecycleResult) qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$0;
        ResultKt.b(objC);
        productValidationData2 = productValidationData3;
        qRValidationLifecycleResult4 = qRValidationLifecycleResult7;
        obj = objC;
        j2 = j5;
        Boolean bool = (Boolean) obj;
        if (Intrinsics.d(bool, Boolean.TRUE) || bool == null) {
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$0 = qRValidationLifecycleResult4;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$1 = null;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$2 = null;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.J$0 = j2;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.label = 2;
            Object objF = qRValidationLifecycleDelegateImpl.f(productValidationData2, validationProduct2, qRValidationLifecycleDelegateImpl$refreshQrIfDue$1);
            if (objF != obj2) {
                qRValidationLifecycleResult2 = qRValidationLifecycleResult4;
                j3 = j2;
                objC = objF;
                List<QrInfo> list2 = (List) objC;
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    if (qrInfo != null) {
                        arrayList.add(qrInfo);
                    }
                }
                return QRValidationLifecycleResult.a(qRValidationLifecycleResult2, arrayList, false, 0L, j3, h(list2), 14);
            }
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$0 = qRValidationLifecycleResult4;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$1 = null;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.L$2 = null;
            qRValidationLifecycleDelegateImpl$refreshQrIfDue$1.label = 3;
            objC = productValidationData2.C(qRValidationLifecycleDelegateImpl$refreshQrIfDue$1);
            if (objC != obj2) {
                qRValidationLifecycleResult3 = qRValidationLifecycleResult4;
                return QRValidationLifecycleResult.a(qRValidationLifecycleResult3, null, !((Boolean) objC).booleanValue(), 0L, 0L, false, 61);
            }
        }
        return obj2;
    }

    public static boolean h(List list) {
        if (list.isEmpty()) {
            return true;
        }
        List<QrInfo> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (QrInfo qrInfo : list2) {
            if (qrInfo == null || qrInfo.d == QRValidationType.DYNAMIC) {
                return true;
            }
        }
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegate
    public final Flow a(ProductValidationData productData, ValidationProduct validationProduct) {
        Intrinsics.i(productData, "productData");
        Intrinsics.i(validationProduct, "validationProduct");
        return FlowKt.m(FlowKt.y(new QRValidationLifecycleDelegateImpl$initialise$1(this, productData, validationProduct, null)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r11 == r0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9, app.chalo.models.validation.ValidationProduct r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRFromStaticQRCode$1
            if (r0 == 0) goto L14
            r0 = r11
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRFromStaticQRCode$1 r0 = (app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRFromStaticQRCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRFromStaticQRCode$1 r0 = new app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRFromStaticQRCode$1
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r7 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            kotlin.ResultKt.b(r11)
            goto L55
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.ResultKt.b(r11)
            goto L8a
        L39:
            kotlin.ResultKt.b(r11)
            app.chalo.scenes.args.QRValidationType r11 = r9.z()
            int[] r1 = app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl.WhenMappings.f10518a
            int r11 = r11.ordinal()
            r11 = r1[r11]
            if (r11 == r3) goto L75
            if (r11 != r2) goto L6f
            r6.label = r2
            java.lang.Object r11 = r8.g(r9, r6)
            if (r11 != r0) goto L55
            goto L89
        L55:
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L5f
            goto L60
        L5f:
            r11 = r7
        L60:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L65
            goto L99
        L65:
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QrInfo r9 = new app.chalo.validationsdk.blevalidation.domain.qrvalidation.QrInfo
            app.chalo.ticketvalidation.QRValidationStatus r10 = app.chalo.ticketvalidation.QRValidationStatus.UNKNOWN
            app.chalo.scenes.args.QRValidationType r0 = app.chalo.scenes.args.QRValidationType.STATIC
            r9.<init>(r11, r7, r10, r0)
            return r9
        L6f:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L75:
            r11 = r3
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRFromStaticQRCode$dynamic$1 r3 = new app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRFromStaticQRCode$dynamic$1
            r3.<init>(r9, r7)
            r6.label = r11
            app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelper r1 = r8.b
            app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme$Default r5 = app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme.Default.f10473a
            r2 = r9
            r4 = r10
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L8a
        L89:
            return r0
        L8a:
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L94
            goto L95
        L94:
            r11 = r7
        L95:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L9a
        L99:
            return r7
        L9a:
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QrInfo r9 = new app.chalo.validationsdk.blevalidation.domain.qrvalidation.QrInfo
            app.chalo.ticketvalidation.QRValidationStatus r10 = app.chalo.ticketvalidation.QRValidationStatus.UNKNOWN
            app.chalo.scenes.args.QRValidationType r0 = app.chalo.scenes.args.QRValidationType.DYNAMIC
            r9.<init>(r11, r7, r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl.d(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x011c  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0123  */
    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d1 -> B:34:0x0115). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00fe -> B:33:0x0106). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.ArrayList r21, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r22, app.chalo.models.validation.ValidationProduct r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl.e(java.util.ArrayList, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r9 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r7, app.chalo.models.validation.ValidationProduct r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQrInfo$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQrInfo$1 r0 = (app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQrInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQrInfo$1 r0 = new app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQrInfo$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r9)
            goto L7e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r9)
            return r9
        L39:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            app.chalo.models.validation.ValidationProduct r8 = (app.chalo.models.validation.ValidationProduct) r8
            java.lang.Object r7 = r0.L$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r7 = (app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) r7
            kotlin.ResultKt.b(r9)
            goto L56
        L46:
            kotlin.ResultKt.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r7.q(r0)
            if (r9 != r1) goto L56
            goto L7d
        L56:
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r9 = app.chalo.ticketvalidation.TicketValidationInfoKt.a(r9)
            boolean r2 = r9.isEmpty()
            r5 = 0
            if (r2 != 0) goto L71
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r7 = r6.e(r9, r7, r8, r0)
            if (r7 != r1) goto L70
            goto L7d
        L70:
            return r7
        L71:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r6.d(r7, r8, r0)
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            app.chalo.validationsdk.blevalidation.domain.qrvalidation.QrInfo r9 = (app.chalo.validationsdk.blevalidation.domain.qrvalidation.QrInfo) r9
            if (r9 == 0) goto L87
            java.util.List r7 = kotlin.collections.CollectionsKt.R(r9)
            return r7
        L87:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.f17557a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl.f(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        QRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1 qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1;
        if (continuationImpl instanceof QRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1) {
            qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1 = (QRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1) continuationImpl;
            int i = qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1 = new QRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1(this, continuationImpl);
            }
        } else {
            qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1 = new QRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1(this, continuationImpl);
        }
        Object objV = qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objV);
                qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1.label = 1;
                objV = productValidationData.v(qRValidationLifecycleDelegateImpl$getSafeStaticQRCode$1);
                if (objV == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objV);
            }
            return (String) objV;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.e.i(e2);
            return "";
        }
    }
}
