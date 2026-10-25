package defpackage;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.SaversKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.SavedStateConfig_androidKt;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesDataState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s41 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19269a;

    public /* synthetic */ s41(int i) {
        this.f19269a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19269a) {
            case 0:
                SavedPlacesAndRidesDataState it = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it, "it");
                return SavedPlacesAndRidesDataState.a(it, false, false, null, null, null, null, false, true, 252);
            case 1:
                SavedPlacesAndRidesDataState it2 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it2, "it");
                return SavedPlacesAndRidesDataState.a(it2, false, false, null, null, null, null, false, false, 351);
            case 2:
                SavedPlacesAndRidesDataState it3 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it3, "it");
                return SavedPlacesAndRidesDataState.a(it3, false, false, null, null, null, null, false, false, 351);
            case 3:
                SavedPlacesAndRidesDataState it4 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it4, "it");
                return SavedPlacesAndRidesDataState.a(it4, true, true, null, null, null, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT);
            case 4:
                SavedPlacesAndRidesDataState it5 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it5, "it");
                return SavedPlacesAndRidesDataState.a(it5, false, false, null, null, null, null, false, false, 351);
            case 5:
                SavedPlacesAndRidesDataState it6 = (SavedPlacesAndRidesDataState) obj;
                Intrinsics.i(it6, "it");
                return SavedPlacesAndRidesDataState.a(it6, false, false, null, null, null, null, false, false, 351);
            case 6:
                return SavedPlacesAndRidesDataState.a((SavedPlacesAndRidesDataState) obj, false, false, null, null, null, null, false, false, 383);
            case 7:
                return SavedPlacesAndRidesDataState.a((SavedPlacesAndRidesDataState) obj, false, false, null, null, null, null, false, false, 383);
            case 8:
                return SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            case 9:
                return SaverKt.AutoSaver$lambda$1(obj);
            case 10:
                return SaversKt.TextLinkStylesSaver$lambda$1(obj);
            case 11:
                return SaversKt.AnnotatedStringSaver$lambda$1(obj);
            case 12:
                return SaversKt.TextDecorationSaver$lambda$1(obj);
            case 13:
                return SaversKt.TextGeometricTransformSaver$lambda$1(obj);
            case 14:
                return SaversKt.TextIndentSaver$lambda$1(obj);
            case 15:
                return SaversKt.FontWeightSaver$lambda$1(obj);
            case 16:
                return SaversKt.BaselineShiftSaver$lambda$1(obj);
            case 17:
                return SaversKt.TextRangeSaver$lambda$1(obj);
            case 18:
                return SaversKt.ShadowSaver$lambda$1(obj);
            case 19:
                return SaversKt.TextAlignSaver$lambda$1(obj);
            case 20:
                return SaversKt.LinkSaver$lambda$1(obj);
            case 21:
                return SaversKt.TextDirectionSaver$lambda$1(obj);
            case 22:
                return SaversKt.HyphensSaver$lambda$1(obj);
            case 23:
                return SaversKt.AnnotationRangeListSaver$lambda$1(obj);
            case 24:
                return SaversKt.FontStyleSaver$lambda$1(obj);
            case 25:
                return SaversKt.FontSynthesisSaver$lambda$1(obj);
            case 26:
                return SaversKt.TextUnitSaver$lambda$1(obj);
            case 27:
                return SaversKt.TextUnitTypeSaver$lambda$1(obj);
            case 28:
                return SaversKt.OffsetSaver$lambda$1(obj);
            default:
                return SaversKt.LocaleListSaver$lambda$1(obj);
        }
    }
}
