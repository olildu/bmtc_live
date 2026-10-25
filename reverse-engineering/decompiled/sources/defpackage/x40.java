package defpackage;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.FontScalingLinear;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class x40 {
    public static float a(FontScalingLinear fontScalingLinear, long j) {
        if (!TextUnitType.m7496equalsimpl0(TextUnit.m7467getTypeUIouoOA(j), TextUnitType.INSTANCE.m7501getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return Dp.m7278constructorimpl(fontScalingLinear.getFontScale() * TextUnit.m7468getValueimpl(j));
    }

    public static long b(FontScalingLinear fontScalingLinear, float f) {
        return TextUnitKt.getSp(f / fontScalingLinear.getFontScale());
    }
}
