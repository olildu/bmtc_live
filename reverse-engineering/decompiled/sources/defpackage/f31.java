package defpackage;

import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.instantticket.ui.routeselection.RouteSelectionViewState;
import app.chalo.livetracking.universalsearch.data.exception.AutoCompleteRemoteDataException;
import app.chalo.livetracking.universalsearch.data.exception.FetchPlaceAddressException;
import app.chalo.livetracking.universalsearch.data.exception.FetchPlaceLatLngException;
import app.chalo.livetracking.universalsearch.ui.SearchErrorScreen;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.routeselection.ui.RouteSelectionBottomSheetType;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import app.chalo.sos.SosScreenDataState;
import app.chalo.sos.SosScreenType;
import app.chalo.stoptripdetails.data.exceptions.StopTripDetailsRemoteDataException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f31 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15607a;
    public final /* synthetic */ String b;

    public /* synthetic */ f31(String str, int i) {
        this.f15607a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        switch (this.f15607a) {
            case 0:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                return Unit.f17538a;
            case 1:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, this.b);
                return Unit.f17538a;
            case 2:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, null, null, null, null, false, null, null, this.b, false, 767);
            case 3:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, this.b);
                return Unit.f17538a;
            case 4:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$36$lambda$35(this.b, (SemanticsPropertyReceiver) obj);
            case 5:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$41$lambda$40(this.b, (SemanticsPropertyReceiver) obj);
            case 6:
                SosScreenDataState it = (SosScreenDataState) obj;
                Intrinsics.i(it, "it");
                return SosScreenDataState.a(it, this.b, null, null, null, null, false, null, false, 254);
            case 7:
                return SosScreenDataState.a((SosScreenDataState) obj, this.b, null, null, null, SosScreenType.DISPLAY_SCREEN, false, null, false, 238);
            case 8:
                StopBasedRouteSearchViewState it2 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it2, "it");
                return StopBasedRouteSearchViewState.a(it2, null, null, null, false, false, null, true, this.b, null, null, null, null, null, null, 16191);
            case 9:
                StopBasedRouteSearchViewState it3 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it3, "it");
                return StopBasedRouteSearchViewState.a(it3, null, null, null, false, false, null, true, this.b, null, null, null, null, null, null, 16175);
            case 10:
                StopBasedRouteSearchViewState it4 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedRouteSearchViewState.a(it4, null, null, null, false, false, new RouteSelectionBottomSheetType.NoRouteAvailableAvailable(this.b), false, null, null, null, null, null, null, null, 16335);
            case 11:
                StopBasedRouteSearchViewState it5 = (StopBasedRouteSearchViewState) obj;
                Intrinsics.i(it5, "it");
                return StopBasedRouteSearchViewState.a(it5, null, null, null, false, false, null, true, this.b, null, null, null, null, null, null, 16175);
            case 12:
                return StopBasedRouteSearchViewState.a((StopBasedRouteSearchViewState) obj, null, null, null, false, false, new RouteSelectionBottomSheetType.NoRouteAvailableAvailable(this.b), false, null, null, null, null, null, null, null, 16351);
            case 13:
                return StopBasedRouteSearchViewState.a((StopBasedRouteSearchViewState) obj, null, null, null, false, false, new RouteSelectionBottomSheetType.NoRouteAvailableAvailable(this.b), false, null, null, null, null, null, null, null, 16335);
            case 14:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = this.b;
                }
                return new StopTripDetailsRemoteDataException(genericChaloErrorResponse, str);
            case 15:
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, this.b);
                return Unit.f17538a;
            case 16:
                return TextFieldImplKt.defaultErrorSemantics$lambda$22(this.b, (SemanticsPropertyReceiver) obj);
            case 17:
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                execute5.bindString(0, this.b);
                return Unit.f17538a;
            case 18:
                return TimePickerKt.ClockText$lambda$83$lambda$82$lambda$81(this.b, (SemanticsPropertyReceiver) obj);
            case 19:
                return TimePickerKt.PeriodToggleImpl$lambda$41$lambda$40(this.b, (SemanticsPropertyReceiver) obj);
            case 20:
                return TimePickerKt.TimePickerTextField_1vLObsk$lambda$92$lambda$89$lambda$88$lambda$87(this.b, (SemanticsPropertyReceiver) obj);
            case 21:
                return TimePickerKt.TimeSelector_SAnMeKU$lambda$56$lambda$55(this.b, (SemanticsPropertyReceiver) obj);
            case 22:
                SqlPreparedStatement execute6 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute6, "$this$execute");
                execute6.bindString(0, this.b);
                return Unit.f17538a;
            case 23:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = this.b;
                }
                return new FetchPlaceAddressException(genericChaloErrorResponse2, str2);
            case 24:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse3 == null || (str3 = genericChaloErrorResponse3.b) == null) {
                    str3 = this.b;
                }
                return new FetchPlaceLatLngException(genericChaloErrorResponse3, str3);
            case 25:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse4 == null || (str4 = genericChaloErrorResponse4.b) == null) {
                    str4 = this.b;
                }
                return new AutoCompleteRemoteDataException(genericChaloErrorResponse4, str4);
            case 26:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse5 == null || (str5 = genericChaloErrorResponse5.b) == null) {
                    str5 = this.b;
                }
                return new AutoCompleteRemoteDataException(genericChaloErrorResponse5, str5);
            case 27:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse6 == null || (str6 = genericChaloErrorResponse6.b) == null) {
                    str6 = this.b;
                }
                return new AutoCompleteRemoteDataException(genericChaloErrorResponse6, str6);
            case 28:
                UniversalPickerViewState it6 = (UniversalPickerViewState) obj;
                Intrinsics.i(it6, "it");
                return UniversalPickerViewState.a(it6, null, EmptyList.f17557a, null, false, false, SearchScreenLayoutType.ERROR_SCREEN, new SearchErrorScreen.ApiErrorOccurred(this.b), false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388381);
            default:
                UniversalPickerViewState it7 = (UniversalPickerViewState) obj;
                Intrinsics.i(it7, "it");
                return UniversalPickerViewState.a(it7, null, EmptyList.f17557a, null, false, false, SearchScreenLayoutType.ERROR_SCREEN, new SearchErrorScreen.NoResultFound(this.b), false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388381);
        }
    }
}
