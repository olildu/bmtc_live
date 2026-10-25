package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y61 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20081a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ y61(SelectionManager selectionManager, int i) {
        this.f20081a = i;
        this.b = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20081a) {
            case 0:
                return SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$1(this.b);
            case 1:
                return SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$0(this.b);
            case 2:
                return SelectionManager._get_modifier_$lambda$0(this.b);
            case 3:
                return SelectionManager._init_$lambda$4(this.b);
            case 4:
                return this.b.getContentRect();
            case 5:
                return SelectionManagerKt.contextMenuBuilder$lambda$0$0(this.b);
            case 6:
                return SelectionManagerKt.contextMenuBuilder$lambda$0$1(this.b);
            case 7:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0(this.b);
            case 8:
                return Boolean.valueOf(SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1(this.b));
            default:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2(this.b);
        }
    }
}
