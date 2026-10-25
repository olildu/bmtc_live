package defpackage;

import androidx.compose.runtime.saveable.Saver;
import androidx.core.app.FrameMetricsAggregator;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.data.ProductBookingBranding;
import app.chalo.metro.ui.landing.MetroLandingScreenBottomSheetType;
import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoMissingFieldError;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoSnackBarType;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.compose.MarkerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20018a;

    public /* synthetic */ xg0(int i) {
        this.f20018a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20018a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                MTicketTripInfoDataState it = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it, "it");
                return MTicketTripInfoDataState.a(it, null, null, null, null, null, false, null, null, null, 767);
            case 1:
                MTicketTripInfoDataState it2 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it2, "it");
                return MTicketTripInfoDataState.a(it2, null, null, null, null, null, false, null, null, null, 767);
            case 2:
                MTicketTripInfoDataState it3 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it3, "it");
                return MTicketTripInfoDataState.a(it3, null, null, null, null, MTicketTripInfoSnackBarType.FetchingUserFreeRideCount.f5781a, false, null, null, null, 1007);
            case 3:
                MTicketTripInfoDataState it4 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it4, "it");
                return MTicketTripInfoDataState.a(it4, null, null, null, null, MTicketTripInfoSnackBarType.UserFreeRideCountFailed.f5783a, false, null, null, null, 1007);
            case 4:
                MTicketTripInfoDataState it5 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it5, "it");
                return MTicketTripInfoDataState.a(it5, null, null, null, null, null, false, null, null, MTicketTripInfoMissingFieldError.ROUTE, FrameMetricsAggregator.EVERY_DURATION);
            case 5:
                MTicketTripInfoDataState it6 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it6, "it");
                return MTicketTripInfoDataState.a(it6, null, null, null, null, null, false, null, null, MTicketTripInfoMissingFieldError.FROM_STOP, FrameMetricsAggregator.EVERY_DURATION);
            case 6:
                MTicketTripInfoDataState it7 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it7, "it");
                return MTicketTripInfoDataState.a(it7, null, null, null, null, null, false, null, null, MTicketTripInfoMissingFieldError.TO_STOP, FrameMetricsAggregator.EVERY_DURATION);
            case 7:
                MTicketTripInfoDataState it8 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it8, "it");
                return MTicketTripInfoDataState.a(it8, null, null, null, null, null, true, null, null, null, 975);
            case 8:
                MTicketTripInfoDataState it9 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it9, "it");
                return MTicketTripInfoDataState.a(it9, null, null, null, null, null, false, null, null, null, 991);
            case 9:
                MTicketTripInfoDataState it10 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it10, "it");
                return MTicketTripInfoDataState.a(it10, null, null, null, null, null, false, ProductBookingBranding.None.INSTANCE, null, null, 895);
            case 10:
                MTicketTripInfoDataState it11 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it11, "it");
                return MTicketTripInfoDataState.a(it11, null, null, null, null, null, false, ProductBookingBranding.None.INSTANCE, null, null, 895);
            case 11:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("magic_super_pass_table");
                return unit;
            case 12:
                SqlCursor cursor = (SqlCursor) obj;
                Intrinsics.i(cursor, "cursor");
                Boolean bool = cursor.getBoolean(0);
                Intrinsics.f(bool);
                return bool;
            case 13:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("magic_super_pass_table");
                return unit;
            case 14:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("magic_super_pass_table");
                return unit;
            case 15:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 16:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 17:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("magic_super_pass_table");
                return unit;
            case 18:
                Intrinsics.i((Marker) obj, "it");
                return unit;
            case 19:
                LatLng it12 = (LatLng) obj;
                Saver saver = MarkerState.e;
                Intrinsics.i(it12, "it");
                return new MarkerState(it12);
            case 20:
                MetroLandingScreenDataState it13 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it13, "it");
                return MetroLandingScreenDataState.a(it13, false, null, null, null, null, null, null, null, null, null, null, null, MetroLandingScreenBottomSheetType.None, 4095);
            case 21:
                MetroLandingScreenDataState it14 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it14, "it");
                return MetroLandingScreenDataState.a(it14, false, null, null, null, null, null, null, null, null, null, null, null, MetroLandingScreenBottomSheetType.None, 4095);
            case 22:
                MetroLandingScreenDataState it15 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it15, "it");
                return MetroLandingScreenDataState.a(it15, false, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
            case 23:
                MetroLandingScreenDataState it16 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it16, "it");
                return MetroLandingScreenDataState.a(it16, false, null, null, null, null, null, null, null, null, null, null, null, MetroLandingScreenBottomSheetType.None, 4095);
            case 24:
                MetroLandingScreenDataState it17 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it17, "it");
                return MetroLandingScreenDataState.a(it17, true, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
            case 25:
                MetroLandingScreenDataState it18 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it18, "it");
                return MetroLandingScreenDataState.a(it18, false, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
            case 26:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, true, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
            case 27:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, true, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
            case 28:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, false, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
            default:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, true, null, null, null, null, null, null, null, null, null, null, null, null, 8190);
        }
    }
}
