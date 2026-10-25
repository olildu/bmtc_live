package app.chalo.multimodalticket.domain;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.instantticket.data.model.api.response.InstantMobileTicketResponseApiModelKt;
import app.chalo.instantticket.data.model.api.response.InstantTicketPassengerDetailsApiModel;
import app.chalo.instantticket.data.model.api.response.InstantTicketResponseApiModel;
import app.chalo.instantticket.data.model.api.response.InstantTicketRouteDetailsApiModel;
import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.instantticket.data.model.app.InstantTicketPassengerDetailsAppModel;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketPassengerDetails;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketSequenceInfo;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.multimodalticket.data.model.MultiModalGroupTransportType;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegFareDetailApiModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegFareDetailAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModelKt;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModelKt$toAppModelOrNull$$inlined$sortedBy$1;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModelKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketSequenceInfoApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketStopDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import app.chalo.utils.BaseMobileTicketConverters;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/multimodalticket/domain/GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseMobileTicketConverters f5886a;
    public final CrashlyticsLogger b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/multimodalticket/domain/GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase$Companion;", "", "", "SEQUENCE_KEY", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5887a;

        static {
            int[] iArr = new int[MultiModalGroupTicketStatus.values().length];
            try {
                iArr[MultiModalGroupTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.PAYMENT_PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MultiModalGroupTicketStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5887a = iArr;
        }
    }

    public GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase(BaseMobileTicketConverters baseMobileTicketConverters, CrashlyticsLogger crashlyticsLogger) {
        this.f5886a = baseMobileTicketConverters;
        this.b = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:158:0x026f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0415  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:338:0x0585  */
    /* JADX WARN: Code duplicated, block: B:378:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:84:0x0179  */
    public final MultiModalGroupTicketAppModel a(GenericMobileTicketProductApiResponseModel response) {
        MultiModalGroupTicketStatus next;
        List list;
        int i;
        List listV0;
        String str;
        String str2;
        Long l;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel;
        List list2;
        List listV1;
        String str3;
        Integer num;
        String str4;
        String str5;
        Object obj;
        ArrayList arrayList;
        int i2;
        Object ondcMetroTicketChild;
        Integer numQ0;
        JsonPrimitive jsonPrimitiveA;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitiveA2;
        OndcMetroTicketAppModel ondcMetroTicketAppModelB;
        RouteStopsInfo routeStopsInfo;
        String str6;
        String str7;
        Long l2;
        ArrayList arrayList2;
        InstantTicketAppModel instantTicketAppModel;
        String str8;
        Integer num2;
        InstantTicketPassengerDetailsAppModel instantTicketPassengerDetailsAppModel;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        MultiModalGroupTicketAppModel multiModalGroupTicketAppModel;
        Object multiModalGroupTicketSequenceInfo;
        Integer numQ1;
        MultiModalGroupTransportType next2;
        Intrinsics.i(response, "response");
        if (Intrinsics.d(response.c, "mobileTicket") && Intrinsics.d(response.d, "multiModalTicket")) {
            MultiModalGroupTicketStatus.Companion companion = MultiModalGroupTicketStatus.INSTANCE;
            String str14 = response.g;
            String str15 = response.q;
            JsonArray jsonArray = response.L;
            String str16 = response.f8124a;
            if (str14 == null) {
                str14 = "";
            }
            companion.getClass();
            Iterator<MultiModalGroupTicketStatus> it = MultiModalGroupTicketStatus.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(next.name(), str14, true));
            MultiModalGroupTicketStatus multiModalGroupTicketStatus = next;
            if (multiModalGroupTicketStatus != null && (list = response.M) != null) {
                List<GenericMobileTicketSequenceInfoApiResponseModel> list3 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list3, 10));
                for (GenericMobileTicketSequenceInfoApiResponseModel genericMobileTicketSequenceInfoApiResponseModel : list3) {
                    String str17 = genericMobileTicketSequenceInfoApiResponseModel.f8128a;
                    if (str17 == null || (numQ1 = StringsKt.q0(str17)) == null) {
                        multiModalGroupTicketAppModel = null;
                        multiModalGroupTicketSequenceInfo = multiModalGroupTicketAppModel;
                    } else {
                        int iIntValue = numQ1.intValue();
                        String str18 = genericMobileTicketSequenceInfoApiResponseModel.b;
                        if (str18 != null) {
                            MultiModalGroupTransportType.INSTANCE.getClass();
                            Iterator<MultiModalGroupTransportType> it2 = MultiModalGroupTransportType.getEntries().iterator();
                            do {
                                if (!it2.hasNext()) {
                                    multiModalGroupTicketAppModel = null;
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                multiModalGroupTicketAppModel = null;
                            } while (!StringsKt.x(next2.name(), str18, true));
                            MultiModalGroupTransportType multiModalGroupTransportType = next2;
                            if (multiModalGroupTransportType != null) {
                                multiModalGroupTicketSequenceInfo = new MultiModalGroupTicketSequenceInfo(iIntValue, multiModalGroupTransportType);
                            }
                        } else {
                            multiModalGroupTicketAppModel = null;
                        }
                        multiModalGroupTicketSequenceInfo = multiModalGroupTicketAppModel;
                    }
                    if (multiModalGroupTicketSequenceInfo == null) {
                        return multiModalGroupTicketAppModel;
                    }
                    arrayList3.add(multiModalGroupTicketSequenceInfo);
                }
                List listV2 = CollectionsKt.v0(new GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase$toMultiModalGroupTicketAppModelOrNull$$inlined$sortedBy$1(), arrayList3);
                if (listV2 == null) {
                    return null;
                }
                if (jsonArray != null) {
                    List list4 = jsonArray.f18186a;
                    if (list4.isEmpty()) {
                        i = WhenMappings.f5887a[multiModalGroupTicketStatus.ordinal()];
                        if (i != 1) {
                            return null;
                        }
                        if (i == 2 && i != 3 && i != 4 && i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listV0 = EmptyList.f17557a;
                    } else {
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(jsonArray, 10));
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
                                int size = arrayList4.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        HashSet hashSet = new HashSet();
                                        ArrayList arrayList6 = new ArrayList();
                                        int size2 = arrayList5.size();
                                        int i4 = 0;
                                        while (i4 < size2) {
                                            Object obj2 = arrayList5.get(i4);
                                            i4++;
                                            if (hashSet.add(Integer.valueOf(((MultiModalGroupTicketChildAppModel) obj2).getF5877a()))) {
                                                arrayList6.add(obj2);
                                            }
                                        }
                                        if (arrayList6.size() != arrayList5.size()) {
                                            arrayList5 = null;
                                        }
                                        if (arrayList5 != null) {
                                            HashSet hashSet2 = new HashSet();
                                            ArrayList arrayList7 = new ArrayList();
                                            int size3 = arrayList5.size();
                                            int i5 = 0;
                                            while (i5 < size3) {
                                                Object obj3 = arrayList5.get(i5);
                                                i5++;
                                                MultiModalGroupTicketChildAppModel multiModalGroupTicketChildAppModel = (MultiModalGroupTicketChildAppModel) obj3;
                                                String strB = MultiModalGroupTicketChildAppModelKt.b(multiModalGroupTicketChildAppModel);
                                                if (multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.InstantTicketChild) {
                                                    obj = "instantTicket";
                                                } else {
                                                    if (!(multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.OndcMetroTicketChild)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    obj = "ondcMetroTicket";
                                                }
                                                if (hashSet2.add(new Pair(strB, obj))) {
                                                    arrayList7.add(obj3);
                                                }
                                            }
                                            if (arrayList7.size() != arrayList5.size()) {
                                                arrayList5 = null;
                                            }
                                            if (arrayList5 != null && (listV0 = CollectionsKt.v0(new GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase$resolveChildrenFromJourneyLegs$$inlined$sortedBy$1(), arrayList5)) != null) {
                                                List listV3 = CollectionsKt.v0(new GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase$validateLegsWithSequenceInfo$$inlined$sortedBy$1(), listV0);
                                                ArrayList arrayList8 = new ArrayList(CollectionsKt.v(listV3, 10));
                                                Iterator it4 = listV3.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList8.add(Integer.valueOf(((MultiModalGroupTicketChildAppModel) it4.next()).getF5877a()));
                                                }
                                                List listV4 = CollectionsKt.v0(new GetMultiModalGroupTicketAppModelFromGenericMobileTicketResponseUseCase$validateLegsWithSequenceInfo$$inlined$sortedBy$2(), listV2);
                                                ArrayList arrayList9 = new ArrayList(CollectionsKt.v(listV4, 10));
                                                Iterator it5 = listV4.iterator();
                                                while (it5.hasNext()) {
                                                    arrayList9.add(Integer.valueOf(((MultiModalGroupTicketSequenceInfo) it5.next()).f5796a));
                                                }
                                                if (!arrayList8.equals(arrayList9)) {
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    } else {
                                        Object obj4 = arrayList4.get(i3);
                                        i3++;
                                        JsonObject jsonObject = (JsonObject) obj4;
                                        JsonElement jsonElement2 = (JsonElement) jsonObject.get("sequence");
                                        if (jsonElement2 != null) {
                                            ChaloJson chaloJson = ChaloJson.f6455a;
                                            JsonPrimitive jsonPrimitiveA3 = ChaloJson.a(jsonElement2);
                                            if (jsonPrimitiveA3 != null) {
                                                InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f18192a;
                                                String c = jsonPrimitiveA3 instanceof JsonNull ? null : jsonPrimitiveA3.getC();
                                                if (c == null || (numQ0 = StringsKt.q0(c)) == null) {
                                                    arrayList = arrayList4;
                                                    i2 = size;
                                                    ondcMetroTicketChild = null;
                                                } else {
                                                    int iIntValue2 = numQ0.intValue();
                                                    JsonElement jsonElement3 = (JsonElement) jsonObject.get("productType");
                                                    if (jsonElement3 == null || (jsonPrimitiveA = ChaloJson.a(jsonElement3)) == null) {
                                                        arrayList = arrayList4;
                                                        i2 = size;
                                                        ondcMetroTicketChild = null;
                                                    } else {
                                                        String c2 = jsonPrimitiveA instanceof JsonNull ? null : jsonPrimitiveA.getC();
                                                        if (c2 == null || (jsonElement = (JsonElement) jsonObject.get("productSubType")) == null || (jsonPrimitiveA2 = ChaloJson.a(jsonElement)) == null) {
                                                            arrayList = arrayList4;
                                                        } else {
                                                            arrayList = arrayList4;
                                                            String c3 = jsonPrimitiveA2 instanceof JsonNull ? null : jsonPrimitiveA2.getC();
                                                            if (c3 != null) {
                                                                boolean zEquals = c2.equals("mobileTicket");
                                                                i2 = size;
                                                                BaseMobileTicketConverters baseMobileTicketConverters = this.f5886a;
                                                                if (zEquals && c3.equals("instantTicket")) {
                                                                    InstantTicketResponseApiModel instantTicketResponseApiModelA = baseMobileTicketConverters.a(jsonObject);
                                                                    if (instantTicketResponseApiModelA != null) {
                                                                        if (!InstantMobileTicketResponseApiModelKt.a(instantTicketResponseApiModelA)) {
                                                                            instantTicketResponseApiModelA = null;
                                                                        }
                                                                        if (instantTicketResponseApiModelA != null) {
                                                                            if (InstantMobileTicketResponseApiModelKt.a(instantTicketResponseApiModelA)) {
                                                                                InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel = instantTicketResponseApiModelA.l;
                                                                                if (instantTicketRouteDetailsApiModel != null) {
                                                                                    String str19 = instantTicketRouteDetailsApiModel.f3871a;
                                                                                    routeStopsInfo = (str19 == null || (str9 = instantTicketRouteDetailsApiModel.b) == null || (str10 = instantTicketRouteDetailsApiModel.c) == null || (str11 = instantTicketRouteDetailsApiModel.d) == null || (str12 = instantTicketRouteDetailsApiModel.e) == null || (str13 = instantTicketRouteDetailsApiModel.f) == null) ? null : new RouteStopsInfo(str19, str9, str10, str11, str12, str13, null, null);
                                                                                } else {
                                                                                    routeStopsInfo = null;
                                                                                }
                                                                                String str20 = instantTicketResponseApiModelA.f3869a;
                                                                                if (str20 == null || (str6 = instantTicketResponseApiModelA.b) == null || (str7 = instantTicketResponseApiModelA.c) == null || (l2 = instantTicketResponseApiModelA.d) == null) {
                                                                                    instantTicketAppModel = null;
                                                                                } else {
                                                                                    long jLongValue = l2.longValue();
                                                                                    Long l3 = instantTicketResponseApiModelA.e;
                                                                                    if (l3 != null) {
                                                                                        long jLongValue2 = l3.longValue();
                                                                                        InstantTicketStatus.Companion companion2 = InstantTicketStatus.INSTANCE;
                                                                                        String str21 = instantTicketResponseApiModelA.f;
                                                                                        if (str21 == null) {
                                                                                            instantTicketAppModel = null;
                                                                                        } else {
                                                                                            companion2.getClass();
                                                                                            InstantTicketStatus instantTicketStatusA = InstantTicketStatus.Companion.a(str21);
                                                                                            Long l4 = instantTicketResponseApiModelA.g;
                                                                                            String str22 = instantTicketResponseApiModelA.h;
                                                                                            if (str22 == null) {
                                                                                                instantTicketAppModel = null;
                                                                                            } else {
                                                                                                String str23 = instantTicketResponseApiModelA.i;
                                                                                                String str24 = instantTicketResponseApiModelA.j;
                                                                                                Long l5 = instantTicketResponseApiModelA.n;
                                                                                                List list5 = instantTicketResponseApiModelA.m;
                                                                                                if (list5 != null) {
                                                                                                    List<InstantTicketPassengerDetailsApiModel> list6 = list5;
                                                                                                    ArrayList arrayList10 = new ArrayList();
                                                                                                    for (InstantTicketPassengerDetailsApiModel instantTicketPassengerDetailsApiModel : list6) {
                                                                                                        String str25 = str6;
                                                                                                        String str26 = str7;
                                                                                                        String str27 = instantTicketPassengerDetailsApiModel.f3867a;
                                                                                                        if (str27 == null || (str8 = instantTicketPassengerDetailsApiModel.b) == null || (num2 = instantTicketPassengerDetailsApiModel.c) == null) {
                                                                                                            instantTicketPassengerDetailsAppModel = null;
                                                                                                        } else {
                                                                                                            int iIntValue3 = num2.intValue();
                                                                                                            Long l6 = instantTicketPassengerDetailsApiModel.d;
                                                                                                            if (l6 != null) {
                                                                                                                long jLongValue3 = l6.longValue();
                                                                                                                Long l7 = instantTicketPassengerDetailsApiModel.e;
                                                                                                                if (l7 != null) {
                                                                                                                    instantTicketPassengerDetailsAppModel = new InstantTicketPassengerDetailsAppModel(str27, str8, iIntValue3, jLongValue3, l7.longValue(), instantTicketPassengerDetailsApiModel.f, instantTicketPassengerDetailsApiModel.g);
                                                                                                                } else {
                                                                                                                    instantTicketPassengerDetailsAppModel = null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                instantTicketPassengerDetailsAppModel = null;
                                                                                                            }
                                                                                                        }
                                                                                                        if (instantTicketPassengerDetailsAppModel != null) {
                                                                                                            arrayList10.add(instantTicketPassengerDetailsAppModel);
                                                                                                        }
                                                                                                        str6 = str25;
                                                                                                        str7 = str26;
                                                                                                    }
                                                                                                    arrayList2 = arrayList10;
                                                                                                } else {
                                                                                                    arrayList2 = null;
                                                                                                }
                                                                                                String str28 = str6;
                                                                                                String str29 = str7;
                                                                                                RefundInfoApiModel refundInfoApiModel = instantTicketResponseApiModelA.o;
                                                                                                instantTicketAppModel = new InstantTicketAppModel(str20, str28, str29, jLongValue, jLongValue2, instantTicketStatusA, l4, str22, str23, str24, l5, routeStopsInfo, arrayList2, refundInfoApiModel != null ? GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel) : null);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        instantTicketAppModel = null;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                instantTicketAppModel = null;
                                                                            }
                                                                            if (instantTicketAppModel != null) {
                                                                                ondcMetroTicketChild = new MultiModalGroupTicketChildAppModel.InstantTicketChild(iIntValue2, instantTicketAppModel);
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (c2.equals("mobileTicket") && c3.equals("ondcMetroTicket") && (ondcMetroTicketAppModelB = baseMobileTicketConverters.b(jsonObject)) != null) {
                                                                    ondcMetroTicketChild = new MultiModalGroupTicketChildAppModel.OndcMetroTicketChild(iIntValue2, ondcMetroTicketAppModelB);
                                                                }
                                                            }
                                                            ondcMetroTicketChild = null;
                                                        }
                                                        i2 = size;
                                                        ondcMetroTicketChild = null;
                                                    }
                                                }
                                            } else {
                                                arrayList = arrayList4;
                                                i2 = size;
                                                ondcMetroTicketChild = null;
                                            }
                                        } else {
                                            arrayList = arrayList4;
                                            i2 = size;
                                            ondcMetroTicketChild = null;
                                        }
                                        if (ondcMetroTicketChild != null) {
                                            arrayList5.add(ondcMetroTicketChild);
                                            arrayList4 = arrayList;
                                            size = i2;
                                        }
                                    }
                                }
                            } else {
                                JsonElement jsonElement4 = (JsonElement) it3.next();
                                JsonObject jsonObject2 = jsonElement4 instanceof JsonObject ? (JsonObject) jsonElement4 : null;
                                if (jsonObject2 != null) {
                                    arrayList4.add(jsonObject2);
                                }
                            }
                            listV0 = null;
                            break;
                        }
                        if (listV0 == null) {
                            vo1.x("group legs parsing failed: ", str16, "message");
                            return null;
                        }
                    }
                } else {
                    i = WhenMappings.f5887a[multiModalGroupTicketStatus.ordinal()];
                    if (i != 1) {
                        return null;
                    }
                    if (i == 2) {
                    }
                    listV0 = EmptyList.f17557a;
                }
                List list7 = listV0;
                if (!list7.isEmpty() && list7.size() < 2) {
                    String msg = "groupId: " + str16 + " - userId: " + str15;
                    Intrinsics.i(msg, "msg");
                    this.b.i(new InvalidGroupTicketReceivedException(msg));
                }
                if (str16 == null || (str = response.b) == null) {
                    return null;
                }
                String str30 = response.c;
                String str31 = response.d;
                Long l8 = response.e;
                if (l8 == null) {
                    return null;
                }
                long jLongValue4 = l8.longValue();
                Long l9 = response.f;
                if (l9 == null) {
                    return null;
                }
                long jLongValue5 = l9.longValue();
                if (str15 == null || (str2 = response.h) == null) {
                    return null;
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                String str32 = response.k;
                if (str32 == null || (l = response.t) == null) {
                    return null;
                }
                long jLongValue6 = l.longValue();
                GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2 = response.n;
                if (genericMobileTicketStopDetailsApiResponseModel2 == null) {
                    return null;
                }
                String str33 = genericMobileTicketStopDetailsApiResponseModel2.f8130a;
                MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails = (str33 == null || (str5 = genericMobileTicketStopDetailsApiResponseModel2.b) == null) ? null : new MultiModalGroupTicketStopDetails(str33, str5);
                if (multiModalGroupTicketStopDetails == null || (genericMobileTicketStopDetailsApiResponseModel = response.o) == null) {
                    return null;
                }
                String str34 = genericMobileTicketStopDetailsApiResponseModel.f8130a;
                MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails2 = (str34 == null || (str4 = genericMobileTicketStopDetailsApiResponseModel.b) == null) ? null : new MultiModalGroupTicketStopDetails(str34, str4);
                if (multiModalGroupTicketStopDetails2 == null || (list2 = response.v) == null) {
                    return null;
                }
                List list8 = list2;
                ArrayList arrayList11 = new ArrayList(CollectionsKt.v(list8, 10));
                Iterator it6 = list8.iterator();
                while (it6.hasNext()) {
                    GenericMobileTicketPassengerDetailsApiResponseModel genericMobileTicketPassengerDetailsApiResponseModel = (GenericMobileTicketPassengerDetailsApiResponseModel) it6.next();
                    Iterator it7 = it6;
                    long j = jLongValue6;
                    String str35 = genericMobileTicketPassengerDetailsApiResponseModel.f8122a;
                    MultiModalGroupTicketPassengerDetails multiModalGroupTicketPassengerDetails = (str35 == null || (str3 = genericMobileTicketPassengerDetailsApiResponseModel.b) == null || (num = genericMobileTicketPassengerDetailsApiResponseModel.c) == null) ? null : new MultiModalGroupTicketPassengerDetails(str35, str3, num.intValue());
                    if (multiModalGroupTicketPassengerDetails == null) {
                        return null;
                    }
                    arrayList11.add(multiModalGroupTicketPassengerDetails);
                    it6 = it7;
                    jLongValue6 = j;
                }
                long j2 = jLongValue6;
                RefundInfoApiModel refundInfoApiModel2 = response.F;
                RefundInfoAppModel refundInfoAppModelB = refundInfoApiModel2 != null ? GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel2) : null;
                List list9 = response.N;
                if (list9 != null) {
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it8 = list9.iterator();
                    while (it8.hasNext()) {
                        GroupTicketLegFareDetailAppModel groupTicketLegFareDetailAppModelA = GroupTicketSummaryResponseAppModelKt.a((GroupTicketLegFareDetailApiModel) it8.next());
                        if (groupTicketLegFareDetailAppModelA != null) {
                            arrayList12.add(groupTicketLegFareDetailAppModelA);
                        }
                    }
                    if (arrayList12.size() != list9.size()) {
                        arrayList12 = null;
                    }
                    listV1 = arrayList12 != null ? CollectionsKt.v0(new GroupTicketSummaryResponseAppModelKt$toAppModelOrNull$$inlined$sortedBy$1(), arrayList12) : null;
                    if (listV1 == null) {
                        listV1 = EmptyList.f17557a;
                    }
                } else {
                    listV1 = EmptyList.f17557a;
                }
                return new MultiModalGroupTicketAppModel(str16, str, str30, str31, jLongValue4, jLongValue5, multiModalGroupTicketStatus, str15, lowerCase, str32, j2, multiModalGroupTicketStopDetails, multiModalGroupTicketStopDetails2, arrayList11, refundInfoAppModelB, listV2, listV1, list7);
            }
        }
        return null;
    }
}
