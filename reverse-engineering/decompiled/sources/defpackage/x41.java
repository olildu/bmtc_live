package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.home.ui.selectridescreen.RideSavedSuccessFailureState;
import app.chalo.home.ui.selectridescreen.ScreenType;
import app.chalo.home.ui.selectridescreen.SelectRideDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x41 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19986a;

    public /* synthetic */ x41(int i) {
        this.f19986a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19986a) {
            case 0:
                return SaversKt.LocaleSaver$lambda$1(obj);
            case 1:
                return SaversKt.ClickableSaver$lambda$1(obj);
            case 2:
                return SaversKt.LineHeightStyleSaver$lambda$1(obj);
            case 3:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$1(obj);
            case 4:
                return SaversKt.LineHeightStyleTrimSaver$lambda$1(obj);
            case 5:
                return SaversKt.AnnotationRangeSaver$lambda$1(obj);
            case 6:
                return SaversKt.LineHeightStyleModeSaver$lambda$1(obj);
            case 7:
                return SaversKt.VerbatimTtsAnnotationSaver$lambda$1(obj);
            case 8:
                return SaversKt.UrlAnnotationSaver$lambda$1(obj);
            case 9:
                return SaversKt.ParagraphStyleSaver$lambda$1(obj);
            case 10:
                return SaversKt.SpanStyleSaver$lambda$1(obj);
            case 11:
                return Savers_androidKt.PlatformParagraphStyleSaver$lambda$1(obj);
            case 12:
                return Savers_androidKt.emojiSupportMatchSaver$lambda$1(obj);
            case 13:
                return Savers_androidKt.LineBreakSaver$lambda$1(obj);
            case 14:
                return Savers_androidKt.TextMotionSaver$lambda$1(obj);
            case 15:
                return Savers_androidKt.TextMotionLinearitySaver$lambda$1(obj);
            case 16:
                return ScrollState.Saver$lambda$1(((Integer) obj).intValue());
            case 17:
                return Boolean.valueOf(ScrollableKt.CanDragCalculation$lambda$0((PointerType) obj));
            case 18:
                return SegmentedButtonKt.SegmentedButton$lambda$4$lambda$3((SemanticsPropertyReceiver) obj);
            case 19:
                SelectRideDataState it = (SelectRideDataState) obj;
                Intrinsics.i(it, "it");
                return SelectRideDataState.a(it, null, null, null, false, false, RideSavedSuccessFailureState.RIDE_ALREADY_SAVED, false, ScreenType.SUCCESS_FAILURE, 215);
            case 20:
                SelectRideDataState it2 = (SelectRideDataState) obj;
                Intrinsics.i(it2, "it");
                return SelectRideDataState.a(it2, null, null, null, false, false, null, true, null, 439);
            case 21:
                SelectRideDataState it3 = (SelectRideDataState) obj;
                Intrinsics.i(it3, "it");
                return SelectRideDataState.a(it3, null, null, null, false, false, null, false, null, 447);
            case 22:
                SelectRideDataState it4 = (SelectRideDataState) obj;
                Intrinsics.i(it4, "it");
                return SelectRideDataState.a(it4, null, null, null, false, false, RideSavedSuccessFailureState.FAILURE, false, ScreenType.SUCCESS_FAILURE, 159);
            case 23:
                SelectRideDataState it5 = (SelectRideDataState) obj;
                Intrinsics.i(it5, "it");
                return SelectRideDataState.a(it5, null, null, null, false, false, RideSavedSuccessFailureState.SUCCESS, false, ScreenType.SUCCESS_FAILURE, 159);
            case 24:
                SelectRideDataState it6 = (SelectRideDataState) obj;
                Intrinsics.i(it6, "it");
                return SelectRideDataState.a(it6, null, null, null, false, false, null, true, null, 447);
            case 25:
                SelectRideDataState it7 = (SelectRideDataState) obj;
                Intrinsics.i(it7, "it");
                return SelectRideDataState.a(it7, null, null, null, false, false, null, false, ScreenType.RIDE_SELECTION, 255);
            case 26:
                SelectRideDataState it8 = (SelectRideDataState) obj;
                Intrinsics.i(it8, "it");
                return SelectRideDataState.a(it8, null, null, null, true, false, null, false, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH);
            case 27:
                SelectRideDataState it9 = (SelectRideDataState) obj;
                Intrinsics.i(it9, "it");
                return SelectRideDataState.a(it9, null, null, null, false, false, null, false, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH);
            case 28:
                return SelectableGroupKt.selectableGroup$lambda$0((SemanticsPropertyReceiver) obj);
            default:
                return SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$0((Offset) obj);
        }
    }
}
