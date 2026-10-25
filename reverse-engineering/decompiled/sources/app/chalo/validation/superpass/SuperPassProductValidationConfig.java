package app.chalo.validation.superpass;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.SuperPassPunchEvent;
import app.chalo.productpurchase.utils.SuperPassNotificationHelper;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.tito.domain.GetSuperPassForSuperPassIdUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductPunchDataFromPolling;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import app.chalo.validationsdk.legacy.Product;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validation/superpass/SuperPassProductValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassProductValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassValidationData f10459a;
    public final ProductValidationAnalyticManager b;
    public final ProductValidationNavigationManager c;
    public final ProductValidationUIManager d;
    public final ProductValidationReportProblemManager e;
    public final GetSuperPassForSuperPassIdUseCase f;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase g;
    public final ProductsSyncContract h;
    public final BasicInfoContract i;
    public final TimeUtilsContract j;

    public SuperPassProductValidationConfig(SuperPassValidationData superPassValidationData, ProductValidationAnalyticManager productValidationAnalyticManager, ProductValidationNavigationManager productValidationNavigationManager, ProductValidationUIManager productValidationUIManager, ProductValidationReportProblemManager productValidationReportProblemManager, GetSuperPassForSuperPassIdUseCase getSuperPassForSuperPassIdUseCase, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, ProductsSyncContract productsSyncContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f10459a = superPassValidationData;
        this.b = productValidationAnalyticManager;
        this.c = productValidationNavigationManager;
        this.d = productValidationUIManager;
        this.e = productValidationReportProblemManager;
        this.f = getSuperPassForSuperPassIdUseCase;
        this.g = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.h = productsSyncContract;
        this.i = basicInfoContract;
        this.j = timeUtilsContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final String a(int i, String strToHash) {
        Intrinsics.i(strToHash, "strToHash");
        return GenerateHashCodeForEasyVerificationUseCase.a(i, strToHash);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object c(Continuation continuation) {
        return this.g.a(2, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object d(ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ProductValidationUIManager getD() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        SuperPassProductValidationConfig$getReceiptDataFromPunchEvent$1 superPassProductValidationConfig$getReceiptDataFromPunchEvent$1;
        JsonElement jsonElementF;
        ProductValidationData productValidationData2 = productValidationData;
        if (continuationImpl instanceof SuperPassProductValidationConfig$getReceiptDataFromPunchEvent$1) {
            superPassProductValidationConfig$getReceiptDataFromPunchEvent$1 = (SuperPassProductValidationConfig$getReceiptDataFromPunchEvent$1) continuationImpl;
            int i = superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProductValidationConfig$getReceiptDataFromPunchEvent$1 = new SuperPassProductValidationConfig$getReceiptDataFromPunchEvent$1(this, continuationImpl);
            }
        } else {
            superPassProductValidationConfig$getReceiptDataFromPunchEvent$1 = new SuperPassProductValidationConfig$getReceiptDataFromPunchEvent$1(this, continuationImpl);
        }
        Object objX = superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            if (!(punchNotification instanceof SuperPassPunchEvent)) {
                return null;
            }
            jsonElementF = ChaloJson.b.f(((SuperPassPunchEvent) punchNotification).c);
            String strF = Reflection.a(SuperPassProductValidationConfig.class).f();
            if (strF == null) {
                strF = "SuperPassProductValidationConfig";
            }
            AnalyticsContract.DefaultImpls.a(this.b, "superPass receipt payload", strF, vo1.s(PaymentConstants.PAYLOAD, jsonElementF.toString()), null, false, 24);
            superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.L$0 = productValidationData2;
            superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.L$1 = jsonElementF;
            superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.label = 1;
            objX = productValidationData2.x(superPassProductValidationConfig$getReceiptDataFromPunchEvent$1);
            if (objX == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jsonElementF = (JsonElement) superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.L$1;
            productValidationData2 = (ProductValidationData) superPassProductValidationConfig$getReceiptDataFromPunchEvent$1.L$0;
            ResultKt.b(objX);
        }
        long jLongValue = ((Number) objX).longValue();
        try {
            SuperPassNotificationHelper superPassNotificationHelper = SuperPassNotificationHelper.f8705a;
            SuperPassTripReceipt superPassTripReceiptB = SuperPassNotificationHelper.b(jsonElementF, jLongValue);
            if (superPassTripReceiptB == null) {
                return null;
            }
            String endStopId = JsonElementExtensionsKt.t(jsonElementF);
            ProductValidationModel h = productValidationData2.getE();
            long e = h != null ? h.getG() : 0L;
            Map mapD = MapsKt.d();
            Intrinsics.i(endStopId, "endStopId");
            return new SuperPassReceiptData(superPassTripReceiptB.f9577a, superPassTripReceiptB.c, superPassTripReceiptB.e, e, superPassTripReceiptB.f, superPassTripReceiptB.g, superPassTripReceiptB.h, superPassTripReceiptB.i, superPassTripReceiptB.j, mapD, superPassTripReceiptB.b, superPassTripReceiptB.d, endStopId, superPassTripReceiptB.l, superPassTripReceiptB.m);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final /* bridge */ boolean g() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ProductValidationAnalyticManager getB() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object i(ProductPunchDataFromPolling productPunchDataFromPolling, ProductValidationData productValidationData, String str, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: j, reason: from getter */
    public final ProductValidationNavigationManager getC() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r7.h.b(r0) == r1) goto L35;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.notification.models.AppNotification.PunchNotification r8, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof app.chalo.validation.superpass.SuperPassProductValidationConfig$onPunchEvent$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.validation.superpass.SuperPassProductValidationConfig$onPunchEvent$1 r0 = (app.chalo.validation.superpass.SuperPassProductValidationConfig$onPunchEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            app.chalo.validation.superpass.SuperPassProductValidationConfig$onPunchEvent$1 r0 = new app.chalo.validation.superpass.SuperPassProductValidationConfig$onPunchEvent$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            r0.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r11)
            goto L91
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.L$1
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r0.L$0
            app.chalo.notification.models.AppNotification$PunchNotification r8 = (app.chalo.notification.models.AppNotification.PunchNotification) r8
            kotlin.ResultKt.b(r11)
            goto L58
        L41:
            kotlin.ResultKt.b(r11)
            boolean r11 = r8 instanceof app.chalo.notification.models.SuperPassPunchEvent
            if (r11 != 0) goto L4b
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L4b:
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r9.x(r0)
            if (r11 != r1) goto L58
            goto L8f
        L58:
            java.lang.Number r11 = (java.lang.Number) r11
            long r5 = r11.longValue()
            app.chalo.productpurchase.utils.SuperPassNotificationHelper r9 = app.chalo.productpurchase.utils.SuperPassNotificationHelper.f8705a     // Catch: java.lang.Exception -> L96
            kotlinx.serialization.json.Json r9 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> L96
            app.chalo.notification.models.SuperPassPunchEvent r8 = (app.chalo.notification.models.SuperPassPunchEvent) r8     // Catch: java.lang.Exception -> L96
            java.lang.String r8 = r8.c     // Catch: java.lang.Exception -> L96
            kotlinx.serialization.json.JsonElement r8 = r9.f(r8)     // Catch: java.lang.Exception -> L96
            app.chalo.superpass.data.models.entities.SuperPassTripReceipt r8 = app.chalo.productpurchase.utils.SuperPassNotificationHelper.b(r8, r5)     // Catch: java.lang.Exception -> L96
            r9 = 0
            if (r8 == 0) goto L74
            java.lang.String r11 = r8.f9577a
            goto L75
        L74:
            r11 = r9
        L75:
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)
            if (r10 == 0) goto L90
            long r10 = r8.e
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 >= 0) goto L90
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            app.chalo.contract.ProductsSyncContract r8 = r7.h
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L91
        L8f:
            return r1
        L90:
            r4 = 0
        L91:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L96:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validation.superpass.SuperPassProductValidationConfig.k(app.chalo.notification.models.AppNotification$PunchNotification, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:35:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        SuperPassProductValidationConfig$getProductData$1 superPassProductValidationConfig$getProductData$1;
        SuperPass superPass;
        ProductValidationData productValidationData;
        ProductValidationData productValidationData2;
        ProductValidationData productValidationData3;
        SuperPassValidationData superPassValidationData;
        ProductValidationData productValidationData4;
        if (continuationImpl instanceof SuperPassProductValidationConfig$getProductData$1) {
            superPassProductValidationConfig$getProductData$1 = (SuperPassProductValidationConfig$getProductData$1) continuationImpl;
            int i = superPassProductValidationConfig$getProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProductValidationConfig$getProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProductValidationConfig$getProductData$1 = new SuperPassProductValidationConfig$getProductData$1(this, continuationImpl);
            }
        } else {
            superPassProductValidationConfig$getProductData$1 = new SuperPassProductValidationConfig$getProductData$1(this, continuationImpl);
        }
        Object objA = superPassProductValidationConfig$getProductData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProductValidationConfig$getProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String str = product.f10666a;
            SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
            String str2 = product.c;
            companion.getClass();
            SuperPassSubType superPassSubTypeA = SuperPassSubType.Companion.a(str2);
            superPassProductValidationConfig$getProductData$1.label = 1;
            objA = this.f.a(str, superPassSubTypeA, superPassProductValidationConfig$getProductData$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                productValidationData = (ProductValidationData) superPassProductValidationConfig$getProductData$1.L$3;
                productValidationData2 = (ProductValidationData) superPassProductValidationConfig$getProductData$1.L$2;
                productValidationData3 = (ProductValidationData) superPassProductValidationConfig$getProductData$1.L$1;
                superPass = (SuperPass) superPassProductValidationConfig$getProductData$1.L$0;
                ResultKt.b(objA);
                productValidationData.m((ProductValidationModel) objA);
                Intrinsics.i(superPass, "<this>");
                HashMap map = new HashMap();
                SuperPassProperties superPassProperties = superPass.f9560a;
                map.put("userPropertyCity", superPassProperties.d);
                SuperPassUserDetails superPassUserDetails = superPass.getC().c;
                map.put("userPropertyUserName", superPassUserDetails.c);
                map.put("userPropertyPhoneNo", superPassUserDetails.b);
                map.put("userPropertyUserID", superPassUserDetails.f9580a);
                map.put("userPropertyAgencyName", superPassProperties.e);
                map.put("userPropertyMPassId", superPassProperties.f9566a);
                map.put("userPropertyOrderId", superPass.e.f9573a);
                productValidationData2.i(map);
                if (productValidationData2 instanceof SuperPassValidationData) {
                    return productValidationData3;
                }
                superPassValidationData = (SuperPassValidationData) productValidationData2;
                superPassProductValidationConfig$getProductData$1.L$0 = productValidationData3;
                superPassProductValidationConfig$getProductData$1.L$1 = superPassValidationData;
                superPassProductValidationConfig$getProductData$1.L$2 = null;
                superPassProductValidationConfig$getProductData$1.L$3 = null;
                superPassProductValidationConfig$getProductData$1.label = 3;
                objA = SuperPassProductValidationModelKt.a(superPass, superPassProductValidationConfig$getProductData$1);
                if (objA != coroutineSingletons) {
                    productValidationData4 = productValidationData3;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassValidationData = (SuperPassValidationData) superPassProductValidationConfig$getProductData$1.L$1;
            productValidationData4 = (ProductValidationData) superPassProductValidationConfig$getProductData$1.L$0;
            ResultKt.b(objA);
        }
        Map properties = (Map) objA;
        superPassValidationData.getClass();
        Intrinsics.i(properties, "properties");
        superPassValidationData.g = properties;
        return productValidationData4;
        superPass = (SuperPass) objA;
        if (superPass == null) {
            return null;
        }
        superPassProductValidationConfig$getProductData$1.L$0 = superPass;
        productValidationData = this.f10459a;
        superPassProductValidationConfig$getProductData$1.L$1 = productValidationData;
        superPassProductValidationConfig$getProductData$1.L$2 = productValidationData;
        superPassProductValidationConfig$getProductData$1.L$3 = productValidationData;
        superPassProductValidationConfig$getProductData$1.label = 2;
        objA = SuperPassProductValidationModelKt.b(superPass, this.i, this.j, superPassProductValidationConfig$getProductData$1);
        if (objA != coroutineSingletons) {
            productValidationData2 = productValidationData;
            productValidationData3 = productValidationData2;
            productValidationData.m((ProductValidationModel) objA);
            Intrinsics.i(superPass, "<this>");
            HashMap map2 = new HashMap();
            SuperPassProperties superPassProperties2 = superPass.f9560a;
            map2.put("userPropertyCity", superPassProperties2.d);
            SuperPassUserDetails superPassUserDetails2 = superPass.getC().c;
            map2.put("userPropertyUserName", superPassUserDetails2.c);
            map2.put("userPropertyPhoneNo", superPassUserDetails2.b);
            map2.put("userPropertyUserID", superPassUserDetails2.f9580a);
            map2.put("userPropertyAgencyName", superPassProperties2.e);
            map2.put("userPropertyMPassId", superPassProperties2.f9566a);
            map2.put("userPropertyOrderId", superPass.e.f9573a);
            productValidationData2.i(map2);
            if (productValidationData2 instanceof SuperPassValidationData) {
                return productValidationData3;
            }
            superPassValidationData = (SuperPassValidationData) productValidationData2;
            superPassProductValidationConfig$getProductData$1.L$0 = productValidationData3;
            superPassProductValidationConfig$getProductData$1.L$1 = superPassValidationData;
            superPassProductValidationConfig$getProductData$1.L$2 = null;
            superPassProductValidationConfig$getProductData$1.L$3 = null;
            superPassProductValidationConfig$getProductData$1.label = 3;
            objA = SuperPassProductValidationModelKt.a(superPass, superPassProductValidationConfig$getProductData$1);
            if (objA != coroutineSingletons) {
                productValidationData4 = productValidationData3;
                Map properties2 = (Map) objA;
                superPassValidationData.getClass();
                Intrinsics.i(properties2, "properties");
                superPassValidationData.g = properties2;
                return productValidationData4;
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m, reason: from getter */
    public final ProductValidationReportProblemManager getE() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r7.h.b(r0) == r1) goto L25;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(app.chalo.receipt.ProductReceiptData r8, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof app.chalo.validation.superpass.SuperPassProductValidationConfig$onProductReceiptDataReceived$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.validation.superpass.SuperPassProductValidationConfig$onProductReceiptDataReceived$1 r0 = (app.chalo.validation.superpass.SuperPassProductValidationConfig$onProductReceiptDataReceived$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            app.chalo.validation.superpass.SuperPassProductValidationConfig$onProductReceiptDataReceived$1 r0 = new app.chalo.validation.superpass.SuperPassProductValidationConfig$onProductReceiptDataReceived$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            r0.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r11)
            goto L7a
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.L$1
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r0.L$0
            app.chalo.receipt.ProductReceiptData r8 = (app.chalo.receipt.ProductReceiptData) r8
            kotlin.ResultKt.b(r11)
            goto L51
        L41:
            kotlin.ResultKt.b(r11)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r9.x(r0)
            if (r11 != r1) goto L51
            goto L78
        L51:
            java.lang.Number r11 = (java.lang.Number) r11
            long r5 = r11.longValue()
            java.lang.String r9 = r8.getF10462a()
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r10, r9)
            if (r9 == 0) goto L79
            long r8 = r8.getC()
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 >= 0) goto L79
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            app.chalo.contract.ProductsSyncContract r8 = r7.h
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L7a
        L78:
            return r1
        L79:
            r4 = 0
        L7a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validation.superpass.SuperPassProductValidationConfig.n(app.chalo.receipt.ProductReceiptData, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
