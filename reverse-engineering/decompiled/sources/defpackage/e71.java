package defpackage;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15526a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ e71(SelectionManager selectionManager, int i) {
        this.f15526a = i;
        this.b = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15526a) {
            case 0:
                return SelectionManager._init_$lambda$2(this.b, ((Boolean) obj).booleanValue(), ((Long) obj2).longValue());
            default:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0(this.b, (TextContextMenuBuilderScope) obj, (Context) obj2);
        }
    }
}
