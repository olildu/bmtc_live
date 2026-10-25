package defpackage;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15557a;
    public final /* synthetic */ TextFieldSelectionManager b;

    public /* synthetic */ ei1(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.f15557a = i;
        this.b = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15557a) {
            case 0:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$0(this.b);
            case 1:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$1(this.b);
            case 2:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$2(this.b);
            case 3:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$3(this.b);
            case 4:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$4(this.b);
            case 5:
                return Boolean.valueOf(TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0(this.b));
            case 6:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1(this.b);
            default:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2(this.b);
        }
    }
}
