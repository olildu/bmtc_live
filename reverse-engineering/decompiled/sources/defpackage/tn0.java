package defpackage;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19674a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ tn0(float f, float f2, int i) {
        this.f19674a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19674a;
        float f = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                return OffsetKt.absoluteOffset_VpY3zN4$lambda$0(f2, f, (InspectorInfo) obj);
            case 1:
                return OffsetKt.offset_VpY3zN4$lambda$0(f2, f, (InspectorInfo) obj);
            case 2:
                return PaddingKt.padding_VpY3zN4$lambda$0(f2, f, (InspectorInfo) obj);
            default:
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{f2, f}, 0.0f);
                float f3 = 2;
                DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(ChaloColorToken.LightGray.f9814a), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)) / f3)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)) / f3)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)))) << 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & Canvas.mo5073getSizeNHjbRc())), 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                return Unit.f17538a;
        }
    }
}
