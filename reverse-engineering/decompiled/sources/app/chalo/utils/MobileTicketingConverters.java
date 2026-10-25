package app.chalo.utils;

import androidx.autofill.HintConstants;
import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.metro.data.api.MetroTicketApiModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.domain.GetMetroTicketAppModelFromApiUseCase;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketPassengerInfo;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserAgencyInfo;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.domain.GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.domain.GetOndcTicketAppModelFromApiUseCase;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropInfoApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel;
import app.chalo.userprofile.Gender;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/MobileTicketingConverters;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MobileTicketingConverters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase f10433a;
    public final CrashlyticsLogger b;
    public final BaseMobileTicketConverters c;

    public MobileTicketingConverters(GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase getPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase, GetOndcTicketAppModelFromApiUseCase getOndcTicketAppModelFromApiUseCase, GetMetroTicketAppModelFromApiUseCase getMetroTicketAppModelFromApiUseCase, GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase getMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase, CrashlyticsLogger crashlyticsLogger, BaseMobileTicketConverters baseMobileTicketConverters) {
        this.f10433a = getMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase;
        this.b = crashlyticsLogger;
        this.c = baseMobileTicketConverters;
    }

    public static String a(MobileTicketingConverters mobileTicketingConverters, String str) {
        return (str == null || str.equalsIgnoreCase("null")) ? "" : str;
    }

    public static MTicketTripReceipt i(JsonObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }
        return new MTicketTripReceipt(JsonElementExtensionsKt.s(jsonObject, "ticketId", ""), JsonElementExtensionsKt.q(jsonObject, "activationTime", -1L), JsonElementExtensionsKt.q(jsonObject, "punchTime", -1L), JsonElementExtensionsKt.s(jsonObject, "vehicleNo", ""), JsonElementExtensionsKt.s(jsonObject, "conductorId", ""), JsonElementExtensionsKt.s(jsonObject, "toStopId", ""));
    }

    public static String j(Map map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(JsonElementKt.b((String) it.next()));
            }
        }
        return new JsonArray(arrayList).toString();
    }

    public final ArrayList b(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        int size = jsonArray.f18186a.size();
        for (int i = 0; i < size; i++) {
            try {
                JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArray, i);
                String strJ = JsonElementExtensionsKt.j(jsonObjectF, "productType");
                String strJ2 = JsonElementExtensionsKt.j(jsonObjectF, "productSubType");
                if ("mobileTicket".equalsIgnoreCase(strJ) && "instantTicket".equalsIgnoreCase(strJ2)) {
                    arrayList.add(jsonObjectF);
                }
            } catch (Exception e) {
                this.b.i(e);
            }
        }
        return arrayList;
    }

    public final ArrayList c(JsonArray jsonArray) {
        MetroTicketApiModel metroTicketApiModel;
        MetroTicketAppModel metroTicketAppModelA;
        CrashlyticsLogger crashlyticsLogger = this.b;
        ArrayList arrayList = new ArrayList();
        try {
            int size = jsonArray.f18186a.size();
            for (int i = 0; i < size; i++) {
                JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArray, i);
                String strJ = JsonElementExtensionsKt.j(jsonObjectF, "productType");
                String strJ2 = JsonElementExtensionsKt.j(jsonObjectF, "productSubType");
                if ("mobileTicket".equalsIgnoreCase(strJ) && "metroTicket".equalsIgnoreCase(strJ2)) {
                    try {
                        Json json = ChaloJson.b;
                        String string = jsonObjectF.toString();
                        json.getClass();
                        metroTicketApiModel = (MetroTicketApiModel) json.b(string, MetroTicketApiModel.INSTANCE.serializer());
                    } catch (Exception e) {
                        crashlyticsLogger.i(e);
                        metroTicketApiModel = null;
                    }
                    if (metroTicketApiModel != null && (metroTicketAppModelA = GetMetroTicketAppModelFromApiUseCase.a(metroTicketApiModel)) != null) {
                        arrayList.add(metroTicketAppModelA);
                    }
                }
            }
        } catch (Exception e2) {
            crashlyticsLogger.i(e2);
        }
        return arrayList;
    }

    public final ArrayList d(JsonArray jsonArray) {
        CrashlyticsLogger crashlyticsLogger = this.b;
        ArrayList arrayList = new ArrayList();
        try {
            int size = jsonArray.f18186a.size();
            for (int i = 0; i < size; i++) {
                try {
                    JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArray, i);
                    Json json = ChaloJson.b;
                    String string = jsonObjectF.toString();
                    json.getClass();
                    MultiModalGroupTicketAppModel multiModalGroupTicketAppModelA = this.f10433a.a((GenericMobileTicketProductApiResponseModel) json.b(string, GenericMobileTicketProductApiResponseModel.INSTANCE.serializer()));
                    if (multiModalGroupTicketAppModelA != null) {
                        arrayList.add(multiModalGroupTicketAppModelA);
                    }
                } catch (Exception e) {
                    crashlyticsLogger.i(e);
                }
            }
        } catch (Exception e2) {
            crashlyticsLogger.i(e2);
        }
        return arrayList;
    }

    public final ArrayList e(JsonArray jsonArray) {
        GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel;
        OndcTicketAppModel ondcTicketAppModelA;
        CrashlyticsLogger crashlyticsLogger = this.b;
        ArrayList arrayList = new ArrayList();
        try {
            int size = jsonArray.f18186a.size();
            for (int i = 0; i < size; i++) {
                JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArray, i);
                String strJ = JsonElementExtensionsKt.j(jsonObjectF, "productType");
                String strJ2 = JsonElementExtensionsKt.j(jsonObjectF, "productSubType");
                if ("mobileTicket".equalsIgnoreCase(strJ) && "ondcTicket".equalsIgnoreCase(strJ2)) {
                    try {
                        Json json = ChaloJson.b;
                        String string = jsonObjectF.toString();
                        json.getClass();
                        genericMobileTicketProductApiResponseModel = (GenericMobileTicketProductApiResponseModel) json.b(string, GenericMobileTicketProductApiResponseModel.INSTANCE.serializer());
                    } catch (Exception e) {
                        crashlyticsLogger.i(e);
                        genericMobileTicketProductApiResponseModel = null;
                    }
                    if (genericMobileTicketProductApiResponseModel != null && (ondcTicketAppModelA = GetOndcTicketAppModelFromApiUseCase.a(genericMobileTicketProductApiResponseModel)) != null) {
                        arrayList.add(ondcTicketAppModelA);
                    }
                }
            }
        } catch (Exception e2) {
            crashlyticsLogger.i(e2);
        }
        return arrayList;
    }

    public final ArrayList f(JsonArray jsonArray) {
        GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel;
        PremiumReserveTicketAppModel premiumReserveTicketAppModelA;
        CrashlyticsLogger crashlyticsLogger = this.b;
        ArrayList arrayList = new ArrayList();
        try {
            int size = jsonArray.f18186a.size();
            for (int i = 0; i < size; i++) {
                JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArray, i);
                String strJ = JsonElementExtensionsKt.j(jsonObjectF, "productType");
                String strJ2 = JsonElementExtensionsKt.j(jsonObjectF, "productSubType");
                if ("mobileTicket".equalsIgnoreCase(strJ) && "premiumReserveTicket".equalsIgnoreCase(strJ2)) {
                    try {
                        Json json = ChaloJson.b;
                        String string = jsonObjectF.toString();
                        json.getClass();
                        genericMobileTicketProductApiResponseModel = (GenericMobileTicketProductApiResponseModel) json.b(string, GenericMobileTicketProductApiResponseModel.INSTANCE.serializer());
                    } catch (Exception e) {
                        crashlyticsLogger.i(e);
                        genericMobileTicketProductApiResponseModel = null;
                    }
                    if (genericMobileTicketProductApiResponseModel != null && (premiumReserveTicketAppModelA = GetPremiumReserveTicketFromGenericMobileTicketResponseIfValidUseCase.a(genericMobileTicketProductApiResponseModel)) != null) {
                        arrayList.add(premiumReserveTicketAppModelA);
                    }
                }
            }
        } catch (Exception e2) {
            crashlyticsLogger.i(e2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r49v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r50v0, types: [java.util.LinkedHashMap] */
    public final MTicket g(String mTicketJson) throws JsonException {
        MTicket mTicket;
        UserProfile userProfileL;
        ArrayList arrayList;
        double dB;
        double dB2;
        Iterator it;
        boolean z;
        ?? linkedHashMap;
        ?? linkedHashMap2;
        Set<String> setKeySet;
        Set setKeySet2;
        CrashlyticsLogger crashlyticsLogger = this.b;
        Intrinsics.i(mTicketJson, "mTicketJson");
        try {
            JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(mTicketJson));
            String strS = jsonObjectG.containsKey("userId") ? JsonElementExtensionsKt.s(jsonObjectG, "userId", "") : null;
            String strS2 = JsonElementExtensionsKt.s(jsonObjectG, "ticketId", "");
            String strS3 = JsonElementExtensionsKt.s(jsonObjectG, PaymentConstants.ORDER_ID_CAMEL, "");
            String strJ = JsonElementExtensionsKt.j(jsonObjectG, "agency");
            String strJ2 = JsonElementExtensionsKt.j(jsonObjectG, "city");
            String strJ3 = JsonElementExtensionsKt.j(jsonObjectG, "routeId");
            String strJ4 = JsonElementExtensionsKt.j(jsonObjectG, "routeName");
            String strS4 = JsonElementExtensionsKt.s(jsonObjectG, "status", "");
            String strJ5 = JsonElementExtensionsKt.j(jsonObjectG, "startStopId");
            String strJ6 = JsonElementExtensionsKt.j(jsonObjectG, "startStopName");
            String strJ7 = JsonElementExtensionsKt.j(jsonObjectG, "endStopId");
            String strJ8 = JsonElementExtensionsKt.j(jsonObjectG, "endStopName");
            MTicketTripReceipt mTicketTripReceiptI = i(JsonElementExtensionsKt.p(jsonObjectG, "ticketReceipt"));
            ArrayList arrayList2 = new ArrayList();
            if (JsonElementExtensionsKt.l("userDetails", jsonObjectG)) {
                String strJ9 = JsonElementExtensionsKt.j(jsonObjectG, "userDetails");
                if (strJ9.length() > 0) {
                    userProfileL = l(strJ9, strJ);
                } else {
                    userProfileL = null;
                }
            } else {
                userProfileL = null;
            }
            if (JsonElementExtensionsKt.l("specialFeatures", jsonObjectG)) {
                JsonArray jsonArrayD = JsonElementExtensionsKt.d(jsonObjectG, "specialFeatures");
                ArrayList arrayList3 = new ArrayList();
                mTicket = null;
                try {
                    int size = jsonArrayD.f18186a.size();
                    for (int i = 0; i < size; i++) {
                        try {
                            arrayList3.add(RouteLegacySpecialFeature.valueOf(JsonElementExtensionsKt.i(jsonArrayD, i)));
                        } catch (Exception e) {
                            arrayList2.add(JsonElementExtensionsKt.i(jsonArrayD, i));
                            crashlyticsLogger.i(e);
                        }
                    }
                    arrayList = arrayList3;
                } catch (JsonException e2) {
                    e = e2;
                    crashlyticsLogger.i(e);
                    e.printStackTrace();
                    return mTicket;
                }
            } else {
                mTicket = null;
                arrayList = null;
            }
            if (JsonElementExtensionsKt.l("spf", jsonObjectG)) {
                JsonArray jsonArrayD2 = JsonElementExtensionsKt.d(jsonObjectG, "spf");
                int size2 = jsonArrayD2.f18186a.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        arrayList2.add(JsonElementExtensionsKt.i(jsonArrayD2, i2));
                    } catch (Exception e3) {
                        crashlyticsLogger.i(e3);
                    }
                }
            }
            long jH = JsonElementExtensionsKt.h(jsonObjectG, "bookingTime");
            long jH2 = JsonElementExtensionsKt.h(jsonObjectG, "expiryTime");
            boolean zA = JsonElementExtensionsKt.a(jsonObjectG, "isExpired");
            long jQ = JsonElementExtensionsKt.q(jsonObjectG, "activatedAt", 0L);
            boolean zM = JsonElementExtensionsKt.m(jsonObjectG, "isActivated", false);
            String strS5 = JsonElementExtensionsKt.s(jsonObjectG, "qrCode", "");
            String strS6 = JsonElementExtensionsKt.s(jsonObjectG, "tone", "");
            Object obj = StringsKt.x(strS6, "null", true) ? mTicket : strS6;
            ?? S = jsonObjectG.containsKey("paymentMode") ? JsonElementExtensionsKt.s(jsonObjectG, "paymentMode", "") : mTicket;
            long jQ2 = JsonElementExtensionsKt.q(jsonObjectG, "punchedAt", 0L);
            JsonObject jsonObjectG2 = JsonElementExtensionsKt.g(jsonObjectG, "passengerDetails");
            boolean zM2 = JsonElementExtensionsKt.m(jsonObjectG, "isFreeRide", false);
            HashMap map = new HashMap();
            Iterator it2 = jsonObjectG2.f18198a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object obj2 = obj;
                String str = (String) entry.getKey();
                JsonObject jsonObjectG3 = JsonElementKt.g((JsonElement) entry.getValue());
                long j = jQ2;
                int iC = JsonElementExtensionsKt.c(jsonObjectG3, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
                double dB3 = JsonElementExtensionsKt.b(jsonObjectG3, "f");
                try {
                    dB = JsonElementExtensionsKt.b(jsonObjectG3, "ff");
                } catch (Exception unused) {
                    dB = dB3;
                }
                try {
                    dB2 = JsonElementExtensionsKt.b(jsonObjectG3, "d");
                } catch (Exception unused2) {
                    dB2 = 0.0d;
                }
                double d = dB2;
                int iN = JsonElementExtensionsKt.n(0, "roundingLogic", jsonObjectG3);
                JsonObject jsonObjectP = JsonElementExtensionsKt.p(jsonObjectG3, "f_br");
                if (jsonObjectP != null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap = new LinkedHashMap();
                    it = it2;
                    JsonObject jsonObjectP2 = JsonElementExtensionsKt.p(jsonObjectP, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
                    z = zM2;
                    JsonObject jsonObjectP3 = JsonElementExtensionsKt.p(jsonObjectP, "s");
                    if (jsonObjectP2 != null && (setKeySet2 = jsonObjectP2.f18198a.keySet()) != null) {
                        Iterator it3 = setKeySet2.iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = it3;
                            String str2 = (String) it3.next();
                            linkedHashMap2.put(str2, Double.valueOf(JsonElementExtensionsKt.b(jsonObjectP2, str2)));
                            jsonObjectP2 = jsonObjectP2;
                            it3 = it4;
                        }
                    }
                    if (jsonObjectP3 != null && (setKeySet = jsonObjectP3.f18198a.keySet()) != null) {
                        for (String str3 : setKeySet) {
                            linkedHashMap.put(str3, Double.valueOf(JsonElementExtensionsKt.b(jsonObjectP3, str3)));
                            jsonObjectP3 = jsonObjectP3;
                        }
                    }
                } else {
                    it = it2;
                    z = zM2;
                    linkedHashMap = mTicket;
                    linkedHashMap2 = linkedHashMap;
                }
                map.put(str, new MTicketPassengerInfo(dB3, Double.valueOf(dB), d, iC, linkedHashMap2, linkedHashMap, iN));
                it2 = it;
                obj = obj2;
                zM2 = z;
                jQ2 = j;
            }
            boolean z2 = zM2;
            return new MTicket(strS2, strS, null, strJ2, strJ, new RouteStopsInfo(strJ3, strJ4, strJ5, strJ6, strJ7, strJ8, arrayList, arrayList2), null, map, jH, jH2, zA, jQ, zM, Long.valueOf(jQ2), userProfileL, strS5, obj, new MTicketConfiguration(JsonElementExtensionsKt.j(jsonObjectG, "configurationId")), Boolean.valueOf(z2), !z2, null, null, null, strS3, strS4, S, mTicketTripReceiptI, 946864196);
        } catch (JsonException e4) {
            e = e4;
            mTicket = null;
        }
    }

    public final LinkedHashMap h(String mapJson) {
        Intrinsics.i(mapJson, "mapJson");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(mapJson));
            for (String str : jsonObjectG.f18198a.keySet()) {
                linkedHashMap.put(str, JsonElementExtensionsKt.j(jsonObjectG, str));
            }
            return linkedHashMap;
        } catch (JsonException e) {
            this.b.i(e);
            e.printStackTrace();
            return linkedHashMap;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    public final List k(JsonObject jsonObject) {
        JsonObject jsonObjectG;
        String lowerCase;
        if (jsonObject == null) {
            return EmptyList.f17557a;
        }
        try {
            JsonArray jsonArrayO = JsonElementExtensionsKt.o(jsonObject, "documentProps");
            if (jsonArrayO == null) {
                return EmptyList.f17557a;
            }
            try {
                JsonArray jsonArrayF = JsonElementKt.f(jsonArrayO);
                ArrayList arrayList = new ArrayList();
                Iterator it = jsonArrayF.f18186a.iterator();
                while (it.hasNext()) {
                    ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel = null;
                    strA = null;
                    String strA = null;
                    try {
                        jsonObjectG = JsonElementKt.g((JsonElement) it.next());
                    } catch (Exception unused) {
                        jsonObjectG = null;
                    }
                    if (jsonObjectG != null) {
                        Object obj = jsonObjectG.get("city");
                        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                        String strA2 = a(this, (jsonPrimitive == null || (jsonPrimitive instanceof JsonNull)) ? null : jsonPrimitive.getC());
                        Object obj2 = jsonObjectG.get("agency");
                        JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
                        if (jsonPrimitive2 == null) {
                            lowerCase = null;
                        } else {
                            String c = jsonPrimitive2 instanceof JsonNull ? null : jsonPrimitive2.getC();
                            if (c != null) {
                                lowerCase = c.toLowerCase(Locale.ROOT);
                                Intrinsics.h(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = null;
                            }
                        }
                        String strA3 = a(this, lowerCase);
                        Object obj3 = jsonObjectG.get("documentid");
                        JsonPrimitive jsonPrimitive3 = obj3 instanceof JsonPrimitive ? (JsonPrimitive) obj3 : null;
                        if (jsonPrimitive3 != null) {
                            String c2 = jsonPrimitive3 instanceof JsonNull ? null : jsonPrimitive3.getC();
                            if (c2 != null) {
                                strA = a(this, c2);
                            }
                        }
                        JsonObject jsonObjectG2 = JsonElementExtensionsKt.g(jsonObjectG, "info");
                        productConfigDocumentPropsApiResponseModel = new ProductConfigDocumentPropsApiResponseModel(strA2, strA3, strA, new ProductConfigDocumentPropInfoApiResponseModel(a(this, JsonElementExtensionsKt.s(jsonObjectG2, "name", "")), a(this, JsonElementExtensionsKt.s(jsonObjectG2, "formUrl", "")), a(this, JsonElementExtensionsKt.s(jsonObjectG2, "longDesc", "")), a(this, JsonElementExtensionsKt.s(jsonObjectG2, "shortDesc", "")), a(this, JsonElementExtensionsKt.s(jsonObjectG2, "tutorialUrl", "")), a(this, JsonElementExtensionsKt.s(jsonObjectG2, "placeHolderUrl", "")), Boolean.valueOf(JsonElementExtensionsKt.m(jsonObjectG2, "hasExpiry", false))));
                    }
                    if (productConfigDocumentPropsApiResponseModel != null) {
                        arrayList.add(productConfigDocumentPropsApiResponseModel);
                    }
                }
                return arrayList;
            } catch (Exception unused2) {
                return EmptyList.f17557a;
            }
        } catch (Exception e) {
            this.b.i(e);
            return EmptyList.f17557a;
        }
    }

    public final UserProfile l(String userProfileJson, String agencyName) {
        CrashlyticsLogger crashlyticsLogger = this.b;
        Intrinsics.i(userProfileJson, "userProfileJson");
        Intrinsics.i(agencyName, "agencyName");
        try {
            JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(userProfileJson));
            String strJ = JsonElementExtensionsKt.j(jsonObjectG, "firstName");
            String strJ2 = JsonElementExtensionsKt.j(jsonObjectG, "lastName");
            Gender genderB = Gender.Companion.b(Gender.INSTANCE, JsonElementExtensionsKt.j(jsonObjectG, HintConstants.AUTOFILL_HINT_GENDER));
            String strJ3 = JsonElementExtensionsKt.j(jsonObjectG, "dob");
            HashMap map = new HashMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (JsonElementExtensionsKt.l("proofs", jsonObjectG)) {
                linkedHashMap = h(JsonElementExtensionsKt.j(jsonObjectG, "proofs"));
            }
            UserAgencyInfo.STATUS statusValueOf = UserAgencyInfo.STATUS.valueOf("SUCCESS");
            String str = (String) linkedHashMap.get("PHOTOGRAPH");
            map.put(agencyName, new UserAgencyInfo(statusValueOf, linkedHashMap, agencyName));
            return new UserProfile(strJ, strJ2, genderB, strJ3, str, map);
        } catch (JsonException e) {
            crashlyticsLogger.i(e);
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            crashlyticsLogger.i(e2);
            return null;
        }
    }
}
