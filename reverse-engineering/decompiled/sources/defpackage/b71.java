package defpackage;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11173a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ b71(SelectionManager selectionManager, int i) {
        this.f11173a = i;
        this.b = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11173a) {
            case 0:
                return SelectionContainerKt.SelectionContainer$lambda$10$0(this.b, (DisposableEffectScope) obj);
            case 1:
                return SelectionManager._init_$lambda$5(this.b, ((Long) obj).longValue());
            case 2:
                return SelectionManager._init_$lambda$6(this.b, ((Long) obj).longValue());
            case 3:
                return SelectionManager._get_modifier_$lambda$1(this.b, (LayoutCoordinates) obj);
            case 4:
                return SelectionManager._get_modifier_$lambda$2(this.b, (FocusState) obj);
            case 5:
                return SelectionManager._get_modifier_$lambda$3(this.b, ((Boolean) obj).booleanValue());
            case 6:
                return SelectionManager._get_contextMenuAreaModifier_$lambda$0(this.b, (LayoutCoordinates) obj);
            case 7:
                return SelectionManager.onSelectionChange$lambda$0(this.b, (Selection) obj);
            default:
                return SelectionManager._init_$lambda$0(this.b, ((Long) obj).longValue());
        }
    }
}
