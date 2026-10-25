package app.chalo.mTicketing.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.tito.domain.GetMTicketForTicketIdUseCase;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
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
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketProductValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketProductValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicketValidationData f5389a;
    public final ProductValidationAnalyticManager b;
    public final ProductValidationNavigationManager c;
    public final ProductValidationUIManager d;
    public final ProductValidationReportProblemManager e;
    public final GetMTicketForTicketIdUseCase f;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase g;
    public final MTicketValidationConverters h;
    public final ProductsSyncContract i;

    public MTicketProductValidationConfig(MTicketValidationData mTicketValidationData, ProductValidationAnalyticManager productValidationAnalyticManager, ProductValidationNavigationManager productValidationNavigationManager, ProductValidationUIManager productValidationUIManager, ProductValidationReportProblemManager productValidationReportProblemManager, GetMTicketForTicketIdUseCase getMTicketForTicketIdUseCase, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, MTicketValidationConverters mTicketValidationConverters, MobileTicketingConverters mobileTicketingConverters, ProductsSyncContract productsSyncContract) {
        this.f5389a = mTicketValidationData;
        this.b = productValidationAnalyticManager;
        this.c = productValidationNavigationManager;
        this.d = productValidationUIManager;
        this.e = productValidationReportProblemManager;
        this.f = getMTicketForTicketIdUseCase;
        this.g = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.h = mTicketValidationConverters;
        this.i = productsSyncContract;
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
    public final ProductValidationUIManager getC() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        MTicketProductValidationConfig$getReceiptDataFromPunchEvent$1 mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1;
        MTicketTripReceipt mTicketTripReceiptI;
        if (continuationImpl instanceof MTicketProductValidationConfig$getReceiptDataFromPunchEvent$1) {
            mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1 = (MTicketProductValidationConfig$getReceiptDataFromPunchEvent$1) continuationImpl;
            int i = mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1 = new MTicketProductValidationConfig$getReceiptDataFromPunchEvent$1(this, continuationImpl);
            }
        } else {
            mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1 = new MTicketProductValidationConfig$getReceiptDataFromPunchEvent$1(this, continuationImpl);
        }
        Object objC = mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                if (!(punchNotification instanceof AppNotification.PunchNotification.MTicketPunchedEvent)) {
                    return null;
                }
                JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(((AppNotification.PunchNotification.MTicketPunchedEvent) punchNotification).c));
                AnalyticsContract.DefaultImpls.a(this.b, "MTicketPunchedEvent receipt payload", String.valueOf(Reflection.a(MTicketProductValidationConfig.class).f()), MapsKt.h(new Pair(PaymentConstants.PAYLOAD, jsonObjectG.toString())), null, false, 24);
                mTicketTripReceiptI = MobileTicketingConverters.i(jsonObjectG);
                if (mTicketTripReceiptI == null) {
                    return null;
                }
                GetMTicketForTicketIdUseCase getMTicketForTicketIdUseCase = this.f;
                String str = mTicketTripReceiptI.f5623a;
                mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1.L$0 = mTicketTripReceiptI;
                mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1.label = 1;
                objC = getMTicketForTicketIdUseCase.f9661a.c(str, mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mTicketTripReceiptI = (MTicketTripReceipt) mTicketProductValidationConfig$getReceiptDataFromPunchEvent$1.L$0;
                ResultKt.b(objC);
            }
            return this.h.b(mTicketTripReceiptI, (MTicket) objC);
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
    public final ProductValidationAnalyticManager getF8908a() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object i(ProductPunchDataFromPolling productPunchDataFromPolling, ProductValidationData productValidationData, String str, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: j, reason: from getter */
    public final ProductValidationNavigationManager getB() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r8.b(r0) == r1) goto L36;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.notification.models.AppNotification.PunchNotification r8, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof app.chalo.mTicketing.validation.MTicketProductValidationConfig$onPunchEvent$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.mTicketing.validation.MTicketProductValidationConfig$onPunchEvent$1 r0 = (app.chalo.mTicketing.validation.MTicketProductValidationConfig$onPunchEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            app.chalo.mTicketing.validation.MTicketProductValidationConfig$onPunchEvent$1 r0 = new app.chalo.mTicketing.validation.MTicketProductValidationConfig$onPunchEvent$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            r0.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Exception -> L97
            goto L92
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.L$0
            app.chalo.models.mticketing.MTicketTripReceipt r8 = (app.chalo.models.mticketing.MTicketTripReceipt) r8
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Exception -> L97
            goto L77
        L3c:
            kotlin.ResultKt.b(r11)
            boolean r11 = r8 instanceof app.chalo.notification.models.AppNotification.PunchNotification.MTicketPunchedEvent
            if (r11 != 0) goto L46
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L46:
            kotlinx.serialization.json.Json r11 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> L97
            app.chalo.notification.models.AppNotification$PunchNotification$MTicketPunchedEvent r8 = (app.chalo.notification.models.AppNotification.PunchNotification.MTicketPunchedEvent) r8     // Catch: java.lang.Exception -> L97
            java.lang.String r8 = r8.c     // Catch: java.lang.Exception -> L97
            kotlinx.serialization.json.JsonElement r8 = r11.f(r8)     // Catch: java.lang.Exception -> L97
            kotlinx.serialization.json.JsonObject r8 = kotlinx.serialization.json.JsonElementKt.g(r8)     // Catch: java.lang.Exception -> L97
            java.lang.String r11 = "ticketId"
            java.lang.String r2 = ""
            java.lang.String r11 = app.chalo.extensions.JsonElementExtensionsKt.s(r8, r11, r2)     // Catch: java.lang.Exception -> L97
            app.chalo.models.mticketing.MTicketTripReceipt r8 = app.chalo.utils.MobileTicketingConverters.i(r8)     // Catch: java.lang.Exception -> L97
            if (r8 != 0) goto L66
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L97
            return r8
        L66:
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)     // Catch: java.lang.Exception -> L97
            if (r10 == 0) goto L91
            r0.L$0 = r8     // Catch: java.lang.Exception -> L97
            r0.label = r4     // Catch: java.lang.Exception -> L97
            java.lang.Object r11 = r9.x(r0)     // Catch: java.lang.Exception -> L97
            if (r11 != r1) goto L77
            goto L90
        L77:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Exception -> L97
            long r9 = r11.longValue()     // Catch: java.lang.Exception -> L97
            long r5 = r8.c     // Catch: java.lang.Exception -> L97
            int r8 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r8 >= 0) goto L91
            app.chalo.contract.ProductsSyncContract r8 = r7.i     // Catch: java.lang.Exception -> L97
            r9 = 0
            r0.L$0 = r9     // Catch: java.lang.Exception -> L97
            r0.label = r3     // Catch: java.lang.Exception -> L97
            java.lang.Object r8 = r8.b(r0)     // Catch: java.lang.Exception -> L97
            if (r8 != r1) goto L92
        L90:
            return r1
        L91:
            r4 = 0
        L92:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L97
            return r8
        L97:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mTicketing.validation.MTicketProductValidationConfig.k(app.chalo.notification.models.AppNotification$PunchNotification, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        MTicketProductValidationConfig$getProductData$1 mTicketProductValidationConfig$getProductData$1;
        ProductValidationData productValidationData;
        ProductValidationData productValidationData2;
        MTicket mTicket;
        ProductValidationData productValidationData3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        UserProfile userProfile;
        String strA;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Boolean bool;
        String strValueOf;
        if (continuationImpl instanceof MTicketProductValidationConfig$getProductData$1) {
            mTicketProductValidationConfig$getProductData$1 = (MTicketProductValidationConfig$getProductData$1) continuationImpl;
            int i = mTicketProductValidationConfig$getProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketProductValidationConfig$getProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketProductValidationConfig$getProductData$1 = new MTicketProductValidationConfig$getProductData$1(this, continuationImpl);
            }
        } else {
            mTicketProductValidationConfig$getProductData$1 = new MTicketProductValidationConfig$getProductData$1(this, continuationImpl);
        }
        Object objC = mTicketProductValidationConfig$getProductData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketProductValidationConfig$getProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String str11 = product.f10666a;
            mTicketProductValidationConfig$getProductData$1.label = 1;
            objC = this.f.f9661a.c(str11, mTicketProductValidationConfig$getProductData$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productValidationData3 = (ProductValidationData) mTicketProductValidationConfig$getProductData$1.L$3;
            productValidationData = (ProductValidationData) mTicketProductValidationConfig$getProductData$1.L$2;
            productValidationData2 = (ProductValidationData) mTicketProductValidationConfig$getProductData$1.L$1;
            mTicket = (MTicket) mTicketProductValidationConfig$getProductData$1.L$0;
            ResultKt.b(objC);
        }
        productValidationData3.m((ProductValidationModel) objC);
        Intrinsics.i(mTicket, "mTicket");
        str = mTicket.f5615a;
        str2 = mTicket.e;
        str3 = mTicket.d;
        HashMap map = new HashMap();
        str4 = "";
        if (str3 == null) {
            str5 = "";
        } else {
            str5 = str3;
        }
        map.put("userPropertyCity", str5);
        userProfile = mTicket.o;
        if (userProfile != null || (strA = userProfile.a()) == null) {
            strA = "";
        }
        map.put("userPropertyUserName", strA);
        if (userProfile != null || (str6 = userProfile.g) == null) {
            str6 = "";
        }
        map.put("userPropertyPhoneNo", str6);
        if (userProfile != null || (str7 = userProfile.f5690a) == null) {
            str7 = "";
        }
        map.put("userPropertyUserID", str7);
        if (str2 == null) {
            str8 = "";
        } else {
            str8 = str2;
        }
        map.put("userPropertyAgencyName", str8);
        if (str == null) {
            str9 = "";
        } else {
            str9 = str;
        }
        map.put("userPropertyMPassId", str9);
        str10 = mTicket.x;
        if (str10 == null) {
            str10 = "";
        }
        map.put("userPropertyOrderId", str10);
        productValidationData.i(map);
        if (productValidationData instanceof MTicketValidationData) {
            MTicketValidationData mTicketValidationData = (MTicketValidationData) productValidationData;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            RouteStopsInfo routeStopsInfo = mTicket.f;
            linkedHashMap.put("bookingId", str);
            MobileTicketingConverters mobileTicketingConverters = (MobileTicketingConverters) MixpanelUtil.f.getValue();
            Map map2 = mTicket.h;
            mobileTicketingConverters.getClass();
            linkedHashMap.put("passengerTypes", MobileTicketingConverters.j(map2));
            linkedHashMap.put("fare", String.valueOf(((MTicketUtilsHelper) MixpanelUtil.e.getValue()).i(mTicket)));
            linkedHashMap.put("startDate", MixpanelUtil.d().Q(mTicket.i));
            linkedHashMap.put("expiryDate", MixpanelUtil.d().Q(mTicket.j));
            linkedHashMap.put("city", str3);
            linkedHashMap.put("agency", str2);
            linkedHashMap.put("upTripRouteId", routeStopsInfo.f1717a);
            linkedHashMap.put("upTripStartStopId", routeStopsInfo.c);
            linkedHashMap.put("upTripEndStopId", routeStopsInfo.e);
            bool = mTicket.s;
            if (bool != null && (strValueOf = String.valueOf(bool.booleanValue())) != null) {
                str4 = strValueOf;
            }
            linkedHashMap.put("isFreeRide", str4);
            mTicketValidationData.i = linkedHashMap;
        }
        return productValidationData2;
        MTicket mTicket2 = (MTicket) objC;
        if (mTicket2 == null) {
            return null;
        }
        mTicketProductValidationConfig$getProductData$1.L$0 = mTicket2;
        MTicketValidationData mTicketValidationData2 = this.f5389a;
        mTicketProductValidationConfig$getProductData$1.L$1 = mTicketValidationData2;
        mTicketProductValidationConfig$getProductData$1.L$2 = mTicketValidationData2;
        mTicketProductValidationConfig$getProductData$1.L$3 = mTicketValidationData2;
        mTicketProductValidationConfig$getProductData$1.label = 2;
        Object objA = this.h.a(mTicket2, mTicketProductValidationConfig$getProductData$1);
        if (objA != coroutineSingletons) {
            productValidationData = mTicketValidationData2;
            productValidationData2 = productValidationData;
            objC = objA;
            mTicket = mTicket2;
            productValidationData3 = productValidationData2;
            productValidationData3.m((ProductValidationModel) objC);
            Intrinsics.i(mTicket, "mTicket");
            str = mTicket.f5615a;
            str2 = mTicket.e;
            str3 = mTicket.d;
            HashMap map3 = new HashMap();
            str4 = "";
            if (str3 == null) {
                str5 = "";
            } else {
                str5 = str3;
            }
            map3.put("userPropertyCity", str5);
            userProfile = mTicket.o;
            if (userProfile != null) {
                strA = "";
            } else {
                strA = "";
            }
            map3.put("userPropertyUserName", strA);
            if (userProfile != null) {
                str6 = "";
            } else {
                str6 = "";
            }
            map3.put("userPropertyPhoneNo", str6);
            if (userProfile != null) {
                str7 = "";
            } else {
                str7 = "";
            }
            map3.put("userPropertyUserID", str7);
            if (str2 == null) {
                str8 = "";
            } else {
                str8 = str2;
            }
            map3.put("userPropertyAgencyName", str8);
            if (str == null) {
                str9 = "";
            } else {
                str9 = str;
            }
            map3.put("userPropertyMPassId", str9);
            str10 = mTicket.x;
            if (str10 == null) {
                str10 = "";
            }
            map3.put("userPropertyOrderId", str10);
            productValidationData.i(map3);
            if (productValidationData instanceof MTicketValidationData) {
                MTicketValidationData mTicketValidationData3 = (MTicketValidationData) productValidationData;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                MixpanelUtil mixpanelUtil2 = MixpanelUtil.f9617a;
                RouteStopsInfo routeStopsInfo2 = mTicket.f;
                linkedHashMap2.put("bookingId", str);
                MobileTicketingConverters mobileTicketingConverters2 = (MobileTicketingConverters) MixpanelUtil.f.getValue();
                Map map4 = mTicket.h;
                mobileTicketingConverters2.getClass();
                linkedHashMap2.put("passengerTypes", MobileTicketingConverters.j(map4));
                linkedHashMap2.put("fare", String.valueOf(((MTicketUtilsHelper) MixpanelUtil.e.getValue()).i(mTicket)));
                linkedHashMap2.put("startDate", MixpanelUtil.d().Q(mTicket.i));
                linkedHashMap2.put("expiryDate", MixpanelUtil.d().Q(mTicket.j));
                linkedHashMap2.put("city", str3);
                linkedHashMap2.put("agency", str2);
                linkedHashMap2.put("upTripRouteId", routeStopsInfo2.f1717a);
                linkedHashMap2.put("upTripStartStopId", routeStopsInfo2.c);
                linkedHashMap2.put("upTripEndStopId", routeStopsInfo2.e);
                bool = mTicket.s;
                if (bool != null) {
                    str4 = strValueOf;
                }
                linkedHashMap2.put("isFreeRide", str4);
                mTicketValidationData3.i = linkedHashMap2;
            }
            return productValidationData2;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m, reason: from getter */
    public final ProductValidationReportProblemManager getD() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r7.i.b(r0) == r1) goto L25;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(app.chalo.receipt.ProductReceiptData r8, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof app.chalo.mTicketing.validation.MTicketProductValidationConfig$onProductReceiptDataReceived$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.mTicketing.validation.MTicketProductValidationConfig$onProductReceiptDataReceived$1 r0 = (app.chalo.mTicketing.validation.MTicketProductValidationConfig$onProductReceiptDataReceived$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            app.chalo.mTicketing.validation.MTicketProductValidationConfig$onProductReceiptDataReceived$1 r0 = new app.chalo.mTicketing.validation.MTicketProductValidationConfig$onProductReceiptDataReceived$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            r0.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r11)
            goto L71
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.L$0
            app.chalo.receipt.ProductReceiptData r8 = (app.chalo.receipt.ProductReceiptData) r8
            kotlin.ResultKt.b(r11)
            goto L54
        L3c:
            kotlin.ResultKt.b(r11)
            java.lang.String r11 = r8.getF10462a()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)
            if (r10 == 0) goto L70
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r11 = r9.x(r0)
            if (r11 != r1) goto L54
            goto L6f
        L54:
            java.lang.Number r11 = (java.lang.Number) r11
            long r9 = r11.longValue()
            long r5 = r8.getC()
            int r8 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r8 >= 0) goto L70
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            app.chalo.contract.ProductsSyncContract r8 = r7.i
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L71
        L6f:
            return r1
        L70:
            r4 = 0
        L71:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mTicketing.validation.MTicketProductValidationConfig.n(app.chalo.receipt.ProductReceiptData, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
