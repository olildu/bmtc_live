package defpackage;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyIntent;
import app.chalo.chalobususerprofile.ui.compose.TimePickerSelection;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.SelectedDateAndTime;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class di implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15464a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ di(int i, int i2, int i3, Object obj, Object obj2) {
        this.f15464a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15464a) {
            case 0:
                ChaloBusUserProfileSurveyIntent.TimeFieldClicked timeFieldClicked = (ChaloBusUserProfileSurveyIntent.TimeFieldClicked) this.d;
                String str = (String) this.e;
                ChaloBusUserProfileSurveyDataState it = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it, "it");
                return ChaloBusUserProfileSurveyDataState.a(it, null, null, 0, false, timeFieldClicked.f1216a, new TimePickerSelection(this.b, this.c, str), false, ComposerKt.reuseKey);
            case 1:
                return NearestRangeKeyIndexMap.lambda$1$0(this.b, this.c, (MutableObjectIntMap) this.d, (NearestRangeKeyIndexMap) this.e, (IntervalList.Interval) obj);
            case 2:
                PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet premiumBusDateAndTimePickerBottomSheet = (PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet) this.d;
                String str2 = (String) this.e;
                PremiumBusStopSelectionViewState it2 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusStopSelectionViewState.a(it2, null, false, false, null, null, premiumBusDateAndTimePickerBottomSheet, null, false, null, false, false, null, new SelectedDateAndTime(this.b, this.c, str2), 98271);
            case 3:
                Placeable placeable = (Placeable) this.d;
                Placeable placeable2 = (Placeable) this.e;
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.i(layout, "$this$layout");
                int height = placeable.getHeight();
                int i = this.b;
                Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, (i - height) / 2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, placeable.getWidth() - this.c, pk0.a(i, 2, placeable2), 0.0f, 4, null);
                return Unit.f17538a;
            default:
                return RulerAlignmentKt.fitInside$lambda$0$1((RectRulers) this.d, this.b, this.c, (Placeable) this.e, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ di(int i, int i2, MutableObjectIntMap mutableObjectIntMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f15464a = 1;
        this.b = i;
        this.c = i2;
        this.d = mutableObjectIntMap;
        this.e = nearestRangeKeyIndexMap;
    }

    public /* synthetic */ di(Placeable placeable, int i, Placeable placeable2, int i2) {
        this.f15464a = 3;
        this.d = placeable;
        this.b = i;
        this.e = placeable2;
        this.c = i2;
    }
}
