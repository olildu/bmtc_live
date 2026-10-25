package defpackage;

import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultDialogType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import io.github.alexzhirkevich.keight.JSRuntime;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19610a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sy(int i, long j, Object obj) {
        this.f19610a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19610a) {
            case 0:
                PathEffect pathEffect = (PathEffect) this.c;
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                DrawScope.CC.E(Canvas, this.b, Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.0f) << 32)), 0.0f, 0, pathEffect, 0.0f, null, 0, 472, null);
                return Unit.f17538a;
            case 1:
                ((JSRuntime) this.c).w.remove(Long.valueOf(this.b));
                return Unit.f17538a;
            case 2:
                return NavigationDrawerKt.Scrim_Bx497Mc$lambda$71$lambda$70(this.b, (Function0) this.c, (DrawScope) obj);
            default:
                TripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1 tripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1 = (TripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1) this.c;
                long j = this.b;
                return TripPlannerResultsState.a((TripPlannerResultsState) obj, null, null, null, null, false, null, false, null, null, null, null, new TripPlannerResultDialogType.DateEditOptionDialog(j, tripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1), null, null, false, Long.valueOf(j), false, false, false, false, 1013759);
        }
    }

    public /* synthetic */ sy(JSRuntime jSRuntime, long j) {
        this.f19610a = 1;
        this.c = jSRuntime;
        this.b = j;
    }
}
