package app.chalo.core;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.SqlPreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2025a;
    public final /* synthetic */ Query b;

    public /* synthetic */ a(Query query, int i) {
        this.f2025a = i;
        this.b = query;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2025a) {
            case 0:
                Instant_ticket_receipt_tableQueries.GetInstantTicketReceiptFlowQuery getInstantTicketReceiptFlowQuery = (Instant_ticket_receipt_tableQueries.GetInstantTicketReceiptFlowQuery) this.b;
                SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery, "$this$executeQuery");
                executeQuery.bindString(0, getInstantTicketReceiptFlowQuery.b);
                break;
            case 1:
                Instant_ticket_tableQueries.GetActiveOrPaymentProcessingInstantTicketsAsFlowQuery getActiveOrPaymentProcessingInstantTicketsAsFlowQuery = (Instant_ticket_tableQueries.GetActiveOrPaymentProcessingInstantTicketsAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery2 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery2, "$this$executeQuery");
                Collection collection = getActiveOrPaymentProcessingInstantTicketsAsFlowQuery.b;
                int i = 0;
                for (Object obj2 : collection) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery2.bindString(i, (String) obj2);
                    i = i2;
                }
                executeQuery2.bindString(collection.size(), getActiveOrPaymentProcessingInstantTicketsAsFlowQuery.c);
                break;
            case 2:
                Instant_ticket_tableQueries.GetAllInstantTicketsAsFlowQuery getAllInstantTicketsAsFlowQuery = (Instant_ticket_tableQueries.GetAllInstantTicketsAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery3 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery3, "$this$executeQuery");
                Collection collection2 = getAllInstantTicketsAsFlowQuery.b;
                int i3 = 0;
                for (Object obj3 : collection2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery3.bindString(i3, (String) obj3);
                    i3 = i4;
                }
                executeQuery3.bindString(collection2.size(), getAllInstantTicketsAsFlowQuery.c);
                break;
            case 3:
                Instant_ticket_tableQueries.GetAllInstantTicketsQuery getAllInstantTicketsQuery = (Instant_ticket_tableQueries.GetAllInstantTicketsQuery) this.b;
                SqlPreparedStatement executeQuery4 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery4, "$this$executeQuery");
                Collection collection3 = getAllInstantTicketsQuery.b;
                int i5 = 0;
                for (Object obj4 : collection3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery4.bindString(i5, (String) obj4);
                    i5 = i6;
                }
                executeQuery4.bindString(collection3.size(), getAllInstantTicketsQuery.c);
                break;
            case 4:
                Instant_ticket_tableQueries.GetInstantTicketAsFlowQuery getInstantTicketAsFlowQuery = (Instant_ticket_tableQueries.GetInstantTicketAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery5 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery5, "$this$executeQuery");
                executeQuery5.bindString(0, getInstantTicketAsFlowQuery.b);
                executeQuery5.bindString(1, getInstantTicketAsFlowQuery.c);
                break;
            case 5:
                Instant_ticket_tableQueries.GetInstantTicketQuery getInstantTicketQuery = (Instant_ticket_tableQueries.GetInstantTicketQuery) this.b;
                SqlPreparedStatement executeQuery6 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery6, "$this$executeQuery");
                executeQuery6.bindString(0, getInstantTicketQuery.b);
                executeQuery6.bindString(1, getInstantTicketQuery.c);
                break;
            case 6:
                Last_ride_info_tableQueries.GetLastRideInfoQuery getLastRideInfoQuery = (Last_ride_info_tableQueries.GetLastRideInfoQuery) this.b;
                SqlPreparedStatement executeQuery7 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery7, "$this$executeQuery");
                executeQuery7.bindString(0, getLastRideInfoQuery.b);
                break;
            case 7:
                Magic_super_pass_tableQueries.DoesMagicSuperPassExistQuery doesMagicSuperPassExistQuery = (Magic_super_pass_tableQueries.DoesMagicSuperPassExistQuery) this.b;
                SqlPreparedStatement executeQuery8 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery8, "$this$executeQuery");
                executeQuery8.bindString(0, doesMagicSuperPassExistQuery.b);
                break;
            case 8:
                Magic_super_pass_tableQueries.FindMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery = (Magic_super_pass_tableQueries.FindMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery) this.b;
                SqlPreparedStatement executeQuery9 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery9, "$this$executeQuery");
                int i7 = 0;
                executeQuery9.bindString(0, findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.b);
                executeQuery9.bindString(1, findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.c);
                executeQuery9.bindString(2, findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.d);
                executeQuery9.bindString(3, findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.e);
                executeQuery9.d(4, Long.valueOf(findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.f));
                for (Object obj5 : findMagicSuperPassInBookingHistoryFromSelectedConfigurationForCityListQuery.g) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery9.bindString(i7 + 5, (String) obj5);
                    i7 = i8;
                }
                return Unit.f17538a;
            case 9:
                Magic_super_pass_tableQueries.GetAllMagicSuperPassesAsFlowQuery getAllMagicSuperPassesAsFlowQuery = (Magic_super_pass_tableQueries.GetAllMagicSuperPassesAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery10 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery10, "$this$executeQuery");
                int i9 = 0;
                for (Object obj6 : getAllMagicSuperPassesAsFlowQuery.b) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery10.bindString(i9, (String) obj6);
                    i9 = i10;
                }
                return Unit.f17538a;
            case 10:
                Magic_super_pass_tableQueries.GetAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery getAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery = (Magic_super_pass_tableQueries.GetAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery) this.b;
                SqlPreparedStatement executeQuery11 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery11, "$this$executeQuery");
                int i11 = 0;
                for (Object obj7 : getAllMagicSuperPassesBookedWithDistinctUserNamesForCityListQuery.b) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery11.bindString(i11, (String) obj7);
                    i11 = i12;
                }
                return Unit.f17538a;
            case 11:
                Magic_super_pass_tableQueries.GetAllMagicSuperPassesBookedWithUserNameForCityListQuery getAllMagicSuperPassesBookedWithUserNameForCityListQuery = (Magic_super_pass_tableQueries.GetAllMagicSuperPassesBookedWithUserNameForCityListQuery) this.b;
                SqlPreparedStatement executeQuery12 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery12, "$this$executeQuery");
                int i13 = 0;
                executeQuery12.bindString(0, getAllMagicSuperPassesBookedWithUserNameForCityListQuery.b);
                for (Object obj8 : getAllMagicSuperPassesBookedWithUserNameForCityListQuery.c) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery12.bindString(i14, (String) obj8);
                    i13 = i14;
                }
                return Unit.f17538a;
            case 12:
                Magic_super_pass_tableQueries.GetAllMagicSuperPassesQuery getAllMagicSuperPassesQuery = (Magic_super_pass_tableQueries.GetAllMagicSuperPassesQuery) this.b;
                SqlPreparedStatement executeQuery13 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery13, "$this$executeQuery");
                executeQuery13.bindString(0, getAllMagicSuperPassesQuery.b);
                break;
            case 13:
                Magic_super_pass_tableQueries.GetMagicSuperPassCountQuery getMagicSuperPassCountQuery = (Magic_super_pass_tableQueries.GetMagicSuperPassCountQuery) this.b;
                SqlPreparedStatement executeQuery14 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery14, "$this$executeQuery");
                executeQuery14.bindString(0, getMagicSuperPassCountQuery.b);
                break;
            case 14:
                Magic_super_pass_tableQueries.GetMagicSuperPassLastActivationTimeStampQuery getMagicSuperPassLastActivationTimeStampQuery = (Magic_super_pass_tableQueries.GetMagicSuperPassLastActivationTimeStampQuery) this.b;
                SqlPreparedStatement executeQuery15 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery15, "$this$executeQuery");
                executeQuery15.bindString(0, getMagicSuperPassLastActivationTimeStampQuery.b);
                break;
            case 15:
                Magic_super_pass_tableQueries.GetMagicSuperPassQuery getMagicSuperPassQuery = (Magic_super_pass_tableQueries.GetMagicSuperPassQuery) this.b;
                SqlPreparedStatement executeQuery16 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery16, "$this$executeQuery");
                executeQuery16.bindString(0, getMagicSuperPassQuery.b);
                break;
            case 16:
                Metro_ticket_tableQueries.GetAllMetroTicketsAsFlowQuery getAllMetroTicketsAsFlowQuery = (Metro_ticket_tableQueries.GetAllMetroTicketsAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery17 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery17, "$this$executeQuery");
                executeQuery17.bindString(0, getAllMetroTicketsAsFlowQuery.b);
                executeQuery17.bindString(1, getAllMetroTicketsAsFlowQuery.c);
                break;
            case 17:
                Metro_ticket_tableQueries.GetAllMetroTicketsQuery getAllMetroTicketsQuery = (Metro_ticket_tableQueries.GetAllMetroTicketsQuery) this.b;
                SqlPreparedStatement executeQuery18 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery18, "$this$executeQuery");
                executeQuery18.bindString(0, getAllMetroTicketsQuery.b);
                executeQuery18.bindString(1, getAllMetroTicketsQuery.c);
                break;
            case 18:
                Metro_ticket_tableQueries.GetMetroTicketAsFlowQuery getMetroTicketAsFlowQuery = (Metro_ticket_tableQueries.GetMetroTicketAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery19 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery19, "$this$executeQuery");
                executeQuery19.bindString(0, getMetroTicketAsFlowQuery.b);
                executeQuery19.bindString(1, getMetroTicketAsFlowQuery.c);
                break;
            case 19:
                Metro_ticket_tableQueries.GetMetroTicketQuery getMetroTicketQuery = (Metro_ticket_tableQueries.GetMetroTicketQuery) this.b;
                SqlPreparedStatement executeQuery20 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery20, "$this$executeQuery");
                executeQuery20.bindString(0, getMetroTicketQuery.b);
                executeQuery20.bindString(1, getMetroTicketQuery.c);
                break;
            case 20:
                Mticket_activation_store_tableQueries.GetMTicketActivationInfoQuery getMTicketActivationInfoQuery = (Mticket_activation_store_tableQueries.GetMTicketActivationInfoQuery) this.b;
                SqlPreparedStatement executeQuery21 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery21, "$this$executeQuery");
                executeQuery21.bindString(0, getMTicketActivationInfoQuery.b);
                executeQuery21.bindString(1, getMTicketActivationInfoQuery.c);
                break;
            case 21:
                Multi_modal_group_ticket_child_tableQueries.GetChildTicketReferenceQuery getChildTicketReferenceQuery = (Multi_modal_group_ticket_child_tableQueries.GetChildTicketReferenceQuery) this.b;
                SqlPreparedStatement executeQuery22 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery22, "$this$executeQuery");
                executeQuery22.bindString(0, getChildTicketReferenceQuery.b);
                executeQuery22.bindString(1, getChildTicketReferenceQuery.c);
                executeQuery22.bindString(2, getChildTicketReferenceQuery.d);
                break;
            case 22:
                Multi_modal_group_ticket_child_tableQueries.GetChildrenForGroupIdsQuery getChildrenForGroupIdsQuery = (Multi_modal_group_ticket_child_tableQueries.GetChildrenForGroupIdsQuery) this.b;
                SqlPreparedStatement executeQuery23 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery23, "$this$executeQuery");
                int i15 = 0;
                for (Object obj9 : getChildrenForGroupIdsQuery.b) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery23.bindString(i15, (String) obj9);
                    i15 = i16;
                }
                return Unit.f17538a;
            case 23:
                Multi_modal_group_ticket_child_tableQueries.GetChildrenQuery getChildrenQuery = (Multi_modal_group_ticket_child_tableQueries.GetChildrenQuery) this.b;
                SqlPreparedStatement executeQuery24 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery24, "$this$executeQuery");
                executeQuery24.bindString(0, getChildrenQuery.b);
                break;
            case 24:
                Multi_modal_group_ticket_tableQueries.GetAllGroupsForUserAndCitiesQuery getAllGroupsForUserAndCitiesQuery = (Multi_modal_group_ticket_tableQueries.GetAllGroupsForUserAndCitiesQuery) this.b;
                SqlPreparedStatement executeQuery25 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery25, "$this$executeQuery");
                int i17 = 0;
                executeQuery25.bindString(0, getAllGroupsForUserAndCitiesQuery.b);
                ArrayList arrayList = getAllGroupsForUserAndCitiesQuery.c;
                int size = arrayList.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj10 = arrayList.get(i18);
                    i18++;
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    executeQuery25.bindString(i19, (String) obj10);
                    i17 = i19;
                }
                return Unit.f17538a;
            case 25:
                Multi_modal_group_ticket_tableQueries.GetGroupIdsForUserAndCityQuery getGroupIdsForUserAndCityQuery = (Multi_modal_group_ticket_tableQueries.GetGroupIdsForUserAndCityQuery) this.b;
                SqlPreparedStatement executeQuery26 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery26, "$this$executeQuery");
                executeQuery26.bindString(0, getGroupIdsForUserAndCityQuery.b);
                executeQuery26.bindString(1, getGroupIdsForUserAndCityQuery.c);
                break;
            case 26:
                Multi_modal_group_ticket_tableQueries.GetGroupInfoByIDQuery getGroupInfoByIDQuery = (Multi_modal_group_ticket_tableQueries.GetGroupInfoByIDQuery) this.b;
                SqlPreparedStatement executeQuery27 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery27, "$this$executeQuery");
                executeQuery27.bindString(0, getGroupInfoByIDQuery.b);
                break;
            case 27:
                Ondc_metro_ticket_tableQueries.GetAllMetroTicketsAsFlowQuery getAllMetroTicketsAsFlowQuery2 = (Ondc_metro_ticket_tableQueries.GetAllMetroTicketsAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery28 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery28, "$this$executeQuery");
                executeQuery28.bindString(0, getAllMetroTicketsAsFlowQuery2.b);
                executeQuery28.bindString(1, getAllMetroTicketsAsFlowQuery2.c);
                break;
            case 28:
                Ondc_metro_ticket_tableQueries.GetAllMetroTicketsQuery getAllMetroTicketsQuery2 = (Ondc_metro_ticket_tableQueries.GetAllMetroTicketsQuery) this.b;
                SqlPreparedStatement executeQuery29 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery29, "$this$executeQuery");
                executeQuery29.bindString(0, getAllMetroTicketsQuery2.b);
                executeQuery29.bindString(1, getAllMetroTicketsQuery2.c);
                break;
            default:
                Ondc_metro_ticket_tableQueries.GetMetroTicketAsFlowQuery getMetroTicketAsFlowQuery2 = (Ondc_metro_ticket_tableQueries.GetMetroTicketAsFlowQuery) this.b;
                SqlPreparedStatement executeQuery30 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery30, "$this$executeQuery");
                executeQuery30.bindString(0, getMetroTicketAsFlowQuery2.b);
                executeQuery30.bindString(1, getMetroTicketAsFlowQuery2.c);
                break;
        }
        return Unit.f17538a;
    }
}
