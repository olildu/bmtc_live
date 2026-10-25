package app.chalo.compose;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/compose/ChaloCardNumberTranslatorKt$chaloCardNumberFilter$chaloCardOffsetTranslator$1", "Landroidx/compose/ui/text/input/OffsetMapping;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardNumberTranslatorKt$chaloCardNumberFilter$chaloCardOffsetTranslator$1 implements OffsetMapping {
    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int originalToTransformed(int i) {
        if (i >= 0 && i < 2) {
            return i;
        }
        if (2 <= i && i < 6) {
            return i + 1;
        }
        if (6 <= i && i < 10) {
            return i + 2;
        }
        if (10 > i || i >= 16) {
            return 19;
        }
        return i + 3;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int transformedToOriginal(int i) {
        if (i >= 0 && i < 3) {
            return i;
        }
        if (3 <= i && i < 8) {
            return i - 1;
        }
        if (8 <= i && i < 13) {
            return i - 2;
        }
        if (13 > i || i >= 20) {
            return 16;
        }
        return i - 3;
    }
}
