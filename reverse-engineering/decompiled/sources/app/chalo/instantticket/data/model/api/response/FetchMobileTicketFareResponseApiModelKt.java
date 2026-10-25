package app.chalo.instantticket.data.model.api.response;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.CurrencyRoundOffLogicKt;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import app.chalo.instantticket.data.model.app.response.FetchMobileTicketFareResponseAppModel;
import app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.data.model.app.response.SeatLimitAppModel;
import app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FetchMobileTicketFareResponseApiModelKt {
    public static final FareBreakupOperationType a(int i) {
        FareBreakupOperationType fareBreakupOperationType = FareBreakupOperationType.ADDITION;
        if (i == fareBreakupOperationType.getCode()) {
            return fareBreakupOperationType;
        }
        FareBreakupOperationType fareBreakupOperationType2 = FareBreakupOperationType.SUBTRACTION;
        return i == fareBreakupOperationType2.getCode() ? fareBreakupOperationType2 : FareBreakupOperationType.NO_OP;
    }

    public static final boolean b(FetchMobileTicketFareResponseApiModel fetchMobileTicketFareResponseApiModel) {
        boolean z;
        List list;
        boolean z2;
        Intrinsics.i(fetchMobileTicketFareResponseApiModel, "<this>");
        List list2 = fetchMobileTicketFareResponseApiModel.f3863a;
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            List<PassengerDetailApiModel> list4 = list2;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (PassengerDetailApiModel passengerDetailApiModel : list4) {
                    Intrinsics.i(passengerDetailApiModel, "<this>");
                    if (passengerDetailApiModel.f3873a == null || passengerDetailApiModel.d == null || passengerDetailApiModel.g == null || passengerDetailApiModel.h != null || (list = passengerDetailApiModel.c) == null) {
                        z = true;
                    } else {
                        List list5 = list;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator it = list5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                FareBreakupApiModel fareBreakupApiModel = (FareBreakupApiModel) it.next();
                                Intrinsics.i(fareBreakupApiModel, "<this>");
                                if (fareBreakupApiModel.f3861a == null) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                        z = !z2;
                    }
                    if (!z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final FareBreakupAppModel c(FareBreakupApiModel fareBreakupApiModel) {
        Intrinsics.i(fareBreakupApiModel, "<this>");
        return new FareBreakupAppModel(fareBreakupApiModel.f3861a, a(fareBreakupApiModel.b), fareBreakupApiModel.c);
    }

    public static final FetchMobileTicketFareResponseAppModel d(FetchMobileTicketFareResponseApiModel fetchMobileTicketFareResponseApiModel) {
        ArrayList arrayList;
        PassengerSelectionPolicy next;
        PassengerSelectionPolicy.Companion companion = PassengerSelectionPolicy.INSTANCE;
        String str = fetchMobileTicketFareResponseApiModel.e;
        companion.getClass();
        Iterator<PassengerSelectionPolicy> it = PassengerSelectionPolicy.getEntries().iterator();
        do {
            arrayList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.x(next.name(), str, true));
        PassengerSelectionPolicy passengerSelectionPolicy = next;
        if (passengerSelectionPolicy == null) {
            passengerSelectionPolicy = PassengerSelectionPolicy.Multiple;
        }
        PassengerSelectionPolicy passengerSelectionPolicy2 = passengerSelectionPolicy;
        List list = fetchMobileTicketFareResponseApiModel.f3863a;
        List listE = list != null ? e(list) : EmptyList.f17557a;
        Integer num = fetchMobileTicketFareResponseApiModel.b;
        CurrencyRoundOffLogic currencyRoundOffLogicA = CurrencyRoundOffLogicKt.a(num != null ? num.intValue() : 0);
        Integer num2 = fetchMobileTicketFareResponseApiModel.c;
        int iIntValue = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
        String str2 = fetchMobileTicketFareResponseApiModel.d;
        String strR = str2 != null ? StringsKt.R(str2, "\\n", IOUtils.LINE_SEPARATOR_UNIX) : null;
        List list2 = fetchMobileTicketFareResponseApiModel.f;
        if (list2 != null) {
            arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ApplicableRuleAppModel applicableRuleAppModelB = PBRemoteToAppModelMappersKt.b((ApplicableRuleApiResponseModel) it2.next());
                if (applicableRuleAppModelB != null) {
                    arrayList.add(applicableRuleAppModelB);
                }
            }
        }
        return new FetchMobileTicketFareResponseAppModel(iIntValue, currencyRoundOffLogicA, listE, strR, passengerSelectionPolicy2, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    public static final ArrayList e(List list) {
        ?? arrayList;
        SeatLimitAppModel seatLimitAppModel;
        Intrinsics.i(list, "<this>");
        boolean z = list.size() > 1;
        List<PassengerDetailApiModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
        for (PassengerDetailApiModel passengerDetailApiModel : list2) {
            Long l = passengerDetailApiModel.f3873a;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str = passengerDetailApiModel.b;
            List list3 = passengerDetailApiModel.c;
            if (list3 != null) {
                List list4 = list3;
                arrayList = new ArrayList(CollectionsKt.v(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(c((FareBreakupApiModel) it.next()));
                }
            } else {
                arrayList = EmptyList.f17557a;
            }
            ?? r16 = arrayList;
            String str2 = passengerDetailApiModel.d;
            String str3 = str2 == null ? "" : str2;
            Boolean bool = passengerDetailApiModel.e;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Integer num = passengerDetailApiModel.f;
            String str4 = passengerDetailApiModel.g;
            String str5 = str4 == null ? "" : str4;
            Long l2 = passengerDetailApiModel.h;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Integer num2 = passengerDetailApiModel.i;
            SeatLimitApiModel seatLimitApiModel = passengerDetailApiModel.j;
            if (seatLimitApiModel != null) {
                Integer num3 = seatLimitApiModel.f3875a;
                int iIntValue = num3 != null ? num3.intValue() : z ? 0 : 1;
                Integer num4 = seatLimitApiModel.b;
                seatLimitAppModel = new SeatLimitAppModel(iIntValue, num4 != null ? num4.intValue() : Integer.MAX_VALUE);
            } else {
                seatLimitAppModel = z ? new SeatLimitAppModel(0, num2 != null ? num2.intValue() : Integer.MAX_VALUE) : new SeatLimitAppModel(1, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
            }
            arrayList2.add(new PassengerDetailAppModel(jLongValue, str, r16, str3, zBooleanValue, num, str5, jLongValue2, seatLimitAppModel));
        }
        return arrayList2;
    }
}
