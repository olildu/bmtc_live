package defpackage;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.UITransformedText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cm implements VisualTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldEventHandler f11343a;

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString text) {
        Intrinsics.i(text, "text");
        final UITransformedText uITransformedTextC = this.f11343a.c(text.getText());
        return new TransformedText(new AnnotatedString(uITransformedTextC.f10113a, null, 2, null), new OffsetMapping() { // from class: app.chalo.compose.components.textfields.ChaloTextFieldKt$visualTransformation$1$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int originalToTransformed(int i) {
                return uITransformedTextC.b.originalToTransformed(i);
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int transformedToOriginal(int i) {
                return uITransformedTextC.b.transformedToOriginal(i);
            }
        });
    }
}
