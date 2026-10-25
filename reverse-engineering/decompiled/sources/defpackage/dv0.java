package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionErrorScreenType;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15496a;

    public /* synthetic */ dv0(int i) {
        this.f15496a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15496a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                PremiumBusSlotSelectionDataState it = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusSlotSelectionDataState.a(it, true, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -6);
            case 1:
                PremiumBusSlotSelectionDataState it2 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusSlotSelectionDataState.a(it2, true, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -14);
            case 2:
                PremiumBusSlotSelectionDataState it3 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusSlotSelectionDataState.a(it3, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -8);
            case 3:
                PremiumBusSlotSelectionDataState it4 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it4, "it");
                return PremiumBusSlotSelectionDataState.a(it4, false, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -13);
            case 4:
                PremiumBusSlotSelectionDataState it5 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it5, "it");
                return PremiumBusSlotSelectionDataState.a(it5, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -16);
            case 5:
                PremiumBusSlotSelectionDataState it6 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it6, "it");
                return PremiumBusSlotSelectionDataState.a(it6, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            case 6:
                PremiumBusSlotSelectionDataState it7 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it7, "it");
                return PremiumBusSlotSelectionDataState.a(it7, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            case 7:
                PremiumBusSlotSelectionDataState it8 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it8, "it");
                return PremiumBusSlotSelectionDataState.a(it8, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -35);
            case 8:
                PremiumBusSlotSelectionDataState it9 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                return PremiumBusSlotSelectionDataState.a(it9, false, true, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -35);
            case 9:
                PremiumBusSlotSelectionDataState it10 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it10, "it");
                return PremiumBusSlotSelectionDataState.a(it10, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            case 10:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 11:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -13);
            case 12:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -35);
            case 13:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -35);
            case 14:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 15:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 16:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 17:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 18:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 19:
                ((Long) obj).getClass();
                return unit;
            case 20:
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
                long jM4631getBlack0d7_KjU = Color.INSTANCE.m4631getBlack0d7_KjU();
                float f = 2;
                long jM4357constructorimpl = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / f) << 32));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)) / f;
                DrawScope.CC.E(Canvas, jM4631getBlack0d7_KjU, jM4357constructorimpl, Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 6.0f, 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                return unit;
            case 21:
                PremiumBusStopSelectionViewState it11 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it11, "it");
                return PremiumBusStopSelectionViewState.a(it11, null, false, false, null, null, null, null, false, null, false, false, null, null, 131069);
            case 22:
                PremiumBusStopSelectionViewState it12 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it12, "it");
                return PremiumBusStopSelectionViewState.a(it12, null, false, false, null, null, null, null, false, null, false, false, null, null, 131069);
            case 23:
                PremiumBusStopSelectionViewState it13 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it13, "it");
                return PremiumBusStopSelectionViewState.a(it13, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 24:
                PremiumBusStopSelectionViewState it14 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it14, "it");
                return PremiumBusStopSelectionViewState.a(it14, null, false, false, null, null, null, null, false, null, false, false, null, null, 114687);
            case 25:
                PremiumBusStopSelectionViewState it15 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it15, "it");
                return PremiumBusStopSelectionViewState.a(it15, null, false, false, null, null, null, null, false, null, false, false, null, null, 98271);
            case 26:
                PremiumBusStopSelectionViewState it16 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it16, "it");
                return PremiumBusStopSelectionViewState.a(it16, null, false, false, null, null, null, null, false, null, false, false, null, null, 98271);
            case 27:
                PremiumBusStopSelectionViewState it17 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it17, "it");
                return PremiumBusStopSelectionViewState.a(it17, null, false, false, null, null, null, null, false, null, false, false, null, null, 98271);
            case 28:
                PremiumBusStopSelectionViewState it18 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it18, "it");
                return PremiumBusStopSelectionViewState.a(it18, null, false, false, null, null, null, null, false, null, false, false, null, null, 98271);
            default:
                PremiumBusStopSelectionViewState it19 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it19, "it");
                return PremiumBusStopSelectionViewState.a(it19, null, false, false, null, null, PBStopSelectionScreenBottomSheetType.NewRouteSuggestionSubmitSuccess.f7958a, null, false, null, false, false, null, null, 131037);
        }
    }
}
