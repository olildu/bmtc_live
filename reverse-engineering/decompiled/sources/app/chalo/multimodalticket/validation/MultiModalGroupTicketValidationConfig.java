package app.chalo.multimodalticket.validation;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.notification.models.AppNotification;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
import app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate;
import app.chalo.validationsdk.blevalidation.config.MultiProductValidationConfig;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigFactory;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductPunchDataFromPolling;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import defpackage.gd0;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/config/MultiProductValidationConfig;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationConfig implements MultiProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketRepository f5975a;
    public final MultiModalGroupTicketValidationData b;
    public final MultiModalGroupTicketValidationReportProblemManager c;
    public final MultiModalValidationUIManager d;
    public final ProductValidationConfigFactory e;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase f;
    public final MultiModalValidationNavigationManager g;
    public final MultiModalGroupTicketValidationAnalyticsManagerFactory h;
    public final MutexImpl i = MutexKt.a();
    public volatile List j = EmptyList.f17557a;
    public final MultiModalGroupTicketValidationConfig$childResolver$1 k = new MultiModalChildResolver() { // from class: app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationConfig$childResolver$1
        @Override // app.chalo.multimodalticket.validation.MultiModalChildResolver
        public final MultiModalChildValidationTarget a(ValidationPayloadIdentity validationPayloadIdentity) {
            Object next;
            Iterator it = this.f5976a.b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!MultiModalGroupTicketValidationConfig.o((ChildValidationDelegate) next, validationPayloadIdentity));
            ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) next;
            if (childValidationDelegate != null) {
                return new MultiModalChildValidationTarget(childValidationDelegate.b, childValidationDelegate.c);
            }
            return null;
        }

        @Override // app.chalo.multimodalticket.validation.MultiModalChildResolver
        public final MultiModalChildValidationTarget b(ProductValidationData data) {
            Object next;
            Intrinsics.i(data, "data");
            Iterator it = this.f5976a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ProductValidationData productValidationData = ((ChildValidationDelegate) next).b;
                if (productValidationData == data || (productValidationData.getId().equals(data.getId()) && productValidationData.a().equals(data.a()) && productValidationData.b().equals(data.b()))) {
                    break;
                }
            }
            ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) next;
            if (childValidationDelegate != null) {
                return new MultiModalChildValidationTarget(childValidationDelegate.b, childValidationDelegate.c);
            }
            return null;
        }
    };
    public final Lazy l = LazyKt.b(new gd0(this, 17));

    /* JADX WARN: Type inference failed for: r1v3, types: [app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationConfig$childResolver$1] */
    public MultiModalGroupTicketValidationConfig(MultiModalGroupTicketRepository multiModalGroupTicketRepository, MultiModalGroupTicketValidationData multiModalGroupTicketValidationData, MultiModalGroupTicketValidationReportProblemManager multiModalGroupTicketValidationReportProblemManager, MultiModalValidationUIManager multiModalValidationUIManager, ProductValidationConfigFactory productValidationConfigFactory, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, MultiModalValidationNavigationManager multiModalValidationNavigationManager, MultiModalGroupTicketValidationAnalyticsManagerFactory multiModalGroupTicketValidationAnalyticsManagerFactory) {
        this.f5975a = multiModalGroupTicketRepository;
        this.b = multiModalGroupTicketValidationData;
        this.c = multiModalGroupTicketValidationReportProblemManager;
        this.d = multiModalValidationUIManager;
        this.e = productValidationConfigFactory;
        this.f = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.g = multiModalValidationNavigationManager;
        this.h = multiModalGroupTicketValidationAnalyticsManagerFactory;
    }

    public static boolean o(ChildValidationDelegate childValidationDelegate, ValidationPayloadIdentity validationPayloadIdentity) {
        ProductValidationData productValidationData = childValidationDelegate.b;
        String id = productValidationData.getId();
        String str = validationPayloadIdentity.f5982a;
        String str2 = validationPayloadIdentity.c;
        String str3 = validationPayloadIdentity.b;
        if (!id.equals(str)) {
            return false;
        }
        if (str3 == null || productValidationData.a().equals(str3)) {
            return str2 == null || productValidationData.b().equals(str2);
        }
        return false;
    }

    public static ValidationProduct.MobileTicketProduct p(MultiModalGroupTicketChildAppModel multiModalGroupTicketChildAppModel) {
        if (multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.InstantTicketChild) {
            return new ValidationProduct.MobileTicketProduct.InstantTicketValidation(((MultiModalGroupTicketChildAppModel.InstantTicketChild) multiModalGroupTicketChildAppModel).b.f3881a);
        }
        if (multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.OndcMetroTicketChild) {
            return new ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation(((MultiModalGroupTicketChildAppModel.OndcMetroTicketChild) multiModalGroupTicketChildAppModel).b.f6769a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final String a(int i, String strToHash) {
        Intrinsics.i(strToHash, "strToHash");
        return GenerateHashCodeForEasyVerificationUseCase.a(i, strToHash);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.MultiProductValidationConfig
    public final List b() {
        return CollectionsKt.D0(this.j);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object c(Continuation continuation) {
        return this.f.a(2, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object d(ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1 multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1;
        Object next;
        String str;
        if (continuationImpl instanceof MultiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1) {
            multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1 = (MultiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1) continuationImpl;
            int i = multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1 = new MultiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1 = new MultiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1(this, continuationImpl);
        }
        Object objD = multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            Intrinsics.i(conductorValidationPunchData, "<this>");
            ValidationPayloadIdentity validationPayloadIdentity = new ValidationPayloadIdentity(conductorValidationPunchData.b, conductorValidationPunchData.c, conductorValidationPunchData.d);
            Iterator it = b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!o((ChildValidationDelegate) next, validationPayloadIdentity));
            ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) next;
            if (childValidationDelegate != null) {
                ProductValidationData productValidationData2 = childValidationDelegate.b;
                String id = productValidationData2.getId();
                ProductValidationConfig productValidationConfig = childValidationDelegate.c;
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1.L$0 = id;
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1.label = 1;
                objD = productValidationConfig.d(conductorValidationPunchData, productValidationData2, multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = id;
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) multiModalGroupTicketValidationConfig$getProductReceiptDataFromBleDataReceived$1.L$0;
        ResultKt.b(objD);
        ProductReceiptData productReceiptData = (ProductReceiptData) objD;
        if (productReceiptData == null || !Intrinsics.d(productReceiptData.getF10462a(), str)) {
            return null;
        }
        return productReceiptData;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: e */
    public final ProductValidationUIManager getD() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1 multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1;
        Object next;
        String str;
        if (continuationImpl instanceof MultiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1) {
            multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1 = (MultiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1) continuationImpl;
            int i = multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1 = new MultiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1 = new MultiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1(this, continuationImpl);
        }
        Object objF = multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            ValidationPayloadIdentity validationPayloadIdentityA = MultiModalGroupTicketValidationPayloadKt.a(punchNotification);
            if (validationPayloadIdentityA != null) {
                Iterator it = b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!o((ChildValidationDelegate) next, validationPayloadIdentityA));
                ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) next;
                if (childValidationDelegate != null) {
                    ProductValidationData productValidationData2 = childValidationDelegate.b;
                    String id = productValidationData2.getId();
                    ProductValidationConfig productValidationConfig = childValidationDelegate.c;
                    multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1.L$0 = id;
                    multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1.label = 1;
                    objF = productValidationConfig.f(punchNotification, productValidationData2, multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1);
                    if (objF == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = id;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) multiModalGroupTicketValidationConfig$getReceiptDataFromPunchEvent$1.L$0;
        ResultKt.b(objF);
        ProductReceiptData productReceiptData = (ProductReceiptData) objF;
        if (productReceiptData == null || !Intrinsics.d(productReceiptData.getF10462a(), str)) {
            return null;
        }
        return productReceiptData;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final /* bridge */ boolean g() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: h */
    public final ProductValidationAnalyticManager getB() {
        return (ProductValidationAnalyticManager) this.l.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object i(ProductPunchDataFromPolling productPunchDataFromPolling, ProductValidationData productValidationData, String str, ContinuationImpl continuationImpl) {
        MultiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1 multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1;
        Object next;
        String str2;
        if (continuationImpl instanceof MultiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1) {
            multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1 = (MultiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1) continuationImpl;
            int i = multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1.label = i - Integer.MIN_VALUE;
            } else {
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1 = new MultiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1(this, continuationImpl);
            }
        } else {
            multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1 = new MultiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1(this, continuationImpl);
        }
        Object objI = multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            Intrinsics.i(productPunchDataFromPolling, "<this>");
            ValidationPayloadIdentity validationPayloadIdentity = new ValidationPayloadIdentity(productPunchDataFromPolling.c, productPunchDataFromPolling.f10501a, productPunchDataFromPolling.b);
            Iterator it = b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!o((ChildValidationDelegate) next, validationPayloadIdentity));
            ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) next;
            if (childValidationDelegate != null) {
                ProductValidationData productValidationData2 = childValidationDelegate.b;
                String id = productValidationData2.getId();
                ProductValidationConfig productValidationConfig = childValidationDelegate.c;
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1.L$0 = id;
                multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1.label = 1;
                objI = productValidationConfig.i(productPunchDataFromPolling, productValidationData2, id, multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1);
                if (objI == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = id;
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) multiModalGroupTicketValidationConfig$getProductReceiptDataFromProductPunchDataFromPolling$1.L$0;
        ResultKt.b(objI);
        ProductReceiptData productReceiptData = (ProductReceiptData) objI;
        if (productReceiptData == null || !Intrinsics.d(productReceiptData.getF10462a(), str2)) {
            return null;
        }
        return productReceiptData;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: j */
    public final ProductValidationNavigationManager getC() {
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object k(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, String str, Continuation continuation) {
        Object next;
        ValidationPayloadIdentity validationPayloadIdentityA = MultiModalGroupTicketValidationPayloadKt.a(punchNotification);
        if (validationPayloadIdentityA == null) {
            return Boolean.FALSE;
        }
        Iterator it = b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!o((ChildValidationDelegate) next, validationPayloadIdentityA));
        ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) next;
        if (childValidationDelegate == null) {
            return Boolean.FALSE;
        }
        ProductValidationData productValidationData2 = childValidationDelegate.b;
        return childValidationDelegate.c.k(punchNotification, productValidationData2, productValidationData2.getId(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:14:0x0048, B:53:0x015d, B:55:0x0161, B:58:0x016e, B:47:0x0119, B:49:0x011f, B:59:0x0178, B:62:0x018a, B:63:0x0193, B:65:0x0199, B:66:0x01b4, B:68:0x01c0, B:71:0x01cd, B:21:0x005d, B:31:0x0099, B:33:0x009d, B:36:0x00aa, B:37:0x00bb, B:39:0x00c1, B:40:0x00cf, B:42:0x00df, B:43:0x00ef, B:45:0x00fd, B:46:0x0109, B:28:0x0083), top: B:76:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0161 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:14:0x0048, B:53:0x015d, B:55:0x0161, B:58:0x016e, B:47:0x0119, B:49:0x011f, B:59:0x0178, B:62:0x018a, B:63:0x0193, B:65:0x0199, B:66:0x01b4, B:68:0x01c0, B:71:0x01cd, B:21:0x005d, B:31:0x0099, B:33:0x009d, B:36:0x00aa, B:37:0x00bb, B:39:0x00c1, B:40:0x00cf, B:42:0x00df, B:43:0x00ef, B:45:0x00fd, B:46:0x0109, B:28:0x0083), top: B:76:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x016e A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #0 {all -> 0x004d, blocks: (B:14:0x0048, B:53:0x015d, B:55:0x0161, B:58:0x016e, B:47:0x0119, B:49:0x011f, B:59:0x0178, B:62:0x018a, B:63:0x0193, B:65:0x0199, B:66:0x01b4, B:68:0x01c0, B:71:0x01cd, B:21:0x005d, B:31:0x0099, B:33:0x009d, B:36:0x00aa, B:37:0x00bb, B:39:0x00c1, B:40:0x00cf, B:42:0x00df, B:43:0x00ef, B:45:0x00fd, B:46:0x0109, B:28:0x0083), top: B:76:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01fb: INVOKE (r10 I:kotlinx.coroutines.sync.Mutex), (r7 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.e(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:508), block:B:74:0x01fb */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015c -> B:53:0x015d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final java.lang.Object l(app.chalo.validationsdk.legacy.Product r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationConfig.l(app.chalo.validationsdk.legacy.Product, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m */
    public final ProductValidationReportProblemManager getE() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object n(ProductReceiptData productReceiptData, ProductValidationData productValidationData, String str, Continuation continuation) {
        Object next;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) next;
            if (childValidationDelegate.b.getId().equals(productReceiptData.getF10462a()) && childValidationDelegate.b.b().equals(productReceiptData.getB())) {
                break;
            }
        }
        ChildValidationDelegate childValidationDelegate2 = (ChildValidationDelegate) next;
        if (childValidationDelegate2 == null) {
            return Boolean.FALSE;
        }
        ProductValidationData productValidationData2 = childValidationDelegate2.b;
        return childValidationDelegate2.c.n(productReceiptData, productValidationData2, productValidationData2.getId(), continuation);
    }
}
