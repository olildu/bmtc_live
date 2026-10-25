package defpackage;

import androidx.compose.foundation.text.modifiers.SelectionController;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c71 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11261a;
    public final /* synthetic */ SelectionController b;

    public /* synthetic */ c71(SelectionController selectionController, int i) {
        this.f11261a = i;
        this.b = selectionController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11261a) {
            case 0:
                return SelectionController.onRemembered$lambda$0(this.b);
            case 1:
                return SelectionController.onRemembered$lambda$1(this.b);
            default:
                return SelectionController.modifier$lambda$0(this.b);
        }
    }
}
