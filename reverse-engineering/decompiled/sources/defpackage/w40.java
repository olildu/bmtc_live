package defpackage;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class w40 {
    public static float a(FontScaling fontScaling, long j) {
        if (!TextUnitType.m7496equalsimpl0(TextUnit.m7467getTypeUIouoOA(j), TextUnitType.INSTANCE.m7501getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(fontScaling.getFontScale())) {
            return Dp.m7278constructorimpl(fontScaling.getFontScale() * TextUnit.m7468getValueimpl(j));
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(fontScaling.getFontScale());
        if (fontScaleConverterForScale != null) {
            return Dp.m7278constructorimpl(fontScaleConverterForScale.convertSpToDp(TextUnit.m7468getValueimpl(j)));
        }
        return Dp.m7278constructorimpl(fontScaling.getFontScale() * TextUnit.m7468getValueimpl(j));
    }

    public static long b(FontScaling fontScaling, float f) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(fontScaling.getFontScale())) {
            return TextUnitKt.getSp(f / fontScaling.getFontScale());
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(fontScaling.getFontScale());
        return TextUnitKt.getSp(fontScaleConverterForScale != null ? fontScaleConverterForScale.convertDpToSp(f) : f / fontScaling.getFontScale());
    }
}
