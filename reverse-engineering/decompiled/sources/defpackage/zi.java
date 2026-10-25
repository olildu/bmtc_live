package defpackage;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import app.chalo.compose.ChaloCardNumberTranslatorKt$creditCardNumberFilter$creditCardOffsetTranslator$1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zi implements VisualTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20201a;

    public /* synthetic */ zi(int i) {
        this.f20201a = i;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString it) {
        switch (this.f20201a) {
            case 0:
                Intrinsics.i(it, "it");
                int length = it.getText().length();
                String text = it.getText();
                if (length >= 16) {
                    text = StringsKt.c0(text, new IntRange(0, 15, 1));
                }
                int length2 = text.length();
                String strA = "";
                for (int i = 0; i < length2; i++) {
                    strA = strA + text.charAt(i);
                    if (i % 4 == 3 && i != 15) {
                        strA = vo1.A(strA, " ");
                    }
                }
                return new TransformedText(new AnnotatedString(strA, null, 2, null), new ChaloCardNumberTranslatorKt$creditCardNumberFilter$creditCardOffsetTranslator$1());
            default:
                return VisualTransformation.Companion.None$lambda$0(it);
        }
    }
}
