package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketValidationPropertiesAppModel;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.UpdatePremiumReserveTicketToPunchedStatusUseCase;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
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
import defpackage.i5;
import defpackage.qv0;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumReserveTicketValidationData f7483a;
    public final ProductValidationAnalyticManager b;
    public final ProductValidationNavigationManager c;
    public final ProductValidationUIManager d;
    public final ProductValidationReportProblemManager e;
    public final GetPremiumReserveTicketByIdUseCase f;
    public final BasicInfoContract g;
    public final UserProfileDetailsProvider h;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase i;
    public final ProductsSyncContract j;
    public final UpdatePremiumReserveTicketToPunchedStatusUseCase k;

    public PremiumReserveTicketValidationConfig(PremiumReserveTicketValidationData premiumReserveTicketValidationData, ProductValidationAnalyticManager productValidationAnalyticManager, ProductValidationNavigationManager productValidationNavigationManager, ProductValidationUIManager productValidationUIManager, ProductValidationReportProblemManager productValidationReportProblemManager, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, ProductsSyncContract productsSyncContract, UpdatePremiumReserveTicketToPunchedStatusUseCase updatePremiumReserveTicketToPunchedStatusUseCase) {
        this.f7483a = premiumReserveTicketValidationData;
        this.b = productValidationAnalyticManager;
        this.c = productValidationNavigationManager;
        this.d = productValidationUIManager;
        this.e = productValidationReportProblemManager;
        this.f = getPremiumReserveTicketByIdUseCase;
        this.g = basicInfoContract;
        this.h = userProfileDetailsProvider;
        this.i = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.j = productsSyncContract;
        this.k = updatePremiumReserveTicketToPunchedStatusUseCase;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final String a(int i, String strToHash) {
        Intrinsics.i(strToHash, "strToHash");
        return GenerateHashCodeForEasyVerificationUseCase.a(i, strToHash);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object c(Continuation continuation) {
        return this.i.a(2, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object d(ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        ProductValidationModel h = productValidationData.getE();
        if (!(h instanceof PremiumReserveTicketValidationModel)) {
            return null;
        }
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = (PremiumReserveTicketValidationModel) h;
        return new PremiumReserveTicketValidationReceiptData(conductorValidationPunchData.b, conductorValidationPunchData.c, conductorValidationPunchData.d, conductorValidationPunchData.e, premiumReserveTicketValidationModel.f, premiumReserveTicketValidationModel.o, premiumReserveTicketValidationModel.p, premiumReserveTicketValidationModel.q, "", "", (Map) null, conductorValidationPunchData.f, "", RouteNamingSchemeType.DEFAULT, (RefundInfoAppModel) null, 17408);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ProductValidationUIManager getD() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        String strT;
        String str = "";
        if (!(punchNotification instanceof AppNotification.PunchNotification.PremiumReserveTicketPunchEvent)) {
            return null;
        }
        ProductValidationModel h = productValidationData.getE();
        if (!(h instanceof PremiumReserveTicketValidationModel)) {
            return null;
        }
        AppNotification.PunchNotification.PremiumReserveTicketPunchEvent premiumReserveTicketPunchEvent = (AppNotification.PunchNotification.PremiumReserveTicketPunchEvent) punchNotification;
        AnalyticsContract.DefaultImpls.a(this.b, "premium reserve ticket receipt payload", String.valueOf(Reflection.a(PremiumReserveTicketValidationConfig.class).f()), vo1.s(PaymentConstants.PAYLOAD, String.valueOf(premiumReserveTicketPunchEvent.g)), null, false, 24);
        try {
            String str2 = ((AppNotification.PunchNotification.PremiumReserveTicketPunchEvent) punchNotification).g;
            if (str2 != null && (strT = JsonElementExtensionsKt.t(ChaloJson.b.f(str2))) != null) {
                str = strT;
            }
        } catch (Exception unused) {
        }
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = (PremiumReserveTicketValidationModel) h;
        return new PremiumReserveTicketValidationReceiptData(premiumReserveTicketPunchEvent.c, premiumReserveTicketPunchEvent.d, premiumReserveTicketPunchEvent.e, premiumReserveTicketPunchEvent.f, premiumReserveTicketValidationModel.f, premiumReserveTicketValidationModel.o, premiumReserveTicketValidationModel.p, premiumReserveTicketValidationModel.q, "", "", (Map) null, str, "", RouteNamingSchemeType.DEFAULT, (RefundInfoAppModel) null, 17408);
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
        if (!Intrinsics.d(str, productPunchDataFromPolling.c)) {
            return null;
        }
        ProductValidationModel h = productValidationData.getE();
        if (!(h instanceof PremiumReserveTicketValidationModel)) {
            return null;
        }
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = (PremiumReserveTicketValidationModel) h;
        return new PremiumReserveTicketValidationReceiptData(productPunchDataFromPolling.c, productPunchDataFromPolling.f10501a, productPunchDataFromPolling.b, productPunchDataFromPolling.e, premiumReserveTicketValidationModel.f, premiumReserveTicketValidationModel.o, premiumReserveTicketValidationModel.p, premiumReserveTicketValidationModel.q, "", "", (Map) null, productPunchDataFromPolling.d, "", RouteNamingSchemeType.DEFAULT, (RefundInfoAppModel) null, 17408);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: j, reason: from getter */
    public final ProductValidationNavigationManager getC() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r4.j.b(r6) == r0) goto L30;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.notification.models.AppNotification.PunchNotification r5, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r6 = r8 instanceof app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onPunchEvent$1
            if (r6 == 0) goto L13
            r6 = r8
            app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onPunchEvent$1 r6 = (app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onPunchEvent$1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.label = r0
            goto L1a
        L13:
            app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onPunchEvent$1 r6 = new app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onPunchEvent$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r6.<init>(r4, r8)
        L1a:
            java.lang.Object r8 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.b(r8)
            goto L60
        L38:
            kotlin.ResultKt.b(r8)
            boolean r8 = r5 instanceof app.chalo.notification.models.AppNotification.PunchNotification.PremiumReserveTicketPunchEvent
            if (r8 != 0) goto L42
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L42:
            app.chalo.notification.models.AppNotification$PunchNotification$PremiumReserveTicketPunchEvent r5 = (app.chalo.notification.models.AppNotification.PunchNotification.PremiumReserveTicketPunchEvent) r5
            java.lang.String r5 = r5.c
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r5)
            if (r7 == 0) goto L6b
            r6.label = r3
            app.chalo.premiumbus.domain.UpdatePremiumReserveTicketToPunchedStatusUseCase r7 = r4.k
            app.chalo.premiumbus.data.repository.PremiumBusRepository r7 = r7.f7261a
            app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus r8 = app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus.PUNCHED
            java.lang.Object r5 = r7.g(r5, r8, r6)
            if (r5 != r0) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r5 = kotlin.Unit.f17538a
        L5d:
            if (r5 != r0) goto L60
            goto L6a
        L60:
            r6.label = r2
            app.chalo.contract.ProductsSyncContract r5 = r4.j
            java.lang.Object r5 = r5.b(r6)
            if (r5 != r0) goto L6c
        L6a:
            return r0
        L6b:
            r3 = 0
        L6c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig.k(app.chalo.notification.models.AppNotification$PunchNotification, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        PremiumReserveTicketValidationConfig$getProductData$1 premiumReserveTicketValidationConfig$getProductData$1;
        UserProfileAppModel userProfileAppModel;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        ProductValidationData productValidationData;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2;
        UserProfileAppModel userProfileDetails;
        ProductValidationData productValidationData2;
        if (continuationImpl instanceof PremiumReserveTicketValidationConfig$getProductData$1) {
            premiumReserveTicketValidationConfig$getProductData$1 = (PremiumReserveTicketValidationConfig$getProductData$1) continuationImpl;
            int i = premiumReserveTicketValidationConfig$getProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationConfig$getProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationConfig$getProductData$1 = new PremiumReserveTicketValidationConfig$getProductData$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketValidationConfig$getProductData$1 = new PremiumReserveTicketValidationConfig$getProductData$1(this, continuationImpl);
        }
        Object obj = premiumReserveTicketValidationConfig$getProductData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationConfig$getProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            UserProfileAppModel userProfileAppModelF = this.h.f();
            if (userProfileAppModelF == null) {
                return null;
            }
            Flow flowA = this.f.a(product.f10666a);
            premiumReserveTicketValidationConfig$getProductData$1.L$0 = userProfileAppModelF;
            premiumReserveTicketValidationConfig$getProductData$1.label = 1;
            Object objV = FlowKt.v(flowA, premiumReserveTicketValidationConfig$getProductData$1);
            if (objV != coroutineSingletons) {
                userProfileAppModel = userProfileAppModelF;
                obj = objV;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            userProfileAppModel = (UserProfileAppModel) premiumReserveTicketValidationConfig$getProductData$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) premiumReserveTicketValidationConfig$getProductData$1.L$4;
            productValidationData2 = (ProductValidationData) premiumReserveTicketValidationConfig$getProductData$1.L$3;
            productValidationData = (ProductValidationData) premiumReserveTicketValidationConfig$getProductData$1.L$2;
            premiumReserveTicketAppModel2 = (PremiumReserveTicketAppModel) premiumReserveTicketValidationConfig$getProductData$1.L$1;
            userProfileDetails = (UserProfileAppModel) premiumReserveTicketValidationConfig$getProductData$1.L$0;
            ResultKt.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        Intrinsics.i(premiumReserveTicketAppModel, "<this>");
        Intrinsics.i(userProfileDetails, "userProfileDetails");
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
        String str = premiumReserveTicketBookingPropertiesAppModel.g;
        String str2 = userProfileDetails.e;
        String strN = vo1.n(userProfileDetails.f10305a, " ", userProfileDetails.b);
        PremiumReserveTicketValidationUserDetails premiumReserveTicketValidationUserDetails = new PremiumReserveTicketValidationUserDetails(str, str2, strN, userProfileDetails.d, userProfileDetails.c);
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        String str3 = premiumReserveTicketTripPropertiesAppModel.f7117a;
        String str4 = premiumReserveTicketBookingPropertiesAppModel.i;
        PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel = premiumReserveTicketAppModel.c;
        String str5 = premiumReserveTicketValidationPropertiesAppModel.b;
        String str6 = premiumReserveTicketValidationPropertiesAppModel.f7118a;
        long j = premiumReserveTicketValidationPropertiesAppModel.c;
        int i3 = (int) premiumReserveTicketAppModel.d.f7115a;
        String str7 = premiumReserveTicketBookingPropertiesAppModel.f7114a;
        String str8 = premiumReserveTicketBookingPropertiesAppModel.e;
        String str9 = premiumReserveTicketBookingPropertiesAppModel.d;
        long j2 = premiumReserveTicketTripPropertiesAppModel.b;
        String str10 = premiumReserveTicketBookingPropertiesAppModel.f;
        ProductValidationData productValidationData3 = productValidationData;
        productValidationData2.m(new PremiumReserveTicketValidationModel(str3, str4, str5, str6, j, i3, str7, str8, str9, premiumReserveTicketValidationPropertiesAppModel.e, new i5(premiumReserveTicketAppModel, jLongValue, 3), premiumReserveTicketValidationUserDetails, str10, j2, premiumReserveTicketTripPropertiesAppModel.g.b, premiumReserveTicketTripPropertiesAppModel.h.b, premiumReserveTicketTripPropertiesAppModel.f, new qv0(premiumReserveTicketAppModel, 5)));
        HashMap map = new HashMap();
        map.put("userPropertyCity", str10);
        map.put("userPropertyUserName", strN);
        map.put("userPropertyPhoneNo", str2);
        map.put("userPropertyUserID", str);
        map.put("userPropertyOrderId", str7);
        productValidationData2.i(map);
        if (productValidationData2 instanceof PremiumReserveTicketValidationData) {
            Intrinsics.i(premiumReserveTicketAppModel2, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel2 = premiumReserveTicketAppModel2.f7113a;
            linkedHashMap.put("cityName", premiumReserveTicketBookingPropertiesAppModel2.f);
            linkedHashMap.put("configId", premiumReserveTicketBookingPropertiesAppModel2.c);
            linkedHashMap.put("tripId", premiumReserveTicketAppModel2.b.f7117a);
            ((PremiumReserveTicketValidationData) productValidationData2).f = linkedHashMap;
        }
        return productValidationData3;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel3 = (PremiumReserveTicketAppModel) obj;
        if (premiumReserveTicketAppModel3 == null) {
            return null;
        }
        premiumReserveTicketValidationConfig$getProductData$1.L$0 = userProfileAppModel;
        premiumReserveTicketValidationConfig$getProductData$1.L$1 = premiumReserveTicketAppModel3;
        PremiumReserveTicketValidationData premiumReserveTicketValidationData = this.f7483a;
        premiumReserveTicketValidationConfig$getProductData$1.L$2 = premiumReserveTicketValidationData;
        premiumReserveTicketValidationConfig$getProductData$1.L$3 = premiumReserveTicketValidationData;
        premiumReserveTicketValidationConfig$getProductData$1.L$4 = premiumReserveTicketAppModel3;
        premiumReserveTicketValidationConfig$getProductData$1.label = 2;
        Object objC = this.g.c(premiumReserveTicketValidationConfig$getProductData$1);
        if (objC != coroutineSingletons) {
            premiumReserveTicketAppModel = premiumReserveTicketAppModel3;
            productValidationData = premiumReserveTicketValidationData;
            premiumReserveTicketAppModel2 = premiumReserveTicketAppModel;
            obj = objC;
            userProfileDetails = userProfileAppModel;
            productValidationData2 = productValidationData;
            long jLongValue2 = ((Number) obj).longValue();
            Intrinsics.i(premiumReserveTicketAppModel, "<this>");
            Intrinsics.i(userProfileDetails, "userProfileDetails");
            PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel3 = premiumReserveTicketAppModel.f7113a;
            String str11 = premiumReserveTicketBookingPropertiesAppModel3.g;
            String str12 = userProfileDetails.e;
            String strN2 = vo1.n(userProfileDetails.f10305a, " ", userProfileDetails.b);
            PremiumReserveTicketValidationUserDetails premiumReserveTicketValidationUserDetails2 = new PremiumReserveTicketValidationUserDetails(str11, str12, strN2, userProfileDetails.d, userProfileDetails.c);
            PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel2 = premiumReserveTicketAppModel.b;
            String str13 = premiumReserveTicketTripPropertiesAppModel2.f7117a;
            String str14 = premiumReserveTicketBookingPropertiesAppModel3.i;
            PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel2 = premiumReserveTicketAppModel.c;
            String str15 = premiumReserveTicketValidationPropertiesAppModel2.b;
            String str16 = premiumReserveTicketValidationPropertiesAppModel2.f7118a;
            long j3 = premiumReserveTicketValidationPropertiesAppModel2.c;
            int i4 = (int) premiumReserveTicketAppModel.d.f7115a;
            String str17 = premiumReserveTicketBookingPropertiesAppModel3.f7114a;
            String str18 = premiumReserveTicketBookingPropertiesAppModel3.e;
            String str19 = premiumReserveTicketBookingPropertiesAppModel3.d;
            long j4 = premiumReserveTicketTripPropertiesAppModel2.b;
            String str110 = premiumReserveTicketBookingPropertiesAppModel3.f;
            ProductValidationData productValidationData4 = productValidationData;
            productValidationData2.m(new PremiumReserveTicketValidationModel(str13, str14, str15, str16, j3, i4, str17, str18, str19, premiumReserveTicketValidationPropertiesAppModel2.e, new i5(premiumReserveTicketAppModel, jLongValue2, 3), premiumReserveTicketValidationUserDetails2, str110, j4, premiumReserveTicketTripPropertiesAppModel2.g.b, premiumReserveTicketTripPropertiesAppModel2.h.b, premiumReserveTicketTripPropertiesAppModel2.f, new qv0(premiumReserveTicketAppModel, 5)));
            HashMap map2 = new HashMap();
            map2.put("userPropertyCity", str110);
            map2.put("userPropertyUserName", strN2);
            map2.put("userPropertyPhoneNo", str12);
            map2.put("userPropertyUserID", str11);
            map2.put("userPropertyOrderId", str17);
            productValidationData2.i(map2);
            if (productValidationData2 instanceof PremiumReserveTicketValidationData) {
                Intrinsics.i(premiumReserveTicketAppModel2, "<this>");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel4 = premiumReserveTicketAppModel2.f7113a;
                linkedHashMap2.put("cityName", premiumReserveTicketBookingPropertiesAppModel4.f);
                linkedHashMap2.put("configId", premiumReserveTicketBookingPropertiesAppModel4.c);
                linkedHashMap2.put("tripId", premiumReserveTicketAppModel2.b.f7117a);
                ((PremiumReserveTicketValidationData) productValidationData2).f = linkedHashMap2;
            }
            return productValidationData4;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m, reason: from getter */
    public final ProductValidationReportProblemManager getE() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r4.j.b(r6) == r0) goto L26;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(app.chalo.receipt.ProductReceiptData r5, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r6 = r8 instanceof app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onProductReceiptDataReceived$1
            if (r6 == 0) goto L13
            r6 = r8
            app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onProductReceiptDataReceived$1 r6 = (app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onProductReceiptDataReceived$1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.label = r0
            goto L1a
        L13:
            app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onProductReceiptDataReceived$1 r6 = new app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig$onProductReceiptDataReceived$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r6.<init>(r4, r8)
        L1a:
            java.lang.Object r8 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.b(r8)
            goto L69
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.b(r8)
            goto L5d
        L38:
            kotlin.ResultKt.b(r8)
            java.lang.String r8 = r5.getF10462a()
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r8)
            if (r7 == 0) goto L68
            java.lang.String r5 = r5.getF10462a()
            r6.label = r3
            app.chalo.premiumbus.domain.UpdatePremiumReserveTicketToPunchedStatusUseCase r7 = r4.k
            app.chalo.premiumbus.data.repository.PremiumBusRepository r7 = r7.f7261a
            app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus r8 = app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus.PUNCHED
            java.lang.Object r5 = r7.g(r5, r8, r6)
            if (r5 != r0) goto L58
            goto L5a
        L58:
            kotlin.Unit r5 = kotlin.Unit.f17538a
        L5a:
            if (r5 != r0) goto L5d
            goto L67
        L5d:
            r6.label = r2
            app.chalo.contract.ProductsSyncContract r5 = r4.j
            java.lang.Object r5 = r5.b(r6)
            if (r5 != r0) goto L69
        L67:
            return r0
        L68:
            r3 = 0
        L69:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig.n(app.chalo.receipt.ProductReceiptData, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
