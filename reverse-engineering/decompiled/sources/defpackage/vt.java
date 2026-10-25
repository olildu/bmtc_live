package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vt implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19866a;
    public final /* synthetic */ TextFieldSelectionManager b;

    public /* synthetic */ vt(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.f19866a = i;
        this.b = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19866a) {
            case 0:
                return CoreTextFieldKt.CoreTextField$lambda$21$0(this.b, (DisposableEffectScope) obj);
            default:
                return TextFieldSelectionManager._get_contextMenuAreaModifier_$lambda$0(this.b, (LayoutCoordinates) obj);
        }
    }
}
