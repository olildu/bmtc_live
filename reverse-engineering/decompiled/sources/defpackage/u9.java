package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19724a;
    public final /* synthetic */ TextFieldSelectionState b;

    public /* synthetic */ u9(TextFieldSelectionState textFieldSelectionState, int i) {
        this.f19724a = i;
        this.b = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19724a) {
            case 0:
                return BasicTextFieldKt.TextFieldCursorHandle$lambda$0$0(this.b);
            case 1:
                return BasicTextFieldKt.TextFieldSelectionHandles$lambda$0$0(this.b);
            case 2:
                return BasicTextFieldKt.TextFieldSelectionHandles$lambda$4$0(this.b);
            case 3:
                return this.b.getDerivedVisibleContentBounds$foundation();
            case 4:
                return TextFieldSelectionState.derivedVisibleContentBounds_delegate$lambda$0(this.b);
            case 5:
                return TextFieldSelectionState.observeTextChanges$lambda$0(this.b);
            case 6:
                return Boolean.valueOf(TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0(this.b));
            case 7:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1(this.b);
            default:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2(this.b);
        }
    }
}
