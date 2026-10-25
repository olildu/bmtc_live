package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.helper.BookingHelpConfigHelper;
import app.chalo.models.bookinghelp.BookingHelpAvailabilityAppModel;
import app.chalo.models.productbooking.productcapability.ProductCapabilityAppModel;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.Product;
import defpackage.b80;
import defpackage.mz0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleInitializationIntent$1", f = "QRValidationComponent.kt", l = {219, 222, 227, 229, 235, PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QRValidationIntent.InitializationIntent $intent;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleInitializationIntent$1(QRValidationComponent qRValidationComponent, QRValidationIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[PHI: r1
      0x007d: PHI (r1v8 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r1v6 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r1v10 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:19:0x007a, B:11:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x009d A[PHI: r1
      0x009d: PHI (r1v11 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r1v8 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r1v13 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:22:0x009a, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[PHI: r1 r11
      0x00b7: PHI (r1v14 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r1v11 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r1v17 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:25:0x00b4, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r11v15 java.lang.Object) = (r11v14 java.lang.Object), (r11v0 java.lang.Object) binds: [B:25:0x00b4, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductValidationData productValidationData;
        QRValidationComponent qRValidationComponent;
        ProductValidationAnalyticManager b;
        String sourceName;
        boolean z;
        QRValidationComponent$handleInitializationIntent$1 qRValidationComponent$handleInitializationIntent$1;
        Object objA;
        boolean z2;
        ProductValidationData productValidationData2;
        BookingHelpAvailabilityAppModel bookingHelpAvailabilityAppModel;
        Object objF0;
        BookingHelpAvailabilityAppModel bookingHelpAvailabilityAppModel2;
        boolean z3;
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                ResultKt.b(obj);
                ProductValidationConfig productValidationConfigQ0 = this.this$0.Q0();
                Product product = (Product) this.this$0.G.getValue();
                this.label = 1;
                obj = productValidationConfigQ0.l(product, this);
                if (obj != coroutineSingletons) {
                    productValidationData = (ProductValidationData) obj;
                    if (productValidationData != null) {
                        qRValidationComponent = this.this$0;
                        this.L$0 = productValidationData;
                        this.label = 2;
                        if (QRValidationComponent.J0(qRValidationComponent, this) != coroutineSingletons) {
                            QRValidationComponent qRValidationComponent2 = this.this$0;
                            qRValidationComponent2.H = productValidationData;
                            b = qRValidationComponent2.Q0().getB();
                            sourceName = this.$intent.f10638a.getSourceName();
                            this.L$0 = productValidationData;
                            this.label = 3;
                            if (b.w(productValidationData, sourceName, this) != coroutineSingletons) {
                                GetProductCapabilitiesUseCase getProductCapabilitiesUseCase = this.this$0.A;
                                String strA = productValidationData.a();
                                String strB = productValidationData.b();
                                this.L$0 = productValidationData;
                                this.label = 4;
                                obj = getProductCapabilitiesUseCase.a(strA, strB, "", this);
                                if (obj == coroutineSingletons) {
                                    z = ((ProductCapabilityAppModel) obj).f5677a;
                                    BookingHelpConfigHelper bookingHelpConfigHelper = this.this$0.y;
                                    String strA2 = productValidationData.a();
                                    String strB2 = productValidationData.b();
                                    this.L$0 = productValidationData;
                                    this.Z$0 = z;
                                    this.label = 5;
                                    qRValidationComponent$handleInitializationIntent$1 = this;
                                    objA = bookingHelpConfigHelper.a(strA2, strB2, "", qRValidationComponent$handleInitializationIntent$1, false);
                                    if (objA != coroutineSingletons) {
                                        ProductValidationData productValidationData3 = productValidationData;
                                        z2 = z;
                                        obj = objA;
                                        productValidationData2 = productValidationData3;
                                        bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) obj;
                                        QRValidationComponent qRValidationComponent3 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                        qRValidationComponent$handleInitializationIntent$1.L$0 = productValidationData2;
                                        qRValidationComponent$handleInitializationIntent$1.L$1 = bookingHelpAvailabilityAppModel;
                                        qRValidationComponent$handleInitializationIntent$1.Z$0 = z2;
                                        qRValidationComponent$handleInitializationIntent$1.label = 6;
                                        objF0 = QRValidationComponent.F0(qRValidationComponent3, this);
                                        if (objF0 != coroutineSingletons) {
                                            bookingHelpAvailabilityAppModel2 = bookingHelpAvailabilityAppModel;
                                            obj = objF0;
                                            z3 = z2;
                                            ProductValidationData productValidationData4 = productValidationData2;
                                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                            QRValidationComponent qRValidationComponent4 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                            qRValidationComponent4.E0(new b80(productValidationData4, qRValidationComponent4, bookingHelpAvailabilityAppModel2, zBooleanValue, z3, 2));
                                            QRValidationComponent qRValidationComponent5 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                            job = qRValidationComponent5.K;
                                            if (job != null) {
                                                ((JobSupport) job).cancel(null);
                                            }
                                            qRValidationComponent5.K = qRValidationComponent5.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData4, qRValidationComponent5, null));
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        QRValidationComponent qRValidationComponent6 = this.this$0;
                        qRValidationComponent6.q0(new mz0(qRValidationComponent6, 20));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 1:
                ResultKt.b(obj);
                productValidationData = (ProductValidationData) obj;
                if (productValidationData != null) {
                    qRValidationComponent = this.this$0;
                    this.L$0 = productValidationData;
                    this.label = 2;
                    if (QRValidationComponent.J0(qRValidationComponent, this) != coroutineSingletons) {
                        QRValidationComponent qRValidationComponent7 = this.this$0;
                        qRValidationComponent7.H = productValidationData;
                        b = qRValidationComponent7.Q0().getB();
                        sourceName = this.$intent.f10638a.getSourceName();
                        this.L$0 = productValidationData;
                        this.label = 3;
                        if (b.w(productValidationData, sourceName, this) != coroutineSingletons) {
                            GetProductCapabilitiesUseCase getProductCapabilitiesUseCase2 = this.this$0.A;
                            String strA3 = productValidationData.a();
                            String strB3 = productValidationData.b();
                            this.L$0 = productValidationData;
                            this.label = 4;
                            obj = getProductCapabilitiesUseCase2.a(strA3, strB3, "", this);
                            if (obj == coroutineSingletons) {
                                z = ((ProductCapabilityAppModel) obj).f5677a;
                                BookingHelpConfigHelper bookingHelpConfigHelper2 = this.this$0.y;
                                String strA4 = productValidationData.a();
                                String strB4 = productValidationData.b();
                                this.L$0 = productValidationData;
                                this.Z$0 = z;
                                this.label = 5;
                                qRValidationComponent$handleInitializationIntent$1 = this;
                                objA = bookingHelpConfigHelper2.a(strA4, strB4, "", qRValidationComponent$handleInitializationIntent$1, false);
                                if (objA != coroutineSingletons) {
                                    ProductValidationData productValidationData5 = productValidationData;
                                    z2 = z;
                                    obj = objA;
                                    productValidationData2 = productValidationData5;
                                    bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) obj;
                                    QRValidationComponent qRValidationComponent8 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                    qRValidationComponent$handleInitializationIntent$1.L$0 = productValidationData2;
                                    qRValidationComponent$handleInitializationIntent$1.L$1 = bookingHelpAvailabilityAppModel;
                                    qRValidationComponent$handleInitializationIntent$1.Z$0 = z2;
                                    qRValidationComponent$handleInitializationIntent$1.label = 6;
                                    objF0 = QRValidationComponent.F0(qRValidationComponent8, this);
                                    if (objF0 != coroutineSingletons) {
                                        bookingHelpAvailabilityAppModel2 = bookingHelpAvailabilityAppModel;
                                        obj = objF0;
                                        z3 = z2;
                                        ProductValidationData productValidationData6 = productValidationData2;
                                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                        QRValidationComponent qRValidationComponent9 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                        qRValidationComponent9.E0(new b80(productValidationData6, qRValidationComponent9, bookingHelpAvailabilityAppModel2, zBooleanValue2, z3, 2));
                                        QRValidationComponent qRValidationComponent10 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                        job = qRValidationComponent10.K;
                                        if (job != null) {
                                            ((JobSupport) job).cancel(null);
                                        }
                                        qRValidationComponent10.K = qRValidationComponent10.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData6, qRValidationComponent10, null));
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    return coroutineSingletons;
                }
                QRValidationComponent qRValidationComponent11 = this.this$0;
                qRValidationComponent11.q0(new mz0(qRValidationComponent11, 20));
                return Unit.f17538a;
            case 2:
                productValidationData = (ProductValidationData) this.L$0;
                ResultKt.b(obj);
                QRValidationComponent qRValidationComponent12 = this.this$0;
                qRValidationComponent12.H = productValidationData;
                b = qRValidationComponent12.Q0().getB();
                sourceName = this.$intent.f10638a.getSourceName();
                this.L$0 = productValidationData;
                this.label = 3;
                if (b.w(productValidationData, sourceName, this) != coroutineSingletons) {
                    GetProductCapabilitiesUseCase getProductCapabilitiesUseCase3 = this.this$0.A;
                    String strA5 = productValidationData.a();
                    String strB5 = productValidationData.b();
                    this.L$0 = productValidationData;
                    this.label = 4;
                    obj = getProductCapabilitiesUseCase3.a(strA5, strB5, "", this);
                    if (obj == coroutineSingletons) {
                        z = ((ProductCapabilityAppModel) obj).f5677a;
                        BookingHelpConfigHelper bookingHelpConfigHelper3 = this.this$0.y;
                        String strA6 = productValidationData.a();
                        String strB6 = productValidationData.b();
                        this.L$0 = productValidationData;
                        this.Z$0 = z;
                        this.label = 5;
                        qRValidationComponent$handleInitializationIntent$1 = this;
                        objA = bookingHelpConfigHelper3.a(strA6, strB6, "", qRValidationComponent$handleInitializationIntent$1, false);
                        if (objA != coroutineSingletons) {
                            ProductValidationData productValidationData7 = productValidationData;
                            z2 = z;
                            obj = objA;
                            productValidationData2 = productValidationData7;
                            bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) obj;
                            QRValidationComponent qRValidationComponent13 = qRValidationComponent$handleInitializationIntent$1.this$0;
                            qRValidationComponent$handleInitializationIntent$1.L$0 = productValidationData2;
                            qRValidationComponent$handleInitializationIntent$1.L$1 = bookingHelpAvailabilityAppModel;
                            qRValidationComponent$handleInitializationIntent$1.Z$0 = z2;
                            qRValidationComponent$handleInitializationIntent$1.label = 6;
                            objF0 = QRValidationComponent.F0(qRValidationComponent13, this);
                            if (objF0 != coroutineSingletons) {
                                bookingHelpAvailabilityAppModel2 = bookingHelpAvailabilityAppModel;
                                obj = objF0;
                                z3 = z2;
                                ProductValidationData productValidationData8 = productValidationData2;
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                QRValidationComponent qRValidationComponent14 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                qRValidationComponent14.E0(new b80(productValidationData8, qRValidationComponent14, bookingHelpAvailabilityAppModel2, zBooleanValue3, z3, 2));
                                QRValidationComponent qRValidationComponent15 = qRValidationComponent$handleInitializationIntent$1.this$0;
                                job = qRValidationComponent15.K;
                                if (job != null) {
                                    ((JobSupport) job).cancel(null);
                                }
                                qRValidationComponent15.K = qRValidationComponent15.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData8, qRValidationComponent15, null));
                                return Unit.f17538a;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons;
            case 3:
                productValidationData = (ProductValidationData) this.L$0;
                ResultKt.b(obj);
                GetProductCapabilitiesUseCase getProductCapabilitiesUseCase4 = this.this$0.A;
                String strA7 = productValidationData.a();
                String strB7 = productValidationData.b();
                this.L$0 = productValidationData;
                this.label = 4;
                obj = getProductCapabilitiesUseCase4.a(strA7, strB7, "", this);
                if (obj == coroutineSingletons) {
                    z = ((ProductCapabilityAppModel) obj).f5677a;
                    BookingHelpConfigHelper bookingHelpConfigHelper4 = this.this$0.y;
                    String strA8 = productValidationData.a();
                    String strB8 = productValidationData.b();
                    this.L$0 = productValidationData;
                    this.Z$0 = z;
                    this.label = 5;
                    qRValidationComponent$handleInitializationIntent$1 = this;
                    objA = bookingHelpConfigHelper4.a(strA8, strB8, "", qRValidationComponent$handleInitializationIntent$1, false);
                    if (objA != coroutineSingletons) {
                        ProductValidationData productValidationData9 = productValidationData;
                        z2 = z;
                        obj = objA;
                        productValidationData2 = productValidationData9;
                        bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) obj;
                        QRValidationComponent qRValidationComponent16 = qRValidationComponent$handleInitializationIntent$1.this$0;
                        qRValidationComponent$handleInitializationIntent$1.L$0 = productValidationData2;
                        qRValidationComponent$handleInitializationIntent$1.L$1 = bookingHelpAvailabilityAppModel;
                        qRValidationComponent$handleInitializationIntent$1.Z$0 = z2;
                        qRValidationComponent$handleInitializationIntent$1.label = 6;
                        objF0 = QRValidationComponent.F0(qRValidationComponent16, this);
                        if (objF0 != coroutineSingletons) {
                            bookingHelpAvailabilityAppModel2 = bookingHelpAvailabilityAppModel;
                            obj = objF0;
                            z3 = z2;
                            ProductValidationData productValidationData10 = productValidationData2;
                            boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                            QRValidationComponent qRValidationComponent17 = qRValidationComponent$handleInitializationIntent$1.this$0;
                            qRValidationComponent17.E0(new b80(productValidationData10, qRValidationComponent17, bookingHelpAvailabilityAppModel2, zBooleanValue4, z3, 2));
                            QRValidationComponent qRValidationComponent18 = qRValidationComponent$handleInitializationIntent$1.this$0;
                            job = qRValidationComponent18.K;
                            if (job != null) {
                                ((JobSupport) job).cancel(null);
                            }
                            qRValidationComponent18.K = qRValidationComponent18.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData10, qRValidationComponent18, null));
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                productValidationData = (ProductValidationData) this.L$0;
                ResultKt.b(obj);
                z = ((ProductCapabilityAppModel) obj).f5677a;
                BookingHelpConfigHelper bookingHelpConfigHelper5 = this.this$0.y;
                String strA9 = productValidationData.a();
                String strB9 = productValidationData.b();
                this.L$0 = productValidationData;
                this.Z$0 = z;
                this.label = 5;
                qRValidationComponent$handleInitializationIntent$1 = this;
                objA = bookingHelpConfigHelper5.a(strA9, strB9, "", qRValidationComponent$handleInitializationIntent$1, false);
                if (objA != coroutineSingletons) {
                    ProductValidationData productValidationData11 = productValidationData;
                    z2 = z;
                    obj = objA;
                    productValidationData2 = productValidationData11;
                    bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) obj;
                    QRValidationComponent qRValidationComponent19 = qRValidationComponent$handleInitializationIntent$1.this$0;
                    qRValidationComponent$handleInitializationIntent$1.L$0 = productValidationData2;
                    qRValidationComponent$handleInitializationIntent$1.L$1 = bookingHelpAvailabilityAppModel;
                    qRValidationComponent$handleInitializationIntent$1.Z$0 = z2;
                    qRValidationComponent$handleInitializationIntent$1.label = 6;
                    objF0 = QRValidationComponent.F0(qRValidationComponent19, this);
                    if (objF0 != coroutineSingletons) {
                        bookingHelpAvailabilityAppModel2 = bookingHelpAvailabilityAppModel;
                        obj = objF0;
                        z3 = z2;
                        ProductValidationData productValidationData12 = productValidationData2;
                        boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                        QRValidationComponent qRValidationComponent110 = qRValidationComponent$handleInitializationIntent$1.this$0;
                        qRValidationComponent110.E0(new b80(productValidationData12, qRValidationComponent110, bookingHelpAvailabilityAppModel2, zBooleanValue5, z3, 2));
                        QRValidationComponent qRValidationComponent111 = qRValidationComponent$handleInitializationIntent$1.this$0;
                        job = qRValidationComponent111.K;
                        if (job != null) {
                            ((JobSupport) job).cancel(null);
                        }
                        qRValidationComponent111.K = qRValidationComponent111.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData12, qRValidationComponent111, null));
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 5:
                z2 = this.Z$0;
                productValidationData2 = (ProductValidationData) this.L$0;
                ResultKt.b(obj);
                qRValidationComponent$handleInitializationIntent$1 = this;
                bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) obj;
                QRValidationComponent qRValidationComponent112 = qRValidationComponent$handleInitializationIntent$1.this$0;
                qRValidationComponent$handleInitializationIntent$1.L$0 = productValidationData2;
                qRValidationComponent$handleInitializationIntent$1.L$1 = bookingHelpAvailabilityAppModel;
                qRValidationComponent$handleInitializationIntent$1.Z$0 = z2;
                qRValidationComponent$handleInitializationIntent$1.label = 6;
                objF0 = QRValidationComponent.F0(qRValidationComponent112, this);
                if (objF0 != coroutineSingletons) {
                    bookingHelpAvailabilityAppModel2 = bookingHelpAvailabilityAppModel;
                    obj = objF0;
                    z3 = z2;
                    ProductValidationData productValidationData13 = productValidationData2;
                    boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                    QRValidationComponent qRValidationComponent113 = qRValidationComponent$handleInitializationIntent$1.this$0;
                    qRValidationComponent113.E0(new b80(productValidationData13, qRValidationComponent113, bookingHelpAvailabilityAppModel2, zBooleanValue6, z3, 2));
                    QRValidationComponent qRValidationComponent114 = qRValidationComponent$handleInitializationIntent$1.this$0;
                    job = qRValidationComponent114.K;
                    if (job != null) {
                        ((JobSupport) job).cancel(null);
                    }
                    qRValidationComponent114.K = qRValidationComponent114.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData13, qRValidationComponent114, null));
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 6:
                boolean z4 = this.Z$0;
                BookingHelpAvailabilityAppModel bookingHelpAvailabilityAppModel3 = (BookingHelpAvailabilityAppModel) this.L$1;
                productValidationData2 = (ProductValidationData) this.L$0;
                ResultKt.b(obj);
                qRValidationComponent$handleInitializationIntent$1 = this;
                z3 = z4;
                bookingHelpAvailabilityAppModel2 = bookingHelpAvailabilityAppModel3;
                ProductValidationData productValidationData14 = productValidationData2;
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                QRValidationComponent qRValidationComponent115 = qRValidationComponent$handleInitializationIntent$1.this$0;
                qRValidationComponent115.E0(new b80(productValidationData14, qRValidationComponent115, bookingHelpAvailabilityAppModel2, zBooleanValue7, z3, 2));
                QRValidationComponent qRValidationComponent116 = qRValidationComponent$handleInitializationIntent$1.this$0;
                job = qRValidationComponent116.K;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                qRValidationComponent116.K = qRValidationComponent116.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData14, qRValidationComponent116, null));
                return Unit.f17538a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
