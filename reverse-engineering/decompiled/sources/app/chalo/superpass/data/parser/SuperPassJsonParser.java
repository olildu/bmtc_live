package app.chalo.superpass.data.parser;

import androidx.autofill.HintConstants;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.data.RefundStatus;
import app.chalo.datastore.LocalDataStore;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.features.productsync.model.app.RideType;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.models.ProductBranding;
import app.chalo.models.products.SuperPassRideBookingAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ProductReceiptDataKt;
import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import app.chalo.superpass.data.models.entities.CashPaymentPendingTransactionDetails;
import app.chalo.superpass.data.models.entities.FareBreakupComponent;
import app.chalo.superpass.data.models.entities.FareInfo;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import app.chalo.superpass.data.models.entities.ProfileRejectionReason;
import app.chalo.superpass.data.models.entities.ProofRejectionReason;
import app.chalo.superpass.data.models.entities.RejectionStatus;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetailsRoom;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassUIProperties;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties;
import app.chalo.superpass.data.models.entities.RideRollOverBannerCta;
import app.chalo.superpass.data.models.entities.RideRollOverBannerCtaActionType;
import app.chalo.superpass.data.models.entities.RideRollOverMeta;
import app.chalo.superpass.data.models.entities.SuperPassActivationTimestampMapHelper;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassProofProperties;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.entities.SuperPassRideDetails;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.entities.SuperPassTransactionDetails;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.superpass.data.models.entities.SuperPassUIProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.models.entities.SuperPassValidationProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassTransactionDetails;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassUIProperties;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.userprofile.Gender;
import app.chalo.utils.UtilsKT;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import defpackage.vo1;
import defpackage.z40;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/parser/SuperPassJsonParser;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassJsonParser implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassJsonParser f9587a;
    public static final Object b;
    public static final Object c;
    public static final Object d;

    static {
        final SuperPassJsonParser superPassJsonParser = new SuperPassJsonParser();
        f9587a = superPassJsonParser;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<CrashlyticsLogger>() { // from class: app.chalo.superpass.data.parser.SuperPassJsonParser$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9588a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
        c = LazyKt.a(lazyThreadSafetyMode, new Function0<BasicInfoContract>() { // from class: app.chalo.superpass.data.parser.SuperPassJsonParser$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9589a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BasicInfoContract.class), null, null);
            }
        });
        d = LazyKt.a(lazyThreadSafetyMode, new Function0<SuperPassRepository>() { // from class: app.chalo.superpass.data.parser.SuperPassJsonParser$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9590a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(SuperPassRepository.class), null, null);
            }
        });
    }

    public static ArrayList a(JsonArray jsonArray) {
        ProductConfigServiceType productConfigServiceTypeValueOf;
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            List list = jsonArray.f18186a;
            if (list.size() > 0) {
                Iterator<Integer> it = RangesKt.o(0, list.size()).iterator();
                while (((IntProgressionIterator) it).c) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    ProductConfigServiceType.Companion companion = ProductConfigServiceType.INSTANCE;
                    String str = JsonElementExtensionsKt.r(jsonArray, iNextInt);
                    companion.getClass();
                    Intrinsics.i(str, "str");
                    try {
                        productConfigServiceTypeValueOf = ProductConfigServiceType.valueOf(str);
                    } catch (IllegalArgumentException unused) {
                        productConfigServiceTypeValueOf = ProductConfigServiceType.UNKNOWN;
                    }
                    if (productConfigServiceTypeValueOf != ProductConfigServiceType.UNKNOWN) {
                        arrayList.add(productConfigServiceTypeValueOf);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(ProductConfigServiceType.REGULAR);
        }
        return arrayList;
    }

    public static boolean b(JsonObject jsonObject) {
        if (jsonObject == null || !JsonElementExtensionsKt.l("productType", jsonObject) || !JsonElementExtensionsKt.l("productSubType", jsonObject)) {
            return false;
        }
        String strJ = JsonElementExtensionsKt.j(jsonObject, "productType");
        String strJ2 = JsonElementExtensionsKt.j(jsonObject, "productSubType");
        if (Intrinsics.d(strJ, "superPass")) {
            return Intrinsics.d(strJ2, "magicPass") || Intrinsics.d(strJ2, "rideBasedPass");
        }
        return false;
    }

    public static FareInfo c(JsonObject jsonObject) throws JsonException {
        double dB;
        double dB2 = JsonElementExtensionsKt.b(jsonObject, "payableAmount");
        double dB3 = JsonElementExtensionsKt.b(jsonObject, "actualFare");
        boolean zM = JsonElementExtensionsKt.m(jsonObject, "isDiscountApplicable", false);
        try {
            dB = JsonElementExtensionsKt.b(jsonObject, "discountedFare");
        } catch (Exception unused) {
            dB = -1.0d;
        }
        JsonArray jsonArrayO = JsonElementExtensionsKt.o(jsonObject, "fareBreakup");
        ArrayList arrayList = new ArrayList();
        if (jsonArrayO != null) {
            int size = jsonArrayO.f18186a.size();
            for (int i = 0; i < size; i++) {
                JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArrayO, i);
                arrayList.add(new FareBreakupComponent(JsonElementExtensionsKt.j(jsonObjectF, "name"), JsonElementExtensionsKt.j(jsonObjectF, "value")));
            }
        }
        return new FareInfo(dB2, dB3, zM, dB, arrayList);
    }

    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Object, kotlin.Lazy] */
    public static ArrayList e(JsonArray jsonArray) {
        ArrayList arrayList;
        ArrayList arrayList2;
        JsonObject jsonObject;
        PassApplicationRejectionReasons passApplicationRejectionReasons;
        int i;
        int i2;
        JsonArray jsonArray2;
        int i3;
        int i4;
        JsonArray lSuperPassApplications = jsonArray;
        Intrinsics.i(lSuperPassApplications, "lSuperPassApplications");
        ArrayList arrayList3 = new ArrayList();
        int size = lSuperPassApplications.f18186a.size();
        int i5 = 0;
        while (i5 < size) {
            JsonObject jsonObjectF = JsonElementExtensionsKt.f(lSuperPassApplications, i5);
            if (b(jsonObjectF)) {
                String strJ = JsonElementExtensionsKt.j(jsonObjectF, "city");
                Locale locale = Locale.ROOT;
                String lowerCase = strJ.toLowerCase(locale);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                String strJ2 = JsonElementExtensionsKt.j(jsonObjectF, "agency");
                String strJ3 = JsonElementExtensionsKt.j(jsonObjectF, "configurationId");
                String strJ4 = JsonElementExtensionsKt.j(jsonObjectF, "categoryId");
                int iC = JsonElementExtensionsKt.c(jsonObjectF, "fmId");
                String strJ5 = JsonElementExtensionsKt.j(jsonObjectF, "displayName");
                String strJ6 = JsonElementExtensionsKt.j(jsonObjectF, "productName");
                long jH = JsonElementExtensionsKt.h(jsonObjectF, "passStartDate");
                long jH2 = JsonElementExtensionsKt.h(jsonObjectF, "verificationExpiryTime");
                SuperPassUserDetails superPassUserDetailsQ = q(JsonElementExtensionsKt.g(jsonObjectF, "userProfile"));
                String upperCase = JsonElementExtensionsKt.j(jsonObjectF, "status").toUpperCase(locale);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                SuperPassApplicationStatus superPassApplicationStatusValueOf = SuperPassApplicationStatus.valueOf(upperCase);
                HashMap mapM = m(JsonElementExtensionsKt.g(jsonObjectF, "proofs"));
                JsonObject jsonObjectP = JsonElementExtensionsKt.p(jsonObjectF, "rejectionReasons");
                if (jsonObjectP == null) {
                    arrayList2 = arrayList3;
                    jsonObject = jsonObjectF;
                    strJ5 = strJ5;
                    strJ6 = strJ6;
                    passApplicationRejectionReasons = null;
                } else {
                    JsonArray jsonArrayO = JsonElementExtensionsKt.o(jsonObjectP, "proofReasons");
                    JsonArray jsonArrayO2 = JsonElementExtensionsKt.o(jsonObjectP, "generalReasons");
                    JsonArray jsonArrayO3 = JsonElementExtensionsKt.o(jsonObjectP, "profileReasons");
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ?? r29 = b;
                    if (jsonArrayO != null) {
                        int size2 = jsonArrayO.f18186a.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            try {
                                JsonObject jsonObjectF2 = JsonElementExtensionsKt.f(jsonArrayO, i6);
                                jsonArray2 = jsonArrayO;
                                try {
                                    String strS = JsonElementExtensionsKt.s(jsonObjectF2, "proofId", "");
                                    i3 = size2;
                                    try {
                                        i4 = i6;
                                        try {
                                            String upperCase2 = JsonElementExtensionsKt.s(jsonObjectF2, "status", "VALID").toUpperCase(Locale.ROOT);
                                            Intrinsics.h(upperCase2, "toUpperCase(...)");
                                            String strS2 = JsonElementExtensionsKt.s(jsonObjectF2, "proofUrl", "");
                                            ArrayList arrayList7 = new ArrayList();
                                            JsonArray jsonArrayO4 = JsonElementExtensionsKt.o(jsonObjectF2, "reasons");
                                            if (jsonArrayO4 != null) {
                                                arrayList3 = arrayList3;
                                                try {
                                                    int size3 = jsonArrayO4.f18186a.size();
                                                    jsonObjectF = jsonObjectF;
                                                    int i7 = 0;
                                                    while (i7 < size3) {
                                                        int i8 = size3;
                                                        try {
                                                            arrayList7.add(JsonElementExtensionsKt.r(jsonArrayO4, i7));
                                                            i7++;
                                                            size3 = i8;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            e.printStackTrace();
                                                            ((CrashlyticsLogger) r29.getValue()).i(e);
                                                            i6 = i4 + 1;
                                                            jsonArrayO = jsonArray2;
                                                            size2 = i3;
                                                            arrayList3 = arrayList3;
                                                            jsonObjectF = jsonObjectF;
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    jsonObjectF = jsonObjectF;
                                                    e.printStackTrace();
                                                    ((CrashlyticsLogger) r29.getValue()).i(e);
                                                    i6 = i4 + 1;
                                                    jsonArrayO = jsonArray2;
                                                    size2 = i3;
                                                    arrayList3 = arrayList3;
                                                    jsonObjectF = jsonObjectF;
                                                }
                                            } else {
                                                arrayList3 = arrayList3;
                                                jsonObjectF = jsonObjectF;
                                            }
                                            arrayList4.add(new ProofRejectionReason(RejectionStatus.valueOf(upperCase2), strS, strS2, arrayList7));
                                        } catch (Exception e3) {
                                            e = e3;
                                            arrayList3 = arrayList3;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        i4 = i6;
                                        e.printStackTrace();
                                        ((CrashlyticsLogger) r29.getValue()).i(e);
                                        i6 = i4 + 1;
                                        jsonArrayO = jsonArray2;
                                        size2 = i3;
                                        arrayList3 = arrayList3;
                                        jsonObjectF = jsonObjectF;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    i3 = size2;
                                    i4 = i6;
                                    e.printStackTrace();
                                    ((CrashlyticsLogger) r29.getValue()).i(e);
                                    i6 = i4 + 1;
                                    jsonArrayO = jsonArray2;
                                    size2 = i3;
                                    arrayList3 = arrayList3;
                                    jsonObjectF = jsonObjectF;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                jsonArray2 = jsonArrayO;
                            }
                            i6 = i4 + 1;
                            jsonArrayO = jsonArray2;
                            size2 = i3;
                            arrayList3 = arrayList3;
                            jsonObjectF = jsonObjectF;
                        }
                    }
                    arrayList2 = arrayList3;
                    jsonObject = jsonObjectF;
                    if (jsonArrayO3 != null) {
                        int size4 = jsonArrayO3.f18186a.size();
                        int i9 = 0;
                        while (i9 < size4) {
                            try {
                                JsonObject jsonObjectF3 = JsonElementExtensionsKt.f(jsonArrayO3, i9);
                                String strS3 = JsonElementExtensionsKt.s(jsonObjectF3, "id", "");
                                String upperCase3 = JsonElementExtensionsKt.s(jsonObjectF3, "status", "VALID").toUpperCase(Locale.ROOT);
                                Intrinsics.h(upperCase3, "toUpperCase(...)");
                                ArrayList arrayList8 = new ArrayList();
                                JsonArray jsonArrayO5 = JsonElementExtensionsKt.o(jsonObjectF3, "reasons");
                                if (jsonArrayO5 != null) {
                                    i = size4;
                                    try {
                                        int size5 = jsonArrayO5.f18186a.size();
                                        i2 = i9;
                                        int i10 = 0;
                                        while (i10 < size5) {
                                            int i11 = size5;
                                            try {
                                                arrayList8.add(JsonElementExtensionsKt.r(jsonArrayO5, i10));
                                                i10++;
                                                size5 = i11;
                                            } catch (Exception e7) {
                                                e = e7;
                                                e.printStackTrace();
                                                ((CrashlyticsLogger) r29.getValue()).i(e);
                                                i9 = i2 + 1;
                                                size4 = i;
                                            }
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        i2 = i9;
                                        e.printStackTrace();
                                        ((CrashlyticsLogger) r29.getValue()).i(e);
                                        i9 = i2 + 1;
                                        size4 = i;
                                    }
                                } else {
                                    i = size4;
                                    i2 = i9;
                                }
                                arrayList5.add(new ProfileRejectionReason(RejectionStatus.valueOf(upperCase3), strS3, arrayList8));
                            } catch (Exception e9) {
                                e = e9;
                                i = size4;
                            }
                            i9 = i2 + 1;
                            size4 = i;
                        }
                    }
                    if (jsonArrayO2 != null) {
                        int size6 = jsonArrayO2.f18186a.size();
                        for (int i12 = 0; i12 < size6; i12++) {
                            arrayList6.add(JsonElementExtensionsKt.r(jsonArrayO2, i12));
                        }
                    }
                    passApplicationRejectionReasons = new PassApplicationRejectionReasons(arrayList4, arrayList5, arrayList6);
                }
                JsonObject jsonObject2 = jsonObject;
                arrayList = arrayList2;
                arrayList.add(new SuperPassApplication(lowerCase, strJ2, strJ3, strJ4, iC, strJ5, strJ6, jH, jH2, superPassUserDetailsQ, superPassApplicationStatusValueOf, mapM, Intrinsics.d(JsonElementExtensionsKt.s(jsonObject2, "paymentMode", ""), "cash") ? new CashPaymentPendingTransactionDetails(JsonElementExtensionsKt.b(jsonObject2, "passFare"), JsonElementExtensionsKt.j(jsonObject2, "referenceId")) : null, passApplicationRejectionReasons, PassApplicationActionRequired.valueOf(JsonElementExtensionsKt.s(jsonObject2, "actionRequired", "INVALID")), h(jsonObject2)));
            } else {
                arrayList = arrayList3;
                size = size;
                i5 = i5;
            }
            i5++;
            arrayList3 = arrayList;
            size = size;
            lSuperPassApplications = jsonArray;
        }
        return arrayList3;
    }

    public static ArrayList g(JsonArray jsonArray) throws JsonException {
        double dB;
        JsonArray lRecentTransactionArray = jsonArray;
        Intrinsics.i(lRecentTransactionArray, "lRecentTransactionArray");
        ArrayList arrayList = new ArrayList();
        int size = lRecentTransactionArray.f18186a.size();
        int i = 0;
        while (i < size) {
            JsonObject jsonObjectF = JsonElementExtensionsKt.f(lRecentTransactionArray, i);
            if (b(jsonObjectF)) {
                String strJ = JsonElementExtensionsKt.j(jsonObjectF, "passId");
                String strJ2 = JsonElementExtensionsKt.j(jsonObjectF, "productType");
                SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
                String strJ3 = JsonElementExtensionsKt.j(jsonObjectF, "productSubType");
                companion.getClass();
                SuperPassSubType superPassSubTypeA = SuperPassSubType.Companion.a(strJ3);
                String lowerCase = JsonElementExtensionsKt.j(jsonObjectF, "city").toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                PendingSuperPassProperties pendingSuperPassProperties = new PendingSuperPassProperties(strJ, strJ2, superPassSubTypeA, lowerCase, JsonElementExtensionsKt.j(jsonObjectF, "agency"), Intrinsics.d(JsonElementExtensionsKt.j(jsonObjectF, "status"), "FAILED") ? SuperPassStatus.PAYMENT_FAILED : SuperPassStatus.PAYMENT_PROCESSING);
                int iC = JsonElementExtensionsKt.c(jsonObjectF, "numOfDays");
                JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObjectF, "specialFeatures");
                ArrayList arrayList2 = new ArrayList();
                for (JsonElement jsonElement : jsonArrayD.f18186a) {
                    ChaloJson chaloJson = ChaloJson.f6455a;
                    JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
                    String c2 = jsonPrimitiveA != null ? jsonPrimitiveA.getC() : null;
                    if (c2 != null) {
                        arrayList2.add(c2);
                    }
                }
                SuperPassUserDetails superPassUserDetailsQ = q(JsonElementExtensionsKt.g(jsonObjectF, "userProfile"));
                HashMap mapM = m(JsonElementExtensionsKt.g(jsonObjectF, "proofs"));
                long jH = JsonElementExtensionsKt.h(jsonObjectF, "bookingTime");
                FareInfo fareInfoC = c(JsonElementExtensionsKt.g(jsonObjectF, "fareInfo"));
                try {
                    dB = JsonElementExtensionsKt.b(jsonObjectF, "maxPricePerTrip");
                } catch (Exception unused) {
                    dB = -1.0d;
                }
                arrayList.add(new PendingSuperPass(pendingSuperPassProperties, new PendingSuperPassUIProperties(iC, arrayList2, superPassUserDetailsQ, mapM, jH, fareInfoC, JsonElementExtensionsKt.j(jsonObjectF, "productName"), JsonElementExtensionsKt.j(jsonObjectF, "categoryName"), new ProductBranding(JsonElementExtensionsKt.a(JsonElementExtensionsKt.g(jsonObjectF, "branding"), "isVisible")), JsonElementExtensionsKt.j(jsonObjectF, "displayName"), dB, JsonElementExtensionsKt.s(jsonObjectF, "desc", "")), new PendingSuperPassRepurchaseProperties(JsonElementExtensionsKt.j(jsonObjectF, "configurationId"), JsonElementExtensionsKt.j(jsonObjectF, "categoryId"), JsonElementExtensionsKt.c(jsonObjectF, "fmId"), JsonElementExtensionsKt.h(jsonObjectF, "startTime"), JsonElementExtensionsKt.h(jsonObjectF, "verificationExpiryTime"), JsonElementExtensionsKt.a(jsonObjectF, "verificationFlag")), new PendingSuperPassTransactionDetails(JsonElementExtensionsKt.j(jsonObjectF, "paymentMode"), JsonElementExtensionsKt.j(jsonObjectF, "transactionId"), JsonElementExtensionsKt.s(jsonObjectF, PaymentConstants.ORDER_ID_CAMEL, ""), h(jsonObjectF))));
            }
            i++;
            lRecentTransactionArray = jsonArray;
        }
        return arrayList;
    }

    public static RefundInfoEntityModel h(JsonObject jsonObject) {
        String strS;
        JsonObject jsonObjectP = JsonElementExtensionsKt.p(jsonObject, "refundInfo");
        if (jsonObjectP == null || (strS = JsonElementExtensionsKt.s(jsonObjectP, "message", "")) == null || strS.length() == 0) {
            return null;
        }
        RefundStatus.Companion companion = RefundStatus.INSTANCE;
        String strS2 = JsonElementExtensionsKt.s(jsonObjectP, "status", "");
        companion.getClass();
        return GenericMobileTicketProductApiResponseModelKt.a(new RefundInfoAppModel(RefundStatus.Companion.a(strS2), strS, null, null));
    }

    public static SuperPassRideBookingAppModel l(JsonObject jsonObject) throws Exception {
        Object objB;
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel;
        try {
            JsonObject jsonObjectP = JsonElementExtensionsKt.p(jsonObject, "ticketFareData");
            String string = jsonObjectP != null ? jsonObjectP.toString() : null;
            if (string != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(string, ReceiptFareDataApiResponseModel.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                receiptFareDataApiResponseModel = (ReceiptFareDataApiResponseModel) objB;
            } else {
                receiptFareDataApiResponseModel = null;
            }
            String strS = JsonElementExtensionsKt.s(jsonObject, "passId", "");
            RideType rideTypeValueOf = RideType.valueOf(JsonElementExtensionsKt.s(jsonObject, "rideType", ""));
            long jQ = JsonElementExtensionsKt.q(jsonObject, "activationTime", -1L);
            long jQ2 = JsonElementExtensionsKt.q(jsonObject, "punchTime", -1L);
            String strS2 = JsonElementExtensionsKt.s(jsonObject, "startStopName", "");
            String strS3 = JsonElementExtensionsKt.s(jsonObject, "endStopName", "");
            String strS4 = JsonElementExtensionsKt.s(jsonObject, "routeName", "");
            String strS5 = JsonElementExtensionsKt.s(jsonObject, "vehicleNo", "");
            String strS6 = JsonElementExtensionsKt.s(jsonObject, "conductorId", "");
            JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObject, "specialFeatures");
            ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel2 = receiptFareDataApiResponseModel;
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement : jsonArrayD.f18186a) {
                ChaloJson chaloJson = ChaloJson.f6455a;
                JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
                String c2 = jsonPrimitiveA != null ? jsonPrimitiveA.getC() : null;
                if (c2 != null) {
                    arrayList.add(c2);
                }
                strS5 = strS5;
            }
            String str = strS5;
            String strS7 = JsonElementExtensionsKt.s(jsonObject, "via", "");
            RouteNamingSchemeType.Companion companion = RouteNamingSchemeType.INSTANCE;
            String strS8 = JsonElementExtensionsKt.s(jsonObject, "routeNamingScheme", "");
            companion.getClass();
            RouteNamingSchemeType routeNamingSchemeTypeA = RouteNamingSchemeType.Companion.a(strS8);
            String strS9 = JsonElementExtensionsKt.s(jsonObject, "depotName", "");
            if (strS9.length() <= 0) {
                strS9 = null;
            }
            String strS10 = JsonElementExtensionsKt.s(jsonObject, "printedTicketId", "");
            String str2 = strS10.length() > 0 ? strS10 : null;
            String strS11 = JsonElementExtensionsKt.s(jsonObject, "scheduleNumber", "");
            String str3 = strS11.length() > 0 ? strS11 : null;
            String strS12 = JsonElementExtensionsKt.s(jsonObject, "serviceType", "");
            String str4 = strS12.length() > 0 ? strS12 : null;
            String strS13 = JsonElementExtensionsKt.s(jsonObject, "driverId", "");
            String str5 = strS13.length() > 0 ? strS13 : null;
            String strS14 = JsonElementExtensionsKt.s(jsonObject, "waybillNo", "");
            String str6 = strS14.length() > 0 ? strS14 : null;
            String strS15 = JsonElementExtensionsKt.s(jsonObject, "etimVersion", "");
            String str7 = strS15.length() > 0 ? strS15 : null;
            long jQ3 = JsonElementExtensionsKt.q(jsonObject, "totalAmount", -1L);
            Long lValueOf = Long.valueOf(jQ3);
            if (jQ3 == -1) {
                lValueOf = null;
            }
            return new SuperPassRideBookingAppModel(strS, rideTypeValueOf, jQ, jQ2, strS2, strS3, strS4, str, strS6, arrayList, strS7, routeNamingSchemeTypeA, strS9, str2, str3, str4, str5, str6, str7, lValueOf, receiptFareDataApiResponseModel2 != null ? ProductReceiptDataKt.b(receiptFareDataApiResponseModel2) : null);
        } catch (Exception e) {
            throw new Exception(z40.g("Error super pass booking id: ", JsonElementExtensionsKt.s(jsonObject, "passId", ""), ": ", e.getMessage()));
        }
    }

    public static HashMap m(JsonObject jsonObject) throws JsonException {
        HashMap map = new HashMap();
        for (String str : jsonObject.f18198a.keySet()) {
            JsonObject jsonObjectG = JsonElementExtensionsKt.g(jsonObject, str);
            map.put(str, new SuperPassProofProperties(JsonElementExtensionsKt.j(jsonObjectG, "proofName"), JsonElementExtensionsKt.j(jsonObjectG, "proofUrl"), JsonElementExtensionsKt.q(jsonObjectG, "expiryTime", 0L)));
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    public static SuperPassProperties n(JsonObject jsonObject) {
        String str;
        PremiumBusMeta premiumBusMeta;
        RideRollOverMeta rideRollOverMeta;
        RideRollOverBannerCta rideRollOverBannerCta;
        RideRollOverBannerCtaActionType next;
        String strJ = JsonElementExtensionsKt.j(jsonObject, "passId");
        String strJ2 = JsonElementExtensionsKt.j(jsonObject, "productType");
        SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
        String strJ3 = JsonElementExtensionsKt.j(jsonObject, "productSubType");
        companion.getClass();
        SuperPassSubType superPassSubTypeA = SuperPassSubType.Companion.a(strJ3);
        String lowerCase = JsonElementExtensionsKt.j(jsonObject, "city").toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String strJ4 = JsonElementExtensionsKt.j(jsonObject, "agency");
        String strJ5 = JsonElementExtensionsKt.j(jsonObject, "qrCode");
        String strJ6 = JsonElementExtensionsKt.l("tone", jsonObject) ? JsonElementExtensionsKt.j(jsonObject, "tone") : null;
        if (JsonElementExtensionsKt.l("chaloBusMeta", jsonObject)) {
            JsonObject jsonObjectP = JsonElementExtensionsKt.p(jsonObject, "chaloBusMeta");
            boolean zM = jsonObjectP != null ? JsonElementExtensionsKt.m(jsonObjectP, "startDateChangeAllowed", false) : false;
            Long lValueOf = jsonObjectP != null ? Long.valueOf(JsonElementExtensionsKt.q(jsonObjectP, "dateChangeEnableStartTime", -1L)) : null;
            Long lValueOf2 = jsonObjectP != null ? Long.valueOf(JsonElementExtensionsKt.q(jsonObjectP, "dateChangeEnableEndTime", -1L)) : null;
            if (jsonObjectP == null || !JsonElementExtensionsKt.l("rideRolloverMeta", jsonObjectP)) {
                strJ6 = strJ6;
                str = strJ;
                rideRollOverMeta = null;
            } else {
                JsonObject jsonObjectP2 = JsonElementExtensionsKt.p(jsonObjectP, "rideRolloverMeta");
                String strS = jsonObjectP2 != null ? JsonElementExtensionsKt.s(jsonObjectP2, "banner", "") : null;
                String strS2 = jsonObjectP2 != null ? JsonElementExtensionsKt.s(jsonObjectP2, "status", "") : null;
                JsonObject jsonObjectP3 = jsonObjectP2 != null ? JsonElementExtensionsKt.p(jsonObjectP2, InMobiNetworkValues.CTA) : null;
                if (jsonObjectP3 != null) {
                    String strS3 = JsonElementExtensionsKt.s(jsonObjectP3, "ctaText", "");
                    if (strS3.length() == 0) {
                        str = strJ;
                        rideRollOverBannerCta = null;
                    } else {
                        String value = JsonElementExtensionsKt.s(jsonObjectP3, "ctaActionType", "");
                        String strS4 = JsonElementExtensionsKt.s(jsonObjectP3, "contactNumber", "");
                        RideRollOverBannerCtaActionType.INSTANCE.getClass();
                        Intrinsics.i(value, "value");
                        Iterator<RideRollOverBannerCtaActionType> it = RideRollOverBannerCtaActionType.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str = strJ;
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = strJ;
                            if (Intrinsics.d(next.getValue(), value)) {
                                break;
                            }
                            strJ = str;
                        }
                        RideRollOverBannerCtaActionType rideRollOverBannerCtaActionType = next;
                        if (rideRollOverBannerCtaActionType == null) {
                            rideRollOverBannerCtaActionType = RideRollOverBannerCtaActionType.NONE;
                        }
                        rideRollOverBannerCta = new RideRollOverBannerCta(strS3, rideRollOverBannerCtaActionType, strS4);
                    }
                } else {
                    str = strJ;
                    rideRollOverBannerCta = null;
                }
                BannerStatus.INSTANCE.getClass();
                rideRollOverMeta = new RideRollOverMeta(strS, rideRollOverBannerCta, BannerStatus.Companion.a(strS2));
            }
            if (lValueOf != null && lValueOf.longValue() == -1) {
                lValueOf = null;
            }
            premiumBusMeta = new PremiumBusMeta(zM, lValueOf, (lValueOf2 != null && lValueOf2.longValue() == r10) ? null : lValueOf2, rideRollOverMeta);
        } else {
            strJ6 = strJ6;
            str = strJ;
            premiumBusMeta = null;
        }
        return new SuperPassProperties(str, strJ2, superPassSubTypeA, lowerCase, strJ4, strJ5, strJ6, premiumBusMeta);
    }

    public static SuperPassRepurchaseProperties o(JsonObject jsonObject) {
        return new SuperPassRepurchaseProperties(JsonElementExtensionsKt.j(jsonObject, "configurationId"), JsonElementExtensionsKt.j(jsonObject, "categoryId"), JsonElementExtensionsKt.c(jsonObject, "fmId"), JsonElementExtensionsKt.h(jsonObject, "verificationExpiryTime"), JsonElementExtensionsKt.a(jsonObject, "verificationFlag"), JsonElementExtensionsKt.a(jsonObject, "isRenewable"));
    }

    public static SuperPassTripPreferences p(JsonObject jsonObject) {
        JsonObject jsonObjectP = JsonElementExtensionsKt.p(jsonObject, "tripPreferences");
        return new SuperPassTripPreferences(jsonObjectP != null ? JsonElementExtensionsKt.s(jsonObjectP, "routeId", "") : null, jsonObjectP != null ? JsonElementExtensionsKt.s(jsonObjectP, "startStopId", "") : null, jsonObjectP != null ? JsonElementExtensionsKt.s(jsonObjectP, "startStopName", "") : null, jsonObjectP != null ? JsonElementExtensionsKt.s(jsonObjectP, "endStopId", "") : null, jsonObjectP != null ? JsonElementExtensionsKt.s(jsonObjectP, "endStopName", "") : null);
    }

    public static SuperPassUserDetails q(JsonObject jsonObject) {
        return new SuperPassUserDetails(JsonElementExtensionsKt.s(jsonObject, "userId", ""), JsonElementExtensionsKt.s(jsonObject, "mobileNumber", ""), vo1.n(JsonElementExtensionsKt.s(jsonObject, "firstName", ""), " ", JsonElementExtensionsKt.s(jsonObject, "lastName", "")), Gender.Companion.b(Gender.INSTANCE, JsonElementExtensionsKt.s(jsonObject, HintConstants.AUTOFILL_HINT_GENDER, "")), JsonElementExtensionsKt.s(jsonObject, "dateOfBirth", ""), JsonElementExtensionsKt.s(jsonObject, "mailId", ""), JsonElementExtensionsKt.s(jsonObject, "profilePhoto", ""), JsonElementExtensionsKt.q(jsonObject, "dobInMillis", -1L));
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(JsonObject jsonObject, ContinuationImpl continuationImpl) throws JsonException {
        SuperPassJsonParser$parseMagicSuperPass$1 superPassJsonParser$parseMagicSuperPass$1;
        SuperPassProperties superPassProperties;
        JsonObject jsonObject2 = jsonObject;
        if (continuationImpl instanceof SuperPassJsonParser$parseMagicSuperPass$1) {
            superPassJsonParser$parseMagicSuperPass$1 = (SuperPassJsonParser$parseMagicSuperPass$1) continuationImpl;
            int i = superPassJsonParser$parseMagicSuperPass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassJsonParser$parseMagicSuperPass$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassJsonParser$parseMagicSuperPass$1 = new SuperPassJsonParser$parseMagicSuperPass$1(this, continuationImpl);
            }
        } else {
            superPassJsonParser$parseMagicSuperPass$1 = new SuperPassJsonParser$parseMagicSuperPass$1(this, continuationImpl);
        }
        Object obj = superPassJsonParser$parseMagicSuperPass$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassJsonParser$parseMagicSuperPass$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassProperties superPassPropertiesN = n(jsonObject2);
            String str = superPassPropertiesN.f9566a;
            superPassJsonParser$parseMagicSuperPass$1.L$0 = jsonObject2;
            superPassJsonParser$parseMagicSuperPass$1.L$1 = superPassPropertiesN;
            superPassJsonParser$parseMagicSuperPass$1.label = 1;
            Object objR = r(jsonObject2, str, superPassJsonParser$parseMagicSuperPass$1);
            if (objR == obj2) {
                return obj2;
            }
            superPassProperties = superPassPropertiesN;
            obj = objR;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SuperPassProperties superPassProperties2 = (SuperPassProperties) superPassJsonParser$parseMagicSuperPass$1.L$1;
            JsonObject jsonObject3 = (JsonObject) superPassJsonParser$parseMagicSuperPass$1.L$0;
            ResultKt.b(obj);
            superPassProperties = superPassProperties2;
            jsonObject2 = jsonObject3;
        }
        SuperPassValidationProperties superPassValidationProperties = (SuperPassValidationProperties) obj;
        int iC = JsonElementExtensionsKt.c(jsonObject2, "numOfDays");
        JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObject2, "specialFeatures");
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArrayD.f18186a) {
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
            String c2 = jsonPrimitiveA != null ? jsonPrimitiveA.getC() : null;
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return new MagicSuperPass(superPassProperties, superPassValidationProperties, new SuperPassUIProperties(iC, arrayList, q(JsonElementExtensionsKt.g(jsonObject2, "userProfile")), m(JsonElementExtensionsKt.g(jsonObject2, "proofs")), JsonElementExtensionsKt.h(jsonObject2, "bookingTime"), c(JsonElementExtensionsKt.g(jsonObject2, "fareInfo")), JsonElementExtensionsKt.j(jsonObject2, "productName"), JsonElementExtensionsKt.j(jsonObject2, "categoryName"), new ProductBranding(JsonElementExtensionsKt.a(JsonElementExtensionsKt.g(jsonObject2, "branding"), "isVisible")), JsonElementExtensionsKt.j(jsonObject2, "displayName"), JsonElementExtensionsKt.m(jsonObject2, "markAsUnlimited", false)), o(jsonObject2), new SuperPassTransactionDetails(JsonElementExtensionsKt.j(jsonObject2, "transactionId"), JsonElementExtensionsKt.j(jsonObject2, "paymentMode"), h(jsonObject2)), p(jsonObject2));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0096 -> B:41:0x00e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c6 -> B:41:0x00e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00dd -> B:40:0x00e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x00a0
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable f(kotlinx.serialization.json.JsonArray r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.parser.SuperPassJsonParser.f(kotlinx.serialization.json.JsonArray, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object i(JsonObject jsonObject, ContinuationImpl continuationImpl) throws JsonException {
        SuperPassJsonParser$parseRideBasedSuperPass$1 superPassJsonParser$parseRideBasedSuperPass$1;
        SuperPassProperties superPassProperties;
        JsonObject jsonObject2 = jsonObject;
        if (continuationImpl instanceof SuperPassJsonParser$parseRideBasedSuperPass$1) {
            superPassJsonParser$parseRideBasedSuperPass$1 = (SuperPassJsonParser$parseRideBasedSuperPass$1) continuationImpl;
            int i = superPassJsonParser$parseRideBasedSuperPass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassJsonParser$parseRideBasedSuperPass$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassJsonParser$parseRideBasedSuperPass$1 = new SuperPassJsonParser$parseRideBasedSuperPass$1(this, continuationImpl);
            }
        } else {
            superPassJsonParser$parseRideBasedSuperPass$1 = new SuperPassJsonParser$parseRideBasedSuperPass$1(this, continuationImpl);
        }
        Object obj = superPassJsonParser$parseRideBasedSuperPass$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassJsonParser$parseRideBasedSuperPass$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassProperties superPassPropertiesN = n(jsonObject2);
            String str = superPassPropertiesN.f9566a;
            superPassJsonParser$parseRideBasedSuperPass$1.L$0 = jsonObject2;
            superPassJsonParser$parseRideBasedSuperPass$1.L$1 = superPassPropertiesN;
            superPassJsonParser$parseRideBasedSuperPass$1.label = 1;
            Object objJ = j(jsonObject2, str, superPassJsonParser$parseRideBasedSuperPass$1);
            if (objJ == obj2) {
                return obj2;
            }
            superPassProperties = superPassPropertiesN;
            obj = objJ;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SuperPassProperties superPassProperties2 = (SuperPassProperties) superPassJsonParser$parseRideBasedSuperPass$1.L$1;
            JsonObject jsonObject3 = (JsonObject) superPassJsonParser$parseRideBasedSuperPass$1.L$0;
            ResultKt.b(obj);
            superPassProperties = superPassProperties2;
            jsonObject2 = jsonObject3;
        }
        RideBasedSuperPassValidationProperties rideBasedSuperPassValidationProperties = (RideBasedSuperPassValidationProperties) obj;
        int iC = JsonElementExtensionsKt.c(jsonObject2, "numOfDays");
        JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObject2, "specialFeatures");
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArrayD.f18186a) {
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
            String c2 = jsonPrimitiveA != null ? jsonPrimitiveA.getC() : null;
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return new RideBasedSuperPass(superPassProperties, rideBasedSuperPassValidationProperties, new RideBasedSuperPassUIProperties(iC, arrayList, q(JsonElementExtensionsKt.g(jsonObject2, "userProfile")), m(JsonElementExtensionsKt.g(jsonObject2, "proofs")), JsonElementExtensionsKt.h(jsonObject2, "bookingTime"), c(JsonElementExtensionsKt.g(jsonObject2, "fareInfo")), JsonElementExtensionsKt.b(jsonObject2, "maxPricePerTrip"), JsonElementExtensionsKt.j(jsonObject2, "productName"), JsonElementExtensionsKt.j(jsonObject2, "categoryName"), new ProductBranding(JsonElementExtensionsKt.a(JsonElementExtensionsKt.g(jsonObject2, "branding"), "isVisible")), JsonElementExtensionsKt.j(jsonObject2, "displayName"), JsonElementExtensionsKt.s(jsonObject2, "desc", ""), JsonElementExtensionsKt.m(jsonObject2, "markAsUnlimited", false)), o(jsonObject2), new SuperPassTransactionDetails(JsonElementExtensionsKt.j(jsonObject2, "transactionId"), JsonElementExtensionsKt.j(jsonObject2, "paymentMode"), h(jsonObject2)), p(jsonObject2));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x037f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0386  */
    /* JADX WARN: Code duplicated, block: B:39:0x0430  */
    /* JADX WARN: Code duplicated, block: B:42:0x045c  */
    /* JADX WARN: Code duplicated, block: B:43:0x045f  */
    /* JADX WARN: Code duplicated, block: B:46:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x052d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0534  */
    /* JADX WARN: Code duplicated, block: B:58:0x0554  */
    /* JADX WARN: Code duplicated, block: B:61:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x061d  */
    /* JADX WARN: Code duplicated, block: B:69:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r57v11 */
    /* JADX WARN: Type inference failed for: r57v13 */
    /* JADX WARN: Type inference failed for: r57v15 */
    /* JADX WARN: Type inference failed for: r57v16, types: [kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r57v18 */
    /* JADX WARN: Type inference failed for: r57v19 */
    /* JADX WARN: Type inference failed for: r57v20 */
    /* JADX WARN: Type inference failed for: r57v21 */
    /* JADX WARN: Type inference failed for: r57v6, types: [kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r57v8 */
    /* JADX WARN: Type inference failed for: r57v9, types: [kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object] */
    public final Object j(JsonObject jsonObject, String str, ContinuationImpl continuationImpl) throws JsonException {
        SuperPassJsonParser$parseRideBasedSuperPassValidationProperties$1 superPassJsonParser$parseRideBasedSuperPassValidationProperties$1;
        long jH;
        ArrayList arrayList;
        JsonObject jsonObject2;
        long j;
        Object obj;
        String str2;
        int i;
        long j2;
        long j3;
        int i2;
        SuperPassStatus superPassStatus;
        String str3;
        long j4;
        List listA;
        int iN;
        boolean zM;
        boolean zM2;
        String strS;
        int i3;
        int iN2;
        int iN3;
        boolean zM3;
        int i4;
        String str4;
        long j5;
        long j6;
        Object objC;
        CoroutineSingletons coroutineSingletons;
        int i5;
        int i6;
        boolean z;
        List list;
        CoroutineSingletons coroutineSingletons2;
        boolean z2;
        int i7;
        long j7;
        long j8;
        int i8;
        String str5;
        boolean z3;
        Object obj2;
        String str6;
        int i9;
        ?? r57;
        boolean z4;
        boolean z5;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails;
        long j9;
        long j10;
        int i10;
        int i11;
        ArrayList arrayList2;
        String str7;
        Object objB;
        CoroutineSingletons coroutineSingletons3;
        Object obj3;
        String str8;
        long j11;
        CoroutineSingletons coroutineSingletons4;
        boolean z6;
        int i12;
        int i13;
        String str9;
        long j12;
        boolean z7;
        ArrayList arrayList3;
        ?? r58;
        boolean z8;
        boolean z9;
        SuperPassStatus superPassStatus2;
        ArrayList arrayList4;
        String str10;
        int i14;
        long j13;
        long j14;
        Object objI;
        Object obj4;
        int i15;
        boolean z10;
        ArrayList arrayList5;
        CoroutineSingletons coroutineSingletons5;
        long j15;
        int i16;
        int i17;
        int i18;
        long j16;
        String str11;
        SuperPassStatus superPassStatus3;
        boolean z11;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails2;
        boolean z12;
        Object objH;
        CoroutineSingletons coroutineSingletons6;
        String str12;
        SuperPassStatus superPassStatus4;
        boolean z13;
        long j17;
        int i19;
        long j18;
        int i20;
        int i21;
        int i22;
        boolean z14;
        int i23;
        boolean z15;
        SuperPassStatus superPassStatus5;
        int i24;
        long j19;
        long j20;
        boolean z16;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails3;
        int i25;
        int i26;
        long j21;
        ?? r59;
        String str13;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails4;
        long j22;
        int i27;
        boolean z17;
        Object objC2;
        int i28;
        int i29;
        CoroutineSingletons coroutineSingletons7;
        long j23;
        int i30;
        String str14;
        SuperPassStatus superPassStatus6;
        int i31;
        long j24;
        boolean z18;
        String str15;
        long j25;
        long j26;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails5;
        Object obj5;
        List list2;
        ?? r510;
        List list3;
        long j27;
        List list4;
        String str16;
        int i32;
        boolean z19;
        SuperPassStatus superPassStatus7;
        long j28;
        int i33;
        int i34;
        CoroutineSingletons coroutineSingletons8;
        long j29;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails6;
        int i35;
        Object objF;
        long j30;
        long j31;
        int i36;
        int i37;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails7;
        int i38;
        SuperPassStatus superPassStatus8;
        List list5;
        boolean z20;
        long j32;
        long j33;
        int i39;
        if (continuationImpl instanceof SuperPassJsonParser$parseRideBasedSuperPassValidationProperties$1) {
            superPassJsonParser$parseRideBasedSuperPassValidationProperties$1 = (SuperPassJsonParser$parseRideBasedSuperPassValidationProperties$1) continuationImpl;
            int i40 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$1.label;
            if ((i40 & Integer.MIN_VALUE) != 0) {
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$1.label = i40 - Integer.MIN_VALUE;
            } else {
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$1 = new SuperPassJsonParser$parseRideBasedSuperPassValidationProperties$1(this, continuationImpl);
            }
        } else {
            superPassJsonParser$parseRideBasedSuperPassValidationProperties$1 = new SuperPassJsonParser$parseRideBasedSuperPassValidationProperties$1(this, continuationImpl);
        }
        SuperPassJsonParser$parseRideBasedSuperPassValidationProperties$1 superPassJsonParser$parseRideBasedSuperPassValidationProperties$2 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$1;
        Object obj6 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.result;
        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i41 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label;
        Object obj7 = d;
        Unit unit = Unit.f17538a;
        switch (i41) {
            case 0:
                ResultKt.b(obj6);
                SuperPassStatus superPassStatusValueOf = SuperPassStatus.valueOf(JsonElementExtensionsKt.j(jsonObject, "status"));
                jH = JsonElementExtensionsKt.h(jsonObject, "startTime");
                long jH2 = JsonElementExtensionsKt.h(jsonObject, "expiryTime");
                long jH3 = JsonElementExtensionsKt.h(jsonObject, "activeDuration");
                int iC = JsonElementExtensionsKt.c(jsonObject, "maxTripsPerDay");
                int iC2 = JsonElementExtensionsKt.c(jsonObject, "numOfTrips");
                JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObject, "punches");
                arrayList = new ArrayList();
                int size = jsonArrayD.f18186a.size();
                int i42 = 0;
                while (i42 < size) {
                    arrayList.add(new Long(JsonElementExtensionsKt.h(JsonElementExtensionsKt.f(jsonArrayD, i42), "punchingTime")));
                    i42++;
                    size = size;
                    iC2 = iC2;
                }
                int i43 = iC2;
                Long l = (Long) CollectionsKt.U(arrayList);
                long jLongValue = l != null ? l.longValue() : -1L;
                Object obj8 = SuperPassActivationTimestampMapHelper.f9561a;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = jsonObject;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = str;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = superPassStatusValueOf;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = arrayList;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = jH2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = jH3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = iC;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i43;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = jLongValue;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 1;
                Object objV = FlowKt.v(((LocalDataStore) SuperPassActivationTimestampMapHelper.f9561a.getValue()).e(PreferencesKeys.stringKey(str)), superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                if (objV == coroutineSingletons9) {
                    return coroutineSingletons9;
                }
                jsonObject2 = jsonObject;
                j = jLongValue;
                obj = objV;
                str2 = str;
                i = i43;
                j2 = jH2;
                j3 = jH3;
                i2 = iC;
                superPassStatus = superPassStatusValueOf;
                str3 = (String) obj;
                if (str3 != null) {
                    j4 = Long.parseLong(str3);
                } else {
                    j4 = -1;
                }
                listA = a(JsonElementExtensionsKt.o(jsonObject2, "serviceType"));
                iN = JsonElementExtensionsKt.n(0, "premiumRidesConsumed", jsonObject2);
                zM = JsonElementExtensionsKt.m(jsonObject2, "checkAppReclaim", true);
                zM2 = JsonElementExtensionsKt.m(jsonObject2, "isHailingAllowed", true);
                strS = JsonElementExtensionsKt.s(jsonObject2, "tierType", "");
                i3 = i;
                iN2 = JsonElementExtensionsKt.n(-1, "advanceBookingWindow", jsonObject2);
                iN3 = JsonElementExtensionsKt.n(-1, "allowedNumberOfDaysForBulkBooking", jsonObject2);
                zM3 = JsonElementExtensionsKt.m(jsonObject2, "bulkBookingAllowed", false);
                i4 = !zM ? 1 : 0;
                BasicInfoContract basicInfoContract = (BasicInfoContract) c.getValue();
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = strS;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = arrayList;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                str4 = str2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i3;
                j5 = j;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j5;
                j6 = j4;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j6;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = iN;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = zM;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = zM2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = iN2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = iN3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$2 = zM3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$5 = i4;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 2;
                objC = basicInfoContract.c(superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                coroutineSingletons = coroutineSingletons9;
                if (objC != coroutineSingletons) {
                    i5 = iN;
                    i6 = i4;
                    z = zM ? 1 : 0;
                    list = arrayList;
                    coroutineSingletons2 = coroutineSingletons;
                    z2 = zM2;
                    i7 = i3;
                    j7 = j5;
                    j8 = j6;
                    i8 = iN3;
                    str5 = str4;
                    z3 = zM3;
                    obj2 = objC;
                    str6 = strS;
                    i9 = iN2;
                    r57 = obj7;
                    long jLongValue2 = ((Number) obj2).longValue();
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z2;
                    rideBasedSuperPassRideDetails = new RideBasedSuperPassRideDetails(list, z4, jLongValue2, z, j8, j7);
                    j9 = j8;
                    j10 = j7;
                    i10 = i5;
                    SuperPassRepository superPassRepository = (SuperPassRepository) r57.getValue();
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str5;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = str6;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = rideBasedSuperPassRideDetails;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i7;
                    i11 = i7;
                    arrayList2 = arrayList;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j10;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j9;
                    str7 = str6;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i10;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z5;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 3;
                    objB = superPassRepository.b.b(str5, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    coroutineSingletons3 = coroutineSingletons2;
                    if (objB == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    obj3 = objB;
                    str8 = str5;
                    j11 = j9;
                    coroutineSingletons4 = coroutineSingletons3;
                    z6 = z5;
                    i12 = i10;
                    i13 = i11;
                    str9 = str7;
                    j12 = j10;
                    z7 = z3;
                    arrayList3 = arrayList2;
                    r58 = r57;
                    z8 = z6;
                    if (!((Boolean) obj3).booleanValue()) {
                        SuperPassRepository superPassRepository2 = (SuperPassRepository) r58.getValue();
                        RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom = new RideBasedSuperPassRideDetailsRoom(str8, rideBasedSuperPassRideDetails);
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = listA;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str9;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = null;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                        rideBasedSuperPassRideDetails2 = rideBasedSuperPassRideDetails;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                        z12 = z7;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z12;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 4;
                        objH = superPassRepository2.b.H(rideBasedSuperPassRideDetailsRoom, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                        if (objH != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objH = unit;
                        }
                        coroutineSingletons6 = coroutineSingletons4;
                        if (objH == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        str12 = str9;
                        superPassStatus4 = superPassStatus;
                        z13 = z12;
                        j17 = jH;
                        i19 = i2;
                        j18 = j3;
                        i20 = i12;
                        i21 = i8;
                        i22 = i9;
                        z14 = z8;
                        i23 = i13;
                        SuperPassStatus superPassStatus9 = superPassStatus4;
                        z15 = z14;
                        superPassStatus5 = superPassStatus9;
                        i24 = i19;
                        j19 = j18;
                        j20 = j2;
                        z16 = z13;
                        rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails2;
                        i25 = i20;
                        i26 = i23;
                        j21 = j17;
                        PassTierType.INSTANCE.getClass();
                        return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                    }
                    z9 = z7;
                    SuperPassRepository superPassRepository3 = (SuperPassRepository) r58.getValue();
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                    superPassStatus2 = superPassStatus;
                    arrayList4 = arrayList3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList4;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = str9;
                    str10 = str9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                    i14 = i13;
                    j13 = j12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j13;
                    j14 = j11;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j14;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 5;
                    objI = superPassRepository3.b.i(str8, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    coroutineSingletons = coroutineSingletons4;
                    if (objI != coroutineSingletons) {
                        obj4 = objI;
                        i15 = i8;
                        z10 = z8;
                        arrayList5 = arrayList4;
                        coroutineSingletons5 = coroutineSingletons;
                        j15 = j13;
                        i16 = i12;
                        i17 = i9;
                        i18 = i14;
                        j16 = j14;
                        str11 = str10;
                        superPassStatus3 = superPassStatus2;
                        z11 = z9;
                        r59 = r58;
                        str13 = str8;
                        rideBasedSuperPassRideDetails4 = (RideBasedSuperPassRideDetails) obj4;
                        j22 = j15;
                        UtilsKT utilsKT = UtilsKT.f10442a;
                        List list6 = rideBasedSuperPassRideDetails4.c;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str13;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = listA;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = str11;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = rideBasedSuperPassRideDetails4;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j22;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j16;
                        i27 = i16;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i27;
                        z17 = z10;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z17;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i17;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i15;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 6;
                        objC2 = utilsKT.c(arrayList5, list6, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                        coroutineSingletons = coroutineSingletons5;
                        if (objC2 != coroutineSingletons) {
                            int i44 = i17;
                            i28 = i27;
                            i29 = i44;
                            coroutineSingletons7 = coroutineSingletons;
                            j23 = j3;
                            i30 = i15;
                            str14 = str13;
                            superPassStatus6 = superPassStatus3;
                            i31 = i2;
                            j24 = j16;
                            z18 = z17;
                            str15 = str11;
                            j25 = jH;
                            j26 = j22;
                            rideBasedSuperPassRideDetails5 = rideBasedSuperPassRideDetails4;
                            obj5 = objC2;
                            list2 = listA;
                            r510 = r59;
                            list3 = (List) obj5;
                            j27 = j26;
                            SuperPassRepository superPassRepository4 = (SuperPassRepository) r510.getValue();
                            boolean z21 = rideBasedSuperPassRideDetails5.d;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus6;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = list2;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str15;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails5;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = list3;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = j25;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j23;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i31;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                            list4 = list2;
                            str16 = str15;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j27;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j24;
                            i32 = i28;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i32;
                            z19 = z18;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z19;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i29;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i30;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 7;
                            superPassStatus7 = superPassStatus6;
                            j28 = j23;
                            i33 = i31;
                            i34 = i30;
                            coroutineSingletons8 = coroutineSingletons7;
                            j29 = j24;
                            rideBasedSuperPassRideDetails6 = rideBasedSuperPassRideDetails5;
                            i35 = i29;
                            objF = superPassRepository4.b.F(list3, z21, str14, j29, j27, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                            if (objF != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objF = unit;
                            }
                            if (objF == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                            j30 = j29;
                            j31 = j27;
                            i36 = i18;
                            i37 = i32;
                            rideBasedSuperPassRideDetails7 = rideBasedSuperPassRideDetails6;
                            i38 = i35;
                            superPassStatus8 = superPassStatus7;
                            i24 = i33;
                            list5 = list3;
                            z20 = z19;
                            j32 = j28;
                            j33 = j25;
                            i39 = i34;
                            rideBasedSuperPassRideDetails7.getClass();
                            Intrinsics.i(list5, "<set-?>");
                            rideBasedSuperPassRideDetails7.c = list5;
                            rideBasedSuperPassRideDetails7.f9570a = j30;
                            rideBasedSuperPassRideDetails7.b = j31;
                            rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails7;
                            i21 = i39;
                            i22 = i38;
                            superPassStatus5 = superPassStatus8;
                            j20 = j2;
                            j19 = j32;
                            str12 = str16;
                            z15 = z20;
                            i25 = i37;
                            i26 = i36;
                            z16 = z11;
                            j21 = j33;
                            listA = list4;
                            PassTierType.INSTANCE.getClass();
                            return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                long j34 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3;
                int i45 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1;
                i2 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0;
                j3 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2;
                j2 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1;
                jH = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0;
                ArrayList arrayList6 = (ArrayList) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3;
                SuperPassStatus superPassStatus10 = (SuperPassStatus) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2;
                str2 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1;
                jsonObject2 = (JsonObject) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0;
                ResultKt.b(obj6);
                arrayList = arrayList6;
                j = j34;
                obj = obj6;
                i = i45;
                superPassStatus = superPassStatus10;
                str3 = (String) obj;
                if (str3 != null) {
                    j4 = Long.parseLong(str3);
                } else {
                    j4 = -1;
                }
                listA = a(JsonElementExtensionsKt.o(jsonObject2, "serviceType"));
                iN = JsonElementExtensionsKt.n(0, "premiumRidesConsumed", jsonObject2);
                zM = JsonElementExtensionsKt.m(jsonObject2, "checkAppReclaim", true);
                zM2 = JsonElementExtensionsKt.m(jsonObject2, "isHailingAllowed", true);
                strS = JsonElementExtensionsKt.s(jsonObject2, "tierType", "");
                i3 = i;
                iN2 = JsonElementExtensionsKt.n(-1, "advanceBookingWindow", jsonObject2);
                iN3 = JsonElementExtensionsKt.n(-1, "allowedNumberOfDaysForBulkBooking", jsonObject2);
                zM3 = JsonElementExtensionsKt.m(jsonObject2, "bulkBookingAllowed", false);
                i4 = !zM ? 1 : 0;
                BasicInfoContract basicInfoContract2 = (BasicInfoContract) c.getValue();
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = strS;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = arrayList;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                str4 = str2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i3;
                j5 = j;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j5;
                j6 = j4;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j6;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = iN;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = zM;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = zM2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = iN2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = iN3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$2 = zM3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$5 = i4;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 2;
                objC = basicInfoContract2.c(superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                coroutineSingletons = coroutineSingletons9;
                if (objC != coroutineSingletons) {
                    i5 = iN;
                    i6 = i4;
                    z = zM ? 1 : 0;
                    list = arrayList;
                    coroutineSingletons2 = coroutineSingletons;
                    z2 = zM2;
                    i7 = i3;
                    j7 = j5;
                    j8 = j6;
                    i8 = iN3;
                    str5 = str4;
                    z3 = zM3;
                    obj2 = objC;
                    str6 = strS;
                    i9 = iN2;
                    r57 = obj7;
                    long jLongValue3 = ((Number) obj2).longValue();
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z2;
                    rideBasedSuperPassRideDetails = new RideBasedSuperPassRideDetails(list, z4, jLongValue3, z, j8, j7);
                    j9 = j8;
                    j10 = j7;
                    i10 = i5;
                    SuperPassRepository superPassRepository5 = (SuperPassRepository) r57.getValue();
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str5;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = str6;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = rideBasedSuperPassRideDetails;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i7;
                    i11 = i7;
                    arrayList2 = arrayList;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j10;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j9;
                    str7 = str6;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i10;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z5;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 3;
                    objB = superPassRepository5.b.b(str5, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    coroutineSingletons3 = coroutineSingletons2;
                    if (objB == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    obj3 = objB;
                    str8 = str5;
                    j11 = j9;
                    coroutineSingletons4 = coroutineSingletons3;
                    z6 = z5;
                    i12 = i10;
                    i13 = i11;
                    str9 = str7;
                    j12 = j10;
                    z7 = z3;
                    arrayList3 = arrayList2;
                    r58 = r57;
                    z8 = z6;
                    if (!((Boolean) obj3).booleanValue()) {
                        SuperPassRepository superPassRepository6 = (SuperPassRepository) r58.getValue();
                        RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom2 = new RideBasedSuperPassRideDetailsRoom(str8, rideBasedSuperPassRideDetails);
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = listA;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str9;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = null;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                        rideBasedSuperPassRideDetails2 = rideBasedSuperPassRideDetails;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                        z12 = z7;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z12;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 4;
                        objH = superPassRepository6.b.H(rideBasedSuperPassRideDetailsRoom2, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                        if (objH != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objH = unit;
                        }
                        coroutineSingletons6 = coroutineSingletons4;
                        if (objH == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        str12 = str9;
                        superPassStatus4 = superPassStatus;
                        z13 = z12;
                        j17 = jH;
                        i19 = i2;
                        j18 = j3;
                        i20 = i12;
                        i21 = i8;
                        i22 = i9;
                        z14 = z8;
                        i23 = i13;
                        SuperPassStatus superPassStatus11 = superPassStatus4;
                        z15 = z14;
                        superPassStatus5 = superPassStatus11;
                        i24 = i19;
                        j19 = j18;
                        j20 = j2;
                        z16 = z13;
                        rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails2;
                        i25 = i20;
                        i26 = i23;
                        j21 = j17;
                        PassTierType.INSTANCE.getClass();
                        return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                    }
                    z9 = z7;
                    SuperPassRepository superPassRepository7 = (SuperPassRepository) r58.getValue();
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                    superPassStatus2 = superPassStatus;
                    arrayList4 = arrayList3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList4;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = str9;
                    str10 = str9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                    i14 = i13;
                    j13 = j12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j13;
                    j14 = j11;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j14;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 5;
                    objI = superPassRepository7.b.i(str8, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    coroutineSingletons = coroutineSingletons4;
                    if (objI != coroutineSingletons) {
                        obj4 = objI;
                        i15 = i8;
                        z10 = z8;
                        arrayList5 = arrayList4;
                        coroutineSingletons5 = coroutineSingletons;
                        j15 = j13;
                        i16 = i12;
                        i17 = i9;
                        i18 = i14;
                        j16 = j14;
                        str11 = str10;
                        superPassStatus3 = superPassStatus2;
                        z11 = z9;
                        r59 = r58;
                        str13 = str8;
                        rideBasedSuperPassRideDetails4 = (RideBasedSuperPassRideDetails) obj4;
                        j22 = j15;
                        UtilsKT utilsKT2 = UtilsKT.f10442a;
                        List list7 = rideBasedSuperPassRideDetails4.c;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str13;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = listA;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = str11;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = rideBasedSuperPassRideDetails4;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j22;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j16;
                        i27 = i16;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i27;
                        z17 = z10;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z17;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i17;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i15;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 6;
                        objC2 = utilsKT2.c(arrayList5, list7, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                        coroutineSingletons = coroutineSingletons5;
                        if (objC2 != coroutineSingletons) {
                            int i46 = i17;
                            i28 = i27;
                            i29 = i46;
                            coroutineSingletons7 = coroutineSingletons;
                            j23 = j3;
                            i30 = i15;
                            str14 = str13;
                            superPassStatus6 = superPassStatus3;
                            i31 = i2;
                            j24 = j16;
                            z18 = z17;
                            str15 = str11;
                            j25 = jH;
                            j26 = j22;
                            rideBasedSuperPassRideDetails5 = rideBasedSuperPassRideDetails4;
                            obj5 = objC2;
                            list2 = listA;
                            r510 = r59;
                            list3 = (List) obj5;
                            j27 = j26;
                            SuperPassRepository superPassRepository8 = (SuperPassRepository) r510.getValue();
                            boolean z22 = rideBasedSuperPassRideDetails5.d;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus6;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = list2;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str15;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails5;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = list3;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = j25;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j23;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i31;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                            list4 = list2;
                            str16 = str15;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j27;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j24;
                            i32 = i28;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i32;
                            z19 = z18;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z19;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i29;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i30;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                            superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 7;
                            superPassStatus7 = superPassStatus6;
                            j28 = j23;
                            i33 = i31;
                            i34 = i30;
                            coroutineSingletons8 = coroutineSingletons7;
                            j29 = j24;
                            rideBasedSuperPassRideDetails6 = rideBasedSuperPassRideDetails5;
                            i35 = i29;
                            objF = superPassRepository8.b.F(list3, z22, str14, j29, j27, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                            if (objF != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objF = unit;
                            }
                            if (objF == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                            j30 = j29;
                            j31 = j27;
                            i36 = i18;
                            i37 = i32;
                            rideBasedSuperPassRideDetails7 = rideBasedSuperPassRideDetails6;
                            i38 = i35;
                            superPassStatus8 = superPassStatus7;
                            i24 = i33;
                            list5 = list3;
                            z20 = z19;
                            j32 = j28;
                            j33 = j25;
                            i39 = i34;
                            rideBasedSuperPassRideDetails7.getClass();
                            Intrinsics.i(list5, "<set-?>");
                            rideBasedSuperPassRideDetails7.c = list5;
                            rideBasedSuperPassRideDetails7.f9570a = j30;
                            rideBasedSuperPassRideDetails7.b = j31;
                            rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails7;
                            i21 = i39;
                            i22 = i38;
                            superPassStatus5 = superPassStatus8;
                            j20 = j2;
                            j19 = j32;
                            str12 = str16;
                            z15 = z20;
                            i25 = i37;
                            i26 = i36;
                            z16 = z11;
                            j21 = j33;
                            listA = list4;
                            PassTierType.INSTANCE.getClass();
                            return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                int i47 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$5;
                boolean z23 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$2;
                int i48 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4;
                int i49 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3;
                boolean z24 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1;
                boolean z25 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0;
                int i50 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2;
                long j35 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4;
                long j36 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3;
                int i51 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1;
                int i52 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0;
                long j37 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2;
                long j38 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1;
                long j39 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0;
                List list8 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5;
                String str17 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4;
                List list9 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3;
                ArrayList arrayList7 = (ArrayList) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2;
                SuperPassStatus superPassStatus12 = (SuperPassStatus) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1;
                String str18 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0;
                ResultKt.b(obj6);
                str5 = str18;
                str6 = str17;
                j7 = j36;
                z = z25;
                j8 = j35;
                z3 = z23;
                i2 = i52;
                j3 = j37;
                j2 = j38;
                list = list8;
                arrayList = arrayList7;
                i9 = i49;
                unit = unit;
                i5 = i50;
                listA = list9;
                obj2 = obj6;
                r57 = obj7;
                z2 = z24;
                i6 = i47;
                jH = j39;
                coroutineSingletons2 = coroutineSingletons9;
                i7 = i51;
                i8 = i48;
                superPassStatus = superPassStatus12;
                long jLongValue4 = ((Number) obj2).longValue();
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z2;
                rideBasedSuperPassRideDetails = new RideBasedSuperPassRideDetails(list, z4, jLongValue4, z, j8, j7);
                j9 = j8;
                j10 = j7;
                i10 = i5;
                SuperPassRepository superPassRepository9 = (SuperPassRepository) r57.getValue();
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str5;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = str6;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = rideBasedSuperPassRideDetails;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i7;
                i11 = i7;
                arrayList2 = arrayList;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j10;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j9;
                str7 = str6;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i10;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z5;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 3;
                objB = superPassRepository9.b.b(str5, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                coroutineSingletons3 = coroutineSingletons2;
                if (objB == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                obj3 = objB;
                str8 = str5;
                j11 = j9;
                coroutineSingletons4 = coroutineSingletons3;
                z6 = z5;
                i12 = i10;
                i13 = i11;
                str9 = str7;
                j12 = j10;
                z7 = z3;
                arrayList3 = arrayList2;
                r58 = r57;
                z8 = z6;
                if (!((Boolean) obj3).booleanValue()) {
                    SuperPassRepository superPassRepository10 = (SuperPassRepository) r58.getValue();
                    RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom3 = new RideBasedSuperPassRideDetailsRoom(str8, rideBasedSuperPassRideDetails);
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = null;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                    rideBasedSuperPassRideDetails2 = rideBasedSuperPassRideDetails;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                    z12 = z7;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 4;
                    objH = superPassRepository10.b.H(rideBasedSuperPassRideDetailsRoom3, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    if (objH != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objH = unit;
                    }
                    coroutineSingletons6 = coroutineSingletons4;
                    if (objH == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                    str12 = str9;
                    superPassStatus4 = superPassStatus;
                    z13 = z12;
                    j17 = jH;
                    i19 = i2;
                    j18 = j3;
                    i20 = i12;
                    i21 = i8;
                    i22 = i9;
                    z14 = z8;
                    i23 = i13;
                    SuperPassStatus superPassStatus13 = superPassStatus4;
                    z15 = z14;
                    superPassStatus5 = superPassStatus13;
                    i24 = i19;
                    j19 = j18;
                    j20 = j2;
                    z16 = z13;
                    rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails2;
                    i25 = i20;
                    i26 = i23;
                    j21 = j17;
                    PassTierType.INSTANCE.getClass();
                    return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                }
                z9 = z7;
                SuperPassRepository superPassRepository11 = (SuperPassRepository) r58.getValue();
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str8;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                superPassStatus2 = superPassStatus;
                arrayList4 = arrayList3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList4;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = str9;
                str10 = str9;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                i14 = i13;
                j13 = j12;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j13;
                j14 = j11;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j14;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z9;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 5;
                objI = superPassRepository11.b.i(str8, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                coroutineSingletons = coroutineSingletons4;
                if (objI != coroutineSingletons) {
                    obj4 = objI;
                    i15 = i8;
                    z10 = z8;
                    arrayList5 = arrayList4;
                    coroutineSingletons5 = coroutineSingletons;
                    j15 = j13;
                    i16 = i12;
                    i17 = i9;
                    i18 = i14;
                    j16 = j14;
                    str11 = str10;
                    superPassStatus3 = superPassStatus2;
                    z11 = z9;
                    r59 = r58;
                    str13 = str8;
                    rideBasedSuperPassRideDetails4 = (RideBasedSuperPassRideDetails) obj4;
                    j22 = j15;
                    UtilsKT utilsKT3 = UtilsKT.f10442a;
                    List list10 = rideBasedSuperPassRideDetails4.c;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str13;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = str11;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = rideBasedSuperPassRideDetails4;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j22;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j16;
                    i27 = i16;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i27;
                    z17 = z10;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z17;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i17;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i15;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 6;
                    objC2 = utilsKT3.c(arrayList5, list10, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    coroutineSingletons = coroutineSingletons5;
                    if (objC2 != coroutineSingletons) {
                        int i410 = i17;
                        i28 = i27;
                        i29 = i410;
                        coroutineSingletons7 = coroutineSingletons;
                        j23 = j3;
                        i30 = i15;
                        str14 = str13;
                        superPassStatus6 = superPassStatus3;
                        i31 = i2;
                        j24 = j16;
                        z18 = z17;
                        str15 = str11;
                        j25 = jH;
                        j26 = j22;
                        rideBasedSuperPassRideDetails5 = rideBasedSuperPassRideDetails4;
                        obj5 = objC2;
                        list2 = listA;
                        r510 = r59;
                        list3 = (List) obj5;
                        j27 = j26;
                        SuperPassRepository superPassRepository12 = (SuperPassRepository) r510.getValue();
                        boolean z26 = rideBasedSuperPassRideDetails5.d;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus6;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = list2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str15;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails5;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = list3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = j25;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j23;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i31;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                        list4 = list2;
                        str16 = str15;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j27;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j24;
                        i32 = i28;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i32;
                        z19 = z18;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z19;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i29;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i30;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 7;
                        superPassStatus7 = superPassStatus6;
                        j28 = j23;
                        i33 = i31;
                        i34 = i30;
                        coroutineSingletons8 = coroutineSingletons7;
                        j29 = j24;
                        rideBasedSuperPassRideDetails6 = rideBasedSuperPassRideDetails5;
                        i35 = i29;
                        objF = superPassRepository12.b.F(list3, z26, str14, j29, j27, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                        if (objF != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objF = unit;
                        }
                        if (objF == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                        j30 = j29;
                        j31 = j27;
                        i36 = i18;
                        i37 = i32;
                        rideBasedSuperPassRideDetails7 = rideBasedSuperPassRideDetails6;
                        i38 = i35;
                        superPassStatus8 = superPassStatus7;
                        i24 = i33;
                        list5 = list3;
                        z20 = z19;
                        j32 = j28;
                        j33 = j25;
                        i39 = i34;
                        rideBasedSuperPassRideDetails7.getClass();
                        Intrinsics.i(list5, "<set-?>");
                        rideBasedSuperPassRideDetails7.c = list5;
                        rideBasedSuperPassRideDetails7.f9570a = j30;
                        rideBasedSuperPassRideDetails7.b = j31;
                        rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails7;
                        i21 = i39;
                        i22 = i38;
                        superPassStatus5 = superPassStatus8;
                        j20 = j2;
                        j19 = j32;
                        str12 = str16;
                        z15 = z20;
                        i25 = i37;
                        i26 = i36;
                        z16 = z11;
                        j21 = j33;
                        listA = list4;
                        PassTierType.INSTANCE.getClass();
                        return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                    }
                }
                return coroutineSingletons;
            case 3:
                boolean z27 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1;
                int i53 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4;
                int i54 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3;
                boolean z28 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0;
                int i55 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2;
                long j40 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4;
                long j41 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3;
                int i56 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1;
                int i57 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0;
                long j42 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2;
                long j43 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1;
                long j44 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0;
                RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails8 = (RideBasedSuperPassRideDetails) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5;
                String str19 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4;
                List list11 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3;
                ArrayList arrayList8 = (ArrayList) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2;
                SuperPassStatus superPassStatus14 = (SuperPassStatus) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1;
                str8 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0;
                ResultKt.b(obj6);
                rideBasedSuperPassRideDetails = rideBasedSuperPassRideDetails8;
                obj3 = obj6;
                r58 = obj7;
                j11 = j40;
                j12 = j41;
                i13 = i56;
                i2 = i57;
                j3 = j42;
                j2 = j43;
                listA = list11;
                coroutineSingletons4 = coroutineSingletons9;
                i9 = i54;
                unit = unit;
                i8 = i53;
                superPassStatus = superPassStatus14;
                str9 = str19;
                z6 = z28;
                i12 = i55;
                z7 = z27;
                jH = j44;
                arrayList3 = arrayList8;
                z8 = z6;
                if (!((Boolean) obj3).booleanValue()) {
                    SuperPassRepository superPassRepository13 = (SuperPassRepository) r58.getValue();
                    RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom4 = new RideBasedSuperPassRideDetailsRoom(str8, rideBasedSuperPassRideDetails);
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = null;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                    rideBasedSuperPassRideDetails2 = rideBasedSuperPassRideDetails;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                    z12 = z7;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z12;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 4;
                    objH = superPassRepository13.b.H(rideBasedSuperPassRideDetailsRoom4, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    if (objH != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objH = unit;
                    }
                    coroutineSingletons6 = coroutineSingletons4;
                    if (objH == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                    str12 = str9;
                    superPassStatus4 = superPassStatus;
                    z13 = z12;
                    j17 = jH;
                    i19 = i2;
                    j18 = j3;
                    i20 = i12;
                    i21 = i8;
                    i22 = i9;
                    z14 = z8;
                    i23 = i13;
                    SuperPassStatus superPassStatus15 = superPassStatus4;
                    z15 = z14;
                    superPassStatus5 = superPassStatus15;
                    i24 = i19;
                    j19 = j18;
                    j20 = j2;
                    z16 = z13;
                    rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails2;
                    i25 = i20;
                    i26 = i23;
                    j21 = j17;
                    PassTierType.INSTANCE.getClass();
                    return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                }
                z9 = z7;
                SuperPassRepository superPassRepository14 = (SuperPassRepository) r58.getValue();
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str8;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus;
                superPassStatus2 = superPassStatus;
                arrayList4 = arrayList3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = arrayList4;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = listA;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = str9;
                str10 = str9;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$5 = null;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i13;
                i14 = i13;
                j13 = j12;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j13;
                j14 = j11;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j14;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i12;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z8;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i9;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i8;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z9;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 5;
                objI = superPassRepository14.b.i(str8, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                coroutineSingletons = coroutineSingletons4;
                if (objI != coroutineSingletons) {
                    obj4 = objI;
                    i15 = i8;
                    z10 = z8;
                    arrayList5 = arrayList4;
                    coroutineSingletons5 = coroutineSingletons;
                    j15 = j13;
                    i16 = i12;
                    i17 = i9;
                    i18 = i14;
                    j16 = j14;
                    str11 = str10;
                    superPassStatus3 = superPassStatus2;
                    z11 = z9;
                    r59 = r58;
                    str13 = str8;
                    rideBasedSuperPassRideDetails4 = (RideBasedSuperPassRideDetails) obj4;
                    j22 = j15;
                    UtilsKT utilsKT4 = UtilsKT.f10442a;
                    List list12 = rideBasedSuperPassRideDetails4.c;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str13;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = listA;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = str11;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = rideBasedSuperPassRideDetails4;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j22;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j16;
                    i27 = i16;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i27;
                    z17 = z10;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z17;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i17;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i15;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 6;
                    objC2 = utilsKT4.c(arrayList5, list12, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    coroutineSingletons = coroutineSingletons5;
                    if (objC2 != coroutineSingletons) {
                        int i411 = i17;
                        i28 = i27;
                        i29 = i411;
                        coroutineSingletons7 = coroutineSingletons;
                        j23 = j3;
                        i30 = i15;
                        str14 = str13;
                        superPassStatus6 = superPassStatus3;
                        i31 = i2;
                        j24 = j16;
                        z18 = z17;
                        str15 = str11;
                        j25 = jH;
                        j26 = j22;
                        rideBasedSuperPassRideDetails5 = rideBasedSuperPassRideDetails4;
                        obj5 = objC2;
                        list2 = listA;
                        r510 = r59;
                        list3 = (List) obj5;
                        j27 = j26;
                        SuperPassRepository superPassRepository15 = (SuperPassRepository) r510.getValue();
                        boolean z29 = rideBasedSuperPassRideDetails5.d;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus6;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = list2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str15;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails5;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = list3;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = j25;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j23;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i31;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                        list4 = list2;
                        str16 = str15;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j27;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j24;
                        i32 = i28;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i32;
                        z19 = z18;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z19;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i29;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i30;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                        superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 7;
                        superPassStatus7 = superPassStatus6;
                        j28 = j23;
                        i33 = i31;
                        i34 = i30;
                        coroutineSingletons8 = coroutineSingletons7;
                        j29 = j24;
                        rideBasedSuperPassRideDetails6 = rideBasedSuperPassRideDetails5;
                        i35 = i29;
                        objF = superPassRepository15.b.F(list3, z29, str14, j29, j27, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                        if (objF != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objF = unit;
                        }
                        if (objF == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                        j30 = j29;
                        j31 = j27;
                        i36 = i18;
                        i37 = i32;
                        rideBasedSuperPassRideDetails7 = rideBasedSuperPassRideDetails6;
                        i38 = i35;
                        superPassStatus8 = superPassStatus7;
                        i24 = i33;
                        list5 = list3;
                        z20 = z19;
                        j32 = j28;
                        j33 = j25;
                        i39 = i34;
                        rideBasedSuperPassRideDetails7.getClass();
                        Intrinsics.i(list5, "<set-?>");
                        rideBasedSuperPassRideDetails7.c = list5;
                        rideBasedSuperPassRideDetails7.f9570a = j30;
                        rideBasedSuperPassRideDetails7.b = j31;
                        rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails7;
                        i21 = i39;
                        i22 = i38;
                        superPassStatus5 = superPassStatus8;
                        j20 = j2;
                        j19 = j32;
                        str12 = str16;
                        z15 = z20;
                        i25 = i37;
                        i26 = i36;
                        z16 = z11;
                        j21 = j33;
                        listA = list4;
                        PassTierType.INSTANCE.getClass();
                        return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                    }
                }
                return coroutineSingletons;
            case 4:
                boolean z30 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1;
                i21 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4;
                i22 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3;
                z14 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0;
                i20 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2;
                i23 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1;
                i19 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0;
                j18 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2;
                long j45 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1;
                long j46 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0;
                RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails9 = (RideBasedSuperPassRideDetails) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3;
                z13 = z30;
                String str20 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2;
                List list13 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1;
                superPassStatus4 = (SuperPassStatus) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0;
                ResultKt.b(obj6);
                j17 = j46;
                rideBasedSuperPassRideDetails2 = rideBasedSuperPassRideDetails9;
                j2 = j45;
                listA = list13;
                str12 = str20;
                SuperPassStatus superPassStatus16 = superPassStatus4;
                z15 = z14;
                superPassStatus5 = superPassStatus16;
                i24 = i19;
                j19 = j18;
                j20 = j2;
                z16 = z13;
                rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails2;
                i25 = i20;
                i26 = i23;
                j21 = j17;
                PassTierType.INSTANCE.getClass();
                return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
            case 5:
                boolean z31 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1;
                int i58 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4;
                int i59 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3;
                boolean z32 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0;
                int i60 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2;
                long j47 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4;
                long j48 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3;
                int i61 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1;
                int i62 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0;
                long j49 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2;
                long j50 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1;
                long j51 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0;
                String str21 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4;
                List list14 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3;
                ArrayList arrayList9 = (ArrayList) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2;
                SuperPassStatus superPassStatus17 = (SuperPassStatus) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1;
                str8 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0;
                ResultKt.b(obj6);
                str11 = str21;
                obj4 = obj6;
                r59 = obj7;
                i16 = i60;
                arrayList5 = arrayList9;
                listA = list14;
                coroutineSingletons5 = coroutineSingletons9;
                z10 = z32;
                jH = j51;
                superPassStatus3 = superPassStatus17;
                i17 = i59;
                j15 = j48;
                i15 = i58;
                z11 = z31;
                unit = unit;
                j16 = j47;
                i18 = i61;
                i2 = i62;
                j3 = j49;
                j2 = j50;
                str13 = str8;
                rideBasedSuperPassRideDetails4 = (RideBasedSuperPassRideDetails) obj4;
                j22 = j15;
                UtilsKT utilsKT5 = UtilsKT.f10442a;
                List list15 = rideBasedSuperPassRideDetails4.c;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = str13;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = superPassStatus3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = listA;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = str11;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = rideBasedSuperPassRideDetails4;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = jH;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j22;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j16;
                i27 = i16;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i27;
                z17 = z10;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z17;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i17;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i15;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 6;
                objC2 = utilsKT5.c(arrayList5, list15, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                coroutineSingletons = coroutineSingletons5;
                if (objC2 != coroutineSingletons) {
                    int i412 = i17;
                    i28 = i27;
                    i29 = i412;
                    coroutineSingletons7 = coroutineSingletons;
                    j23 = j3;
                    i30 = i15;
                    str14 = str13;
                    superPassStatus6 = superPassStatus3;
                    i31 = i2;
                    j24 = j16;
                    z18 = z17;
                    str15 = str11;
                    j25 = jH;
                    j26 = j22;
                    rideBasedSuperPassRideDetails5 = rideBasedSuperPassRideDetails4;
                    obj5 = objC2;
                    list2 = listA;
                    r510 = r59;
                    list3 = (List) obj5;
                    j27 = j26;
                    SuperPassRepository superPassRepository16 = (SuperPassRepository) r510.getValue();
                    boolean z210 = rideBasedSuperPassRideDetails5.d;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus6;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = list2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str15;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails5;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = list3;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = j25;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j23;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i31;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                    list4 = list2;
                    str16 = str15;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j27;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j24;
                    i32 = i28;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i32;
                    z19 = z18;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z19;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i29;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i30;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                    superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 7;
                    superPassStatus7 = superPassStatus6;
                    j28 = j23;
                    i33 = i31;
                    i34 = i30;
                    coroutineSingletons8 = coroutineSingletons7;
                    j29 = j24;
                    rideBasedSuperPassRideDetails6 = rideBasedSuperPassRideDetails5;
                    i35 = i29;
                    objF = superPassRepository16.b.F(list3, z210, str14, j29, j27, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                    if (objF != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objF = unit;
                    }
                    if (objF == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    j30 = j29;
                    j31 = j27;
                    i36 = i18;
                    i37 = i32;
                    rideBasedSuperPassRideDetails7 = rideBasedSuperPassRideDetails6;
                    i38 = i35;
                    superPassStatus8 = superPassStatus7;
                    i24 = i33;
                    list5 = list3;
                    z20 = z19;
                    j32 = j28;
                    j33 = j25;
                    i39 = i34;
                    rideBasedSuperPassRideDetails7.getClass();
                    Intrinsics.i(list5, "<set-?>");
                    rideBasedSuperPassRideDetails7.c = list5;
                    rideBasedSuperPassRideDetails7.f9570a = j30;
                    rideBasedSuperPassRideDetails7.b = j31;
                    rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails7;
                    i21 = i39;
                    i22 = i38;
                    superPassStatus5 = superPassStatus8;
                    j20 = j2;
                    j19 = j32;
                    str12 = str16;
                    z15 = z20;
                    i25 = i37;
                    i26 = i36;
                    z16 = z11;
                    j21 = j33;
                    listA = list4;
                    PassTierType.INSTANCE.getClass();
                    return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
                }
                return coroutineSingletons;
            case 6:
                boolean z33 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1;
                int i63 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4;
                int i64 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3;
                boolean z34 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0;
                int i65 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2;
                long j52 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4;
                long j53 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3;
                int i66 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1;
                int i67 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0;
                long j54 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2;
                long j55 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1;
                long j56 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0;
                RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails10 = (RideBasedSuperPassRideDetails) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4;
                str15 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3;
                List list16 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2;
                SuperPassStatus superPassStatus18 = (SuperPassStatus) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1;
                String str22 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0;
                ResultKt.b(obj6);
                z11 = z33;
                i30 = i63;
                obj5 = obj6;
                str14 = str22;
                r510 = obj7;
                list2 = list16;
                coroutineSingletons7 = coroutineSingletons9;
                i29 = i64;
                j23 = j54;
                j25 = j56;
                z18 = z34;
                unit = unit;
                i18 = i66;
                rideBasedSuperPassRideDetails5 = rideBasedSuperPassRideDetails10;
                j24 = j52;
                superPassStatus6 = superPassStatus18;
                i28 = i65;
                j26 = j53;
                i31 = i67;
                j2 = j55;
                list3 = (List) obj5;
                j27 = j26;
                SuperPassRepository superPassRepository17 = (SuperPassRepository) r510.getValue();
                boolean z211 = rideBasedSuperPassRideDetails5.d;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0 = superPassStatus6;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1 = list2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2 = str15;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3 = rideBasedSuperPassRideDetails5;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4 = list3;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0 = j25;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1 = j2;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2 = j23;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0 = i31;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1 = i18;
                list4 = list2;
                str16 = str15;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3 = j27;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4 = j24;
                i32 = i28;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2 = i32;
                z19 = z18;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0 = z19;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3 = i29;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4 = i30;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1 = z11;
                superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.label = 7;
                superPassStatus7 = superPassStatus6;
                j28 = j23;
                i33 = i31;
                i34 = i30;
                coroutineSingletons8 = coroutineSingletons7;
                j29 = j24;
                rideBasedSuperPassRideDetails6 = rideBasedSuperPassRideDetails5;
                i35 = i29;
                objF = superPassRepository17.b.F(list3, z211, str14, j29, j27, superPassJsonParser$parseRideBasedSuperPassValidationProperties$2);
                if (objF != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objF = unit;
                }
                if (objF == coroutineSingletons8) {
                    return coroutineSingletons8;
                }
                j30 = j29;
                j31 = j27;
                i36 = i18;
                i37 = i32;
                rideBasedSuperPassRideDetails7 = rideBasedSuperPassRideDetails6;
                i38 = i35;
                superPassStatus8 = superPassStatus7;
                i24 = i33;
                list5 = list3;
                z20 = z19;
                j32 = j28;
                j33 = j25;
                i39 = i34;
                rideBasedSuperPassRideDetails7.getClass();
                Intrinsics.i(list5, "<set-?>");
                rideBasedSuperPassRideDetails7.c = list5;
                rideBasedSuperPassRideDetails7.f9570a = j30;
                rideBasedSuperPassRideDetails7.b = j31;
                rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails7;
                i21 = i39;
                i22 = i38;
                superPassStatus5 = superPassStatus8;
                j20 = j2;
                j19 = j32;
                str12 = str16;
                z15 = z20;
                i25 = i37;
                i26 = i36;
                z16 = z11;
                j21 = j33;
                listA = list4;
                PassTierType.INSTANCE.getClass();
                return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
            case 7:
                boolean z35 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$1;
                i39 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$4;
                i38 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$3;
                z20 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.Z$0;
                i37 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$2;
                j30 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$4;
                j31 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$3;
                i36 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$1;
                i24 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.I$0;
                long j57 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$2;
                long j58 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$1;
                j33 = superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.J$0;
                List list17 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$4;
                rideBasedSuperPassRideDetails7 = (RideBasedSuperPassRideDetails) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$3;
                String str23 = (String) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$2;
                List list18 = (List) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$1;
                superPassStatus8 = (SuperPassStatus) superPassJsonParser$parseRideBasedSuperPassValidationProperties$2.L$0;
                ResultKt.b(obj6);
                list4 = list18;
                str16 = str23;
                list5 = list17;
                j32 = j57;
                j2 = j58;
                z11 = z35;
                rideBasedSuperPassRideDetails7.getClass();
                Intrinsics.i(list5, "<set-?>");
                rideBasedSuperPassRideDetails7.c = list5;
                rideBasedSuperPassRideDetails7.f9570a = j30;
                rideBasedSuperPassRideDetails7.b = j31;
                rideBasedSuperPassRideDetails3 = rideBasedSuperPassRideDetails7;
                i21 = i39;
                i22 = i38;
                superPassStatus5 = superPassStatus8;
                j20 = j2;
                j19 = j32;
                str12 = str16;
                z15 = z20;
                i25 = i37;
                i26 = i36;
                z16 = z11;
                j21 = j33;
                listA = list4;
                PassTierType.INSTANCE.getClass();
                return new RideBasedSuperPassValidationProperties(superPassStatus5, j21, j20, j19, listA, z15, i24, i26, i25, rideBasedSuperPassRideDetails3, PassTierType.Companion.a(str12), new Integer(i22), new Integer(i21), z16);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r8 == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable k(kotlinx.serialization.json.JsonObject r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.superpass.data.parser.SuperPassJsonParser$parseSinglePass$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.superpass.data.parser.SuperPassJsonParser$parseSinglePass$1 r0 = (app.chalo.superpass.data.parser.SuperPassJsonParser$parseSinglePass$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.superpass.data.parser.SuperPassJsonParser$parseSinglePass$1 r0 = new app.chalo.superpass.data.parser.SuperPassJsonParser$parseSinglePass$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r3) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$0
            kotlinx.serialization.json.JsonObject r7 = (kotlinx.serialization.json.JsonObject) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L2f
            goto L8e
        L2f:
            r8 = move-exception
            goto L9b
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.L$0
            kotlinx.serialization.json.JsonObject r7 = (kotlinx.serialization.json.JsonObject) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L2f
            goto L76
        L42:
            kotlin.ResultKt.b(r8)
            java.lang.String r8 = "productSubType"
            java.lang.Object r8 = r7.get(r8)     // Catch: java.lang.Exception -> L2f
            kotlinx.serialization.json.JsonElement r8 = (kotlinx.serialization.json.JsonElement) r8     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L5c
            app.chalo.network.config.ChaloJson r2 = app.chalo.network.config.ChaloJson.f6455a     // Catch: java.lang.Exception -> L2f
            kotlinx.serialization.json.JsonPrimitive r8 = app.chalo.network.config.ChaloJson.a(r8)     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L5c
            java.lang.String r8 = r8.getC()     // Catch: java.lang.Exception -> L2f
            goto L5d
        L5c:
            r8 = r5
        L5d:
            boolean r2 = b(r7)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L93
            java.lang.String r2 = "magicPass"
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r8, r2)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L7a
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2f
            r0.label = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r6.d(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L76
            goto L8d
        L76:
            app.chalo.superpass.data.models.entities.MagicSuperPass r8 = (app.chalo.superpass.data.models.entities.MagicSuperPass) r8     // Catch: java.lang.Exception -> L2f
            r0 = r5
            goto L95
        L7a:
            java.lang.String r2 = "rideBasedPass"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r2)     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L93
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2f
            r0.label = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r6.i(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L8e
        L8d:
            return r1
        L8e:
            app.chalo.superpass.data.models.entities.RideBasedSuperPass r8 = (app.chalo.superpass.data.models.entities.RideBasedSuperPass) r8     // Catch: java.lang.Exception -> L2f
            r0 = r8
            r8 = r5
            goto L95
        L93:
            r8 = r5
            r0 = r8
        L95:
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Exception -> L2f
            r1.<init>(r8, r0)     // Catch: java.lang.Exception -> L2f
            return r1
        L9b:
            java.lang.String r0 = "passId"
            java.lang.String r1 = ""
            java.lang.String r7 = app.chalo.extensions.JsonElementExtensionsKt.s(r7, r0, r1)
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error parsing pass with id: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = ": "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "message"
            kotlin.jvm.internal.Intrinsics.i(r7, r8)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.parser.SuperPassJsonParser.k(kotlinx.serialization.json.JsonObject, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    public final Object r(JsonObject jsonObject, String str, ContinuationImpl continuationImpl) throws JsonException {
        SuperPassJsonParser$parseSuperPassValidationProperties$1 superPassJsonParser$parseSuperPassValidationProperties$1;
        long jH;
        long jH2;
        SuperPassStatus superPassStatus;
        long j;
        long j2;
        JsonObject jsonObject2 = jsonObject;
        if (continuationImpl instanceof SuperPassJsonParser$parseSuperPassValidationProperties$1) {
            superPassJsonParser$parseSuperPassValidationProperties$1 = (SuperPassJsonParser$parseSuperPassValidationProperties$1) continuationImpl;
            int i = superPassJsonParser$parseSuperPassValidationProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassJsonParser$parseSuperPassValidationProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassJsonParser$parseSuperPassValidationProperties$1 = new SuperPassJsonParser$parseSuperPassValidationProperties$1(this, continuationImpl);
            }
        } else {
            superPassJsonParser$parseSuperPassValidationProperties$1 = new SuperPassJsonParser$parseSuperPassValidationProperties$1(this, continuationImpl);
        }
        Object obj = superPassJsonParser$parseSuperPassValidationProperties$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassJsonParser$parseSuperPassValidationProperties$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassStatus superPassStatusValueOf = SuperPassStatus.valueOf(JsonElementExtensionsKt.j(jsonObject2, "status"));
            jH = JsonElementExtensionsKt.h(jsonObject2, "startTime");
            jH2 = JsonElementExtensionsKt.h(jsonObject2, "expiryTime");
            long jH3 = JsonElementExtensionsKt.h(jsonObject2, "activeDuration");
            JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObject2, "punches");
            int size = jsonArrayD.f18186a.size();
            long j3 = -1;
            for (int i3 = 0; i3 < size; i3++) {
                long jH4 = JsonElementExtensionsKt.h(JsonElementExtensionsKt.f(jsonArrayD, i3), "punchingTime");
                if (jH4 > j3) {
                    j3 = jH4;
                }
            }
            Object obj2 = SuperPassActivationTimestampMapHelper.f9561a;
            superPassJsonParser$parseSuperPassValidationProperties$1.L$0 = jsonObject2;
            superPassJsonParser$parseSuperPassValidationProperties$1.L$1 = superPassStatusValueOf;
            superPassJsonParser$parseSuperPassValidationProperties$1.J$0 = jH;
            superPassJsonParser$parseSuperPassValidationProperties$1.J$1 = jH2;
            superPassJsonParser$parseSuperPassValidationProperties$1.J$2 = jH3;
            superPassJsonParser$parseSuperPassValidationProperties$1.J$3 = j3;
            superPassJsonParser$parseSuperPassValidationProperties$1.label = 1;
            Object objV = FlowKt.v(((LocalDataStore) SuperPassActivationTimestampMapHelper.f9561a.getValue()).e(PreferencesKeys.stringKey(str)), superPassJsonParser$parseSuperPassValidationProperties$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            superPassStatus = superPassStatusValueOf;
            obj = objV;
            j = jH3;
            j2 = j3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = superPassJsonParser$parseSuperPassValidationProperties$1.J$3;
            long j4 = superPassJsonParser$parseSuperPassValidationProperties$1.J$2;
            jH2 = superPassJsonParser$parseSuperPassValidationProperties$1.J$1;
            jH = superPassJsonParser$parseSuperPassValidationProperties$1.J$0;
            SuperPassStatus superPassStatus2 = (SuperPassStatus) superPassJsonParser$parseSuperPassValidationProperties$1.L$1;
            JsonObject jsonObject3 = (JsonObject) superPassJsonParser$parseSuperPassValidationProperties$1.L$0;
            ResultKt.b(obj);
            superPassStatus = superPassStatus2;
            jsonObject2 = jsonObject3;
            j = j4;
        }
        long j5 = jH2;
        long j6 = jH;
        String str2 = (String) obj;
        SuperPassRideDetails superPassRideDetails = new SuperPassRideDetails(str2 != null ? Long.parseLong(str2) : -1L, j2);
        ArrayList arrayListA = a(JsonElementExtensionsKt.o(jsonObject2, "serviceType"));
        boolean zM = JsonElementExtensionsKt.m(jsonObject2, "isHailingAllowed", true);
        String strS = JsonElementExtensionsKt.s(jsonObject2, "tierType", "");
        int iN = JsonElementExtensionsKt.n(-1, "advanceBookingWindow", jsonObject2);
        int iN2 = JsonElementExtensionsKt.n(-1, "allowedNumberOfDaysForBulkBooking", jsonObject2);
        boolean zM2 = JsonElementExtensionsKt.m(jsonObject2, "bulkBookingAllowed", false);
        PassTierType.INSTANCE.getClass();
        return new SuperPassValidationProperties(superPassStatus, j6, j5, j, arrayListA, zM, superPassRideDetails, PassTierType.Companion.a(strS), new Integer(iN), new Integer(iN2), zM2);
    }
}
