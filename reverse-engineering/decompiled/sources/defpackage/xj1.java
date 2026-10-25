package defpackage;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.geometry.Offset;
import app.chalo.compose.SearchFieldSectionType;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.livetracking.tripplanner.data.exceptions.TripPlannerCallFailedException;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerPurchaseHooksUiState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xj1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20027a;

    public /* synthetic */ xj1(int i) {
        this.f20027a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20027a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("tito_validation_table");
                return unit;
            case 1:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("tito_validation_table");
                return unit;
            case 2:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("tito_validation_table");
                return unit;
            case 3:
                return TopAppBarState.Saver$lambda$1((List) obj);
            case 4:
                return Boolean.valueOf(TransformableKt.transformable$lambda$0((Offset) obj));
            case 5:
                return TransitionKt.SeekableTransitionStateTotalDurationChanged$lambda$0((SeekableTransitionState) obj);
            case 6:
                return TransitionKt.SeekableStateObserver_delegate$lambda$0$0((Function0) obj);
            case 7:
                TripPlannerDetailsState it = (TripPlannerDetailsState) obj;
                Intrinsics.i(it, "it");
                return TripPlannerDetailsState.a(it, null, null, null, null, null, null, null, null, 255);
            case 8:
                return TripPlannerDetailsState.a((TripPlannerDetailsState) obj, null, null, null, null, TripPlannerPurchaseHooksUiState.Loading.f4741a, null, null, null, 495);
            case 9:
                Intrinsics.i((MapCameraUpdate) obj, "it");
                return unit;
            case 10:
                String str = (String) obj;
                Intrinsics.i(str, "str");
                return (String) CollectionsKt.L(0, StringsKt.U(str, new String[]{","}, 6));
            case 11:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new TripPlannerCallFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 12:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new TripPlannerCallFailedException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 13:
                TripPlannerResultsState it2 = (TripPlannerResultsState) obj;
                List list = TripPlannerResultsComponent.Z;
                Intrinsics.i(it2, "it");
                return TripPlannerResultsState.a(it2, null, null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, false, false, false, false, 524287);
            case 14:
                TripPlannerResultsState it3 = (TripPlannerResultsState) obj;
                List list2 = TripPlannerResultsComponent.Z;
                Intrinsics.i(it3, "it");
                return TripPlannerResultsState.a(it3, null, null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, false, false, false, false, 524287);
            case 15:
                TripPlannerResultsState it4 = (TripPlannerResultsState) obj;
                List list3 = TripPlannerResultsComponent.Z;
                Intrinsics.i(it4, "it");
                return TripPlannerResultsState.a(it4, null, null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, false, false, false, false, 1032191);
            case 16:
                TripPlannerResultsState it5 = (TripPlannerResultsState) obj;
                List list4 = TripPlannerResultsComponent.Z;
                Intrinsics.i(it5, "it");
                return TripPlannerResultsState.a(it5, null, null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, false, false, false, false, 1046527);
            case 17:
                return TripPlannerResultsState.a((TripPlannerResultsState) obj, null, null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, true, true, false, false, 65535);
            case 18:
                return TripPlannerResultsState.a((TripPlannerResultsState) obj, null, null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, false, false, true, false, 65535);
            case 19:
                return TripPlannerResultsState.a((TripPlannerResultsState) obj, null, null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, false, true, false, true, 65535);
            case 20:
                return TripPlannerResultsState.a((TripPlannerResultsState) obj, null, null, null, null, false, SearchFieldSectionType.WITHOUT_PROCEED_BTN, false, TripPlannerResultSectionType.LOADING, null, null, null, null, null, null, false, null, false, false, false, false, 1048159);
            case 21:
                TripPlannerItineraryUiModel it6 = (TripPlannerItineraryUiModel) obj;
                Intrinsics.i(it6, "it");
                return it6.f4753a;
            case 22:
                SeatInfoAppModel it7 = (SeatInfoAppModel) obj;
                Intrinsics.i(it7, "it");
                return it7.c;
            case 23:
                Pair it8 = (Pair) obj;
                Intrinsics.i(it8, "it");
                String str2 = (String) it8.d();
                if (it8.e() == null) {
                    return str2;
                }
                return str2 + '=' + String.valueOf(it8.e());
            case 24:
                ImageView iconView = (ImageView) obj;
                Intrinsics.i(iconView, "iconView");
                iconView.setImageDrawable(new ColorDrawable(Color.parseColor("#9AC7DE")));
                return unit;
            case 25:
                ImageView choiceView = (ImageView) obj;
                Intrinsics.i(choiceView, "choiceView");
                choiceView.setVisibility(0);
                choiceView.setImageResource(R.drawable.ic_dialog_info);
                choiceView.setColorFilter(Color.parseColor("#3DB5E8"));
                choiceView.setOnClickListener(null);
                return unit;
            case 26:
                Intrinsics.i((CrashlyticsLog) obj, "it");
                return unit;
            case 27:
                UniversalPickerViewState it9 = (UniversalPickerViewState) obj;
                Intrinsics.i(it9, "it");
                return UniversalPickerViewState.a(it9, null, null, null, false, false, null, null, false, true, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388351);
            case 28:
                UniversalPickerViewState it10 = (UniversalPickerViewState) obj;
                Intrinsics.i(it10, "it");
                return UniversalPickerViewState.a(it10, null, null, null, false, false, SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 8388575);
            default:
                UniversalPickerViewState it11 = (UniversalPickerViewState) obj;
                Intrinsics.i(it11, "it");
                return UniversalPickerViewState.a(it11, null, null, null, false, false, null, null, false, false, false, null, null, null, null, null, null, false, null, false, false, null, null, null, 7864063);
        }
    }
}
