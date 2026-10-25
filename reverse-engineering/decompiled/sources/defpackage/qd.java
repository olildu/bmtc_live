package defpackage;

import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.ts.PsExtractor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState;
import app.chalo.home.ui.regularbus.NearbyBusesMapData;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptDataState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19110a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ qd(int i, ArrayList arrayList) {
        this.f19110a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19110a) {
            case 0:
                BusesAroundYouDataState it = (BusesAroundYouDataState) obj;
                Intrinsics.i(it, "it");
                return BusesAroundYouDataState.a(it, false, false, NearbyBusesMapData.a(it.c, this.b, null, null, 14), null, null, null, 0L, 0L, false, 2043);
            case 1:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, this.b, null, false, null, false, null, null, null, null, 267911167);
            case 2:
                ChaloBusRouteInfoDataState it2 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it2, "it");
                return ChaloBusRouteInfoDataState.a(it2, null, false, null, null, this.b, null, null, null, null, 495);
            case 3:
                ChaloBusRouteInfoDataState it3 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it3, "it");
                return ChaloBusRouteInfoDataState.a(it3, null, false, this.b, null, null, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_Y);
            case 4:
                ChaloBusUserProfileSurveyDataState it4 = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it4, "it");
                return ChaloBusUserProfileSurveyDataState.a(it4, new PBUserProfileSurveyPreference(), this.b, 0, false, null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            case 5:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute.bindString(i, (String) obj2);
                    i = i3;
                }
                return Unit.f17538a;
            case 6:
                MinProfileUpdateDataState state = (MinProfileUpdateDataState) obj;
                Intrinsics.i(state, "state");
                return MinProfileUpdateDataState.a(state, null, this.b, null, 0, false, null, null, null, 253);
            case 7:
                MinProfileUpdateDataState state2 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(state2, "state");
                return MinProfileUpdateDataState.a(state2, null, this.b, null, 0, false, null, null, null, 253);
            case 8:
                MinProfileUpdateDataState state3 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(state3, "state");
                return MinProfileUpdateDataState.a(state3, null, this.b, null, 0, false, null, null, null, 253);
            case 9:
                MinProfileUpdateDataState state4 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(state4, "state");
                return MinProfileUpdateDataState.a(state4, null, this.b, null, 0, false, null, null, null, ComposerImplKt.nodeKey);
            case 10:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size2) {
                    Object obj3 = arrayList2.get(i5);
                    i5++;
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute2.bindString(i4, (String) obj3);
                    i4 = i6;
                }
                return Unit.f17538a;
            case 11:
                PremiumBusSeatSelectionDataState it5 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it5, "it");
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = this.b;
                int size3 = arrayList4.size();
                int i7 = 0;
                while (i7 < size3) {
                    Object obj4 = arrayList4.get(i7);
                    i7++;
                    if (((SeatInfoAppModel) obj4).i) {
                        arrayList3.add(obj4);
                    }
                }
                return PremiumBusSeatSelectionDataState.a(it5, false, null, arrayList4, null, arrayList3, false, null, null, false, null, null, null, null, 65455);
            case 12:
                PremiumBusSeatSelectionDataState it6 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it6, "it");
                return PremiumBusSeatSelectionDataState.a(it6, false, null, this.b, null, EmptyList.f17557a, false, null, null, false, null, null, null, null, 65455);
            case 13:
                PremiumBusSlotSelectionDataState it7 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it7, "it");
                return PremiumBusSlotSelectionDataState.a(it7, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, this.b, null, -1073741825);
            case 14:
                PremiumReserveTicketPostBookingActionState it8 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it8, "it");
                return PremiumReserveTicketPostBookingActionState.a(it8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.b, null, null, null, false, null, false, null, null, null, null, null, null, -8388609, 31);
            case 15:
                PremiumReserveTicketPostBookingActionState it9 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it9, "it");
                return PremiumReserveTicketPostBookingActionState.a(it9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.b, null, null, null, false, null, false, null, null, null, null, null, null, -8388609, 31);
            case 16:
                PremiumReserveTicketPostBookingActionState it10 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it10, "it");
                PremiumBusLiveTrackingState premiumBusLiveTrackingState = it10.r;
                return PremiumReserveTicketPostBookingActionState.a(it10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, premiumBusLiveTrackingState != null ? PremiumBusLiveTrackingState.a(premiumBusLiveTrackingState, null, this.b, null, null, null, ComposerImplKt.nodeKey) : null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
            case 17:
                RideReceiptDataState it11 = (RideReceiptDataState) obj;
                Intrinsics.i(it11, "it");
                return RideReceiptDataState.a(it11, false, null, this.b, 2);
            case 18:
                RouteDetailsDataState it12 = (RouteDetailsDataState) obj;
                Intrinsics.i(it12, "it");
                int length = it12.K.length();
                ArrayList arrayList5 = this.b;
                return RouteDetailsDataState.a(it12, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, arrayList5, length > 0 || !arrayList5.isEmpty(), null, false, -1, 103);
            case 19:
                TitoRideDetailsViewState it13 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it13, "it");
                return TitoRideDetailsViewState.a(it13, null, null, null, false, null, this.b, null, null, 0.0d, false, 1983);
            default:
                TitoRideDetailsViewState it14 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it14, "it");
                return TitoRideDetailsViewState.a(it14, null, null, null, false, null, this.b, null, null, 0.0d, false, 1983);
        }
    }

    public /* synthetic */ qd(ArrayList arrayList, RouteDetailsComponent routeDetailsComponent) {
        this.f19110a = 18;
        this.b = arrayList;
    }
}
